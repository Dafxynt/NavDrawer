package com.example.navdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.navdrawer.items;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawer.Adapter;
import com.example.navdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MakananFavoritFragment extends Fragment {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_favorit, container, false);

        recyclerView = view.findViewById(R.id.RVmakananFavorit);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();

        // Tambahkan data makanan favorit
        itemsList.add(new items("Lentog Tanjung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsPKUr344YP2uI7IUi-TYX_RZv9PxCekgBNr1uZjwKxw&s", "Lentog adalah makanan khas Kudus yang merupakan campuran lontong sayur lodeh. Selain itu sebagai pelengkap biasanya terdapat sate telur puyuh dengan rasa khas kudus. Lentog banyak dijual oleh pedagang kaki lima di Kudus. Biasanya Lentog dijual pada pagi hari sampai siang"));
        itemsList.add(new items("Nasi Tahu", "https://i0.wp.com/i.gojekapi.com/darkroom/gofood-indonesia/v2/images/uploads/3e373af3-754b-4e2f-af4d-90a2df277744_Go-Biz_20210801_122129.jpeg", "Tahu telor yang memakai bahan dasar kacang, kecap dan gula merah ini hampir mirip dengan pecel atau bumbu tahu petis. Namun yang membedakan tahu telor adalah sajian kuliner ini lebih lezat ditambah dengan sayur lengkap. Anda bisa memilih nasi atau lontong untuk menemani tahu telor dan yang pasti dapat membuat perut kenyang"));
        itemsList.add(new items("Opor Ayam Sunggingan", "https://i0.wp.com/jowonews.com/wp-content/uploads/2023/06/Nasi-Opor-Sunggingan-Kudus.jpg?fit=780%2C464&ssl=1", "Kuliner istimewa ini sudah bertahan selama 68 tahun lamanya. Rasa yang lezat dan racikan bumbu yang meresap pada ayamnya membuat opor ayam bakar Sunggingan menjadi salah satu opor putih yang banyak disukai orang Kudus dan pecinta kuliner dari berbagai kota di Indonesia"));
        itemsList.add(new items("Nasi Goreng", "https://cdn0-production-images-kly.akamaized.net/z6HymlQZaLlLWprqVaRz-lWXeUU=/0x422:5760x3668/1200x675/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/4018264/original/019930600_1652166761-american-shrimp-fried-rice-served-with-chili-fish-sauce-thai-food__1_.jpg", "Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin, atau mentega. Biasanya ditambah dengan kecap manis, bawang merah, bawang putih, asam jawa, lada dan bahan lainnya; seperti telur, daging ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama dengan ikan asin yang juga populer di seluruh Indonesia."));
        itemsList.add(new items("Sirup Agung", "https://id-test-11.slatic.net/p/a2cb5462ca4a8f3e15b317978aa0e8c0.jpg", "Sirup Agung adalah sirup yang populer di Kudus, Indonesia. Sirup ini dikenal sangat enak, kental, dan tidak menyebabkan batuk karena hanya menggunakan gula asli tanpa sakarin atau pemanis buatan. Sirup ini juga sudah masuk ke berbagai swalayan di Kudus1. Produk ini tersedia dalam berbagai rasa seperti frambozen, nanas, kopi mocca, dan jeruk keprok"));
        itemsList.add(new items("Kopi Jetak", "https://images.tokopedia.net/img/cache/500-square/product-1/2020/6/30/8948733/8948733_c32c3e70-c183-4e31-aa31-a88f222a7de8_1728_1728.jpg", "Kopi Jetak adalah kopi tradisional khas Kudus, Jawa Tengah1. Nama Kopi Jetak diambil dari daerah tempat kopi ditemukan, yaitu Dukuh Jetak, Desa Kedungdowo, Kecamatan Kaliwungu, Kabupaten Kudus. Kopi ini telah diproduksi sejak tahun 19772 dan memiliki cita rasa yang sangat khas. Biji kopi Jetak digoreng hingga berwarna hitam dan serbuk kopinya selalu segar karena digiling setiap pagi"));

        adapter = new Adapter(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
