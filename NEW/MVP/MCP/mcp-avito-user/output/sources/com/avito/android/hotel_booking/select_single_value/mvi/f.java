package com.avito.android.hotel_booking.select_single_value.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.hotel_booking.select_single_value.mvi.entity.SelectSingleValueInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectSingleValueFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVI/a;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "LVI/c;", "LVI/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements Y41.l<q<VI.a, SelectSingleValueInternalAction, VI.c, VI.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f164112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f164113m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f164114n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f164115o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f164116p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f164112l = dVar;
        this.f164113m = bVar;
        this.f164114n = screenPerformanceTracker;
        this.f164115o = lVar;
        this.f164116p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<VI.a, SelectSingleValueInternalAction, VI.c, VI.b> qVar) {
        q<VI.a, SelectSingleValueInternalAction, VI.c, VI.b> qVar2 = qVar;
        qVar2.f92008d = this.f164112l;
        qVar2.f92009e = this.f164113m;
        qVar2.f92011g = new o(this.f164114n, this.f164115o);
        qVar2.f92010f = this.f164116p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
