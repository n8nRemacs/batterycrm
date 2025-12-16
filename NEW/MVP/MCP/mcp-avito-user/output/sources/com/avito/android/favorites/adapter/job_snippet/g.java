package com.avito.android.favorites.adapter.job_snippet;

import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.remote.model.ImageKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f156616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f156617m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FavoriteAdvertItem f156618n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, l lVar, FavoriteAdvertItem favoriteAdvertItem) {
        super(0);
        this.f156616l = iVar;
        this.f156617m = lVar;
        this.f156618n = favoriteAdvertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d.a aVar = this.f156616l.f156626h.get();
        FavoriteAdvertItem favoriteAdvertItem = this.f156618n;
        aVar.y(favoriteAdvertItem, ImageKt.toSingleImage(com.avito.android.image_loader.b.b(favoriteAdvertItem.f156412j).a(this.f156617m.f156636b)));
        return G0.f406611a;
    }
}
