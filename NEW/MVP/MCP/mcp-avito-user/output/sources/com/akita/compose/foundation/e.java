package com.akita.compose.foundation;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultTheme.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f63581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f63582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f63583n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, v.a aVar, Y41.p pVar2) {
        super(2);
        this.f63581l = pVar;
        this.f63582m = aVar;
        this.f63583n = pVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            long jC2 = this.f63581l.c(a13);
            Y41.p<A, Integer, G0> pVar = this.f63583n;
            if (jC2 != 16) {
                a13.C(579281227);
                v vVarB = androidx.compose.foundation.A.b(this.f63582m, jC2, Y0.f39346a);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, vVarB);
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
                Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar2);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                pVar.invoke(a13, 0);
                a13.z();
                a13.h();
            } else {
                a13.C(579381419);
                pVar.invoke(a13, 0);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
