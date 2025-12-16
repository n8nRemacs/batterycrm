package com.avito.android.mortgage.manager_usp.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import z00.C50335d;
import z00.InterfaceC50333b;

/* compiled from: ManagerUspActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lz00/b;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lz00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC50333b, ManagerUspInternalAction, C50335d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.manager_usp.interactor.a f200415a;

    @Inject
    public b(@Y61.k com.avito.android.mortgage.manager_usp.interactor.a aVar) {
        this.f200415a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ManagerUspInternalAction> b(InterfaceC50333b interfaceC50333b, C50335d c50335d) {
        InterfaceC50333b interfaceC50333b2 = interfaceC50333b;
        C50335d c50335d2 = c50335d;
        if (interfaceC50333b2.equals(InterfaceC50333b.a.f443683a)) {
            return C43175k.G(new a(c50335d2, null));
        }
        if (interfaceC50333b2.equals(InterfaceC50333b.C12937b.f443684a)) {
            return this.f200415a.O();
        }
        throw new NoWhenBranchMatchedException();
    }
}
