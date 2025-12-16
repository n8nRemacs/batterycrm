package com.akita.compose.component.input;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Input.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "textField", "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.q<Y41.p<? super A, ? super Integer, ? extends G0>, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f61701l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i.b f61702m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f61703n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f61704o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61705p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61706q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T1 f61707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f61708s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22096n f61709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, i.b bVar, boolean z12, boolean z13, Y41.a aVar, C22096n c22096n, T1 t12, C22096n c22096n2, C22096n c22096n3) {
        super(3);
        this.f61701l = vVar;
        this.f61702m = bVar;
        this.f61703n = z12;
        this.f61704o = z13;
        this.f61705p = aVar;
        this.f61706q = c22096n;
        this.f61707r = t12;
        this.f61708s = c22096n2;
        this.f61709t = c22096n3;
    }

    @Override // Y41.q
    public final G0 invoke(Y41.p<? super A, ? super Integer, ? extends G0> pVar, A a12, Integer num) {
        Y41.a<G0> aVar;
        Y41.p<? super A, ? super Integer, ? extends G0> pVar2 = pVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.u(pVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            v vVar = this.f61701l;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(vVarD, vVar.f61840m);
            if (this.f61703n && this.f61704o && (aVar = this.f61705p) != null) {
                vVarA = C21086w0.c(vVarA, false, null, null, aVar, 7);
            }
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, this.f61702m, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3 = InterfaceC22413h.a.f40796g;
            R3.b(pVar3, a13, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar4 = InterfaceC22413h.a.f40795f;
            R3.b(pVar4, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar5);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar6 = InterfaceC22413h.a.f40793d;
            R3.b(pVar6, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            a13.C(1652442148);
            C22096n c22096n = this.f61706q;
            if (c22096n != null) {
                u.d(vVar.f61837j, c22096n, a13, 0);
            }
            a13.h();
            androidx.compose.ui.v vVarB = C20588k2.b(0.0f, vVar.f61844q, 1, c20576h2.a(aVar2, 1.0f, true));
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.v vVarH = R1.h(c20576h2.c(vVarB, InterfaceC22215f.a.f39085k), this.f61707r);
            long j12 = vVar.f61836i;
            androidx.compose.ui.v vVarB2 = M1.b(vVarH, androidx.compose.ui.unit.j.b(j12), androidx.compose.ui.unit.j.c(j12));
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, true);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarB2);
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
            R3.b(pVar3, a13, interfaceC22365i0D);
            R3.b(pVar4, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar5);
            }
            R3.b(pVar6, a13, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            this.f61709t.invoke(a13, 6);
            pVar2.invoke(a13, Integer.valueOf(iIntValue & 14));
            a13.z();
            C22096n c22096n2 = this.f61708s;
            if (c22096n2 != null) {
                u.d(vVar.f61838k, c22096n2, a13, 0);
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
