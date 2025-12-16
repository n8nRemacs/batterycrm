package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PositionInSearchUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/l;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/j;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f221429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P80.a f221430b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f221431c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f221432d;

    @Inject
    public l(long j12, @Y61.k P80.a aVar, @Y61.k a aVar2, @Y61.k R0 r02) {
        this.f221429a = j12;
        this.f221430b = aVar;
        this.f221431c = aVar2;
        this.f221432d = r02;
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.j
    @Y61.k
    public final InterfaceC43160i a(@Y61.k PeriodType periodType, @Y61.k PositionInfoPeriodAction positionInfoPeriodAction) {
        return C43175k.I(this.f221432d.a(), C43175k.G(new k(this, periodType, positionInfoPeriodAction, null)));
    }
}
