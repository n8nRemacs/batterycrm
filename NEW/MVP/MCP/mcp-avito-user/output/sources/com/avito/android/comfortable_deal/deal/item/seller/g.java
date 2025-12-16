package com.avito.android.comfortable_deal.deal.item.seller;

import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SellerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/g;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/seller/i;", "Lcom/avito/android/comfortable_deal/deal/item/seller/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements TV0.d<i, e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121496b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.common.formatter.a f121497c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC13517a, G0> lVar, @k com.avito.android.comfortable_deal.common.formatter.a aVar) {
        this.f121496b = lVar;
        this.f121497c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        e eVar2 = (e) aVar;
        iVar.G0(eVar2.f121491g);
        iVar.sl(eVar2.f121493i);
        iVar.p(this.f121497c.a(eVar2.f121487c));
        iVar.setTitle(eVar2.f121488d);
        iVar.C(eVar2.f121489e);
        iVar.rw(eVar2.f121490f);
        iVar.DI(new f(eVar2, this));
    }
}
