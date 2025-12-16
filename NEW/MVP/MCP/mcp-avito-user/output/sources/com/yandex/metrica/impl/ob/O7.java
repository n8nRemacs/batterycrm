package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* loaded from: classes7.dex */
public class O7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f379031a;

    /* renamed from: b, reason: collision with root package name */
    private final C38737cm f379032b;

    /* renamed from: c, reason: collision with root package name */
    protected final X7 f379033c;

    public O7(Context context, @j.N String str, X7 x72) {
        this(context, str, x72, Ul.a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.P
    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f379032b.forceE(th2, "", new Object[0]);
            this.f379032b.forceW("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f379031a);
            ((C39006nh) C39031oh.a()).reportError("db_read_error", th2);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.P
    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f379032b.forceE(th2, "", new Object[0]);
            this.f379032b.forceW("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f379031a);
            ((C39006nh) C39031oh.a()).reportError("db_write_error", th2);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f379033c.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i12, int i13) {
        this.f379033c.a(sQLiteDatabase, i12, i13);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f379033c.b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i12, int i13) {
        this.f379033c.b(sQLiteDatabase, i12, i13);
    }

    @j.k0
    public O7(Context context, @j.N String str, X7 x72, @j.N C38737cm c38737cm) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C38897j8.f380847a);
        this.f379033c = x72;
        this.f379031a = str;
        this.f379032b = c38737cm;
    }
}
