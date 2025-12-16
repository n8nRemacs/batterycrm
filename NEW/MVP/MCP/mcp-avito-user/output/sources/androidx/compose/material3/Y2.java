package androidx.compose.material3;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Y2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f35853l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.V1 f35854m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f35855n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35856o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35857p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f35858q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35859r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f35860s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(float f12, androidx.compose.foundation.layout.V1 v12, C22096n c22096n, Y41.p pVar, Y41.p pVar2, long j12, Y41.p pVar3, long j13) {
        super(2);
        this.f35853l = f12;
        this.f35854m = v12;
        this.f35855n = c22096n;
        this.f35856o = pVar;
        this.f35857p = pVar2;
        this.f35858q = j12;
        this.f35859r = pVar3;
        this.f35860s = j13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarH = androidx.compose.foundation.layout.R1.h(C20588k2.b(0.0f, this.f35853l, 1, aVar), this.f35854m);
            X2 x22 = X2.f35804a;
            a13.I(-1323940314);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarH);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            androidx.compose.runtime.R3.b(pVar, a13, x22);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            androidx.compose.runtime.R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            androidx.compose.foundation.H.x(0, c22096nC, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
            a13.I(651014582);
            C22096n c22096n = this.f35855n;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f35856o;
            if (c22096n != null || pVar4 != null) {
                androidx.compose.ui.v vVarB = androidx.compose.ui.layout.C.b(aVar, "leadingIcon");
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
                a13.I(733328855);
                InterfaceC22365i0 interfaceC22365i0E = C20632w.e(iVar, false, a13, 6);
                a13.I(-1323940314);
                int f37888q2 = a13.getF37888Q();
                androidx.compose.runtime.O1 o1Y2 = a13.y();
                C22096n c22096nC2 = androidx.compose.ui.layout.M.c(vVarB);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                androidx.compose.runtime.R3.b(pVar, a13, interfaceC22365i0E);
                androidx.compose.runtime.R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                }
                androidx.compose.foundation.H.x(0, c22096nC2, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
                C20644z c20644z = C20644z.f28804a;
                if (c22096n != null) {
                    a13.I(1725997334);
                    c22096n.invoke(a13, 0);
                    a13.O();
                } else if (pVar4 != null) {
                    a13.I(1725997437);
                    androidx.compose.runtime.S.a(L3.f35042a.b(androidx.compose.ui.graphics.T.a(this.f35858q)), pVar4, a13, 8);
                    a13.O();
                } else {
                    a13.I(1725997699);
                    a13.O();
                }
                a13.O();
                a13.z();
                a13.O();
                a13.O();
            }
            a13.O();
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarJ = androidx.compose.foundation.layout.R1.j(androidx.compose.ui.layout.C.b(aVar, "label"), C21762o3.f36935a, 0);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            a13.I(693286680);
            C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, a13, 54);
            a13.I(-1323940314);
            int f37888q3 = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y3 = a13.y();
            C22096n c22096nC3 = androidx.compose.ui.layout.M.c(vVarJ);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            androidx.compose.runtime.R3.b(pVar, a13, c20568f2A);
            androidx.compose.runtime.R3.b(pVar2, a13, o1Y3);
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar3);
            }
            androidx.compose.foundation.H.x(0, c22096nC3, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
            C20576h2 c20576h2 = C20576h2.f28641a;
            this.f35859r.invoke(a13, 0);
            a13.O();
            a13.z();
            a13.O();
            a13.O();
            a13.I(-313041276);
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar5 = this.f35857p;
            if (pVar5 != null) {
                androidx.compose.ui.v vVarB2 = androidx.compose.ui.layout.C.b(aVar, "trailingIcon");
                androidx.compose.ui.i iVar2 = InterfaceC22215f.a.f39080f;
                a13.I(733328855);
                InterfaceC22365i0 interfaceC22365i0E2 = C20632w.e(iVar2, false, a13, 6);
                a13.I(-1323940314);
                int f37888q4 = a13.getF37888Q();
                androidx.compose.runtime.O1 o1Y4 = a13.y();
                C22096n c22096nC4 = androidx.compose.ui.layout.M.c(vVarB2);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                androidx.compose.runtime.R3.b(pVar, a13, interfaceC22365i0E2);
                androidx.compose.runtime.R3.b(pVar2, a13, o1Y4);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q4))) {
                    androidx.appcompat.app.r.B(f37888q4, a13, f37888q4, pVar3);
                }
                androidx.compose.foundation.H.x(0, c22096nC4, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
                C20644z c20644z2 = C20644z.f28804a;
                androidx.compose.runtime.S.a(L3.f35042a.b(androidx.compose.ui.graphics.T.a(this.f35860s)), pVar5, a13, 8);
                a13.O();
                a13.z();
                a13.O();
                a13.O();
            }
            a13.O();
            a13.O();
            a13.z();
            a13.O();
        }
        return kotlin.G0.f406611a;
    }
}
