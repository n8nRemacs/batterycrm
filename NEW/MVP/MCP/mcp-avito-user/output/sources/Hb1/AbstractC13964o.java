package Hb1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.Y0;
import w2.AbstractC49426b;

/* renamed from: Hb1.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13964o {
    public static final void a(androidx.compose.ui.v vVar, long j12, float f12, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1040152664);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= 16;
        }
        if (((i13 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                T.a aVar = androidx.compose.ui.graphics.T.f39320b;
                bE2.I(-1653534983);
                j12 = androidx.compose.ui.graphics.V.b(336070664);
                bE2.X(false);
                f12 = AbstractC49426b.f441169L;
            } else {
                bE2.f();
            }
            bE2.Y();
            C20608p2.a(bE2, androidx.compose.foundation.A.b(C20588k2.d(C20588k2.f(vVar, f12), 1.0f), j12, Y0.f39346a));
        }
        long j13 = j12;
        float f13 = f12;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13961l(vVar, j13, f13, i12);
    }
}
