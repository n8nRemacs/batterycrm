package com.akita.compose.component.tab_group;

import androidx.compose.foundation.d2;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: TabGroup.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n extends N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f63051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f63052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f63053n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f63054o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f63055p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t f63056q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63057r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Integer> f63058s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f63059t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22096n f63060u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0.f f63061v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12, ArrayList arrayList, l0.f fVar, int i13, Z0 z02, t tVar, int i14, Y41.a aVar, int i15, C22096n c22096n, l0.f fVar2) {
        super(1);
        this.f63051l = i12;
        this.f63052m = arrayList;
        this.f63053n = fVar;
        this.f63054o = i13;
        this.f63055p = z02;
        this.f63056q = tVar;
        this.f63057r = i14;
        this.f63058s = aVar;
        this.f63059t = i15;
        this.f63060u = c22096n;
        this.f63061v = fVar2;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        int i12 = this.f63051l;
        R2.d dVar = new R2.d(i12, 0);
        ArrayList arrayList = this.f63052m;
        int i13 = i12;
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            K0 k02 = (K0) obj;
            aVar2.h(k02, i13, 0, 0.0f);
            if (i14 == this.f63057r) {
                Y41.a<Integer> aVar3 = this.f63058s;
                dVar = new R2.d(i13, aVar3 != null ? aVar3.invoke().intValue() : k02.f40345b);
            }
            i13 += i14 == arrayList.size() - 1 ? k02.f40345b : k02.f40345b + this.f63059t;
            i14 = i15;
        }
        int i16 = this.f63053n.f406840b - i12;
        int i17 = this.f63054o;
        int i18 = i16 - i17;
        for (InterfaceC22363h0 interfaceC22363h0 : this.f63055p.h0(v.f63101c, new C22096n(-1174355948, new m(this.f63060u, new R2.a(dVar, i12, i18)), true))) {
            C22712b.a aVar4 = C22712b.f42842b;
            int i19 = this.f63061v.f406840b;
            aVar4.getClass();
            aVar2.h(interfaceC22363h0.I(C22712b.a.c(i18, i19)), 0, 0, 0.0f);
        }
        int i22 = i13 + i17;
        t tVar = this.f63056q;
        if (!L.f(tVar.f63093c, dVar)) {
            tVar.f63093c = dVar;
            d2 d2Var = tVar.f63091a;
            int iG2 = i22 - d2Var.g();
            int i23 = dVar.f14082a - ((iG2 / 2) - (dVar.f14083b / 2));
            int i24 = i22 - iG2;
            if (i24 < 0) {
                i24 = 0;
            }
            int iG3 = kotlin.ranges.s.g(i23, 0, i24);
            if (((C22061e3) d2Var.f27081a).e() != iG3) {
                C43259k.d(tVar.f63092b, null, null, new s(tVar, iG3, null), 3);
            }
        }
        return G0.f406611a;
    }
}
