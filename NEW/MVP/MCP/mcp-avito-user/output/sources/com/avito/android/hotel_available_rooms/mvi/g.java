package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HotelAvailableRoomsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LJI/a;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState;", "LJI/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<com.avito.android.arch.mvi.q<JI.a, HotelAvailableRoomsInternalAction, HotelAvailableRoomsState, JI.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f163148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f163149m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f163150n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f163151o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f163152p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, p pVar) {
        super(1);
        this.f163148l = eVar;
        this.f163149m = bVar;
        this.f163150n = screenPerformanceTracker;
        this.f163151o = rVar;
        this.f163152p = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<JI.a, HotelAvailableRoomsInternalAction, HotelAvailableRoomsState, JI.b> qVar) {
        com.avito.android.arch.mvi.q<JI.a, HotelAvailableRoomsInternalAction, HotelAvailableRoomsState, JI.b> qVar2 = qVar;
        qVar2.f92008d = this.f163148l;
        qVar2.f92009e = this.f163149m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f163150n, this.f163151o);
        qVar2.f92010f = this.f163152p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
