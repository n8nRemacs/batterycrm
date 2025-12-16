package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.util.K;
import java.util.Calendar;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersCalendarBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarBootstrap$screenInit$1", f = "StrOrdersCalendarBootstrap.kt", i = {0}, l = {40, 48}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291148q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291149r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f291150s;

    /* compiled from: StrOrdersCalendarBootstrap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarBootstrap$screenInit$1$1", f = "StrOrdersCalendarBootstrap.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291151q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291152r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ u f291153s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Calendar f291154t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f291155u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Date f291156v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<StrOrdersCalendarInternalAction> f291157w;

        /* compiled from: StrOrdersCalendarBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarBootstrap$screenInit$1$1$1", f = "StrOrdersCalendarBootstrap.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.t$a$a, reason: collision with other inner class name */
        public static final class C8807a extends SuspendLambda implements Y41.p<StrOrdersCalendarInternalAction, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f291158q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f291159r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<StrOrdersCalendarInternalAction> f291160s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43076a0<SK0.f> f291161t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8807a(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, InterfaceC43076a0<SK0.f> interfaceC43076a0, Continuation<? super C8807a> continuation) {
                super(2, continuation);
                this.f291160s = interfaceC43172j;
                this.f291161t = interfaceC43076a0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C8807a c8807a = new C8807a(this.f291160s, this.f291161t, continuation);
                c8807a.f291159r = obj;
                return c8807a;
            }

            @Override // Y41.p
            public final Object invoke(StrOrdersCalendarInternalAction strOrdersCalendarInternalAction, Continuation<? super G0> continuation) {
                return ((C8807a) create(strOrdersCalendarInternalAction, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                InterfaceC43172j<StrOrdersCalendarInternalAction> interfaceC43172j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f291158q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    if (!(((StrOrdersCalendarInternalAction) this.f291159r) instanceof StrOrdersCalendarInternalAction.RedesignLoadingComplete)) {
                        return G0.f406611a;
                    }
                    interfaceC43172j = this.f291160s;
                    this.f291159r = interfaceC43172j;
                    this.f291158q = 1;
                    obj = this.f291161t.F(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    interfaceC43172j = (InterfaceC43172j) this.f291159r;
                    C42729a0.b(obj);
                }
                StrOrdersCalendarInternalAction.UxInfoLoadingComplete uxInfoLoadingComplete = new StrOrdersCalendarInternalAction.UxInfoLoadingComplete((SK0.f) obj);
                this.f291159r = null;
                this.f291158q = 2;
                if (interfaceC43172j.emit(uxInfoLoadingComplete, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        /* compiled from: StrOrdersCalendarBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LSK0/f;", "<anonymous>", "(Lkotlinx/coroutines/T;)LSK0/f;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarBootstrap$screenInit$1$1$uxProperties$1", f = "StrOrdersCalendarBootstrap.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super SK0.f>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f291162q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ u f291163r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(u uVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f291163r = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f291163r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super SK0.f> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f291162q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.str_core.c cVar = this.f291163r.f291167d;
                    this.f291162q = 1;
                    obj = cVar.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(u uVar, Calendar calendar, Date date, Date date2, InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f291153s = uVar;
            this.f291154t = calendar;
            this.f291155u = date;
            this.f291156v = date2;
            this.f291157w = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f291153s, this.f291154t, this.f291155u, this.f291156v, this.f291157w, continuation);
            aVar.f291152r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f291151q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f291152r;
                u uVar = this.f291153s;
                InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, uVar.f291168e.a(), new b(uVar, null), 2);
                Calendar calendar = this.f291154t;
                InterfaceC43160i<StrOrdersCalendarInternalAction> interfaceC43160iB = uVar.f291166c.b(calendar.getTime(), this.f291155u, this.f291156v, calendar.getTime());
                InterfaceC43172j<StrOrdersCalendarInternalAction> interfaceC43172j = this.f291157w;
                C43197r1 c43197r1 = new C43197r1(new C8807a(interfaceC43172j, interfaceC43076a0B, null), interfaceC43160iB);
                this.f291151q = 1;
                if (C43175k.u(this, c43197r1, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f291150s = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f291150s, continuation);
        tVar.f291149r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291148q;
        u uVar = this.f291150s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f291149r;
            StrOrdersCalendarInternalAction.InitScreenOrientation initScreenOrientation = new StrOrdersCalendarInternalAction.InitScreenOrientation(uVar.f291164a);
            this.f291149r = interfaceC43172j;
            this.f291148q = 1;
            if (interfaceC43172j.emit(initScreenOrientation, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f291149r;
            C42729a0.b(obj);
        }
        InterfaceC43172j interfaceC43172j2 = interfaceC43172j;
        uVar.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(uVar.f291165b.now());
        K.a(calendar);
        com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
        a aVar = new a(this.f291150s, calendar, com.avito.android.str_seller_orders_calendar.utils.a.b(-2, calendar).getTime(), com.avito.android.str_seller_orders_calendar.utils.a.b(4, calendar).getTime(), interfaceC43172j2, null);
        this.f291149r = null;
        this.f291148q = 2;
        if (U.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
