package com.avito.android.service_booking_calendar.flexible.header.mvi;

import Y41.p;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.CalendarHeaderActor$process$3", f = "CalendarHeaderActor.kt", i = {0}, l = {61, 68}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275935q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275936r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CalendarHeaderState f275937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CalendarHeaderState calendarHeaderState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f275937s = calendarHeaderState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f275937s, continuation);
        cVar.f275936r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f275935q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r8)
            goto L5b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f275936r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L48
        L22:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f275936r
            r1 = r8
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState r8 = r7.f275937s
            com.avito.android.service_booking_calendar.day.schedule.domain.DayItem r4 = r8.f276016m
            if (r4 == 0) goto L5b
            com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction$SelectDay r5 = new com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction$SelectDay
            org.threeten.bp.f r6 = r4.f275353c
            int r6 = com.avito.android.service_booking_calendar.p.a(r6)
            int r8 = r8.f276017n
            r5.<init>(r4, r8, r6)
            r7.f275936r = r1
            r7.f275935q = r3
            java.lang.Object r8 = r1.emit(r5, r7)
            if (r8 != r0) goto L48
            return r0
        L48:
            com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction$SetMode r8 = new com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction$SetMode
            com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState$MODE r3 = com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState.MODE.f276021b
            r8.<init>()
            r3 = 0
            r7.f275936r = r3
            r7.f275935q = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L5b
            return r0
        L5b:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_calendar.flexible.header.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
