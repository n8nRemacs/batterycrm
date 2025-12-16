package com.avito.android.offlinization.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflinizationStatsDEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/events/CacheIOResult;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CacheIOResult {

    /* renamed from: c, reason: collision with root package name */
    public static final CacheIOResult f208484c;

    /* renamed from: d, reason: collision with root package name */
    public static final CacheIOResult f208485d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CacheIOResult[] f208486e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f208487f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208488b;

    static {
        CacheIOResult cacheIOResult = new CacheIOResult("SUCCESS", 0, "success");
        f208484c = cacheIOResult;
        CacheIOResult cacheIOResult2 = new CacheIOResult("FAILED", 1, "failure");
        f208485d = cacheIOResult2;
        CacheIOResult[] cacheIOResultArr = {cacheIOResult, cacheIOResult2};
        f208486e = cacheIOResultArr;
        f208487f = c.a(cacheIOResultArr);
    }

    public CacheIOResult(String str, int i12, String str2) {
        this.f208488b = str2;
    }

    public static CacheIOResult valueOf(String str) {
        return (CacheIOResult) Enum.valueOf(CacheIOResult.class, str);
    }

    public static CacheIOResult[] values() {
        return (CacheIOResult[]) f208486e.clone();
    }
}
