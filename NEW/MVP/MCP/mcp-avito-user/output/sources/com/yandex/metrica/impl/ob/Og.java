package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.metrica.networktasks.api.IParamsAppender;

/* loaded from: classes7.dex */
public class Og implements IParamsAppender {
    @Override // com.yandex.metrica.networktasks.api.IParamsAppender
    public void appendParams(@j.N Uri.Builder builder, @j.N Object obj) {
        D4 d42 = (D4) obj;
        builder.appendPath("diagnostic");
        builder.appendQueryParameter("deviceid", d42.g());
        builder.appendQueryParameter("uuid", d42.w());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("analytics_sdk_version_name", "5.3.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45003240");
        builder.appendQueryParameter("analytics_sdk_build_type", d42.j());
        if (d42.j().contains(SearchParamsConverterKt.SOURCE) && !TextUtils.isEmpty("a72bf6f57701ed3c2b8ed570054febbff4e58c12")) {
            builder.appendQueryParameter("commit_hash", "a72bf6f57701ed3c2b8ed570054febbff4e58c12");
        }
        builder.appendQueryParameter("app_version_name", d42.f());
        builder.appendQueryParameter("app_build_number", d42.b());
        builder.appendQueryParameter("model", d42.m());
        builder.appendQueryParameter("manufacturer", d42.l());
        builder.appendQueryParameter("os_version", d42.o());
        builder.appendQueryParameter("os_api_level", String.valueOf(d42.n()));
        builder.appendQueryParameter("screen_width", String.valueOf(d42.u()));
        builder.appendQueryParameter("screen_height", String.valueOf(d42.t()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(d42.s()));
        builder.appendQueryParameter("scalefactor", String.valueOf(d42.r()));
        builder.appendQueryParameter("locale", d42.k());
        builder.appendQueryParameter("device_type", d42.i());
        builder.appendQueryParameter(HiAnalyticsConstant.BI_KEY_APP_ID, d42.p());
        builder.appendQueryParameter("api_key_128", d42.B());
        builder.appendQueryParameter("app_debuggable", d42.z());
        builder.appendQueryParameter("is_rooted", d42.h());
        builder.appendQueryParameter("app_framework", d42.c());
    }
}
