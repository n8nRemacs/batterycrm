package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Chip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21762o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f36935a;

    static {
        float f12 = 8;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f36935a = f12;
        androidx.compose.foundation.layout.R1.c(f12, 0.0f, 2);
        androidx.compose.foundation.layout.R1.c(f12, 0.0f, 2);
        androidx.compose.foundation.layout.R1.c(f12, 0.0f, 2);
    }

    public static final void a(Y41.p pVar, androidx.compose.ui.text.x0 x0Var, long j12, Y41.p pVar2, C22096n c22096n, Y41.p pVar3, long j13, long j14, float f12, androidx.compose.foundation.layout.V1 v12, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-782878228);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(pVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(x0Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(pVar2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.u(pVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i13 |= bE2.n(j13) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= bE2.n(j14) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= bE2.k(f12) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i13 |= bE2.B(v12) ? 536870912 : 268435456;
        }
        if ((i13 & 306783379) == 306783378 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{L3.f35042a.b(androidx.compose.ui.graphics.T.a(j12)), C21914uj.f37441a.b(x0Var)}, androidx.compose.runtime.internal.r.b(bE2, 1748799148, new Y2(f12, v12, c22096n, pVar2, pVar3, j13, pVar, j14)), bE2, 48);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Z2(pVar, x0Var, j12, pVar2, c22096n, pVar3, j13, j14, f12, v12, i12);
        }
    }
}
