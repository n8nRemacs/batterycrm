package com.avito.android.serp.adapter.search_bar;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.suggest.SuggestResponse;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SearchBarItemInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/b;", "Lcom/avito/android/serp/adapter/search_bar/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.search_bar.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34823b implements InterfaceC34822a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f271621a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f271622b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SuggestParamsConverter f271623c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PresentationType f271624d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SearchParams f271625e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public String f271626f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public SearchParams f271627g;

    /* compiled from: SearchBarItemInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestResponse;", "it", "Lcom/avito/android/search/o;", "apply", "(Lcom/avito/android/remote/model/search/suggest/SuggestResponse;)Lcom/avito/android/search/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.search_bar.b$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f271628b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            SuggestResponse suggestResponse = (SuggestResponse) obj;
            return new com.avito.android.search.o(new com.avito.android.search.p(suggestResponse.getXSgt()), C42745f0.C(suggestResponse.getResult()));
        }
    }

    /* compiled from: SearchBarItemInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "it", "", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.search_bar.b$b, reason: collision with other inner class name */
    public static final class C8079b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C8079b<T, R> f271629b = new C8079b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Boolean.valueOf(((TypedResult) obj) instanceof TypedResult.Success);
        }
    }

    /* compiled from: SearchBarItemInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.search_bar.b$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f271630b = new c<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    @Inject
    public C34823b(@Y61.k h31.e<V0> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k SuggestParamsConverter suggestParamsConverter, @Y61.k PresentationType presentationType, @Y61.l SearchParams searchParams) {
        this.f271621a = eVar;
        this.f271622b = interfaceC35745a5;
        this.f271623c = suggestParamsConverter;
        this.f271624d = presentationType;
        this.f271625e = searchParams;
    }

    @Override // com.avito.android.search.m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> a(@Y61.k String str) {
        return this.f271621a.get().b(str).d0(C8079b.f271629b).m0(c.f271630b);
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34822a
    public final void b(@Y61.k String str) {
        this.f271626f = str;
    }

    @Override // com.avito.android.search.m
    @Y61.k
    public final io.reactivex.rxjava3.core.z c(@Y61.k String str, @Y61.k Map map, boolean z12) {
        Map<String, String> mapConvertToMap;
        SearchParams searchParams = this.f271627g;
        if (searchParams == null) {
            searchParams = this.f271625e;
        }
        SearchParams searchParams2 = searchParams;
        if (searchParams2 != null) {
            String locationId = this.f271626f;
            if (locationId == null) {
                locationId = searchParams2.getLocationId();
            }
            mapConvertToMap = this.f271623c.convertToMap(searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : locationId, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null), this.f271624d);
        } else {
            mapConvertToMap = null;
        }
        Map<String, String> map2 = mapConvertToMap;
        return map2 != null ? new io.reactivex.rxjava3.internal.operators.observable.F(new com.avito.android.mall.suggests.a(z12, this, str, map, map2, 1)).x0(this.f271622b.a()).d0(a.f271628b) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34822a
    public final void d(@Y61.k SearchParams searchParams) {
        this.f271627g = searchParams;
    }
}
