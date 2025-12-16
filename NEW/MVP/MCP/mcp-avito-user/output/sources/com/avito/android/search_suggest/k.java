package com.avito.android.search_suggest;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SuggestParamsConverter;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.rx3.y;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SearchSuggestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/k;", "Lcom/avito/android/search_suggest/g;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f264243a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SuggestParamsConverter f264244b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f264245c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchSuggestArguments f264246d;

    @Inject
    public k(@Y61.k h31.e<V0> eVar, @Y61.k SuggestParamsConverter suggestParamsConverter, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k SearchSuggestArguments searchSuggestArguments) {
        this.f264243a = eVar;
        this.f264244b = suggestParamsConverter;
        this.f264245c = searchParamsConverter;
        this.f264246d = searchSuggestArguments;
    }

    @Override // com.avito.android.search_suggest.g
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k Map map, boolean z12) {
        SearchSuggestArguments searchSuggestArguments = this.f264246d;
        SearchParams searchParams = searchSuggestArguments.f264107d;
        SuggestParamsConverter suggestParamsConverter = this.f264244b;
        PresentationType presentationType = searchSuggestArguments.f264108e;
        Map<String, String> mapConvertToMap = suggestParamsConverter.convertToMap(searchParams, presentationType);
        V0 v02 = this.f264243a.get();
        String parameterValue = PresentationTypeKt.toParameterValue(presentationType);
        if (parameterValue == null) {
            parameterValue = "";
        }
        String str2 = parameterValue;
        Boolean boolBoxBoolean = Boxing.boxBoolean(z12);
        if (!boolBoxBoolean.booleanValue()) {
            boolBoxBoolean = null;
        }
        return y.a(v02.p(str, str2, boolBoxBoolean, map, mapConvertToMap).m0(h.f264233b).d0(i.f264234b));
    }

    @Override // com.avito.android.search_suggest.g
    @Y61.l
    public final Object b(@Y61.k String str) {
        return C43175k.G(new j(this, str, null));
    }

    @Override // com.avito.android.search_suggest.g
    @Y61.l
    public final Object c(@Y61.k String str, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l Boolean bool) {
        return y.a(this.f264243a.get().i(Boxing.boxBoolean(false), null, str2, bool, SearchParamsConverter.DefaultImpls.convertToMap$default(this.f264245c, searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : str, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), null, false, presentationType, 6, null)));
    }
}
