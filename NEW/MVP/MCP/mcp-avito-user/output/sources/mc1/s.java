package Mc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material3.C21914uj;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import okhttp3.internal.ws.WebSocketProtocol;
import w2.AbstractC49425a;
import w2.AbstractC49426b;
import w2.AbstractC49430f;

/* loaded from: classes9.dex */
public abstract class s {
    public static final void a(int i12, int i13, A a12, v vVar, String str) {
        int i14;
        int i15;
        v vVar2;
        int i16;
        B b12;
        int i17;
        v vVar3;
        B bE2 = a12.E(407660403);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i18 = i14 | 48;
        if ((i13 & 896) == 0) {
            i18 = i14 | 176;
        }
        if ((i18 & 731) == 146 && bE2.c()) {
            bE2.f();
            i17 = i12;
            vVar3 = vVar;
            b12 = bE2;
        } else {
            bE2.y0();
            if ((i13 & 1) == 0 || bE2.g0()) {
                v.a aVar = v.f42878y1;
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i15 = androidx.compose.ui.text.style.i.f42676c;
                vVar2 = aVar;
                i16 = i18 & (-897);
            } else {
                bE2.f();
                i16 = i18 & (-897);
                i15 = i12;
                vVar2 = vVar;
            }
            bE2.Y();
            v vVarW = C20588k2.w(C20588k2.y(vVar2, null, 3), null, 3);
            float f12 = AbstractC49426b.f441189c0;
            float f13 = AbstractC49426b.f441185a0;
            v vVarL = R1.l(vVarW, f12, f13, f12, f13);
            x0.a aVar2 = x0.f42737d;
            x0 x0VarB = AbstractC49430f.b();
            long j12 = AbstractC49426b.f441227v0;
            T.a aVar3 = T.f39320b;
            bE2.I(1629460329);
            long jD2 = V.d(2282227720L);
            bE2.X(false);
            b12 = bE2;
            C21914uj.b(str, vVarL, jD2, j12, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(i15), 0L, 0, false, 0, 0, null, x0VarB, b12, (i16 & 14) | 3072, 0, 65008);
            i17 = i15;
            vVar3 = vVar2;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(i17, i13, vVar3, str);
    }

    public static final void b(int i12, Y41.l lVar, A a12, v vVar, String str) {
        int i13;
        B b12;
        B bE2 = a12.E(-708740231);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(lVar) ? 2048 : 1024;
        }
        int i15 = i14;
        if ((i15 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            x0.a aVar = x0.f42737d;
            x0 x0VarA = x0.a(AbstractC49430f.b(), 0L, AbstractC49426b.f441156A0, 4128767);
            T.a aVar2 = T.f39320b;
            b12 = bE2;
            C21914uj.b(str, vVar, AbstractC49425a.d(bE2), AbstractC49426b.f441223t0, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, lVar, x0VarA, b12, (i15 & 14) | 3072 | (i15 & 112) | ((i15 << 21) & 1879048192), (i15 << 6) & 458752, 32240);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new j(i12, lVar, vVar, str);
    }

    public static final void c(String str, v.a aVar, long j12, A a12, int i12) {
        int i13;
        v.a aVar2;
        long j13;
        B bE2 = a12.E(-767592785);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        int i14 = i13 | 432;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            j13 = j12;
        } else {
            v.a aVar3 = v.f42878y1;
            T.f39320b.getClass();
            long j14 = T.f39323e;
            x0.a aVar4 = x0.f42737d;
            x0 x0VarA = AbstractC49430f.a();
            androidx.compose.ui.text.style.i.f42675b.getClass();
            C21914uj.b(str, aVar3, j14, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0L, 0, false, 0, 0, null, x0VarA, bE2, i14 & 1022, 0, 65016);
            aVar2 = aVar3;
            j13 = j14;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new d(str, aVar2, j13, i12);
    }

    public static final void d(String str, v vVar, long j12, int i12, A a12, int i13) {
        int i14;
        B bE2 = a12.E(934368020);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= bE2.m(i12) ? 2048 : 1024;
        }
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i13 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            v vVarW = C20588k2.w(C20588k2.y(vVar, null, 3), null, 3);
            x0.a aVar = x0.f42737d;
            C21914uj.b(str, vVarW, j12, AbstractC49426b.f441227v0, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(i12), 0L, 0, false, 0, 0, null, AbstractC49430f.b(), bE2, (i14 & 14) | 3072 | (i14 & 896) | ((i14 << 18) & 1879048192), 0, 65008);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new r(str, vVar, j12, i12, i13);
    }

    public static final void e(String str, v vVar, long j12, Y41.l lVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1417956246);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            x0.a aVar = x0.f42737d;
            C21914uj.b(str, vVar, j12, AbstractC49426b.f441221s0, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, lVar, x0.a(AbstractC49430f.b(), 0L, AbstractC49426b.f441158B0, 4128767), bE2, (i13 & 14) | 3072 | (i13 & 112) | (i13 & 896), (i13 << 6) & 458752, 32752);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new h(str, vVar, j12, lVar, i12);
    }

    public static final void f(String str, v vVar, A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(-1336921449);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i15 = androidx.compose.ui.text.style.i.f42678e;
            x0.a aVar = x0.f42737d;
            x0 x0VarA = AbstractC49430f.a();
            T.a aVar2 = T.f39320b;
            b12 = bE2;
            C21914uj.b(str, vVar, AbstractC49425a.b(bE2), 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(i15), 0L, 0, false, 0, 0, null, x0VarA, b12, i14 & WebSocketProtocol.PAYLOAD_SHORT, 0, 65016);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i12, vVar, str);
    }

    public static final void g(String str, v vVar, androidx.compose.ui.text.style.i iVar, A a12, int i12) {
        int i13;
        B b12;
        v vVar2;
        B bE2 = a12.E(-61196656);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i12 & 896) == 0) {
            i14 |= bE2.B(iVar) ? 256 : 128;
        }
        int i15 = i14;
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
            vVar2 = vVar;
        } else {
            v.a aVar = v.f42878y1;
            x0.a aVar2 = x0.f42737d;
            x0 x0VarA = x0.a(AbstractC49430f.b(), 0L, AbstractC49426b.f441235z0, 4128767);
            T.a aVar3 = T.f39320b;
            bE2.I(364745769);
            long jD2 = V.d(ic1.d.a(bE2) ? 4287598479L : 4286808963L);
            bE2.X(false);
            b12 = bE2;
            C21914uj.b(str, C20588k2.x(aVar, null, 3), jD2, AbstractC49426b.f441221s0, null, null, null, 0L, null, iVar, 0L, 0, false, 0, 0, null, x0VarA, b12, (i15 & 14) | 3072 | ((i15 << 21) & 1879048192), 0, 65008);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new c(str, vVar2, iVar, i12);
    }

    public static final void h(int i12, Y41.l lVar, A a12, v vVar, String str) {
        int i13;
        B b12;
        B bE2 = a12.E(647830796);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        int i14 = i13;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            x0.a aVar = x0.f42737d;
            x0 x0VarA = x0.a(AbstractC49430f.a(), 0L, AbstractC49426b.f441156A0, 4128767);
            T.a aVar2 = T.f39320b;
            b12 = bE2;
            C21914uj.b(str, C20588k2.x(vVar, null, 3), AbstractC49425a.d(bE2), AbstractC49426b.f441229w0, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, lVar, x0VarA, b12, (i14 & 14) | 3072, (i14 << 9) & 458752, 32752);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new l(i12, lVar, vVar, str);
    }

    public static final void i(String str, v vVar, long j12, A a12, int i12) {
        int i13;
        B bE2 = a12.E(646042167);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            x0.a aVar = x0.f42737d;
            C21914uj.b(str, vVar, j12, AbstractC49426b.f441225u0, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, x0.a(AbstractC49430f.b(), 0L, AbstractC49426b.f441158B0, 4128767), bE2, (i13 & 14) | 3072 | (i13 & 112) | (i13 & 896), 0, 65520);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new m(str, vVar, j12, i12);
    }

    public static final void j(String str, v vVar, A a12, int i12) {
        int i13;
        B b12;
        v vVar2;
        B bE2 = a12.E(295274368);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            b12 = bE2;
        } else {
            v.a aVar = v.f42878y1;
            x0.a aVar2 = x0.f42737d;
            x0 x0VarA = x0.a(AbstractC49430f.b(), 0L, AbstractC49426b.f441158B0, 4128767);
            T.a aVar3 = T.f39320b;
            long jD2 = AbstractC49425a.d(bE2);
            long j12 = AbstractC49426b.f441227v0;
            v vVarX = C20588k2.x(aVar, null, 3);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            b12 = bE2;
            C21914uj.b(str, vVarX, jD2, j12, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0L, 0, false, 0, 0, null, x0VarA, b12, (i14 & 14) | 3072, 0, 65008);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new e(i12, vVar2, str);
    }

    public static final void k(String str, v vVar, long j12, A a12, int i12) {
        int i13;
        int i14;
        long j13;
        B bE2 = a12.E(-1352074283);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            j13 = j12;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                T.a aVar = T.f39320b;
                bE2.I(658964617);
                long jD2 = V.d(ic1.d.a(bE2) ? 4294967295L : 4278190080L);
                bE2.X(false);
                i14 = i13 & (-897);
                j13 = jD2;
            } else {
                bE2.f();
                i14 = i13 & (-897);
                j13 = j12;
            }
            bE2.Y();
            x0.a aVar2 = x0.f42737d;
            C21914uj.b(str, vVar, j13, AbstractC49426b.f441229w0, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC49430f.a(), bE2, (i14 & 14) | 3072 | (i14 & 112), 0, 65520);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new n(str, vVar, j13, i12);
    }

    public static final void l(String str, v vVar, A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(-204653026);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i15 = androidx.compose.ui.text.style.i.f42678e;
            x0.a aVar = x0.f42737d;
            x0 x0VarB = AbstractC49430f.b();
            T.a aVar2 = T.f39320b;
            b12 = bE2;
            C21914uj.b(str, C20588k2.w(C20588k2.y(vVar, null, 3), null, 3), AbstractC49425a.d(bE2), 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(i15), 0L, 0, false, 0, 0, null, x0VarB, b12, i14 & 14, 0, 65016);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new f(i12, vVar, str);
    }

    public static final void m(String str, v vVar, long j12, A a12, int i12) {
        int i13;
        v vVar2;
        v vVar3;
        B bE2 = a12.E(1985739142);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i12 & 896) == 0) {
            i14 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar3 = vVar;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                vVar2 = v.f42878y1;
            } else {
                bE2.f();
                vVar2 = vVar;
            }
            bE2.Y();
            x0.a aVar = x0.f42737d;
            int i15 = (i14 & 14) | 3072 | (i14 & 896);
            vVar3 = vVar2;
            C21914uj.b(str, C20588k2.x(vVar2, null, 3), j12, AbstractC49426b.f441223t0, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, x0.a(AbstractC49430f.b(), 0L, AbstractC49426b.f441156A0, 4128767), bE2, i15, 0, 65520);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new o(str, vVar3, j12, i12);
    }

    public static final void n(String str, v vVar, A a12, int i12) {
        int i13;
        B b12;
        v vVar2;
        B bE2 = a12.E(1384964002);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            b12 = bE2;
        } else {
            v.a aVar = v.f42878y1;
            v vVarW = C20588k2.w(C20588k2.y(aVar, null, 3), null, 3);
            x0.a aVar2 = x0.f42737d;
            x0 x0VarA = AbstractC49430f.a();
            long j12 = AbstractC49426b.f441231x0;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i15 = androidx.compose.ui.text.style.i.f42678e;
            T.a aVar3 = T.f39320b;
            b12 = bE2;
            C21914uj.b(str, vVarW, AbstractC49425a.d(bE2), j12, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(i15), 0L, 0, false, 0, 0, null, x0VarA, b12, (i14 & 14) | 3072, 0, 65008);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new q(i12, vVar2, str);
    }

    public static final void o(String str, v vVar, long j12, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1805081913);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            x0.a aVar = x0.f42737d;
            x0 x0VarA = x0.a(AbstractC49430f.b(), AbstractC49426b.f441233y0, AbstractC49426b.f441160C0, 4128765);
            v vVarW = C20588k2.w(C20588k2.y(vVar, null, 3), null, 3);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            C21914uj.b(str, vVarW, j12, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0L, 0, false, 1, 0, null, x0VarA, bE2, i13 & 910, 3072, 56824);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new p(str, vVar, j12, i12);
    }
}
