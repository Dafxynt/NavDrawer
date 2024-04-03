package com.example.navdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawer.Adapter;
import com.example.navdrawer.R;
import com.example.navdrawer.items;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhasFragment extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        recyclerView = view.findViewById(R.id.RVminumanKuliner);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();
        itemsList.add(new items("Sirup Agung", "https://id-test-11.slatic.net/p/a2cb5462ca4a8f3e15b317978aa0e8c0.jpg", "Sirup Agung adalah sirup yang populer di Kudus, Indonesia. Sirup ini dikenal sangat enak, kental, dan tidak menyebabkan batuk karena hanya menggunakan gula asli tanpa sakarin atau pemanis buatan. Sirup ini juga sudah masuk ke berbagai swalayan di Kudus1. Produk ini tersedia dalam berbagai rasa seperti frambozen, nanas, kopi mocca, dan jeruk keprok"));
        itemsList.add(new items("Kopi Jetak", "https://images.tokopedia.net/img/cache/500-square/product-1/2020/6/30/8948733/8948733_c32c3e70-c183-4e31-aa31-a88f222a7de8_1728_1728.jpg", "Kopi Jetak adalah kopi tradisional khas Kudus, Jawa Tengah1. Nama Kopi Jetak diambil dari daerah tempat kopi ditemukan, yaitu Dukuh Jetak, Desa Kedungdowo, Kecamatan Kaliwungu, Kabupaten Kudus. Kopi ini telah diproduksi sejak tahun 19772 dan memiliki cita rasa yang sangat khas. Biji kopi Jetak digoreng hingga berwarna hitam dan serbuk kopinya selalu segar karena digiling setiap pagi"));
        itemsList.add(new items("Wedang Coro", "https://asset.kompas.com/crops/JhLf2L7eqpthNclpiEKamkt9Iio=/13x91:1024x765/750x500/data/photo/2023/11/20/655b6f4389554.jpg", "Minuman ini terbuat dari tepung yang dicampur dengan rempah-rempah seperti jahe, kayu manis, serai, santan kelapa, dan gula merah, memberikan rasa sedikit pedas, manis, dan menyegarkan bagi tubuh"));
        itemsList.add(new items("Wedang Pejuh", "https://img-global.cpcdn.com/recipes/f1492221ef99b4a6/680x482cq70/wedang-pejuh-khas-kudus-foto-resep-utama.jpg", "Wedang Pejuh adalah minuman khas Kudus, Jawa Tengah, Indonesia. Nama “Pejuh” sendiri merupakan akronim dari bahan-bahan utamanya, yaitu Pomelo (jeruk pomelo), Emping (jahe), JUkut (sereh), dan susu kental manis putih Minuman ini dikenal dapat menghangatkan tenggorokan dan tubuh, serta mengurangi pegal-pegal. Rasanya yang manis dan lezat membuat Wedang Pejuh banyak diburu oleh wisatawan yang berkunjung"));
        itemsList.add(new items("Wedang Blung", "https://img-z.okeinfo.net/okz/500/library/images/2023/11/08/k5qdkmpaqixhjdoy5gz9_17198.JPG", "Terbuat dari air, santan, gula merah, dan jahe, wedang blung merupakan minuman hangat yang berasal dari Kudus, dan dikenal juga dengan wedang ronde di beberapa wilayah lainnya. Disebut wedang blung, karena minuman ini mampu mengeluarkan suara unik ketika proses pembuatannya menggunakan centong yang terbuat dari bambu.Memiliki rasa yang manis, sehingga cocok disajikan ketika cuaca dingin maupun sekadar menghangat tubuh."));

        adapter = new Adapter(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
