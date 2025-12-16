package com.avito.android.vas_performance.screens.stickers.edit.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f320911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f320912m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ML0.c f320913n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320914o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320915p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ML0.a, G0> f320916q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, u uVar, ML0.c cVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Y41.l lVar) {
        super(2);
        this.f320911l = vVar;
        this.f320912m = uVar;
        this.f320913n = cVar;
        this.f320914o = interfaceC22204y1;
        this.f320915p = interfaceC22204y12;
        this.f320916q = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarD0 = this.f320911l.d0(C20588k2.f28682c);
            InterfaceC22204y1 interfaceC22204y1 = this.f320914o;
            InterfaceC22204y1 interfaceC22204y12 = this.f320915p;
            ML0.c cVar = this.f320913n;
            com.akita.compose.component.scaffold.g.a(vVarD0, r.c(-512856332, new h(cVar, interfaceC22204y1, interfaceC22204y12), a13), r.c(-626466827, new j(cVar, this.f320916q), a13), this.f320912m, null, null, null, r.c(1030532285, new n(cVar, interfaceC22204y1, interfaceC22204y12), a13), a13, 12583344, 112);
        }
        return G0.f406611a;
    }
}
