package com.avito.android.db;

import android.app.Application;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.compose.foundation.H;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import qu.C47446b;
import ru.C47726a;
import su.C48415a;
import su.C48416b;
import uu.C49113a;
import wu.C49683a;

/* compiled from: DbHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/db/f;", "Landroid/database/sqlite/SQLiteOpenHelper;", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class f extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f132681b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f132682c;

    public f(@Y61.k Application application, @Y61.k C c12) {
        super(application, "avito_data.db", (SQLiteDatabase.CursorFactory) null, 47);
        this.f132681b = application;
        this.f132682c = c12;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        this.f132682c.o().getClass();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @Y61.k
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (e e12) {
            V2.f318762a.a("DEFAULT_TAG", "Downgrade is not support", e12);
            g.a(this.f132681b.getDatabasePath(getDatabaseName()));
            return super.getReadableDatabase();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @Y61.k
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (e e12) {
            V2.f318762a.a("DEFAULT_TAG", "Downgrade is not support", e12);
            g.a(this.f132681b.getDatabasePath(getDatabaseName()));
            return super.getWritableDatabase();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(@Y61.k SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@Y61.k SQLiteDatabase sQLiteDatabase) throws SQLException {
        V2.f318762a.g("DbHelper", "Creating database");
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE my_adverts (_id INTEGER PRIMARY KEY AUTOINCREMENT,timestamp INTEGER,server_id TEXT,category_id TEXT,title TEXT,price TEXT,location_name TEXT,metro_name TEXT,image_url TEXT,status TEXT,time INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE saved_searches (_id INTEGER PRIMARY KEY AUTOINCREMENT,timestamp INTEGER,title TEXT,description TEXT,search_params TEXT,human_readable_params TEXT,latest_advert_value INTEGER,has_unread_changes INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE search_subscriptions (_id INTEGER PRIMARY KEY AUTOINCREMENT,subscription_id TEXT,description TEXT,title TEXT,unread_count INTEGER,last_update INTEGER,ssid TEXT)");
        new C47446b();
        sQLiteDatabase.execSQL("\n                CREATE TABLE IF NOT EXISTS favorites_sync(\n                    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                    entity_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,               \n                    marked_for_remove INTEGER NOT NULL DEFAULT 0,\n                    x_hash TEXT,\n                    analytics_source TEXT\n                );\n               ");
        new tu.b();
        sQLiteDatabase.execSQL(tu.b.a());
        new C48416b();
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS send_message_requests (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, channel_id TEXT NOT NULL, message_type TEXT NOT NULL, local_id TEXT UNIQUE NOT NULL, remote_id TEXT, created INTEGER NOT NULL, text TEXT, error_code INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL(new C48415a().a());
        sQLiteDatabase.execSQL(new C49113a().f440317a);
        new C49683a();
        sQLiteDatabase.execSQL("\n            CREATE TABLE IF NOT EXISTS viewed_adverts(\n                _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                advert_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,\n                added_time INTEGER NOT NULL\n            );\n        ");
        new C47726a();
        sQLiteDatabase.execSQL("\n            CREATE TABLE IF NOT EXISTS login_suggests(\n                _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                user_hash_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,\n                login TEXT,\n                social TEXT,\n                social_id TEXT\n            );\n        ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(@Y61.k SQLiteDatabase sQLiteDatabase, int i12, int i13) {
        throw new e(H.j(i12, i13, "Database downgrade is not supported. Requested downgrade from ", " to "));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@Y61.k SQLiteDatabase sQLiteDatabase, int i12, int i13) {
        V2.f318762a.g("DbHelper", H.j(i12, i13, "Upgrading from version ", " to "));
        a(sQLiteDatabase);
        i iVar = new i(this.f132681b, sQLiteDatabase);
        while (i12 < i13) {
            Y41.a aVar = (Y41.a) iVar.f132685c.get(Integer.valueOf(i12));
            if (aVar != null) {
                aVar.invoke();
            }
            i12++;
        }
    }

    public f(Context context, C c12, String str, SQLiteDatabase.CursorFactory cursorFactory, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : cursorFactory, (i13 & 16) != 0 ? 47 : i12);
        this.f132681b = context;
        this.f132682c = c12;
    }
}
