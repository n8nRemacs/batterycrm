package androidx.compose.material;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.C22190v;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public U() {
        throw null;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20572g2 interfaceC20572g22 = interfaceC20572g2;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(interfaceC20572g22) ? 4 : 2;
        }
        if (!a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        a13.C(1108917613);
        C20608p2.a(a13, Z.f33380c);
        a13.h();
        v.a aVar = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28681b;
        aVar.d0(fillElement);
        androidx.compose.ui.v vVarA = interfaceC20572g22.a(fillElement, 1.0f, true);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
        int f37888q = a13.getF37888Q();
        androidx.compose.runtime.O1 o1Y = a13.y();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar2);
        } else {
            a13.d();
        }
        androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
        androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
        }
        androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        C21365u5.f34242a.getClass();
        androidx.compose.ui.text.x0 x0Var = C21365u5.c(a13).f34338f;
        throw null;
    }
}
