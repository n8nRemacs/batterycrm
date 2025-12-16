package com.avito.android.advert_core.sellerprofile;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerProfileClickSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/sellerprofile/ShowSellersProfileSource;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShowSellersProfileSource {

    /* renamed from: c, reason: collision with root package name */
    public static final ShowSellersProfileSource f84282c;

    /* renamed from: d, reason: collision with root package name */
    public static final ShowSellersProfileSource f84283d;

    /* renamed from: e, reason: collision with root package name */
    public static final ShowSellersProfileSource f84284e;

    /* renamed from: f, reason: collision with root package name */
    public static final ShowSellersProfileSource f84285f;

    /* renamed from: g, reason: collision with root package name */
    public static final ShowSellersProfileSource f84286g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ShowSellersProfileSource[] f84287h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f84288i;

    /* renamed from: b, reason: collision with root package name */
    public final int f84289b;

    static {
        ShowSellersProfileSource showSellersProfileSource = new ShowSellersProfileSource("SELLER_INFO", 0, 0);
        f84282c = showSellersProfileSource;
        ShowSellersProfileSource showSellersProfileSource2 = new ShowSellersProfileSource("CONTACT_BAR", 1, 1);
        f84283d = showSellersProfileSource2;
        ShowSellersProfileSource showSellersProfileSource3 = new ShowSellersProfileSource("AVITO_BLACK", 2, 4);
        f84284e = showSellersProfileSource3;
        ShowSellersProfileSource showSellersProfileSource4 = new ShowSellersProfileSource("AVITO_MALL", 3, 6);
        f84285f = showSellersProfileSource4;
        ShowSellersProfileSource showSellersProfileSource5 = new ShowSellersProfileSource("AVITO_FOR_BUSINESS", 4, 7);
        f84286g = showSellersProfileSource5;
        ShowSellersProfileSource[] showSellersProfileSourceArr = {showSellersProfileSource, showSellersProfileSource2, showSellersProfileSource3, showSellersProfileSource4, showSellersProfileSource5};
        f84287h = showSellersProfileSourceArr;
        f84288i = c.a(showSellersProfileSourceArr);
    }

    public ShowSellersProfileSource(String str, int i12, int i13) {
        this.f84289b = i13;
    }

    public static ShowSellersProfileSource valueOf(String str) {
        return (ShowSellersProfileSource) Enum.valueOf(ShowSellersProfileSource.class, str);
    }

    public static ShowSellersProfileSource[] values() {
        return (ShowSellersProfileSource[]) f84287h.clone();
    }
}
