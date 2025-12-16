package com.akita.compose.component.button;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import j.InterfaceC42165v;
import j.e0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: Button.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "spinnerAlpha", "contentAlpha", "button_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m {

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f60766l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f60767m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ t f60768n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Integer f60769o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Integer f60770p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f60771q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f60772r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, boolean z13, t tVar, Integer num, Integer num2, String str, String str2) {
            super(2);
            this.f60766l = z12;
            this.f60767m = z13;
            this.f60768n = tVar;
            this.f60769o = num;
            this.f60770p = num2;
            this.f60771q = str;
            this.f60772r = str2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                String str = this.f60771q;
                String str2 = this.f60772r;
                Integer num2 = this.f60769o;
                t tVar = this.f60768n;
                Integer num3 = this.f60770p;
                boolean z12 = this.f60767m;
                m.g(this.f60766l, z12, tVar, androidx.compose.runtime.internal.r.c(-2114869273, new l(num2, tVar, num3, z12, str, str2), a13), a13, 3584);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f60773l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f60774m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ t f60775n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f60776o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f60777p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Integer f60778q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Integer f60779r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f60780s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f60781t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ r f60782u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f60783v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f60784w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Y41.a<G0> aVar, t tVar, v vVar, String str2, Integer num, Integer num2, boolean z12, boolean z13, r rVar, int i12, int i13) {
            super(2);
            this.f60773l = str;
            this.f60774m = aVar;
            this.f60775n = tVar;
            this.f60776o = vVar;
            this.f60777p = str2;
            this.f60778q = num;
            this.f60779r = num2;
            this.f60780s = z12;
            this.f60781t = z13;
            this.f60782u = rVar;
            this.f60783v = i12;
            this.f60784w = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f60783v | 1);
            boolean z12 = this.f60780s;
            m.c(this.f60773l, this.f60774m, this.f60775n, this.f60776o, this.f60777p, this.f60778q, this.f60779r, z12, this.f60781t, this.f60782u, a12, iA2, this.f60784w);
            return G0.f406611a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f60785l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f60786m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ t f60787n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f60788o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f60789p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, boolean z13, t tVar, float f12, androidx.compose.ui.graphics.painter.e eVar) {
            super(2);
            this.f60785l = z12;
            this.f60786m = z13;
            this.f60787n = tVar;
            this.f60788o = f12;
            this.f60789p = eVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.graphics.painter.e eVar = this.f60789p;
                float f12 = this.f60788o;
                t tVar = this.f60787n;
                boolean z12 = this.f60786m;
                m.g(this.f60785l, z12, tVar, androidx.compose.runtime.internal.r.c(414580356, new o(f12, tVar, z12, eVar), a13), a13, 3584);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f60790l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f60791m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ t f60792n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f60793o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f60794p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f60795q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f60796r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ r f60797s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f60798t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f60799u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.graphics.painter.e eVar, Y41.a<G0> aVar, t tVar, v vVar, float f12, boolean z12, boolean z13, r rVar, int i12, int i13) {
            super(2);
            this.f60790l = eVar;
            this.f60791m = aVar;
            this.f60792n = tVar;
            this.f60793o = vVar;
            this.f60794p = f12;
            this.f60795q = z12;
            this.f60796r = z13;
            this.f60797s = rVar;
            this.f60798t = i12;
            this.f60799u = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f60798t | 1);
            boolean z12 = this.f60795q;
            m.f(this.f60790l, this.f60791m, this.f60792n, this.f60793o, this.f60794p, z12, this.f60796r, this.f60797s, a12, iA2, this.f60799u);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@e0 int i12, @Y61.k Y41.a aVar, @Y61.k t tVar, @Y61.l v vVar, @InterfaceC42165v @Y61.l Integer num, boolean z12, boolean z13, @Y61.l A a12, int i13, int i14) {
        B bE2 = a12.E(2139172801);
        v vVar2 = (i14 & 8) != 0 ? v.f42878y1 : vVar;
        Integer num2 = (i14 & 32) != 0 ? null : num;
        boolean z14 = (i14 & 128) != 0 ? false : z12;
        boolean z15 = (i14 & 256) != 0 ? true : z13;
        r rVarA = s.a(tVar, bE2, 8);
        String strC = u0.i.c(bE2, i12);
        bE2.C(2139813868);
        bE2.X(false);
        c(strC, aVar, tVar, vVar2, null, num2, null, z14, z15, rVarA, bE2, (i13 & 112) | 512 | (i13 & 7168) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13), 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(i12, aVar, tVar, vVar2, num2, z14, z15, rVarA, i13, i14);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k Y41.a aVar, @Y61.k t tVar, @Y61.l v vVar, boolean z12, @Y61.l r rVar, @Y61.k C22096n c22096n, @Y61.l A a12, int i12, int i13) {
        r rVarA;
        int i14;
        B bE2 = a12.E(2104790263);
        boolean z13 = (i13 & 8) != 0 ? true : z12;
        if ((i13 & 16) != 0) {
            i14 = i12 & (-57345);
            rVarA = s.a(tVar, bE2, 8);
        } else {
            rVarA = rVar;
            i14 = i12;
        }
        d(aVar, com.akita.compose.foundation.n.a(tVar.f60845q, bE2), tVar, vVar, androidx.compose.foundation.shape.o.a(tVar.f60831c), 0.0f, tVar.f60830b, tVar.f60829a, null, z13, rVarA, c22096n, bE2, (i14 & 14) | 512 | ((i14 << 3) & 7168), (i14 >> 9) & 1022, 608);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(aVar, tVar, vVar, z13, rVarA, c22096n, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k String str, @Y61.k Y41.a<G0> aVar, @Y61.k t tVar, @Y61.l v vVar, @Y61.l String str2, @InterfaceC42165v @Y61.l Integer num, @InterfaceC42165v @Y61.l Integer num2, boolean z12, boolean z13, @Y61.l r rVar, @Y61.l A a12, int i12, int i13) {
        r rVarA;
        int i14;
        B bE2 = a12.E(-1692571537);
        v vVar2 = (i13 & 8) != 0 ? v.f42878y1 : vVar;
        String str3 = (i13 & 16) != 0 ? null : str2;
        Integer num3 = (i13 & 32) != 0 ? null : num;
        Integer num4 = (i13 & 64) != 0 ? null : num2;
        boolean z14 = (i13 & 128) != 0 ? false : z12;
        boolean z15 = (i13 & 256) != 0 ? true : z13;
        if ((i13 & 512) != 0) {
            i14 = i12 & (-1879048193);
            rVarA = s.a(tVar, bE2, 8);
        } else {
            rVarA = rVar;
            i14 = i12;
        }
        androidx.compose.foundation.shape.n nVarA = androidx.compose.foundation.shape.o.a(tVar.f60831c);
        int i15 = i14 >> 24;
        float f12 = tVar.f60829a;
        v vVar3 = vVar2;
        d(aVar, com.akita.compose.foundation.n.a(tVar.f60845q, bE2), tVar, vVar3, nVarA, 0.0f, tVar.f60830b, f12, null, z15, rVarA, androidx.compose.runtime.internal.r.c(777461975, new a(z14, z15, tVar, num3, num4, str3, str), bE2), bE2, ((i14 >> 3) & 14) | 512 | (i14 & 7168), (i15 & 14) | 384 | (i15 & 112), 608);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, aVar, tVar, vVar2, str3, num3, num4, z14, z15, rVarA, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void d(@Y61.k Y41.a aVar, @Y61.k com.akita.compose.foundation.m mVar, @Y61.k t tVar, @Y61.l v vVar, @Y61.l androidx.compose.foundation.shape.n nVar, float f12, float f13, float f14, @Y61.l androidx.compose.foundation.interaction.m mVar2, boolean z12, @Y61.l r rVar, @Y61.k C22096n c22096n, @Y61.l A a12, int i12, int i13, int i14) {
        int i15;
        int i16;
        float f15;
        androidx.compose.foundation.interaction.m mVar3;
        boolean z13;
        int i17;
        r rVarA;
        boolean z14;
        androidx.compose.foundation.interaction.m mVar4;
        boolean z15;
        r rVar2;
        B bE2 = a12.E(-1767841104);
        if ((i12 & 14) == 0) {
            i15 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 112) == 0) {
            i15 |= bE2.B(mVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i15 |= bE2.B(tVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i15 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i15 |= bE2.B(nVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i18 = i15 | 1769472;
        if ((i12 & 29360128) == 0) {
            i18 |= bE2.k(f13) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i18 |= bE2.k(f14) ? 67108864 : 33554432;
        }
        int i19 = i14 & 512;
        if (i19 != 0) {
            i18 |= 805306368;
        } else if ((i12 & 1879048192) == 0) {
            i18 |= bE2.B(mVar2) ? 536870912 : 268435456;
        }
        int i22 = 1024 & i14;
        if (i22 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i16 = i13 | (bE2.j(z12) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 112) == 0) {
            i16 |= ((i14 & 2048) == 0 && bE2.B(rVar)) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i16 |= bE2.u(c22096n) ? 256 : 128;
        }
        int i23 = i16;
        if ((i18 & 1533916891) == 306783378 && (i23 & 731) == 146 && bE2.c()) {
            bE2.f();
            f15 = f12;
            mVar4 = mVar2;
            z15 = z12;
            rVar2 = rVar;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                f15 = 0;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                if (i19 != 0) {
                    bE2.C(2140167929);
                    Object objT = bE2.t();
                    A.f37866a.getClass();
                    if (objT == A.a.f37868b) {
                        objT = androidx.compose.foundation.interaction.l.a();
                        bE2.H(objT);
                    }
                    mVar3 = (androidx.compose.foundation.interaction.m) objT;
                    bE2.X(false);
                } else {
                    mVar3 = mVar2;
                }
                if (i22 != 0) {
                    i17 = 2048;
                    z13 = true;
                } else {
                    z13 = z12;
                    i17 = 2048;
                }
                rVarA = (i17 & i14) != 0 ? s.a(null, bE2, 6) : rVar;
                z14 = z13;
            } else {
                bE2.f();
                f15 = f12;
                mVar3 = mVar2;
                z14 = z12;
                rVarA = rVar;
            }
            bE2.Y();
            S.a(com.akita.compose.foundation.n.f63625a.b(mVar), androidx.compose.runtime.internal.r.c(1894397424, new i(vVar, f13, f14, tVar, z14, aVar, nVar, f15, mVar3, rVarA, c22096n), bE2), bE2, 56);
            mVar4 = mVar3;
            z15 = z14;
            rVar2 = rVarA;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(aVar, mVar, tVar, vVar, nVar, f15, f13, f14, mVar4, z15, rVar2, c22096n, i12, i13, i14);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(@InterfaceC42165v int i12, @Y61.k Y41.a aVar, @Y61.k t tVar, @Y61.l v vVar, boolean z12, boolean z13, @Y61.l r rVar, @Y61.l A a12, int i13, int i14) {
        r rVarA;
        int i15;
        B bE2 = a12.E(1752683852);
        v vVar2 = (i14 & 8) != 0 ? v.f42878y1 : vVar;
        androidx.compose.ui.unit.h.f42849c.getClass();
        float f12 = androidx.compose.ui.unit.h.f42851e;
        boolean z14 = (i14 & 32) != 0 ? false : z12;
        boolean z15 = (i14 & 64) != 0 ? true : z13;
        if ((i14 & 128) != 0) {
            i15 = i13 & (-29360129);
            rVarA = s.a(tVar, bE2, 8);
        } else {
            rVarA = rVar;
            i15 = i13;
        }
        f(u0.e.a(i12, i15 & 14, bE2), aVar, tVar, vVar2, f12, z14, z15, rVarA, bE2, (i15 & 112) | 520 | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (i15 & 29360128), 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(i12, aVar, tVar, vVar2, f12, z14, z15, rVarA, i13, i14);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k Y41.a<G0> aVar, @Y61.k t tVar, @Y61.l v vVar, float f12, boolean z12, boolean z13, @Y61.l r rVar, @Y61.l A a12, int i12, int i13) {
        float f13;
        r rVarA;
        int i14;
        B bE2 = a12.E(1696131888);
        v vVar2 = (i13 & 8) != 0 ? v.f42878y1 : vVar;
        if ((i13 & 16) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f13 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f13 = f12;
        }
        boolean z14 = (i13 & 32) != 0 ? false : z12;
        boolean z15 = (i13 & 64) != 0 ? true : z13;
        if ((i13 & 128) != 0) {
            i14 = i12 & (-29360129);
            rVarA = s.a(tVar, bE2, 8);
        } else {
            rVarA = rVar;
            i14 = i12;
        }
        int i15 = i14 >> 3;
        int i16 = i14 >> 9;
        b(aVar, tVar, vVar2, z15, rVarA, androidx.compose.runtime.internal.r.c(2119524212, new c(z14, z15, tVar, f13, eVar), bE2), bE2, (i15 & 896) | (i15 & 14) | 196672 | (i16 & 7168) | (i16 & 57344), 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(eVar, aVar, tVar, vVar2, f13, z14, z15, rVarA, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(boolean r16, boolean r17, com.akita.compose.component.button.t r18, androidx.compose.runtime.internal.C22096n r19, androidx.compose.runtime.A r20, int r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.button.m.g(boolean, boolean, com.akita.compose.component.button.t, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }
}
