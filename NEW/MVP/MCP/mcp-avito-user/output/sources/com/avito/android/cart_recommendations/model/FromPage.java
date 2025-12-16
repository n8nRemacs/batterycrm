package com.avito.android.cart_recommendations.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_recommendations/model/FromPage;", "", "_avito_cart-recommendations_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f115328c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromPage f115329d;

    /* renamed from: e, reason: collision with root package name */
    public static final FromPage f115330e;

    /* renamed from: f, reason: collision with root package name */
    public static final FromPage f115331f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f115332g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f115333h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f115334b;

    static {
        FromPage fromPage = new FromPage("ITEM", 0, "item");
        f115328c = fromPage;
        FromPage fromPage2 = new FromPage("PROFILE", 1, "public_profile");
        FromPage fromPage3 = new FromPage("FAVORITES", 2, "fav");
        f115329d = fromPage3;
        FromPage fromPage4 = new FromPage("SELLER_PROMOTIONS", 3, "promo");
        f115330e = fromPage4;
        FromPage fromPage5 = new FromPage("CART_SIMILAR_ITEMS", 4, "cart_similar");
        f115331f = fromPage5;
        FromPage[] fromPageArr = {fromPage, fromPage2, fromPage3, fromPage4, fromPage5};
        f115332g = fromPageArr;
        f115333h = c.a(fromPageArr);
    }

    public FromPage(String str, int i12, String str2) {
        this.f115334b = str2;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f115332g.clone();
    }
}
