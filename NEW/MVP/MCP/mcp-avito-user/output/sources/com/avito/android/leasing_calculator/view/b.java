package com.avito.android.leasing_calculator.view;

import com.avito.android.remote.model.LeasingApplicationRequest;
import com.avito.android.remote.model.LeasingCalculator;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LeasingApplicationPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/leasing_calculator/view/b;", "Lcom/avito/android/leasing_calculator/view/a;", "a", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements InterfaceC31101a {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final List<Character> f175126g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f175127h;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.m f175128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f175129b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.e f175130c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.a f175131d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.leasing_calculator.j f175132e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f175133f;

    /* compiled from: LeasingApplicationPresenter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/leasing_calculator/view/b$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "NEW_LINE_SYMBOL", "Ljava/lang/String;", "NUMBERS_REGEX_PATTERN", "", "", "PHONE_COUNTRY_CODES", "Ljava/util/List;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LeasingApplicationPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.leasing_calculator.view.b$b, reason: collision with other inner class name */
    public static final class C5162b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h f175135m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5162b(h hVar) {
            super(0);
            this.f175135m = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            LeasingCalculator f175120f;
            LeasingCalculator.LeasingApplication application;
            LeasingCalculator.LeasingApplication.ApplicationField inn;
            String value;
            LeasingCalculator.LeasingApplication application2;
            LeasingCalculator.LeasingApplication.ApplicationField phone;
            String value2;
            ArrayList arrayList;
            b bVar = b.this;
            io.reactivex.rxjava3.internal.observers.y yVar = bVar.f175133f;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            com.avito.android.leasing_calculator.m mVar = bVar.f175128a;
            String f175117c = mVar.getF175117c();
            if (f175117c != null && (f175120f = mVar.getF175120f()) != null && (application = f175120f.getApplication()) != null && (inn = application.getInn()) != null && (value = inn.getValue()) != null && (application2 = f175120f.getApplication()) != null && (phone = application2.getPhone()) != null && (value2 = phone.getValue()) != null && bVar.f175130c.a(value, value2)) {
                List<LeasingCalculator.LeasingOffer> offers = f175120f.getOffers();
                if (offers != null) {
                    arrayList = new ArrayList();
                    Iterator<T> it = offers.iterator();
                    while (it.hasNext()) {
                        LeasingCalculator.LeasingOffer.OfferBroker broker = ((LeasingCalculator.LeasingOffer) it.next()).getBroker();
                        String code = broker != null ? broker.getCode() : null;
                        if (code != null) {
                            arrayList.add(code);
                        }
                    }
                } else {
                    arrayList = null;
                }
                LeasingCalculator.LeasingInputTerm downPayment = f175120f.getDownPayment();
                Long value3 = downPayment != null ? downPayment.getValue() : null;
                LeasingCalculator.LeasingInputTerm period = f175120f.getPeriod();
                bVar.f175133f = (io.reactivex.rxjava3.internal.observers.y) mVar.b(f175117c, new LeasingApplicationRequest(arrayList, value3, period != null ? period.getValue() : null, new LeasingApplicationRequest.LeasingApplicationCustomer(value2, value))).j0(bVar.f175129b.e()).t0(new f(bVar, this.f175135m));
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f175126g = C42745f0.U('7', '8');
        f175127h = System.lineSeparator();
    }

    @Inject
    public b(@Y61.k com.avito.android.leasing_calculator.m mVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.leasing_calculator.e eVar, @Y61.k com.avito.android.leasing_calculator.a aVar) {
        this.f175128a = mVar;
        this.f175129b = interfaceC35745a5;
        this.f175130c = eVar;
        this.f175131d = aVar;
    }

    @Override // com.avito.android.leasing_calculator.view.InterfaceC31101a
    public final void a() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f175133f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f175133f = null;
        this.f175132e = null;
    }

    @Override // com.avito.android.leasing_calculator.view.InterfaceC31101a
    public final void b(@Y61.k h hVar, @Y61.k LeasingCalculator.LeasingApplication leasingApplication) {
        hVar.n(leasingApplication.getDescription());
        LeasingCalculator.LeasingApplication.ApplicationField inn = leasingApplication.getInn();
        LeasingCalculator.LeasingApplication.ApplicationField phone = leasingApplication.getPhone();
        if (inn == null) {
            hVar.a();
        } else {
            hVar.g(new d(this, hVar), inn.getTitle(), inn.getValue());
        }
        if (phone == null) {
            hVar.d();
        } else {
            hVar.h(new e(this, hVar), phone.getTitle(), phone.getValue());
        }
        LeasingCalculator.LeasingApplication.ApplicationField inn2 = leasingApplication.getInn();
        String value = inn2 != null ? inn2.getValue() : null;
        LeasingCalculator.LeasingApplication.ApplicationField phone2 = leasingApplication.getPhone();
        hVar.b(this.f175130c.a(value, phone2 != null ? phone2.getValue() : null));
        LeasingCalculator.LeasingApplication.ApplicationAgreement agreement = leasingApplication.getAgreement();
        if (agreement == null) {
            hVar.e(null);
        } else {
            LeasingCalculator.LeasingApplication.ApplicationAgreement.AgreementLink link = agreement.getLink();
            String value2 = link != null ? link.getValue() : null;
            String title = agreement.getTitle();
            LeasingCalculator.LeasingApplication.ApplicationAgreement.AgreementLink link2 = agreement.getLink();
            hVar.e(this.f175131d.a(new c(value2, this), title, link2 != null ? link2.getTitle() : null));
        }
        hVar.f(leasingApplication.getSendButtonText(), new C5162b(hVar));
    }

    @Override // com.avito.android.leasing_calculator.view.InterfaceC31101a
    public final void c(@Y61.k com.avito.android.advert.item.leasing_calculator.j jVar) {
        this.f175132e = jVar;
    }
}
