package com.akita.compose.component.accordion;

import androidx.compose.animation.C20340d0;
import androidx.compose.animation.H0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.N;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Accordion.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"accordion_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(C22602e c22602e, boolean z12, Y41.l lVar, com.akita.compose.foundation.r rVar, androidx.compose.ui.v vVar, boolean z13, int i12, N n12, float f12, V1 v12, float f13, Y41.p pVar, Y41.p pVar2, C22096n c22096n, A a12, int i13, int i14) {
        int i15;
        int i16;
        B b12;
        B bE2 = a12.E(454332581);
        if ((i13 & 14) == 0) {
            i15 = (bE2.B(c22602e) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i15 |= bE2.B(rVar) ? 2048 : 1024;
        }
        if ((i13 & 57344) == 0) {
            i15 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i13 & 458752) == 0) {
            i15 |= bE2.j(z13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i13 & 3670016) == 0) {
            i15 |= bE2.m(i12) ? 1048576 : 524288;
        }
        if ((i13 & 29360128) == 0) {
            i15 |= bE2.B(n12) ? 8388608 : 4194304;
        }
        if ((i13 & 234881024) == 0) {
            i15 |= bE2.k(f12) ? 67108864 : 33554432;
        }
        if ((i13 & 1879048192) == 0) {
            i15 |= bE2.B(v12) ? 536870912 : 268435456;
        }
        if ((i14 & 14) == 0) {
            i16 = i14 | (bE2.k(f13) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 112) == 0) {
            i16 |= bE2.u(pVar) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i16 |= bE2.u(pVar2) ? 256 : 128;
        }
        if ((i14 & 7168) == 0) {
            i16 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        int i17 = i16;
        if ((i15 & 1533916891) == 306783378 && (i17 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar3);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            bE2.C(-676519028);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            bE2.C(-676522620);
            int i19 = i15 & 112;
            boolean z14 = ((i15 & 896) == 256) | (i19 == 32);
            Object objT2 = bE2.t();
            if (z14 || objT2 == c1651a) {
                objT2 = new f(lVar, z12);
                bE2.H(objT2);
            }
            bE2.X(false);
            int i22 = i17 << 3;
            com.akita.compose.component.accordion.internal.d.a(c22602e, rVar, pVar, pVar2, z13, f13, R1.k(f12, 0.0f, 2, C21086w0.b(aVar2, mVar, null, false, null, (Y41.a) objT2, 28)), bE2, ((i15 >> 3) & 57344) | (i15 & 14) | ((i15 >> 6) & 112) | (i22 & 896) | (i22 & 7168) | ((i17 << 15) & 458752));
            G1 g1E = C20310q.e(i12, 0, n12, 2);
            G1 g1E2 = C20310q.e(i12, 0, n12, 2);
            C20340d0.b(k12, z12, null, H0.d(g1E, 2).b(H0.c(g1E2, 14)), H0.e(g1E, 2).b(H0.i(g1E2, 14)), null, androidx.compose.runtime.internal.r.c(1498832883, new g(v12, c22096n), bE2), bE2, 1572870 | i19, 18);
            b12 = bE2;
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(c22602e, z12, lVar, rVar, vVar, z13, i12, n12, f12, v12, f13, pVar, pVar2, c22096n, i13, i14);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k C22602e c22602e, boolean z12, @Y61.k Y41.l lVar, @Y61.k t tVar, @Y61.l androidx.compose.ui.v vVar, boolean z13, boolean z14, float f12, float f13, @Y61.l Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.k C22096n c22096n, @Y61.l A a12, int i12, int i13) {
        int i14;
        int i15;
        B bE2 = a12.E(-463454964);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.B(tVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i14 |= bE2.j(z13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i14 |= bE2.j(z14) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i14 |= bE2.k(f12) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.k(f13) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.u(pVar) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (bE2.u(pVar2) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.u(c22096n) ? 32 : 16;
        }
        if ((1533916891 & i14) == 306783378 && (i15 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            int i16 = i15 << 6;
            a(c22602e, z12, lVar, tVar.f60265a, vVar, z13, tVar.f60272h, tVar.f60273i, f12, R1.e(f13, tVar.f60267c, f13, 0.0f, 8), tVar.f60269e, pVar, pVar2, c22096n, bE2, (517118 & i14) | ((i14 << 3) & 234881024), ((i14 >> 24) & 112) | (i16 & 896) | (i16 & 7168));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(c22602e, z12, lVar, tVar, vVar, z13, z14, f12, f13, pVar, pVar2, c22096n, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(@Y61.k C22602e c22602e, @Y61.k C22602e c22602e2, boolean z12, @Y61.k Y41.l lVar, @Y61.k t tVar, @Y61.l androidx.compose.ui.v vVar, boolean z13, boolean z14, float f12, float f13, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l A a12, int i12, int i13) {
        int i14;
        int i15;
        B b12;
        B bE2 = a12.E(1461322427);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(c22602e2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.j(z12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= bE2.B(tVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.j(z13) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.j(z14) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.k(f12) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.k(f13) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (bE2.u(c22096n) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.u(c22096n2) ? 32 : 16;
        }
        if ((1533916891 & i14) == 306783378 && (i15 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            int i16 = i14 & 14;
            int i17 = i14 >> 3;
            b12 = bE2;
            b(c22602e, z12, lVar, tVar, vVar, z13, z14, f12, f13, c22096n, c22096n2, androidx.compose.runtime.internal.r.c(-1847055658, new l(c22602e2, tVar), bE2), bE2, (i17 & 234881024) | i16 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i15 << 27) & 1879048192), ((i15 >> 3) & 14) | 48);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(c22602e, c22602e2, z12, lVar, tVar, vVar, z13, z14, f12, f13, c22096n, c22096n2, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void d(boolean z12, @Y61.k Y41.l lVar, @Y61.k t tVar, @Y61.l v.a aVar, boolean z13, boolean z14, float f12, float f13, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l A a12, int i12) {
        B b12;
        v.a aVar2;
        C22096n c22096n3;
        C22096n c22096n4;
        float f14;
        float f15;
        B bE2 = a12.E(1052116373);
        int i13 = i12 | (bE2.j(z12) ? 256 : 128) | (bE2.B(tVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 196608 | (bE2.j(z13) ? 1048576 : 524288) | (bE2.j(z14) ? 8388608 : 4194304) | 905969664;
        if ((1533916891 & i13) == 306783378 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            f15 = f12;
            f14 = f13;
            c22096n3 = c22096n;
            c22096n4 = c22096n2;
            b12 = bE2;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            float f16 = 0;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            float f17 = 0;
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(-231515090, new i(z12, tVar, z14), bE2);
            u.f60274a.getClass();
            C22096n c22096n5 = u.f60275b;
            b12 = bE2;
            c(new C22602e("Preview-заголовок", null, 2, null), new C22602e("Все сущее рождается беспричинно, продолжается по недостатку сил и умирает случайно", null, 2, null), z12, lVar, tVar, aVar3, z13, z14, f16, f17, c22096nC, c22096n5, bE2, i13 & 2147483520, 54);
            aVar2 = aVar3;
            c22096n3 = c22096nC;
            c22096n4 = c22096n5;
            f14 = f17;
            f15 = f16;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(z12, lVar, tVar, aVar2, z13, z14, f15, f14, c22096n3, c22096n4, i12);
        }
    }
}
