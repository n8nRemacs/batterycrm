package com.vk.push.core.network.utils;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: RequestBody.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core-network_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k {
    @Y61.k
    public static final RequestBody a(@Y61.k String str) {
        return RequestBody.INSTANCE.create(str, MediaType.INSTANCE.get("application/json; charset=utf-8"));
    }
}
