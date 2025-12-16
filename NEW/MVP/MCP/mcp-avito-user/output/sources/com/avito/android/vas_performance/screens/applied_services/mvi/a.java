package com.avito.android.vas_performance.screens.applied_services.mvi;

import IL0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesInternalAction;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import com.avito.android.vas_planning.deeplink.VasPlannerRemoveLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AppliedServicesActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LIL0/a;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<IL0.a, AppliedServicesInternalAction, AppliedServicesState> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AppliedServicesInternalAction> b(IL0.a aVar, AppliedServicesState appliedServicesState) {
        IL0.a aVar2 = aVar;
        if (!(aVar2 instanceof a.C0460a)) {
            throw new NoWhenBranchMatchedException();
        }
        DeepLink deepLink = ((a.C0460a) aVar2).f8151a;
        return new C43210w(new AppliedServicesInternalAction.OpenDeepLink(deepLink, ((deepLink instanceof VasPlannerRemoveLink) || (deepLink instanceof DialogDeepLink)) ? false : true));
    }
}
