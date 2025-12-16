package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.analytics.screens.J;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.str_calendar.booking_calendar.mvi.C35082a;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarActor$process$2", f = "StrBookingCalendarActor.kt", i = {}, l = {62, 79, 87}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35085d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286400q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f286401r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35082a f286402s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ StrBookingCalendarState f286403t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35085d(C35082a c35082a, StrBookingCalendarState strBookingCalendarState, Continuation<? super C35085d> continuation) {
        super(2, continuation);
        this.f286402s = c35082a;
        this.f286403t = strBookingCalendarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35085d c35085d = new C35085d(this.f286402s, this.f286403t, continuation);
        c35085d.f286401r = obj;
        return c35085d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35085d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286400q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f286401r;
            StrBookingCalendarState strBookingCalendarState = this.f286403t;
            SelectedDateRange selectedDateRange = strBookingCalendarState.f286427e;
            int i13 = C35082a.f286386c;
            C35082a c35082a = this.f286402s;
            c35082a.getClass();
            Date date = selectedDateRange.f286645b;
            DateRange dateRange = null;
            com.avito.android.str_calendar.booking_calendar.h hVar = c35082a.f286388b;
            if (date == null) {
                cVar = new C35082a.C8577a.InterfaceC8578a.C8579a(hVar.getF286291e());
            } else {
                boolean z12 = strBookingCalendarState.f286430h;
                Date date2 = selectedDateRange.f286646c;
                if (z12 || date2 != null) {
                    Iterable iterable = strBookingCalendarState.f286431i;
                    if (iterable == null) {
                        iterable = C42784z0.f406748b;
                    }
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            cVar = new C35082a.C8577a.InterfaceC8578a.c(selectedDateRange);
                            break;
                        }
                        StrBookingIntentFactory.CalendarRestriction calendarRestriction = (StrBookingIntentFactory.CalendarRestriction) it.next();
                        if (calendarRestriction instanceof StrBookingIntentFactory.CalendarRestriction.Min) {
                            long time = selectedDateRange.f286645b.getTime();
                            Long lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                            if ((lValueOf == null ? 1L : TimeUnit.MILLISECONDS.toDays(lValueOf.longValue() - time)) < ((StrBookingIntentFactory.CalendarRestriction.Min) calendarRestriction).f281174b) {
                                cVar = new C35082a.C8577a.InterfaceC8578a.b(((StrBookingIntentFactory.CalendarRestriction.Min) calendarRestriction).f281175c);
                                break;
                            }
                        }
                    }
                } else {
                    cVar = new C35082a.C8577a.InterfaceC8578a.C8579a(hVar.getF286291e());
                }
            }
            if (cVar instanceof C35082a.C8577a.InterfaceC8578a.b) {
                StrBookingCalendarInternalAction.ShowValidationDialog showValidationDialog = new StrBookingCalendarInternalAction.ShowValidationDialog(((C35082a.C8577a.InterfaceC8578a.b) cVar).f286390a);
                this.f286400q = 1;
                if (interfaceC43172j.emit(showValidationDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (cVar instanceof C35082a.C8577a.InterfaceC8578a.c) {
                SelectedDateRange selectedDateRange2 = ((C35082a.C8577a.InterfaceC8578a.c) cVar).f286391a;
                Date date3 = selectedDateRange2.f286645b;
                if (date3 != null) {
                    Date date4 = selectedDateRange2.f286646c;
                    dateRange = date4 == null ? new DateRange(date3, date3) : new DateRange(date3, date4);
                }
                if (dateRange == null) {
                    return G0.f406611a;
                }
                StrBookingCalendarInternalAction.PassSelectedDateRange passSelectedDateRange = new StrBookingCalendarInternalAction.PassSelectedDateRange(dateRange, strBookingCalendarState.f286425c);
                this.f286400q = 2;
                if (interfaceC43172j.emit(passSelectedDateRange, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (cVar instanceof C35082a.C8577a.InterfaceC8578a.C8579a) {
                J.a.C2676a c2676a = J.a.f90383b;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Empty selected range");
                c2676a.getClass();
                StrBookingCalendarInternalAction.ShowError showError = new StrBookingCalendarInternalAction.ShowError(J.a.C2676a.c(illegalArgumentException), ((C35082a.C8577a.InterfaceC8578a.C8579a) cVar).f286389a);
                this.f286400q = 3;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
