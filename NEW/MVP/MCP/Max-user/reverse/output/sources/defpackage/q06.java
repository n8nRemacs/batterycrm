package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q06 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public q06(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = umf.a;
        s5j.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static q06 a(Context context) {
        wib wibVar = new wib(context);
        String strY = wibVar.y("google_app_id");
        if (TextUtils.isEmpty(strY)) {
            return null;
        }
        return new q06(strY, wibVar.y("google_api_key"), wibVar.y("firebase_database_url"), wibVar.y("ga_trackingId"), wibVar.y("gcm_defaultSenderId"), wibVar.y("google_storage_bucket"), wibVar.y("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q06)) {
            return false;
        }
        q06 q06Var = (q06) obj;
        return syi.c(this.b, q06Var.b) && syi.c(this.a, q06Var.a) && syi.c(this.c, q06Var.c) && syi.c(this.d, q06Var.d) && syi.c(this.e, q06Var.e) && syi.c(this.f, q06Var.f) && syi.c(this.g, q06Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.b, "applicationId");
        h79Var.t(this.a, "apiKey");
        h79Var.t(this.c, "databaseUrl");
        h79Var.t(this.e, "gcmSenderId");
        h79Var.t(this.f, "storageBucket");
        h79Var.t(this.g, "projectId");
        return h79Var.toString();
    }
}
