package Fc1;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.v1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13750v1 {

    /* renamed from: Fc1.v1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N7 f5857l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C22293d f5858m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5859n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f5860o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N7 n72, C22293d c22293d, Y41.a<kotlin.G0> aVar, int i12) {
            super(2);
            this.f5857l = n72;
            this.f5858m = c22293d;
            this.f5859n = aVar;
            this.f5860o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5860o | 1);
            C22293d c22293d = this.f5858m;
            Y41.a<kotlin.G0> aVar = this.f5859n;
            C13750v1.a(this.f5857l, c22293d, aVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k N7 n72, @Y61.k C22293d c22293d, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(198625301);
        int i13 = (bE2.B(n72) ? 4 : 2) | i12 | (bE2.B(c22293d) ? 32 : 16);
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        int i14 = i13;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
            androidx.compose.ui.v vVarO = C20588k2.o(C21086w0.c(androidx.compose.foundation.A.b(androidx.compose.ui.draw.y.a(androidx.compose.ui.v.f42878y1, 2, nVar, false, 28), androidx.compose.ui.graphics.V.b(n72.e()), nVar), false, null, null, aVar, 7), 56);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
            bE2.I(733328855);
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(iVar, false, bE2, 6);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarO);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                C13653k2.a(i15, bE2, i15, pVar);
            }
            A2.a(c22096nC, androidx.compose.runtime.J2.a(bE2), bE2);
            C20644z c20644z = C20644z.f28804a;
            C20806p1.b(c22293d, null, null, null, null, bE2, ((i14 >> 3) & 14) | 48, 124);
            androidx.compose.foundation.H.B(bE2, false, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(n72, c22293d, aVar, i12);
    }
}
