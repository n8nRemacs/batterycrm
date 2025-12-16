package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.foundation.C20805p0;
import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import shark.AndroidResourceIdNames;

/* compiled from: Chip.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21693l3 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36773A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f36774B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f36775C;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f36776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36777m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f36778n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f36779o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36780p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f36781q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36782r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f36783s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36784t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36785u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C21997ye f36786v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Be f36787w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C20805p0 f36788x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f36789y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.V1 f36790z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21693l3(boolean z12, androidx.compose.ui.v vVar, Y41.a aVar, boolean z13, Y41.p pVar, androidx.compose.ui.text.x0 x0Var, Y41.p pVar2, C22096n c22096n, Y41.p pVar3, androidx.compose.ui.graphics.h1 h1Var, C21997ye c21997ye, Be be2, C20805p0 c20805p0, float f12, androidx.compose.foundation.layout.V1 v12, androidx.compose.foundation.interaction.m mVar, int i12, int i13) {
        super(2);
        this.f36776l = z12;
        this.f36777m = vVar;
        this.f36778n = aVar;
        this.f36779o = z13;
        this.f36780p = pVar;
        this.f36781q = x0Var;
        this.f36782r = pVar2;
        this.f36783s = c22096n;
        this.f36784t = pVar3;
        this.f36785u = h1Var;
        this.f36786v = c21997ye;
        this.f36787w = be2;
        this.f36788x = c20805p0;
        this.f36789y = f12;
        this.f36790z = v12;
        this.f36773A = mVar;
        this.f36774B = i12;
        this.f36775C = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        androidx.compose.foundation.layout.V1 v12;
        long j12;
        androidx.compose.ui.v vVar;
        long j13;
        float f12;
        float f13;
        androidx.compose.ui.v vVar2;
        int i14;
        Be be2;
        androidx.compose.foundation.interaction.m mVar;
        int i15;
        C22096n c22096n;
        boolean z12;
        androidx.compose.animation.core.r rVar;
        float f14;
        num.intValue();
        int iA2 = C22066f2.a(this.f36774B | 1);
        int iA3 = C22066f2.a(this.f36775C);
        float f15 = C21762o3.f36935a;
        androidx.compose.runtime.B bE2 = a12.E(402951308);
        int i16 = iA2 & 6;
        boolean z13 = this.f36776l;
        if (i16 == 0) {
            i12 = (bE2.j(z13) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i17 = iA2 & 48;
        androidx.compose.ui.v vVar3 = this.f36777m;
        if (i17 == 0) {
            i12 |= bE2.B(vVar3) ? 32 : 16;
        }
        int i18 = iA2 & 384;
        Y41.a<kotlin.G0> aVar = this.f36778n;
        if (i18 == 0) {
            i12 |= bE2.u(aVar) ? 256 : 128;
        }
        int i19 = iA2 & 3072;
        boolean z14 = this.f36779o;
        if (i19 == 0) {
            i12 |= bE2.j(z14) ? 2048 : 1024;
        }
        int i22 = iA2 & 24576;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f36780p;
        if (i22 == 0) {
            i12 |= bE2.u(pVar) ? 16384 : 8192;
        }
        int i23 = iA2 & 196608;
        androidx.compose.ui.text.x0 x0Var = this.f36781q;
        int i24 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        if (i23 == 0) {
            i12 |= bE2.B(x0Var) ? 131072 : 65536;
        }
        int i25 = iA2 & 1572864;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f36782r;
        if (i25 == 0) {
            i12 |= bE2.u(pVar2) ? 1048576 : 524288;
        }
        int i26 = iA2 & 12582912;
        C22096n c22096n2 = this.f36783s;
        if (i26 == 0) {
            i12 |= bE2.u(c22096n2) ? 8388608 : 4194304;
        }
        int i27 = iA2 & 100663296;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f36784t;
        if (i27 == 0) {
            i12 |= bE2.u(pVar3) ? 67108864 : 33554432;
        }
        int i28 = iA2 & 805306368;
        androidx.compose.ui.graphics.h1 h1Var = this.f36785u;
        if (i28 == 0) {
            i12 |= bE2.B(h1Var) ? 536870912 : 268435456;
        }
        int i29 = iA3 & 6;
        C21997ye c21997ye = this.f36786v;
        if (i29 == 0) {
            i13 = (bE2.B(c21997ye) ? 4 : 2) | iA3;
        } else {
            i13 = iA3;
        }
        int i32 = iA3 & 48;
        Be be3 = this.f36787w;
        if (i32 == 0) {
            i13 |= bE2.B(be3) ? 32 : 16;
        }
        int i33 = iA3 & 384;
        C20805p0 c20805p0 = this.f36788x;
        if (i33 == 0) {
            i13 |= bE2.B(c20805p0) ? 256 : 128;
        }
        int i34 = iA3 & 3072;
        float f16 = this.f36789y;
        if (i34 == 0) {
            i13 |= bE2.k(f16) ? 2048 : 1024;
        }
        int i35 = iA3 & 24576;
        androidx.compose.foundation.layout.V1 v13 = this.f36790z;
        if (i35 == 0) {
            i13 |= bE2.B(v13) ? 16384 : 8192;
        }
        int i36 = 196608 & iA3;
        androidx.compose.foundation.interaction.m mVar2 = this.f36773A;
        if (i36 == 0) {
            if (bE2.B(mVar2)) {
                i24 = 131072;
            }
            i13 |= i24;
        }
        if ((306783379 & i12) == 306783378 && (74899 & i13) == 74898 && bE2.c()) {
            bE2.f();
            c22096n = c22096n2;
            be2 = be3;
            vVar = vVar3;
            v12 = v13;
            mVar = mVar2;
        } else {
            androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(vVar3, false, C21647j3.f36607l);
            int i37 = (i12 >> 9) & 14;
            c21997ye.getClass();
            bE2.I(-2126903408);
            if (z14) {
                v12 = v13;
                j12 = !z13 ? c21997ye.f37773a : c21997ye.f37781i;
            } else {
                v12 = v13;
                j12 = z13 ? c21997ye.f37782j : c21997ye.f37777e;
            }
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(androidx.compose.ui.graphics.T.a(j12), bE2);
            bE2.X(false);
            long j14 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M.getF42167b()).f39331a;
            if (be3 != null) {
                vVar = vVar3;
                f12 = z14 ? be3.f34558a : be3.f34563f;
                j13 = j14;
            } else {
                vVar = vVar3;
                j13 = j14;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                f12 = 0;
            }
            bE2.I(1036687729);
            if (be3 == null) {
                vVar2 = vVarB;
                i15 = i12;
                i14 = i13;
                c22096n = c22096n2;
                be2 = be3;
                f13 = f12;
                mVar = mVar2;
                z12 = false;
                rVar = null;
            } else {
                int i38 = ((i13 << 3) & 896) | i37 | ((i13 >> 12) & 112);
                bE2.I(-1888175651);
                bE2.I(664514136);
                bE2.I(-699454716);
                Object objT = bE2.t();
                androidx.compose.runtime.A.f37866a.getClass();
                f13 = f12;
                Object obj = A.a.f37868b;
                if (objT == obj) {
                    objT = new androidx.compose.runtime.snapshots.D();
                    bE2.H(objT);
                }
                androidx.compose.runtime.snapshots.D d12 = (androidx.compose.runtime.snapshots.D) objT;
                vVar2 = vVarB;
                bE2.X(false);
                bE2.I(-699454638);
                Object objT2 = bE2.t();
                if (objT2 == obj) {
                    objT2 = C22126m3.g(null);
                    bE2.H(objT2);
                }
                InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
                bE2.X(false);
                bE2.I(-699454548);
                i14 = i13;
                boolean z15 = (((i38 & 112) ^ 48) > 32 && bE2.B(mVar2)) || (i38 & 48) == 32;
                Object objT3 = bE2.t();
                if (z15 || objT3 == obj) {
                    objT3 = new C22019ze(mVar2, d12, null);
                    bE2.H(objT3);
                }
                bE2.X(false);
                C22187u0.d((Y41.p) objT3, bE2, mVar2);
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) C42745f0.S(d12);
                float f17 = !z14 ? be3.f34563f : jVar instanceof o.b ? be3.f34559b : jVar instanceof g.a ? be3.f34561d : jVar instanceof d.a ? be3.f34560c : jVar instanceof a.b ? be3.f34562e : be3.f34558a;
                bE2.I(-699452563);
                Object objT4 = bE2.t();
                if (objT4 == obj) {
                    objT4 = new C20268c(androidx.compose.ui.unit.h.a(f17), androidx.compose.animation.core.J1.f26077c, null, null, 12, null);
                    bE2.H(objT4);
                }
                C20268c c20268c = (C20268c) objT4;
                be2 = be3;
                bE2.X(false);
                androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(f17);
                mVar = mVar2;
                bE2.I(-699452479);
                i15 = i12;
                c22096n = c22096n2;
                boolean zU2 = ((((i38 & 14) ^ 6) > 4 && bE2.j(z14)) || (i38 & 6) == 4) | bE2.u(c20268c) | bE2.k(f17) | bE2.u(jVar);
                Object objT5 = bE2.t();
                if (zU2 || objT5 == obj) {
                    objT5 = new Ae(c20268c, f17, z14, jVar, interfaceC22204y1, null);
                    bE2.H(objT5);
                }
                z12 = false;
                bE2.X(false);
                C22187u0.d((Y41.p) objT5, bE2, hVarA);
                rVar = c20268c.f26225d;
                bE2.X(false);
                bE2.X(false);
            }
            bE2.X(z12);
            if (rVar != null) {
                f14 = ((androidx.compose.ui.unit.h) ((C22082i3) rVar.f26397c).getF42167b()).f42852b;
            } else {
                f14 = 0;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            }
            int i39 = i15;
            Qg.b(z13, aVar, vVar2, z14, h1Var, j13, 0L, f13, f14, c20805p0, mVar, androidx.compose.runtime.internal.r.b(bE2, -577614814, new C21670k3(c21997ye, z14, z13, pVar, x0Var, pVar2, c22096n, pVar3, f16, v12)), bE2, (i15 & 14) | ((i15 >> 3) & 112) | (i39 & 7168) | ((i39 >> 15) & 57344) | ((i14 << 21) & 1879048192), 64);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21693l3(z13, vVar, aVar, z14, pVar, x0Var, pVar2, c22096n, pVar3, h1Var, c21997ye, be2, c20805p0, f16, v12, mVar, iA2, iA3);
        }
        return kotlin.G0.f406611a;
    }
}
