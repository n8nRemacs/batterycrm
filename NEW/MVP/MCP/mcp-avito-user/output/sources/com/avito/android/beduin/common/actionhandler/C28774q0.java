package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinOpenSearchFiltersAction;
import com.avito.android.beduin.common.action.BeduinOpenSearchFiltersModel;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.displaying.FalseDisplayingPredicate;
import com.avito.android.beduin.common.displaying.TrueDisplayingPredicate;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ParameterTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import lj.InterfaceC43779a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: BeduinOpenSearchFiltersActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ItemsSearchLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/ItemsSearchLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.actionhandler.q0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28774q0 extends kotlin.jvm.internal.N implements Y41.l<ItemsSearchLink, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28775r0 f100363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinOpenSearchFiltersAction f100364m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28774q0(C28775r0 c28775r0, BeduinOpenSearchFiltersAction beduinOpenSearchFiltersAction) {
        super(1);
        this.f100363l = c28775r0;
        this.f100364m = beduinOpenSearchFiltersAction;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ItemsSearchLink itemsSearchLink) {
        InterfaceC43779a interfaceC43779a;
        ItemsSearchLink itemsSearchLink2 = itemsSearchLink;
        C28775r0 c28775r0 = this.f100363l;
        SearchParams searchParamsCopy = itemsSearchLink2.f133403b;
        if (searchParamsCopy.getCategoryId() == null) {
            SearchParams searchParams = itemsSearchLink2.f133403b;
            searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : "0", ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
        }
        BeduinOpenSearchFiltersAction beduinOpenSearchFiltersAction = this.f100364m;
        BeduinOpenSearchFiltersModel resultParametersPayload = beduinOpenSearchFiltersAction.getResultParametersPayload();
        com.avito.android.beduin.common.form.store.b bVar = c28775r0.f100370c;
        if (resultParametersPayload != null && (interfaceC43779a = bVar.get(resultParametersPayload.getTargetFormId())) != null) {
            String modelId = resultParametersPayload.getModelId();
            LinkedHashMap linkedHashMap = new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(c28775r0.f100371d, searchParamsCopy, null, false, null, 14, null));
            SerpDisplayType displayType = searchParamsCopy.getDisplayType();
            if (displayType != null) {
                linkedHashMap.put("displayType", SerpDisplayTypeKt.toParameterValue(displayType));
            }
            com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a, modelId, new ParameterTransform("search_filters", linkedHashMap), new ParameterTransform("search_categoryId", searchParamsCopy.getCategoryId()));
        }
        BeduinOpenSearchFiltersModel countDisplayingModel = beduinOpenSearchFiltersAction.getCountDisplayingModel();
        if (countDisplayingModel != null) {
            int i12 = !C42745f0.r(C28777s0.f100379a, searchParamsCopy.getCategoryId()) ? 1 : 0;
            if (searchParamsCopy.getDistrictId() != null && (!r8.isEmpty())) {
                i12++;
            }
            if (searchParamsCopy.getDirectionId() != null && (!r8.isEmpty())) {
                i12++;
            }
            if (searchParamsCopy.getMetroIds() != null && (!r8.isEmpty())) {
                i12++;
            }
            String searchRadius = searchParamsCopy.getSearchRadius();
            if (searchRadius != null && searchRadius.length() != 0) {
                i12++;
            }
            if (kotlin.jvm.internal.L.f(searchParamsCopy.getWithDeliveryOnly(), Boolean.TRUE)) {
                i12++;
            }
            if (searchParamsCopy.getOwner() != null && (!r8.isEmpty())) {
                i12++;
            }
            if (searchParamsCopy.getPriceMin() != null || searchParamsCopy.getPriceMax() != null) {
                i12++;
            }
            Map<String, SearchParam<?>> params = searchParamsCopy.getParams();
            int size = i12 + (params != null ? params.size() : 0);
            InterfaceC43779a interfaceC43779a2 = bVar.get(countDisplayingModel.getTargetFormId());
            if (interfaceC43779a2 != null) {
                com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a2, countDisplayingModel.getModelId(), new DisplayPredicateTransform(size > 0 ? TrueDisplayingPredicate.INSTANCE : FalseDisplayingPredicate.INSTANCE));
                if (size > 0) {
                    com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a2, countDisplayingModel.getModelId(), new TextTransform(String.valueOf(size)));
                }
            }
        }
        List<BeduinAction> onSelectedActions = beduinOpenSearchFiltersAction.getOnSelectedActions();
        if (onSelectedActions != null) {
            Iterator<T> it = onSelectedActions.iterator();
            while (it.hasNext()) {
                c28775r0.f100372e.get().o((BeduinAction) it.next());
            }
        }
        return kotlin.G0.f406611a;
    }
}
