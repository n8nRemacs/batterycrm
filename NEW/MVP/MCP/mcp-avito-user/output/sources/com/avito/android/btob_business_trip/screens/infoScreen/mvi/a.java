package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity.B2bBusinessTripInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rk.InterfaceC47669a;
import zk.C50579c;
import zk.InterfaceC50577a;

/* compiled from: B2bBusinessTripInfoActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lzk/a;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lzk/c;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC50577a, B2bBusinessTripInfoInternalAction, C50579c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.btob_business_trip.screens.common.interactors.a f107990a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47669a f107991b;

    @Inject
    public a(@Y61.k com.avito.android.btob_business_trip.screens.common.interactors.a aVar, @Y61.k InterfaceC47669a interfaceC47669a) {
        this.f107990a = aVar;
        this.f107991b = interfaceC47669a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<B2bBusinessTripInfoInternalAction> b(InterfaceC50577a interfaceC50577a, C50579c c50579c) {
        InterfaceC50577a interfaceC50577a2 = interfaceC50577a;
        if (interfaceC50577a2 instanceof InterfaceC50577a.b) {
            return new C43210w(B2bBusinessTripInfoInternalAction.NavigateBack.f108005b);
        }
        if (interfaceC50577a2 instanceof InterfaceC50577a.C12970a) {
            this.f107991b.b();
            return new C43210w(new B2bBusinessTripInfoInternalAction.NavigateToSelectItems(((InterfaceC50577a.C12970a) interfaceC50577a2).f444196a));
        }
        if (interfaceC50577a2.equals(InterfaceC50577a.c.f444198a)) {
            return this.f107990a.b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
