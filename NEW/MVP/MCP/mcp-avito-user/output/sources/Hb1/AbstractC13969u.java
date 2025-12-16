package Hb1;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material.C21320r2;
import androidx.compose.material.N1;
import androidx.compose.material.U1;
import androidx.compose.material.V8;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import com.avito.android.R;
import w2.AbstractC49426b;

/* renamed from: Hb1.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13969u {
    public static final void a(androidx.compose.ui.v vVar, long j12, float f12, Y41.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        float f13;
        androidx.compose.runtime.B b12;
        float f14;
        androidx.compose.runtime.B bE2 = a12.E(-2039028052);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(aVar) ? 2048 : 1024;
        }
        int i15 = i14;
        if ((i15 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            f14 = f12;
            b12 = bE2;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                f13 = AbstractC49426b.f441163F;
            } else {
                bE2.f();
                f13 = f12;
            }
            bE2.Y();
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39089o;
            bE2.I(-483455358);
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(cVar, aVar2, bE2, 54);
            bE2.I(-1323940314);
            J3 j32 = Q0.f41199h;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(j32);
            J3 j33 = Q0.f41205n;
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(j33);
            J3 j34 = Q0.f41210s;
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(j34);
            InterfaceC22413h.a aVar3 = InterfaceC22413h.f40789C1;
            aVar3.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = androidx.compose.ui.layout.M.b(vVar);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            x31.i.a(c22096nB, x31.h.a(aVar3, bE2, iA2, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar5 = androidx.compose.ui.v.f42878y1;
            C20608p2.a(bE2, C20588k2.f(aVar5, AbstractC49426b.f441217q0));
            androidx.compose.ui.v vVarF = C20588k2.f(aVar5, f13);
            bE2.I(733328855);
            float f15 = f13;
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) bE2.o(j32);
            LayoutDirection layoutDirection2 = (LayoutDirection) bE2.o(j33);
            InterfaceC22544x2 interfaceC22544x22 = (InterfaceC22544x2) bE2.o(j34);
            C22096n c22096nB2 = androidx.compose.ui.layout.M.b(vVarF);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            x31.i.a(c22096nB2, x31.h.a(aVar3, bE2, interfaceC22365i0E, bE2, dVar2, bE2, layoutDirection2, bE2, interfaceC22544x22, bE2, bE2), bE2);
            C20644z c20644z = C20644z.f28804a;
            C20806p1.a(u0.e.a(R.drawable.img_cat_error_cat, 0, bE2), u0.i.c(bE2, R.string.error_screen_image_description), null, null, null, 0.0f, null, bE2, 8, 124);
            C20806p1.a(u0.e.a(R.drawable.img_cat_error_wire, 0, bE2), u0.i.c(bE2, R.string.error_screen_image_description), null, null, null, 0.0f, U.a.a(androidx.compose.ui.graphics.U.f39332b, j12), bE2, 8, 60);
            C20806p1.a(u0.e.a(R.drawable.img_cat_error_nose, 0, bE2), u0.i.c(bE2, R.string.error_screen_image_description), null, null, null, 0.0f, null, bE2, 8, 124);
            androidx.compose.foundation.H.B(bE2, false, true, false, false);
            float f16 = AbstractC49426b.f441211n0;
            C20608p2.a(bE2, C20588k2.f(aVar5, f16));
            Mc1.s.j(u0.i.c(bE2, R.string.error_screen_title), null, bE2, 0);
            C20608p2.a(bE2, C20588k2.f(aVar5, f16));
            String strC = u0.i.c(bE2, R.string.error_screen_description);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            Mc1.s.g(strC, null, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), bE2, 0);
            float f17 = AbstractC49426b.f441215p0;
            C20608p2.a(bE2, C20588k2.f(aVar5, f17));
            androidx.compose.ui.v vVarK = R1.k(AbstractC49426b.f441187b0, 0.0f, 2, C20588k2.h(AbstractC49426b.f441164G, 0.0f, 2, C20588k2.d(aVar5, 1.0f)));
            N1 n12 = N1.f32961a;
            V8.f33282a.getClass();
            n12.getClass();
            U1.a(aVar, vVarK, false, null, androidx.compose.foundation.shape.o.a(AbstractC49426b.f441209m0), N1.a(j12, C21320r2.a(V8.a(bE2), bE2), j12, j12, bE2, ((i15 >> 3) & 14) | ((i15 << 3) & 896) | ((i15 << 6) & 7168), 0), null, AbstractC13955f.f7453a, bE2, ((i15 >> 9) & 14) | 805306416, 348);
            b12 = bE2;
            C20608p2.a(b12, C20588k2.f(aVar5, f17));
            b12.X(false);
            androidx.compose.foundation.H.A(b12, true, false, false);
            f14 = f15;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new r(vVar, j12, f14, aVar, i12);
    }
}
