package com.akita.compose.component.tooltip;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Tooltip.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f63513l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f63514m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22602e f63515n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f63516o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63517p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C22602e c22602e, w wVar, C22602e c22602e2, String str, Y41.a<G0> aVar) {
        super(3);
        this.f63513l = c22602e;
        this.f63514m = wVar;
        this.f63515n = c22602e2;
        this.f63516o = str;
        this.f63517p = aVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        w wVar;
        C22602e c22602e;
        w wVar2;
        w wVar3;
        Y41.a<G0> aVar;
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar2);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            a13.C(-988933575);
            C22602e c22602e2 = this.f63513l;
            w wVar4 = this.f63514m;
            if (c22602e2 != null) {
                wVar = wVar4;
                c22602e = c22602e2;
                com.akita.compose.foundation.ui.p.a(c22602e2, wVar4.f63559g, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            } else {
                wVar = wVar4;
                c22602e = c22602e2;
            }
            a13.h();
            a13.C(-988930091);
            C22602e c22602e3 = this.f63515n;
            if (c22602e == null || c22602e3 == null) {
                wVar2 = wVar;
            } else {
                wVar2 = wVar;
                com.akita.compose.foundation.ui.g.a(wVar2.f63555c, null, a13, 0);
            }
            a13.h();
            a13.C(-988925749);
            if (c22602e3 != null) {
                wVar3 = wVar2;
                com.akita.compose.foundation.ui.p.a(c22602e3, wVar2.f63560h, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            } else {
                wVar3 = wVar2;
            }
            a13.h();
            String str = this.f63516o;
            if (str != null && (aVar = this.f63517p) != null) {
                w wVar5 = wVar3;
                com.akita.compose.foundation.ui.g.a(wVar5.f63556d, null, a13, 0);
                com.akita.compose.component.button.m.c(str, aVar, wVar5.f63561i, null, null, null, null, false, false, null, a13, 512, 1016);
                com.akita.compose.foundation.ui.g.a(wVar5.f63557e, null, a13, 0);
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
