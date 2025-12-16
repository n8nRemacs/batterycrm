package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes8.dex */
final class vs {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final q8 f390989a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ts f390990b;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final da0 f390994f;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final s21 f390991c = new s21();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final e31 f390992d = new e31();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final aq f390993e = new aq();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final r8 f390995g = new r8();

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final ws f390996h = new ws();

    public vs(@j.N Context context, @j.N n2 n2Var) {
        this.f390989a = n2Var.e();
        this.f390990b = n2Var.j();
        this.f390994f = da0.a(context);
    }

    public final void a(@j.N Context context, @j.N Uri.Builder builder) {
        String strValueOf;
        Location locationA;
        a(builder, HiAnalyticsConstant.BI_KEY_APP_ID, context.getPackageName());
        boolean z12 = false;
        String str = null;
        try {
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            strValueOf = null;
        }
        a(builder, "app_version_code", strValueOf);
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
        }
        a(builder, "app_version_name", str);
        a(builder, HianalyticsBaseData.SDK_VERSION, this.f390991c.a());
        a(builder, "sdk_version_name", this.f390991c.b());
        a(builder, this.f390996h.b(), this.f390993e.a(context));
        a(builder, "locale", this.f390993e.b(context));
        String strC = this.f390996h.c();
        this.f390993e.getClass();
        a(builder, strC, aq.a());
        String strD = this.f390996h.d();
        this.f390993e.getClass();
        a(builder, strD, Build.MODEL);
        String strE = this.f390996h.e();
        this.f390993e.getClass();
        a(builder, strE, "android");
        String strF = this.f390996h.f();
        this.f390993e.getClass();
        a(builder, strF, Build.VERSION.RELEASE);
        this.f390992d.getClass();
        if (e31.b(context) && (locationA = this.f390994f.a()) != null) {
            a(builder, "location_timestamp", String.valueOf(locationA.getTime()));
            a(builder, "lat", String.valueOf(locationA.getLatitude()));
            a(builder, MessageBody.Location.LONGITUDE, String.valueOf(locationA.getLongitude()));
            a(builder, "precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        this.f390992d.getClass();
        if (e31.b(context)) {
            a(builder, this.f390996h.a(), this.f390990b.b());
            s8 s8VarA = this.f390989a.a();
            if (s8VarA != null) {
                boolean zB2 = s8VarA.b();
                String strA = s8VarA.a();
                this.f390995g.getClass();
                boolean z13 = (TextUtils.isEmpty(strA) || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!zB2 && z13) {
                    a(builder, "google_aid", strA);
                }
            }
            s8 s8VarB = this.f390989a.b();
            if (s8VarB != null) {
                boolean zB3 = s8VarB.b();
                String strA2 = s8VarB.a();
                this.f390995g.getClass();
                if (!TextUtils.isEmpty(strA2) && !"00000000-0000-0000-0000-000000000000".equals(strA2)) {
                    z12 = true;
                }
                if (zB3 || !z12) {
                    return;
                }
                a(builder, "huawei_oaid", strA2);
            }
        }
    }

    private static void a(@j.N Uri.Builder builder, @j.N String str, @j.P String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
