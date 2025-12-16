package Fc1;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: Fc1.u7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13747u7 extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f5852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f5853c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f5854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C13747u7(@Y61.k Context context) {
        super(context, "feedbackCache", (SQLiteDatabase.CursorFactory) null, 2);
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f5852b = context;
        this.f5853c = "CREATE TABLE IF NOT EXISTS REQUEST_CACHE (REQUEST_ID INTEGER PRIMARY KEY AUTOINCREMENT, REQUEST_TYPE INTEGER NOT NULL, REQUEST_PAYLOAD TEXT);";
        this.f5854d = "CREATE TABLE IF NOT EXISTS CAMPAIGNS_LIST (CAMPAIGN_ID INTEGER PRIMARY KEY, CAMPAIGN_PRIORITY INTEGER NOT NULL, CAMPAIGN_EVENT_NAME TEXT NOT NULL, CAMPAIGN_DATA TEXT NOT NULL);";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@Y61.k SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL(this.f5853c);
            sQLiteDatabase.execSQL(this.f5854d);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@Y61.k SQLiteDatabase sQLiteDatabase, int i12, int i13) throws SQLException {
        try {
            sQLiteDatabase.execSQL(this.f5854d);
        } catch (Exception unused) {
        }
    }
}
