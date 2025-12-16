package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PositionInSearchBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.b<PositionInSearchInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.j f221496a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f221497b;

    @Inject
    public e(@Y61.k com.avito.android.position_in_search.stats.screen.position_in_search.domain.j jVar, @Y61.k String str) {
        this.f221496a = jVar;
        this.f221497b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PositionInSearchInternalAction> a() {
        PeriodType.f221444c.getClass();
        return this.f221496a.a(PeriodType.a.a(this.f221497b), PositionInfoPeriodAction.f221449b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
