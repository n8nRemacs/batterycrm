package com.akita.compose.component.accordion;

import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Accordion.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.q<InterfaceC20343e0, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V1 f60183l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f60184m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(V1 v12, C22096n c22096n) {
        super(3);
        this.f60183l = v12;
        this.f60184m = c22096n;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20343e0 interfaceC20343e0, A a12, Integer num) {
        A a13 = a12;
        num.intValue();
        androidx.compose.ui.v vVarH = R1.h(androidx.compose.ui.v.f42878y1, this.f60183l);
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int f37888q = a13.getF37888Q();
        O1 o1Y = a13.y();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarH);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar);
        } else {
            a13.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
        C20644z c20644z = C20644z.f28804a;
        this.f60184m.invoke(a13, 0);
        a13.z();
        return G0.f406611a;
    }
}
