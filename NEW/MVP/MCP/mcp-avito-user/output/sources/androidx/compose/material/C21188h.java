package androidx.compose.material;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AlertDialog.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21188h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33608m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33609n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21188h(Y41.p pVar, Y41.p pVar2, C22096n c22096n) {
        super(2);
        this.f33607l = pVar;
        this.f33608m = pVar2;
        this.f33609n = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        C22096n c22096nC;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC2 = null;
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f33607l;
            if (pVar2 == null) {
                a13.C(-366997612);
                a13.h();
                c22096nC = null;
            } else {
                a13.C(-366997611);
                c22096nC = androidx.compose.runtime.internal.r.c(620104160, new C21149e(pVar2), a13);
                a13.h();
            }
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f33608m;
            if (pVar3 == null) {
                a13.C(-366576167);
            } else {
                a13.C(-366576166);
                c22096nC2 = androidx.compose.runtime.internal.r.c(1965858367, new C21175g(pVar3), a13);
            }
            a13.h();
            C21279o.a(k12, c22096nC, c22096nC2, a13, 6);
            this.f33609n.invoke(a13, 0);
            a13.z();
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
