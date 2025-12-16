package com.avito.android.advert.item.marketplace_stocks;

import Y61.k;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: MarketplaceStocksView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_stocks/h;", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements AnimationView.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f77613a;

    public h(g gVar) {
        this.f77613a = gVar;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.f
    public final void a(@k AnimationView.e eVar, @k AnimationView.e eVar2) {
        boolean z12 = eVar2 instanceof AnimationView.e.b;
        g gVar = this.f77613a;
        if (z12) {
            D6.G(gVar.f77610e, true);
            D6.w(gVar.f77611f);
            gVar.f77610e.d();
        } else if (eVar2 instanceof AnimationView.e.a) {
            D6.w(gVar.f77610e);
            D6.G(gVar.f77611f, true);
        } else {
            D6.w(gVar.f77610e);
            D6.w(gVar.f77611f);
        }
    }
}
