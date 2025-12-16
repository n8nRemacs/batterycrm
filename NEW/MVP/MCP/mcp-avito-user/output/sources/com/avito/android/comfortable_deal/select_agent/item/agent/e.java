package com.avito.android.comfortable_deal.select_agent.item.agent;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import dq.InterfaceC39778a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AgentPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/item/agent/e;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/select_agent/item/agent/g;", "Lcom/avito/android/comfortable_deal/select_agent/item/agent/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC39778a, G0> f122723b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC39778a, G0> lVar) {
        this.f122723b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.F1(cVar.f122716c);
        gVar.Ic(cVar.f122718e);
        gVar.b5(cVar.f122717d);
        gVar.hb(cVar.f122719f);
        gVar.setEnabled(cVar.f122720g);
        gVar.a(new d(this, cVar));
    }
}
