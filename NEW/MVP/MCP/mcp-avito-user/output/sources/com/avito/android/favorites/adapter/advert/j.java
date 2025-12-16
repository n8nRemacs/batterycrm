package com.avito.android.favorites.adapter.advert;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.remote.model.FavoriteAdvertActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FavoriteAdvertItem f156451l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f156452m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FavoriteAdvertItem favoriteAdvertItem, p pVar) {
        super(0);
        this.f156451l = favoriteAdvertItem;
        this.f156452m = pVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d.a aVar;
        FavoriteAdvertItem favoriteAdvertItem = this.f156451l;
        FavoriteAdvertActionButton favoriteAdvertActionButton = favoriteAdvertItem.f156424v;
        DeepLink link = favoriteAdvertActionButton != null ? favoriteAdvertActionButton.getLink() : null;
        if (link != null && (aVar = this.f156452m.f156460b) != null) {
            aVar.D(link, favoriteAdvertItem.f156404b);
        }
        return G0.f406611a;
    }
}
