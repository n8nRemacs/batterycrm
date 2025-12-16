package com.avito.android.comfortable_deal.deal.item.mortgage;

import Ep.InterfaceC13517a;
import Y41.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import zp.InterfaceC50602a;

/* compiled from: MortgageBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/mortgage/g;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/mortgage/i;", "Lcom/avito/android/comfortable_deal/deal/item/mortgage/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements TV0.d<i, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC13517a, G0> f121441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50602a f121442c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k l<? super InterfaceC13517a, G0> lVar, @Y61.k InterfaceC50602a interfaceC50602a) {
        this.f121441b = lVar;
        this.f121442c = interfaceC50602a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        iVar.r9(new d(this));
        iVar.Nw(new e(this, cVar));
        iVar.o70(new f(this, cVar));
    }
}
