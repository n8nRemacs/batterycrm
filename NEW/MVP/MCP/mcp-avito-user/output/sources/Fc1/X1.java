package Fc1;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class X1 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13687o0 f5309l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C13709q4 f5310m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13687o0 interfaceC13687o0, C13709q4 c13709q4) {
            super(0);
            this.f5309l = interfaceC13687o0;
            this.f5310m = c13709q4;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            String strC = this.f5309l.c();
            if (strC == null) {
                strC = "https://uxfeedback.ru/?utm_campaign=default&utm_medium=app";
            }
            this.f5310m.f5768b.invoke(strC);
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            X1.a(a12, C22066f2.a(1));
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        kotlin.G0 g02;
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(-421040748);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            InterfaceC13687o0 interfaceC13687o0 = (InterfaceC13687o0) bE2.o(C13580c1.f5435a);
            C13709q4 c13709q4 = (C13709q4) bE2.o(C13767x0.f5879a);
            if (interfaceC13687o0.b()) {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarK = androidx.compose.foundation.layout.R1.k(16, 0.0f, 2, C20588k2.f(C20588k2.d(aVar, 1.0f), 32));
                bE2.I(733328855);
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
                InterfaceC22365i0 interfaceC22365i0E = C20632w.e(iVar, false, bE2, 0);
                bE2.I(-1323940314);
                int i13 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S = bE2.S();
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarK);
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
                Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
                androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0E);
                Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
                androidx.compose.runtime.R3.b(pVar2, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                    C13653k2.a(i13, bE2, i13, pVar3);
                }
                A2.a(c22096nC, androidx.compose.runtime.J2.a(bE2), bE2);
                C20644z c20644z = C20644z.f28804a;
                float f12 = 2;
                androidx.compose.ui.v vVarC = C21086w0.c(androidx.compose.ui.draw.k.a(aVar, androidx.compose.foundation.shape.o.a(f12)), false, null, null, new a(interfaceC13687o0, c13709q4), 7);
                bE2.I(733328855);
                InterfaceC22365i0 interfaceC22365i0E2 = C20632w.e(iVar, false, bE2, 0);
                bE2.I(-1323940314);
                int i14 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S2 = bE2.S();
                C22096n c22096nC2 = androidx.compose.ui.layout.M.c(vVarC);
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
                androidx.compose.runtime.R3.b(pVar, bE2, interfaceC22365i0E2);
                androidx.compose.runtime.R3.b(pVar2, bE2, o1S2);
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                    C13653k2.a(i14, bE2, i14, pVar3);
                }
                A2.a(c22096nC2, androidx.compose.runtime.J2.a(bE2), bE2);
                C13614g c13614gA = interfaceC13687o0.a();
                String str = c13614gA != null ? c13614gA.f5511a : null;
                bE2.I(-2116056100);
                if (str == null) {
                    z12 = false;
                    g02 = null;
                } else {
                    C13705q0.a(str, null, androidx.compose.foundation.layout.R1.i(C20588k2.o(aVar, 30), f12), J0.a(interfaceC13779y3.z(), bE2), U.a.a(androidx.compose.ui.graphics.U.f39332b, C13775y.a(interfaceC13779y3.z())), bE2, 432, 368);
                    g02 = kotlin.G0.f406611a;
                    z12 = false;
                }
                bE2.X(z12);
                if (g02 == null) {
                    C20806p1.b(J0.a(interfaceC13779y3.z(), bE2), null, androidx.compose.foundation.layout.R1.i(C20588k2.o(aVar, 30), f12), null, null, bE2, 432, 120);
                }
                androidx.compose.foundation.H.B(bE2, false, true, false, false);
                androidx.compose.foundation.H.B(bE2, false, true, false, false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(2);
    }
}
