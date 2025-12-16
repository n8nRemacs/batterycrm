package com.avito.android.search;

import Hq0.C14021c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.F;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;
import ur.InterfaceC49101b;

/* compiled from: SearchDeepLinkInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/j;", "Lcom/avito/android/search/h;", "_avito_search_search-base_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f263821a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f263822b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f263823c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f263824d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x f263825e;

    @Inject
    public j(@Y61.k h31.e<V0> eVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k x xVar) {
        this.f263821a = eVar;
        this.f263822b = searchParamsConverter;
        this.f263823c = interfaceC35745a5;
        this.f263824d = interfaceC49101b;
        this.f263825e = xVar;
    }

    @Override // com.avito.android.search.h
    @Y61.k
    public final z c(@Y61.k String str, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l Boolean bool) {
        return new F(new C14021c(6, str2, this, bool, SearchParamsConverter.DefaultImpls.convertToMap$default(this.f263822b, searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : str, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), null, false, presentationType, 6, null))).d0(new i(this, str)).x0(this.f263823c.a());
    }
}
