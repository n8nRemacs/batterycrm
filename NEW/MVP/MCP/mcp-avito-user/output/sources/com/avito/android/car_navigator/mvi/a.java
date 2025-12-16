package com.avito.android.car_navigator.mvi;

import Dm.C13416c;
import Dm.InterfaceC13414a;
import Y61.k;
import com.avito.android.arch.mvi.a;
import com.avito.android.car_navigator.mvi.entity.CarNavigatorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CarNavigatorActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/car_navigator/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDm/a;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "LDm/c;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13414a, CarNavigatorInternalAction, C13416c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.car_navigator.presentation.d f115195a;

    @Inject
    public a(@k com.avito.android.car_navigator.presentation.d dVar) {
        this.f115195a = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CarNavigatorInternalAction> b(InterfaceC13414a interfaceC13414a, C13416c c13416c) {
        InterfaceC43160i<CarNavigatorInternalAction> interfaceC43160iW;
        InterfaceC13414a interfaceC13414a2 = interfaceC13414a;
        if (interfaceC13414a2 instanceof InterfaceC13414a.C0189a) {
            return new C43210w(CarNavigatorInternalAction.CancelScreen.f115203b);
        }
        boolean z12 = interfaceC13414a2 instanceof InterfaceC13414a.b;
        com.avito.android.car_navigator.presentation.d dVar = this.f115195a;
        if (z12) {
            dVar.a(((InterfaceC13414a.b) interfaceC13414a2).f3419a);
            return new C43210w(CarNavigatorInternalAction.ShowLoading.f115208b);
        }
        if (interfaceC13414a2 instanceof InterfaceC13414a.d) {
            InterfaceC13414a.d dVar2 = (InterfaceC13414a.d) interfaceC13414a2;
            interfaceC43160iW = new C43210w(new CarNavigatorInternalAction.OpenDeeplink(dVar2.f3421a, dVar2.f3422b));
        } else if (interfaceC13414a2 instanceof InterfaceC13414a.e) {
            interfaceC43160iW = new C43210w(new CarNavigatorInternalAction.OpenExternalUri(((InterfaceC13414a.e) interfaceC13414a2).f3423a));
        } else {
            if (interfaceC13414a2.equals(InterfaceC13414a.f.f3424a)) {
                return new C43210w(CarNavigatorInternalAction.ShowContent.f115207b);
            }
            if (interfaceC13414a2.equals(InterfaceC13414a.g.f3425a)) {
                return new C43210w(CarNavigatorInternalAction.ShowLoadingError.f115209b);
            }
            if (!interfaceC13414a2.equals(InterfaceC13414a.c.f3420a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!dVar.i0()) {
                return new C43210w(CarNavigatorInternalAction.CancelScreen.f115203b);
            }
            interfaceC43160iW = C43175k.w();
        }
        return interfaceC43160iW;
    }
}
