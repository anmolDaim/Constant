package com.example.minorproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.minorproject.Adapter.ListViewAdapter;
import com.example.minorproject.Adapter.PupolarAdapter;
import com.example.minorproject.Domain.PopularDomain;
import com.example.minorproject.Domain.ProductList;
import com.example.minorproject.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;
    ListView list;
    ListViewAdapter adapter;
    SearchView editsearch;
    String[] animalNameList;
    ArrayList<ProductList> arraylist = new ArrayList<ProductList>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Generate sample data
        animalNameList = new String[]{"Lion", "Tiger", "Dog",
                "Cat", "Tortoise", "Rat", "Elephant", "Fox",
                "Cow","Donkey","Monkey"};

//        // Locate the ListView in listview_main.xml
//        list = (ListView) findViewById(R.id.listview);
//
//        for (int i = 0; i < animalNameList.length; i++) {
//            ProductList animalNames = new ProductList(animalNameList[i]);
//            // Binds all strings into an array
//            arraylist.add(animalNames);
//        }

//        // Pass results to ListViewAdapter Class
//        adapter = new ListViewAdapter(this, arraylist);
//
//        // Binds the Adapter to the ListView
//        list.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);

        initRecyclerView();
        bottomNAvigation();
        initRecyclerView2();
        initRecyclerView3();
        initRecyclerView4();
    }

    private void initRecyclerView4() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Novage","","beauty1",15,4,200));
        items.add(new PopularDomain("Mary Kay","","beauty2",10,4.5,450));

        items.add(new PopularDomain("miss Manga","","beauty3",15,4.3,300));

        items.add(new PopularDomain("Loreal 10","","beauty4",18,4.3,500));


        recyclerViewPupolar =findViewById(R.id.view4);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar =new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }

    private void initRecyclerView3() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("I phone 8","","digital1",15,4,200));
        items.add(new PopularDomain("I phone X","","digital2",10,4.5,450));

        items.add(new PopularDomain("I phone 8","","digital3",15,4.3,300));

        items.add(new PopularDomain("Sony Tablet","","digital4",18,4.3,500));


        recyclerViewPupolar =findViewById(R.id.view3);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar =new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }

    private void initRecyclerView2() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Cotton Blayser","","blayser4",15,4,100));

        items.add(new PopularDomain("Black Coat","","blayser1",10,4.5,150));

        items.add(new PopularDomain("balck Blayser set","","blayser2",15,4.3,90));

        items.add(new PopularDomain("Blayser Set","","blayser3",18,4.3,200));


        recyclerViewPupolar =findViewById(R.id.view2);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar =new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }

    private void bottomNAvigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartVtn);

        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        cartBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,CartActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("T-Shirt Black","If you’re looking for a standard black T-shirt you can buy in bulk and not worry about, this is it. It’s not as soft or luxurious-looking as the best overall, but it’s a durable shirt that you won’t have to worry about, since it’s made of heavyweight preshrunk cotton. I’ve owned a couple tees from the brand for years, and they hold through workouts and whatever incorrect wash cycle I’ve likely thrown them in. Season Three co-founder Jared Johnson prefers this shirt for precisely that reason. “If you’re afraid to sweat or get a little dirt on your T-shirt, you’re making poor life decisions,” he says. “Buy some Gildan tees, wear them until you’re done with them, and replace them. Life is better.” Jon Caramanica, pop critic (and former men’s Critical Shopper) for the New York Times, also buys Gildan tees. While they’re not “terribly glamorous,” he likes that they’re “cut wide but not in any way boxy and with an unflappable crew neck.”","item_1",15,4,500));

        items.add(new PopularDomain("Smart Watch","Buy the ColorFit Thrive online\n" +
                "From everyday style to daily productivity, stay on top of it all with the new ColorFit Thrive. This smartwatch not only complements your daily fashion, it also helps you take better care of your health and fitness. Check out everything it has in store. \n" +
                "\n" +
                "Why should you choose the ColorFit Thrive?\n" +
                "Featuring a big & bold 1.85” TFT display, the ColorFit Thrive offers visuals that are true to life. No longer do you need to squint at your screen in the bright sunlight; 550 nits brightness makes sure that you experience exceptional outdoor viewing. Whether you are headed to a party or to your workplace, the sleek dial and metallic finish on the smartwatch gives it a truly sophisticated aesthetic. Managing calls is now a lot easier than before. The integration of BT calling makes it so that you can make and manage all your calls directly from your wrist. Let your phone rest in your pocket and get access to your dial pad, call logs and favourite contacts. You can even use the dedicated AI voice assistant to get tasks done with quick voice commands. Additionally, the smartwatch features some in-built games to help you relax and unwind. If health and fitness are a priority, the ColorFit Thrive has a lot to offer. You can track your heart rate, blood oxygen level, sleep and more, with the addition of Noise Health SuiteTM. 100 sports modes let you workout to the routine of your choice. To ensure that your device stays safe when exposed to sweat, splashes and moisture, it even comes with IP67 water resistance. \n" +
                "\n" +
                "Shop online for the ColorFit Thrive in India\n" +
                "So don’t wait any more. Stay trendy and be productive by upgrading to the new ColorFit Thrive.\n" +
                "\n" +
                "Disclaimer","item_2",10,4.5,490));

        items.add(new PopularDomain("I phone 14","1. The display has rounded corners that follow a beautiful curved design, and these corners are within a standard rectangle. When measured as a standard rectangular shape, the screen is 6.06 inches (iPhone 14, iPhone 13), 6.12 inches (iPhone 15, iPhone 15 Pro), 6.68 inches (iPhone 14 Plus) or 6.69 inches (iPhone 15 Plus, iPhone 15 Pro Max) diagonally. Actual viewable area is less.\n" +
                "2. Available space is less and varies due to many factors. A standard configuration uses approximately 12GB to 17GB of space, including iOS 17 with its latest features and Apple apps that can be deleted. Apple apps that can be deleted use about 4.5GB of space, and you can download them back from the App Store. Storage capacity subject to change based on software version, settings, and iPhone model.\n" +
                "3. Roadside Assistance and Emergency SOS via satellite are included for free for two years with the activation of any iPhone 14 model. Connection and response times vary based on location, site conditions, and other factors. See support.apple.com/kb/HT213885(Opens in a new window) for more information.\n" +
                "4. iPhone 14, iPhone 14 Pro, iPhone 15, and iPhone 15 Pro can detect a severe car crash and call for help. Requires a cellular connection or Wi-Fi calling.\n" +
                "5. Battery life claim refers to larger models. All battery claims depend on network configuration and many other factors; actual results will vary. Battery has limited recharge cycles and may eventually need to be replaced. Battery life and charge cycles vary by use and settings. See apple.com/batteries and apple.com/iphone/battery.html for more information.\n" +
                "6. All battery claims depend on network configuration and many other factors; actual results will vary. Battery has limited recharge cycles and may eventually need to be replaced. Battery life and charge cycles vary by use and settings. See apple.com/batteries and apple.com/iphone/battery.html for more information.\n" +
                "7. USB 3 cable with 10Gb/s speed required.","item_3",15,4.3,800));

        items.add(new PopularDomain("Vision XPro LED TV","1 Upscales to 8K Resolution. Resulting picture may vary based on source content. Utilizes AI-based formulas.\n" +
                "\n" +
                "2 Upscales to 4K Resolution. Resulting picture may vary based on source content. Utilizes AI-based formulas.\n" +
                "\n" +
                "3 QN900C has Object Tracking Sound Pro, QN800C and QN90C have ObjectTracking Sound+ (QN90C size 50”and 43” have ObjectTracking Sound Lite), QN85C has Object Tracking Sound.\n" +
                "\n" +
                "4 Source – Omdia, Jan-2023. Results are not an endorsement of Samsung. Any reliance on these results is at the third-party’s own risk.\n" +
                "\n" +
                "5 Compared to all other measured TV manufacturers in the 2023 American Customer Satisfaction Index (ACSI®) surveys of customers rating their own TV manufacturer's performance. The #1 rating is shared with four other TV manufacturers. ACSI is a registered trademark of the American Customer Satisfaction Index LLC.\n" +
                "\n" +
                "6This is an incentivized Review.","item_4",18,4.3,900));
        items.add(new PopularDomain("Blayser","Buy the ColorFit Thrive online\n" +
                "From everyday style to daily productivity, stay on top of it all with the new ColorFit Thrive. This smartwatch not only complements your daily fashion, it also helps you take better care of your health and fitness. Check out everything it has in store. \n" +
                "\n" +
                "Why should you choose the ColorFit Thrive?\n" +
                "Featuring a big & bold 1.85” TFT display, the ColorFit Thrive offers visuals that are true to life. No longer do you need to squint at your screen in the bright sunlight; 550 nits brightness makes sure that you experience exceptional outdoor viewing. Whether you are headed to a party or to your workplace, the sleek dial and metallic finish on the smartwatch gives it a truly sophisticated aesthetic. Managing calls is now a lot easier than before. The integration of BT calling makes it so that you can make and manage all your calls directly from your wrist. Let your phone rest in your pocket and get access to your dial pad, call logs and favourite contacts. You can even use the dedicated AI voice assistant to get tasks done with quick voice commands. Additionally, the smartwatch features some in-built games to help you relax and unwind. If health and fitness are a priority, the ColorFit Thrive has a lot to offer. You can track your heart rate, blood oxygen level, sleep and more, with the addition of Noise Health SuiteTM. 100 sports modes let you workout to the routine of your choice. To ensure that your device stays safe when exposed to sweat, splashes and moisture, it even comes with IP67 water resistance. \n" +
                "\n" +
                "Shop online for the ColorFit Thrive in India\n" +
                "So don’t wait any more. Stay trendy and be productive by upgrading to the new ColorFit Thrive.\n" +
                "\n" +
                "Disclaimer","blayser1",10,4.5,490));


        recyclerViewPupolar =findViewById(R.id.view1);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar =new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}