package com.avito.android.credits.broker_link.custom_link;

import Ds.InterfaceC13437a;
import Y61.k;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreditBrokerCustomLinkPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/broker_link/custom_link/d;", "LTV0/d;", "Lcom/avito/android/credits/broker_link/custom_link/f;", "Lcom/avito/android/credits/broker_link/CreditBrokerLinkItem;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, CreditBrokerLinkItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC13437a f128588b;

    @Inject
    public d(@k InterfaceC13437a interfaceC13437a) {
        this.f128588b = interfaceC13437a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink deepLink;
        f fVar = (f) eVar;
        CreditBrokerLinkItem creditBrokerLinkItem = (CreditBrokerLinkItem) aVar;
        EntryPoint entryPoint = creditBrokerLinkItem.f128575e;
        DeepLink deepLink2 = null;
        if (entryPoint != null && (deepLink = entryPoint.getDeepLink()) != null) {
            if (creditBrokerLinkItem.f128572b == CreditCalculator.Type.f128983h) {
                deepLink2 = deepLink;
            }
        }
        fVar.a(new c(this, deepLink2));
        if (entryPoint != null) {
            fVar.Gj(entryPoint.getLeftPart(), entryPoint.getRightPart(), entryPoint.getBottomPart(), entryPoint.getTextPartsSpacing());
            fVar.P8(entryPoint.getTopMargin(), entryPoint.getBottomMargin());
            fVar.R5(entryPoint.getIcon());
        }
    }
}
