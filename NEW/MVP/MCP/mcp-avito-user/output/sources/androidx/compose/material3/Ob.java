package androidx.compose.material3;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ob extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
    public Ob() {
        throw null;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        v.a aVar = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28681b;
        aVar.d0(fillElement);
        androidx.compose.ui.v vVarB = androidx.compose.foundation.layout.N2.b(fillElement, null);
        d0.J.f393189a.getClass();
        androidx.compose.ui.v vVarV = C20588k2.v(d0.J.f393192d, 0.0f, 2, vVarB);
        float f12 = C21519dc.f36205a;
        androidx.compose.ui.v vVarA = androidx.compose.foundation.selection.a.a(androidx.compose.foundation.layout.R1.k(0.0f, f12, 1, vVarV));
        InterfaceC22215f.f39074a.getClass();
        i.a aVar2 = InterfaceC22215f.a.f39089o;
        C20585k.f28659a.getClass();
        C20585k.j jVarG = C20585k.g(f12);
        a13.I(-483455358);
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, aVar2, a13, 54);
        a13.I(-1323940314);
        int f37888q = a13.getF37888Q();
        androidx.compose.runtime.O1 o1Y = a13.y();
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarA);
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar3);
        } else {
            a13.d();
        }
        androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
        androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
        }
        androidx.compose.foundation.H.x(0, c22096nC, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        a13.I(716053806);
        a13.O();
        throw null;
    }
}
