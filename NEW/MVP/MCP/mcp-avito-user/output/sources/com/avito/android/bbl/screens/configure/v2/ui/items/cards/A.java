package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.grid.y0;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGrid.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class A extends N implements Y41.l<y0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f99387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<D> f99388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f99389n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I0 f99390o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f99391p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f99392q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Y41.p pVar, List list, Y41.p pVar2, I0 i02, androidx.compose.ui.unit.d dVar, C22096n c22096n) {
        super(1);
        this.f99387l = pVar;
        this.f99388m = list;
        this.f99389n = pVar2;
        this.f99390o = i02;
        this.f99391p = dVar;
        this.f99392q = c22096n;
    }

    @Override // Y41.l
    public final G0 invoke(y0 y0Var) {
        y0 y0Var2 = y0Var;
        Y41.p<androidx.compose.runtime.A, Integer, G0> pVar = this.f99387l;
        if (pVar != null) {
            y0Var2.d(s.f99439l, new C22096n(560284081, new t(pVar), true));
        }
        int i12 = 0;
        for (Object obj : this.f99388m) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            D d12 = (D) obj;
            boolean f99405c = d12.getF99405c();
            C22096n c22096n = this.f99392q;
            if (f99405c) {
                y0Var2.d(u.f99441l, new C22096n(-1468304134, new v(this.f99390o, this.f99391p, c22096n, d12, i12, this.f99387l), true));
            } else {
                y0Var2.d(w.f99448l, new C22096n(124257603, new x(c22096n, d12, i12), true));
            }
            i12 = i13;
        }
        Y41.p<androidx.compose.runtime.A, Integer, G0> pVar2 = this.f99389n;
        if (pVar2 != null) {
            y0Var2.d(y.f99452l, new C22096n(1569905256, new z(pVar2), true));
        }
        return G0.f406611a;
    }
}
