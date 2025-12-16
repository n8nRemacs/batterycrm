package com.avito.android.favorites.adapter.error;

import Y61.l;
import com.avito.android.advert_collection.v;
import com.avito.android.favorites.InterfaceC30683q0;
import com.avito.android.favorites.adapter.error.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteErrorItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/error/f;", "Lcom/avito/android/favorites/adapter/error/c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public c.a f156566b;

    @Inject
    public f(@l InterfaceC30683q0 interfaceC30683q0) {
        this.f156566b = interfaceC30683q0;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        FavoriteErrorItem favoriteErrorItem = (FavoriteErrorItem) aVar;
        hVar.i7(favoriteErrorItem.f156557b);
        hVar.Od(new d(this, favoriteErrorItem));
        hVar.d(new e(hVar));
    }

    @Override // com.avito.android.favorites.adapter.error.c
    public final void s1(@l v vVar) {
        this.f156566b = vVar;
    }
}
