package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.util.Date;
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
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleTodayButtonClick$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291120q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291121r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f291122s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35130a f291123t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C35130a c35130a, StrOrdersCalendarState strOrdersCalendarState, Continuation continuation) {
        super(2, continuation);
        this.f291122s = strOrdersCalendarState;
        this.f291123t = c35130a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f291123t, this.f291122s, continuation);
        nVar.f291121r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291120q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291121r;
            StrOrdersCalendarState strOrdersCalendarState = this.f291122s;
            if (strOrdersCalendarState.f291043b == null) {
                return G0.f406611a;
            }
            if (strOrdersCalendarState.f291045d == null) {
                return G0.f406611a;
            }
            if (strOrdersCalendarState.f291046e == null) {
                return G0.f406611a;
            }
            C35130a c35130a = this.f291123t;
            com.avito.android.str_seller_orders_calendar.analytics.a aVar = c35130a.f290986d;
            com.avito.android.account.E e12 = aVar.f290372b;
            if (e12.b()) {
                String strA = e12.a();
                if (strA == null) {
                    strA = "";
                }
                aVar.f290371a.c(new Hz0.d(strA));
            }
            Date date = strOrdersCalendarState.f291045d;
            Date date2 = strOrdersCalendarState.f291046e;
            Date date3 = strOrdersCalendarState.f291043b;
            InterfaceC43160i interfaceC43160iG = C43175k.G(new q(date, date2, date3, c35130a, date3, null));
            this.f291120q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
