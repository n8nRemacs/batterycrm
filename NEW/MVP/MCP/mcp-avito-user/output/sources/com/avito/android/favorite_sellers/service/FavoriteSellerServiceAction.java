package com.avito.android.favorite_sellers.service;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoriteSellerService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/service/FavoriteSellerServiceAction;", "", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteSellerServiceAction {

    /* renamed from: b, reason: collision with root package name */
    public static final FavoriteSellerServiceAction f156111b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FavoriteSellerServiceAction[] f156112c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156113d;

    static {
        FavoriteSellerServiceAction favoriteSellerServiceAction = new FavoriteSellerServiceAction("MUTE", 0);
        f156111b = favoriteSellerServiceAction;
        FavoriteSellerServiceAction[] favoriteSellerServiceActionArr = {favoriteSellerServiceAction};
        f156112c = favoriteSellerServiceActionArr;
        f156113d = kotlin.enums.c.a(favoriteSellerServiceActionArr);
    }

    public FavoriteSellerServiceAction() {
        throw null;
    }

    public static FavoriteSellerServiceAction valueOf(String str) {
        return (FavoriteSellerServiceAction) Enum.valueOf(FavoriteSellerServiceAction.class, str);
    }

    public static FavoriteSellerServiceAction[] values() {
        return (FavoriteSellerServiceAction[]) f156112c.clone();
    }
}
