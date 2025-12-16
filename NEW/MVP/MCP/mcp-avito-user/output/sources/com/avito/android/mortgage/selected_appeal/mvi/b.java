package com.avito.android.mortgage.selected_appeal.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.selected_appeal.mvi.entity.SelectedAppealInternalAction;
import i10.InterfaceC41208a;
import javax.inject.Inject;
import k10.C42473c;
import k10.InterfaceC42471a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectedAppealActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lk10/a;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lk10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC42471a, SelectedAppealInternalAction, C42473c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.selected_appeal.mvi.domain.a f203456a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC41208a f203457b;

    @Inject
    public b(@k com.avito.android.mortgage.selected_appeal.mvi.domain.a aVar, @k InterfaceC41208a interfaceC41208a) {
        this.f203456a = aVar;
        this.f203457b = interfaceC41208a;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectedAppealInternalAction> b(InterfaceC42471a interfaceC42471a, C42473c c42473c) {
        InterfaceC42471a interfaceC42471a2 = interfaceC42471a;
        C42473c c42473c2 = c42473c;
        if (interfaceC42471a2.equals(InterfaceC42471a.C11600a.f405987a)) {
            return new C43210w(SelectedAppealInternalAction.Dismiss.f203473b);
        }
        if (interfaceC42471a2.equals(InterfaceC42471a.b.f405988a)) {
            return C43175k.G(new a(this, c42473c2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
