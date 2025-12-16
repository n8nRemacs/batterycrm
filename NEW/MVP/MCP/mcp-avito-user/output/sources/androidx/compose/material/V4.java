package androidx.compose.material;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: FloatingActionButton.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33274a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f33275b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33276c;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33274a = 56;
        f33275b = 48;
        f33276c = 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.runtime.internal.C22096n r21, @Y61.k Y41.a r22, @Y61.l androidx.compose.ui.v.a r23, @Y61.l androidx.compose.foundation.shape.e r24, long r25, long r27, @Y61.l androidx.compose.material.K4 r29, @Y61.l androidx.compose.runtime.A r30, int r31) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.V4.a(androidx.compose.runtime.internal.n, Y41.a, androidx.compose.ui.v$a, androidx.compose.foundation.shape.e, long, long, androidx.compose.material.K4, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.foundation.shape.e eVar, long j12, long j13, @Y61.l K4 k42, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(1028985328);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(null) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(eVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.n(j12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.n(j13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i13 |= bE2.B(k42) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? 8388608 : 4194304;
        }
        if (bE2.p(i13 & 1, (4793491 & i13) != 4793490)) {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            bE2.C(-1991740377);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            b12 = bE2;
            M9.b(aVar, androidx.compose.ui.semantics.r.b(vVar, false, Q4.f33078l), false, eVar, j12, j13, null, ((androidx.compose.ui.unit.h) k42.a(mVar, bE2, (i13 >> 15) & 112).getF42167b()).f42852b, mVar, androidx.compose.runtime.internal.r.c(1972871863, new T4(j13, c22096n), bE2), b12, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
        } else {
            b12 = bE2;
            b12.f();
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new U4(aVar, vVar, eVar, j12, j13, k42, c22096n, i12);
        }
    }
}
