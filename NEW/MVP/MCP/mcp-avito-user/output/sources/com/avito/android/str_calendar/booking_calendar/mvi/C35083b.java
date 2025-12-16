package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import py0.InterfaceC47164a;

/* compiled from: StrBookingCalendarActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarActor$handleDayClickAction$1", f = "StrBookingCalendarActor.kt", i = {0, 0}, l = {116, 118}, m = "invokeSuspend", n = {"$this$flow", "newSelectedDateRange"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35083b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SelectedDateRange f286392q;

    /* renamed from: r, reason: collision with root package name */
    public int f286393r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f286394s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ StrBookingCalendarState f286395t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47164a.c f286396u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35082a f286397v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35083b(StrBookingCalendarState strBookingCalendarState, InterfaceC47164a.c cVar, C35082a c35082a, Continuation<? super C35083b> continuation) {
        super(2, continuation);
        this.f286395t = strBookingCalendarState;
        this.f286396u = cVar;
        this.f286397v = c35082a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35083b c35083b = new C35083b(this.f286395t, this.f286396u, this.f286397v, continuation);
        c35083b.f286394s = obj;
        return c35083b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35083b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.C35083b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
