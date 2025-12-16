package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: CallsHistoryScreenUI.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f164886l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164887m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164888n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f164889o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164890p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l0.a f164891q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164892r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacCallsHistoryItem, G0> f164893s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(v vVar, Y41.a<G0> aVar, CallsHistoryScreenState callsHistoryScreenState, Y41.l<? super Integer, G0> lVar, Y41.a<G0> aVar2, l0.a aVar3, Y41.a<G0> aVar4, Y41.l<? super IacCallsHistoryItem, G0> lVar2) {
        super(2);
        this.f164886l = vVar;
        this.f164887m = aVar;
        this.f164888n = callsHistoryScreenState;
        this.f164889o = lVar;
        this.f164890p = aVar2;
        this.f164891q = aVar3;
        this.f164892r = aVar4;
        this.f164893s = lVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.scaffold.g.a(this.f164886l.d0(C20588k2.f28682c), androidx.compose.runtime.internal.r.c(-666917374, new a(this.f164887m), a13), null, null, null, null, null, androidx.compose.runtime.internal.r.c(1199780299, new c(this.f164888n, this.f164889o, this.f164890p, this.f164891q, this.f164892r, this.f164893s), a13), a13, 12582960, 124);
        }
        return G0.f406611a;
    }
}
