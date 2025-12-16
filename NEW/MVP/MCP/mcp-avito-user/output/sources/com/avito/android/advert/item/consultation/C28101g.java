package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.FormInput;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceView;
import com.avito.android.remote.model.advert_details.realty.Landing;
import com.avito.android.remote.model.advert_details.realty.LandingInfo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsConsultationPresenter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/consultation/g;", "Lcom/avito/android/advert/item/consultation/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.consultation.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28101g implements InterfaceC28097c {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC28130g0 f74772b;

    @Inject
    public C28101g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String fromPage;
        FormInput phoneInput;
        AnalyticsData analyticsData;
        InterfaceC28106l interfaceC28106l = (InterfaceC28106l) eVar;
        AdvertDetailsConsultationItem advertDetailsConsultationItem = (AdvertDetailsConsultationItem) aVar;
        DevelopmentsAdviceView developmentsAdviceView = advertDetailsConsultationItem.f74631e;
        if (developmentsAdviceView.getEntryPointShowEvent() != null) {
            InterfaceC28130g0 interfaceC28130g0 = this.f74772b;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.f(developmentsAdviceView.getEntryPointShowEvent());
        } else {
            InterfaceC28130g0 interfaceC28130g02 = this.f74772b;
            if (interfaceC28130g02 == null) {
                interfaceC28130g02 = null;
            }
            ConsultationFormData consultationFormData = advertDetailsConsultationItem.f74632f;
            if (consultationFormData == null || (analyticsData = consultationFormData.getAnalyticsData()) == null || (fromPage = analyticsData.getFromPage()) == null) {
                fromPage = "item_consultation_form";
            }
            interfaceC28130g02.B0(advertDetailsConsultationItem.f74633g, fromPage, (consultationFormData == null || (phoneInput = consultationFormData.getPhoneInput()) == null) ? null : phoneInput.getData());
        }
        interfaceC28106l.b(developmentsAdviceView.getTitle());
        interfaceC28106l.j(developmentsAdviceView.getDescription());
        LandingInfo mainTextLink = developmentsAdviceView.getMainTextLink();
        String linkText = mainTextLink != null ? mainTextLink.getLinkText() : null;
        LandingInfo mainTextLink2 = developmentsAdviceView.getMainTextLink();
        interfaceC28106l.R9(new Landing(linkText, mainTextLink2 != null ? mainTextLink2.getUrl() : null), new C28098d(this));
        interfaceC28106l.sm(developmentsAdviceView.getButtonTitle(), developmentsAdviceView.getButtonStyle(), advertDetailsConsultationItem.f74634h ? Integer.valueOf(C28103i.f74774a) : null);
        interfaceC28106l.Tf(new C28099e(advertDetailsConsultationItem, this));
        interfaceC28106l.IZ(developmentsAdviceView.getIncomingLineButton(), new C28100f(this));
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28097c
    public final void s(@Y61.k InterfaceC28130g0 interfaceC28130g0) {
        this.f74772b = interfaceC28130g0;
    }
}
