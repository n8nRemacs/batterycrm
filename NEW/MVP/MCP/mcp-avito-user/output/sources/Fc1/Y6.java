package Fc1;

import android.graphics.Color;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.unit.h;
import kotlin.NoWhenBranchMatchedException;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Y6 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f5338l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f5339m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f5340n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f5341o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.v vVar, boolean z12, int i12, int i13) {
            super(2);
            this.f5338l = vVar;
            this.f5339m = z12;
            this.f5340n = i12;
            this.f5341o = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5340n | 1);
            Y6.a(this.f5338l, this.f5339m, a12, iA2, this.f5341o);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.ui.v vVar, boolean z12, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.v vVar2;
        int i14;
        androidx.compose.ui.v vVar3;
        long jA2;
        androidx.compose.ui.v vVarB;
        androidx.compose.runtime.B bE2 = a12.E(-2085605688);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            vVar2 = vVar;
        } else if ((i12 & 14) == 0) {
            vVar2 = vVar;
            i14 = (bE2.B(vVar2) ? 4 : 2) | i12;
        } else {
            vVar2 = vVar;
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar3 = vVar2;
        } else {
            vVar3 = i15 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            if (z12) {
                jA2 = C13775y.a(interfaceC13779y3.l());
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.graphics.T.f39320b.getClass();
                jA2 = androidx.compose.ui.graphics.T.f39330l;
            }
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarO = C20588k2.o(vVar3, 24);
            if (z12) {
                float f12 = 3;
                vVarB = androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(androidx.compose.foundation.A.b(vVarO, androidx.compose.ui.graphics.V.b(Color.parseColor(C13566a5.a(77, interfaceC13779y3.t()).f5864a)), androidx.compose.foundation.shape.o.a(f12)), 4), C13775y.a(interfaceC13779y3.t()), androidx.compose.foundation.shape.o.a(f12));
            } else {
                vVarB = androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(vVarO, 4), C13775y.a(interfaceC13779y3.r()), androidx.compose.foundation.shape.o.a(3)), 2), C13775y.a(interfaceC13779y3.m()), androidx.compose.ui.graphics.Y0.f39346a);
            }
            androidx.compose.ui.v vVar4 = vVarB;
            C22293d.a aVar2 = new C22293d.a("_03", 11, 9, 11.0f, 9.0f, 0L, 0, false, 224, null);
            androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(jA2, null);
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            androidx.compose.ui.graphics.n1.f39707b.getClass();
            androidx.compose.ui.graphics.J0.f39288b.getClass();
            C22295f c22295f = new C22295f();
            c22295f.j(3.5f, 7.328f);
            c22295f.h(0.875f, 4.821f);
            c22295f.h(0.0f, 5.657f);
            c22295f.h(3.5f, 9.0f);
            c22295f.h(11.0f, 1.836f);
            c22295f.h(10.125f, 1.0f);
            c22295f.h(3.5f, 7.328f);
            c22295f.c();
            C22293d.a.c(aVar2, c22295f.f39885a, 0, k1Var, 1.0f, null, 1.0f, 0.0f, 0, 0, 4.0f, 14336);
            C22293d c22293dD = aVar2.d();
            InterfaceC22374n.f40491a.getClass();
            C20806p1.b(c22293dD, null, vVar4, InterfaceC22374n.a.f40497f, null, bE2, 24624, 104);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(vVar3, z12, i12, i13);
    }
}
