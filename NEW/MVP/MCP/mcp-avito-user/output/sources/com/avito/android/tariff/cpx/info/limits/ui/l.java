package com.avito.android.tariff.cpx.info.limits.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vB0.InterfaceC49191a;

/* compiled from: TariffCpxInfoLimitsScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f296666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49191a, G0> f296667m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vB0.c f296668n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f296669o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f296670p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, Y41.l lVar, vB0.c cVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(2);
        this.f296666l = vVar;
        this.f296667m = lVar;
        this.f296668n = cVar;
        this.f296669o = interfaceC22204y1;
        this.f296670p = interfaceC22204y12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarD0 = this.f296666l.d0(C20588k2.f28682c);
            C22096n c22096nC = r.c(-531576808, new g(this.f296667m), a13);
            InterfaceC22204y1 interfaceC22204y1 = this.f296670p;
            com.akita.compose.component.scaffold.g.a(vVarD0, c22096nC, null, null, null, null, null, r.c(766421857, new k(this.f296668n, this.f296669o, interfaceC22204y1), a13), a13, 12582960, 124);
        }
        return G0.f406611a;
    }
}
