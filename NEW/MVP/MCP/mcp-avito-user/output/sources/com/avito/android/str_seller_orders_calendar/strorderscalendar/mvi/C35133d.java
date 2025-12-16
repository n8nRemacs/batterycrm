package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleMonthSelectorClick$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35133d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f290998q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f290999r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f291000s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35133d(StrOrdersCalendarState strOrdersCalendarState, Continuation<? super C35133d> continuation) {
        super(2, continuation);
        this.f291000s = strOrdersCalendarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35133d c35133d = new C35133d(this.f291000s, continuation);
        c35133d.f290999r = obj;
        return c35133d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35133d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f290998q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f290999r;
            StrOrdersCalendarState strOrdersCalendarState = this.f291000s;
            Date date = strOrdersCalendarState.f291044c;
            if (date != null) {
                com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
                str = new SimpleDateFormat("yyyy-MM", Locale.US).format(date);
            } else {
                Date date2 = strOrdersCalendarState.f291043b;
                if (date2 != null) {
                    com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
                    str = new SimpleDateFormat("yyyy-MM", Locale.US).format(date2);
                } else {
                    com.avito.android.str_seller_orders_calendar.utils.a aVar = com.avito.android.str_seller_orders_calendar.utils.a.f291211a;
                    Date time = Calendar.getInstance().getTime();
                    aVar.getClass();
                    str = new SimpleDateFormat("yyyy-MM", Locale.US).format(time);
                }
            }
            StrOrdersCalendarInternalAction.OpenMonthSelector openMonthSelector = new StrOrdersCalendarInternalAction.OpenMonthSelector(str);
            this.f290998q = 1;
            if (interfaceC43172j.emit(openMonthSelector, this) == coroutine_suspended) {
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
