package com.avito.android.vas_performance.screens.competitive.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2Screen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f320538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JL0.c f320539m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<JL0.a, G0> f320540n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320541o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320542p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.compose.ui.v vVar, JL0.c cVar, Y41.l lVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(2);
        this.f320538l = vVar;
        this.f320539m = cVar;
        this.f320540n = lVar;
        this.f320541o = interfaceC22204y1;
        this.f320542p = interfaceC22204y12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarD0 = this.f320538l.d0(C20588k2.f28682c);
            JL0.c cVar = this.f320539m;
            Y41.l<JL0.a, G0> lVar = this.f320540n;
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(1810061036, new c(cVar, lVar), a13);
            InterfaceC22204y1 interfaceC22204y1 = this.f320541o;
            com.akita.compose.component.scaffold.g.a(vVarD0, c22096nC, androidx.compose.runtime.internal.r.c(745093805, new g(cVar, interfaceC22204y1, lVar), a13), null, null, null, null, androidx.compose.runtime.internal.r.c(-930501259, new k(cVar, this.f320542p, interfaceC22204y1), a13), a13, 12583344, 120);
        }
        return G0.f406611a;
    }
}
