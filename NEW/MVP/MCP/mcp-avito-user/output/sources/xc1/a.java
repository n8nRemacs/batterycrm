package xc1;

import Y41.q;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public final class a extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public static final a f442575l = new a();

    public a() {
        super(3);
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        A a12 = (A) obj2;
        if ((((Number) obj3).intValue() & 81) == 16 && a12.c()) {
            a12.f();
        } else {
            Ac1.f.a(null, a12, 0);
            v.a aVar = v.f42878y1;
            C20608p2.a(a12, C20588k2.f(aVar, AbstractC49426b.f441187b0));
            Ac1.h.a(null, a12, 0);
            C20608p2.a(a12, C20588k2.f(aVar, AbstractC49426b.f441189c0));
            C20585k.f fVarA = sberid.sdk.ui.utils.extensions.a.a(C20585k.f28659a, a12);
            v vVarD = C20588k2.d(aVar, 1.0f);
            C20585k.i iVar = C20585k.f28665g;
            a12.I(693286680);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(iVar, InterfaceC22215f.a.f39085k, a12, 6);
            a12.I(-1323940314);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a12.o(Q0.f41199h);
            LayoutDirection layoutDirection = (LayoutDirection) a12.o(Q0.f41205n);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) a12.o(Q0.f41210s);
            InterfaceC22413h.a aVar2 = InterfaceC22413h.f40789C1;
            aVar2.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = M.b(vVarD);
            if (a12.F() == null) {
                C22190v.b();
                throw null;
            }
            a12.A();
            if (a12.getF37887P()) {
                a12.b(aVar3);
            } else {
                a12.d();
            }
            a12.L();
            x31.i.a(c22096nB, x31.h.a(aVar2, a12, c20568f2A, a12, dVar, a12, layoutDirection, a12, interfaceC22544x2, a12, a12), a12);
            C20576h2 c20576h2 = C20576h2.f28641a;
            a12.I(407235057);
            for (int i12 = 0; i12 < 4; i12++) {
                Ac1.b.a(null, a12, 0);
                C20585k.f28659a.getClass();
                if (L.f(fVarA, C20585k.f28664f) && 4 != i12 + 1) {
                    C20608p2.a(a12, C20588k2.t(v.f42878y1, AbstractC49426b.f441194f));
                }
            }
            a12.O();
            a12.O();
            a12.z();
            a12.O();
            a12.O();
        }
        return G0.f406611a;
    }
}
