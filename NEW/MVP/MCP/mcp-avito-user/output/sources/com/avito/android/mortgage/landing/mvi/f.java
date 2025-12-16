package com.avito.android.mortgage.landing.mvi;

import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;

/* compiled from: LandingActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0017\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u00040\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/S;", "name", "value", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$updateCalculation$1", f = "LandingActor.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<I0<? super LandingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200252q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200253r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f200254s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LandingState f200255t;

    /* compiled from: LandingActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$updateCalculation$1$1", f = "LandingActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f200256q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ g f200257r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LandingState f200258s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I0<LandingInternalAction> f200259t;

        /* compiled from: LandingActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$updateCalculation$1$1$1", f = "LandingActor.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.landing.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C5920a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f200260q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f200261r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ LandingState f200262s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ I0<LandingInternalAction> f200263t;

            /* compiled from: LandingActor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.mortgage.landing.mvi.f$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C5921a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I0<LandingInternalAction> f200264b;

                /* JADX WARN: Multi-variable type inference failed */
                public C5921a(I0<? super LandingInternalAction> i02) {
                    this.f200264b = i02;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Object objSend = this.f200264b.send((LandingInternalAction) obj, continuation);
                    return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new H(2, this.f200264b, I0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5920a(g gVar, LandingState landingState, I0<? super LandingInternalAction> i02, Continuation<? super C5920a> continuation) {
                super(2, continuation);
                this.f200261r = gVar;
                this.f200262s = landingState;
                this.f200263t = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C5920a(this.f200261r, this.f200262s, this.f200263t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5920a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f200260q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.mortgage.landing.mvi.domain.a aVar = this.f200261r.f200265a;
                    LandingState landingState = this.f200262s;
                    InterfaceC43160i<LandingInternalAction> interfaceC43160iE = aVar.e(landingState.f200231g, landingState.f200233i, landingState.f200234j, landingState.f200227c);
                    C5921a c5921a = new C5921a(this.f200263t);
                    this.f200260q = 1;
                    if (interfaceC43160iE.collect(c5921a, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, LandingState landingState, I0<? super LandingInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f200257r = gVar;
            this.f200258s = landingState;
            this.f200259t = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f200257r, this.f200258s, this.f200259t, continuation);
            aVar.f200256q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f200256q;
            g gVar = this.f200257r;
            N0 n02 = gVar.f200266b;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            gVar.f200266b = C43259k.d(t12, null, null, new C5920a(gVar, this.f200258s, this.f200259t, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, LandingState landingState, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f200254s = gVar;
        this.f200255t = landingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f200254s, this.f200255t, continuation);
        fVar.f200253r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super LandingInternalAction> i02, Continuation<? super G0> continuation) {
        return ((f) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200252q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f200254s, this.f200255t, (I0) this.f200253r, null);
            this.f200252q = 1;
            if (t1.c(aVar, this) == coroutine_suspended) {
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
