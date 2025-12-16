package bi0;

import J81.f;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import ci0.C27199a;
import com.avito.android.realty_agency.checkerboard_impl.generated.api.api_2_nd_trx_lots_search_get.OrderBy;
import com.avito.android.realty_agency.checkerboard_impl.generated.api.api_2_nd_trx_lots_search_get.OrderDirection;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import di0.C39731a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import ei0.C40110a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CheckerboardApi.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J~\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010Jt\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u0013\u0010\u0014Jî\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lbi0/a;", "", "", "buildingId", "sectionId", "", "params", SearchParamsConverterKt.PRICE_MIN, SearchParamsConverterKt.PRICE_MAX, SearchParamsConverterKt.LOCATION_ID, MetroParameter.TYPE, DistrictParameter.TYPE, "key", "Lcom/avito/android/remote/model/TypedResult;", "Lci0/a;", "a", "(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "developmentId", "Ldi0/a;", "b", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obj", "page", "limit", "", "countOnly", "Lcom/avito/android/realty_agency/checkerboard_impl/generated/api/api_2_nd_trx_lots_search_get/OrderBy;", "orderBy", "Lcom/avito/android/realty_agency/checkerboard_impl/generated/api/api_2_nd_trx_lots_search_get/OrderDirection;", "orderDirection", "", "nwLat", "nwLon", "seLat", "seLon", "clientMode", "Lei0/a;", "c", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/realty_agency/checkerboard_impl/generated/api/api_2_nd_trx_lots_search_get/OrderBy;Lcom/avito/android/realty_agency/checkerboard_impl/generated/api/api_2_nd_trx_lots_search_get/OrderDirection;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: bi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC25655a {
    @f("1/nd-trx/buildings/{buildingId}/sections/{sectionId}/checkerboard/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("buildingId") long j12, @s("sectionId") long j13, @l @t("params") String str, @l @t(SearchParamsConverterKt.PRICE_MIN) Long l12, @l @t(SearchParamsConverterKt.PRICE_MAX) Long l13, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l14, @l @t(MetroParameter.TYPE) String str2, @l @t(DistrictParameter.TYPE) String str3, @l @t("key") String str4, @k Continuation<? super TypedResult<C27199a>> continuation);

    @f("1/nd-trx/developments/{developmentId}/buildings")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("developmentId") long j12, @l @t("params") String str, @l @t(SearchParamsConverterKt.PRICE_MIN) Long l12, @l @t(SearchParamsConverterKt.PRICE_MAX) Long l13, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l14, @l @t(MetroParameter.TYPE) String str2, @l @t(DistrictParameter.TYPE) String str3, @l @t("key") String str4, @k Continuation<? super TypedResult<C39731a>> continuation);

    @f("2/nd-trx/lots/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Infm-Version-required: true"})
    @l
    Object c(@l @t("obj") String str, @l @t("page") Long l12, @l @t(SearchParamsConverterKt.PRICE_MIN) Long l13, @l @t(SearchParamsConverterKt.PRICE_MAX) Long l14, @l @t("limit") Long l15, @l @t("countOnly") Boolean bool, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l16, @l @t(MetroParameter.TYPE) String str2, @l @t(DistrictParameter.TYPE) String str3, @l @t("orderBy") OrderBy orderBy, @l @t("orderDirection") OrderDirection orderDirection, @l @t("params") String str4, @l @t("nwLat") Double d12, @l @t("nwLon") Double d13, @l @t("seLat") Double d14, @l @t("seLon") Double d15, @l @t("clientMode") String str5, @l @t("key") String str6, @k Continuation<? super TypedResult<C40110a>> continuation);
}
