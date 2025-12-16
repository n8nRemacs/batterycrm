package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Uz0.b;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.util.Calendar;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$FrameMonthChanged;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleScrolledToHorizontalPosition$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction.FrameMonthChanged>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291103q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291104r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f291105s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.p f291106t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StrOrdersCalendarState strOrdersCalendarState, b.p pVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f291105s = strOrdersCalendarState;
        this.f291106t = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f291105s, this.f291106t, continuation);
        jVar.f291104r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction.FrameMonthChanged> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291103q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291104r;
            StrOrdersCalendarState strOrdersCalendarState = this.f291105s;
            if (strOrdersCalendarState.f291048g == StrOrdersCalendarState.LoadingType.f291061d) {
                return G0.f406611a;
            }
            Date date = strOrdersCalendarState.f291045d;
            if (date == null) {
                return G0.f406611a;
            }
            if (strOrdersCalendarState.f291046e == null) {
                return G0.f406611a;
            }
            Date date2 = strOrdersCalendarState.f291044c;
            if (date2 == null) {
                return G0.f406611a;
            }
            com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
            Calendar calendarA = com.avito.android.str_seller_orders_calendar.utils.a.a(this.f291106t.f16833a - 19, com.avito.android.str_seller_orders_calendar.utils.a.j(date));
            if (!com.avito.android.str_seller_orders_calendar.utils.a.h(calendarA.getTime(), date2)) {
                StrOrdersCalendarInternalAction.FrameMonthChanged frameMonthChanged = new StrOrdersCalendarInternalAction.FrameMonthChanged(calendarA.getTime());
                this.f291103q = 1;
                if (interfaceC43172j.emit(frameMonthChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
