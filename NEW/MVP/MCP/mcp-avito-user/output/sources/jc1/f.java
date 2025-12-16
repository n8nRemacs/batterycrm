package Jc1;

import Mc1.s;
import Y41.l;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import com.avito.android.R;
import gc1.C40657a;
import sberid.sdk.ui.utils.extensions.g;
import shark.AndroidResourceIdNames;
import w2.AbstractC49425a;
import w2.AbstractC49426b;
import x31.h;

/* loaded from: classes9.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    public static final void a(String str, v vVar, long j12, String str2, C40657a c40657a, l lVar, A a12, int i12) {
        int i13;
        C20576h2 c20576h2;
        v vVar2;
        v.a aVar;
        B b12;
        ?? r52;
        long jB2;
        B b13;
        boolean z12;
        B bE2 = a12.E(-1934066416);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i12 & 896) == 0) {
            i14 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.B(str2) ? 2048 : 1024;
        }
        if ((458752 & i12) == 0) {
            i14 |= bE2.u(lVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i15 = i14;
        v.a aVar2 = v.f42878y1;
        v vVarC = C20646z1.c(aVar2, IntrinsicSize.f28334c);
        v vVarA = n.a(vVarC, C22535v1.f41625a, new e(lVar, c40657a));
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        bE2.I(693286680);
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        bE2.I(-1323940314);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
        InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
        InterfaceC22413h.a aVar3 = InterfaceC22413h.f40789C1;
        aVar3.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        C22096n c22096nB = M.b(vVarA);
        if (bE2.f37890b == null) {
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
        x31.i.a(c22096nB, h.a(aVar3, bE2, c20568f2A, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
        C20576h2 c20576h22 = C20576h2.f28641a;
        bE2.I(538310616);
        if (str2 != null) {
            InterfaceC22374n.f40491a.getClass();
            c20576h2 = c20576h22;
            vVar2 = vVarC;
            g.a(str2, null, C20588k2.f(C20588k2.t(aVar2, AbstractC49426b.f441210n), AbstractC49426b.f441208m), null, null, null, null, InterfaceC22374n.a.f40499h, 0.0f, null, 0, bE2, ((i15 >> 9) & 14) | 48, 6, 15352);
            aVar = aVar2;
            B b14 = bE2;
            C20608p2.a(b14, C20588k2.t(aVar, AbstractC49426b.f441182Y));
            r52 = 0;
            b12 = b14;
        } else {
            c20576h2 = c20576h22;
            vVar2 = vVarC;
            aVar = aVar2;
            b12 = bE2;
            r52 = 0;
        }
        b12.X(r52);
        b12.I(538311059);
        if (c40657a == null) {
            T.a aVar5 = T.f39320b;
            jB2 = AbstractC49425a.b(b12);
        } else {
            jB2 = j12;
        }
        b12.X(r52);
        androidx.compose.ui.text.style.i.f42675b.getClass();
        s.d(str, c20576h2.a(aVar, 1.0f, true), jB2, androidx.compose.ui.text.style.i.f42678e, b12, i15 & 14);
        b12.I(-1617754639);
        if (lVar == null || c40657a == null) {
            b13 = b12;
            z12 = true;
        } else {
            b13 = b12;
            C20806p1.a(u0.e.a(R.drawable.ic_arrow_right, r52, b12), u0.i.c(b12, R.string.UserInfoImageDescription), C20588k2.w(C20588k2.y(aVar, null, 3), null, 3), null, null, 0.0f, U.a.a(U.f39332b, j12), b12, 392, 56);
            z12 = true;
        }
        H.B(b13, r52, r52, z12, r52);
        b13.X(r52);
        C22039c2 c22039c2Z = b13.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new c(str, vVar2, j12, str2, c40657a, lVar, i12);
    }
}
