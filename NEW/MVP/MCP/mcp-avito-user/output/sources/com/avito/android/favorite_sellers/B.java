package com.avito.android.favorite_sellers;

import FC.a;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f155389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FavoriteSellersState f155390m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(H h12, FavoriteSellersState favoriteSellersState) {
        super(0);
        this.f155389l = h12;
        this.f155390m = favoriteSellersState;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f155389l.f155430d.accept(new a.k(this.f155390m.f156045j.f156059b));
        return G0.f406611a;
    }
}
