package com.avito.android.search_suggest.mvi;

import Pp0.InterfaceC14824b;
import Pp0.InterfaceC14825c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchSuggestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPp0/b;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "LPp0/d;", "LPp0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<q<InterfaceC14824b, SearchSuggestInternalAction, Pp0.d, InterfaceC14825c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f264348l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f264349m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f264350n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f264351o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f264352p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f264348l = fVar;
        this.f264349m = cVar;
        this.f264350n = screenPerformanceTracker;
        this.f264351o = nVar;
        this.f264352p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14824b, SearchSuggestInternalAction, Pp0.d, InterfaceC14825c> qVar) {
        q<InterfaceC14824b, SearchSuggestInternalAction, Pp0.d, InterfaceC14825c> qVar2 = qVar;
        qVar2.f92008d = this.f264348l;
        qVar2.f92009e = this.f264349m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f264350n, this.f264351o);
        qVar2.f92010f = this.f264352p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
