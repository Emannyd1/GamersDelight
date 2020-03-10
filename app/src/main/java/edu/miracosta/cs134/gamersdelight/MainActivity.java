package edu.miracosta.cs134.gamersdelight;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import edu.miracosta.cs134.gamersdelight.model.Game;

public class MainActivity extends AppCompatActivity {


    private List<Game> gamesList;
    private GameListAdapter gamesListAdapter;
    private ListView gamesListView;

    private EditText nameEditText;
    private EditText 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Connect the ListView with the layout
        // TODO:  Populate all games list using the JSONLoader
        // TODO:  Create a new ListAdapter connected to the correct layout file and list
        // TODO:  Connect the ListView with the ListAdapter
    }

    public void viewGameDetails(View view) {

        // TODO: Use an Intent to start the GameDetailsActivity with the data it needs to correctly inflate its views.
    }

    public void addGame(View view)
    {
        // TODO:  Read information from EditTexts and RatingBar,
        // TODO:  Create a new Game object then add it to the list
        // TODO:  Make sure the list adapter is notified
        // TODO:  Clear all entries the user made (edit text and rating bar)
    }



}
