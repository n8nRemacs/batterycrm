package com.akita.compose.component.pull_to_refresh;

import Y41.p;
import androidx.compose.animation.F0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.foundation.C20835r0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.graphics.drawscope.o;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PullToRefresh.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"pull-to-refresh_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(j jVar, boolean z12, l lVar, v vVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1652001686);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(jVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(lVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v vVarA = C22274n0.a(vVar, new d(jVar, lVar));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            F0.b(Boolean.valueOf(z12), null, C20310q.e(100, 0, null, 6), "loading", r.c(-2081795621, new e(jVar, lVar), bE2), bE2, ((i13 >> 3) & 14) | 28032, 2);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(jVar, z12, lVar, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.akita.compose.component.pull_to_refresh.j r21, boolean r22, @Y61.k Y41.a r23, @Y61.l androidx.compose.ui.v r24, @Y61.l com.akita.compose.component.pull_to_refresh.l r25, @Y61.l androidx.compose.ui.i r26, @Y61.k androidx.compose.runtime.internal.C22096n r27, @Y61.l androidx.compose.runtime.A r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.pull_to_refresh.i.b(com.akita.compose.component.pull_to_refresh.j, boolean, Y41.a, androidx.compose.ui.v, com.akita.compose.component.pull_to_refresh.l, androidx.compose.ui.i, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    public static final void c(j jVar, com.akita.compose.component.spinner.h hVar, v vVar, A a12, int i12) {
        int i13;
        v vVar2;
        B bE2 = a12.E(-455483883);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(jVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(hVar) ? 32 : 16;
        }
        if (((i13 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = v.f42878y1;
            long jC2 = hVar.f62823b.c(bE2);
            float fM02 = ((androidx.compose.ui.unit.d) bE2.o(Q0.f41199h)).M0(hVar.f62824c);
            m1.f39698b.getClass();
            C20835r0.a(0, new b(jVar, new o(fM02, 0.0f, m1.f39699c, 0, null, 26, null), jC2), bE2, C20588k2.o(androidx.compose.ui.semantics.r.b(vVar2, true, new a(jVar)), hVar.f62822a));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(jVar, hVar, vVar2, i12);
        }
    }
}
