package com.avito.android.user_stats;

import Y61.k;
import Y61.l;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.Split;
import fW0.p;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserStatsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/b;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {
    @k
    W a(@l List list);

    @k
    InterfaceC43160i b(@l ArrayList arrayList);

    @k
    InterfaceC43160i<ConstructorTabInternalAction> c(@l StatsConfig statsConfig);

    @k
    InterfaceC43160i<ConstructorTabInternalAction> d(@l StatsConfig statsConfig);

    @k
    InterfaceC43160i<ExpensesTabInternalAction> e(@k p pVar, @l StatsConfig statsConfig);

    @k
    InterfaceC43160i<ConstructorTabInternalAction> f(@l StatsConfig statsConfig);

    @k
    W g(@k p pVar);

    @k
    InterfaceC43160i<ConstructorTabInternalAction> h(@l StatsConfig statsConfig);

    @k
    InterfaceC43160i<ConstructorTabInternalAction> i(@l StatsConfig statsConfig, @k Split split);
}
