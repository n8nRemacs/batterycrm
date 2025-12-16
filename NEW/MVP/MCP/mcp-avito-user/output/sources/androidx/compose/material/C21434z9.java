package androidx.compose.material;

import androidx.compose.foundation.layout.C20560e;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Snackbar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21434z9 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f34442a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f34443b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f34444c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f34445d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f34446e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f34447f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f34448g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f34449h;

    /* renamed from: i, reason: collision with root package name */
    public static final float f34450i;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f34442a = 30;
        f34443b = 16;
        float f12 = 8;
        f34444c = f12;
        f34445d = 2;
        f34446e = 6;
        f34447f = f12;
        f34448g = 12;
        f34449h = 48;
        f34450i = 68;
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l C22096n c22096n, @Y61.l androidx.compose.foundation.shape.e eVar, long j12, long j13, float f12, @Y61.k C22096n c22096n2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-558258760);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(c22096n) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.j(false) ? 256 : 128;
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
        if ((i12 & 1572864) == 0) {
            i13 |= bE2.k(f12) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= bE2.u(c22096n2) ? 8388608 : 4194304;
        }
        if (bE2.p(i13 & 1, (4793491 & i13) != 4793490)) {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            int i14 = i13 >> 6;
            M9.a(vVar, eVar, j12, j13, f12, androidx.compose.runtime.internal.r.c(-2084221700, new C21315q9(c22096n, c22096n2), bE2), bE2, (i13 & 14) | 1572864 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | ((i13 >> 3) & 458752), 16);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21327r9(vVar, c22096n, eVar, j12, j13, f12, c22096n2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k U8 u82, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.foundation.shape.e eVar, long j12, long j13, long j14, float f12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.ui.v vVar2;
        androidx.compose.foundation.shape.e eVar2;
        long j15;
        long j16;
        long j17;
        float f13;
        androidx.compose.ui.v vVar3;
        long jG2;
        long j18;
        float f14;
        long j19;
        int i14;
        long j22;
        U8 u83;
        C22096n c22096nC;
        androidx.compose.runtime.B bE2 = a12.E(258660814);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? bE2.B(u82) : bE2.u(u82) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i15 = i13 | 432;
        if ((i12 & 3072) == 0) {
            i15 = i13 | 1456;
        }
        if ((i12 & 24576) == 0) {
            i15 |= 8192;
        }
        if ((196608 & i12) == 0) {
            i15 |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i15 |= 524288;
        }
        int i16 = i15 | 12582912;
        if (bE2.p(i16 & 1, (4793491 & i16) != 4793490)) {
            bE2.y0();
            if ((1 & i12) == 0 || bE2.g0()) {
                vVar3 = androidx.compose.ui.v.f42878y1;
                C21365u5 c21365u5 = C21365u5.f34242a;
                c21365u5.getClass();
                androidx.compose.foundation.shape.e eVar3 = C21365u5.b(bE2).f33550a;
                V8 v82 = V8.f33282a;
                v82.getClass();
                long jA2 = V8.a(bE2);
                c21365u5.getClass();
                long jF2 = C21365u5.a(bE2).f();
                v82.getClass();
                c21365u5.getClass();
                C21308q2 c21308q2A = C21365u5.a(bE2);
                if (c21308q2A.g()) {
                    eVar2 = eVar3;
                    jG2 = androidx.compose.ui.graphics.V.g(androidx.compose.ui.graphics.T.c(c21308q2A.f(), 0.6f), c21308q2A.d());
                } else {
                    eVar2 = eVar3;
                    jG2 = ((androidx.compose.ui.graphics.T) ((C22082i3) c21308q2A.f33984b).getF42167b()).f39331a;
                }
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                j18 = jG2;
                f14 = 6;
                j19 = jA2;
                i14 = i16 & (-4193281);
                j22 = jF2;
            } else {
                bE2.f();
                int i17 = i16 & (-4193281);
                vVar3 = vVar;
                eVar2 = eVar;
                j22 = j13;
                j18 = j14;
                f14 = f12;
                i14 = i17;
                j19 = j12;
            }
            bE2.Y();
            String strA = u82.a();
            if (strA != null) {
                bE2.C(1609221416);
                u83 = u82;
                c22096nC = androidx.compose.runtime.internal.r.c(1843479216, new C21395w9(j18, u83, strA), bE2);
                bE2.X(false);
            } else {
                u83 = u82;
                bE2.C(1609519419);
                bE2.X(false);
                c22096nC = null;
            }
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            a(androidx.compose.foundation.layout.R1.i(vVar3, 12), c22096nC, eVar2, j19, j22, f14, androidx.compose.runtime.internal.r.c(-261845785, new C21343s9(u83), bE2), bE2, (i14 & 896) | 12582912 | ((i14 >> 3) & 3670016));
            vVar2 = vVar3;
            f13 = f14;
            j17 = j18;
            j16 = j22;
            j15 = j19;
        } else {
            bE2.f();
            vVar2 = vVar;
            eVar2 = eVar;
            j15 = j12;
            j16 = j13;
            j17 = j14;
            f13 = f12;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21356t9(u82, vVar2, eVar2, j15, j16, j17, f13, i12);
        }
    }

    public static final void c(C22096n c22096n, C22096n c22096n2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        C22096n c22096n3;
        androidx.compose.runtime.B bE2 = a12.E(-1229075900);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(c22096n) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(c22096n2) ? 32 : 16;
        }
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            float f12 = f34443b;
            float f13 = f34444c;
            androidx.compose.ui.v vVarM = androidx.compose.foundation.layout.R1.m(vVarD, f12, 0.0f, f13, f34445d, 2);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            androidx.compose.runtime.R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            androidx.compose.ui.v vVarM2 = androidx.compose.foundation.layout.R1.m(C20560e.d(aVar, f34442a, f34448g), 0.0f, 0.0f, f13, 0.0f, 11);
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i15 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarM2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            androidx.compose.foundation.H.v(i13 & 14, c22096n, bE2, true);
            androidx.compose.ui.v vVarC3 = k12.c(aVar, InterfaceC22215f.a.f39090p);
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
            int i16 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarC3);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D2);
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC4);
            c22096n3 = c22096n2;
            androidx.compose.foundation.H.w((i13 >> 3) & 14, c22096n3, bE2, true, true);
        } else {
            c22096n3 = c22096n2;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21250l9(c22096n, c22096n3, i12);
        }
    }

    public static final void d(C22096n c22096n, C22096n c22096n2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        C22096n c22096n3;
        androidx.compose.runtime.B bE2 = a12.E(-534813202);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(c22096n) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(c22096n2) ? 32 : 16;
        }
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarM = androidx.compose.foundation.layout.R1.m(aVar, f34443b, 0.0f, f34444c, 0.0f, 10);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new C21263m9();
                bE2.H(objT);
            }
            InterfaceC22365i0 interfaceC22365i0 = (InterfaceC22365i0) objT;
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC);
            androidx.compose.ui.v vVarK = androidx.compose.foundation.layout.R1.k(0.0f, f34446e, 1, androidx.compose.ui.layout.C.b(aVar, "text"));
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i15 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            androidx.compose.foundation.H.v(i13 & 14, c22096n, bE2, true);
            androidx.compose.ui.v vVarB = androidx.compose.ui.layout.C.b(aVar, "action");
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
            int i16 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D2);
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC3);
            c22096n3 = c22096n2;
            androidx.compose.foundation.H.w((i13 >> 3) & 14, c22096n3, bE2, true, true);
        } else {
            c22096n3 = c22096n2;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21276n9(c22096n, c22096n3, i12);
        }
    }

    public static final void e(C22096n c22096n, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(917397959);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(c22096n) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (bE2.p(i13 & 1, (i13 & 3) != 2)) {
            C21408x9 c21408x9 = C21408x9.f34409a;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            androidx.compose.runtime.R3.b(pVar, bE2, c21408x9);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC);
            androidx.compose.ui.v vVarJ = androidx.compose.foundation.layout.R1.j(aVar, f34443b, f34446e);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarJ);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            androidx.compose.runtime.R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            androidx.compose.foundation.H.w(i13 & 14, c22096n, bE2, true, true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21421y9(c22096n, i12);
        }
    }
}
