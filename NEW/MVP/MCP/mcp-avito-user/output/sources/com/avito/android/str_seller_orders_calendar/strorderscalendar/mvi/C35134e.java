package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Hz0.C14053a;
import Uz0.b;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleNewMonthSelected$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35134e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291001q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291002r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f291003s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35130a f291004t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b.j f291005u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35134e(StrOrdersCalendarState strOrdersCalendarState, C35130a c35130a, b.j jVar, Continuation<? super C35134e> continuation) {
        super(2, continuation);
        this.f291003s = strOrdersCalendarState;
        this.f291004t = c35130a;
        this.f291005u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35134e c35134e = new C35134e(this.f291003s, this.f291004t, this.f291005u, continuation);
        c35134e.f291002r = obj;
        return c35134e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35134e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws ParseException {
        Date date;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291001q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291002r;
            StrOrdersCalendarState strOrdersCalendarState = this.f291003s;
            if (strOrdersCalendarState.f291043b == null) {
                return G0.f406611a;
            }
            if (strOrdersCalendarState.f291045d == null) {
                return G0.f406611a;
            }
            if (strOrdersCalendarState.f291046e == null) {
                return G0.f406611a;
            }
            C35130a c35130a = this.f291004t;
            com.avito.android.str_seller_orders_calendar.analytics.a aVar = c35130a.f290986d;
            com.avito.android.account.E e12 = aVar.f290372b;
            if (e12.b()) {
                aVar.f290371a.c(new C14053a(String.valueOf(e12.a())));
            }
            com.avito.android.str_seller_orders_calendar.utils.a aVar2 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a;
            String str = this.f291005u.f16827a;
            aVar2.getClass();
            try {
                date = new SimpleDateFormat("yyyy-MM", Locale.US).parse(str);
            } catch (ParseException unused) {
                date = null;
            }
            if (date == null) {
                return G0.f406611a;
            }
            com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
            Date date2 = strOrdersCalendarState.f291043b;
            InterfaceC43160i interfaceC43160iG = C43175k.G(new q(strOrdersCalendarState.f291045d, strOrdersCalendarState.f291046e, com.avito.android.str_seller_orders_calendar.utils.a.h(date, date2) ? date2 : com.avito.android.str_seller_orders_calendar.utils.a.a(1, com.avito.android.str_seller_orders_calendar.utils.a.j(date)).getTime(), c35130a, strOrdersCalendarState.f291043b, null));
            this.f291001q = 1;
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
