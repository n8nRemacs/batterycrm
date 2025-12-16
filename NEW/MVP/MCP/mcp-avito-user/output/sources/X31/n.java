package x31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* loaded from: classes8.dex */
public abstract class n {
    public static final void a(String str, String str2, String str3, C49758a c49758a, String str4, b bVar, c cVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1121639960);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str3) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(c49758a) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(str4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(bVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.u(cVar) ? 1048576 : 524288;
        }
        int i14 = i13;
        if ((2995931 & i14) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            T.f39320b.getClass();
            long j12 = T.f39323e;
            bE2.I(-1189897463);
            long jD2 = V.d(4279537451L);
            bE2.O();
            I81.b.a(null, j12, 0.0f, true, T.c(jD2, 0.5f), r.b(bE2, 1901009513, new l(i14, str, str2, str3, str4, c49758a, bVar, cVar)), bE2, 199728, 5);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new m(i12, str, str2, str3, str4, c49758a, bVar, cVar);
    }
}
