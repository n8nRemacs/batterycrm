package Fc1;

import android.graphics.Color;
import androidx.compose.animation.C20389u;
import androidx.compose.animation.C20396w0;
import androidx.compose.animation.InterfaceC20401y;
import androidx.compose.animation.core.C20310q;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.l4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13664l4 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5651a = androidx.compose.ui.graphics.V.b(Color.parseColor("#80000000"));

    /* renamed from: Fc1.l4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Z1<Boolean> f5652l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlinx.coroutines.flow.Z1<Boolean> z12) {
            super(0);
            this.f5652l = z12;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f5652l.setValue(Boolean.TRUE);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.l4$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC20401y<Boolean>, C20396w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f5653l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final C20396w0 invoke(InterfaceC20401y<Boolean> interfaceC20401y) {
            return new C20396w0(androidx.compose.animation.H0.d(C20310q.e(200, 0, null, 6), 2), androidx.compose.animation.H0.e(C20310q.e(200, 0, null, 6), 2), 0.0f, C20389u.d(B4.f4825l, 1), 4, null);
        }
    }

    /* renamed from: Fc1.l4$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B1 f5654l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Z1<Boolean> f5655m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5656n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(B1 b12, kotlinx.coroutines.flow.Z1<Boolean> z12, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f5654l = b12;
            this.f5655m = z12;
            this.f5656n = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f5654l.f4818a.invoke();
            Boolean bool = Boolean.TRUE;
            this.f5655m.setValue(bool);
            this.f5656n.setValue(bool);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.l4$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B1 f5657l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Z1<Boolean> f5658m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(B1 b12, kotlinx.coroutines.flow.Z1<Boolean> z12, int i12) {
            super(2);
            this.f5657l = b12;
            this.f5658m = z12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(71);
            kotlinx.coroutines.flow.Z1<Boolean> z12 = this.f5658m;
            C13664l4.a(this.f5657l, z12, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k B1 b12, @Y61.k kotlinx.coroutines.flow.Z1<Boolean> z12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar;
        v.a aVar;
        ?? r52;
        kotlinx.coroutines.flow.Z1<Boolean> z13;
        InterfaceC22204y1 interfaceC22204y1;
        androidx.compose.runtime.B bE2 = a12.E(977250285);
        InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(z12, bE2);
        bE2.I(-492369756);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        bE2.X(false);
        InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT;
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        androidx.compose.ui.v vVarB = C13775y.b(fillElement, new a(z12));
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39083i;
        bE2.I(733328855);
        InterfaceC22365i0 interfaceC22365i0E = C20632w.e(iVar, false, bE2, 6);
        bE2.I(-1323940314);
        int i13 = bE2.f37888Q;
        androidx.compose.runtime.O1 o1S = bE2.S();
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarB);
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar2 = InterfaceC22413h.a.f40796g;
        androidx.compose.runtime.R3.b(pVar2, bE2, interfaceC22365i0E);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar3 = InterfaceC22413h.a.f40795f;
        androidx.compose.runtime.R3.b(pVar3, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar4 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            C13653k2.a(i13, bE2, i13, pVar4);
        }
        A2.a(c22096nC, androidx.compose.runtime.J2.a(bE2), bE2);
        C20644z c20644z = C20644z.f28804a;
        C20389u.b(interfaceC22204y1B.getF42167b(), null, b.f5653l, null, "TakeDialogBackground", null, D5.f4851a, bE2, 1597824, 42);
        i.a aVar4 = InterfaceC22215f.a.f39089o;
        bE2.I(-483455358);
        C20585k.f28659a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, aVar4, bE2, 48);
        bE2.I(-1323940314);
        int i14 = bE2.f37888Q;
        androidx.compose.runtime.O1 o1S2 = bE2.S();
        C22096n c22096nC2 = androidx.compose.ui.layout.M.c(aVar2);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        androidx.compose.runtime.R3.b(pVar2, bE2, iA2);
        androidx.compose.runtime.R3.b(pVar3, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            pVar = pVar4;
            C13653k2.a(i14, bE2, i14, pVar);
        } else {
            pVar = pVar4;
        }
        A2.a(c22096nC2, androidx.compose.runtime.J2.a(bE2), bE2);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        bE2.I(935411844);
        if (((Boolean) interfaceC22204y1B.getF42167b()).booleanValue()) {
            aVar = aVar2;
            r52 = 0;
        } else {
            r52 = 0;
            M0.a(bE2, 0);
            float f12 = 32;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            aVar = aVar2;
            C20608p2.a(bE2, C20588k2.f(aVar, f12));
            C13571b1.a(bE2, 0);
            C20608p2.a(bE2, C20588k2.f(aVar, f12));
        }
        bE2.X(r52);
        androidx.compose.ui.v vVarA = C22392w0.a(aVar, b12.f4820c);
        bE2.I(693286680);
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, r52);
        bE2.I(-1323940314);
        int i15 = bE2.f37888Q;
        androidx.compose.runtime.O1 o1S3 = bE2.S();
        C22096n c22096nC3 = androidx.compose.ui.layout.M.c(vVarA);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        androidx.compose.runtime.R3.b(pVar2, bE2, c20568f2A);
        androidx.compose.runtime.R3.b(pVar3, bE2, o1S3);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            C13653k2.a(i15, bE2, i15, pVar);
        }
        A2.a(c22096nC3, androidx.compose.runtime.J2.a(bE2), bE2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        C13750v1.a(interfaceC13779y3.w(), C13774x7.a(interfaceC13779y3.s(), bE2), b12.f4819b, bE2, r52);
        h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
        C20608p2.a(bE2, C20588k2.t(aVar, 8));
        bE2.I(-492369756);
        Object objT2 = bE2.t();
        if (objT2 == obj) {
            z13 = z12;
            interfaceC22204y1 = interfaceC22204y12;
            objT2 = new c(b12, z13, interfaceC22204y1);
            bE2.H(objT2);
        } else {
            z13 = z12;
            interfaceC22204y1 = interfaceC22204y12;
        }
        bE2.X(r52);
        N7 n7Y = interfaceC13779y3.y();
        N7 n7S = interfaceC13779y3.s();
        bE2.I(2050467587);
        C22293d.a aVar7 = new C22293d.a("Icon04", 18, 14, 18.0f, 14.0f, 0L, 0, false, 224, null);
        aVar7.a("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.vector.U.f39811a);
        androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(androidx.compose.ui.graphics.V.b(n7S.e()), null);
        androidx.compose.ui.graphics.m1.f39698b.getClass();
        androidx.compose.ui.graphics.n1.f39707b.getClass();
        androidx.compose.ui.graphics.J0.f39288b.getClass();
        C22295f c22295f = new C22295f();
        c22295f.j(5.6f, 10.6f);
        c22295f.h(1.4f, 6.4f);
        c22295f.h(0.0f, 7.8f);
        c22295f.i(5.6f, 5.6f);
        c22295f.i(12.0f, -12.0f);
        c22295f.h(16.2f, 0.0f);
        c22295f.h(5.6f, 10.6f);
        c22295f.c();
        C22293d.a.c(aVar7, c22295f.f39885a, 0, k1Var, 1.0f, null, 1.0f, 1.0f, 0, 0, 1.0f, 14336);
        aVar7.e();
        C22293d c22293dD = aVar7.d();
        bE2.X(r52);
        C13750v1.a(n7Y, c22293dD, (Y41.a) objT2, bE2, 384);
        androidx.compose.foundation.H.B(bE2, r52, true, r52, r52);
        C20608p2.a(bE2, C20588k2.f(aVar, 56));
        bE2.X(r52);
        bE2.X(true);
        bE2.X(r52);
        bE2.X(r52);
        C13758w0.a(interfaceC22204y1, b12.f4821d, bE2, 6);
        bE2.X(r52);
        bE2.X(true);
        bE2.X(r52);
        bE2.X(r52);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new d(b12, z13, i12);
    }
}
