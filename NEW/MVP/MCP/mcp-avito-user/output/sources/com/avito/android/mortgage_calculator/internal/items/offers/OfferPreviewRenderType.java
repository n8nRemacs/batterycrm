package com.avito.android.mortgage_calculator.internal.items.offers;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfferPreviewRenderType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/items/offers/OfferPreviewRenderType;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferPreviewRenderType {

    /* renamed from: b, reason: collision with root package name */
    public static final OfferPreviewRenderType f204391b;

    /* renamed from: c, reason: collision with root package name */
    public static final OfferPreviewRenderType f204392c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OfferPreviewRenderType[] f204393d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f204394e;

    static {
        OfferPreviewRenderType offerPreviewRenderType = new OfferPreviewRenderType("SMALL", 0);
        f204391b = offerPreviewRenderType;
        OfferPreviewRenderType offerPreviewRenderType2 = new OfferPreviewRenderType("BIG", 1);
        f204392c = offerPreviewRenderType2;
        OfferPreviewRenderType[] offerPreviewRenderTypeArr = {offerPreviewRenderType, offerPreviewRenderType2};
        f204393d = offerPreviewRenderTypeArr;
        f204394e = c.a(offerPreviewRenderTypeArr);
    }

    public OfferPreviewRenderType() {
        throw null;
    }

    public static OfferPreviewRenderType valueOf(String str) {
        return (OfferPreviewRenderType) Enum.valueOf(OfferPreviewRenderType.class, str);
    }

    public static OfferPreviewRenderType[] values() {
        return (OfferPreviewRenderType[]) f204393d.clone();
    }
}
