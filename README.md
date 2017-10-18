ButterKnife is a great annotation processing library to bind views and methods for Android

This sample demonstrates use of Butterknife

1.For direct layout

2.For Included Layout(That are reused multiple times in same layout)

The direct way of implementing butterknife is given in MainActivity class.

Included layout cannot be directly bounded using their ids to the methods if same included layout is used more than once in the layout.
So for that purpose we have to create a static class which will include all the view components (as specified in step 3 in ButterknifeWithIncludesActivity)



