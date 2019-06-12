package com.dicoding.linkmyhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MyAdapter myAdapter;
    private ArrayList<MyData> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMyData();

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        myAdapter = new MyAdapter(dataList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    private void setMyData() {
        dataList = new ArrayList<>();
        dataList.add(new MyData("The Legend Of Zelda", "Famicom Disk System/NES", "1987","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/0/0c/TLoZ_NES_NA_Box.png/210px-TLoZ_NES_NA_Box.png?version=a63d9bd23e27f9d960e1c395931ae07e"));
        dataList.add(new MyData("The Adventure of Link", "Famicom Disk System/NES","1988","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/3/33/TAoL_NA_NES_Box_Artwork.png/214px-TAoL_NA_NES_Box_Artwork.png?version=b3848bd63f62539469f17d615d5d53e5"));
        dataList.add(new MyData("A Link to the Past","SNES","1992","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/f/f9/Zelda_SNES.jpg/300px-Zelda_SNES.jpg?version=4ef65c426f998e3a585d96cdaf770ca7"));
        dataList.add(new MyData("Link's Awakening","Game Boy","1993","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/9/9a/LADX_NA_Box_Art.png/170px-LADX_NA_Box_Art.png?version=8805908ce6b8995882180b1127b4b9e0"));
        dataList.add(new MyData("Ocarina of Time","Nintendo 64","1998","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/4/48/OoT_NA_Box.jpg/300px-OoT_NA_Box.jpg?version=b1b4748638144d0d38e7327809fdb0df"));
        dataList.add(new MyData("Majora's Mask","Nintendo 64","2000","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/a/a8/Majora_box.jpg/300px-Majora_box.jpg?version=4020d8eace9d03d431b443562f677e51"));
        dataList.add(new MyData("Oracle of Seasons","Game Boy Color","2001","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/a/a7/Oracleofseasons.jpg/300px-Oracleofseasons.jpg?version=d8de0ebaf7a1264ce6760ab55e16676b"));
        dataList.add(new MyData("Oracles of Ages","Game Boy Color","2001","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/4/45/Oracleofages.jpg/300px-Oracleofages.jpg?version=e2c74a2ddf46357ba9ce2d8c46f77ba5"));
        dataList.add(new MyData("Four Swords","Game Boy Advance","2002","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/6/6c/Four_Swords_Box.png/300px-Four_Swords_Box.png?version=19a8086a8073b4f30601342b77ea91e9"));
        dataList.add(new MyData("The Wind Waker","Nintendo GameCube","2003","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/4/45/TWW_US_Box.jpg/211px-TWW_US_Box.jpg?version=40e953b511d2941ab179ddad5705bc53"));
        dataList.add(new MyData("Four Swords Adventure","Nintendo GameCube","2004","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/3/39/FourSwordsA_Box.jpg/212px-FourSwordsA_Box.jpg?version=2df4d9fec15e5df5019ebec01d1ae22e"));
        dataList.add(new MyData("The Minish Cap","Game Boy Advance","2005","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/9/93/ZeldaMinishCap_BoxArt.jpg/300px-ZeldaMinishCap_BoxArt.jpg?version=2e01e4eed5460d909532632b716bf1e4"));
        dataList.add(new MyData("Twilight Princess","Nintendo GameCube","2006","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/3/38/Twilight_Princess_GCN_US_boxart.jpg/214px-Twilight_Princess_GCN_US_boxart.jpg?version=5107ebc5b5f4918ea6d26e7c4f4d130a"));
        dataList.add(new MyData("Phantom Hourglass","Nintendo DS","2007","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/b/b4/Phantomhour.jpg/300px-Phantomhour.jpg?version=2d0c22a67aff931641b2a4c6c980cabf"));
        dataList.add(new MyData("Spirit Tracks","Nintendo DS","2009","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/f/f2/Spirit_Tracks_Cover.jpg/300px-Spirit_Tracks_Cover.jpg?version=ee1f94c3123bf7131efd072c2c0108d7"));
        dataList.add(new MyData("Skyward Sword","WII","2011","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/9/9d/Skyward_Sword_US_Box_Art.jpg/213px-Skyward_Sword_US_Box_Art.jpg?version=3e545861a04b1f068113b4437f9603ef"));
        dataList.add(new MyData("A Link Between Worlds","Nintendo 3DS","2013","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/4/46/A_Link_Between_Worlds_cover.jpg/300px-A_Link_Between_Worlds_cover.jpg?version=4e01ad2275b67dfc8e4ffb4cabf9bc49"));
        dataList.add(new MyData("Tri Force Heroes","Nintendo 3DS","2015","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/9/98/TFH_NA_Box_Art.png/300px-TFH_NA_Box_Art.png?version=d2b5c60981dfaa4e579501acb6adfbf7"));
        dataList.add(new MyData("Breath of the Wild","Nintendo Switch","2017","https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/c/c7/BotW_NA_Switch_Box_Art.png/185px-BotW_NA_Switch_Box_Art.png?version=1ec725386d7eddfd8af1a399df4291e6"));
    }
}
