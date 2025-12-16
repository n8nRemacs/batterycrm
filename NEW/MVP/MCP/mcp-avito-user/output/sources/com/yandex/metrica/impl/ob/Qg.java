package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkTaskForSendingDataParamsAppender;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

/* loaded from: classes7.dex */
public class Qg implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ng f379259a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final NetworkTaskForSendingDataParamsAppender f379260b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private Ig f379261c;

    /* renamed from: d, reason: collision with root package name */
    private long f379262d;

    public Qg(@j.N RequestBodyEncrypter requestBodyEncrypter) {
        this(new Ng(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    public void a(@j.N Ig ig2) {
        this.f379261c = ig2;
    }

    @Override // com.yandex.metrica.networktasks.api.IParamsAppender
    public void appendParams(@j.N Uri.Builder builder, @j.N Object obj) {
        Lg lg2 = (Lg) obj;
        builder.path("report");
        if (this.f379260b.f382427a.getEncryptionMode() == RequestBodyEncryptionMode.f382428b) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
        Ig ig2 = this.f379261c;
        if (ig2 != null) {
            NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender = this.f379260b;
            String str = ig2.f378502p;
            String str2 = ig2.f378492f;
            networkTaskForSendingDataParamsAppender.getClass();
            if (str2 != null && str2.contains(SearchParamsConverterKt.SOURCE) && !TextUtils.isEmpty(str)) {
                builder.appendQueryParameter("commit_hash", str);
            }
            builder.appendQueryParameter("deviceid", C38689b.a(this.f379261c.f378487a, lg2.g()));
            builder.appendQueryParameter("uuid", C38689b.a(this.f379261c.f378488b, lg2.w()));
            a(builder, "analytics_sdk_version", this.f379261c.f378489c);
            a(builder, "analytics_sdk_version_name", this.f379261c.f378490d);
            builder.appendQueryParameter("app_version_name", C38689b.a(this.f379261c.f378493g, lg2.f()));
            builder.appendQueryParameter("app_build_number", C38689b.a(this.f379261c.f378495i, lg2.b()));
            builder.appendQueryParameter("os_version", C38689b.a(this.f379261c.f378496j, lg2.o()));
            a(builder, "os_api_level", this.f379261c.f378497k);
            a(builder, "analytics_sdk_build_number", this.f379261c.f378491e);
            a(builder, "analytics_sdk_build_type", this.f379261c.f378492f);
            a(builder, "app_debuggable", this.f379261c.f378494h);
            builder.appendQueryParameter("locale", C38689b.a(this.f379261c.f378498l, lg2.k()));
            builder.appendQueryParameter("is_rooted", C38689b.a(this.f379261c.f378499m, lg2.h()));
            builder.appendQueryParameter("app_framework", C38689b.a(this.f379261c.f378500n, lg2.c()));
            a(builder, "attribution_id", this.f379261c.f378501o);
        }
        builder.appendQueryParameter("api_key_128", lg2.B());
        builder.appendQueryParameter(HiAnalyticsConstant.BI_KEY_APP_ID, lg2.p());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("model", lg2.m());
        builder.appendQueryParameter("manufacturer", lg2.l());
        builder.appendQueryParameter("screen_width", String.valueOf(lg2.u()));
        builder.appendQueryParameter("screen_height", String.valueOf(lg2.t()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(lg2.s()));
        builder.appendQueryParameter("scalefactor", String.valueOf(lg2.r()));
        builder.appendQueryParameter("device_type", lg2.i());
        a(builder, "clids_set", lg2.E());
        builder.appendQueryParameter("app_set_id", lg2.d());
        builder.appendQueryParameter("app_set_id_scope", lg2.e());
        this.f379259a.appendParams(builder, lg2.a());
        builder.appendQueryParameter("request_id", String.valueOf(this.f379262d));
    }

    @j.k0
    public Qg(@j.N Ng ng2, @j.N NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f379259a = ng2;
        this.f379260b = networkTaskForSendingDataParamsAppender;
    }

    public void a(long j12) {
        this.f379262d = j12;
    }

    private void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
