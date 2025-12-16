package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction;
import fh0.C40423b;
import fh0.InterfaceC40422a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormSelectItemFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lfh0/a;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lfh0/b;", "Lfh0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<q<InterfaceC40422a, RatingFormSelectItemInternalAction, C40423b, fh0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f249099l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f249100m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f249101n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f249102o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f249103p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f249099l = eVar;
        this.f249100m = aVar;
        this.f249101n = screenPerformanceTracker;
        this.f249102o = lVar;
        this.f249103p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40422a, RatingFormSelectItemInternalAction, C40423b, fh0.c> qVar) {
        q<InterfaceC40422a, RatingFormSelectItemInternalAction, C40423b, fh0.c> qVar2 = qVar;
        qVar2.f92008d = this.f249099l;
        qVar2.f92009e = this.f249100m;
        qVar2.f92011g = new o(this.f249101n, this.f249102o);
        qVar2.f92010f = this.f249103p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
