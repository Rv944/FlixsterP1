/**# Android Project 3 - *Flixster+P1*

Submitted by: **Rothmel Fortune II**

**Flixster+P1** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: **34** hours spent in total

## Required Features

The following **required** functionality is completed:

- [/] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [/] **Parse through JSON data and implement a RecyclerView to display all movies**
- [/] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [ ] Improve and customize the user interface through styling and coloring
- [ ] Implement orientation responsivity
- App should neatly arrange data in both landscape and portrait mode
- [ ] Implement Glide to display placeholder graphics during loading
- Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<!-- https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExemMwaHo5anlnNGw5Zzl1cmJ2b2VwNmp1cDdrZ2p4ampjdjNuY3R2aCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/4hkEhcHxtoGFIbu0ND/giphy.gif-->
GIF created with ...
<!-- Recommended tools:
[Kap](https://getkap.co/) for macOS
[ScreenToGif](https://www.screentogif.com/) for Windows
[peek](https://github.com/phw/peek) for Linux. -->

## Notes

Describe any challenges encountered while building the app.

## License

Copyright [2024] [name of copyright owner]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
**/


package com.example.flixsterp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flixsterp1.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, openingMoviesFragments(), null).commit()

    }
}
