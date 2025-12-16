package com.avito.android.offlinization.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkDataRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/events/CacheRequestReason;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CacheRequestReason {

    /* renamed from: c, reason: collision with root package name */
    public static final CacheRequestReason f208489c;

    /* renamed from: d, reason: collision with root package name */
    public static final CacheRequestReason f208490d;

    /* renamed from: e, reason: collision with root package name */
    public static final CacheRequestReason f208491e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CacheRequestReason[] f208492f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f208493g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208494b;

    static {
        CacheRequestReason cacheRequestReason = new CacheRequestReason("NETWORK_ERROR", 0, "network error");
        f208489c = cacheRequestReason;
        CacheRequestReason cacheRequestReason2 = new CacheRequestReason("BACKEND_ERROR", 1, "backend error");
        f208490d = cacheRequestReason2;
        CacheRequestReason cacheRequestReason3 = new CacheRequestReason("CLIENT_ERROR", 2, "client error");
        CacheRequestReason cacheRequestReason4 = new CacheRequestReason("TIMEOUT", 3, "timeout");
        f208491e = cacheRequestReason4;
        CacheRequestReason[] cacheRequestReasonArr = {cacheRequestReason, cacheRequestReason2, cacheRequestReason3, cacheRequestReason4};
        f208492f = cacheRequestReasonArr;
        f208493g = c.a(cacheRequestReasonArr);
    }

    public CacheRequestReason(String str, int i12, String str2) {
        this.f208494b = str2;
    }

    public static CacheRequestReason valueOf(String str) {
        return (CacheRequestReason) Enum.valueOf(CacheRequestReason.class, str);
    }

    public static CacheRequestReason[] values() {
        return (CacheRequestReason[]) f208492f.clone();
    }
}
