/*
*
* This class implements a library of songs
*
* @author CS111 - Rutgers University
*
*/
public class SongApp1 {

  private Song[] items;      // keep Songs in an unsorted array
  private int numberOfItems; // number of Songs in the array

  /*
  * Default constructor creates array with capacity for 5 Songs
  */
  SongApp1 () {
Song[] items=new Song[5];
numberOfItems=0;

      // ADD YOUR CODE HERE
  }

  /*
  * One argument constructor creates array with user defines capacity
  *
  * @param capacity defines the capacity of the Song library
  */
  SongApp1 (int capacity) {
    Song[] items= new Song[capacity];
    numberOfItems=0; // ADD YOUR CODE HERE
  }

  /*
  * Add a Song into the library (unsorted array)
  *
  * If the library is full (there is not enough space to add another Song)
  *   - create a new array with double the size of the current array.
  *   - copy all current Songs into new array
  *   - add new Song
  *
  * @param m The Song to be added to the libary
  */
  public void addSong (Song m) {
      // ADD YOUR CODE HERE
  }

  /*
  * Removes a Song from the library. Returns true if Song is removed, false
  * otherwise.
  * The array should not become sparse after a remove, that is, all Songs
  * should be in consecutive indexes in the array.
  *
  * @param m The Song to be removed
  *
  */
  public boolean removeSong (Song m) {
      // ADD YOUR CODE HERE
  }

  /*
  * Returns the library of songs
  *
  * @return The array of Songs
  */
  public Song[] getSongs () {
    return items;  // ADD YOUR CODE HERE
  }

  /*
  * Returns the current number of Songs in the library
  *
  * @return The number of items in the array
  */
  public int getNumberOfItems () {
      return numberOfItems;// ADD YOUR CODE HERE
  }

  /*
  * Update the rating of Song @m to @rating
  *
  * @param @m The Song to have its ratings updated
  * @param @rating The new rating of @m
  * @return tue if update is successfull, false otherwise
  *
  */
  public boolean updateRating (Song m, int rating) {
      m.rating=rating;// ADD YOUR CODE HERE
  }

  /*
  * Prints all Songs
  */
  public void print () {
      // ADD YOUR CODE HERE
  }

  /*
  * Return all the Songs by @songwriter. The array size should be the
  * number of Songs by @songwriter.
  *
  * @param songwriter The songwriter's name
  * @param An array of all the Songs by @songwriter
  *
  */
  public Song[] getSongsBySongwriter (String songwriter) {
      for(int i=0; i<items.length; i++)
      if (items.songwriter[i]==songwriter)
      return items;// ADD YOUR CODE HERE
  }

  /*
  * Return all the Songs released in @year. The array size should be the
  * number of Songs made in @year.
  *
  * @param year The year the Songs were made
  * @return An array of all the Songs made in @year
  *
  */
  public Song[] getSongsByYear (int year) {
    for(int i=0; i<items.length; i++)
    if (items.year[i]==year)
    return items[i];// ADD YOUR CODE HERE
  }

  /*
  * Return all the Songs with ratings greater then @rating
  *
  * @param rating
  * @return An array of all Songs with rating greater than @rating
  *
  */
  public Song[] getSongsWithRatingsGreaterThan (int rating) {
      // ADD YOUR CODE HERE
  }

  /*
  * Search for Song name @name using binary search algorithm.
  * Assumes items is sorted
  */
  public Song searchSongByName (String name) {
      // ADD YOUR CODE HERE
  }

 /*
  * Sorts Songs by year using insertion sort
  */
  public void sortByYear () {
      // ADD YOUR CODE HERE
  }

 /*
  * Sorts array of Songs by name using selection sort
  */
  public void sortByName () {
      // ADD YOUR CODE HERE
  }

 /*
  * Search for Song name using recursive linear search
  * @param name The name of the song to search
  * @param Songs The array containing all songs
  * @param l The left index
  * @param r The right index
  * @return The song with name @name or null if song is not found
  */
  public static Song searchSongByName (String name, Song[] Songs, int l, int r) {
      // ADD YOUR CODE HERE
  }
}
