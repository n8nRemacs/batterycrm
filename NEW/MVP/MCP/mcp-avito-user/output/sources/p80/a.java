package P80;

import J81.f;
import J81.k;
import J81.t;
import Q80.d;
import Y61.l;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ActionType;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.SortDirection;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: StatsApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJX\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LP80/a;", "", "", "itemId", "", "period", "Lcom/avito/android/remote/model/TypedResult;", "LR80/c;", "b", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ActionType;", "actionType", SearchParamsConverterKt.SORT, "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortDirection;", "sortDirection", "LQ80/d;", "a", "(JLjava/lang/String;Ljava/lang/Long;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ActionType;Ljava/lang/String;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @f("1/search-position/period")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object a(@t("itemId") long j12, @t("period") @Y61.k String str, @l @t("offset") Long l12, @t("actionType") @Y61.k ActionType actionType, @l @t(SearchParamsConverterKt.SORT) String str2, @l @t("sortDirection") SortDirection sortDirection, @Y61.k Continuation<? super TypedResult<d>> continuation);

    @f("1/search-position")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object b(@t("itemId") long j12, @t("period") @Y61.k String str, @Y61.k Continuation<? super TypedResult<R80.c>> continuation);
}
