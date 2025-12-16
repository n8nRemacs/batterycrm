package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.v;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.v;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InnerInput.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p extends N implements Y41.q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.input.v f175698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvitoInputState f175699m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.akita.compose.component.input.v vVar, AvitoInputState avitoInputState) {
        super(3);
        this.f175698l = vVar;
        this.f175699m = avitoInputState;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.input.v vVar = this.f175698l;
            v.a aVar = vVar.f61848u;
            AvitoInputState avitoInputState = this.f175699m;
            boolean z12 = avitoInputState.f334464c;
            InputState inputStateC = q.c(avitoInputState.f334465d);
            v.a.C2090a c2090a = v.a.f61852e;
            long j12 = ((T) aVar.a(z12, inputStateC, a13).getF42167b()).f39331a;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            com.akita.compose.foundation.ui.n.b(new n(avitoInputState), C20588k2.p(vVar.f61838k, interfaceC20640y2.d(aVar2, InterfaceC22215f.a.f39080f)), androidx.compose.foundation.shape.o.f30153a, 0.0f, null, com.akita.compose.foundation.q.a(j12), null, null, false, androidx.compose.runtime.internal.r.c(488591844, new o(avitoInputState), a13), a13, 0, 984);
        }
        return G0.f406611a;
    }
}
