package androidx.compose.material;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;
import shark.AndroidResourceIdNames;

/* compiled from: TextFieldDefaults.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21384vb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f34285A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f34286B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f34287C;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21317qb f34288l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f34289m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34290n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f34291o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f34292p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.k0 f34293q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f34294r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f34295s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34296t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34297u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34298v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34299w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f34300x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21291ob f34301y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f34302z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21384vb(C21317qb c21317qb, String str, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, boolean z12, boolean z13, androidx.compose.ui.text.input.k0 k0Var, androidx.compose.foundation.interaction.k kVar, boolean z14, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar3, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar4, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar5, androidx.compose.ui.graphics.h1 h1Var, InterfaceC21291ob interfaceC21291ob, androidx.compose.foundation.layout.T1 t12, int i12, int i13, int i14) {
        super(2);
        this.f34288l = c21317qb;
        this.f34289m = str;
        this.f34290n = pVar;
        this.f34291o = z12;
        this.f34292p = z13;
        this.f34293q = k0Var;
        this.f34294r = kVar;
        this.f34295s = z14;
        this.f34296t = pVar2;
        this.f34297u = pVar3;
        this.f34298v = pVar4;
        this.f34299w = pVar5;
        this.f34300x = h1Var;
        this.f34301y = interfaceC21291ob;
        this.f34302z = t12;
        this.f34285A = i12;
        this.f34286B = i13;
        this.f34287C = i14;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        int i14;
        androidx.compose.foundation.layout.T1 t12;
        androidx.compose.foundation.layout.T1 t1D;
        num.intValue();
        int iA2 = C22066f2.a(this.f34285A | 1);
        int iA3 = C22066f2.a(this.f34286B);
        C21317qb c21317qb = this.f34288l;
        c21317qb.getClass();
        androidx.compose.runtime.B bE2 = a12.E(-1391531252);
        int i15 = iA2 & 6;
        String str = this.f34289m;
        if (i15 == 0) {
            i12 = (bE2.B(str) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i16 = iA2 & 48;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f34290n;
        if (i16 == 0) {
            i12 |= bE2.u(pVar) ? 32 : 16;
        }
        int i17 = iA2 & 384;
        boolean z12 = this.f34291o;
        if (i17 == 0) {
            i12 |= bE2.j(z12) ? 256 : 128;
        }
        int i18 = iA2 & 3072;
        boolean z13 = this.f34292p;
        int i19 = 1024;
        if (i18 == 0) {
            i12 |= bE2.j(z13) ? 2048 : 1024;
        }
        int i22 = iA2 & 24576;
        androidx.compose.ui.text.input.k0 k0Var = this.f34293q;
        if (i22 == 0) {
            i12 |= bE2.B(k0Var) ? 16384 : 8192;
        }
        int i23 = iA2 & 196608;
        androidx.compose.foundation.interaction.k kVar = this.f34294r;
        if (i23 == 0) {
            i12 |= bE2.B(kVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i24 = iA2 & 1572864;
        boolean z14 = this.f34295s;
        if (i24 == 0) {
            i12 |= bE2.j(z14) ? 1048576 : 524288;
        }
        int i25 = iA2 & 12582912;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f34296t;
        if (i25 == 0) {
            i12 |= bE2.u(pVar2) ? 8388608 : 4194304;
        }
        int i26 = iA2 & 100663296;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f34297u;
        if (i26 == 0) {
            i12 |= bE2.u(pVar3) ? 67108864 : 33554432;
        }
        int i27 = iA2 & 805306368;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f34298v;
        if (i27 == 0) {
            i12 |= bE2.u(pVar4) ? 536870912 : 268435456;
        }
        int i28 = iA3 & 6;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar5 = this.f34299w;
        if (i28 == 0) {
            i13 = iA3 | (bE2.u(pVar5) ? 4 : 2);
        } else {
            i13 = iA3;
        }
        int i29 = iA3 & 48;
        androidx.compose.ui.graphics.h1 h1Var = this.f34300x;
        if (i29 == 0) {
            i13 |= bE2.B(h1Var) ? 32 : 16;
        }
        int i32 = iA3 & 384;
        InterfaceC21291ob interfaceC21291ob = this.f34301y;
        if (i32 == 0) {
            i13 |= bE2.B(interfaceC21291ob) ? 256 : 128;
        }
        int i33 = iA3 & 3072;
        androidx.compose.foundation.layout.T1 t13 = this.f34302z;
        int i34 = this.f34287C;
        if (i33 == 0) {
            if ((i34 & 8192) == 0 && bE2.B(t13)) {
                i19 = 2048;
            }
            i13 |= i19;
        }
        if ((iA3 & 24576) == 0) {
            i13 |= bE2.B(c21317qb) ? 16384 : 8192;
        }
        int i35 = i13;
        if (bE2.p(i12 & 1, ((i12 & 306783379) == 306783378 && (i35 & 9363) == 9362) ? false : true)) {
            bE2.y0();
            if ((iA2 & 1) == 0 || bE2.g0()) {
                if ((i34 & 8192) != 0) {
                    if (pVar2 == null) {
                        float f12 = Bb.f32409a;
                        t1D = androidx.compose.foundation.layout.R1.d(f12, f12, f12, f12);
                        i14 = iA3;
                    } else {
                        float f13 = Bb.f32409a;
                        i14 = iA3;
                        t1D = androidx.compose.foundation.layout.R1.d(f13, Vb.f33288a, f13, Vb.f33289b);
                    }
                    i35 &= -7169;
                }
                bE2.Y();
                int i36 = i12 << 3;
                int i37 = i12 >> 9;
                int i38 = (i36 & 896) | (i36 & 112) | 6 | ((i12 >> 3) & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016) | ((i35 << 21) & 29360128) | ((i12 << 15) & 234881024) | ((i12 << 21) & 1879048192);
                int i39 = ((i12 >> 18) & 14) | 196608 | ((i12 >> 12) & 112) | ((i35 >> 3) & 896);
                int i42 = i35 << 6;
                Bb.a(TextFieldType.f33237b, str, pVar, k0Var, pVar2, pVar3, pVar4, pVar5, z13, z12, z14, kVar, t1D, h1Var, interfaceC21291ob, null, bE2, i38, i39 | (i42 & 7168) | (i42 & 57344));
                t12 = t1D;
            } else {
                bE2.f();
                if ((i34 & 8192) != 0) {
                    i35 &= -7169;
                }
            }
            i14 = iA3;
            t1D = t13;
            bE2.Y();
            int i362 = i12 << 3;
            int i372 = i12 >> 9;
            int i382 = (i362 & 896) | (i362 & 112) | 6 | ((i12 >> 3) & 7168) | (i372 & 57344) | (i372 & 458752) | (i372 & 3670016) | ((i35 << 21) & 29360128) | ((i12 << 15) & 234881024) | ((i12 << 21) & 1879048192);
            int i392 = ((i12 >> 18) & 14) | 196608 | ((i12 >> 12) & 112) | ((i35 >> 3) & 896);
            int i422 = i35 << 6;
            Bb.a(TextFieldType.f33237b, str, pVar, k0Var, pVar2, pVar3, pVar4, pVar5, z13, z12, z14, kVar, t1D, h1Var, interfaceC21291ob, null, bE2, i382, i392 | (i422 & 7168) | (i422 & 57344));
            t12 = t1D;
        } else {
            i14 = iA3;
            bE2.f();
            t12 = t13;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21384vb(c21317qb, str, pVar, z12, z13, k0Var, kVar, z14, pVar2, pVar3, pVar4, pVar5, h1Var, interfaceC21291ob, t12, iA2, i14, i34);
        }
        return kotlin.G0.f406611a;
    }
}
