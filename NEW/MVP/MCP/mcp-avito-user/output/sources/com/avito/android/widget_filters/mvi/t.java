package com.avito.android.widget_filters.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersOneTimeEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WidgetFiltersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LOP0/a;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lcom/avito/android/widget_filters/mvi/entity/c;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.l<com.avito.android.arch.mvi.q<OP0.a, WidgetFiltersInternalAction, com.avito.android.widget_filters.mvi.entity.c, WidgetFiltersOneTimeEvent>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f330225l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f330226m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f330227n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z f330228o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w f330229p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, n nVar, ScreenPerformanceTracker screenPerformanceTracker, z zVar, w wVar) {
        super(1);
        this.f330225l = rVar;
        this.f330226m = nVar;
        this.f330227n = screenPerformanceTracker;
        this.f330228o = zVar;
        this.f330229p = wVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<OP0.a, WidgetFiltersInternalAction, com.avito.android.widget_filters.mvi.entity.c, WidgetFiltersOneTimeEvent> qVar) {
        com.avito.android.arch.mvi.q<OP0.a, WidgetFiltersInternalAction, com.avito.android.widget_filters.mvi.entity.c, WidgetFiltersOneTimeEvent> qVar2 = qVar;
        qVar2.f92008d = this.f330225l;
        qVar2.f92009e = this.f330226m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f330227n, this.f330228o);
        qVar2.f92010f = this.f330229p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
