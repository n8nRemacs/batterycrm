package I81;

import Hb1.W;
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
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import g61.AbstractC40539b;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.N;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public final class g extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f8012l = 0;

    static {
        new g();
    }

    public g() {
        super(3);
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        A a12 = (A) obj2;
        if ((((Number) obj3).intValue() & 81) == 16 && a12.c()) {
            a12.f();
        } else {
            tc1.h.a("https://www.pngaaa.com/api-download/3018884", null, 0.0f, 0.0f, null, 0.0f, 0L, null, a12, 6, 1022);
            v.a aVar = v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C20608p2.a(a12, C20588k2.f(aVar, 16));
            T.f39320b.getClass();
            AbstractC40539b.a(null, "Клиент В.", "+7 (999) 999-99-99", T.f39326h, null, null, null, a12, 3504, 113);
            C20608p2.a(a12, C20588k2.f(aVar, 24));
            v vVarD = C20588k2.d(aVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            a12.I(693286680);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(cVar, InterfaceC22215f.a.f39085k, a12, 6);
            a12.I(-1323940314);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a12.o(Q0.f41199h);
            LayoutDirection layoutDirection = (LayoutDirection) a12.o(Q0.f41205n);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) a12.o(Q0.f41210s);
            InterfaceC22413h.a aVar3 = InterfaceC22413h.f40789C1;
            aVar3.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = M.b(vVarD);
            if (a12.F() == null) {
                C22190v.b();
                throw null;
            }
            a12.A();
            if (a12.getF37887P()) {
                a12.b(aVar4);
            } else {
                a12.d();
            }
            a12.L();
            x31.i.a(c22096nB, x31.h.a(aVar3, a12, c20568f2A, a12, dVar, a12, layoutDirection, a12, interfaceC22544x2, a12, a12), a12);
            C20576h2 c20576h2 = C20576h2.f28641a;
            List list = l.f8019a;
            InterfaceC40658b.c cVar2 = (InterfaceC40658b.c) list.get(0);
            long j12 = T.f39328j;
            U.a aVar5 = U.f39332b;
            W.b(cVar2, null, j12, U.a.a(aVar5, T.f39321c), null, a12, 3456, 18);
            float f12 = AbstractC49426b.f441194f;
            C20608p2.a(a12, C20588k2.t(aVar, f12));
            InterfaceC40658b.c cVar3 = (InterfaceC40658b.c) list.get(1);
            long j13 = T.f39327i;
            W.b(cVar3, null, 0L, U.a.a(aVar5, j13), null, a12, 3072, 22);
            C20608p2.a(a12, C20588k2.t(aVar, f12));
            W.b((InterfaceC40658b.c) list.get(2), null, j13, U.a.a(aVar5, j12), null, a12, 3456, 18);
            C20608p2.a(a12, C20588k2.t(aVar, f12));
            W.b((InterfaceC40658b.c) list.get(3), null, 0L, null, null, a12, 0, 30);
            a12.O();
            a12.z();
            a12.O();
            a12.O();
        }
        return G0.f406611a;
    }
}
