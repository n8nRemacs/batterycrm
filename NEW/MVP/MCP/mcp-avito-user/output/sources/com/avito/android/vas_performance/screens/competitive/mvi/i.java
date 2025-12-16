package com.avito.android.vas_performance.screens.competitive.mvi;

import JL0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitiveVasV2OneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "LJL0/b;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements t<CompetitiveVasV2InternalAction, JL0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final JL0.b b(CompetitiveVasV2InternalAction competitiveVasV2InternalAction) {
        CompetitiveVasV2InternalAction competitiveVasV2InternalAction2 = competitiveVasV2InternalAction;
        if (competitiveVasV2InternalAction2 instanceof CompetitiveVasV2InternalAction.Back) {
            return b.a.f8890a;
        }
        if (competitiveVasV2InternalAction2 instanceof CompetitiveVasV2InternalAction.FinishFlow) {
            return b.C0524b.f8891a;
        }
        if (competitiveVasV2InternalAction2 instanceof CompetitiveVasV2InternalAction.HandleDeeplink) {
            return new b.c(((CompetitiveVasV2InternalAction.HandleDeeplink) competitiveVasV2InternalAction2).f320450b);
        }
        return null;
    }
}
