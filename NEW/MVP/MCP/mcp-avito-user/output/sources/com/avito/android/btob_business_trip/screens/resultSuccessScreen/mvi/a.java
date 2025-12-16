package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import Ak.C13046c;
import Ak.InterfaceC13044a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.entity.B2bBusinessTripSuccessScreenInternalAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rk.InterfaceC47669a;

/* compiled from: B2bBusinessTripSuccessScreenActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LAk/a;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "LAk/c;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13044a, B2bBusinessTripSuccessScreenInternalAction, C13046c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public InterfaceC47669a f108097a;

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<B2bBusinessTripSuccessScreenInternalAction> b(InterfaceC13044a interfaceC13044a, C13046c c13046c) {
        InterfaceC13044a interfaceC13044a2 = interfaceC13044a;
        if (interfaceC13044a2 instanceof InterfaceC13044a.b) {
            this.f108097a.c();
            return new C43210w(new B2bBusinessTripSuccessScreenInternalAction.LaunchDeeplink(((InterfaceC13044a.b) interfaceC13044a2).f593a));
        }
        if (interfaceC13044a2 instanceof InterfaceC13044a.C0023a) {
            return new C43210w(B2bBusinessTripSuccessScreenInternalAction.NavigateBack.f108108b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
