package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.consultation.AdvertDetailsConsultationItem;
import com.avito.android.advert.item.consultation.ConsultationButtonItem;
import com.avito.android.advert.item.consultation.dynamic_content.DynamicConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.secondary.SecondaryConsultationItem;
import com.avito.android.advert.item.realty_quiz_banner.RealtyQuizBannerItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.advert_details.realty.ContactBarButtonData;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceKt;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceView;
import com.avito.android.remote.model.advert_details.realty.QiuzPromo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsConsultationItemsFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/v0;", "Lcom/avito/android/advert/item/blocks/items_factories/u0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.v0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28063v0 implements InterfaceC28057u0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74040a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.realty_quiz_banner.k f74041b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f74042c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C29640d f74043d;

    @Inject
    public C28063v0(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert.item.realty_quiz_banner.k kVar, @Y61.k InterfaceC28240u interfaceC28240u, @Y61.k C29640d c29640d) {
        this.f74040a = jVar;
        this.f74041b = kVar;
        this.f74042c = interfaceC28240u;
        this.f74043d = c29640d;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0
    @Y61.l
    public final ConsultationButtonItem a(@Y61.k AdvertDetails advertDetails) {
        DevelopmentsAdviceView developmentsAdviceView;
        DevelopmentsAdviceView form;
        DevelopmentsAdvice developmentsAdvice = advertDetails.getDevelopmentsAdvice();
        if (!(developmentsAdvice != null ? kotlin.jvm.internal.L.f(developmentsAdvice.getShouldShowInContactBar(), Boolean.TRUE) : false) || advertDetails.isRedesign()) {
            return null;
        }
        DevelopmentsAdvice developmentsAdvice2 = advertDetails.getDevelopmentsAdvice();
        if (developmentsAdvice2 == null || (developmentsAdviceView = developmentsAdvice2.getForm()) == null) {
            InterfaceC28240u interfaceC28240u = this.f74042c;
            developmentsAdviceView = new DevelopmentsAdviceView(interfaceC28240u.p(), interfaceC28240u.e(), interfaceC28240u.n(), null, null, null, null, null, null, 504, null);
        }
        int iA2 = this.f74040a.a();
        DevelopmentsAdvice developmentsAdvice3 = advertDetails.getDevelopmentsAdvice();
        String contactBarButtonTitle = developmentsAdvice3 != null ? developmentsAdvice3.getContactBarButtonTitle() : null;
        DevelopmentsAdvice developmentsAdvice4 = advertDetails.getDevelopmentsAdvice();
        ContactBarButtonData contactBarButton = (developmentsAdvice4 == null || (form = developmentsAdvice4.getForm()) == null) ? null : form.getContactBarButton();
        ConsultationFormData consultationFormData = DevelopmentsAdviceKt.toConsultationFormData(developmentsAdviceView, new AnalyticsData(advertDetails.getLocationId(), "item_contact_block", null, null, 12, null));
        DevelopmentsAdvice developmentsAdvice5 = advertDetails.getDevelopmentsAdvice();
        return new ConsultationButtonItem(0L, null, iA2, contactBarButtonTitle, consultationFormData, contactBarButton, developmentsAdvice5 != null ? developmentsAdvice5.getRequestType() : null, 3, null);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0
    @Y61.l
    public final AdvertDetailsConsultationItem b(@Y61.k AdvertDetails advertDetails) {
        DevelopmentsAdviceView teaser;
        DevelopmentsAdvice developmentsAdvice;
        DevelopmentsAdviceView form;
        DevelopmentsAdvice developmentsAdvice2 = advertDetails.getDevelopmentsAdvice();
        com.avito.android.advert.item.similars.j jVar = this.f74040a;
        if (developmentsAdvice2 == null) {
            if (!advertDetails.getShouldShowDevelopmentsAdvice()) {
                return null;
            }
            int iA2 = jVar.a();
            InterfaceC28240u interfaceC28240u = this.f74042c;
            return new AdvertDetailsConsultationItem(0L, null, iA2, new DevelopmentsAdviceView(interfaceC28240u.p(), interfaceC28240u.e(), interfaceC28240u.n(), null, null, null, null, null, null, 504, null), null, null, advertDetails.isRedesign(), null, null, 435, null);
        }
        DevelopmentsAdvice developmentsAdvice3 = advertDetails.getDevelopmentsAdvice();
        if (developmentsAdvice3 == null || (teaser = developmentsAdvice3.getTeaser()) == null || (developmentsAdvice = advertDetails.getDevelopmentsAdvice()) == null || (form = developmentsAdvice.getForm()) == null) {
            return null;
        }
        DevelopmentsAdvice developmentsAdvice4 = advertDetails.getDevelopmentsAdvice();
        if (developmentsAdvice4 != null ? kotlin.jvm.internal.L.f(developmentsAdvice4.getShouldShowInBody(), Boolean.TRUE) : false) {
            return new AdvertDetailsConsultationItem(0L, null, jVar.a(), teaser, DevelopmentsAdviceKt.toConsultationFormData(form, new AnalyticsData(advertDetails.getLocationId(), "item_consultation_form", null, null, 12, null)), null, advertDetails.isRedesign(), null, null, 419, null);
        }
        return null;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0
    @Y61.l
    public final SecondaryConsultationItem c(@Y61.k AdvertDetails advertDetails) {
        C29640d c29640d = this.f74043d;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[2];
        if (!((Boolean) c29640d.f132201d.a().invoke()).booleanValue()) {
            return null;
        }
        DevelopmentsAdvice developmentsAdvice = advertDetails.getDevelopmentsAdvice();
        if ((developmentsAdvice != null ? developmentsAdvice.getNonNdForm() : null) == null) {
            return null;
        }
        int iA2 = this.f74040a.a();
        DevelopmentsAdvice developmentsAdvice2 = advertDetails.getDevelopmentsAdvice();
        return new SecondaryConsultationItem(0L, null, iA2, developmentsAdvice2 != null ? developmentsAdvice2.getNonNdForm() : null, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem d(@Y61.k com.avito.android.remote.model.AdvertDetails r15) {
        /*
            r14 = this;
            com.avito.android.d r0 = r14.f74043d
            r0.getClass()
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.C29640d.f132175X
            r2 = 2
            r2 = r1[r2]
            com.avito.android.A0$a r2 = r0.f132201d
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 != 0) goto L1e
            return r3
        L1e:
            com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice r2 = r15.getDevelopmentsAdvice()
            if (r2 == 0) goto L29
            com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker r2 = r2.getConsultationAfterIceBreaker()
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r2 == 0) goto Lb7
            com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem r2 = new com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem
            com.avito.android.advert.item.similars.j r4 = r14.f74040a
            int r8 = r4.a()
            com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice r4 = r15.getDevelopmentsAdvice()
            if (r4 == 0) goto L40
            com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker r4 = r4.getConsultationAfterIceBreaker()
            r9 = r4
            goto L41
        L40:
            r9 = r3
        L41:
            r4 = 3
            r1 = r1[r4]
            com.avito.android.A0$a r0 = r0.f132202e
            DE0.a r0 = r0.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La7
            com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice r0 = r15.getDevelopmentsAdvice()
            if (r0 == 0) goto L67
            com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker r0 = r0.getConsultationAfterIceBreaker()
            if (r0 == 0) goto L67
            com.avito.android.remote.model.advert_details.realty.SuperFormInfo r0 = r0.getInfo()
            goto L68
        L67:
            r0 = r3
        L68:
            if (r0 != 0) goto La4
            com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice r0 = r15.getDevelopmentsAdvice()
            if (r0 == 0) goto L7b
            com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker r0 = r0.getConsultationAfterIceBreaker()
            if (r0 == 0) goto L7b
            com.avito.android.remote.model.advert_details.realty.SuperFormInfo r0 = r0.getInfoV2()
            goto L7c
        L7b:
            r0 = r3
        L7c:
            if (r0 != 0) goto La4
            com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice r0 = r15.getDevelopmentsAdvice()
            if (r0 == 0) goto L8f
            com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker r0 = r0.getConsultationAfterIceBreaker()
            if (r0 == 0) goto L8f
            com.avito.android.remote.model.advert_details.realty.SuperFormInfo r0 = r0.getInfoV3()
            goto L90
        L8f:
            r0 = r3
        L90:
            if (r0 != 0) goto La4
            com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice r0 = r15.getDevelopmentsAdvice()
            if (r0 == 0) goto La2
            com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker r0 = r0.getConsultationAfterIceBreaker()
            if (r0 == 0) goto La2
            com.avito.android.remote.model.advert_details.realty.SuperFormV4 r3 = r0.getInfoV4()
        La2:
            if (r3 == 0) goto La7
        La4:
            r0 = 1
        La5:
            r10 = r0
            goto La9
        La7:
            r0 = 0
            goto La5
        La9:
            boolean r11 = r15.isRedesign()
            r5 = 0
            r7 = 0
            r12 = 3
            r13 = 0
            r4 = r2
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13)
            r3 = r2
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.C28063v0.d(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem");
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0
    @Y61.l
    public final RealtyQuizBannerItem e(@Y61.k AdvertDetails advertDetails) {
        QiuzPromo quizPromo;
        String description;
        ButtonAction positiveButton;
        String title;
        ButtonAction negativeButton;
        String title2;
        ButtonAction positiveButton2;
        DeepLink deeplink;
        ButtonAction negativeButton2;
        DeepLink deeplink2;
        DeepLink closeDeeplink;
        DevelopmentsAdvice developmentsAdvice = advertDetails.getDevelopmentsAdvice();
        if (developmentsAdvice == null || (quizPromo = developmentsAdvice.getQuizPromo()) == null) {
            return null;
        }
        int iA2 = this.f74040a.a();
        String title3 = quizPromo.getTitle();
        if (title3 == null || (description = quizPromo.getDescription()) == null || (positiveButton = quizPromo.getPositiveButton()) == null || (title = positiveButton.getTitle()) == null || (negativeButton = quizPromo.getNegativeButton()) == null || (title2 = negativeButton.getTitle()) == null || (positiveButton2 = quizPromo.getPositiveButton()) == null || (deeplink = positiveButton2.getDeeplink()) == null || (negativeButton2 = quizPromo.getNegativeButton()) == null || (deeplink2 = negativeButton2.getDeeplink()) == null || (closeDeeplink = quizPromo.getCloseDeeplink()) == null) {
            return null;
        }
        RealtyQuizBannerItem realtyQuizBannerItem = new RealtyQuizBannerItem(iA2, title3, description, title, deeplink, title2, deeplink2, closeDeeplink);
        if (!this.f74041b.a()) {
            return null;
        }
        C29640d c29640d = this.f74043d;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[18];
        if (((Boolean) c29640d.f132216s.a().invoke()).booleanValue()) {
            return realtyQuizBannerItem;
        }
        return null;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0
    @Y61.l
    public final DynamicConsultationAfterIceBreakersItem f(@Y61.k AdvertDetails advertDetails) {
        C29640d c29640d = this.f74043d;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[2];
        if (!((Boolean) c29640d.f132201d.a().invoke()).booleanValue()) {
            return null;
        }
        DevelopmentsAdvice developmentsAdvice = advertDetails.getDevelopmentsAdvice();
        if ((developmentsAdvice != null ? developmentsAdvice.getTeaserBanner() : null) == null) {
            return null;
        }
        int iA2 = this.f74040a.a();
        DevelopmentsAdvice developmentsAdvice2 = advertDetails.getDevelopmentsAdvice();
        return new DynamicConsultationAfterIceBreakersItem(0L, null, iA2, developmentsAdvice2 != null ? developmentsAdvice2.getTeaserBanner() : null, 3, null);
    }
}
