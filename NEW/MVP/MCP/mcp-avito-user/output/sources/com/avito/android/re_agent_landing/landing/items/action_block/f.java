package com.avito.android.re_agent_landing.landing.items.action_block;

import Sh0.InterfaceC15186a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/f;", "LTV0/d;", "Lcom/avito/android/re_agent_landing/landing/items/action_block/h;", "Lcom/avito/android/re_agent_landing/landing/items/action_block/c;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements TV0.d<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15186a, G0> f250745b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f250746c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15186a, G0> lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f250745b = lVar;
        this.f250746c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f250737d);
        hVar.h(cVar.f250738e);
        hVar.i(cVar.f250739f);
        j jVar = cVar.f250740g;
        hVar.c1(jVar != null ? jVar.f250755a : null);
        hVar.Y(new e(cVar, this));
        ActionStatus actionStatus = ActionStatus.f250713d;
        InterfaceC28373a interfaceC28373a = this.f250746c;
        ActionStatus actionStatus2 = cVar.f250736c;
        if (actionStatus2 == actionStatus && (str = cVar.f250742i) != null) {
            interfaceC28373a.c(new Ph0.d(str));
        } else if (actionStatus2 == ActionStatus.f250712c) {
            interfaceC28373a.c(new Ph0.f());
        }
    }
}
