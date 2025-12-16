package com.yandex.metrica.networktasks.api;

import android.text.TextUtils;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;

/* loaded from: classes7.dex */
class a {
    public static Response a(String str, String str2) {
        Request.Builder builder = new Request.Builder(str2);
        builder.f382383b = "GET";
        if (!TextUtils.isEmpty(str)) {
            builder.a("If-None-Match", str);
        }
        NetworkClient.Builder builder2 = new NetworkClient.Builder();
        builder2.f382376e = Boolean.TRUE;
        builder2.f382374c = null;
        int i12 = com.yandex.metrica.networktasks.impl.a.f382458a;
        builder2.f382372a = Integer.valueOf(i12);
        builder2.f382373b = Integer.valueOf(i12);
        return new com.yandex.metrica.network.impl.c(builder2.a(), builder.b(), new com.yandex.metrica.network.impl.d()).b();
    }
}
