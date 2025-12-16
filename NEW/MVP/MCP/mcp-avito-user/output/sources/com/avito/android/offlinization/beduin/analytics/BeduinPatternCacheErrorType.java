package com.avito.android.offlinization.beduin.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PcElicitationResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/beduin/analytics/BeduinPatternCacheErrorType;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BeduinPatternCacheErrorType {

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinPatternCacheErrorType f208515c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinPatternCacheErrorType f208516d;

    /* renamed from: e, reason: collision with root package name */
    public static final BeduinPatternCacheErrorType f208517e;

    /* renamed from: f, reason: collision with root package name */
    public static final BeduinPatternCacheErrorType f208518f;

    /* renamed from: g, reason: collision with root package name */
    public static final BeduinPatternCacheErrorType f208519g;

    /* renamed from: h, reason: collision with root package name */
    public static final BeduinPatternCacheErrorType f208520h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ BeduinPatternCacheErrorType[] f208521i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f208522j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208523b;

    static {
        BeduinPatternCacheErrorType beduinPatternCacheErrorType = new BeduinPatternCacheErrorType("INVALID_CACHE_KEY", 0, "invalid cache key");
        f208515c = beduinPatternCacheErrorType;
        BeduinPatternCacheErrorType beduinPatternCacheErrorType2 = new BeduinPatternCacheErrorType("PATTERN_RULE_NOT_FOUND", 1, "pattern rule not found");
        f208516d = beduinPatternCacheErrorType2;
        BeduinPatternCacheErrorType beduinPatternCacheErrorType3 = new BeduinPatternCacheErrorType("NO_PATTERN_IN_CACHE", 2, "no pattern in cache");
        BeduinPatternCacheErrorType beduinPatternCacheErrorType4 = new BeduinPatternCacheErrorType("DATA_WITHOUT_PATTERN", 3, "data without pattern");
        f208517e = beduinPatternCacheErrorType4;
        BeduinPatternCacheErrorType beduinPatternCacheErrorType5 = new BeduinPatternCacheErrorType("DATA_WITH_PATTERN", 4, "data with pattern");
        f208518f = beduinPatternCacheErrorType5;
        BeduinPatternCacheErrorType beduinPatternCacheErrorType6 = new BeduinPatternCacheErrorType("NOT_ENOUGH_DISK_MEMORY", 5, "not enough disk memory");
        f208519g = beduinPatternCacheErrorType6;
        BeduinPatternCacheErrorType beduinPatternCacheErrorType7 = new BeduinPatternCacheErrorType("UNDEFINED", 6, "undefined");
        f208520h = beduinPatternCacheErrorType7;
        BeduinPatternCacheErrorType[] beduinPatternCacheErrorTypeArr = {beduinPatternCacheErrorType, beduinPatternCacheErrorType2, beduinPatternCacheErrorType3, beduinPatternCacheErrorType4, beduinPatternCacheErrorType5, beduinPatternCacheErrorType6, beduinPatternCacheErrorType7};
        f208521i = beduinPatternCacheErrorTypeArr;
        f208522j = c.a(beduinPatternCacheErrorTypeArr);
    }

    public BeduinPatternCacheErrorType(String str, int i12, String str2) {
        this.f208523b = str2;
    }

    public static BeduinPatternCacheErrorType valueOf(String str) {
        return (BeduinPatternCacheErrorType) Enum.valueOf(BeduinPatternCacheErrorType.class, str);
    }

    public static BeduinPatternCacheErrorType[] values() {
        return (BeduinPatternCacheErrorType[]) f208521i.clone();
    }
}
