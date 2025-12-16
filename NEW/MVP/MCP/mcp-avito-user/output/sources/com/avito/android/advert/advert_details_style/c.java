package com.avito.android.advert.advert_details_style;

import com.avito.android.R;
import com.avito.android.advert.advert_details_style.b;
import com.avito.android.advert_core.analytics.AdvertDetailsStyleAnalytics;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsStyleConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f68657a;

    /* compiled from: AdvertDetailsStyleConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<AdvertDetailsStyle> f68658a = kotlin.enums.c.a(AdvertDetailsStyle.values());
    }

    /* compiled from: AdvertDetailsStyleConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AdvertDetailsStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle = AdvertDetailsStyle.f84409c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle2 = AdvertDetailsStyle.f84409c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle3 = AdvertDetailsStyle.f84409c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        com.avito.android.advert.advert_details_style.b bVar;
        List list = a.f68658a;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = ((AbstractC42738c) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AdvertDetailsStyle advertDetailsStyle = (AdvertDetailsStyle) next;
            int iOrdinal = advertDetailsStyle.ordinal();
            AdvertDetailsStyle.a aVar = advertDetailsStyle.f84415b;
            if (iOrdinal == 0) {
                bVar = new com.avito.android.advert.advert_details_style.b(false, true, new b.c(true, true, new b.c.a(R.attr.transparentWhite, R.attr.black, R.attr.blue, R.color.common_gray_12), d.f68659l), e.f68660l, null, null, new b.C2146b(aVar.f84416a, null, null, null, 14, null), new b.a(null), false, AdvertDetailsStyleAnalytics.f82773c, "item", null, 2048, null);
            } else if (iOrdinal == 1) {
                bVar = new com.avito.android.advert.advert_details_style.b(true, false, new b.c(false, false, new b.c.a(R.attr.constantBlack, R.attr.constantWhite, R.attr.constantWhite, R.color.re_23_constant_gray_12_night), f.f68661l), g.f68662b, Integer.valueOf(R.style.Theme_DesignSystem_Re23), "avitoBlack", new b.C2146b(aVar.f84416a, "avito_black", ShowSellersProfileSource.f84284e, null, 8, null), new b.a("avitoBlack", "premium_item"), false, AdvertDetailsStyleAnalytics.f82774d, "item", null, 2048, null);
            } else if (iOrdinal == 2) {
                bVar = new com.avito.android.advert.advert_details_style.b(false, false, new b.c(false, false, new b.c.a(R.attr.transparentWhite, R.attr.black, R.attr.black, R.color.common_gray_12), h.f68663l), i.f68664b, Integer.valueOf(R.style.Theme_DesignSystem_Re23), "avitoMall", new b.C2146b(aVar.f84416a, "avito_mall", ShowSellersProfileSource.f84285f, null, 8, null), new b.a("avitoMall", "mall_item"), true, AdvertDetailsStyleAnalytics.f82775e, "item", null, 2048, null);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new com.avito.android.advert.advert_details_style.b(false, false, new b.c(false, false, new b.c.a(R.attr.transparentWhite, R.attr.black, R.attr.black, R.color.common_gray_12), j.f68665l), k.f68666b, Integer.valueOf(R.style.Theme_DesignSystem_Re23), "avito_for_business", new b.C2146b(aVar.f84416a, "avito_for_business", ShowSellersProfileSource.f84286g, "afb_item"), new b.a("avitoForBusiness", "for_business_item"), true, AdvertDetailsStyleAnalytics.f82776f, "afb_item", BottomNavigationSpace.f107066c);
            }
            linkedHashMap.put(next, bVar);
        }
        f68657a = linkedHashMap;
    }

    @Y61.k
    public static final com.avito.android.advert.advert_details_style.b a(@Y61.k AdvertDetailsStyle advertDetailsStyle) {
        return (com.avito.android.advert.advert_details_style.b) f68657a.get(advertDetailsStyle);
    }
}
