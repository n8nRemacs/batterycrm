package com.akita.compose.foundation.ui;

import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.y;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Surface.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f63725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63726m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h1 f63727n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f63728o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f63729p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v vVar, float f12, h1 h1Var, com.akita.compose.foundation.p pVar, Y41.p pVar2) {
        super(2);
        this.f63725l = vVar;
        this.f63726m = f12;
        this.f63727n = h1Var;
        this.f63728o = pVar;
        this.f63729p = pVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            float f12 = this.f63726m;
            v vVar = this.f63725l;
            h1 h1Var = this.f63727n;
            v vVarA = androidx.compose.ui.draw.k.a(androidx.compose.foundation.A.b(y.a(vVar, f12, h1Var, false, 24).d0(v.f42878y1), this.f63728o.c(a13), h1Var), h1Var);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, true);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarA);
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
                r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            this.f63729p.invoke(a13, 0);
            a13.z();
        }
        return G0.f406611a;
    }
}
