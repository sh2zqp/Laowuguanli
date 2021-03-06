package zjut.com.laowuguanli.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SaveUserInfoHelperL extends SQLiteOpenHelper {
    private static final String CREATE_DB = "create table userinfo(" +
            "id integer primary key autoincrement," +
            "name text," +
            "pic text," +
            "date text," +
            "isOut integer)";

    public SaveUserInfoHelperL(Context context) {
        super(context, "Userl.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}