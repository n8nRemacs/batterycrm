package com.avito.android.auto_loans_composite_broker.v1;

import com.avito.android.credits.calculator.C29615b;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculator;
import com.avito.android.remote.parse.adapter.CompositeBrokerEventParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsCompositeBrokerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/j;", "Lcom/avito/android/auto_loans_composite_broker/v1/g;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Me.i f95551b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Me.p f95552c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f95553d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C29615b f95554e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Boolean f95555f;

    @Inject
    public j(@Y61.k Me.i iVar, @Y61.k Me.p pVar, @Y61.k n nVar) {
        this.f95551b = iVar;
        this.f95552c = pVar;
        this.f95553d = nVar;
    }

    public static void k(l lVar, C29615b c29615b) {
        if (c29615b == null) {
            return;
        }
        c29615b.cE(new Q(Integer.valueOf(lVar.f95575p), lVar.f95576q), lVar.f95565f, lVar.f95566g, lVar.f95572m, new Q(Integer.valueOf(lVar.f95573n), lVar.f95574o), lVar.f95577r);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        C29615b c29615b = (C29615b) eVar;
        AdvertDetailsCompositeBrokerV1Item advertDetailsCompositeBrokerV1Item = (AdvertDetailsCompositeBrokerV1Item) aVar;
        this.f95554e = c29615b;
        CompositeBrokerCalculator compositeBrokerCalculator = advertDetailsCompositeBrokerV1Item.f95532d;
        n nVar = this.f95553d;
        nVar.ua(compositeBrokerCalculator, advertDetailsCompositeBrokerV1Item.f95533e);
        l lVarL0 = nVar.L0();
        if (lVarL0 == null) {
            return;
        }
        CompositeBrokerEventParams renderEventParams = compositeBrokerCalculator.getRenderEventParams();
        if (renderEventParams != null) {
            this.f95551b.e(renderEventParams.getFromPage());
        }
        c29615b.f128709k = new i(lVarL0, compositeBrokerCalculator, this);
        c29615b.yp(null, lVarL0.f95562c, lVarL0.f95563d);
        c29615b.gH(lVarL0.f95568i, lVarL0.f95567h, null);
        c29615b.f128713o = new h(this);
        k(lVarL0, c29615b);
    }
}
