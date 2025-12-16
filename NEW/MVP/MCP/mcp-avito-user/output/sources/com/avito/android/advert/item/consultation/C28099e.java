package com.avito.android.advert.item.consultation;

import android.view.View;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ConsultationFormData;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsConsultationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28099e extends kotlin.jvm.internal.N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsConsultationItem f74759l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28101g f74760m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28099e(AdvertDetailsConsultationItem advertDetailsConsultationItem, C28101g c28101g) {
        super(1);
        this.f74759l = advertDetailsConsultationItem;
        this.f74760m = c28101g;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        String fromPage;
        AnalyticsData analyticsData;
        AdvertDetailsConsultationItem advertDetailsConsultationItem = this.f74759l;
        DeepLink buttonUri = advertDetailsConsultationItem.f74631e.getButtonUri();
        C28101g c28101g = this.f74760m;
        if (buttonUri != null) {
            InterfaceC28130g0 interfaceC28130g0 = c28101g.f74772b;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.l0(advertDetailsConsultationItem.f74631e.getButtonUri(), null);
        } else {
            InterfaceC28130g0 interfaceC28130g02 = c28101g.f74772b;
            InterfaceC28130g0 interfaceC28130g03 = interfaceC28130g02 != null ? interfaceC28130g02 : null;
            ConsultationFormData consultationFormData = advertDetailsConsultationItem.f74632f;
            if (consultationFormData == null || (analyticsData = consultationFormData.getAnalyticsData()) == null || (fromPage = analyticsData.getFromPage()) == null) {
                fromPage = "item_consultation_form";
            }
            interfaceC28130g03.q1(consultationFormData, advertDetailsConsultationItem.f74633g, fromPage);
        }
        return G0.f406611a;
    }
}
