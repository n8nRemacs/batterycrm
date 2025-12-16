package f;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.painter.e;
import androidx.compose.ui.v;
import com.avito.android.R;
import ic1.d;
import w2.AbstractC49426b;

/* loaded from: classes.dex */
public abstract class b {
    public static final void a(C20576h2 c20576h2, boolean z12, v.a aVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(2091178039);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c20576h2) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if (((i13 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            aVar = v.f42878y1;
            if (z12) {
                v vVarO = C20588k2.o(aVar, AbstractC49426b.f441196g);
                InterfaceC22215f.f39074a.getClass();
                v vVarC = c20576h2.c(vVarO, InterfaceC22215f.a.f39086l);
                e eVarA = u0.e.a(R.drawable.ic_arrow_right, 0, bE2);
                U.a aVar2 = U.f39332b;
                T.a aVar3 = T.f39320b;
                bE2.I(1567581961);
                long jD2 = V.d(d.a(bE2) ? 4287269772L : 4285166195L);
                bE2.O();
                C20806p1.a(eVarA, "", vVarC, null, null, 0.0f, U.a.a(aVar2, jD2), bE2, 56, 56);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C40186a(c20576h2, z12, aVar, i12);
    }
}
