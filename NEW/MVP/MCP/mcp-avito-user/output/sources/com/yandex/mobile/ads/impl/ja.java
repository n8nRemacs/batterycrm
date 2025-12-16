package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IIdentifierCallback;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ja {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final Map<IIdentifierCallback.Reason, String> f386794a = kotlin.collections.P0.g(new kotlin.Q(IIdentifierCallback.Reason.NETWORK, "Network error"), new kotlin.Q(IIdentifierCallback.Reason.INVALID_RESPONSE, "Invalid response"), new kotlin.Q(IIdentifierCallback.Reason.UNKNOWN, "Unknown"));

    @Y61.k
    public static String a(@Y61.l IIdentifierCallback.Reason reason) {
        String str = f386794a.get(reason);
        return str == null ? "Unknown" : str;
    }
}
