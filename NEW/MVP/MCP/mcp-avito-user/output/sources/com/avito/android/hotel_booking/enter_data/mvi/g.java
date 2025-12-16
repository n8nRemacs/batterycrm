package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.enter_data.mvi.entity.EnterDataInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EnterDataFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQI/a;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "LQI/c;", "LQI/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<com.avito.android.arch.mvi.q<QI.a, EnterDataInternalAction, QI.c, QI.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f163577l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f163578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f163579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f163580o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f163581p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f163577l = eVar;
        this.f163578m = cVar;
        this.f163579n = screenPerformanceTracker;
        this.f163580o = mVar;
        this.f163581p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<QI.a, EnterDataInternalAction, QI.c, QI.b> qVar) {
        com.avito.android.arch.mvi.q<QI.a, EnterDataInternalAction, QI.c, QI.b> qVar2 = qVar;
        qVar2.f92008d = this.f163577l;
        qVar2.f92009e = this.f163578m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f163579n, this.f163580o);
        qVar2.f92010f = this.f163581p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
