package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarActor$process$1", f = "StrBookingCalendarActor.kt", i = {0}, l = {33, 34}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35084c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286398q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f286399r;

    public C35084c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35084c c35084c = new C35084c(2, continuation);
        c35084c.f286399r = obj;
        return c35084c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35084c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286398q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f286399r;
            StrBookingCalendarInternalAction.HideRestrictionToast hideRestrictionToast = StrBookingCalendarInternalAction.HideRestrictionToast.f286410b;
            this.f286399r = interfaceC43172j;
            this.f286398q = 1;
            if (interfaceC43172j.emit(hideRestrictionToast, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f286399r;
            C42729a0.b(obj);
        }
        StrBookingCalendarInternalAction.ClearSelection clearSelection = StrBookingCalendarInternalAction.ClearSelection.f286406b;
        this.f286399r = null;
        this.f286398q = 2;
        if (interfaceC43172j.emit(clearSelection, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
