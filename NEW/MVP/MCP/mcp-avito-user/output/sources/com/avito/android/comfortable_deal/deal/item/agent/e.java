package com.avito.android.comfortable_deal.deal.item.agent;

import Ep.InterfaceC13517a;
import Y41.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AgentPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/agent/e;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/agent/g;", "Lcom/avito/android/comfortable_deal/deal/item/agent/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC13517a, G0> f121169b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.common.formatter.a f121170c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@Y61.k l<? super InterfaceC13517a, G0> lVar, @Y61.k com.avito.android.comfortable_deal.common.formatter.a aVar) {
        this.f121169b = lVar;
        this.f121170c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.j1(cVar.f121163f);
        gVar.Z(cVar.f121164g);
        gVar.p(this.f121170c.a(cVar.f121160c));
        gVar.setTitle(cVar.f121161d);
        gVar.C(cVar.f121162e);
        gVar.OW(cVar.f121166i);
        gVar.XG(new d(this, cVar));
    }
}
