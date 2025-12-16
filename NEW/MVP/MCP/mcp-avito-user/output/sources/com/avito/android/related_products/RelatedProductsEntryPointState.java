package com.avito.android.related_products;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RelatedProductsEntryPointState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/related_products/RelatedProductsEntryPointState;", "", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RelatedProductsEntryPointState {

    /* renamed from: b, reason: collision with root package name */
    public static final RelatedProductsEntryPointState f252814b;

    /* renamed from: c, reason: collision with root package name */
    public static final RelatedProductsEntryPointState f252815c;

    /* renamed from: d, reason: collision with root package name */
    public static final RelatedProductsEntryPointState f252816d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RelatedProductsEntryPointState[] f252817e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f252818f;

    static {
        RelatedProductsEntryPointState relatedProductsEntryPointState = new RelatedProductsEntryPointState("Normal", 0);
        f252814b = relatedProductsEntryPointState;
        RelatedProductsEntryPointState relatedProductsEntryPointState2 = new RelatedProductsEntryPointState("Loading", 1);
        f252815c = relatedProductsEntryPointState2;
        RelatedProductsEntryPointState relatedProductsEntryPointState3 = new RelatedProductsEntryPointState("Hidden", 2);
        f252816d = relatedProductsEntryPointState3;
        RelatedProductsEntryPointState[] relatedProductsEntryPointStateArr = {relatedProductsEntryPointState, relatedProductsEntryPointState2, relatedProductsEntryPointState3};
        f252817e = relatedProductsEntryPointStateArr;
        f252818f = c.a(relatedProductsEntryPointStateArr);
    }

    public RelatedProductsEntryPointState() {
        throw null;
    }

    public static RelatedProductsEntryPointState valueOf(String str) {
        return (RelatedProductsEntryPointState) Enum.valueOf(RelatedProductsEntryPointState.class, str);
    }

    public static RelatedProductsEntryPointState[] values() {
        return (RelatedProductsEntryPointState[]) f252817e.clone();
    }
}
