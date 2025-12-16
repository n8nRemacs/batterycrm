package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzph;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@j.k0
/* renamed from: com.google.android.gms.measurement.internal.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36950q extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36908k f355315b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36950q(C36908k c36908k, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f355315b = c36908k;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final SQLiteDatabase getWritableDatabase() {
        C36908k c36908k = this.f355315b;
        C36949p5 c36949p5 = c36908k.f355232e;
        if (c36949p5.f355314b != 0) {
            c36949p5.f355313a.getClass();
            if (SystemClock.elapsedRealtime() - c36949p5.f355314b < 3600000) {
                throw new SQLiteException("Database open failed");
            }
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            C36949p5 c36949p52 = c36908k.f355232e;
            c36949p52.f355313a.getClass();
            c36949p52.f355314b = SystemClock.elapsedRealtime();
            c36908k.zzj().f354889f.b("Opening the database failed, dropping and recreating it");
            if (!c36908k.f355183a.f354709a.getDatabasePath("google_app_measurement.db").delete()) {
                c36908k.zzj().f354889f.c("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                c36949p52.f355314b = 0L;
                return writableDatabase;
            } catch (SQLiteException e12) {
                c36908k.zzj().f354889f.c("Failed to open freshly created database", e12);
                throw e12;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C36970t.b(this.f355315b.zzj(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @j.l0
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        C36908k c36908k = this.f355315b;
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C36908k.f355221f);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C36908k.f355222g);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C36908k.f355223h);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C36908k.f355225j);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C36908k.f355224i);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C36908k.f355226k);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C36908k.f355227l);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C36908k.f355228m);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C36970t.c(c36908k.zzj(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", zzns.zza() ? C36908k.f355229n : null);
        if (zzph.zza()) {
            C36970t.c(c36908k.zzj(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C36908k.f355230o);
        }
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
