package androidx.view;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.r;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.sync.d;

/* compiled from: RepeatOnLifecycle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23056p0 {

    /* compiled from: RepeatOnLifecycle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.p0$a */
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f46841q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f46842r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f46843s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f46844t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f46845u;

        /* compiled from: RepeatOnLifecycle.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
        /* renamed from: androidx.lifecycle.p0$a$a, reason: collision with other inner class name */
        public static final class C1796a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public l0.h f46846q;

            /* renamed from: r, reason: collision with root package name */
            public l0.h f46847r;

            /* renamed from: s, reason: collision with root package name */
            public T f46848s;

            /* renamed from: t, reason: collision with root package name */
            public int f46849t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Lifecycle f46850u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Lifecycle.State f46851v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ T f46852w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f46853x;

            /* compiled from: RepeatOnLifecycle.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/P;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/G0;", "onStateChanged", "(Landroidx/lifecycle/P;Landroidx/lifecycle/Lifecycle$Event;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.p0$a$a$a, reason: collision with other inner class name */
            public static final class C1797a implements InterfaceC22979L {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Lifecycle.Event f46854b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l0.h<N0> f46855c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ T f46856d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Lifecycle.Event f46857e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ r f46858f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ d f46859g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ SuspendLambda f46860h;

                /* compiled from: RepeatOnLifecycle.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                /* renamed from: androidx.lifecycle.p0$a$a$a$a, reason: collision with other inner class name */
                public static final class C1798a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public kotlinx.coroutines.sync.a f46861q;

                    /* renamed from: r, reason: collision with root package name */
                    public SuspendLambda f46862r;

                    /* renamed from: s, reason: collision with root package name */
                    public int f46863s;

                    /* renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ d f46864t;

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ SuspendLambda f46865u;

                    /* compiled from: RepeatOnLifecycle.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.lifecycle.p0$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C1799a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                        /* renamed from: q, reason: collision with root package name */
                        public int f46866q;

                        /* renamed from: r, reason: collision with root package name */
                        public /* synthetic */ Object f46867r;

                        /* renamed from: s, reason: collision with root package name */
                        public final /* synthetic */ p<T, Continuation<? super G0>, Object> f46868s;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C1799a(p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super C1799a> continuation) {
                            super(2, continuation);
                            this.f46868s = pVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @k
                        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                            C1799a c1799a = new C1799a(this.f46868s, continuation);
                            c1799a.f46867r = obj;
                            return c1799a;
                        }

                        @Override // Y41.p
                        public final Object invoke(T t12, Continuation<? super G0> continuation) {
                            return ((C1799a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @l
                        public final Object invokeSuspend(@k Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = this.f46866q;
                            if (i12 == 0) {
                                C42729a0.b(obj);
                                T t12 = (T) this.f46867r;
                                this.f46866q = 1;
                                if (this.f46868s.invoke(t12, this) == coroutine_suspended) {
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
                    public C1798a(d dVar, p pVar, Continuation continuation) {
                        super(2, continuation);
                        this.f46864t = dVar;
                        this.f46865u = (SuspendLambda) pVar;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @k
                    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                        return new C1798a(this.f46864t, this.f46865u, continuation);
                    }

                    @Override // Y41.p
                    public final Object invoke(T t12, Continuation<? super G0> continuation) {
                        return ((C1798a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.p] */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.coroutines.sync.a] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) throws Throwable {
                        d dVar;
                        ?? r12;
                        kotlinx.coroutines.sync.a aVar;
                        Throwable th2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f46863s;
                        try {
                            if (i12 == 0) {
                                C42729a0.b(obj);
                                dVar = this.f46864t;
                                this.f46861q = dVar;
                                SuspendLambda suspendLambda = this.f46865u;
                                this.f46862r = suspendLambda;
                                this.f46863s = 1;
                                r12 = suspendLambda;
                                if (dVar.b(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    aVar = this.f46861q;
                                    try {
                                        C42729a0.b(obj);
                                        G0 g02 = G0.f406611a;
                                        aVar.d(null);
                                        return G0.f406611a;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        aVar.d(null);
                                        throw th2;
                                    }
                                }
                                p pVar = (p) this.f46862r;
                                ?? r32 = this.f46861q;
                                C42729a0.b(obj);
                                dVar = r32;
                                r12 = pVar;
                            }
                            C1799a c1799a = new C1799a(r12, null);
                            this.f46861q = dVar;
                            this.f46862r = null;
                            this.f46863s = 2;
                            if (U.c(c1799a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar = dVar;
                            G0 g022 = G0.f406611a;
                            aVar.d(null);
                            return G0.f406611a;
                        } catch (Throwable th4) {
                            aVar = dVar;
                            th2 = th4;
                            aVar.d(null);
                            throw th2;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C1797a(Lifecycle.Event event, l0.h hVar, T t12, Lifecycle.Event event2, r rVar, d dVar, p pVar) {
                    this.f46854b = event;
                    this.f46855c = hVar;
                    this.f46856d = t12;
                    this.f46857e = event2;
                    this.f46858f = rVar;
                    this.f46859g = dVar;
                    this.f46860h = (SuspendLambda) pVar;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
                /* JADX WARN: Type inference failed for: r5v3, types: [T, kotlinx.coroutines.N0] */
                @Override // androidx.view.InterfaceC22979L
                public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
                    l0.h<N0> hVar = this.f46855c;
                    if (event == this.f46854b) {
                        hVar.f406842b = C43259k.d(this.f46856d, null, null, new C1798a(this.f46859g, this.f46860h, null), 3);
                        return;
                    }
                    if (event == this.f46857e) {
                        N0 n02 = hVar.f406842b;
                        if (n02 != null) {
                            n02.c(null);
                        }
                        hVar.f406842b = null;
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        int i12 = Z.f406624c;
                        this.f46858f.resumeWith(G0.f406611a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1796a(Lifecycle lifecycle, Lifecycle.State state, T t12, p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super C1796a> continuation) {
                super(2, continuation);
                this.f46850u = lifecycle;
                this.f46851v = state;
                this.f46852w = t12;
                this.f46853x = (SuspendLambda) pVar;
            }

            /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C1796a(this.f46850u, this.f46851v, this.f46852w, this.f46853x, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C1796a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:17:0x003b, B:26:0x0073, B:35:0x0089, B:37:0x00a9, B:31:0x007f, B:33:0x0083, B:34:0x0086, B:22:0x0069, B:24:0x006d, B:25:0x0070), top: B:61:0x003b }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:17:0x003b, B:26:0x0073, B:35:0x0089, B:37:0x00a9, B:31:0x007f, B:33:0x0083, B:34:0x0086, B:22:0x0069, B:24:0x006d, B:25:0x0070), top: B:61:0x003b }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
            /* JADX WARN: Type inference failed for: r10v1, types: [T, androidx.lifecycle.O, androidx.lifecycle.p0$a$a$a] */
            /* JADX WARN: Type inference failed for: r12v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23056p0.a.C1796a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Lifecycle lifecycle, Lifecycle.State state, p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46843s = lifecycle;
            this.f46844t = state;
            this.f46845u = (SuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f46843s, this.f46844t, this.f46845u, continuation);
            aVar.f46842r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f46841q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f46842r;
                c cVar = C43262l0.f411945a;
                AbstractC43129d1 abstractC43129d1Y = K.f411877a.y();
                C1796a c1796a = new C1796a(this.f46843s, this.f46844t, t12, this.f46845u, null);
                this.f46841q = 1;
                if (C43259k.g(abstractC43129d1Y, c1796a, this) == coroutine_suspended) {
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

    @l
    public static final Object a(@k Lifecycle lifecycle, @k Lifecycle.State state, @k p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, @k Continuation<? super G0> continuation) {
        if (state == Lifecycle.State.f46680c) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getF46705d() == Lifecycle.State.f46679b) {
            return G0.f406611a;
        }
        Object objC = U.c(new a(lifecycle, state, pVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    @l
    public static final Object b(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.State state, @k p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, @k Continuation<? super G0> continuation) {
        Object objA = a(interfaceC22983P.getLifecycle(), state, pVar, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
