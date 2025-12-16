package com.akita.compose.component.tab_group;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.V0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q extends N implements Y41.q<F, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1 f63072m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d2 f63073n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f63074o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f63075p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t f63076q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63077r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Integer> f63078s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22096n f63079t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.compose.ui.v vVar, T1 t12, d2 d2Var, float f12, C22096n c22096n, t tVar, int i12, Y41.a aVar, C22096n c22096n2) {
        super(3);
        this.f63071l = vVar;
        this.f63072m = t12;
        this.f63073n = d2Var;
        this.f63074o = f12;
        this.f63075p = c22096n;
        this.f63076q = tVar;
        this.f63077r = i12;
        this.f63078s = aVar;
        this.f63079t = c22096n2;
    }

    @Override // Y41.q
    public final G0 invoke(F f12, A a12, Integer num) {
        F f13 = f12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(f13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.v vVarX = C20588k2.x(this.f63071l, InterfaceC22215f.a.f39079e, 2);
            T1 t12 = this.f63072m;
            V0.a(androidx.compose.ui.draw.k.b(androidx.compose.foundation.selection.a.a(a2.b(R1.m(vVarX, 0.0f, t12.getF28512b(), 0.0f, t12.getF28514d(), 5), this.f63073n, false, true))), new p(this.f63072m, this.f63074o, f13, this.f63075p, this.f63076q, this.f63077r, this.f63078s, this.f63079t), a13, 0, 0);
        }
        return G0.f406611a;
    }
}
