package com.avito.android.advert.item.realty_usp;

import com.avito.android.advert.item.realty_usp.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyUspPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/q;", "chip", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert/item/realty_usp/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.l<q, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f78407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f78408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RealtyUspItem f78409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, m mVar, RealtyUspItem realtyUspItem) {
        super(1);
        this.f78407l = hVar;
        this.f78408m = mVar;
        this.f78409n = realtyUspItem;
    }

    @Override // Y41.l
    public final G0 invoke(q qVar) {
        q qVar2 = qVar;
        boolean z12 = qVar2 instanceof q.b;
        h hVar = this.f78407l;
        m mVar = this.f78408m;
        if (z12) {
            hVar.f78404f = true;
            mVar.u3(Integer.MAX_VALUE);
        }
        mVar.Uu();
        hVar.f78400b.a(this.f78409n.f78389g, qVar2);
        return G0.f406611a;
    }
}
