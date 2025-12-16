package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$scrollOrLoadToDate$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {320, 328}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291134q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Date f291136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Date f291137t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Date f291138u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35130a f291139v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Date f291140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Date date, Date date2, Date date3, C35130a c35130a, Date date4, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f291136s = date;
        this.f291137t = date2;
        this.f291138u = date3;
        this.f291139v = c35130a;
        this.f291140w = date4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f291136s, this.f291137t, this.f291138u, this.f291139v, this.f291140w, continuation);
        qVar.f291135r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291134q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291135r;
            com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
            Date date = this.f291136s;
            Date time = com.avito.android.str_seller_orders_calendar.utils.a.b(1, com.avito.android.str_seller_orders_calendar.utils.a.j(date)).getTime();
            if (time == null) {
                return G0.f406611a;
            }
            Date time2 = com.avito.android.str_seller_orders_calendar.utils.a.b(-1, com.avito.android.str_seller_orders_calendar.utils.a.j(this.f291137t)).getTime();
            if (time2 == null) {
                return G0.f406611a;
            }
            Date date2 = this.f291138u;
            if (date2.after(time) && date2.before(time2)) {
                StrOrdersCalendarInternalAction.ScrollToHorizontalPosition scrollToHorizontalPosition = new StrOrdersCalendarInternalAction.ScrollToHorizontalPosition((int) TimeUnit.MILLISECONDS.toDays(date2.getTime() - date.getTime()));
                this.f291134q = 1;
                if (interfaceC43172j.emit(scrollToHorizontalPosition, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                InterfaceC43160i<StrOrdersCalendarInternalAction> interfaceC43160iB = this.f291139v.f290983a.b(this.f291140w, com.avito.android.str_seller_orders_calendar.utils.a.b(-2, com.avito.android.str_seller_orders_calendar.utils.a.j(date2)).getTime(), com.avito.android.str_seller_orders_calendar.utils.a.b(4, com.avito.android.str_seller_orders_calendar.utils.a.j(date2)).getTime(), date2);
                this.f291134q = 2;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
