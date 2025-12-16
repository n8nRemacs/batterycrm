package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: LocationGroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "filter", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.location_group.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31014c extends kotlin.jvm.internal.N implements Y41.p<Filter, InlineFilterValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31013b f171819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31014c(C31013b c31013b) {
        super(2);
        this.f171819l = c31013b;
    }

    @Override // Y41.p
    public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
        SearchParams searchParams;
        PresentationType presentationType;
        String str;
        SearchParams searchParams2;
        Filter filter2 = filter;
        InlineFilterValue inlineFilterValue2 = inlineFilterValue;
        InlineFilterValue value = filter2.getValue();
        C31013b c31013b = this.f171819l;
        if (value instanceof InlineFilterValue.InlineFilterLocationValue) {
            c31013b.f171786I = true;
        }
        CN.f fVar = c31013b.f171795k;
        if (fVar != null) {
            ItemsSearchLink itemsSearchLink = c31013b.f171781D;
            if (itemsSearchLink == null || (searchParams2 = itemsSearchLink.f133403b) == null) {
                searchParams2 = c31013b.f171779B;
            }
            fVar.o(searchParams2, filter2, inlineFilterValue2);
        }
        ItemsSearchLink itemsSearchLink2 = c31013b.f171781D;
        if (itemsSearchLink2 == null || (searchParams = itemsSearchLink2.f133403b) == null) {
            searchParams = c31013b.f171779B;
        }
        SearchParams searchParams3 = searchParams;
        if (itemsSearchLink2 == null || (presentationType = itemsSearchLink2.f133413l) == null) {
            presentationType = c31013b.f171796l;
        }
        PresentationType presentationType2 = presentationType;
        if (itemsSearchLink2 == null || (str = itemsSearchLink2.f133404c) == null) {
            str = c31013b.f171797m;
        }
        c31013b.g(filter2, inlineFilterValue2, searchParams3, presentationType2, str);
        InlineFilterValue.InlineFilterSuggestLocationValue inlineFilterSuggestLocationValue = inlineFilterValue2 instanceof InlineFilterValue.InlineFilterSuggestLocationValue ? (InlineFilterValue.InlineFilterSuggestLocationValue) inlineFilterValue2 : null;
        if (inlineFilterSuggestLocationValue != null) {
            StringBuilder sb2 = new StringBuilder();
            String internalId = inlineFilterSuggestLocationValue.getInternalId();
            if (internalId == null) {
                internalId = "";
            }
            sb2.append(internalId);
            sb2.append('_');
            sb2.append(inlineFilterSuggestLocationValue.getSuggestLocationId());
            String string = sb2.toString();
            ItemsSearchLink itemsSearchLink3 = c31013b.f171781D;
            c31013b.f171781D = itemsSearchLink3 != null ? ItemsSearchLink.a(itemsSearchLink3, null, null, null, string, 131071) : null;
            SearchParams searchParams4 = c31013b.f171779B;
            c31013b.f171779B = searchParams4 != null ? searchParams4.copy(((-1234173943) & 1) != 0 ? searchParams4.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams4.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams4.locationId : null, ((-1234173943) & 8) != 0 ? searchParams4.suggestLocationId : string, ((-1234173943) & 16) != 0 ? searchParams4.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams4.directionId : null, ((-1234173943) & 64) != 0 ? searchParams4.districtId : null, ((-1234173943) & 128) != 0 ? searchParams4.params : null, ((-1234173943) & 256) != 0 ? searchParams4.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams4.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams4.query : null, ((-1234173943) & 2048) != 0 ? searchParams4.title : null, ((-1234173943) & 4096) != 0 ? searchParams4.owner : null, ((-1234173943) & 8192) != 0 ? searchParams4.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams4.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams4.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams4.radius : null, ((-1234173943) & 131072) != 0 ? searchParams4.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams4.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams4.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams4.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams4.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams4.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams4.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams4.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams4.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams4.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams4.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams4.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams4.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams4.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams4.clarifyIconType : null, (0 & 1) != 0 ? searchParams4.drawId : null) : null;
        }
        return G0.f406611a;
    }
}
