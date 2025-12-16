package com.avito.android.auto_loans_composite_broker.v2;

import com.avito.android.remote.model.advert_docking_badge_bar.AdvertDockingBadgeBar;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsCompositeBrokerV2Presenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/r;", "Lcom/avito/android/auto_loans_composite_broker/v2/g;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements InterfaceC28718g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f95639b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert_badge_bar.j f95640c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Me.i f95641d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public t f95642e;

    @Inject
    public r(@Y61.k C c12, @Y61.k com.avito.android.advert_core.advert_badge_bar.j jVar, @Y61.k Me.i iVar) {
        this.f95639b = c12;
        this.f95640c = jVar;
        this.f95641d = iVar;
    }

    public static void k(A a12, t tVar, boolean z12) {
        if (tVar == null) {
            return;
        }
        a12.b();
        if (z12) {
            tVar.Wm(a12.f95605u);
        } else {
            tVar.Vt(a12.f95606v);
        }
        tVar.Zw(a12.a());
        tVar.ov(a12.f95608x);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        t tVar = (t) eVar;
        AdvertDetailsCompositeBrokerV2Item advertDetailsCompositeBrokerV2Item = (AdvertDetailsCompositeBrokerV2Item) aVar;
        this.f95642e = tVar;
        tVar.d(new h(0, this, r.class, "unbind", "unbind()V", 0));
        i iVar = new i(2, this, r.class, "onLoanChanged", "onLoanChanged(IZ)V", 0);
        j jVar = new j(0, this, r.class, "setValidLoan", "setValidLoan()V", 0);
        k kVar = new k(0, this, r.class, "sendInputTouchEvent", "sendInputTouchEvent()V", 0);
        C c12 = this.f95639b;
        tVar.CM(iVar, jVar, kVar, new l(1, c12, C.class, "scrollToLoanInput", "scrollToLoanInput(I)V", 0));
        CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2 = advertDetailsCompositeBrokerV2Item.f95611d;
        List<AdvertDockingBadgeBar.Badge> listG = compositeBrokerCalculatorV2.g();
        ArrayList arrayListA = listG != null ? this.f95640c.a(listG) : null;
        c12.aa(compositeBrokerCalculatorV2, advertDetailsCompositeBrokerV2Item.f95612e);
        A aL02 = c12.L0();
        if (aL02 != null) {
            this.f95641d.e(aL02.f95603s);
            tVar.setTitle(aL02.f95588d);
            tVar.f(aL02.f95589e);
            tVar.Wm(aL02.f95606v);
            tVar.Gh(aL02.f95593i);
            tVar.ov(aL02.f95608x);
            tVar.t0(arrayListA);
            tVar.tU(aL02.f95598n);
            tVar.yI(aL02.f95601q, aL02.f95602r);
            tVar.Io(aL02.f95592h, aL02.a(), new m(2, this, r.class, "onTermSelected", "onTermSelected(Lcom/avito/android/lib/design/chips/Chipable;I)V", 0));
            tVar.r1(aL02.f95594j, new n(0, this, r.class, "onCreditButtonClick", "onCreditButtonClick()V", 0));
            tVar.Il(new o(1, this, r.class, "onAgreementInfoLinkClicked", "onAgreementInfoLinkClicked(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0), aL02.f95596l);
            tVar.bS(new p(1, this, r.class, "onFaqLinkClicked", "onFaqLinkClicked(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0), aL02.f95597m);
            tVar.FD(aL02.f95599o, aL02.f95600p, new q(0, this, r.class, "sendSliderTouchEvent", "sendSliderTouchEvent()V", 0));
        }
    }
}
