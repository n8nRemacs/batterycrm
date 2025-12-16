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
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import shark.AndroidResourceIdNames;

/* compiled from: Chip.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class W2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f35720A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f35721B;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35722l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f35723m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f35724n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35725o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f35726p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f35727q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35728r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35729s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f35730t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O2 f35731u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ R2 f35732v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C20805p0 f35733w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f35734x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.V1 f35735y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(androidx.compose.ui.v vVar, Y41.a aVar, boolean z12, Y41.p pVar, androidx.compose.ui.text.x0 x0Var, long j12, Y41.p pVar2, Y41.p pVar3, androidx.compose.ui.graphics.h1 h1Var, O2 o22, R2 r22, C20805p0 c20805p0, float f12, androidx.compose.foundation.layout.V1 v12, androidx.compose.foundation.interaction.m mVar, int i12, int i13) {
        super(2);
        this.f35722l = vVar;
        this.f35723m = aVar;
        this.f35724n = z12;
        this.f35725o = pVar;
        this.f35726p = x0Var;
        this.f35727q = j12;
        this.f35728r = pVar2;
        this.f35729s = pVar3;
        this.f35730t = h1Var;
        this.f35731u = o22;
        this.f35732v = r22;
        this.f35733w = c20805p0;
        this.f35734x = f12;
        this.f35735y = v12;
        this.f35736z = mVar;
        this.f35720A = i12;
        this.f35721B = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        float f12;
        androidx.compose.ui.text.x0 x0Var;
        int i14;
        float f13;
        androidx.compose.foundation.layout.V1 v12;
        androidx.compose.ui.v vVar;
        R2 r22;
        androidx.compose.foundation.interaction.m mVar;
        androidx.compose.ui.v vVar2;
        boolean z12;
        androidx.compose.animation.core.r rVar;
        float f14;
        float f15;
        long j12;
        boolean z13;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2;
        androidx.compose.ui.graphics.h1 h1Var;
        C20805p0 c20805p0;
        androidx.compose.foundation.layout.V1 v13;
        Y41.a<kotlin.G0> aVar;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3;
        O2 o22;
        num.intValue();
        int iA2 = C22066f2.a(this.f35720A | 1);
        int iA3 = C22066f2.a(this.f35721B);
        O2 o23 = this.f35731u;
        float f16 = C21762o3.f36935a;
        androidx.compose.runtime.B bE2 = a12.E(1400504719);
        int i15 = iA2 & 6;
        androidx.compose.ui.v vVar3 = this.f35722l;
        if (i15 == 0) {
            i12 = (bE2.B(vVar3) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i16 = iA2 & 48;
        Y41.a<kotlin.G0> aVar2 = this.f35723m;
        if (i16 == 0) {
            i12 |= bE2.u(aVar2) ? 32 : 16;
        }
        int i17 = iA2 & 384;
        boolean z14 = this.f35724n;
        if (i17 == 0) {
            i12 |= bE2.j(z14) ? 256 : 128;
        }
        int i18 = iA2 & 3072;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f35725o;
        if (i18 == 0) {
            i12 |= bE2.u(pVar4) ? 2048 : 1024;
        }
        int i19 = iA2 & 24576;
        androidx.compose.ui.text.x0 x0Var2 = this.f35726p;
        if (i19 == 0) {
            i12 |= bE2.B(x0Var2) ? 16384 : 8192;
        }
        int i22 = 196608 & iA2;
        long j13 = this.f35727q;
        if (i22 == 0) {
            i12 |= bE2.n(j13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i23 = 1572864 & iA2;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar5 = this.f35728r;
        if (i23 == 0) {
            i12 |= bE2.u(pVar5) ? 1048576 : 524288;
        }
        int i24 = 12582912 & iA2;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar6 = this.f35729s;
        if (i24 == 0) {
            i12 |= bE2.u(pVar6) ? 8388608 : 4194304;
        }
        int i25 = 100663296 & iA2;
        androidx.compose.ui.graphics.h1 h1Var2 = this.f35730t;
        if (i25 == 0) {
            i12 |= bE2.B(h1Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & iA2) == 0) {
            i12 |= bE2.B(o23) ? 536870912 : 268435456;
        }
        int i26 = i12;
        int i27 = iA3 & 6;
        R2 r23 = this.f35732v;
        if (i27 == 0) {
            i13 = iA3 | (bE2.B(r23) ? 4 : 2);
        } else {
            i13 = iA3;
        }
        int i28 = iA3 & 48;
        C20805p0 c20805p02 = this.f35733w;
        if (i28 == 0) {
            i13 |= bE2.B(c20805p02) ? 32 : 16;
        }
        int i29 = iA3 & 384;
        float f17 = this.f35734x;
        if (i29 == 0) {
            i13 |= bE2.k(f17) ? 256 : 128;
        }
        int i32 = iA3 & 3072;
        androidx.compose.foundation.layout.V1 v14 = this.f35735y;
        if (i32 == 0) {
            i13 |= bE2.B(v14) ? 2048 : 1024;
        }
        int i33 = iA3 & 24576;
        androidx.compose.foundation.interaction.m mVar2 = this.f35736z;
        if (i33 == 0) {
            i13 |= bE2.B(mVar2) ? 16384 : 8192;
        }
        int i34 = i13;
        if ((306783379 & i26) == 306783378 && (i34 & 9363) == 9362 && bE2.c()) {
            bE2.f();
            r22 = r23;
            pVar3 = pVar4;
            x0Var = x0Var2;
            f15 = f17;
            j12 = j13;
            z13 = z14;
            v13 = v14;
            vVar = vVar3;
            o22 = o23;
            mVar = mVar2;
            aVar = aVar2;
            pVar = pVar5;
            pVar2 = pVar6;
            h1Var = h1Var2;
            c20805p0 = c20805p02;
        } else {
            androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(vVar3, false, U2.f35522l);
            long j14 = z14 ? o23.f35218a : o23.f35222e;
            if (r23 != null) {
                f12 = z14 ? r23.f35366a : r23.f35371f;
            } else {
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                f12 = 0;
            }
            bE2.I(64045604);
            if (r23 == null) {
                vVar2 = vVarB;
                r22 = r23;
                x0Var = x0Var2;
                i14 = i26;
                f13 = f17;
                v12 = v14;
                vVar = vVar3;
                mVar = mVar2;
                z12 = false;
                rVar = null;
            } else {
                int i35 = ((i34 << 6) & 896) | ((i26 >> 6) & 14) | ((i34 >> 9) & 112);
                bE2.I(1881877139);
                bE2.I(-2071499570);
                bE2.I(-1373742275);
                Object objT = bE2.t();
                androidx.compose.runtime.A.f37866a.getClass();
                x0Var = x0Var2;
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    objT = new androidx.compose.runtime.snapshots.D();
                    bE2.H(objT);
                }
                androidx.compose.runtime.snapshots.D d12 = (androidx.compose.runtime.snapshots.D) objT;
                i14 = i26;
                bE2.X(false);
                bE2.I(-1373742197);
                Object objT2 = bE2.t();
                if (objT2 == c1651a) {
                    objT2 = C22126m3.g(null);
                    bE2.H(objT2);
                }
                InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
                f13 = f17;
                bE2.X(false);
                bE2.I(-1373742107);
                v12 = v14;
                boolean z15 = (((i35 & 112) ^ 48) > 32 && bE2.B(mVar2)) || (i35 & 48) == 32;
                Object objT3 = bE2.t();
                if (z15 || objT3 == c1651a) {
                    objT3 = new P2(mVar2, d12, null);
                    bE2.H(objT3);
                }
                bE2.X(false);
                C22187u0.d((Y41.p) objT3, bE2, mVar2);
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) C42745f0.S(d12);
                float f18 = !z14 ? r23.f35371f : jVar instanceof o.b ? r23.f35367b : jVar instanceof g.a ? r23.f35369d : jVar instanceof d.a ? r23.f35368c : jVar instanceof a.b ? r23.f35370e : r23.f35366a;
                bE2.I(-1373740122);
                Object objT4 = bE2.t();
                if (objT4 == c1651a) {
                    objT4 = new C20268c(androidx.compose.ui.unit.h.a(f18), androidx.compose.animation.core.J1.f26077c, null, null, 12, null);
                    bE2.H(objT4);
                }
                C20268c c20268c = (C20268c) objT4;
                vVar = vVar3;
                bE2.X(false);
                androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(f18);
                r22 = r23;
                bE2.I(-1373740038);
                mVar = mVar2;
                vVar2 = vVarB;
                boolean zU2 = ((((i35 & 14) ^ 6) > 4 && bE2.j(z14)) || (i35 & 6) == 4) | bE2.u(c20268c) | bE2.k(f18) | bE2.u(jVar);
                Object objT5 = bE2.t();
                if (zU2 || objT5 == c1651a) {
                    objT5 = new Q2(c20268c, f18, z14, jVar, interfaceC22204y1, null);
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
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            }
            int i36 = i14;
            f15 = f13;
            j12 = j13;
            z13 = z14;
            pVar = pVar5;
            pVar2 = pVar6;
            h1Var = h1Var2;
            c20805p0 = c20805p02;
            v13 = v12;
            aVar = aVar2;
            pVar3 = pVar4;
            o22 = o23;
            Qg.c(aVar, vVar2, z13, h1Var, j14, 0L, f12, f14, c20805p0, mVar, androidx.compose.runtime.internal.r.b(bE2, -1985962652, new V2(pVar4, x0Var, j13, pVar5, pVar6, o23, z13, f15, v13)), bE2, ((i36 >> 3) & 14) | (i36 & 896) | ((i36 >> 15) & 7168) | ((i34 << 21) & 234881024) | ((i34 << 15) & 1879048192), 32);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new W2(vVar, aVar, z13, pVar3, x0Var, j12, pVar, pVar2, h1Var, o22, r22, c20805p0, f15, v13, mVar, iA2, iA3);
        }
        return kotlin.G0.f406611a;
    }
}
