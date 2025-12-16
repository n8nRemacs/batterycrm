package p31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import androidx.view.AbstractC23301M0;
import androidx.view.C23404y0;
import androidx.view.compose.C23358x;
import androidx.view.compose.C23359y;

/* loaded from: classes8.dex */
public abstract class r {
    public static final void a(Y41.a aVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-596696891);
        if ((i12 & 14) == 0) {
            i13 = (bE2.n(300L) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C23404y0 c23404y0B = C23358x.b(new AbstractC23301M0[0], bE2);
            v.a aVar2 = v.f42878y1;
            T.a aVar3 = T.f39320b;
            bE2.I(-728886447);
            long jD2 = V.d(ic1.d.a(bE2) ? 4280756007L : 4294967295L);
            bE2.O();
            C23359y.c(c23404y0B, "loading_sso_screen", androidx.compose.foundation.A.b(aVar2, jD2, Y0.f39346a), new p(c23404y0B, aVar, i13), bE2, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new q(i12, aVar);
    }
}
