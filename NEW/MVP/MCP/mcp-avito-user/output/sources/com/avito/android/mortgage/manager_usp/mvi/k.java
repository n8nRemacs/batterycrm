package com.avito.android.mortgage.manager_usp.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import z00.C50335d;

/* compiled from: ManagerUspReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lz00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<ManagerUspInternalAction, C50335d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.manager_usp.mvi.builder.a f200439b;

    @Inject
    public k(@Y61.k com.avito.android.mortgage.manager_usp.mvi.builder.a aVar) {
        this.f200439b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50335d a(ManagerUspInternalAction managerUspInternalAction, C50335d c50335d) {
        C50335d c50335dA;
        ManagerUspInternalAction managerUspInternalAction2 = managerUspInternalAction;
        C50335d c50335d2 = c50335d;
        if (managerUspInternalAction2 instanceof ManagerUspInternalAction.Content) {
            c50335dA = C50335d.a(c50335d2, ((ManagerUspInternalAction.Content) managerUspInternalAction2).f200424b, false, null, null, 8);
        } else if (managerUspInternalAction2 instanceof ManagerUspInternalAction.Error) {
            c50335dA = C50335d.a(c50335d2, null, false, ((ManagerUspInternalAction.Error) managerUspInternalAction2).f200425b, null, 9);
        } else if (managerUspInternalAction2 instanceof ManagerUspInternalAction.HandleDeeplinkClick) {
            c50335dA = c50335d2;
        } else {
            if (!(managerUspInternalAction2 instanceof ManagerUspInternalAction.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            c50335dA = C50335d.a(c50335d2, null, true, null, null, 9);
        }
        return c50335dA.equals(c50335d2) ? c50335d2 : this.f200439b.a(c50335dA);
    }
}
