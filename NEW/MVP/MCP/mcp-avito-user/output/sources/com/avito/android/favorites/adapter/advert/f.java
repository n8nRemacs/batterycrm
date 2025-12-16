package com.avito.android.favorites.adapter.advert;

import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.remote.model.ImageKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f156443l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FavoriteAdvertItem f156444m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f156445n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, FavoriteAdvertItem favoriteAdvertItem, r rVar) {
        super(0);
        this.f156443l = pVar;
        this.f156444m = favoriteAdvertItem;
        this.f156445n = rVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d.a aVar = this.f156443l.f156460b;
        if (aVar != null) {
            FavoriteAdvertItem favoriteAdvertItem = this.f156444m;
            aVar.y(favoriteAdvertItem, ImageKt.toSingleImage(this.f156445n.O(com.avito.android.image_loader.b.b(favoriteAdvertItem.f156412j))));
        }
        return G0.f406611a;
    }
}
