package com.akita.compose.component.toast_bar;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ToastBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"toast-bar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H {
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.akita.compose.component.toast_bar.InterfaceC27357f r21, @Y61.l androidx.compose.ui.v r22, @Y61.l Y41.q r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.toast_bar.H.a(com.akita.compose.component.toast_bar.f, androidx.compose.ui.v, Y41.q, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k C22096n c22096n, @Y61.k Y41.q qVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l T1 t12, @Y61.l T1 t13, @Y61.l com.akita.compose.foundation.p pVar, float f12, float f13, float f14, float f15, float f16, float f17, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        float f18;
        float f19;
        float f22;
        float f23;
        float f24;
        androidx.compose.runtime.B bE2 = a12.E(-1057508412);
        if ((i12 & 14) == 0) {
            i14 = (bE2.u(c22096n) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(qVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.B(t12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= bE2.B(t13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i14 |= bE2.B(pVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.k(f12) ? 1048576 : 524288;
        }
        int i15 = 128 & i13;
        if (i15 != 0) {
            i14 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            i14 |= bE2.k(f13) ? 8388608 : 4194304;
        }
        int i16 = 256 & i13;
        if (i16 != 0) {
            i14 |= 100663296;
            f18 = f14;
        } else {
            f18 = f14;
            if ((i12 & 234881024) == 0) {
                i14 |= bE2.k(f18) ? 67108864 : 33554432;
            }
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.k(f15) ? 536870912 : 268435456;
        }
        int i17 = (bE2.k(f16) ? (char) 4 : (char) 2) | (bE2.k(f17) ? ' ' : (char) 16);
        if ((i14 & 1533916891) == 306783378 && (i17 & 91) == 18 && bE2.c()) {
            bE2.f();
            f23 = f13;
            f24 = f18;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                if (i15 != 0) {
                    f19 = 0;
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                } else {
                    f19 = f13;
                }
                if (i16 != 0) {
                    f22 = 0;
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                }
                bE2.Y();
                int i18 = i14 >> 6;
                int i19 = i14 >> 9;
                c(vVar, t12, pVar, f12, androidx.compose.runtime.internal.r.c(-1013070755, new E(t13, f17, f22, f15, f16, f19, c22096n, qVar), bE2), bE2, (i18 & 112) | (i18 & 14) | 24576 | (i19 & 896) | (i19 & 7168));
                f23 = f19;
                f24 = f22;
            } else {
                bE2.f();
                f19 = f13;
            }
            f22 = f18;
            bE2.Y();
            int i182 = i14 >> 6;
            int i192 = i14 >> 9;
            c(vVar, t12, pVar, f12, androidx.compose.runtime.internal.r.c(-1013070755, new E(t13, f17, f22, f15, f16, f19, c22096n, qVar), bE2), bE2, (i182 & 112) | (i182 & 14) | 24576 | (i192 & 896) | (i192 & 7168));
            f23 = f19;
            f24 = f22;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new F(c22096n, qVar, vVar, t12, t13, pVar, f12, f23, f24, f15, f16, f17, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(@Y61.l androidx.compose.ui.v vVar, @Y61.l T1 t12, @Y61.l com.akita.compose.foundation.p pVar, float f12, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(543625581);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(t12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(pVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.k(f12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.n.a(R1.h(C20588k2.s(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 640, 0.0f, 11), t12).d0(vVar), androidx.compose.foundation.shape.o.a(f12), 0.0f, pVar, null, c22096n, bE2, ((i13 << 3) & 7168) | ((i13 << 6) & 3670016), 52);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new G(vVar, t12, pVar, f12, c22096n, i12);
        }
    }
}
