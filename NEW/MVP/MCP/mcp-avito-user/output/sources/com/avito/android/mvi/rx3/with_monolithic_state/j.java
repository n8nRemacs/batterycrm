package com.avito.android.mvi.rx3.with_monolithic_state;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "StateT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "kotlin.jvm.PlatformType", "reducible", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mvi/rx3/with_monolithic_state/x;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<x<Object>, io.reactivex.rxjava3.core.E<? extends G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207159l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t<Object> f207160m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractC32892c<Object> abstractC32892c, t<Object> tVar) {
        super(1);
        this.f207159l = abstractC32892c;
        this.f207160m = tVar;
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.E<? extends G0> invoke(x<Object> xVar) {
        x<Object> xVar2 = xVar;
        AbstractC32892c<Object> abstractC32892c = this.f207159l;
        com.jakewharton.rxrelay3.d<Object> dVar = abstractC32892c.f207138P;
        hu.akarnokd.rxjava3.schedulers.c cVar = abstractC32892c.f207140R;
        return dVar.j0(cVar).z0(1L).T(new com.avito.android.blueprints.publish.reg_number.d(14, new g(abstractC32892c, xVar2, this.f207160m)), Integer.MAX_VALUE).j0(cVar).N(new AJ.b(13, new h(abstractC32892c, xVar2))).d0(new com.avito.android.blueprints.publish.reg_number.d(15, new i(abstractC32892c))).x0(cVar);
    }
}
