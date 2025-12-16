package androidx.compose.material;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;
import shark.AndroidResourceIdNames;

/* compiled from: TextFieldDefaults.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21345sb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34183A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f34184B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f34185C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f34186D;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21317qb f34187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f34188m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34189n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f34190o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f34191p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.k0 f34192q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f34193r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f34194s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34195t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34196u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34197v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34198w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f34199x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21291ob f34200y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f34201z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21345sb(C21317qb c21317qb, String str, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, boolean z12, boolean z13, androidx.compose.ui.text.input.k0 k0Var, androidx.compose.foundation.interaction.k kVar, boolean z14, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar3, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar4, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar5, androidx.compose.ui.graphics.h1 h1Var, InterfaceC21291ob interfaceC21291ob, androidx.compose.foundation.layout.T1 t12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar6, int i12, int i13, int i14) {
        super(2);
        this.f34187l = c21317qb;
        this.f34188m = str;
        this.f34189n = pVar;
        this.f34190o = z12;
        this.f34191p = z13;
        this.f34192q = k0Var;
        this.f34193r = kVar;
        this.f34194s = z14;
        this.f34195t = pVar2;
        this.f34196u = pVar3;
        this.f34197v = pVar4;
        this.f34198w = pVar5;
        this.f34199x = h1Var;
        this.f34200y = interfaceC21291ob;
        this.f34201z = t12;
        this.f34183A = pVar6;
        this.f34184B = i12;
        this.f34185C = i13;
        this.f34186D = i14;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        int i14;
        androidx.compose.foundation.layout.T1 t12;
        androidx.compose.foundation.layout.T1 t1D;
        num.intValue();
        int iA2 = C22066f2.a(this.f34184B | 1);
        int iA3 = C22066f2.a(this.f34185C);
        C21317qb c21317qb = this.f34187l;
        c21317qb.getClass();
        androidx.compose.runtime.B bE2 = a12.E(-920823490);
        int i15 = iA2 & 6;
        String str = this.f34188m;
        if (i15 == 0) {
            i12 = (bE2.B(str) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i16 = iA2 & 48;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f34189n;
        if (i16 == 0) {
            i12 |= bE2.u(pVar) ? 32 : 16;
        }
        int i17 = iA2 & 384;
        boolean z12 = this.f34190o;
        if (i17 == 0) {
            i12 |= bE2.j(z12) ? 256 : 128;
        }
        int i18 = iA2 & 3072;
        boolean z13 = this.f34191p;
        int i19 = 1024;
        if (i18 == 0) {
            i12 |= bE2.j(z13) ? 2048 : 1024;
        }
        int i22 = iA2 & 24576;
        androidx.compose.ui.text.input.k0 k0Var = this.f34192q;
        if (i22 == 0) {
            i12 |= bE2.B(k0Var) ? 16384 : 8192;
        }
        int i23 = iA2 & 196608;
        androidx.compose.foundation.interaction.k kVar = this.f34193r;
        int i24 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        if (i23 == 0) {
            i12 |= bE2.B(kVar) ? 131072 : 65536;
        }
        int i25 = iA2 & 1572864;
        boolean z14 = this.f34194s;
        if (i25 == 0) {
            i12 |= bE2.j(z14) ? 1048576 : 524288;
        }
        int i26 = iA2 & 12582912;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f34195t;
        if (i26 == 0) {
            i12 |= bE2.u(pVar2) ? 8388608 : 4194304;
        }
        int i27 = iA2 & 100663296;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f34196u;
        if (i27 == 0) {
            i12 |= bE2.u(pVar3) ? 67108864 : 33554432;
        }
        int i28 = iA2 & 805306368;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f34197v;
        if (i28 == 0) {
            i12 |= bE2.u(pVar4) ? 536870912 : 268435456;
        }
        int i29 = iA3 & 6;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar5 = this.f34198w;
        if (i29 == 0) {
            i13 = iA3 | (bE2.u(pVar5) ? 4 : 2);
        } else {
            i13 = iA3;
        }
        int i32 = iA3 & 48;
        androidx.compose.ui.graphics.h1 h1Var = this.f34199x;
        if (i32 == 0) {
            i13 |= bE2.B(h1Var) ? 32 : 16;
        }
        int i33 = iA3 & 384;
        InterfaceC21291ob interfaceC21291ob = this.f34200y;
        if (i33 == 0) {
            i13 |= bE2.B(interfaceC21291ob) ? 256 : 128;
        }
        int i34 = iA3 & 3072;
        androidx.compose.foundation.layout.T1 t13 = this.f34201z;
        int i35 = this.f34186D;
        if (i34 == 0) {
            if ((i35 & 8192) == 0 && bE2.B(t13)) {
                i19 = 2048;
            }
            i13 |= i19;
        }
        int i36 = iA3 & 24576;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar6 = this.f34183A;
        if (i36 == 0) {
            i13 |= bE2.u(pVar6) ? 16384 : 8192;
        }
        if ((196608 & iA3) == 0) {
            if (bE2.B(c21317qb)) {
                i24 = 131072;
            }
            i13 |= i24;
        }
        int i37 = i13;
        if (bE2.p(i12 & 1, ((i12 & 306783379) == 306783378 && (74899 & i37) == 74898) ? false : true)) {
            bE2.y0();
            if ((iA2 & 1) == 0 || bE2.g0()) {
                if ((i35 & 8192) != 0) {
                    float f12 = Bb.f32409a;
                    t1D = androidx.compose.foundation.layout.R1.d(f12, f12, f12, f12);
                    i37 &= -7169;
                }
                bE2.Y();
                int i38 = i12 << 3;
                i14 = i35;
                int i39 = ((i12 >> 3) & 7168) | (i38 & 112) | 6 | (i38 & 896);
                int i42 = i12 >> 9;
                int i43 = i39 | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | ((i37 << 21) & 29360128) | ((i12 << 15) & 234881024) | ((i12 << 21) & 1879048192);
                int i44 = ((i12 >> 18) & 14) | ((i12 >> 12) & 112) | ((i37 >> 3) & 896);
                int i45 = i37 << 6;
                Bb.a(TextFieldType.f33238c, str, pVar, k0Var, pVar2, pVar3, pVar4, pVar5, z13, z12, z14, kVar, t1D, h1Var, interfaceC21291ob, pVar6, bE2, i43, i44 | (i45 & 7168) | (i45 & 57344) | ((i37 << 3) & 458752));
                t12 = t1D;
            } else {
                bE2.f();
                if ((i35 & 8192) != 0) {
                    i37 &= -7169;
                }
            }
            t1D = t13;
            bE2.Y();
            int i382 = i12 << 3;
            i14 = i35;
            int i392 = ((i12 >> 3) & 7168) | (i382 & 112) | 6 | (i382 & 896);
            int i422 = i12 >> 9;
            int i432 = i392 | (i422 & 57344) | (i422 & 458752) | (i422 & 3670016) | ((i37 << 21) & 29360128) | ((i12 << 15) & 234881024) | ((i12 << 21) & 1879048192);
            int i442 = ((i12 >> 18) & 14) | ((i12 >> 12) & 112) | ((i37 >> 3) & 896);
            int i452 = i37 << 6;
            Bb.a(TextFieldType.f33238c, str, pVar, k0Var, pVar2, pVar3, pVar4, pVar5, z13, z12, z14, kVar, t1D, h1Var, interfaceC21291ob, pVar6, bE2, i432, i442 | (i452 & 7168) | (i452 & 57344) | ((i37 << 3) & 458752));
            t12 = t1D;
        } else {
            i14 = i35;
            bE2.f();
            t12 = t13;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21345sb(c21317qb, str, pVar, z12, z13, k0Var, kVar, z14, pVar2, pVar3, pVar4, pVar5, h1Var, interfaceC21291ob, t12, pVar6, iA2, iA3, i14);
        }
        return kotlin.G0.f406611a;
    }
}
