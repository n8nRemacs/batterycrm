package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import Nt0.InterfaceC14610a;
import Y41.p;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ScheduleRepetitionActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.ScheduleRepetitionActor$process$1", f = "ScheduleRepetitionActor.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f277618q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f277619r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14610a f277620s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f277621t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC14610a interfaceC14610a, d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f277620s = interfaceC14610a;
        this.f277621t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f277620s, this.f277621t, continuation);
        aVar.f277619r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f277618q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.C42729a0.b(r9)
            goto L6a
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f277619r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            Nt0.a r1 = r8.f277620s
            Nt0.a$c r1 = (Nt0.InterfaceC14610a.c) r1
            com.avito.android.service_booking_calendar.view.day.d r3 = r1.f11790a
            boolean r4 = r3 instanceof com.avito.android.service_booking_calendar.view.day.d.a
            if (r4 == 0) goto L6a
            com.avito.android.service_booking_calendar.view.day.d$a r3 = (com.avito.android.service_booking_calendar.view.day.d.a) r3
            com.avito.android.service_booking_calendar.view.day.DayItemContent r3 = r3.f276190c
            com.avito.android.service_booking_calendar.view.day.DayItemContent$DayType r3 = r3.getF277637c()
            com.avito.android.service_booking_calendar.view.day.DayItemContent$DayType r4 = com.avito.android.service_booking_calendar.view.day.DayItemContent.DayType.f276171b
            if (r3 == r4) goto L6a
            com.avito.android.service_booking_calendar.view.day.d r3 = r1.f11790a
            com.avito.android.service_booking_calendar.view.day.d$a r3 = (com.avito.android.service_booking_calendar.view.day.d.a) r3
            com.avito.android.service_booking_calendar.view.day.DayItemContent r3 = r3.f276190c
            boolean r4 = r3 instanceof com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a
            if (r4 == 0) goto L41
            com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a r3 = (com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a) r3
            goto L42
        L41:
            r3 = 0
        L42:
            if (r3 == 0) goto L58
            com.avito.android.service_booking_schedule_repetition_impl.mvi.d r4 = r8.f277621t
            com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule r4 = r4.f277629c
            long r4 = r4.f277630b
            java.lang.Long r3 = r3.f277640f
            if (r3 != 0) goto L4f
            goto L58
        L4f:
            long r6 = r3.longValue()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L58
            goto L6a
        L58:
            com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction$ToggleDay r3 = new com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction$ToggleDay
            com.avito.android.service_booking_calendar.view.day.d r1 = r1.f11790a
            com.avito.android.service_booking_calendar.view.day.d$a r1 = (com.avito.android.service_booking_calendar.view.day.d.a) r1
            r3.<init>(r1)
            r8.f277618q = r2
            java.lang.Object r9 = r9.emit(r3, r8)
            if (r9 != r0) goto L6a
            return r0
        L6a:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_schedule_repetition_impl.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
