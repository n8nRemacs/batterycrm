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
public class Pg implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ng f379210a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final NetworkTaskForSendingDataParamsAppender f379211b;

    /* renamed from: c, reason: collision with root package name */
    private long f379212c;

    public Pg(@j.N RequestBodyEncrypter requestBodyEncrypter) {
        this(new Ng(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    public void a(long j12) {
        this.f379212c = j12;
    }

    @Override // com.yandex.metrica.networktasks.api.IParamsAppender
    public void appendParams(@j.N Uri.Builder builder, @j.N Object obj) {
        C38828gd c38828gd = (C38828gd) obj;
        if (this.f379211b.f382427a.getEncryptionMode() == RequestBodyEncryptionMode.f382428b) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
        NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender = this.f379211b;
        c38828gd.getClass();
        String strJ = c38828gd.j();
        networkTaskForSendingDataParamsAppender.getClass();
        if (strJ != null && strJ.contains(SearchParamsConverterKt.SOURCE) && !TextUtils.isEmpty("a72bf6f57701ed3c2b8ed570054febbff4e58c12")) {
            builder.appendQueryParameter("commit_hash", "a72bf6f57701ed3c2b8ed570054febbff4e58c12");
        }
        builder.appendPath("location");
        builder.appendQueryParameter("deviceid", c38828gd.g());
        builder.appendQueryParameter("device_type", c38828gd.i());
        builder.appendQueryParameter("uuid", c38828gd.w());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.3.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45003240");
        builder.appendQueryParameter("analytics_sdk_build_type", c38828gd.j());
        builder.appendQueryParameter("app_version_name", c38828gd.f());
        builder.appendQueryParameter("app_build_number", c38828gd.b());
        builder.appendQueryParameter("os_version", c38828gd.o());
        builder.appendQueryParameter("os_api_level", String.valueOf(c38828gd.n()));
        builder.appendQueryParameter("is_rooted", c38828gd.h());
        builder.appendQueryParameter("app_framework", c38828gd.c());
        builder.appendQueryParameter(HiAnalyticsConstant.BI_KEY_APP_ID, c38828gd.p());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("request_id", String.valueOf(this.f379212c));
        builder.appendQueryParameter("app_set_id", c38828gd.d());
        builder.appendQueryParameter("app_set_id_scope", c38828gd.e());
        this.f379210a.appendParams(builder, c38828gd.a());
    }

    @j.k0
    public Pg(@j.N Ng ng2, @j.N NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f379210a = ng2;
        this.f379211b = networkTaskForSendingDataParamsAppender;
    }
}
