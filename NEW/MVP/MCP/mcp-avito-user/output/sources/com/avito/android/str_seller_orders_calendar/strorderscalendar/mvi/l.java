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
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleScrolledToRightStubs$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291111q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291112r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f291113s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35130a f291114t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C35130a c35130a, StrOrdersCalendarState strOrdersCalendarState, Continuation continuation) {
        super(2, continuation);
        this.f291113s = strOrdersCalendarState;
        this.f291114t = c35130a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f291114t, this.f291113s, continuation);
        lVar.f291112r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291111q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291112r;
            StrOrdersCalendarState strOrdersCalendarState = this.f291113s;
            StrOrdersCalendarState.LoadingType loadingType = strOrdersCalendarState.f291048g;
            if (loadingType == StrOrdersCalendarState.LoadingType.f291061d || loadingType == StrOrdersCalendarState.LoadingType.f291060c) {
                return G0.f406611a;
            }
            Date date = strOrdersCalendarState.f291045d;
            if (date == null) {
                return G0.f406611a;
            }
            Date date2 = strOrdersCalendarState.f291046e;
            if (date2 == null) {
                return G0.f406611a;
            }
            int i13 = C35130a.f290982e;
            C35130a c35130a = this.f291114t;
            c35130a.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new g(date2, date, c35130a, strOrdersCalendarState.f291052k, strOrdersCalendarState.f291053l, null));
            this.f291111q = 1;
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
