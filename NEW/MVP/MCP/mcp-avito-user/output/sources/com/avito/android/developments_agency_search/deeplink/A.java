package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import rw.InterfaceC47923a;
import shark.AndroidResourceIdNames;

/* compiled from: RealtyAgencySearchLotsLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/A;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLotsLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A extends com.avito.android.deeplink_handler.handler.base.coroutines.a<RealtyAgencySearchLotsLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f136345g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f136346h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f136347i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47923a f136348j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Resources f136349k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f136350l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f136351m;

    @Inject
    public A(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC47923a interfaceC47923a, @Y61.k Resources resources, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k R0 r02) {
        super(r02);
        this.f136345g = interfaceC4053a;
        this.f136346h = gVar;
        this.f136347i = iVar;
        this.f136348j = interfaceC47923a;
        this.f136349k = resources;
        this.f136350l = interfaceC14939a;
        this.f136351m = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((RealtyAgencySearchLotsLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLotsLink r27, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.deeplink.A.o(com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLotsLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void p(RealtyAgencySearchLotsLink realtyAgencySearchLotsLink, RealtyAgencySearchArguments.MapArguments mapArguments) throws Resources.NotFoundException {
        String str = realtyAgencySearchLotsLink.f136390e;
        String string = realtyAgencySearchLotsLink.f136387b;
        if (string == null) {
            string = this.f136349k.getString(R.string.das_from_lot_to_search_result_default_toolbar_title);
        }
        SearchParams searchParams = realtyAgencySearchLotsLink.f136389d;
        this.f136345g.R(this.f136348j.b(new RealtyAgencySearchArguments(str, string, false, realtyAgencySearchLotsLink.f136388c, searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : "24", ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), Tab.f138451d, false, realtyAgencySearchLotsLink.f136391f, mapArguments, null)), com.avito.android.deeplink_handler.view.b.f134588l);
    }
}
