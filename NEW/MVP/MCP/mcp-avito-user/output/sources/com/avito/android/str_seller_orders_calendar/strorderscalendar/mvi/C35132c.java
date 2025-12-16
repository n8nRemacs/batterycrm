package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Uz0.C15589a;
import Uz0.b;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleCellClicked$1", f = "StrOrdersCalendarActor.kt", i = {0, 0}, l = {JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7}, m = "invokeSuspend", n = {"$this$flow", "newSelectedDateRangeState"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35132c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C15589a f290992q;

    /* renamed from: r, reason: collision with root package name */
    public int f290993r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f290994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35130a f290995t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f290996u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b.d f290997v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35132c(C35130a c35130a, StrOrdersCalendarState strOrdersCalendarState, b.d dVar, Continuation<? super C35132c> continuation) {
        super(2, continuation);
        this.f290995t = c35130a;
        this.f290996u = strOrdersCalendarState;
        this.f290997v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35132c c35132c = new C35132c(this.f290995t, this.f290996u, this.f290997v, continuation);
        c35132c.f290994s = obj;
        return c35132c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35132c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.C35132c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
