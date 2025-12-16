package com.avito.android.favorites.adapter.interactive_title;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteInteractiveTitlePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/interactive_title/f;", "Lcom/avito/android/favorites/adapter/interactive_title/d;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f156599b;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f156599b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        FavoriteInteractiveTitleListItem favoriteInteractiveTitleListItem = (FavoriteInteractiveTitleListItem) aVar;
        hVar.k80(favoriteInteractiveTitleListItem);
        hVar.a(new e(favoriteInteractiveTitleListItem, this));
    }
}
