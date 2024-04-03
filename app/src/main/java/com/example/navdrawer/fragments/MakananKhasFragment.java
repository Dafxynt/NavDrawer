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

public class MakananKhasFragment extends Fragment {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.RVmakananKuliner);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();


        itemsList.add(new items("Lentog Tanjung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsPKUr344YP2uI7IUi-TYX_RZv9PxCekgBNr1uZjwKxw&s", "Lentog adalah makanan khas Kudus yang merupakan campuran lontong sayur lodeh. Selain itu sebagai pelengkap biasanya terdapat sate telur puyuh dengan rasa khas kudus. Lentog banyak dijual oleh pedagang kaki lima di Kudus. Biasanya Lentog dijual pada pagi hari sampai siang"));
        itemsList.add(new items("Soto Kerbau", "https://cdn.idntimes.com/content-images/community/2019/12/soto-kerbau-di-kudus-sejarah-toleransi-yang-tertuang-dalam-makanan-1-3d0ee408dc38e950476bc7e2f5eb350a.jpg", "Soto kerbau sebenarnya bagian dari soto kudus yang punya varian kerbau dan ayam, rasa kuah dan jenis sayur sama. Puji menceritakan, menurut kakeknya, soto kudus dulu hanya soto ayam. Lalu lahir soto kerbau setelah Sunan Kudus mengimbau umat Islam tak menyembelih sapi untuk menghormati umat Hindu yang tinggal di Kudus"));
        itemsList.add(new items("Nasi Pindang", "https://img-global.cpcdn.com/recipes/6a5d4ca91fd6adc6/680x482cq70/nasi-pindang-khas-kudus-foto-resep-utama.jpg", "Sekilas hidangan berkuah ini mirip dengan rawon. Kuahnya kecoklatan dengan cita rasa sedikit manis. Nama pindang bukan berarti ikan pindang seperti umumnya, melainkan daging kerbau.Nasi Pindang Kudus disajikan di atas piring beralaskan daun pisang. Untuk menemani kelazatannya, pembeli juga bisa mencoba perkedel kentang, telur puyuh, otak goreng, paru goreng, tempe goreng, tahu goreng, hati ampela, usus goreng, dll"));
        itemsList.add(new items("Jenang", "https://cdn.linkumkm.id/library/1/2/4/0/2/12402_840x576.jpg", "Jenang Kudus adalah makanan sejenis dodol Garut yang berasal dari Kudus, Jawa Tengah. Jenang Kudus merupakan oleh-oleh khas dari Kudus. Jenang ini biasanya dijual dalam potongan-potongan kecil, biasanya dibungkus dengan plastik, dan dimasukkan ke dalam kemasan dus atau mika plastik"));
        itemsList.add(new items("Opor Ayam Sunggingan", "https://i0.wp.com/jowonews.com/wp-content/uploads/2023/06/Nasi-Opor-Sunggingan-Kudus.jpg?fit=780%2C464&ssl=1", "Kuliner istimewa ini sudah bertahan selama 68 tahun lamanya. Rasa yang lezat dan racikan bumbu yang meresap pada ayamnya membuat opor ayam bakar Sunggingan menjadi salah satu opor putih yang banyak disukai orang Kudus dan pecinta kuliner dari berbagai kota di Indonesia"));
        itemsList.add(new items("Nasi Tahu", "https://i0.wp.com/i.gojekapi.com/darkroom/gofood-indonesia/v2/images/uploads/3e373af3-754b-4e2f-af4d-90a2df277744_Go-Biz_20210801_122129.jpeg", "Tahu telor yang memakai bahan dasar kacang, kecap dan gula merah ini hampir mirip dengan pecel atau bumbu tahu petis. Namun yang membedakan tahu telor adalah sajian kuliner ini lebih lezat ditambah dengan sayur lengkap. Anda bisa memilih nasi atau lontong untuk menemani tahu telor dan yang pasti dapat membuat perut kenyang"));


        adapter = new Adapter(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
