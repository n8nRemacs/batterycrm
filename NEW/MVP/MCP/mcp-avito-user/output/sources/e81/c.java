package E81;

import androidx.compose.foundation.shape.o;
import androidx.compose.material3.C21646j2;
import androidx.compose.material3.X1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.v;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class c {
    public static final void a(Y41.a aVar, v vVar, long j12, float f12, String str, long j13, A a12, int i12, int i13) {
        int i14;
        long j14;
        float f13;
        long j15;
        B bE2 = a12.E(-1621729169);
        if ((i12 & 14) == 0) {
            i14 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.n(j12) ? 256 : 128;
        }
        int i15 = i14 | 3072;
        if ((57344 & i12) == 0) {
            i15 |= bE2.B(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i16 = i13 & 32;
        if (i16 != 0) {
            i15 |= 196608;
            j14 = j13;
        } else {
            j14 = j13;
            if ((458752 & i12) == 0) {
                i15 |= bE2.n(j14) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
            }
        }
        if ((374491 & i15) == 74898 && bE2.c()) {
            bE2.f();
            f13 = f12;
            j15 = j14;
        } else {
            f13 = AbstractC49426b.f441199h0;
            if (i16 != 0) {
                T.f39320b.getClass();
                j14 = T.f39330l;
            }
            X1.f35798a.getClass();
            j15 = j14;
            C21646j2.a(aVar, vVar, false, o.a(f13), X1.a(j12, 0L, bE2, 14), null, null, null, null, r.b(bE2, -58109313, new a(str, j15, i15)), bE2, (i15 & 14) | 805306368 | (i15 & 112), 484);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(aVar, vVar, j12, f13, str, j15, i12, i13);
    }
}
