package androidx.compose.material3;

import androidx.compose.foundation.C20805p0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Card.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D2 {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.graphics.h1 h1Var, @Y61.l C21807q2 c21807q2, @Y61.l C21897u2 c21897u2, @Y61.l C20805p0 c20805p0, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1179621553);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(h1Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(c21807q2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(c21897u2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.B(c20805p0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((74899 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            long j12 = c21807q2.f37135a;
            float f12 = c21897u2.f37393a;
            bE2.I(-1763481333);
            bE2.I(-1409178619);
            bE2.I(-1409178567);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22126m3.g(androidx.compose.ui.unit.h.a(c21897u2.f37393a));
                bE2.H(objT);
            }
            bE2.O();
            bE2.O();
            bE2.O();
            Qg.a(vVar, h1Var, j12, c21807q2.f37136b, f12, ((androidx.compose.ui.unit.h) ((InterfaceC22204y1) objT).getF42167b()).f42852b, c20805p0, androidx.compose.runtime.internal.r.b(bE2, 664103990, new C21919v2(c22096n)), bE2, (i13 & 14) | 12582912 | (i13 & 112) | ((i13 << 6) & 3670016), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21941w2(vVar, h1Var, c21807q2, c21897u2, c20805p0, c22096n, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.graphics.h1 h1Var, @Y61.l C21807q2 c21807q2, @Y61.l C21897u2 c21897u2, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(895940201);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(h1Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(c21807q2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(c21897u2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i13 & 9363) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            a(vVar, h1Var, c21807q2, c21897u2, null, c22096n, bE2, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | ((i13 << 3) & 458752));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C22007z2(vVar, h1Var, c21807q2, c21897u2, c22096n, i12);
        }
    }
}
