package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.I0;

/* compiled from: BeduinActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$4", f = "BeduinActor.kt", i = {0, 0}, l = {74, 76}, m = "invokeSuspend", n = {"$this$channelFlow", "loadingAction"}, s = {"L$0", "L$1"})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements Y41.p<I0<? super BeduinInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public BeduinInternalAction.StartLoadingContent f176230q;

    /* renamed from: r, reason: collision with root package name */
    public int f176231r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f176232s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f176233t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40047a f176234u;

    /* compiled from: BeduinActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$4$1", f = "BeduinActor.kt", i = {}, l = {93, 100, 102}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f176235q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f176236r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f176237s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40047a f176238t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ BeduinInternalAction.StartLoadingContent f176239u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ I0<BeduinInternalAction> f176240v;

        /* compiled from: BeduinActor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lcom/avito/beduin/v2/avito/parser/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$4$1$deferredRequest$1", f = "BeduinActor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C5220a extends SuspendLambda implements Y41.p<T, Continuation<? super Z<? extends com.avito.beduin.v2.avito.parser.a>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f176241q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f176242r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC40047a f176243s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ BeduinInternalAction.StartLoadingContent f176244t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ I0<BeduinInternalAction> f176245u;

            /* compiled from: BeduinActor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lcom/avito/beduin/v2/avito/parser/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$4$1$deferredRequest$1$1", f = "BeduinActor.kt", i = {}, l = {80, 85}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.d$a$a$a, reason: collision with other inner class name */
            public static final class C5221a extends SuspendLambda implements Y41.p<T, Continuation<? super Z<? extends com.avito.beduin.v2.avito.parser.a>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f176246q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f176247r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ g f176248s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ InterfaceC40047a f176249t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ BeduinInternalAction.StartLoadingContent f176250u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ I0<BeduinInternalAction> f176251v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C5221a(g gVar, InterfaceC40047a interfaceC40047a, BeduinInternalAction.StartLoadingContent startLoadingContent, I0<? super BeduinInternalAction> i02, Continuation<? super C5221a> continuation) {
                    super(2, continuation);
                    this.f176248s = gVar;
                    this.f176249t = interfaceC40047a;
                    this.f176250u = startLoadingContent;
                    this.f176251v = i02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C5221a c5221a = new C5221a(this.f176248s, this.f176249t, this.f176250u, this.f176251v, continuation);
                    c5221a.f176247r = obj;
                    return c5221a;
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super Z<? extends com.avito.beduin.v2.avito.parser.a>> continuation) {
                    return ((C5221a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r6.f176246q
                        com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$StartLoadingContent r2 = r6.f176250u
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L29
                        if (r1 == r4) goto L1f
                        if (r1 != r3) goto L17
                        java.lang.Object r0 = r6.f176247r
                        kotlin.C42729a0.b(r7)
                        goto L87
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1f:
                        java.lang.Object r1 = r6.f176247r
                        com.avito.android.lib.beduin_v2.feature.mvi.g r1 = (com.avito.android.lib.beduin_v2.feature.mvi.g) r1
                        kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L27
                        goto L4c
                    L27:
                        r7 = move-exception
                        goto L57
                    L29:
                        kotlin.C42729a0.b(r7)
                        java.lang.Object r7 = r6.f176247r
                        kotlinx.coroutines.T r7 = (kotlinx.coroutines.T) r7
                        com.avito.android.lib.beduin_v2.feature.mvi.g r1 = r6.f176248s
                        eT.a r7 = r6.f176249t
                        int r5 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L27
                        r5 = r7
                        eT.a$c r5 = (kotlin.InterfaceC40047a.c) r5     // Catch: java.lang.Throwable -> L27
                        java.lang.String r5 = r5.f395206a     // Catch: java.lang.Throwable -> L27
                        eT.a$c r7 = (kotlin.InterfaceC40047a.c) r7     // Catch: java.lang.Throwable -> L27
                        ZS.b r7 = r7.f395207b     // Catch: java.lang.Throwable -> L27
                        r6.f176247r = r1     // Catch: java.lang.Throwable -> L27
                        r6.f176246q = r4     // Catch: java.lang.Throwable -> L27
                        com.avito.android.lib.beduin_v2.feature.cache.c r4 = r1.f176292h     // Catch: java.lang.Throwable -> L27
                        java.lang.Object r7 = r4.a(r5, r7, r6)     // Catch: java.lang.Throwable -> L27
                        if (r7 != r0) goto L4c
                        return r0
                    L4c:
                        java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L27
                        com.avito.beduin.v2.avito.parser.b r1 = r1.f176285a     // Catch: java.lang.Throwable -> L27
                        com.avito.beduin.v2.avito.parser.a r7 = r1.h(r7)     // Catch: java.lang.Throwable -> L27
                        int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L27
                        goto L5f
                    L57:
                        int r1 = kotlin.Z.f406624c
                        kotlin.Z$b r1 = new kotlin.Z$b
                        r1.<init>(r7)
                        r7 = r1
                    L5f:
                        boolean r1 = r7 instanceof kotlin.Z.b
                        if (r1 != 0) goto L88
                        r1 = r7
                        com.avito.beduin.v2.avito.parser.a r1 = (com.avito.beduin.v2.avito.parser.a) r1
                        java.util.concurrent.atomic.AtomicLong r1 = r2.f90639b
                        com.avito.android.time.c r4 = com.avito.android.time.c.f301452a
                        r4.getClass()
                        com.avito.android.time.b r4 = com.avito.android.time.c.f301453b
                        long r4 = r4.a()
                        r1.set(r4)
                        com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$FinishLoadingContent r1 = com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction.FinishLoadingContent.f176255b
                        r6.f176247r = r7
                        r6.f176246q = r3
                        kotlinx.coroutines.channels.I0<com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction> r3 = r6.f176251v
                        java.lang.Object r1 = r3.send(r1, r6)
                        if (r1 != r0) goto L86
                        return r0
                    L86:
                        r0 = r7
                    L87:
                        r7 = r0
                    L88:
                        java.lang.Throwable r0 = kotlin.Z.b(r7)
                        if (r0 == 0) goto L9e
                        java.util.concurrent.atomic.AtomicLong r0 = r2.f90639b
                        com.avito.android.time.c r1 = com.avito.android.time.c.f301452a
                        r1.getClass()
                        com.avito.android.time.b r1 = com.avito.android.time.c.f301453b
                        long r1 = r1.a()
                        r0.set(r1)
                    L9e:
                        kotlin.Z r7 = kotlin.Z.a(r7)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.mvi.d.a.C5220a.C5221a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5220a(g gVar, InterfaceC40047a interfaceC40047a, BeduinInternalAction.StartLoadingContent startLoadingContent, I0<? super BeduinInternalAction> i02, Continuation<? super C5220a> continuation) {
                super(2, continuation);
                this.f176242r = gVar;
                this.f176243s = interfaceC40047a;
                this.f176244t = startLoadingContent;
                this.f176245u = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C5220a(this.f176242r, this.f176243s, this.f176244t, this.f176245u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Z<? extends com.avito.beduin.v2.avito.parser.a>> continuation) {
                return ((C5220a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f176241q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    kotlinx.coroutines.scheduling.b bVarA = this.f176242r.f176286b.a();
                    C5221a c5221a = new C5221a(this.f176242r, this.f176243s, this.f176244t, this.f176245u, null);
                    this.f176241q = 1;
                    obj = C43259k.g(bVarA, c5221a, this);
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
        public a(g gVar, InterfaceC40047a interfaceC40047a, BeduinInternalAction.StartLoadingContent startLoadingContent, I0<? super BeduinInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f176237s = gVar;
            this.f176238t = interfaceC40047a;
            this.f176239u = startLoadingContent;
            this.f176240v = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f176237s, this.f176238t, this.f176239u, this.f176240v, continuation);
            aVar.f176236r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f176235q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r12)
                goto L9a
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                java.lang.Object r1 = r11.f176236r
                kotlin.C42729a0.b(r12)
                goto L82
            L24:
                kotlin.C42729a0.b(r12)
                goto L4c
            L28:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f176236r
                kotlinx.coroutines.T r12 = (kotlinx.coroutines.T) r12
                com.avito.android.lib.beduin_v2.feature.mvi.d$a$a r1 = new com.avito.android.lib.beduin_v2.feature.mvi.d$a$a
                eT.a r7 = r11.f176238t
                com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$StartLoadingContent r8 = r11.f176239u
                com.avito.android.lib.beduin_v2.feature.mvi.g r6 = r11.f176237s
                kotlinx.coroutines.channels.I0<com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction> r9 = r11.f176240v
                r10 = 0
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10)
                r5 = 0
                kotlinx.coroutines.a0 r12 = kotlinx.coroutines.C43259k.b(r12, r5, r1, r2)
                r11.f176235q = r4
                java.lang.Object r12 = r12.F(r11)
                if (r12 != r0) goto L4c
                return r0
            L4c:
                kotlin.Z r12 = (kotlin.Z) r12
                java.lang.Object r1 = r12.f406625b
                boolean r12 = r1 instanceof kotlin.Z.b
                if (r12 != 0) goto L82
                r12 = r1
                com.avito.beduin.v2.avito.parser.a r12 = (com.avito.beduin.v2.avito.parser.a) r12
                eT.a r4 = r11.f176238t
                eT.a$c r4 = (kotlin.InterfaceC40047a.c) r4
                ZS.b r4 = r4.f395207b
                java.lang.String r5 = r4.f20171d
                java.lang.String r4 = r4.f20170c
                java.lang.String r6 = r12.f335461a
                com.avito.android.lib.beduin_v2.feature.mvi.g r7 = r11.f176237s
                if (r4 == 0) goto L70
                r7.getClass()
                int r8 = r4.length()
                if (r8 != 0) goto L71
            L70:
                r4 = r6
            L71:
                gT.a r6 = r7.f176291g
                r6.f396481a = r5
                r6.f396482b = r4
                r11.f176236r = r1
                r11.f176235q = r3
                java.lang.Object r12 = com.avito.android.lib.beduin_v2.feature.mvi.g.c(r7, r12, r11)
                if (r12 != r0) goto L82
                return r0
            L82:
                java.lang.Throwable r12 = kotlin.Z.b(r1)
                if (r12 == 0) goto L9a
                com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$ShowError r3 = new com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$ShowError
                r3.<init>(r12)
                r11.f176236r = r1
                r11.f176235q = r2
                kotlinx.coroutines.channels.I0<com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction> r12 = r11.f176240v
                java.lang.Object r12 = r12.send(r3, r11)
                if (r12 != r0) goto L9a
                return r0
            L9a:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.mvi.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, InterfaceC40047a interfaceC40047a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f176233t = gVar;
        this.f176234u = interfaceC40047a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f176233t, this.f176234u, continuation);
        dVar.f176232s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super BeduinInternalAction> i02, Continuation<? super G0> continuation) {
        return ((d) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        BeduinInternalAction.StartLoadingContent startLoadingContent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f176231r;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i03 = (I0) this.f176232s;
            BeduinInternalAction.StartLoadingContent startLoadingContent2 = new BeduinInternalAction.StartLoadingContent(null, 1, null);
            this.f176232s = i03;
            this.f176230q = startLoadingContent2;
            this.f176231r = 1;
            if (i03.send(startLoadingContent2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i02 = i03;
            startLoadingContent = startLoadingContent2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            BeduinInternalAction.StartLoadingContent startLoadingContent3 = this.f176230q;
            I0 i04 = (I0) this.f176232s;
            C42729a0.b(obj);
            startLoadingContent = startLoadingContent3;
            i02 = i04;
        }
        this.f176233t.f176290f.b(((InterfaceC40047a.c) this.f176234u).f395207b);
        a aVar = new a(this.f176233t, this.f176234u, startLoadingContent, i02, null);
        this.f176232s = null;
        this.f176230q = null;
        this.f176231r = 2;
        if (U.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
