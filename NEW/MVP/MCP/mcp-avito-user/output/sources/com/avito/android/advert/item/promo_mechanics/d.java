package com.avito.android.advert.item.promo_mechanics;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.promo_mechanics.PromoMechanics;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoMechanicPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f78261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PromoMechanics f78262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, PromoMechanics promoMechanics) {
        super(0);
        this.f78261l = eVar;
        this.f78262m = promoMechanics;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f78261l;
        b.a.a(eVar.f78263b, this.f78262m.getOnTapDeepLink(), null, null, 6);
        return G0.f406611a;
    }
}
