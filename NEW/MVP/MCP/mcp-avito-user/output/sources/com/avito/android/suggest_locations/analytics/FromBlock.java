package com.avito.android.suggest_locations.analytics;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestLocationsAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/analytics/FromBlock;", "", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FromBlock {

    /* renamed from: c, reason: collision with root package name */
    public static final FromBlock f292253c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromBlock f292254d;

    /* renamed from: e, reason: collision with root package name */
    public static final FromBlock f292255e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ FromBlock[] f292256f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f292257g;

    /* renamed from: b, reason: collision with root package name */
    public final int f292258b;

    static {
        FromBlock fromBlock = new FromBlock("REFUSE", 0, 0);
        f292253c = fromBlock;
        FromBlock fromBlock2 = new FromBlock("SUGGEST", 1, 1);
        f292254d = fromBlock2;
        FromBlock fromBlock3 = new FromBlock("FULL_MATCH", 2, 5);
        f292255e = fromBlock3;
        FromBlock[] fromBlockArr = {fromBlock, fromBlock2, fromBlock3, new FromBlock("MARKETPLACE", 3, 9)};
        f292256f = fromBlockArr;
        f292257g = c.a(fromBlockArr);
    }

    public FromBlock(String str, int i12, int i13) {
        this.f292258b = i13;
    }

    public static FromBlock valueOf(String str) {
        return (FromBlock) Enum.valueOf(FromBlock.class, str);
    }

    public static FromBlock[] values() {
        return (FromBlock[]) f292256f.clone();
    }
}
