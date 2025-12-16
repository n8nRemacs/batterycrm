package Jc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material3.C21914uj;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.i;
import androidx.compose.ui.v;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class b {
    public static final void a(int i12, int i13, A a12, v.a aVar, String str) {
        int i14;
        v.a aVar2;
        int i15;
        B b12;
        int i16;
        v.a aVar3;
        B bE2 = a12.E(1680264827);
        int i17 = i13 | 6;
        if ((i13 & 112) == 0) {
            i17 |= bE2.B(str) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i17 |= 128;
        }
        if ((i17 & 731) == 146 && bE2.c()) {
            bE2.f();
            i16 = i12;
            aVar3 = aVar;
            b12 = bE2;
        } else {
            bE2.y0();
            if ((i13 & 1) == 0 || bE2.g0()) {
                v.a aVar4 = v.f42878y1;
                i.f42675b.getClass();
                i14 = i17 & (-897);
                aVar2 = aVar4;
                i15 = i.f42676c;
            } else {
                bE2.f();
                i14 = i17 & (-897);
                i15 = i12;
                aVar2 = aVar;
            }
            bE2.Y();
            v vVarW = C20588k2.w(C20588k2.d(aVar2, 1.0f), null, 3);
            float f12 = AbstractC49426b.f441189c0;
            v vVarL = R1.l(vVarW, f12, AbstractC49426b.f441191d0, f12, AbstractC49426b.f441185a0);
            e0.f42240c.getClass();
            e0 e0Var = e0.f42250m;
            long j12 = AbstractC49426b.f441231x0;
            T.a aVar5 = T.f39320b;
            bE2.I(1765143401);
            long jD2 = V.d(4278716424L);
            bE2.X(false);
            b12 = bE2;
            C21914uj.b(str, vVarL, jD2, j12, null, e0Var, null, 0L, null, i.a(i15), 0L, 0, false, 0, 0, null, null, b12, ((i14 >> 3) & 14) | 199680, 0, 130512);
            i16 = i15;
            aVar3 = aVar2;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i16, i13, aVar3, str);
    }
}
