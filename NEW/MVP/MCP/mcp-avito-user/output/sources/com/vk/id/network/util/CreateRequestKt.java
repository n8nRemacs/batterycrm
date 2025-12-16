package com.vk.id.network.util;

import Y61.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* compiled from: CreateRequest.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0000¨\u0006\n"}, d2 = {"createRequest", "Lokhttp3/Call;", "Lokhttp3/OkHttpClient;", "host", "", "path", "requestBody", "Lokhttp3/RequestBody;", "query", "", "network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateRequestKt {
    @k
    public static final Call createRequest(@k OkHttpClient okHttpClient, @k String str, @k String str2, @k RequestBody requestBody, @k Map<String, String> map) {
        HttpUrl.Builder builderNewBuilder = HttpUrl.INSTANCE.get(str).newBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderNewBuilder.addQueryParameter(entry.getKey(), entry.getValue());
        }
        return okHttpClient.newCall(new Request.Builder().url(builderNewBuilder.addPathSegments(str2).build()).post(requestBody).build());
    }

    public static /* synthetic */ Call createRequest$default(OkHttpClient okHttpClient, String str, String str2, RequestBody requestBody, Map map, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            map = P0.c();
        }
        return createRequest(okHttpClient, str, str2, requestBody, map);
    }
}
