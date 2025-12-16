package com.avito.android.advert;

import com.avito.android.favorite.AbstractC30569c;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/favorite/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class M<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f68557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f68558c;

    public M(d0 d0Var, AdvertDetails advertDetails) {
        this.f68557b = advertDetails;
        this.f68558c = d0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC30569c abstractC30569c = (AbstractC30569c) obj;
        boolean z12 = abstractC30569c instanceof AbstractC30569c.a;
        d0 d0Var = this.f68558c;
        AdvertDetails advertDetails = this.f68557b;
        if (z12) {
            if (advertDetails.getIsFavorite()) {
                return;
            }
            advertDetails.setFavorite(true);
            d0Var.setFavorite(true);
            return;
        }
        if (abstractC30569c instanceof AbstractC30569c.b) {
            advertDetails.setFavorite(false);
            d0Var.setFavorite(false);
        }
    }
}
