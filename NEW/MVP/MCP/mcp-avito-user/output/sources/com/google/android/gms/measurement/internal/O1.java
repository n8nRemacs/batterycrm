package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class O1 extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P1 f354827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(P1 p12, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f354827b = p12;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e12) {
            throw e12;
        } catch (SQLiteException unused) {
            P1 p12 = this.f354827b;
            p12.zzj().f354889f.b("Opening the local database failed, dropping and recreating it");
            if (!p12.f355183a.f354709a.getDatabasePath("google_app_measurement_local.db").delete()) {
                p12.zzj().f354889f.c("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e13) {
                p12.zzj().f354889f.c("Failed to open local database. Events will bypass local storage", e13);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C36970t.b(this.f354827b.zzj(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        C36970t.c(this.f354827b.zzj(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i12, int i13) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i12, int i13) {
    }
}
