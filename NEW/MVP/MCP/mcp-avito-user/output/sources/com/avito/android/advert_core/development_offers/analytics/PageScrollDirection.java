package com.avito.android.advert_core.development_offers.analytics;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DevelopmentOffersAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/development_offers/analytics/PageScrollDirection;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PageScrollDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final PageScrollDirection f83292b;

    /* renamed from: c, reason: collision with root package name */
    public static final PageScrollDirection f83293c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PageScrollDirection[] f83294d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f83295e;

    static {
        PageScrollDirection pageScrollDirection = new PageScrollDirection("RIGHT", 0);
        f83292b = pageScrollDirection;
        PageScrollDirection pageScrollDirection2 = new PageScrollDirection("LEFT", 1);
        f83293c = pageScrollDirection2;
        PageScrollDirection[] pageScrollDirectionArr = {pageScrollDirection, pageScrollDirection2};
        f83294d = pageScrollDirectionArr;
        f83295e = c.a(pageScrollDirectionArr);
    }

    public PageScrollDirection() {
        throw null;
    }

    public static PageScrollDirection valueOf(String str) {
        return (PageScrollDirection) Enum.valueOf(PageScrollDirection.class, str);
    }

    public static PageScrollDirection[] values() {
        return (PageScrollDirection[]) f83294d.clone();
    }
}
