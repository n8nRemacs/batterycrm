package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Sz0.C15273b;
import Uz0.C15589a;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleRedesignPaginationRight$1", f = "StrOrdersCalendarActor.kt", i = {0}, l = {483, 492}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Date f291088q;

    /* renamed from: r, reason: collision with root package name */
    public int f291089r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f291090s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Date f291091t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Date f291092u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35130a f291093v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Map<String, List<C15273b>> f291094w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C15589a f291095x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Date date, Date date2, C35130a c35130a, Map<String, ? extends List<C15273b>> map, C15589a c15589a, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f291091t = date;
        this.f291092u = date2;
        this.f291093v = c35130a;
        this.f291094w = map;
        this.f291095x = c15589a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f291091t, this.f291092u, this.f291093v, this.f291094w, this.f291095x, continuation);
        gVar.f291090s = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f291089r
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a r3 = r0.f291093v
            r4 = 3
            r5 = 2
            java.util.Date r6 = r0.f291091t
            r7 = 1
            if (r2 == 0) goto L2e
            if (r2 == r7) goto L22
            if (r2 != r5) goto L1a
            kotlin.C42729a0.b(r19)
            goto Lc0
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.util.Date r2 = r0.f291088q
            java.lang.Object r8 = r0.f291090s
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            kotlin.C42729a0.b(r19)
            r9 = r19
            goto L73
        L2e:
            kotlin.C42729a0.b(r19)
            java.lang.Object r2 = r0.f291090s
            r8 = r2
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r6.getTime()
            java.util.Date r11 = r0.f291092u
            long r12 = r11.getTime()
            long r9 = r9 - r12
            long r9 = r2.toDays(r9)
            r12 = 250(0xfa, double:1.235E-321)
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            java.util.Map<java.lang.String, java.util.List<Sz0.b>> r9 = r0.f291094w
            if (r2 <= 0) goto L79
            com.avito.android.str_seller_orders_calendar.utils.a r2 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            r2.getClass()
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.j(r11)
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.b(r4, r2)
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.a(r7, r2)
            java.util.Date r2 = r2.getTime()
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a r10 = r3.f290985c
            r0.f291090s = r8
            r0.f291088q = r2
            r0.f291089r = r7
            java.lang.Object r9 = r10.b(r9, r2, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            kotlin.Q r10 = new kotlin.Q
            r10.<init>(r2, r9)
            goto L7e
        L79:
            kotlin.Q r10 = new kotlin.Q
            r10.<init>(r11, r9)
        L7e:
            A r2 = r10.f406619b
            r12 = r2
            java.util.Date r12 = (java.util.Date) r12
            B r2 = r10.f406620c
            r16 = r2
            java.util.Map r16 = (java.util.Map) r16
            com.avito.android.str_seller_orders_calendar.utils.a r2 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            r2.getClass()
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.j(r6)
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.a(r7, r2)
            java.util.Date r14 = r2.getTime()
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.j(r6)
            java.util.Calendar r2 = com.avito.android.str_seller_orders_calendar.utils.a.b(r4, r2)
            java.util.Date r15 = r2.getTime()
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a r11 = r3.f290983a
            Uz0.a r2 = r0.f291095x
            java.util.Date r13 = r0.f291091t
            r17 = r2
            kotlinx.coroutines.flow.i r2 = r11.c(r12, r13, r14, r15, r16, r17)
            r3 = 0
            r0.f291090s = r3
            r0.f291088q = r3
            r0.f291089r = r5
            java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.u(r0, r2, r8)
            if (r2 != r1) goto Lc0
            return r1
        Lc0:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
