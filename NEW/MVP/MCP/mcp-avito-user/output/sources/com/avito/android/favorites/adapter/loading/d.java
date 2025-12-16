package com.avito.android.favorites.adapter.loading;

import Y61.l;
import com.avito.android.advert_collection.u;
import com.avito.android.favorites.InterfaceC30683q0;
import com.avito.android.favorites.adapter.loading.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteLoadingItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/loading/d;", "Lcom/avito/android/favorites/adapter/loading/c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public c.a f156644b;

    @Inject
    public d(@l InterfaceC30683q0 interfaceC30683q0) {
        this.f156644b = interfaceC30683q0;
    }

    @Override // com.avito.android.favorites.adapter.loading.c
    public final void D1(@l u uVar) {
        this.f156644b = uVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        FavoriteLoadingItem favoriteLoadingItem = (FavoriteLoadingItem) aVar;
        c.a aVar2 = this.f156644b;
        if (aVar2 != null) {
            aVar2.A(favoriteLoadingItem.f156639b);
        }
    }
}
