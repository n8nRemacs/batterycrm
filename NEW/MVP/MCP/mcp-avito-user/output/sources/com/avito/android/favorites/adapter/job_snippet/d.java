package com.avito.android.favorites.adapter.job_snippet;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.FavoriteAdvertActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteJobItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FavoriteAdvertActionButton f156609l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f156610m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FavoriteAdvertItem f156611n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FavoriteAdvertActionButton favoriteAdvertActionButton, i iVar, FavoriteAdvertItem favoriteAdvertItem) {
        super(0);
        this.f156609l = favoriteAdvertActionButton;
        this.f156610m = iVar;
        this.f156611n = favoriteAdvertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink link;
        FavoriteAdvertActionButton favoriteAdvertActionButton = this.f156609l;
        if (favoriteAdvertActionButton == null || (link = favoriteAdvertActionButton.getLink()) == null) {
            return null;
        }
        this.f156610m.f156626h.get().D(link, this.f156611n.f156404b);
        return G0.f406611a;
    }
}
