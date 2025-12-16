package com.vk.push.core.network.utils;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core-network_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {
    @Y61.k
    public static final HttpUrl.Builder a(@Y61.k T11.e eVar) {
        return new HttpUrl.Builder().scheme(eVar.a()).host(eVar.b());
    }
}
