package com.avito.android.credits.broker_link.default_link;

import Ds.InterfaceC13437a;
import Y61.k;
import Y61.l;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CreditBrokerDefaultLinkPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/broker_link/default_link/f;", "Lcom/avito/android/credits/broker_link/default_link/d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC13437a f128605b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public h f128606c;

    @Inject
    public f(@k InterfaceC13437a interfaceC13437a) {
        this.f128605b = interfaceC13437a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        EntryPoint.Action action;
        DeepLink deepLink;
        h hVar = (h) eVar;
        CreditBrokerLinkItem creditBrokerLinkItem = (CreditBrokerLinkItem) aVar;
        this.f128606c = hVar;
        String str = creditBrokerLinkItem.f128574d;
        hVar.VE(str);
        CreditCalculator.Type type = creditBrokerLinkItem.f128572b;
        hVar.jA(type, creditBrokerLinkItem.f128576f);
        DeepLink deepLink2 = null;
        EntryPoint entryPoint = creditBrokerLinkItem.f128575e;
        if (entryPoint != null && (deepLink = entryPoint.getDeepLink()) != null && type == CreditCalculator.Type.f128983h) {
            deepLink2 = deepLink;
        }
        hVar.a(new e(this, deepLink2));
        boolean z12 = false;
        if (((entryPoint == null || (action = entryPoint.getAction()) == null) ? false : L.f(action.getIsContest(), Boolean.TRUE)) && type == CreditCalculator.Type.f128977b) {
            z12 = true;
        }
        if (entryPoint != null) {
            String title = entryPoint.getTitle();
            if (title != null) {
                if (type == CreditCalculator.Type.f128981f) {
                    hVar.O0(title, str);
                } else {
                    hVar.setTitle(title);
                }
            }
            EntryPoint.Action action2 = entryPoint.getAction();
            if (action2 != null) {
                hVar.eU(action2.getTitle(), z12, action2.getColor());
            }
        }
    }
}
