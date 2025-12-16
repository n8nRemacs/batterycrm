package com.akita.compose.component.navbar;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NavBar.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f62287l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62288m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f62289n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Y41.a<G0> aVar, int i12) {
        super(2);
        this.f62287l = uVar;
        this.f62288m = aVar;
        this.f62289n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, this.f62287l.f62295f, 0.0f, 11), androidx.compose.foundation.shape.o.f30153a);
            androidx.compose.ui.semantics.i.f41744b.getClass();
            androidx.compose.ui.v vVarC = C21086w0.c(vVarA, false, null, androidx.compose.ui.semantics.i.a(0), this.f62288m, 3);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarC);
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
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.foundation.ui.e.a(u0.e.a(this.f62289n, 0, a13), "", null, null, a13, 56, 12);
            a13.z();
        }
        return G0.f406611a;
    }
}
