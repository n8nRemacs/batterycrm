package I81;

import androidx.compose.foundation.shape.n;
import androidx.compose.foundation.shape.o;
import androidx.compose.material3.C21807q2;
import androidx.compose.material3.C21829r2;
import androidx.compose.material3.C21859s9;
import androidx.compose.material3.C21897u2;
import androidx.compose.material3.C21942w3;
import androidx.compose.material3.C21964x3;
import androidx.compose.material3.D2;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.internal.InterfaceC22085c;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.v;
import d0.C39464m;
import d0.C39472v;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class e {
    static {
        C42745f0.U(new InterfaceC40658b.c("Недвижимость", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Оплата", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Избранное", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Корзина", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null));
    }

    public static final void a(v vVar, long j12, float f12, float f13, InterfaceC22085c interfaceC22085c, A a12, int i12, int i13) {
        int i14;
        long jD2;
        int i15;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f22;
        float f23;
        long j13;
        float f24;
        float f25;
        B bE2 = a12.E(-1414853107);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            if ((i13 & 2) == 0) {
                jD2 = j12;
                int i16 = bE2.n(jD2) ? 32 : 16;
                i14 |= i16;
            } else {
                jD2 = j12;
            }
            i14 |= i16;
        } else {
            jD2 = j12;
        }
        if ((i12 & 896) == 0) {
            i14 |= 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= 1024;
        }
        int i17 = i14 | 14376960;
        if ((234881024 & i12) == 0) {
            i17 |= bE2.u(interfaceC22085c) ? 67108864 : 33554432;
        }
        if ((191739611 & i17) == 38347922 && bE2.c()) {
            bE2.f();
            f24 = f12;
            f25 = f13;
            j13 = jD2;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                if ((i13 & 2) != 0) {
                    T.a aVar = T.f39320b;
                    bE2.I(1156998153);
                    jD2 = V.d(ic1.d.a(bE2) ? 4280229663L : 4294967295L);
                    bE2.O();
                    i17 &= -113;
                }
                i15 = i17 & (-8065);
                f14 = AbstractC49426b.f441201i0;
                f15 = AbstractC49426b.f441219r0;
            } else {
                bE2.f();
                if ((i13 & 2) != 0) {
                    i17 &= -113;
                }
                i15 = i17 & (-8065);
                f14 = f12;
                f15 = f13;
            }
            long j14 = jD2;
            bE2.Y();
            n nVarA = o.a(f14);
            C21829r2.f37191a.getClass();
            bE2.I(-1589582123);
            long jB2 = C21964x3.b(j14, bE2);
            long jC2 = T.c(jB2, 0.38f);
            C21859s9.f37272a.getClass();
            C21942w3 c21942w3A = C21859s9.a(bE2);
            C21807q2 c21807q2 = c21942w3A.f37648N;
            if (c21807q2 == null) {
                C39472v.f393585a.getClass();
                ColorSchemeKeyTokens colorSchemeKeyTokens = C39472v.f393586b;
                C21807q2 c21807q22 = new C21807q2(C21964x3.c(c21942w3A, colorSchemeKeyTokens), C21964x3.a(c21942w3A, C21964x3.c(c21942w3A, colorSchemeKeyTokens)), V.g(T.c(C21964x3.c(c21942w3A, C39472v.f393587c), 0.38f), C21964x3.e(c21942w3A, C39472v.f393588d)), T.c(C21964x3.a(c21942w3A, C21964x3.c(c21942w3A, colorSchemeKeyTokens)), 0.38f), null);
                c21942w3A.f37648N = c21807q22;
                c21807q2 = c21807q22;
            }
            T.f39320b.getClass();
            long j15 = T.f39330l;
            long j16 = j14 != j15 ? j14 : c21807q2.f37135a;
            if (jB2 == j15) {
                jB2 = c21807q2.f37136b;
            }
            C21807q2 c21807q23 = new C21807q2(j16, jB2, j14 != j15 ? j14 : c21807q2.f37137c, jC2 != j15 ? jC2 : c21807q2.f37138d, null);
            bE2.X(false);
            bE2.I(1154241939);
            if (false && true) {
                C39464m.f393456a.getClass();
                f16 = C39464m.f393457b;
            } else {
                f16 = f15;
            }
            if ((2 & 0) != 0) {
                C39464m.f393456a.getClass();
                f17 = C39464m.f393462g;
            } else {
                f17 = f15;
            }
            if ((4 & 0) != 0) {
                C39464m.f393456a.getClass();
                f18 = C39464m.f393460e;
            } else {
                f18 = f15;
            }
            if ((0 & 8) != 0) {
                C39464m.f393456a.getClass();
                f19 = C39464m.f393461f;
            } else {
                f19 = f15;
            }
            if ((16 & 0) != 0) {
                C39464m.f393456a.getClass();
                f22 = C39464m.f393459d;
            } else {
                f22 = f15;
            }
            if ((0 & 32) != 0) {
                C39464m.f393456a.getClass();
                f23 = C39464m.f393458c;
            } else {
                f23 = f15;
            }
            C21897u2 c21897u2 = new C21897u2(f16, f17, f18, f19, f22, f23, null);
            bE2.O();
            j13 = j14;
            D2.b(vVar, nVarA, c21807q23, c21897u2, r.b(bE2, -2079652600, new c(interfaceC22085c, i15)), bE2, (i15 & 14) | 24576);
            f24 = f14;
            f25 = f15;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new d(vVar, j13, f24, f25, interfaceC22085c, i12, i13);
    }
}
