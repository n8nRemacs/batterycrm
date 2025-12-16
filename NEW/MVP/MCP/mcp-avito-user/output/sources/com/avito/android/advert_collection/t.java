package com.avito.android.advert_collection;

import I7.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import kotlin.Metadata;

/* compiled from: AdvertCollectionView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/t;", "Lcom/avito/android/favorites/adapter/advert/d$a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t implements d.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f81697b;

    public t(z zVar) {
        this.f81697b = zVar;
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void C(@Y61.k String str) {
        this.f81697b.f81707e.accept(new a.u(str));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void h(@Y61.k DeepLink deepLink) {
        this.f81697b.f81707e.accept(new a.j(deepLink));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void l(@Y61.k FavoriteAdvertItem favoriteAdvertItem) {
        this.f81697b.f81707e.accept(new a.l(favoriteAdvertItem));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void o(@Y61.k AutotekaPurchaseAction autotekaPurchaseAction) {
        this.f81697b.f81707e.accept(new a.i(autotekaPurchaseAction));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void y(@Y61.k FavoriteAdvertItem favoriteAdvertItem, @Y61.l Image image) {
        this.f81697b.f81707e.accept(new a.p(favoriteAdvertItem, image));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void E(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void e(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void p(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void D(@Y61.k DeepLink deepLink, @Y61.k String str) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void F(@Y61.k String str, @Y61.k String str2) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void b(int i12, int i13, @Y61.k String str, int i14) {
    }
}
