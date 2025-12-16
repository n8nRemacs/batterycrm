package com.avito.android.service_fee_conditions.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qu0.InterfaceC47449a;

/* compiled from: ServiceFeeConditionsScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f278566l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ qu0.c f278567m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC47449a, G0> f278568n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f278569o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f278570p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, qu0.c cVar, Y41.l lVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(2);
        this.f278566l = vVar;
        this.f278567m = cVar;
        this.f278568n = lVar;
        this.f278569o = interfaceC22204y1;
        this.f278570p = interfaceC22204y12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarD0 = this.f278566l.d0(C20588k2.f28682c);
            Y41.l<InterfaceC47449a, G0> lVar = this.f278568n;
            qu0.c cVar = this.f278567m;
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(-2025228598, new d(cVar, lVar), a13);
            InterfaceC22204y1 interfaceC22204y1 = this.f278569o;
            InterfaceC22204y1 interfaceC22204y12 = this.f278570p;
            com.akita.compose.component.scaffold.g.a(vVarD0, c22096nC, androidx.compose.runtime.internal.r.c(-1366845719, new g(cVar, interfaceC22204y1, interfaceC22204y12), a13), null, null, null, null, androidx.compose.runtime.internal.r.c(380218145, new k(cVar, interfaceC22204y12, interfaceC22204y1), a13), a13, 12583344, 120);
        }
        return G0.f406611a;
    }
}
