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
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleRedesignPaginationLeft$1", f = "StrOrdersCalendarActor.kt", i = {0}, l = {448, 457}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35135f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Date f291080q;

    /* renamed from: r, reason: collision with root package name */
    public int f291081r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f291082s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Date f291083t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Date f291084u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35130a f291085v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Map<String, List<C15273b>> f291086w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C15589a f291087x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35135f(Date date, Date date2, C35130a c35130a, Map<String, ? extends List<C15273b>> map, C15589a c15589a, Continuation<? super C35135f> continuation) {
        super(2, continuation);
        this.f291083t = date;
        this.f291084u = date2;
        this.f291085v = c35130a;
        this.f291086w = map;
        this.f291087x = c15589a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35135f c35135f = new C35135f(this.f291083t, this.f291084u, this.f291085v, this.f291086w, this.f291087x, continuation);
        c35135f.f291082s = obj;
        return c35135f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35135f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f291081r
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a r3 = r0.f291085v
            r4 = -1
            r5 = -3
            r6 = 2
            r7 = 1
            java.util.Date r8 = r0.f291084u
            if (r2 == 0) goto L30
            if (r2 == r7) goto L23
            if (r2 != r6) goto L1b
            kotlin.C42729a0.b(r20)
            goto Lc8
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            java.util.Date r2 = r0.f291080q
            java.lang.Object r7 = r0.f291082s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            kotlin.C42729a0.b(r20)
            r9 = r7
            r7 = r20
            goto L79
        L30:
            kotlin.C42729a0.b(r20)
            java.lang.Object r2 = r0.f291082s
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.Date r10 = r0.f291083t
            long r11 = r10.getTime()
            long r13 = r8.getTime()
            long r11 = r11 - r13
            long r11 = r9.toDays(r11)
            r13 = 250(0xfa, double:1.235E-321)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.util.Map<java.lang.String, java.util.List<Sz0.b>> r11 = r0.f291086w
            if (r9 <= 0) goto L80
            com.avito.android.str_seller_orders_calendar.utils.a r9 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            r9.getClass()
            java.util.Calendar r9 = com.avito.android.str_seller_orders_calendar.utils.a.j(r10)
            java.util.Calendar r9 = com.avito.android.str_seller_orders_calendar.utils.a.b(r5, r9)
            java.util.Calendar r9 = com.avito.android.str_seller_orders_calendar.utils.a.a(r4, r9)
            java.util.Date r9 = r9.getTime()
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a r10 = r3.f290985c
            r0.f291082s = r2
            r0.f291080q = r9
            r0.f291081r = r7
            java.lang.Object r7 = r10.e(r11, r9, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            r18 = r9
            r9 = r2
            r2 = r18
        L79:
            kotlin.Q r10 = new kotlin.Q
            r10.<init>(r2, r7)
            r2 = r9
            goto L86
        L80:
            kotlin.Q r7 = new kotlin.Q
            r7.<init>(r10, r11)
            r10 = r7
        L86:
            A r7 = r10.f406619b
            r13 = r7
            java.util.Date r13 = (java.util.Date) r13
            B r7 = r10.f406620c
            r16 = r7
            java.util.Map r16 = (java.util.Map) r16
            com.avito.android.str_seller_orders_calendar.utils.a r7 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            r7.getClass()
            java.util.Calendar r7 = com.avito.android.str_seller_orders_calendar.utils.a.j(r8)
            java.util.Calendar r5 = com.avito.android.str_seller_orders_calendar.utils.a.b(r5, r7)
            java.util.Date r14 = r5.getTime()
            java.util.Calendar r5 = com.avito.android.str_seller_orders_calendar.utils.a.j(r8)
            java.util.Calendar r4 = com.avito.android.str_seller_orders_calendar.utils.a.a(r4, r5)
            java.util.Date r15 = r4.getTime()
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a r11 = r3.f290983a
            Uz0.a r3 = r0.f291087x
            java.util.Date r12 = r0.f291084u
            r17 = r3
            kotlinx.coroutines.flow.i r3 = r11.c(r12, r13, r14, r15, r16, r17)
            r4 = 0
            r0.f291082s = r4
            r0.f291080q = r4
            r0.f291081r = r6
            java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.u(r0, r3, r2)
            if (r2 != r1) goto Lc8
            return r1
        Lc8:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.C35135f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
