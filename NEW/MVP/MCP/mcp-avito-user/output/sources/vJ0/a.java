package VJ0;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post.SortOrder;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.Split;
import com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.Group;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserStatsApi.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JÆ\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015JÒ\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00162\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ¢\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001f\u0010 J(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00122\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H§@¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LVJ0/a;", "", "", "", "categories", "", "dateFrom", "dateTo", "employees", "itemIDs", "limit", "locations", "metrics", "offset", "sortMetric", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/SortOrder;", "sortOrder", "spaces", "Lcom/avito/android/remote/model/TypedResult;", "LWJ0/a;", "c", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/SortOrder;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/SortOrder;", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/Split;", "split", "LXJ0/a;", "d", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/SortOrder;Ljava/util/List;Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/Split;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/user_stats/generated/api/api_2_sellers_private_statistics_general_dynamics_dates_post/Group;", "group", "LYJ0/a;", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/user_stats/generated/api/api_2_sellers_private_statistics_general_dynamics_dates_post/Group;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZJ0/a;", "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes5.dex */
public interface a {
    @o("2/sellers/private/statistics/general/dynamics/dates")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("categories") @l List<Long> list, @J81.c("dateFrom") @k String str, @J81.c("dateTo") @k String str2, @J81.c("employees") @l List<Long> list2, @J81.c("group") @l Group group, @J81.c("itemIDs") @l List<Long> list3, @J81.c("locations") @l List<Long> list4, @J81.c("metrics") @l List<String> list5, @J81.c("spaces") @l List<String> list6, @k Continuation<? super TypedResult<YJ0.a>> continuation);

    @o("3/sellers/private/statistics/general/config")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @J81.k({"X-Employeemode-required: true"})
    @l
    Object b(@J81.c("itemIDs") @l List<Long> list, @k Continuation<? super TypedResult<ZJ0.a>> continuation);

    @o("1/sellers/private/statistics/general/dynamics/categories")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object c(@J81.c("categories") @l List<Long> list, @J81.c("dateFrom") @k String str, @J81.c("dateTo") @k String str2, @J81.c("employees") @l List<Long> list2, @J81.c("itemIDs") @l List<Long> list3, @J81.c("limit") @l Long l12, @J81.c("locations") @l List<Long> list4, @J81.c("metrics") @l List<String> list5, @J81.c("offset") @l Long l13, @J81.c("sortMetric") @l String str3, @J81.c("sortOrder") @l SortOrder sortOrder, @J81.c("spaces") @l List<String> list6, @k Continuation<? super TypedResult<WJ0.a>> continuation);

    @o("1/sellers/private/statistics/general/dynamics/locations")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@J81.c("categories") @l List<Long> list, @J81.c("dateFrom") @k String str, @J81.c("dateTo") @k String str2, @J81.c("employees") @l List<Long> list2, @J81.c("itemIDs") @l List<Long> list3, @J81.c("limit") @l Long l12, @J81.c("locations") @l List<Long> list4, @J81.c("metrics") @l List<String> list5, @J81.c("offset") @l Long l13, @J81.c("sortMetric") @l String str3, @J81.c("sortOrder") @l com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.SortOrder sortOrder, @J81.c("spaces") @l List<String> list6, @J81.c("split") @l Split split, @k Continuation<? super TypedResult<XJ0.a>> continuation);
}
