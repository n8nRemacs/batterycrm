package com.avito.android.realty_agency.beduin;

import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.huawei.hms.framework.common.ContainerUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BeduinScreensDeeplinkFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nB\t\b\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/realty_agency/beduin/a;", "Lcom/avito/android/realty_agency/beduin/c;", "Lcom/avito/android/realty_agency/beduin/e;", "Lcom/avito/android/realty_agency/beduin/g;", "Lcom/avito/android/realty_agency/beduin/i;", "Lcom/avito/android/realty_agency/beduin/k;", "Lcom/avito/android/realty_agency/beduin/m;", "Lcom/avito/android/realty_agency/beduin/o;", "Lcom/avito/android/realty_agency/beduin/q;", "Lcom/avito/android/realty_agency/beduin/s;", "Lcom/avito/android/realty_agency/beduin/u;", "<init>", "()V", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements c, e, g, i, k, m, o, q, s, u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f250871a = new d();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f250872b = new f();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f250873c = new h();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f250874d = new j();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f250875e = new l();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f250876f = new n();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f250877g = new p();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f250878h = new r();

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f250879i = new t();

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f250880j = new v();

    @Inject
    public a() {
    }

    @Y61.k
    public final DeepLink a(long j12, @Y61.l String str) {
        this.f250871a.getClass();
        String strR = "api/1/nd-trx/booking/form/" + j12;
        if (str != null) {
            strR = androidx.appcompat.app.r.r(strR + '?', "clientId=", str);
        }
        return new BeduinV2BottomSheetDeepLink(strR, "ndtrxBooking", "max", false, null, null, null, null, false, 496, null);
    }

    @Y61.k
    public final DeepLink b(@Y61.k DevelopmentCardParentScreen developmentCardParentScreen, long j12, @Y61.l String str) {
        this.f250872b.getClass();
        StringBuilder sb2 = new StringBuilder(C43066x.a0("api/1/nd-trx/developments/{developmentId}/form/", "{developmentId}", String.valueOf(j12), false));
        sb2.append("?");
        sb2.append("parentScreen=".concat(developmentCardParentScreen.f250849b));
        if (str != null) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
            sb2.append("clientId=".concat(str));
        }
        return new BeduinV2PageDeepLink(sb2.toString(), "RealtyAgencyDevelopmentCard", false, false, false, null, null, null, false, 480, null);
    }

    @Y61.k
    public final DeepLink c(long j12, @Y61.l String str) {
        this.f250873c.getClass();
        String strR = "api/1/nd-trx/fixation/form/" + j12;
        if (str != null) {
            strR = androidx.appcompat.app.r.r(strR + '?', "clientId=", str);
        }
        return new BeduinV2BottomSheetDeepLink(strR, "ndtrxFixation", "max", false, null, null, null, null, false, 496, null);
    }

    @Y61.k
    public final DeepLink d(@Y61.k LotCardParentScreen lotCardParentScreen, long j12, @Y61.l String str) {
        this.f250874d.getClass();
        StringBuilder sb2 = new StringBuilder(C43066x.a0("api/1/nd-trx/lots/{lotId}/form/", "{lotId}", String.valueOf(j12), false));
        sb2.append("?");
        sb2.append("parentScreen=".concat(lotCardParentScreen.f250854b));
        if (str != null) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
            sb2.append("clientId=".concat(str));
        }
        return new BeduinV2PageDeepLink(sb2.toString(), "RealtyAgencyLotCard", false, false, false, null, null, null, false, 480, null);
    }

    @Y61.k
    public final DeepLink e(long j12, @Y61.l String str) {
        SelectionClientPickerParentScreen[] selectionClientPickerParentScreenArr = SelectionClientPickerParentScreen.f250857b;
        this.f250876f.getClass();
        StringBuilder sb2 = new StringBuilder(C43066x.a0("api/1/nd-trx/lots/{lotId}/selections/form/creation", "{lotId}", String.valueOf(j12), false));
        sb2.append("?parentScreen=prof_search");
        if (str != null) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
            sb2.append("clientId=".concat(str));
        }
        return new BeduinV2BottomSheetDeepLink(sb2.toString(), "RealtyAgencyNewSelection", "fit", false, null, null, null, null, false, 496, null);
    }

    @Y61.k
    public final DeepLink f(@Y61.k SelectionItemParentScreen selectionItemParentScreen, @Y61.k String str) {
        this.f250877g.getClass();
        StringBuilder sbZ = androidx.appcompat.app.r.z(C43066x.a0("api/1/nd-trx/selections/{selectionId}/form", "{selectionId}", str, false).concat("?"), "parentScreen=");
        sbZ.append(selectionItemParentScreen.f250863b);
        return new BeduinV2PageDeepLink(sbZ.toString(), "RealtyAgencySelection", false, false, false, null, null, null, false, 480, null);
    }

    @Y61.k
    public final DeepLink g(@Y61.k TariffCardParentScreen tariffCardParentScreen, @Y61.l String str) {
        this.f250880j.getClass();
        String strConcat = "api/1/nd-trx/commission-history/form/developers?parentScreen=".concat(tariffCardParentScreen.f250870b);
        if (str != null) {
            strConcat = androidx.appcompat.app.r.r(strConcat + '&', "locationId=", str);
        }
        return new BeduinV2PageDeepLink(strConcat, "RealtyAgencyCommissionHistoryMain", false, false, false, null, null, null, false, 480, null);
    }
}
