package com.avito.android.offlinization.beduin.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PatternCacheStartResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/beduin/analytics/PatternCacheStartResult;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PatternCacheStartResult {

    /* renamed from: c, reason: collision with root package name */
    public static final PatternCacheStartResult f208524c;

    /* renamed from: d, reason: collision with root package name */
    public static final PatternCacheStartResult f208525d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PatternCacheStartResult[] f208526e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f208527f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208528b;

    static {
        PatternCacheStartResult patternCacheStartResult = new PatternCacheStartResult("SUCCESS", 0, "success");
        f208524c = patternCacheStartResult;
        PatternCacheStartResult patternCacheStartResult2 = new PatternCacheStartResult("NOT_ENOUGH_DISK_MEMORY", 1, "notEnoughDiskMemory");
        f208525d = patternCacheStartResult2;
        PatternCacheStartResult[] patternCacheStartResultArr = {patternCacheStartResult, patternCacheStartResult2, new PatternCacheStartResult("TOO_OLD", 2, "tooOld")};
        f208526e = patternCacheStartResultArr;
        f208527f = c.a(patternCacheStartResultArr);
    }

    public PatternCacheStartResult(String str, int i12, String str2) {
        this.f208528b = str2;
    }

    public static PatternCacheStartResult valueOf(String str) {
        return (PatternCacheStartResult) Enum.valueOf(PatternCacheStartResult.class, str);
    }

    public static PatternCacheStartResult[] values() {
        return (PatternCacheStartResult[]) f208526e.clone();
    }
}
