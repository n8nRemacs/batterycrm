package androidx.compose.material;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AlertDialog.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21279o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f33847a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f33848b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f33849c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f33850d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f33851e;

    static {
        v.a aVar = androidx.compose.ui.v.f42878y1;
        float f12 = 24;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        f33847a = androidx.compose.foundation.layout.R1.m(aVar, f12, 0.0f, f12, 0.0f, 10);
        f33848b = androidx.compose.foundation.layout.R1.m(aVar, f12, 0.0f, f12, 28, 2);
        f33849c = androidx.compose.ui.unit.z.e(40);
        f33850d = androidx.compose.ui.unit.z.e(36);
        f33851e = androidx.compose.ui.unit.z.e(38);
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k androidx.compose.foundation.layout.K k12, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        boolean z13;
        androidx.compose.runtime.B bE2 = a12.E(-555573207);
        int i13 = (bE2.u(c22096n) ? 32 : 16) | i12 | (bE2.u(c22096n2) ? 256 : 128);
        if (bE2.p(i13 & 1, (i13 & 147) != 146)) {
            androidx.compose.ui.v vVarA = k12.a(androidx.compose.ui.v.f42878y1, 1.0f, false);
            C21110b c21110b = C21110b.f33439a;
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            androidx.compose.runtime.R3.b(pVar, bE2, c21110b);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC);
            if (c22096n == null) {
                bE2.C(1317321954);
                bE2.X(false);
                z12 = false;
            } else {
                bE2.C(1317321955);
                androidx.compose.ui.v vVarB = androidx.compose.ui.layout.C.b(f33847a, "title");
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.v vVarC2 = k12.c(vVarB, InterfaceC22215f.a.f39088n);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i15 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S2 = bE2.S();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarC2);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar);
                } else {
                    bE2.d();
                }
                androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D);
                androidx.compose.runtime.R3.b(pVar2, bE2, o1S2);
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar3);
                }
                androidx.compose.runtime.R3.b(pVar4, bE2, vVarC3);
                C20644z c20644z = C20644z.f28804a;
                z12 = false;
                androidx.compose.foundation.H.w(0, c22096n, bE2, true, false);
            }
            if (c22096n2 == null) {
                bE2.C(1317454758);
                bE2.X(z12);
                z13 = true;
            } else {
                bE2.C(1317454759);
                androidx.compose.ui.v vVarB2 = androidx.compose.ui.layout.C.b(f33848b, "text");
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.v vVarC4 = k12.c(vVarB2, InterfaceC22215f.a.f39088n);
                InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i16 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S3 = bE2.S();
                androidx.compose.ui.v vVarC5 = androidx.compose.ui.n.c(bE2, vVarC4);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar);
                } else {
                    bE2.d();
                }
                androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D2);
                androidx.compose.runtime.R3.b(pVar2, bE2, o1S3);
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                    AK.c.y(i16, bE2, i16, pVar3);
                }
                androidx.compose.runtime.R3.b(pVar4, bE2, vVarC5);
                C20644z c20644z2 = C20644z.f28804a;
                z13 = true;
                androidx.compose.foundation.H.w(0, c22096n2, bE2, true, false);
            }
            bE2.X(z13);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21123c(k12, c22096n, c22096n2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k C22096n c22096n, @Y61.l androidx.compose.ui.v vVar, @Y61.l Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.l androidx.compose.ui.graphics.h1 h1Var, long j12, long j13, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-453679601);
        int i13 = i12 | (bE2.u(c22096n) ? 4 : 2) | (bE2.B(vVar) ? 32 : 16) | (bE2.u(pVar) ? 256 : 128) | (bE2.u(pVar2) ? 2048 : 1024) | (bE2.B(h1Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.n(j12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) | (bE2.n(j13) ? 1048576 : 524288);
        if (bE2.p(i13 & 1, (599187 & i13) != 599186)) {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            int i14 = ((i13 >> 3) & 14) | 1572864;
            int i15 = i13 >> 9;
            M9.a(vVar, h1Var, j12, j13, 0.0f, androidx.compose.runtime.internal.r.c(629950291, new C21188h(pVar, pVar2, c22096n), bE2), bE2, (i15 & 7168) | i14 | (i15 & 112) | (i15 & 896), 48);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21201i(c22096n, vVar, pVar, pVar2, h1Var, j12, j13, i12);
        }
    }
}
