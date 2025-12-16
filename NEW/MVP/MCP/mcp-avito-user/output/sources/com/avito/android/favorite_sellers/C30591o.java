package com.avito.android.favorite_sellers;

import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import kotlin.Metadata;

/* compiled from: FavoriteSellersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowCommonErrorToastBar;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30591o extends kotlin.jvm.internal.N implements Y41.l<String, FavoriteSellersInternalAction.ShowCommonErrorToastBar> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Throwable f156085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30591o(Throwable th2) {
        super(1);
        this.f156085l = th2;
    }

    @Override // Y41.l
    public final FavoriteSellersInternalAction.ShowCommonErrorToastBar invoke(String str) {
        return new FavoriteSellersInternalAction.ShowCommonErrorToastBar(this.f156085l);
    }
}
