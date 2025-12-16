package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Divider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21114b3 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.ui.v vVar, long j12, float f12, float f13, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        float f14;
        float f15;
        float f40389c;
        androidx.compose.runtime.B bE2 = a12.E(-1249392198);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.k(f12) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if (bE2.p(i14 & 1, (i14 & 1171) != 1170)) {
            bE2.y0();
            if ((1 & i12) == 0 || bE2.g0()) {
                f15 = 0;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
            } else {
                bE2.f();
                f15 = f13;
            }
            bE2.Y();
            androidx.compose.ui.v vVarM = f15 == 0.0f ? androidx.compose.ui.v.f42878y1 : androidx.compose.foundation.layout.R1.m(androidx.compose.ui.v.f42878y1, f15, 0.0f, 0.0f, 0.0f, 14);
            androidx.compose.ui.unit.h.f42849c.getClass();
            if (androidx.compose.ui.unit.h.b(f12, 0.0f)) {
                bE2.C(-129273423);
                f40389c = 1.0f / ((androidx.compose.ui.unit.d) bE2.o(androidx.compose.ui.platform.Q0.f41199h)).getF40389c();
                bE2.X(false);
            } else {
                bE2.C(-129206866);
                bE2.X(false);
                f40389c = f12;
            }
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.f(C20588k2.d(vVar.d0(vVarM), 1.0f), f40389c), j12, androidx.compose.ui.graphics.Y0.f39346a), bE2, 0);
            f14 = f15;
        } else {
            bE2.f();
            f14 = f13;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21101a3(vVar, j12, f12, f14, i12);
        }
    }
}
