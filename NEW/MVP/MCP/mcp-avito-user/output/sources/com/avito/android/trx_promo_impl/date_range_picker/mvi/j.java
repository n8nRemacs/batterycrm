package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.entity.TrxPromoDateRangePickerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoDateRangePickerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LSF0/a;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "LSF0/c;", "LSF0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j extends N implements Y41.l<q<SF0.a, TrxPromoDateRangePickerInternalAction, SF0.c, SF0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f304054l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f304055m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f304056n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f304057o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f304058p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f304054l = hVar;
        this.f304055m = eVar;
        this.f304056n = screenPerformanceTracker;
        this.f304057o = oVar;
        this.f304058p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<SF0.a, TrxPromoDateRangePickerInternalAction, SF0.c, SF0.b> qVar) {
        q<SF0.a, TrxPromoDateRangePickerInternalAction, SF0.c, SF0.b> qVar2 = qVar;
        qVar2.f92008d = this.f304054l;
        qVar2.f92009e = this.f304055m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f304056n, this.f304057o);
        qVar2.f92010f = this.f304058p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
