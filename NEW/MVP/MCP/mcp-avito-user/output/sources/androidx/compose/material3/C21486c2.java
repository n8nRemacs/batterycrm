package androidx.compose.material3;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Button.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21486c2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f36123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f36124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21486c2(androidx.compose.foundation.layout.T1 t12, C22096n c22096n) {
        super(2);
        this.f36123l = t12;
        this.f36124m = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            X1.f35798a.getClass();
            androidx.compose.ui.v vVarH = androidx.compose.foundation.layout.R1.h(C20588k2.a(aVar, X1.f35801d, X1.f35802e), this.f36123l);
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            a13.I(693286680);
            C20568f2 c20568f2A = C20563e2.a(cVar, bVar, a13, 54);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            androidx.compose.foundation.H.x(0, c22096nC, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
            this.f36124m.invoke(C20576h2.f28641a, a13, 6);
            a13.O();
            a13.z();
            a13.O();
            a13.O();
        }
        return kotlin.G0.f406611a;
    }
}
