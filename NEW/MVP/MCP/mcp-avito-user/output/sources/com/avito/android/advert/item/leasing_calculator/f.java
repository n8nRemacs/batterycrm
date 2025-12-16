package com.avito.android.advert.item.leasing_calculator;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.leasing_calculator.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.leasing_calculator.analytics.events.ApplicationFormOpenSource;
import com.avito.android.leasing_calculator.view.InterfaceC31101a;
import com.avito.android.leasing_calculator.view.u;
import com.avito.android.remote.model.LeasingCalculator;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import jR.InterfaceC42298a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import oR.InterfaceC44683b;

/* compiled from: AdvertDetailsLeasingCalculatorItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/f;", "Lcom/avito/android/advert/item/leasing_calculator/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f77365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.m f77366c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c.a f77367d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.leasing_calculator.formatters.k f77368e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.leasing_calculator.formatters.d f77369f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.leasing_calculator.formatters.a f77370g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f77371h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.view.j f77372i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f77373j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31101a f77374k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final u f77375l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f77376m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42298a f77377n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44683b f77378o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C29640d f77379p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public y f77380q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f77381r = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public y f77382s;

    /* compiled from: AdvertDetailsLeasingCalculatorItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f77384m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ LeasingCalculator.LeasingOffer.OfferSaving f77385n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, LeasingCalculator.LeasingOffer.OfferSaving offerSaving) {
            super(0);
            this.f77384m = pVar;
            this.f77385n = offerSaving;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.leasing_calculator.view.j jVar = f.this.f77372i;
            Context context = this.f77384m.getContext();
            String tooltip = this.f77385n.getTooltip();
            if (tooltip == null) {
                tooltip = "";
            }
            jVar.a(context, tooltip);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k InterfaceC28240u interfaceC28240u, @Y61.k com.avito.android.leasing_calculator.m mVar, @Y61.k c.a aVar, @Y61.k com.avito.android.advert.item.leasing_calculator.formatters.k kVar, @Y61.k com.avito.android.advert.item.leasing_calculator.formatters.d dVar, @Y61.k com.avito.android.advert.item.leasing_calculator.formatters.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.leasing_calculator.view.j jVar, @Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k InterfaceC31101a interfaceC31101a, @Y61.k u uVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k InterfaceC42298a interfaceC42298a, @Y61.k InterfaceC44683b interfaceC44683b, @Y61.k C29640d c29640d) {
        this.f77365b = interfaceC28240u;
        this.f77366c = mVar;
        this.f77367d = aVar;
        this.f77368e = kVar;
        this.f77369f = dVar;
        this.f77370g = aVar2;
        this.f77371h = interfaceC35745a5;
        this.f77372i = jVar;
        this.f77373j = cVar;
        this.f77374k = interfaceC31101a;
        this.f77375l = uVar;
        this.f77376m = aVar3;
        this.f77377n = interfaceC42298a;
        this.f77378o = interfaceC44683b;
        this.f77379p = c29640d;
    }

    public static final void k(f fVar, p pVar, ApplicationFormOpenSource applicationFormOpenSource) {
        LeasingCalculator.LeasingApplication application;
        com.avito.android.leasing_calculator.m mVar = fVar.f77366c;
        LeasingCalculator data = mVar.getF175120f();
        String applicationLink = data != null ? data.getApplicationLink() : null;
        LeasingCalculator data2 = mVar.getF175120f();
        DeepLink applicationFormLink = data2 != null ? data2.getApplicationFormLink() : null;
        com.avito.android.deeplink_handler.handler.composite.a aVar = fVar.f77376m;
        if (applicationFormLink != null && !(applicationFormLink instanceof NoMatchLink)) {
            b.a.a(aVar, applicationFormLink, null, null, 6);
            return;
        }
        C29640d c29640d = fVar.f77379p;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[15];
        if (((Boolean) c29640d.f132214q.a().invoke()).booleanValue() && applicationLink != null && !C43066x.K(applicationLink)) {
            b.a.a(aVar, new WebViewLink.AnyDomain(Uri.parse(applicationLink), null, null, 6, null), null, null, 6);
            return;
        }
        LeasingCalculator data3 = mVar.getF175120f();
        if (data3 == null || (application = data3.getApplication()) == null) {
            return;
        }
        Context context = pVar.getContext();
        com.avito.android.leasing_calculator.view.j jVar = fVar.f77372i;
        InterfaceC31101a interfaceC31101a = fVar.f77374k;
        com.avito.android.leasing_calculator.view.o oVarC = jVar.c(context, application, interfaceC31101a);
        interfaceC31101a.c(new j(fVar, oVarC));
        oVarC.b();
        fVar.f77377n.e(applicationFormOpenSource);
    }

    public final void O(p pVar, List<LeasingCalculator.LeasingOffer> list) {
        List<LeasingCalculator.LeasingOffer> list2 = list;
        a aVar = null;
        if (list2 == null || list2.isEmpty()) {
            pVar.d20(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        LeasingCalculator.LeasingOffer leasingOffer = (LeasingCalculator.LeasingOffer) C42745f0.E(list);
        LeasingCalculator.LeasingOffer.OfferPayment monthlyPayment = leasingOffer.getMonthlyPayment();
        com.avito.android.advert.item.leasing_calculator.formatters.k kVar = this.f77368e;
        if (monthlyPayment != null) {
            arrayList.add(new T5.c(null, monthlyPayment.getTitle(), kVar.a(monthlyPayment.getValue())));
        }
        LeasingCalculator.LeasingOffer.OfferSaving taxSavings = leasingOffer.getTaxSavings();
        if (taxSavings != null) {
            String tooltip = taxSavings.getTooltip();
            if (tooltip != null && !C43066x.K(tooltip)) {
                aVar = new a(pVar, taxSavings);
            }
            arrayList.add(new T5.c(aVar, taxSavings.getTitle(), kVar.a(taxSavings.getValue())));
        }
        pVar.d20(arrayList);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ArrayList arrayList;
        p pVar = (p) eVar;
        LeasingCalculator data = this.f77366c.getF175120f();
        pVar.setVisible(data != null);
        if (data == null) {
            return;
        }
        pVar.GR(new g(this));
        pVar.b(data.getTitle());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.jakewharton.rxrelay3.c<G0> cVar = this.f77381r;
        cVar.getClass();
        this.f77382s = (y) cVar.y(500L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f77371h.e()).t0(new l(this, pVar));
        LeasingCalculator.LeasingInputTerm downPayment = data.getDownPayment();
        LeasingCalculator.LeasingInputTerm period = data.getPeriod();
        if (downPayment == null) {
            pVar.LF();
        } else {
            pVar.xW(downPayment.getTitle(), downPayment.getValue(), new d(this));
            V(pVar);
        }
        if (period == null) {
            pVar.pU();
        } else {
            pVar.g70(period.getTitle(), period.getValue(), new e(this));
            Y(pVar);
        }
        O(pVar, data.getOffers());
        pVar.b7(data.getApplicationButtonText(), new h(this, pVar));
        String strC = this.f77365b.c();
        List<LeasingCalculator.LeasingBenefit> benefits = data.getBenefits();
        if (benefits != null) {
            List<LeasingCalculator.LeasingBenefit> list = benefits;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LeasingCalculator.LeasingBenefit) it.next()).getValue());
            }
        } else {
            arrayList = null;
        }
        pVar.qR(strC, arrayList);
        LeasingCalculator.LeasingInfo leasingInfo = data.getLeasingInfo();
        pVar.ik(leasingInfo != null ? leasingInfo.getTitle() : null, new i(this, pVar));
    }

    @Override // com.avito.android.advert.item.leasing_calculator.c
    public final void P() {
        y yVar = this.f77380q;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        y yVar2 = this.f77382s;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f77374k.a();
        this.f77375l.a();
    }

    public final boolean V(p pVar) {
        LeasingCalculator data = this.f77366c.getF175120f();
        String strA = null;
        LeasingCalculator.LeasingInputTerm downPayment = data != null ? data.getDownPayment() : null;
        boolean zA2 = this.f77369f.a(downPayment);
        if (!zA2) {
            strA = this.f77370g.a(downPayment != null ? downPayment.getMin() : null, downPayment != null ? downPayment.getMax() : null);
        }
        pVar.j40(strA);
        return zA2;
    }

    public final boolean Y(p pVar) {
        LeasingCalculator data = this.f77366c.getF175120f();
        String strA = null;
        LeasingCalculator.LeasingInputTerm period = data != null ? data.getPeriod() : null;
        boolean zA2 = this.f77369f.a(period);
        if (!zA2) {
            strA = this.f77370g.a(period != null ? period.getMin() : null, period != null ? period.getMax() : null);
        }
        pVar.p50(strA);
        return zA2;
    }
}
