package com.avito.android.service_booking_calendar.flexible;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "Action", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment$connectFeatures$1$1", f = "ServiceBookingFlexibleCalendarFragment.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275840q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f275841r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n2<Object> f275842s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l<Object, List<Object>> f275843t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l<Object, G0> f275844u;

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "Action", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment$connectFeatures$1$1$1", f = "ServiceBookingFlexibleCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f275845q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ n2<Object> f275846r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<Object, List<Object>> f275847s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l<Object, G0> f275848t;

        /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "Action", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment$connectFeatures$1$1$1$1", f = "ServiceBookingFlexibleCalendarFragment.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.service_booking_calendar.flexible.f$a$a, reason: collision with other inner class name */
        public static final class C8184a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f275849q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n2<Object> f275850r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l<Object, List<Object>> f275851s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l<Object, G0> f275852t;

            /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "Action", "dataState", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.service_booking_calendar.flexible.f$a$a$a, reason: collision with other inner class name */
            public static final class C8185a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l<Object, List<Object>> f275853b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l<Object, G0> f275854c;

                /* JADX WARN: Multi-variable type inference failed */
                public C8185a(l<Object, ? extends List<Object>> lVar, l<Object, G0> lVar2) {
                    this.f275853b = lVar;
                    this.f275854c = lVar2;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                public final Object emit(@k Object obj, @k Continuation<? super G0> continuation) {
                    Iterator<T> it = this.f275853b.invoke(obj).iterator();
                    while (it.hasNext()) {
                        this.f275854c.invoke(it.next());
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8184a(n2<Object> n2Var, l<Object, ? extends List<Object>> lVar, l<Object, G0> lVar2, Continuation<? super C8184a> continuation) {
                super(2, continuation);
                this.f275850r = n2Var;
                this.f275851s = lVar;
                this.f275852t = lVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C8184a(this.f275850r, this.f275851s, this.f275852t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8184a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f275849q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C8185a c8185a = new C8185a(this.f275851s, this.f275852t);
                    this.f275849q = 1;
                    if (this.f275850r.collect(c8185a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n2<Object> n2Var, l<Object, ? extends List<Object>> lVar, l<Object, G0> lVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f275846r = n2Var;
            this.f275847s = lVar;
            this.f275848t = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f275846r, this.f275847s, this.f275848t, continuation);
            aVar.f275845q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f275845q;
            l<Object, G0> lVar = this.f275848t;
            C43259k.d(t12, null, null, new C8184a(this.f275846r, this.f275847s, lVar, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(InterfaceC22983P interfaceC22983P, n2<Object> n2Var, l<Object, ? extends List<Object>> lVar, l<Object, G0> lVar2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f275841r = interfaceC22983P;
        this.f275842s = n2Var;
        this.f275843t = lVar;
        this.f275844u = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new f(this.f275841r, this.f275842s, this.f275843t, this.f275844u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275840q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22983P interfaceC22983P = this.f275841r;
            Lifecycle.State state = Lifecycle.State.f46682e;
            l<Object, G0> lVar = this.f275844u;
            a aVar = new a(this.f275842s, this.f275843t, lVar, null);
            this.f275840q = 1;
            if (C23056p0.b(interfaceC22983P, state, aVar, this) == coroutine_suspended) {
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
