package com.avito.android.advert.item.delivery_suggests;

import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDeliverySuggestsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/p;", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p implements AnimationView.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f75146a;

    public p(o oVar) {
        this.f75146a = oVar;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.f
    public final void a(@Y61.k AnimationView.e eVar, @Y61.k AnimationView.e eVar2) {
        boolean z12 = eVar2 instanceof AnimationView.e.b;
        o oVar = this.f75146a;
        if (z12) {
            D6.G(oVar.f75140f, true);
        } else if (eVar2 instanceof AnimationView.e.a) {
            D6.w(oVar.f75140f);
        } else {
            D6.w(oVar.f75140f);
        }
    }
}
