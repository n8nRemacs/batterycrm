package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.collection.C20199a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqa;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36908k extends AbstractC36990v5 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f355221f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f355222g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f355223h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", SelectionType.TYPE_DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f355224i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f355225j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f355226k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f355227l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f355228m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f355229n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f355230o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    public final C36950q f355231d;

    /* renamed from: e, reason: collision with root package name */
    public final C36949p5 f355232e;

    public C36908k(C36997w5 c36997w5) {
        super(c36997w5);
        this.f355232e = new C36949p5(this.f355183a.f354722n);
        this.f355231d = new C36950q(this, this.f355183a.f354709a);
    }

    @j.l0
    public static void y(ContentValues contentValues, Object obj) {
        C36729v.f("value");
        C36729v.j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @j.l0
    public final void A(C37012z c37012z) {
        C36729v.j(c37012z);
        e();
        i();
        ContentValues contentValues = new ContentValues();
        String str = c37012z.f355499a;
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("name", c37012z.f355500b);
        contentValues.put("lifetime_count", Long.valueOf(c37012z.f355501c));
        contentValues.put("current_bundle_count", Long.valueOf(c37012z.f355502d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c37012z.f355504f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c37012z.f355505g));
        contentValues.put("last_bundled_day", c37012z.f355506h);
        contentValues.put("last_sampled_complex_event_id", c37012z.f355507i);
        contentValues.put("last_sampling_rate", c37012z.f355508j);
        contentValues.put("current_session_count", Long.valueOf(c37012z.f355503e));
        Boolean bool = c37012z.f355509k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (l().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzj().f354889f.c("Failed to insert/update event aggregates (got -1). appId", S1.i(str));
            }
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(str), "Error storing event aggregates. appId", e12);
        }
    }

    @j.l0
    public final void B(C36862d2 c36862d2) {
        e();
        i();
        String strN = c36862d2.N();
        C36729v.j(strN);
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, strN);
        contentValues.put("app_instance_id", c36862d2.O());
        contentValues.put("gmp_app_id", c36862d2.f());
        I2 i22 = c36862d2.f355073a;
        A2 a22 = i22.f354718j;
        I2.c(a22);
        a22.e();
        contentValues.put("resettable_device_id_hash", c36862d2.f355077e);
        A2 a23 = i22.f354718j;
        I2.c(a23);
        a23.e();
        contentValues.put("last_bundle_index", Long.valueOf(c36862d2.f355079g));
        A2 a24 = i22.f354718j;
        I2.c(a24);
        a24.e();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c36862d2.f355080h));
        A2 a25 = i22.f354718j;
        I2.c(a25);
        a25.e();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c36862d2.f355081i));
        contentValues.put("app_version", c36862d2.d());
        A2 a26 = i22.f354718j;
        I2.c(a26);
        a26.e();
        contentValues.put("app_store", c36862d2.f355084l);
        A2 a27 = i22.f354718j;
        I2.c(a27);
        a27.e();
        contentValues.put("gmp_version", Long.valueOf(c36862d2.f355085m));
        A2 a28 = i22.f354718j;
        I2.c(a28);
        a28.e();
        contentValues.put("dev_cert_hash", Long.valueOf(c36862d2.f355086n));
        A2 a29 = i22.f354718j;
        I2.c(a29);
        a29.e();
        contentValues.put("measurement_enabled", Boolean.valueOf(c36862d2.f355087o));
        A2 a210 = i22.f354718j;
        I2.c(a210);
        a210.e();
        contentValues.put(SelectionType.TYPE_DAY, Long.valueOf(c36862d2.f355063C));
        A2 a211 = i22.f354718j;
        I2.c(a211);
        a211.e();
        contentValues.put("daily_public_events_count", Long.valueOf(c36862d2.f355064D));
        I2.c(a211);
        a211.e();
        contentValues.put("daily_events_count", Long.valueOf(c36862d2.f355065E));
        I2.c(a211);
        a211.e();
        contentValues.put("daily_conversions_count", Long.valueOf(c36862d2.f355066F));
        A2 a212 = i22.f354718j;
        I2.c(a212);
        a212.e();
        contentValues.put("config_fetched_time", Long.valueOf(c36862d2.f355071K));
        A2 a213 = i22.f354718j;
        I2.c(a213);
        a213.e();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c36862d2.f355072L));
        contentValues.put("app_version_int", Long.valueOf(c36862d2.m()));
        contentValues.put("firebase_instance_id", c36862d2.e());
        I2.c(a211);
        a211.e();
        contentValues.put("daily_error_events_count", Long.valueOf(c36862d2.f355067G));
        I2.c(a211);
        a211.e();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c36862d2.f355068H));
        I2.c(a211);
        a211.e();
        contentValues.put("health_monitor_sample", c36862d2.f355069I);
        A2 a214 = i22.f354718j;
        I2.c(a214);
        a214.e();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c36862d2.h()));
        contentValues.put("admob_app_id", c36862d2.L());
        contentValues.put("dynamite_version", Long.valueOf(c36862d2.D()));
        A2 a215 = i22.f354718j;
        I2.c(a215);
        a215.e();
        contentValues.put("session_stitching_token", c36862d2.f355093u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c36862d2.i()));
        A2 a216 = i22.f354718j;
        I2.c(a216);
        a216.e();
        contentValues.put("target_os_version", Long.valueOf(c36862d2.f355095w));
        A2 a217 = i22.f354718j;
        I2.c(a217);
        a217.e();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c36862d2.f355096x));
        boolean zZza = zzph.zza();
        I2 i23 = this.f355183a;
        if (zZza && i23.f354715g.o(strN, E.f354565C0)) {
            A2 a218 = i22.f354718j;
            I2.c(a218);
            a218.e();
            contentValues.put("ad_services_version", Integer.valueOf(c36862d2.f355097y));
            A2 a219 = i22.f354718j;
            I2.c(a219);
            a219.e();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c36862d2.f355061A));
        }
        if (zznm.zza() && i23.f354715g.o(strN, E.f354591P0)) {
            A2 a220 = i22.f354718j;
            I2.c(a220);
            a220.e();
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c36862d2.f355098z));
        }
        if (zzqa.zza() && i23.f354715g.o(strN, E.f354646t0)) {
            A2 a221 = i22.f354718j;
            I2.c(a221);
            a221.e();
            contentValues.put("sgtm_preview_key", c36862d2.f355062B);
        }
        A2 a222 = i22.f354718j;
        I2.c(a222);
        a222.e();
        ArrayList arrayList = c36862d2.f355092t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzj().f354892i.c("Safelisted events should not be an empty list. appId", strN);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (zznx.zza() && i23.f354715g.o(null, E.f354634n0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zzns.zza() && i23.f354715g.o(strN, E.f354581K0)) {
            contentValues.put("npa_metadata_value", c36862d2.K());
        }
        try {
            SQLiteDatabase sQLiteDatabaseL = l();
            if (sQLiteDatabaseL.update("apps", contentValues, "app_id = ?", new String[]{strN}) == 0 && sQLiteDatabaseL.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().f354889f.c("Failed to insert/update app (got -1). appId", S1.i(strN));
            }
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(strN), "Error storing app. appId", e12);
        }
    }

    @j.l0
    public final void C(String str, zzmh zzmhVar) {
        e();
        i();
        C36729v.f(str);
        this.f355183a.f354722n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jS2 = jCurrentTimeMillis - C36880g.s();
        long j12 = zzmhVar.f355552c;
        if (j12 < jS2 || j12 > C36880g.s() + jCurrentTimeMillis) {
            S1 s1Zzj = zzj();
            s1Zzj.f354892i.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", S1.i(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j12));
        }
        zzj().f354897n.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("trigger_uri", zzmhVar.f355551b);
        contentValues.put(SearchParamsConverterKt.SOURCE, Integer.valueOf(zzmhVar.f355553d));
        contentValues.put("timestamp_millis", Long.valueOf(j12));
        try {
            if (l().insert("trigger_uris", null, contentValues) == -1) {
                zzj().f354889f.c("Failed to insert trigger URI (got -1). appId", S1.i(str));
            }
        } catch (SQLiteException e12) {
            S1 s1Zzj2 = zzj();
            s1Zzj2.f354889f.a(S1.i(str), "Error storing trigger URI. appId", e12);
        }
    }

    public final void D(String str, Long l12, long j12, zzfi.zze zzeVar) {
        e();
        i();
        C36729v.j(zzeVar);
        C36729v.f(str);
        byte[] bArrZzbv = zzeVar.zzbv();
        S1 s1Zzj = zzj();
        s1Zzj.f354897n.a(this.f355183a.f354721m.c(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrZzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("event_id", l12);
        contentValues.put("children_to_process", Long.valueOf(j12));
        contentValues.put("main_event", bArrZzbv);
        try {
            if (l().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzj().f354889f.c("Failed to insert complex main event (got -1). appId", S1.i(str));
            }
        } catch (SQLiteException e12) {
            S1 s1Zzj2 = zzj();
            s1Zzj2.f354889f.a(S1.i(str), "Error storing complex main event. appId", e12);
        }
    }

    @j.l0
    public final void E(String str, String str2) {
        C36729v.f(str);
        C36729v.f(str2);
        e();
        i();
        try {
            l().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e12) {
            S1 s1Zzj = zzj();
            s1Zzj.f354889f.d("Error deleting conditional property", S1.i(str), this.f355183a.f354721m.g(str2), e12);
        }
    }

    @j.k0
    @j.l0
    public final void F(List<Long> list) throws SQLException {
        e();
        i();
        C36729v.j(list);
        if (((ArrayList) list).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (this.f355183a.f354709a.getDatabasePath("google_app_measurement.db").exists()) {
            String strK = AK.c.k("(", TextUtils.join(",", list), ")");
            if (M(AK.c.k("SELECT COUNT(1) FROM queue WHERE rowid IN ", strK, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                zzj().f354892i.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                l().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strK + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e12) {
                zzj().f354889f.c("Error incrementing retry count. error", e12);
            }
        }
    }

    @j.l0
    public final boolean G(zzae zzaeVar) {
        e();
        i();
        String str = zzaeVar.f355521b;
        C36729v.j(str);
        if (T(str, zzaeVar.f355523d.f355555c) == null && M("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("origin", zzaeVar.f355522c);
        contentValues.put("name", zzaeVar.f355523d.f355555c);
        Object objH = zzaeVar.f355523d.h();
        C36729v.j(objH);
        y(contentValues, objH);
        contentValues.put("active", Boolean.valueOf(zzaeVar.f355525f));
        contentValues.put("trigger_event_name", zzaeVar.f355526g);
        contentValues.put("trigger_timeout", Long.valueOf(zzaeVar.f355528i));
        c();
        contentValues.put("timed_out_event", N5.W(zzaeVar.f355527h));
        contentValues.put("creation_timestamp", Long.valueOf(zzaeVar.f355524e));
        c();
        contentValues.put("triggered_event", N5.W(zzaeVar.f355529j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaeVar.f355523d.f355556d));
        contentValues.put("time_to_live", Long.valueOf(zzaeVar.f355530k));
        c();
        contentValues.put("expired_event", N5.W(zzaeVar.f355531l));
        try {
            if (l().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f354889f.c("Failed to insert/update conditional user property (got -1)", S1.i(str));
            return true;
        } catch (SQLiteException e12) {
            S1 s1Zzj = zzj();
            s1Zzj.f354889f.a(S1.i(str), "Error storing conditional user property", e12);
            return true;
        }
    }

    public final boolean H(C36991w c36991w, long j12, boolean z12) {
        e();
        i();
        String str = c36991w.f355412a;
        C36729v.f(str);
        byte[] bArrZzbv = f().q(c36991w).zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("name", c36991w.f355413b);
        contentValues.put("timestamp", Long.valueOf(c36991w.f355415d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j12));
        contentValues.put("data", bArrZzbv);
        contentValues.put("realtime", Integer.valueOf(z12 ? 1 : 0));
        try {
            if (l().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().f354889f.c("Failed to insert raw event (got -1). appId", S1.i(str));
            return false;
        } catch (SQLiteException e12) {
            S1 s1Zzj = zzj();
            s1Zzj.f354889f.a(S1.i(str), "Error storing raw event. appId", e12);
            return false;
        }
    }

    @j.l0
    public final boolean I(K5 k52) {
        e();
        i();
        String str = k52.f354765a;
        String str2 = k52.f354767c;
        K5 k5T = T(str, str2);
        String str3 = k52.f354766b;
        if (k5T == null) {
            if (N5.o0(str2)) {
                if (M("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(this.f355183a.f354715g.j(str, E.f354574H), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && M("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(k52.f354768d));
        y(contentValues, k52.f354769e);
        try {
            if (l().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f354889f.c("Failed to insert/update user property (got -1). appId", S1.i(str));
            return true;
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(str), "Error storing user property. appId", e12);
            return true;
        }
    }

    @j.l0
    public final boolean J(String str, int i12, zzew.zzb zzbVar) {
        i();
        e();
        C36729v.f(str);
        C36729v.j(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().f354892i.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", S1.i(str), Integer.valueOf(i12), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] bArrZzbv = zzbVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i12));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", bArrZzbv);
        try {
            if (l().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f354889f.c("Failed to insert event filter (got -1). appId", S1.i(str));
            return true;
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(str), "Error storing event filter. appId", e12);
            return false;
        }
    }

    @j.l0
    public final boolean K(String str, int i12, zzew.zze zzeVar) {
        i();
        e();
        C36729v.f(str);
        C36729v.j(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().f354892i.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", S1.i(str), Integer.valueOf(i12), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] bArrZzbv = zzeVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i12));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", bArrZzbv);
        try {
            if (l().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f354889f.c("Failed to insert property filter (got -1). appId", S1.i(str));
            return false;
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(str), "Error storing property filter. appId", e12);
            return false;
        }
    }

    @j.k0
    @j.l0
    public final long L(String str) {
        C36729v.f(str);
        C36729v.f("first_open_count");
        e();
        i();
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        long j12 = 0;
        try {
            try {
                long jP2 = p("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jP2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseL.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().f354889f.a(S1.i(str), "Failed to insert column (got -1). appId", "first_open_count");
                        return -1L;
                    }
                    jP2 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jP2));
                    if (sQLiteDatabaseL.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().f354889f.a(S1.i(str), "Failed to update column (got 0). appId", "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return jP2;
                } catch (SQLiteException e12) {
                    long j13 = jP2;
                    e = e12;
                    j12 = j13;
                    zzj().f354889f.d("Error inserting column. appId", S1.i(str), "first_open_count", e);
                    sQLiteDatabaseL.endTransaction();
                    return j12;
                }
            } finally {
                sQLiteDatabaseL.endTransaction();
            }
        } catch (SQLiteException e13) {
            e = e13;
        }
    }

    @j.l0
    public final long M(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = l().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j12 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j12;
            } catch (SQLiteException e12) {
                zzj().f354889f.a(str, "Database error", e12);
                throw e12;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        zzj().f354889f.c("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.K5> N(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.N(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void O(String str, ArrayList arrayList) {
        C36729v.f(str);
        i();
        e();
        SQLiteDatabase sQLiteDatabaseL = l();
        try {
            long jM2 = M("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, this.f355183a.f354715g.j(str, E.f354572G)));
            if (jM2 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                Integer num = (Integer) arrayList.get(i12);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseL.delete("audience_filter_values", AK.c.k("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", AK.c.k("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(str), "Database error querying filters. appId", e12);
        }
    }

    public final long P(String str) {
        C36729v.f(str);
        return p("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0059: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:90), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzae Q(java.lang.String r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.Q(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C37012z R(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.R(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.z");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:233), block:B:15:0x00e8 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034b  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C36862d2 S(java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.S(java.lang.String):com.google.android.gms.measurement.internal.d2");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.K5 T(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C36729v.f(r11)
            com.google.android.gms.common.internal.C36729v.f(r12)
            r10.e()
            r10.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.l()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            r8 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r2 = 1
            java.lang.Object r9 = r10.r(r1, r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            com.google.android.gms.measurement.internal.K5 r2 = new com.google.android.gms.measurement.internal.K5     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r3 == 0) goto L6c
            com.google.android.gms.measurement.internal.S1 r3 = r10.zzj()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            com.google.android.gms.measurement.internal.U1 r3 = r3.f354889f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.S1.i(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3.c(r4, r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6c
        L67:
            r11 = move-exception
            r0 = r1
            goto L91
        L6a:
            r2 = move-exception
            goto L74
        L6c:
            r1.close()
            return r2
        L70:
            r11 = move-exception
            goto L91
        L72:
            r2 = move-exception
            r1 = r0
        L74:
            com.google.android.gms.measurement.internal.S1 r3 = r10.zzj()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.measurement.internal.U1 r3 = r3.f354889f     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.S1.i(r11)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.measurement.internal.I2 r5 = r10.f355183a     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.measurement.internal.R1 r5 = r5.f354721m     // Catch: java.lang.Throwable -> L67
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L67
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L90
            r1.close()
        L90:
            return r0
        L91:
            if (r0 == 0) goto L96
            r0.close()
        L96:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.T(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.K5");
    }

    public final Map<Integer, List<zzew.zze>> U(String str, String str2) {
        i();
        e();
        C36729v.f(str);
        C36729v.f(str2);
        C20199a c20199a = new C20199a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = l().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzew.zze>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzew.zze zzeVar = (zzew.zze) ((zzjf) ((zzew.zze.zza) G5.s(zzew.zze.zzc(), cursorQuery.getBlob(1))).zzah());
                        int i12 = cursorQuery.getInt(0);
                        List arrayList = (List) c20199a.get(Integer.valueOf(i12));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c20199a.put(Integer.valueOf(i12), arrayList);
                        }
                        arrayList.add(zzeVar);
                    } catch (IOException e12) {
                        zzj().f354889f.a(S1.i(str), "Failed to merge filter", e12);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c20199a;
            } catch (SQLiteException e13) {
                zzj().f354889f.a(S1.i(str), "Database error querying filters. appId", e13);
                Map<Integer, List<zzew.zze>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    @j.l0
    public final void V(String str, String str2) {
        C36729v.f(str);
        C36729v.f(str2);
        e();
        i();
        try {
            l().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e12) {
            S1 s1Zzj = zzj();
            s1Zzj.f354889f.d("Error deleting user property. appId", S1.i(str), this.f355183a.f354721m.g(str2), e12);
        }
    }

    @j.l0
    public final List<K5> W(String str) {
        C36729v.f(str);
        e();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = l().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j12 = cursorQuery.getLong(2);
                    Object objR = r(cursorQuery, 3);
                    if (objR == null) {
                        zzj().f354889f.c("Read invalid user property value, ignoring it. appId", S1.i(str));
                    } else {
                        arrayList.add(new K5(str, str2, string, j12, objR));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e12) {
                zzj().f354889f.a(S1.i(str), "Error querying user properties. appId", e12);
                List<K5> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    @j.l0
    public final void X() {
        i();
        l().beginTransaction();
    }

    @j.l0
    public final void Y() {
        i();
        l().endTransaction();
    }

    @j.l0
    public final void Z() {
        e();
        i();
        I2 i22 = this.f355183a;
        if (i22.f354709a.getDatabasePath("google_app_measurement.db").exists()) {
            C36997w5 c36997w5 = this.f355380b;
            long jA2 = c36997w5.f355446i.f354973e.a();
            i22.f354722n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA2) > E.f354657z.a(null).longValue()) {
                c36997w5.f355446i.f354973e.b(jElapsedRealtime);
                e();
                i();
                if (i22.f354709a.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase sQLiteDatabaseL = l();
                    i22.f354722n.getClass();
                    int iDelete = sQLiteDatabaseL.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C36880g.s())});
                    if (iDelete > 0) {
                        S1 s1Zzj = zzj();
                        s1Zzj.f354897n.c("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @j.l0
    public final void a0() {
        i();
        l().setTransactionSuccessful();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36990v5
    public final boolean k() {
        return false;
    }

    @j.k0
    @j.l0
    public final SQLiteDatabase l() {
        e();
        try {
            return this.f355231d.getWritableDatabase();
        } catch (SQLiteException e12) {
            zzj().f354892i.c("Error opening database", e12);
            throw e12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.l()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.S1 r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.U1 r3 = r3.f354889f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.m():java.lang.String");
    }

    public final long n(zzfi.zzj zzjVar) throws NoSuchAlgorithmException {
        e();
        i();
        C36729v.j(zzjVar);
        C36729v.f(zzjVar.zzx());
        byte[] bArrZzbv = zzjVar.zzbv();
        long jM2 = f().m(bArrZzbv);
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, zzjVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM2));
        contentValues.put("metadata", bArrZzbv);
        try {
            l().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM2;
        } catch (SQLiteException e12) {
            S1 s1Zzj = zzj();
            s1Zzj.f354889f.a(S1.i(zzjVar.zzx()), "Error storing raw event metadata. appId", e12);
            throw e12;
        }
    }

    public final long o(String str) {
        C36729v.f(str);
        e();
        i();
        try {
            return l().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, this.f355183a.f354715g.j(str, E.f354641r))))});
        } catch (SQLiteException e12) {
            zzj().f354889f.a(S1.i(str), "Error deleting over the limit events. appId", e12);
            return 0L;
        }
    }

    @j.l0
    public final long p(String str, String[] strArr, long j12) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = l().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j12;
                }
                long j13 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j13;
            } catch (SQLiteException e12) {
                zzj().f354889f.a(str, "Database error", e12);
                throw e12;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @j.l0
    public final C36943p q(long j12, String str, long j13, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        C36729v.f(str);
        e();
        i();
        String[] strArr = {str};
        C36943p c36943p = new C36943p();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseL = l();
                Cursor cursorQuery = sQLiteDatabaseL.query("apps", new String[]{SelectionType.TYPE_DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().f354892i.c("Not updating daily counts, app is not known. appId", S1.i(str));
                    cursorQuery.close();
                    return c36943p;
                }
                if (cursorQuery.getLong(0) == j12) {
                    c36943p.f355300b = cursorQuery.getLong(1);
                    c36943p.f355299a = cursorQuery.getLong(2);
                    c36943p.f355301c = cursorQuery.getLong(3);
                    c36943p.f355302d = cursorQuery.getLong(4);
                    c36943p.f355303e = cursorQuery.getLong(5);
                }
                if (z12) {
                    c36943p.f355300b += j13;
                }
                if (z13) {
                    c36943p.f355299a += j13;
                }
                if (z14) {
                    c36943p.f355301c += j13;
                }
                if (z15) {
                    c36943p.f355302d += j13;
                }
                if (z16) {
                    c36943p.f355303e += j13;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(SelectionType.TYPE_DAY, Long.valueOf(j12));
                contentValues.put("daily_public_events_count", Long.valueOf(c36943p.f355299a));
                contentValues.put("daily_events_count", Long.valueOf(c36943p.f355300b));
                contentValues.put("daily_conversions_count", Long.valueOf(c36943p.f355301c));
                contentValues.put("daily_error_events_count", Long.valueOf(c36943p.f355302d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c36943p.f355303e));
                sQLiteDatabaseL.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c36943p;
            } catch (SQLiteException e12) {
                zzj().f354889f.a(S1.i(str), "Error updating daily counts. appId", e12);
                if (0 != 0) {
                    cursor.close();
                }
                return c36943p;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    @j.k0
    @j.l0
    public final Object r(Cursor cursor, int i12) {
        int type = cursor.getType(i12);
        if (type == 0) {
            zzj().f354889f.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i12));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i12));
        }
        if (type == 3) {
            return cursor.getString(i12);
        }
        if (type == 4) {
            zzj().f354889f.b("Loaded invalid blob type value, ignoring it");
            return null;
        }
        S1 s1Zzj = zzj();
        s1Zzj.f354889f.c("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String s(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.e()
            r3.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.l()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            com.google.android.gms.measurement.internal.S1 r5 = r3.zzj()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.U1 r5 = r5.f354897n     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.b(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r5 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r5
        L3c:
            r5 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            com.google.android.gms.measurement.internal.S1 r1 = r3.zzj()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.U1 r1 = r1.f354889f     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.c(r2, r5)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.s(long):java.lang.String");
    }

    @j.l0
    public final String t(String str, String str2, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = l().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e12) {
                zzj().f354889f.a(str, "Database error", e12);
                throw e12;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List u(int r21, int r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.u(int, int, java.lang.String):java.util.List");
    }

    @j.l0
    public final List<zzae> v(String str, String str2, String str3) {
        C36729v.f(str);
        e();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return w(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        zzj().f354889f.c("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> w(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36908k.w(java.lang.String, java.lang.String[]):java.util.List");
    }

    @j.l0
    public final void x(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseL = l();
            if (contentValues.getAsString(HiAnalyticsConstant.BI_KEY_APP_ID) == null) {
                zzj().f354891h.c("Value of the primary key is not set.", S1.i(HiAnalyticsConstant.BI_KEY_APP_ID));
            } else if (sQLiteDatabaseL.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseL.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().f354889f.a(S1.i("consent_settings"), "Failed to insert/update table (got -1). key", S1.i(HiAnalyticsConstant.BI_KEY_APP_ID));
            }
        } catch (SQLiteException e12) {
            zzj().f354889f.d("Error storing into table. key", S1.i("consent_settings"), S1.i(HiAnalyticsConstant.BI_KEY_APP_ID), e12);
        }
    }

    @j.l0
    public final void z(zzfi.zzj zzjVar, boolean z12) {
        e();
        i();
        C36729v.j(zzjVar);
        C36729v.f(zzjVar.zzx());
        C36729v.m(zzjVar.zzbe());
        Z();
        this.f355183a.f354722n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzjVar.zzl() < jCurrentTimeMillis - C36880g.s() || zzjVar.zzl() > C36880g.s() + jCurrentTimeMillis) {
            S1 s1Zzj = zzj();
            s1Zzj.f354892i.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", S1.i(zzjVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzjVar.zzl()));
        }
        try {
            byte[] bArrS = f().S(zzjVar.zzbv());
            S1 s1Zzj2 = zzj();
            s1Zzj2.f354897n.c("Saving bundle, size", Integer.valueOf(bArrS.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, zzjVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.zzl()));
            contentValues.put("data", bArrS);
            contentValues.put("has_realtime", Integer.valueOf(z12 ? 1 : 0));
            if (zzjVar.zzbl()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.zzf()));
            }
            try {
                if (l().insert("queue", null, contentValues) == -1) {
                    zzj().f354889f.c("Failed to insert bundle (got -1). appId", S1.i(zzjVar.zzx()));
                }
            } catch (SQLiteException e12) {
                S1 s1Zzj3 = zzj();
                s1Zzj3.f354889f.a(S1.i(zzjVar.zzx()), "Error storing bundle. appId", e12);
            }
        } catch (IOException e13) {
            S1 s1Zzj4 = zzj();
            s1Zzj4.f354889f.a(S1.i(zzjVar.zzx()), "Data loss. Failed to serialize bundle. appId", e13);
        }
    }
}
