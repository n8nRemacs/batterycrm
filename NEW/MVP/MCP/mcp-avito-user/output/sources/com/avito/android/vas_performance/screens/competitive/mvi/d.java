package com.avito.android.vas_performance.screens.competitive.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompetitiveVasV2Bootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<CompetitiveVasV2InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.competitive.domain.a f320441a;

    @Inject
    public d(@Y61.k com.avito.android.vas_performance.screens.competitive.domain.a aVar) {
        this.f320441a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CompetitiveVasV2InternalAction> a() {
        return this.f320441a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
