package com.avito.android.cpx_promo.priceinput;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CpxPromoInputSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoInputSource;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoInputSource {

    /* renamed from: b, reason: collision with root package name */
    public static final CpxPromoInputSource f127248b;

    /* renamed from: c, reason: collision with root package name */
    public static final CpxPromoInputSource f127249c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CpxPromoInputSource[] f127250d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f127251e;

    static {
        CpxPromoInputSource cpxPromoInputSource = new CpxPromoInputSource("PRICE", 0);
        f127248b = cpxPromoInputSource;
        CpxPromoInputSource cpxPromoInputSource2 = new CpxPromoInputSource("LIMIT", 1);
        f127249c = cpxPromoInputSource2;
        CpxPromoInputSource[] cpxPromoInputSourceArr = {cpxPromoInputSource, cpxPromoInputSource2};
        f127250d = cpxPromoInputSourceArr;
        f127251e = kotlin.enums.c.a(cpxPromoInputSourceArr);
    }

    public CpxPromoInputSource() {
        throw null;
    }

    public static CpxPromoInputSource valueOf(String str) {
        return (CpxPromoInputSource) Enum.valueOf(CpxPromoInputSource.class, str);
    }

    public static CpxPromoInputSource[] values() {
        return (CpxPromoInputSource[]) f127250d.clone();
    }
}
