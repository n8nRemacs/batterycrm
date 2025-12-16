package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Store.java */
/* loaded from: classes6.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f361770a;

    /* compiled from: Store.java */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f361771d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f361772e = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f361773a;

        /* renamed from: b, reason: collision with root package name */
        public final String f361774b;

        /* renamed from: c, reason: collision with root package name */
        public final long f361775c;

        public a(String str, String str2, long j12) {
            this.f361773a = str;
            this.f361774b = str2;
            this.f361775c = j12;
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e12) {
                e12.toString();
                return null;
            }
        }
    }

    public G(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f361770a = sharedPreferences;
        File file = new File(androidx.core.content.d.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e12) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e12.getMessage();
            }
        }
    }

    public static String a(String str, String str2) {
        return androidx.media3.exoplayer.analytics.m.l(str, "|T|", str2, "|*");
    }
}
