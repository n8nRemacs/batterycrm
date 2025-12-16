package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SerpElementResult;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopmentXl;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: TabletDisplayTypeFallbackTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/TabletDisplayTypeFallbackTypeAdapterFactory;", "Lcom/google/gson/r;", "SearchParamsResultTypeAdapter", "SerpElementResultTypeAdapter", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabletDisplayTypeFallbackTypeAdapterFactory implements com.google.gson.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q f254250b;

    /* compiled from: TabletDisplayTypeFallbackTypeAdapterFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/TabletDisplayTypeFallbackTypeAdapterFactory$SearchParamsResultTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/SearchParameters;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchParamsResultTypeAdapter<T> extends TypeAdapter<SearchParameters> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final TypeAdapter<SearchParameters> f254251a;

        public SearchParamsResultTypeAdapter(@Y61.k Gson gson, @Y61.k TabletDisplayTypeFallbackTypeAdapterFactory tabletDisplayTypeFallbackTypeAdapterFactory, @Y61.k com.google.gson.reflect.a aVar) {
            this.f254251a = gson.h(tabletDisplayTypeFallbackTypeAdapterFactory, aVar);
        }

        @Override // com.google.gson.TypeAdapter
        public final SearchParameters read(com.google.gson.stream.a aVar) {
            SelectParameter.Displaying displaying;
            SearchParameters searchParameters = this.f254251a.read(aVar);
            if (searchParameters == null) {
                return null;
            }
            List<ParameterSlot> parameters = searchParameters.getParameters();
            ArrayList arrayList = new ArrayList();
            for (T t12 : parameters) {
                ParameterSlot parameterSlot = (ParameterSlot) t12;
                if (parameterSlot instanceof GroupParameter) {
                    List<ParameterSlot> parameters2 = ((GroupParameter) parameterSlot).getParameters();
                    if (parameters2 == null) {
                        parameters2 = C42784z0.f406748b;
                    }
                    ParameterSlot parameterSlot2 = parameters2.get(0);
                    SelectParameter selectParameter = parameterSlot2 instanceof SelectParameter ? (SelectParameter) parameterSlot2 : null;
                    if (kotlin.jvm.internal.L.f((selectParameter == null || (displaying = selectParameter.getDisplaying()) == null) ? null : displaying.getType(), "serpDisplayType")) {
                    }
                }
                arrayList.add(t12);
            }
            return SearchParameters.copy$default(searchParameters, arrayList, null, null, null, 14, null);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, SearchParameters searchParameters) {
            this.f254251a.write(cVar, searchParameters);
        }
    }

    /* compiled from: TabletDisplayTypeFallbackTypeAdapterFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/TabletDisplayTypeFallbackTypeAdapterFactory$SerpElementResultTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/SerpElementResult;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SerpElementResultTypeAdapter<T> extends TypeAdapter<SerpElementResult> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final TypeAdapter<SerpElementResult> f254252a;

        public SerpElementResultTypeAdapter(@Y61.k Gson gson, @Y61.k TabletDisplayTypeFallbackTypeAdapterFactory tabletDisplayTypeFallbackTypeAdapterFactory, @Y61.k com.google.gson.reflect.a aVar) {
            this.f254252a = gson.h(tabletDisplayTypeFallbackTypeAdapterFactory, aVar);
        }

        @Override // com.google.gson.TypeAdapter
        public final SerpElementResult read(com.google.gson.stream.a aVar) {
            SerpElement serpElement;
            List<SerpElement> elements;
            T next;
            SerpElementResult serpElementResult = this.f254252a.read(aVar);
            if (serpElementResult == null || (elements = serpElementResult.getElements()) == null) {
                serpElement = null;
            } else {
                Iterator<T> it = elements.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    SerpElement serpElement2 = (SerpElement) next;
                    if ((serpElement2 instanceof SerpDevelopment) || (serpElement2 instanceof SerpDevelopmentXl)) {
                        break;
                    }
                }
                serpElement = (SerpElement) next;
            }
            SerpDisplayType serpDisplayType = serpElement != null ? SerpDisplayType.List : SerpDisplayType.Grid;
            if (serpElementResult != null) {
                return serpElementResult.copy((67108847 & 1) != 0 ? serpElementResult.elements : null, (67108847 & 2) != 0 ? serpElementResult.count : 0L, (67108847 & 4) != 0 ? serpElementResult.lastStamp : 0L, (67108847 & 8) != 0 ? serpElementResult.subscriptionId : null, (67108847 & 16) != 0 ? serpElementResult.displayType : serpDisplayType, (67108847 & 32) != 0 ? serpElementResult.searchHint : null, (67108847 & 64) != 0 ? serpElementResult.xHash : null, (67108847 & 128) != 0 ? serpElementResult.firebaseParams : null, (67108847 & 256) != 0 ? serpElementResult.emptySearchText : null, (67108847 & 512) != 0 ? serpElementResult.emptySearchContent : null, (67108847 & 1024) != 0 ? serpElementResult.nextPageId : null, (67108847 & 2048) != 0 ? serpElementResult.searchDescription : null, (67108847 & 4096) != 0 ? serpElementResult.isSubscribed : null, (67108847 & 8192) != 0 ? serpElementResult.isVerticalMain : null, (67108847 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpElementResult.isCrossVertical : null, (67108847 & 32768) != 0 ? serpElementResult.shouldShowSaveSearch : null, (67108847 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? serpElementResult.onboarding : null, (67108847 & 131072) != 0 ? serpElementResult.verticalId : null, (67108847 & 262144) != 0 ? serpElementResult.uxFeedbackConfigs : null, (67108847 & 524288) != 0 ? serpElementResult.categoryDetails : null, (67108847 & 1048576) != 0 ? serpElementResult.onDisplayClickstreamDeeplink : null, (67108847 & 2097152) != 0 ? serpElementResult.navigationBarStyle : null, (67108847 & 4194304) != 0 ? serpElementResult.additionalButtons : null, (67108847 & 8388608) != 0 ? serpElementResult.newSerpMapInteraction : null, (67108847 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? serpElementResult.sharingButton : null, (67108847 & 33554432) != 0 ? serpElementResult.floatingContainer : null);
            }
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, SerpElementResult serpElementResult) {
            this.f254252a.write(cVar, serpElementResult);
        }
    }

    public TabletDisplayTypeFallbackTypeAdapterFactory(@Y61.k Q q12) {
        this.f254250b = q12;
    }

    @Override // com.google.gson.r
    @Y61.l
    public final <T> TypeAdapter<T> a(@Y61.k Gson gson, @Y61.k com.google.gson.reflect.a<T> aVar) {
        if (!this.f254250b.f254209a) {
            return null;
        }
        Class<? super T> rawType = aVar.getRawType();
        TypeAdapter<T> serpElementResultTypeAdapter = kotlin.jvm.internal.L.f(rawType, SerpElementResult.class) ? new SerpElementResultTypeAdapter<>(gson, this, aVar) : kotlin.jvm.internal.L.f(rawType, SearchParameters.class) ? new SearchParamsResultTypeAdapter<>(gson, this, aVar) : null;
        if (serpElementResultTypeAdapter != null) {
            return serpElementResultTypeAdapter;
        }
        return null;
    }
}
