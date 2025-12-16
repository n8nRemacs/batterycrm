package com.avito.android.str_calendar.seller.calendar.mvi;

import Jy0.InterfaceC14261a;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ClickDay;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.mvi.StrSellerCalendarActor$onDayClick$1", f = "StrSellerCalendarActor.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerCalendarInternalAction.ClickDay>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287668q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrSellerCalendarState f287670s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14261a.c f287671t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StrSellerCalendarState strSellerCalendarState, InterfaceC14261a.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f287670s = strSellerCalendarState;
        this.f287671t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f287670s, this.f287671t, continuation);
        aVar.f287669r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerCalendarInternalAction.ClickDay> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DateRange dateRange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287668q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287669r;
            StrSellerCalendarState strSellerCalendarState = this.f287670s;
            Date date = strSellerCalendarState.f287717d;
            Date date2 = null;
            InterfaceC14261a.c cVar = this.f287671t;
            if (date == null || date.compareTo(cVar.f9184a) >= 0 || strSellerCalendarState.f287718e != null) {
                dateRange = null;
                date2 = cVar.f9184a;
            } else {
                dateRange = new DateRange(strSellerCalendarState.f287717d, cVar.f9184a);
            }
            StrSellerCalendarInternalAction.ClickDay clickDay = new StrSellerCalendarInternalAction.ClickDay(dateRange, date2);
            this.f287668q = 1;
            if (interfaceC43172j.emit(clickDay, this) == coroutine_suspended) {
                return coroutine_suspended;
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
