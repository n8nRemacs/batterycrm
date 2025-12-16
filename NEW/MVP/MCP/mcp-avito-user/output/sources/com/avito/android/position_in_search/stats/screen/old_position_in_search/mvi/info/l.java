package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import W80.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PositionInfoEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "LW80/e;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements t<PositionInfoInternalAction, W80.e> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final W80.e b(PositionInfoInternalAction positionInfoInternalAction) {
        PositionInfoInternalAction positionInfoInternalAction2 = positionInfoInternalAction;
        if (positionInfoInternalAction2 instanceof PositionInfoInternalAction.BannerClosed ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.LoadingError ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.LoadingStart ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.NoChange ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.ToastClosed ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.PeriodSelected) {
            return null;
        }
        if (positionInfoInternalAction2 instanceof PositionInfoInternalAction.OpenDeepLink) {
            return new e.b(((PositionInfoInternalAction.OpenDeepLink) positionInfoInternalAction2).f220524b);
        }
        if (positionInfoInternalAction2 instanceof PositionInfoInternalAction.Close) {
            return e.a.f17790a;
        }
        if (!(positionInfoInternalAction2 instanceof PositionInfoInternalAction.LoadingResult)) {
            throw new NoWhenBranchMatchedException();
        }
        V80.h hVar = ((PositionInfoInternalAction.LoadingResult) positionInfoInternalAction2).f220518b;
        O80.a aVar = hVar.f16961f;
        if ((aVar != null ? aVar.f12014b : null) != null) {
            return new e.c();
        }
        DeepLink deepLink = hVar.f16958c;
        if (deepLink != null) {
            return new e.b(deepLink);
        }
        return null;
    }
}
