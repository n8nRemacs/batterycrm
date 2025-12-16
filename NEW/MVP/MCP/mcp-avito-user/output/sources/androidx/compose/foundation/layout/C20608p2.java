package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.R3;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: Spacer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20608p2 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.runtime.A a12, @Y61.k androidx.compose.ui.v vVar) {
        C20612q2 c20612q2 = C20612q2.f28714a;
        int f37888q = a12.getF37888Q();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a12, vVar);
        androidx.compose.runtime.O1 o1Y = a12.y();
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (a12.F() == null) {
            C22190v.b();
            throw null;
        }
        a12.A();
        if (a12.getF37887P()) {
            a12.b(aVar);
        } else {
            a12.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, a12, c20612q2);
        R3.b(InterfaceC22413h.a.f40795f, a12, o1Y);
        R3.b(InterfaceC22413h.a.f40793d, a12, vVarC);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (a12.getF37887P() || !kotlin.jvm.internal.L.f(a12.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a12, f37888q, pVar);
        }
        a12.z();
    }
}
