package xc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.v;

/* loaded from: classes9.dex */
public abstract class l {
    public static final void a(v vVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(208699012);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            I81.l.a(vVar, b.f442576a, bE2, (i13 & 14) | 48);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new k(vVar, i12);
    }
}
