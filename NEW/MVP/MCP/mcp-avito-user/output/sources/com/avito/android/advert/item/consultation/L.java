package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.advert_details.realty.ContactBarButtonData;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceView;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationButtonPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/L;", "Lcom/avito/android/advert/item/consultation/J;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L implements J {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f74678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f74679c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC28130g0 f74680d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f74681e = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ConsultationButtonPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f74682b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((ContactBar.Button.Target) obj).f125081i == ContactBar.Button.Target.Type.f125091h;
        }
    }

    /* compiled from: ConsultationButtonPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: ConsultationButtonPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<ContactBar.Button.Target, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContactBar.Button.Target target) {
            DevelopmentsAdvice developmentsAdvice;
            DevelopmentsAdviceView form;
            ContactBarButtonData contactBarButton;
            L l12 = L.this;
            AdvertDetails advertDetails = l12.f74679c;
            DeepLink uri = (advertDetails == null || (developmentsAdvice = advertDetails.getDevelopmentsAdvice()) == null || (form = developmentsAdvice.getForm()) == null || (contactBarButton = form.getContactBarButton()) == null) ? null : contactBarButton.getUri();
            if (uri != null) {
                InterfaceC28130g0 interfaceC28130g0 = l12.f74680d;
                if (interfaceC28130g0 == null) {
                    interfaceC28130g0 = null;
                }
                interfaceC28130g0.l0(uri, null);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public L(@Y61.k InterfaceC28265d interfaceC28265d) {
        this.f74678b = interfaceC28265d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String fromPage;
        AnalyticsData analyticsData;
        N n12 = (N) eVar;
        ConsultationButtonItem consultationButtonItem = (ConsultationButtonItem) aVar;
        InterfaceC28130g0 interfaceC28130g0 = this.f74680d;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        ConsultationFormData consultationFormData = consultationButtonItem.f74653f;
        if (consultationFormData == null || (analyticsData = consultationFormData.getAnalyticsData()) == null || (fromPage = analyticsData.getFromPage()) == null) {
            fromPage = "item_contact_block";
        }
        interfaceC28130g0.B0(consultationButtonItem.f74655h, fromPage, "");
        n12.aT(consultationButtonItem.f74652e, new K(consultationButtonItem, this));
    }

    @Override // com.avito.android.advert.item.consultation.J
    public final void i() {
        this.f74681e.b(A1.h(this.f74678b.getF83157A().N(a.f74682b), new b(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new c(), 2));
    }

    @Override // com.avito.android.advert.item.consultation.J
    public final void p(@Y61.l AdvertDetails advertDetails) {
        this.f74679c = advertDetails;
    }

    @Override // com.avito.android.advert.item.consultation.J
    public final void s(@Y61.k InterfaceC28130g0 interfaceC28130g0) {
        this.f74680d = interfaceC28130g0;
    }

    @Override // com.avito.android.advert.item.consultation.J
    public final void t() {
        this.f74681e.e();
    }
}
