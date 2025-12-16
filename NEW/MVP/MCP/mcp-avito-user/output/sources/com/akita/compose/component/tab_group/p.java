package com.akita.compose.component.tab_group;

import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: TabGroup.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class p extends N implements Y41.p<Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T1 f63063l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63064m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F f63065n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f63066o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f63067p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f63068q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Integer> f63069r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f63070s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(T1 t12, float f12, F f13, C22096n c22096n, t tVar, int i12, Y41.a aVar, C22096n c22096n2) {
        super(2);
        this.f63063l = t12;
        this.f63064m = f12;
        this.f63065n = f13;
        this.f63066o = c22096n;
        this.f63067p = tVar;
        this.f63068q = i12;
        this.f63069r = aVar;
        this.f63070s = c22096n2;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(Z0 z02, C22712b c22712b) {
        Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        LayoutDirection f40449b = z03.getF40449b();
        T1 t12 = this.f63063l;
        int iY02 = z03.y0(t12.c(f40449b));
        int iY03 = z03.y0(t12.a(z03.getF40449b()));
        int iY04 = z03.y0(this.f63064m);
        l0.f fVar = new l0.f();
        fVar.f406840b = iY02 + iY03;
        l0.f fVar2 = new l0.f();
        List<InterfaceC22363h0> listH0 = z03.h0(v.f63100b, new C22096n(-1427640204, new o(this.f63066o), true));
        List<InterfaceC22363h0> list = listH0;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            K0 k0I = ((InterfaceC22363h0) obj).I(j12);
            long j13 = j12;
            fVar.f406840b += i12 == C42745f0.J(listH0) ? k0I.f40345b : k0I.f40345b + iY04;
            fVar2.f406840b = Math.max(fVar2.f406840b, k0I.f40346c);
            arrayList.add(k0I);
            j12 = j13;
            i12 = i13;
        }
        int iMax = Math.max(z03.y0(this.f63065n.h()), fVar.f406840b);
        fVar.f406840b = iMax;
        return z03.L0(iMax, fVar2.f406840b, P0.c(), new n(iY02, arrayList, fVar, iY03, z03, this.f63067p, this.f63068q, this.f63069r, iY04, this.f63070s, fVar2));
    }
}
