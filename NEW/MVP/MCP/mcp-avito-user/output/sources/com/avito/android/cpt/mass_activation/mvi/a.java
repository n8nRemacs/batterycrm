package com.avito.android.cpt.mass_activation.mvi;

import Pr.C14830a;
import Vr.InterfaceC15709a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CptMassActivationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LVr/a;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "LVr/c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15709a, CptMassActivationInternalAction, Vr.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpt.mass_activation.domain.a f126581a;

    @Inject
    public a(@Y61.k com.avito.android.cpt.mass_activation.domain.a aVar) {
        this.f126581a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CptMassActivationInternalAction> b(InterfaceC15709a interfaceC15709a, Vr.c cVar) {
        DeepLink deepLink;
        InterfaceC15709a interfaceC15709a2 = interfaceC15709a;
        Vr.c cVar2 = cVar;
        if (interfaceC15709a2 instanceof InterfaceC15709a.c) {
            return this.f126581a.a();
        }
        if (interfaceC15709a2 instanceof InterfaceC15709a.b) {
            return new C43210w(CptMassActivationInternalAction.SetEmptyResult.f126595b);
        }
        if (interfaceC15709a2 instanceof InterfaceC15709a.C1205a) {
            C14830a c14830a = cVar2.f17437e;
            return (c14830a == null || (deepLink = c14830a.f13336c) == null) ? C43175k.w() : new C43210w(new CptMassActivationInternalAction.CloseWithDeeplinkResult(deepLink));
        }
        if (interfaceC15709a2 instanceof InterfaceC15709a.d) {
            return new C43210w(new CptMassActivationInternalAction.HandleDeeplink(((InterfaceC15709a.d) interfaceC15709a2).f17428a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
