package com.avito.android.user_advert.soa_with_price;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SoaWithPriceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/NavigationButtonType;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationButtonType {

    /* renamed from: b, reason: collision with root package name */
    public static final NavigationButtonType f311839b;

    /* renamed from: c, reason: collision with root package name */
    public static final NavigationButtonType f311840c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ NavigationButtonType[] f311841d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f311842e;

    static {
        NavigationButtonType navigationButtonType = new NavigationButtonType("CLOSE", 0);
        f311839b = navigationButtonType;
        NavigationButtonType navigationButtonType2 = new NavigationButtonType("BACK", 1);
        f311840c = navigationButtonType2;
        NavigationButtonType[] navigationButtonTypeArr = {navigationButtonType, navigationButtonType2};
        f311841d = navigationButtonTypeArr;
        f311842e = kotlin.enums.c.a(navigationButtonTypeArr);
    }

    public NavigationButtonType() {
        throw null;
    }

    public static NavigationButtonType valueOf(String str) {
        return (NavigationButtonType) Enum.valueOf(NavigationButtonType.class, str);
    }

    public static NavigationButtonType[] values() {
        return (NavigationButtonType[]) f311841d.clone();
    }
}
