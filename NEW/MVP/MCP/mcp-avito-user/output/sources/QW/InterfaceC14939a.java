package Qw;

import J81.e;
import J81.f;
import J81.k;
import J81.o;
import J81.s;
import J81.t;
import Rw.C15086a;
import Sw.C15246a;
import Tw.C15418a;
import Uw.C15576a;
import Vw.C15721a;
import Ww.C15803a;
import Xw.C17054a;
import Y61.l;
import Yw.C18340a;
import Zw.C19614a;
import ax.C24189a;
import bx.C25733a;
import com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy;
import com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import cx.C39430a;
import dx.C39813a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import ex.C40174a;
import fx.C40489a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DevelopmentsAgencySearchApi.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0015J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00192\b\b\u0001\u0010\u001f\u001a\u00020\u00192\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010$J,\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010%\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\u0015J,\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b)\u0010\u0015J,\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b+\u0010\u0015J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b-\u0010\u001dJ\\\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00062\b\b\u0001\u0010.\u001a\u00020\u00022\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b5\u00106Jâ\u0001\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0001\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bI\u0010JJî\u0001\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00062\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010>\u001a\u0004\u0018\u00010L2\n\b\u0001\u0010@\u001a\u0004\u0018\u00010M2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bO\u0010PJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u0006H§@¢\u0006\u0004\bR\u0010\f¨\u0006S"}, d2 = {"LQw/a;", "", "", "applicationId", "", "archived", "Lcom/avito/android/remote/model/TypedResult;", "LRw/a;", "a", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSw/a;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientID", "LTw/a;", "o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dealId", "notes", "LUw/a;", "h", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "LVw/a;", "b", "", SearchParamsConverterKt.LOCATION_ID, "LWw/a;", "f", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "page", "perPage", "query", "status", "LXw/a;", "l", "(JJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileId", "Lax/a;", "j", "LYw/a;", "k", "LZw/a;", "g", "Lbx/a;", "i", "clientId", "email", "firstName", "lastName", "middleName", "phone", "Lcx/a;", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", SearchParamsConverterKt.PRICE_MIN, SearchParamsConverterKt.PRICE_MAX, "limit", "countOnly", MetroParameter.TYPE, DistrictParameter.TYPE, "Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_developments_search_get/OrderBy;", "orderBy", "Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_developments_search_get/OrderDirection;", "orderDirection", "params", "", "nwLat", "nwLon", "seLat", "seLon", "clientMode", "Ldx/a;", "d", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_developments_search_get/OrderBy;Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_developments_search_get/OrderDirection;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obj", "Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_lots_search_get/OrderBy;", "Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_lots_search_get/OrderDirection;", "Lex/a;", "n", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_lots_search_get/OrderBy;Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_lots_search_get/OrderDirection;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfx/a;", "e", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Qw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC14939a {
    @o("1/mortgage-form/application/{applicationId}/set-archived")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@s("applicationId") @Y61.k String str, @J81.c("archived") boolean z12, @Y61.k Continuation<? super TypedResult<C15086a>> continuation);

    @o("1/nd-trx/deals/{dealId}/requests/viewed")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("dealId") @Y61.k String str, @l @t("key") String str2, @Y61.k Continuation<? super TypedResult<C15721a>> continuation);

    @o("1/nd-trx/chats/open")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@Y61.k Continuation<? super TypedResult<C15246a>> continuation);

    @f("2/nd-trx/developments/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@l @t("page") Long l12, @l @t(SearchParamsConverterKt.PRICE_MIN) Long l13, @l @t(SearchParamsConverterKt.PRICE_MAX) Long l14, @l @t("limit") Long l15, @l @t("countOnly") Boolean bool, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l16, @l @t(MetroParameter.TYPE) String str, @l @t(DistrictParameter.TYPE) String str2, @l @t("orderBy") OrderBy orderBy, @l @t("orderDirection") OrderDirection orderDirection, @l @t("params") String str3, @l @t("nwLat") Double d12, @l @t("nwLon") Double d13, @l @t("seLat") Double d14, @l @t("seLon") Double d15, @l @t("clientMode") String str4, @l @t("key") String str5, @Y61.k Continuation<? super TypedResult<C39813a>> continuation);

    @f("3/nd-trx/searchParams")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true", "X-Infm-Version-required: true"})
    @l
    Object e(@Y61.k Continuation<? super TypedResult<C40489a>> continuation);

    @f("1/nd-trx/locations/{locationId}/manager")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@s(SearchParamsConverterKt.LOCATION_ID) long j12, @Y61.k Continuation<? super TypedResult<C15803a>> continuation);

    @o("1/nd-trx/revenues/{dealId}/send")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@s("dealId") @Y61.k String str, @l @t("key") String str2, @Y61.k Continuation<? super TypedResult<C19614a>> continuation);

    @o("1/nd-trx/deals/{dealId}/notes/set")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object h(@s("dealId") @Y61.k String str, @J81.c("notes") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<C15576a>> continuation);

    @o("1/nd-trx/saveRecentLocation")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object i(@J81.c(SearchParamsConverterKt.LOCATION_ID) long j12, @Y61.k Continuation<? super TypedResult<C25733a>> continuation);

    @o("1/nd-trx/revenues/document/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object j(@l @t("key") String str, @J81.c("fileId") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<C24189a>> continuation);

    @o("1/nd-trx/revenues/{dealId}/request")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object k(@s("dealId") @Y61.k String str, @l @t("key") String str2, @Y61.k Continuation<? super TypedResult<C18340a>> continuation);

    @o("1/nd-trx/mortgage-list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object l(@J81.c("page") long j12, @J81.c("perPage") long j13, @J81.c("query") @Y61.k String str, @J81.c("status") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<C17054a>> continuation);

    @o("2/nd-trx/clients/{clientId}/update")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object m(@s("clientId") @Y61.k String str, @J81.c("email") @l String str2, @J81.c("firstName") @l String str3, @J81.c("lastName") @l String str4, @J81.c("middleName") @l String str5, @J81.c("phone") @l String str6, @Y61.k Continuation<? super TypedResult<C39430a>> continuation);

    @f("2/nd-trx/lots/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Infm-Version-required: true"})
    @l
    Object n(@l @t("obj") String str, @l @t("page") Long l12, @l @t(SearchParamsConverterKt.PRICE_MIN) Long l13, @l @t(SearchParamsConverterKt.PRICE_MAX) Long l14, @l @t("limit") Long l15, @l @t("countOnly") Boolean bool, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l16, @l @t(MetroParameter.TYPE) String str2, @l @t(DistrictParameter.TYPE) String str3, @l @t("orderBy") com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_lots_search_get.OrderBy orderBy, @l @t("orderDirection") com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_lots_search_get.OrderDirection orderDirection, @l @t("params") String str4, @l @t("nwLat") Double d12, @l @t("nwLon") Double d13, @l @t("seLat") Double d14, @l @t("seLon") Double d15, @l @t("clientMode") String str5, @l @t("key") String str6, @Y61.k Continuation<? super TypedResult<C40174a>> continuation);

    @o("1/nd-trx/clients/redirect-to-vdr")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object o(@J81.c("clientID") @l String str, @Y61.k Continuation<? super TypedResult<C15418a>> continuation);
}
