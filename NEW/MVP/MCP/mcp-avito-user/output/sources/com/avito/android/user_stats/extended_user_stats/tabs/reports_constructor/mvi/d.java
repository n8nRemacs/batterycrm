package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConstructorTabBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<ConstructorTabInternalAction> {
    @Inject
    public d() {
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ConstructorTabInternalAction> a() {
        return new C43210w(ConstructorTabInternalAction.ShowLoadingIfEmptyData.f318204b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
