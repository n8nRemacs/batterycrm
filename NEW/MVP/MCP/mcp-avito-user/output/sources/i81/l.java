package I81;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.InterfaceC22085c;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8019a = C42745f0.U(new InterfaceC40658b.c("Недвижимость", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Оплата", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Избранное", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Корзина", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null));

    public static final void a(v vVar, InterfaceC22085c interfaceC22085c, A a12, int i12) {
        int i13;
        InterfaceC22085c interfaceC22085c2;
        B bE2 = a12.E(285951012);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(interfaceC22085c) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            interfaceC22085c2 = interfaceC22085c;
        } else {
            v vVarA = C20646z1.a(C20588k2.d(vVar, 1.0f), IntrinsicSize.f28333b);
            bE2.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            J3 j32 = Q0.f41199h;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(j32);
            J3 j33 = Q0.f41205n;
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(j33);
            J3 j34 = Q0.f41210s;
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(j34);
            InterfaceC22413h.a aVar = InterfaceC22413h.f40789C1;
            aVar.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = M.b(vVarA);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            x31.i.a(c22096nB, x31.h.a(aVar, bE2, interfaceC22365i0E, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar3 = v.f42878y1;
            v vVarD = C20588k2.d(R1.m(aVar3, 0.0f, AbstractC49426b.f441206l, 0.0f, 0.0f, 13), 1.0f);
            FillElement fillElement = C20588k2.f28681b;
            v vVarD0 = vVarD.d0(fillElement);
            T.a aVar4 = T.f39320b;
            bE2.I(1156998153);
            long jD2 = V.d(ic1.d.a(bE2) ? 4280229663L : 4294967295L);
            bE2.O();
            e.a(vVarD0, jD2, 0.0f, 0.0f, j.f8015a, bE2, 100663296, 252);
            v vVarM = R1.m(C20588k2.d(aVar3, 1.0f).d0(fillElement), 0.0f, 0.0f, 0.0f, AbstractC49426b.f441189c0, 7);
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            i.a aVar5 = InterfaceC22215f.a.f39089o;
            int i15 = ((i14 << 6) & 7168) | 432;
            bE2.I(-483455358);
            I iA2 = H.a(cVar, aVar5, bE2, 54);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) bE2.o(j32);
            LayoutDirection layoutDirection2 = (LayoutDirection) bE2.o(j33);
            InterfaceC22544x2 interfaceC22544x22 = (InterfaceC22544x2) bE2.o(j34);
            C22096n c22096nB2 = M.b(vVarM);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            x31.i.a(c22096nB2, x31.h.a(aVar, bE2, iA2, bE2, dVar2, bE2, layoutDirection2, bE2, interfaceC22544x22, bE2, bE2), bE2);
            interfaceC22085c2 = interfaceC22085c;
            interfaceC22085c2.invoke(K.f28344a, bE2, Integer.valueOf(((i15 >> 6) & 112) | 6));
            bE2.X(false);
            androidx.compose.foundation.H.B(bE2, true, false, false, false);
            androidx.compose.foundation.H.A(bE2, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new k(vVar, interfaceC22085c2, i12);
    }
}
