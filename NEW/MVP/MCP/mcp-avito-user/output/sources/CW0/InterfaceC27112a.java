package cW0;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.user_stats.model.extended_user_stats.StatsCommonExpenses;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicChart;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicItems;
import e30.InterfaceC39936a;
import fW0.f;
import fW0.h;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserStatsApi.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u00ad\u0001\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014Jî\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ¾\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001f\u0010 J¾\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b#\u0010 ¨\u0006$"}, d2 = {"LcW0/a;", "", "", "", "ids", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "LfW0/h;", "c", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "categories", "employees", "locations", "spaces", "group", "itemIds", "LfW0/f;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "metrics", "metricSort", "orderSort", "", "limit", "offset", "Lcom/avito/user_stats/model/extended_user_stats/StatsDynamicItems;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/user_stats/model/extended_user_stats/StatsDynamicChart;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spendings", "Lcom/avito/user_stats/model/extended_user_stats/StatsCommonExpenses;", "a", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: cW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC27112a {
    @o("7/sellers/private/statistics/general/spendings")
    @e
    @l
    Object a(@J81.c("dateFrom") @l String str, @J81.c("dateTo") @l String str2, @d @k Map<String, String> map, @d @k Map<String, String> map2, @d @k Map<String, String> map3, @d @k Map<String, String> map4, @d @k Map<String, String> map5, @J81.c("group") @l String str3, @d @k Map<String, String> map6, @k Continuation<? super TypedResult<StatsCommonExpenses>> continuation);

    @o("1/sellers/private/statistics/general/dynamics/items")
    @e
    @l
    Object b(@J81.c("dateFrom") @l String str, @J81.c("dateTo") @l String str2, @d @k Map<String, String> map, @d @k Map<String, String> map2, @d @k Map<String, String> map3, @d @k Map<String, String> map4, @d @k Map<String, String> map5, @J81.c("group") @l String str3, @J81.c("sort[metric]") @l String str4, @J81.c("sort[order]") @l String str5, @J81.c("limit") @l Integer num, @J81.c("offset") @l Integer num2, @d @k Map<String, String> map6, @k Continuation<? super TypedResult<StatsDynamicItems>> continuation);

    @o("2/sellers/private/statistics/general/config")
    @e
    @k
    I<TypedResult<h>> c(@d @k Map<String, String> ids);

    @o("1/sellers/private/statistics/general/dynamics/dates")
    @e
    @l
    Object d(@J81.c("dateFrom") @l String str, @J81.c("dateTo") @l String str2, @d @k Map<String, String> map, @d @k Map<String, String> map2, @d @k Map<String, String> map3, @d @k Map<String, String> map4, @d @k Map<String, String> map5, @J81.c("group") @l String str3, @d @k Map<String, String> map6, @k Continuation<? super TypedResult<StatsDynamicChart>> continuation);

    @o("7/sellers/private/statistics/general/basicIndicators")
    @e
    @k
    I<TypedResult<f>> e(@J81.c("dateFrom") @l String from, @J81.c("dateTo") @l String to2, @d @k Map<String, String> categories, @d @k Map<String, String> employees, @d @k Map<String, String> locations, @d @k Map<String, String> spaces, @J81.c("group") @l String group, @d @k Map<String, String> itemIds);
}
