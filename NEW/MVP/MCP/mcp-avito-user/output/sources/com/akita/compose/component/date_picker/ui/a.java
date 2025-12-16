package com.akita.compose.component.date_picker.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DatePickerContent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f61286l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f61287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f61288n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w0 f61289o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, Boolean> f61290p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, Boolean> f61291q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, G0> f61292r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(v vVar, F f12, K k12, w0 w0Var, Y41.l<? super Long, Boolean> lVar, Y41.l<? super Long, Boolean> lVar2, Y41.l<? super Long, G0> lVar3) {
        super(2);
        this.f61286l = vVar;
        this.f61287m = f12;
        this.f61288n = k12;
        this.f61289o = w0Var;
        this.f61290p = lVar;
        this.f61291q = lVar2;
        this.f61292r = lVar3;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarK = R1.k(this.f61287m.f61132f, 0.0f, 2, this.f61286l);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarK);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            int i12 = com.akita.compose.component.floating_container.c.f61576e;
            K k13 = this.f61288n;
            F f12 = this.f61287m;
            u.a(k13, f12, null, a13, 64);
            p.a(k13, this.f61289o, this.f61290p, this.f61291q, this.f61292r, f12, a13, 262144);
            a13.z();
        }
        return G0.f406611a;
    }
}
