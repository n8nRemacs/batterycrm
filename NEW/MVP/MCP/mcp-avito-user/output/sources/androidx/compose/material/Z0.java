package androidx.compose.material;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22190v;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: BottomNavigation.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Z0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
    public Z0() {
        throw null;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        androidx.compose.ui.v vVarA = androidx.compose.foundation.selection.a.a(C20588k2.b(0.0f, C21242l1.f33788a, 1, androidx.compose.foundation.layout.N2.b(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), null)));
        C20585k.f28659a.getClass();
        C20585k.h hVar = C20585k.f28666h;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39085k, a13, 6);
        int f37888q = a13.getF37888Q();
        androidx.compose.runtime.O1 o1Y = a13.y();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar);
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
        throw null;
    }
}
