package com.akita.compose.component.navbar;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: NavBarAction.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navbar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k i iVar, @InterfaceC42165v int i12, @Y61.k Y41.a aVar, @Y61.l v.a aVar2, @Y61.l u uVar, @Y61.l A a12, int i13, int i14) {
        int i15;
        u uVar2;
        int i16;
        v.a aVar3;
        u uVar3;
        v.a aVar4;
        B bE2 = a12.E(-434973169);
        if ((i13 & 14) == 0) {
            i15 = (bE2.B(iVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.u(aVar) ? 256 : 128;
        }
        int i17 = i15 | 3072;
        if ((57344 & i13) == 0) {
            if ((i14 & 8) == 0) {
                uVar2 = uVar;
                int i18 = bE2.B(uVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i17 |= i18;
            } else {
                uVar2 = uVar;
            }
            i17 |= i18;
        } else {
            uVar2 = uVar;
        }
        if ((46811 & i17) == 9362 && bE2.c()) {
            bE2.f();
            uVar3 = uVar2;
            aVar4 = aVar2;
        } else {
            bE2.y0();
            if ((i13 & 1) == 0 || bE2.g0()) {
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                if ((i14 & 8) != 0) {
                    uVar2 = (u) bE2.o(v.f62301a);
                    i17 &= -57345;
                }
                i16 = i17;
                aVar3 = aVar5;
            } else {
                bE2.f();
                if ((i14 & 8) != 0) {
                    i17 &= -57345;
                }
                i16 = i17;
                aVar3 = aVar2;
            }
            bE2.Y();
            int i19 = (i16 & 14) | 3072;
            int i22 = i16 >> 3;
            b(iVar, aVar, aVar3, androidx.compose.runtime.internal.r.c(136167706, new b(i12, uVar2), bE2), bE2, i19 | (i22 & 112) | (i22 & 896), 0);
            uVar3 = uVar2;
            aVar4 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(iVar, i12, aVar, aVar4, uVar3, i13, i14);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k i iVar, @Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, @Y61.k C22096n c22096n, @Y61.l A a12, int i12, int i13) {
        int i14;
        B bE2 = a12.E(-480213931);
        if ((i12 & 112) == 0) {
            i14 = (bE2.u(aVar) ? 32 : 16) | i12;
        } else {
            i14 = i12;
        }
        int i15 = i13 & 2;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            i14 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        if ((i14 & 5841) == 1168 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                vVar = androidx.compose.ui.v.f42878y1;
            }
            androidx.compose.ui.semantics.i.f41744b.getClass();
            bE2.C(-583802381);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarB = C21086w0.b(vVar, (androidx.compose.foundation.interaction.m) objT, com.akita.compose.foundation.n.d(0.0f, 6, 0L, false), false, androidx.compose.ui.semantics.i.a(0), aVar, 12);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            H.v((i14 >> 9) & 14, c22096n, bE2, true);
        }
        androidx.compose.ui.v vVar2 = vVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(iVar, aVar, vVar2, c22096n, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k i iVar, @Y61.k String str, @Y61.k Y41.a aVar, @Y61.l v.a aVar2, @Y61.l u uVar, @Y61.l A a12, int i12, int i13) {
        int i14;
        u uVar2;
        v.a aVar3;
        u uVar3;
        v.a aVar4;
        B bE2 = a12.E(-1918180455);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(iVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar) ? 256 : 128;
        }
        int i15 = i14 | 3072;
        if ((57344 & i12) == 0) {
            if ((i13 & 8) == 0) {
                uVar2 = uVar;
                int i16 = bE2.B(uVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i15 |= i16;
            } else {
                uVar2 = uVar;
            }
            i15 |= i16;
        } else {
            uVar2 = uVar;
        }
        if ((i15 & 46811) == 9362 && bE2.c()) {
            bE2.f();
            uVar3 = uVar2;
            aVar4 = aVar2;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar3 = androidx.compose.ui.v.f42878y1;
                if ((i13 & 8) != 0) {
                    uVar2 = (u) bE2.o(v.f62301a);
                }
            } else {
                bE2.f();
                aVar3 = aVar2;
            }
            bE2.Y();
            S.a(com.akita.compose.foundation.d.f63579a.b(uVar2.f62297h.f63644a), androidx.compose.runtime.internal.r.c(-1311090599, new e(iVar, aVar, aVar3, str, uVar2), bE2), bE2, 56);
            uVar3 = uVar2;
            aVar4 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(iVar, str, aVar, aVar4, uVar3, i12, i13);
        }
    }
}
