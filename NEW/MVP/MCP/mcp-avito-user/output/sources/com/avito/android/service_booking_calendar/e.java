package com.avito.android.service_booking_calendar;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CalendarView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/service_booking_calendar/view/day/d;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.CalendarView$observeItemPresenters$1$2", f = "CalendarView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements Y41.p<com.avito.android.service_booking_calendar.view.day.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f275607q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CalendarView f275608r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CalendarView calendarView, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f275608r = calendarView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f275608r, continuation);
        eVar.f275607q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.service_booking_calendar.view.day.d dVar, Continuation<? super G0> continuation) {
        return ((e) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f275608r.f275235g.invoke((com.avito.android.service_booking_calendar.view.day.d) this.f275607q);
        return G0.f406611a;
    }
}
