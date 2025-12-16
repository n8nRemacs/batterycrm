package com.avito.android.arch.mvi.android;

import Y41.p;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: LifecycleAwareExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_mvi-flow_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: LifecycleAwareExt.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "OneTimeEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.LifecycleAwareExtKt$collectInLifecycle$1$1", f = "LifecycleAwareExt.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91864q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f91865r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f91866s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m<State, OneTimeEvent> f91867t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.l<OneTimeEvent, G0> f91868u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f91869v;

        /* compiled from: LifecycleAwareExt.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "OneTimeEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.arch.mvi.android.LifecycleAwareExtKt$collectInLifecycle$1$1$1", f = "LifecycleAwareExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.arch.mvi.android.f$a$a, reason: collision with other inner class name */
        public static final class C2704a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f91870q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ m<State, OneTimeEvent> f91871r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.l<OneTimeEvent, G0> f91872s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Object f91873t;

            /* compiled from: LifecycleAwareExt.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "OneTimeEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.arch.mvi.android.LifecycleAwareExtKt$collectInLifecycle$1$1$1$1", f = "LifecycleAwareExt.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.arch.mvi.android.f$a$a$a, reason: collision with other inner class name */
            public static final class C2705a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f91874q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ m<State, OneTimeEvent> f91875r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Y41.l<OneTimeEvent, G0> f91876s;

                /* compiled from: LifecycleAwareExt.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.arch.mvi.android.f$a$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2706a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Y41.l<OneTimeEvent, G0> f91877b;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C2706a(Y41.l<? super OneTimeEvent, G0> lVar) {
                        this.f91877b = lVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    @Y61.l
                    public final Object emit(@Y61.k OneTimeEvent onetimeevent, @Y61.k Continuation<? super G0> continuation) {
                        this.f91877b.invoke(onetimeevent);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
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
                        return new H(2, this.f91877b, L.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2705a(m<State, OneTimeEvent> mVar, Y41.l<? super OneTimeEvent, G0> lVar, Continuation<? super C2705a> continuation) {
                    super(2, continuation);
                    this.f91875r = mVar;
                    this.f91876s = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2705a(this.f91875r, this.f91876s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2705a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f91874q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC43160i events = this.f91875r.getEvents();
                        C2706a c2706a = new C2706a(this.f91876s);
                        this.f91874q = 1;
                        if (events.collect(c2706a, this) == coroutine_suspended) {
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

            /* compiled from: LifecycleAwareExt.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "State", "OneTimeEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.arch.mvi.android.LifecycleAwareExtKt$collectInLifecycle$1$1$1$2", f = "LifecycleAwareExt.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.arch.mvi.android.f$a$a$b */
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f91878q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ m<State, OneTimeEvent> f91879r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Object f91880s;

                /* compiled from: LifecycleAwareExt.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.arch.mvi.android.f$a$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2707a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Object f91881b;

                    public C2707a(Y41.l<? super State, G0> lVar) {
                        this.f91881b = lVar;
                    }

                    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, java.lang.Object] */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    @Y61.l
                    public final Object emit(@Y61.k State state, @Y61.k Continuation<? super G0> continuation) {
                        this.f91881b.invoke(state);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
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
                        return new H(2, this.f91881b, L.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(m<State, OneTimeEvent> mVar, Y41.l<? super State, G0> lVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f91879r = mVar;
                    this.f91880s = lVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f91879r, this.f91880s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, java.lang.Object] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f91878q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        n2 state = this.f91879r.getState();
                        C2707a c2707a = new C2707a(this.f91880s);
                        this.f91878q = 1;
                        if (state.collect(c2707a, this) == coroutine_suspended) {
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
            public C2704a(m<State, OneTimeEvent> mVar, Y41.l<? super OneTimeEvent, G0> lVar, Y41.l<? super State, G0> lVar2, Continuation<? super C2704a> continuation) {
                super(2, continuation);
                this.f91871r = mVar;
                this.f91872s = lVar;
                this.f91873t = lVar2;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2704a c2704a = new C2704a(this.f91871r, this.f91872s, this.f91873t, continuation);
                c2704a.f91870q = obj;
                return c2704a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2704a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f91870q;
                m<State, OneTimeEvent> mVar = this.f91871r;
                C43259k.d(t12, null, null, new C2705a(mVar, this.f91872s, null), 3);
                C43259k.d(t12, null, null, new b(mVar, this.f91873t, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC22983P interfaceC22983P, Lifecycle.State state, m<State, OneTimeEvent> mVar, Y41.l<? super OneTimeEvent, G0> lVar, Y41.l<? super State, G0> lVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f91865r = interfaceC22983P;
            this.f91866s = state;
            this.f91867t = mVar;
            this.f91868u = lVar;
            this.f91869v = lVar2;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            ?? r52 = this.f91869v;
            return new a(this.f91865r, this.f91866s, this.f91867t, this.f91868u, r52, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91864q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C2704a c2704a = new C2704a(this.f91867t, this.f91868u, this.f91869v, null);
                this.f91864q = 1;
                if (C23056p0.b(this.f91865r, this.f91866s, c2704a, this) == coroutine_suspended) {
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

    public static final <State, OneTimeEvent> void a(@Y61.k m<State, OneTimeEvent> mVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.State state, @Y61.k Y41.l<? super OneTimeEvent, G0> lVar, @Y61.k Y41.l<? super State, G0> lVar2) {
        C43259k.d(C22984Q.a(interfaceC22983P), null, null, new a(interfaceC22983P, state, mVar, lVar, lVar2, null), 3);
    }

    public static final <State, OneTimeEvent> void b(@Y61.k androidx.view.n nVar, @Y61.k m<State, OneTimeEvent> mVar, @Y61.k Y41.l<? super OneTimeEvent, G0> lVar, @Y61.k Y41.l<? super State, G0> lVar2) {
        a(mVar, nVar, Lifecycle.State.f46681d, lVar, lVar2);
    }

    public static void c(BaseFragment baseFragment, j jVar, Y41.l lVar) {
        a(jVar, baseFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, g.f91882l, lVar);
    }
}
