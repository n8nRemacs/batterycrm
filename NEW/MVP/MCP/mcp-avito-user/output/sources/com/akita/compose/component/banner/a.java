package com.akita.compose.component.banner;

import Y41.p;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import com.akita.compose.foundation.modifier.f;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Banner.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f60420l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60421m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f60422n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f60423o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f60424p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f60425q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, Y41.a aVar, r rVar, r rVar2, t tVar, C22096n c22096n) {
        super(2);
        this.f60420l = hVar;
        this.f60421m = aVar;
        this.f60422n = rVar;
        this.f60423o = rVar2;
        this.f60424p = tVar;
        this.f60425q = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            float f12 = this.f60420l.f60471i;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(f12);
            v.a aVar = v.f42878y1;
            v vVarA = C20646z1.a(C20588k2.d(aVar, 1.0f), IntrinsicSize.f28333b);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = n.c(a13, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
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
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v vVarW = C20588k2.w(c20576h2.a(aVar, 1.0f, true), null, 3);
            f.a aVar3 = com.akita.compose.foundation.modifier.f.f63621c;
            g.d(this.f60421m, this.f60420l, vVarW, this.f60422n, this.f60423o, this.f60424p, a13, 134250496);
            C22096n c22096n = this.f60425q;
            if (c22096n != null) {
                v vVarD0 = c20576h2.a(aVar, 1.0f, true).d0(C20588k2.f28681b);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                v vVarC2 = n.c(a13, vVarD0);
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
                R3.b(pVar, a13, interfaceC22365i0D);
                R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                }
                R3.b(pVar4, a13, vVarC2);
                c22096n.invoke(C20644z.f28804a, a13, 6);
                a13.z();
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
