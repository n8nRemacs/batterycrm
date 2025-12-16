package com.avito.android.hotel_booking.select_radio.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectRadioFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LTI/a;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "LTI/c;", "LTI/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<q<TI.a, SelectRadioInternalAction, TI.c, TI.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f164041l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f164042m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f164043n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f164044o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f164045p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f164041l = eVar;
        this.f164042m = cVar;
        this.f164043n = screenPerformanceTracker;
        this.f164044o = mVar;
        this.f164045p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<TI.a, SelectRadioInternalAction, TI.c, TI.b> qVar) {
        q<TI.a, SelectRadioInternalAction, TI.c, TI.b> qVar2 = qVar;
        qVar2.f92008d = this.f164041l;
        qVar2.f92009e = this.f164042m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f164043n, this.f164044o);
        qVar2.f92010f = this.f164045p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
