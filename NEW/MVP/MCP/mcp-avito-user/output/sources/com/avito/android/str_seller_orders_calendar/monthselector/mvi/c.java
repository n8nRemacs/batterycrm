package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.str_seller_orders_calendar.monthselector.mvi.entity.MonthSelectorInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MonthSelectorBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.b<MonthSelectorInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f290441a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_calendar.monthselector.b f290442b;

    /* compiled from: MonthSelectorBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.monthselector.mvi.MonthSelectorBootstrap$produce$1", f = "MonthSelectorBootstrap.kt", i = {0, 0}, l = {AvailableCode.ERROR_NO_ACTIVITY, 37}, m = "invokeSuspend", n = {"$this$flow", "items"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super MonthSelectorInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f290443q;

        /* renamed from: r, reason: collision with root package name */
        public int f290444r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f290445s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f290445s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MonthSelectorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.monthselector.mvi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@l String str, @Y61.k com.avito.android.str_seller_orders_calendar.monthselector.b bVar) {
        this.f290441a = str;
        this.f290442b = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MonthSelectorInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
