package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: SimpleLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21002c1 {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-2105228848);
        int i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            C20996a1 c20996a1 = C20996a1.f31913a;
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20996a1);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.H.v(6, c22096n, bE2, true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C20999b1(vVar, c22096n, i12);
        }
    }
}
