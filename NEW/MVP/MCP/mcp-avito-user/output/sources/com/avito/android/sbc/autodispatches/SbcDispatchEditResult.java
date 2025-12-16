package com.avito.android.sbc.autodispatches;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SbcAutodispatchesRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/SbcDispatchEditResult;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbcDispatchEditResult {

    /* renamed from: b, reason: collision with root package name */
    public static final SbcDispatchEditResult f258839b;

    /* renamed from: c, reason: collision with root package name */
    public static final SbcDispatchEditResult f258840c;

    /* renamed from: d, reason: collision with root package name */
    public static final SbcDispatchEditResult f258841d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SbcDispatchEditResult[] f258842e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f258843f;

    static {
        SbcDispatchEditResult sbcDispatchEditResult = new SbcDispatchEditResult("RemovedSingleItem", 0);
        f258839b = sbcDispatchEditResult;
        SbcDispatchEditResult sbcDispatchEditResult2 = new SbcDispatchEditResult("RemovedSeveralItems", 1);
        f258840c = sbcDispatchEditResult2;
        SbcDispatchEditResult sbcDispatchEditResult3 = new SbcDispatchEditResult("DispatchFinished", 2);
        f258841d = sbcDispatchEditResult3;
        SbcDispatchEditResult[] sbcDispatchEditResultArr = {sbcDispatchEditResult, sbcDispatchEditResult2, sbcDispatchEditResult3};
        f258842e = sbcDispatchEditResultArr;
        f258843f = kotlin.enums.c.a(sbcDispatchEditResultArr);
    }

    public SbcDispatchEditResult() {
        throw null;
    }

    public static SbcDispatchEditResult valueOf(String str) {
        return (SbcDispatchEditResult) Enum.valueOf(SbcDispatchEditResult.class, str);
    }

    public static SbcDispatchEditResult[] values() {
        return (SbcDispatchEditResult[]) f258842e.clone();
    }
}
