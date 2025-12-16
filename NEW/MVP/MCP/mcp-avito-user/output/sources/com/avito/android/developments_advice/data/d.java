package com.avito.android.developments_advice.data;

import Y61.k;
import Y61.l;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.FormCategory;
import com.avito.android.util.R0;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lw.InterfaceC43836a;
import ow.InterfaceC44946a;

/* compiled from: ConsultationFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/data/d;", "Lcom/avito/android/developments_advice/data/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44946a f135987a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f135988b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ConsultationFormData f135989c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f135990d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f135991e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f135992f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f135993g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f135994h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f135995i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC43836a f135996j;

    @Inject
    public d(@k InterfaceC44946a interfaceC44946a, @k R0 r02, @l ConsultationFormData consultationFormData, @l @Named("advert_id") String str, @l @Named("development_id") String str2, @l @Named("developer_id") String str3, @l @Named("development_offer_id") String str4, @l @Named("request_type") String str5, @l @Named("x_hash") String str6, @k InterfaceC43836a interfaceC43836a) {
        this.f135987a = interfaceC44946a;
        this.f135988b = r02;
        this.f135989c = consultationFormData;
        this.f135990d = str;
        this.f135991e = str2;
        this.f135992f = str3;
        this.f135993g = str4;
        this.f135994h = str5;
        this.f135995i = str6;
        this.f135996j = interfaceC43836a;
    }

    @Override // com.avito.android.developments_advice.data.a
    @l
    public final InterfaceC43160i a() {
        return C43175k.I(this.f135988b.a(), C43175k.G(new b(this, null)));
    }

    @Override // com.avito.android.developments_advice.data.a
    @l
    public final InterfaceC43160i b(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l CallInterval callInterval, @l String str6, @l String str7, @l String str8) {
        return C43175k.I(this.f135988b.a(), C43175k.G(new c(this, str, str2, str3, str4, str5, callInterval, str6, str7, str8, null)));
    }

    @Override // com.avito.android.developments_advice.data.a
    public final void c(@l String str) {
        AnalyticsData analyticsData;
        AnalyticsData analyticsData2;
        AnalyticsData analyticsData3;
        AnalyticsData analyticsData4;
        String marketingParams = null;
        ConsultationFormData consultationFormData = this.f135989c;
        if ((consultationFormData != null ? consultationFormData.getCategory() : null) != FormCategory.NewBuildings) {
            if ((consultationFormData != null ? consultationFormData.getCategory() : null) != null) {
                return;
            }
        }
        String locationId = (consultationFormData == null || (analyticsData4 = consultationFormData.getAnalyticsData()) == null) ? null : analyticsData4.getLocationId();
        String fromPage = (consultationFormData == null || (analyticsData3 = consultationFormData.getAnalyticsData()) == null) ? null : analyticsData3.getFromPage();
        String nodeType = (consultationFormData == null || (analyticsData2 = consultationFormData.getAnalyticsData()) == null) ? null : analyticsData2.getNodeType();
        if (consultationFormData != null && (analyticsData = consultationFormData.getAnalyticsData()) != null) {
            marketingParams = analyticsData.getMarketingParams();
        }
        this.f135996j.c(this.f135990d, this.f135991e, this.f135992f, locationId, fromPage, nodeType, this.f135994h, marketingParams, str);
    }

    public /* synthetic */ d(InterfaceC44946a interfaceC44946a, R0 r02, ConsultationFormData consultationFormData, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC43836a interfaceC43836a, int i12, C42822w c42822w) {
        this(interfaceC44946a, r02, (i12 & 4) != 0 ? null : consultationFormData, str, str2, str3, str4, str5, str6, interfaceC43836a);
    }
}
