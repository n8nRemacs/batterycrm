package com.avito.android.tariff.cpa.info.ui.items.balance_info;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BalanceInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/g;", "Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a, G0> f294826b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super a, G0> lVar) {
        this.f294826b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        iVar.setTitle(bVar.f294815c);
        iVar.p(bVar.f294816d);
        iVar.r1(bVar.f294817e, new f(bVar, this));
        iVar.nD(bVar.f294819g);
    }
}
