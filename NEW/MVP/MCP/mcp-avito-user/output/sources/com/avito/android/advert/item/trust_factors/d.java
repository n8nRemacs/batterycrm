package com.avito.android.advert.item.trust_factors;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryTrustFactorsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f80626l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeliveryTrustFactorsItem f80627m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, DeliveryTrustFactorsItem deliveryTrustFactorsItem) {
        super(0);
        this.f80626l = eVar;
        this.f80627m = deliveryTrustFactorsItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f80626l;
        eVar.f80628b.u(this.f80627m.f80621g.getBottomSheetDeeplink());
        return G0.f406611a;
    }
}
