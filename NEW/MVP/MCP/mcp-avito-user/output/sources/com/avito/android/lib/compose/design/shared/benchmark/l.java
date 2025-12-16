package com.avito.android.lib.compose.design.shared.benchmark;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.v;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.compose.s;
import com.avito.android.analytics.screens.mvi.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BenchmarkComposeActivity.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f177652l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U2.b f177653m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C42784z0 f177654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(U2.b bVar, String str, C42784z0 c42784z0) {
        super(2);
        this.f177652l = str;
        this.f177653m = bVar;
        this.f177654n = c42784z0;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            J.b bVar = J.b.f90385a;
            String str = this.f177652l;
            r rVar = new r(str, bVar);
            a13.C(-976608008);
            a13.C(2063036140);
            boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
            U2.b bVar2 = this.f177653m;
            C42784z0 c42784z0 = this.f177654n;
            if (zBooleanValue) {
                a13.C(421109671);
                C20650b.a(null, (w0) s.b(h.f177645l, a13), null, false, null, null, null, false, null, new j(bVar2, c42784z0), a13, 0, 509);
                a13.h();
            } else {
                a13.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                aVar.m(str);
                aVar.l();
                v vVarD = androidx.compose.ui.draw.o.d(v.f42878y1, new k(rVar, aVar));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, vVarD);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                C20650b.a(null, (w0) s.b(h.f177645l, a13), null, false, null, null, null, false, null, new j(bVar2, c42784z0), a13, 0, 509);
                a13.z();
                a13.h();
            }
            a13.h();
            a13.h();
        }
        return G0.f406611a;
    }
}
