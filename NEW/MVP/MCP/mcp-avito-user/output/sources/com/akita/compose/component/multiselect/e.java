package com.akita.compose.component.multiselect;

import Y41.p;
import Y41.q;
import androidx.appcompat.app.r;
import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.multiselect.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectScope.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements q<InterfaceC20343e0, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g.a f62168l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f62169m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62170n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f62171o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f62172p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(g.a aVar, String str, boolean z12, g gVar, Y41.a<G0> aVar2) {
        super(3);
        this.f62168l = aVar;
        this.f62169m = str;
        this.f62170n = z12;
        this.f62171o = gVar;
        this.f62172p = (N) aVar2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final G0 invoke(InterfaceC20343e0 interfaceC20343e0, A a12, Integer num) {
        long jC2;
        A a13 = a12;
        num.intValue();
        v.a aVar = v.f42878y1;
        g.a aVar2 = this.f62168l;
        v vVarH = R1.h(androidx.compose.foundation.A.b(C20588k2.f(aVar, aVar2.f62182a), aVar2.f62188g.c(a13), aVar2.f62183b), aVar2.f62184c);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
        int f37888q = a13.getF37888Q();
        O1 o1Y = a13.y();
        v vVarC = n.c(a13, vVarH);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar3);
        } else {
            a13.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
            r.B(f37888q, a13, f37888q, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        v vVarC2 = M1.c(0.0f, aVar2.f62185d, 1, aVar);
        a13.C(-770217475);
        boolean z12 = this.f62170n;
        g gVar = this.f62171o;
        if (z12) {
            T.f39320b.getClass();
            jC2 = T.f39330l;
        } else {
            jC2 = gVar.f62180d.c(a13);
        }
        long j12 = jC2;
        a13.h();
        com.akita.compose.foundation.ui.p.b(this.f62169m, aVar2.f62187f, vVarC2, false, j12, null, 0, 0, false, null, a13, 0, 1000);
        com.akita.compose.foundation.ui.g.b(aVar2.f62186e, null, a13, 0, 2);
        com.akita.compose.component.close_button.b.a(this.f62172p, gVar.f62177a.f61849v, null, z12, gVar.f62180d, null, a13, 0, 36);
        a13.z();
        return G0.f406611a;
    }
}
