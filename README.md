# News App – Lab 01

## Step 1 – Main Project (Basic Requirement)

The goal was to create an Android application with **only one Activity** that displays a list of news items.

---

### Created Main Activity Layout

File:
app/src/main/res/layout/activity_main.xml

- Used ConstraintLayout.
- Added a header TextView ("News").
- Added a RecyclerView to display the list.

---

### Created Item Layout for Each News

File:
app/src/main/res/layout/item_news.xml

- Added ImageView (news image).
- Added TextView for title.
- Added TextView for description.
- Used ConstraintLayout to structure each item.

---

### Created Data Model

File:
app/src/main/java/com/example/myapplication1/News.kt

- Created a Kotlin data class `News`.
- Added:
  - title: String
  - description: String
  - imageResId: Int

This class represents each news item.

---

### Created RecyclerView Adapter

File:
app/src/main/java/com/example/myapplication1/NewsAdapter.kt

- Extended RecyclerView.Adapter.
- Created ViewHolder class.
- Implemented:
  - onCreateViewHolder
  - onBindViewHolder
  - getItemCount

This binds data from the News class to the item layout.

---

### Connected Everything in MainActivity

File:
app/src/main/java/com/example/myapplication1/MainActivity.kt

- Initialized RecyclerView.
- Set LinearLayoutManager.
- Created a list of News objects.
- Connected adapter to RecyclerView.

At this stage, the basic lab requirement was completed.

---

# Bonus 1 – Divider Between Items

File Modified:
app/src/main/java/com/example/myapplication1/MainActivity.kt

- Added DividerItemDecoration.
- This visually separates news items inside the RecyclerView.

Result:
Each item now has a divider line below it.

---

# Bonus 2 – Different Titles, Descriptions, and Icons

Files Modified:

1. app/src/main/java/com/example/myapplication1/MainActivity.kt
2. app/src/main/res/drawable/

- Added different news titles and descriptions.
- Imported SVG icons and converted them to Vector Drawable.
- Used different icons for each news item.

Result:
Each news item now has unique content and image.

---

# Supplement 1 – Click Interaction (Toast Message)

File Modified:
app/src/main/java/com/example/myapplication1/NewsAdapter.kt

- Added setOnClickListener inside onBindViewHolder.
- Used Toast.makeText() to display the news title when clicked.

Result:
When a user clicks a news item, a small Toast message appears.

---

# Supplement 2 – Expand / Collapse Extra Information

### Step A – Extended Data Model

File Modified:
app/src/main/java/com/example/myapplication1/News.kt

- Added new field:
  - extraInfo: String

This allows storing additional detailed information for each news.

---

### Step B – Updated News List

File Modified:
app/src/main/java/com/example/myapplication1/MainActivity.kt

- Added extraInfo text for each news object.

---

### Step C – Updated Item Layout

File Modified:
app/src/main/res/layout/item_news.xml

- Added a new TextView for extra information.
- Set:
  android:visibility="gone"

This makes it hidden by default.

---

### Step D – Implemented Expand/Collapse Logic

File Modified:
app/src/main/java/com/example/myapplication1/NewsAdapter.kt

- Toggled visibility using:
  - View.VISIBLE
  - View.GONE
- Combined with existing Toast click logic.

Result:
- Clicking a news item:
  - Shows Toast
  - Expands extra information
- Clicking again:
  - Hides extra information

---

# Final Result

The application:

- Uses only one Activity.
- Displays a RecyclerView of news.
- Has divider between items.
- Uses different icons and content.
- Provides click feedback.
- Allows expand/collapse for more information.

The project respects lab requirements while adding interactive and dynamic improvements.
