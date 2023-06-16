package com.android.diaryapp;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class myDatabase extends SQLiteOpenHelper{
    private Context context;
    private static final String DATABASE_NAME="Student_data.db";
    private static final int DATABASE_VERSION=1;

    private static final String TABLE_NAME="Students";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_NAME="book_name";
    private static final String COLUMN_AUTHOR="book_author";
    private static final String COLUMN_PAGES="book_pages";
   // private static final String factory=null;
    public myDatabase(@Nullable Context context)

    {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String Query="CREATE TABLE " + TABLE_NAME + " (" +COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COLUMN_NAME + "TEXT, " + COLUMN_AUTHOR + "TEXT, " + COLUMN_PAGES + "INTEGER);";
    db.execSQL(Query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
