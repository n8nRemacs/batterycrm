package kb1;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import h21.C40764a;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* loaded from: classes9.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f406438a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f406439b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Qa1.a f406440c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final qb1.g f406441d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T11.f f406442e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43238h f406443f = U.a(C43262l0.f411945a);

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$isPushTokenExist$1", f = "ClientServiceInteractorImpl.kt", i = {}, l = {100, UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public i f406444q;

        /* renamed from: r, reason: collision with root package name */
        public String f406445r;

        /* renamed from: s, reason: collision with root package name */
        public int f406446s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C40764a f406448u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.vk.push.core.base.a f406449v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f406450w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C40764a c40764a, com.vk.push.core.base.a aVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f406448u = c40764a;
            this.f406449v = aVar;
            this.f406450w = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return i.this.new a(this.f406448u, this.f406449v, this.f406450w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(9:6|19|(1:24)(1:23)|25|26|33|27|31|32)(2:7|8))(1:9))(2:10|(1:12))|13|(2:15|(1:17)(3:18|19|(3:21|24|25)(0)))|26|33|27|31|32) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        
            r3.f406442e.error("Is push token exist result by ipc has failed", r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f406446s
                r2 = 1
                kb1.i r3 = kb1.i.this
                r4 = 2
                if (r1 == 0) goto L28
                if (r1 == r2) goto L20
                if (r1 != r4) goto L18
                java.lang.String r0 = r5.f406445r
                kb1.i r1 = r5.f406444q
                kotlin.C42729a0.b(r6)
                goto L5a
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                kotlin.C42729a0.b(r6)
                kotlin.Z r6 = (kotlin.Z) r6
                java.lang.Object r6 = r6.f406625b
                goto L3f
            L28:
                kotlin.C42729a0.b(r6)
                T11.f r6 = r3.f406442e
                java.lang.String r1 = "Validating host..."
                r6.info(r1)
                kb1.u r6 = r3.f406438a
                r5.f406446s = r2
                h21.a r1 = r5.f406448u
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L3f
                return r0
            L3f:
                int r1 = kotlin.Z.f406624c
                boolean r1 = r6 instanceof kotlin.Z.b
                if (r1 != 0) goto L86
                kotlin.G0 r6 = (kotlin.G0) r6
                qb1.g r6 = r3.f406441d
                r5.f406444q = r3
                java.lang.String r1 = r5.f406450w
                r5.f406445r = r1
                r5.f406446s = r4
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L58
                return r0
            L58:
                r0 = r1
                r1 = r3
            L5a:
                java.lang.String r6 = (java.lang.String) r6
                boolean r2 = kotlin.text.C43066x.K(r0)
                if (r2 != 0) goto L6b
                boolean r6 = r0.equals(r6)
                if (r6 == 0) goto L6b
                com.vk.push.core.push.IsPushTokenExistResult r6 = com.vk.push.core.push.IsPushTokenExistResult.f367133b
                goto L6d
            L6b:
                com.vk.push.core.push.IsPushTokenExistResult r6 = com.vk.push.core.push.IsPushTokenExistResult.f367134c
            L6d:
                T11.f r0 = r1.f406442e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Check result: "
                r1.<init>(r2)
                java.lang.String r2 = r6.name()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.info(r1)
                int r0 = kotlin.Z.f406624c
            L86:
                com.vk.push.core.base.AidlResult r6 = com.vk.push.core.utils.o.a(r6)
                com.vk.push.core.base.a r0 = r5.f406449v     // Catch: android.os.RemoteException -> L90
                r0.e2(r6)     // Catch: android.os.RemoteException -> L90
                goto L98
            L90:
                r6 = move-exception
                T11.f r0 = r3.f406442e
                java.lang.String r1 = "Is push token exist result by ipc has failed"
                r0.error(r1, r6)
            L98:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kb1.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$onDeleteMessages$1", f = "ClientServiceInteractorImpl.kt", i = {}, l = {73, 75}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f406451q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C40764a f406453s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.vk.push.core.base.a f406454t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C40764a c40764a, com.vk.push.core.base.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f406453s = c40764a;
            this.f406454t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return i.this.new b(this.f406453s, this.f406454t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(8:6|18|19|(1:21)(1:22)|29|23|27|28)(2:7|8))(1:9))(2:10|(1:12))|13|(3:15|(1:17)|18)|19|(0)(0)|29|23|27|28) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        
            r4.f406442e.error("On delete messages result by ipc has failed", r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f406451q
                r2 = 1
                r3 = 2
                kb1.i r4 = kb1.i.this
                if (r1 == 0) goto L24
                if (r1 == r2) goto L1c
                if (r1 != r3) goto L14
                kotlin.C42729a0.b(r6)
                goto L53
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.C42729a0.b(r6)
                kotlin.Z r6 = (kotlin.Z) r6
                java.lang.Object r6 = r6.f406625b
                goto L3b
            L24:
                kotlin.C42729a0.b(r6)
                T11.f r6 = r4.f406442e
                java.lang.String r1 = "Validating host..."
                r6.info(r1)
                kb1.u r6 = r4.f406438a
                r5.f406451q = r2
                h21.a r1 = r5.f406453s
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L3b
                return r0
            L3b:
                int r1 = kotlin.Z.f406624c
                boolean r1 = r6 instanceof kotlin.Z.b
                if (r1 != 0) goto L57
                kotlin.G0 r6 = (kotlin.G0) r6
                T11.f r6 = r4.f406442e
                java.lang.String r1 = "Calling onDeleteMessages..."
                r6.info(r1)
                r5.f406451q = r3
                java.lang.Object r6 = kb1.i.f(r4, r5)
                if (r6 != r0) goto L53
                return r0
            L53:
                com.vk.push.core.push.OnDeleteMessagesResult r6 = (com.vk.push.core.push.OnDeleteMessagesResult) r6
                int r0 = kotlin.Z.f406624c
            L57:
                com.vk.push.core.base.AidlResult r6 = com.vk.push.core.utils.o.a(r6)
                T extends android.os.Parcelable r0 = r6.f367015b
                boolean r0 = r0 instanceof com.vk.push.core.base.AidlException
                if (r0 != 0) goto L69
                T11.f r0 = r4.f406442e
                java.lang.String r1 = "On delete messages has successfully finished"
                r0.info(r1)
                goto L74
            L69:
                T11.f r0 = r4.f406442e
                java.lang.RuntimeException r1 = r6.c()
                java.lang.String r2 = "On delete messages has failed"
                r0.error(r2, r1)
            L74:
                com.vk.push.core.base.a r0 = r5.f406454t     // Catch: android.os.RemoteException -> L7a
                r0.e2(r6)     // Catch: android.os.RemoteException -> L7a
                goto L82
            L7a:
                r6 = move-exception
                T11.f r0 = r4.f406442e
                java.lang.String r1 = "On delete messages result by ipc has failed"
                r0.error(r1, r6)
            L82:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kb1.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$onTokenInvalidated$1", f = "ClientServiceInteractorImpl.kt", i = {}, l = {36, 38, 64}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f406455q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C40764a f406457s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.vk.push.core.base.a f406458t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C40764a c40764a, com.vk.push.core.base.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f406457s = c40764a;
            this.f406458t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return i.this.new c(this.f406457s, this.f406458t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:(1:(1:(3:7|35|36)(2:8|9))(10:10|20|21|(1:23)(1:24)|37|25|29|(1:31)(2:32|(1:34))|35|36))(1:11))(2:12|(1:14))|15|(3:17|(1:19)|20)|21|(0)(0)|37|25|29|(0)(0)|35|36) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
        
            r5.f406442e.error("Return token invalidated result by ipc has failed", r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f406455q
                r2 = 3
                r3 = 1
                r4 = 2
                kb1.i r5 = kb1.i.this
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L24
                if (r1 == r4) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r7)
                goto Lca
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.C42729a0.b(r7)
                goto L5d
            L24:
                kotlin.C42729a0.b(r7)
                kotlin.Z r7 = (kotlin.Z) r7
                java.lang.Object r7 = r7.f406625b
                goto L43
            L2c:
                kotlin.C42729a0.b(r7)
                T11.f r7 = r5.f406442e
                java.lang.String r1 = "Validating host..."
                r7.info(r1)
                kb1.u r7 = r5.f406438a
                r6.f406455q = r3
                h21.a r1 = r6.f406457s
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L43
                return r0
            L43:
                int r1 = kotlin.Z.f406624c
                boolean r1 = r7 instanceof kotlin.Z.b
                if (r1 != 0) goto L61
                kotlin.G0 r7 = (kotlin.G0) r7
                T11.f r7 = r5.f406442e
                java.lang.String r1 = "Clearing push storage..."
                r7.info(r1)
                r6.f406455q = r4
                qb1.g r7 = r5.f406441d
                java.lang.Object r7 = r7.e(r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                com.vk.push.core.push.InvalidateTokenResult r7 = com.vk.push.core.push.InvalidateTokenResult.f367131b
                int r1 = kotlin.Z.f406624c
            L61:
                com.vk.push.core.base.AidlResult r7 = com.vk.push.core.utils.o.a(r7)
                T extends android.os.Parcelable r1 = r7.f367015b
                boolean r1 = r1 instanceof com.vk.push.core.base.AidlException
                if (r1 != 0) goto L73
                T11.f r1 = r5.f406442e
                java.lang.String r3 = "Invalidating token has successfully finished"
                r1.info(r3)
                goto L7e
            L73:
                T11.f r1 = r5.f406442e
                java.lang.RuntimeException r3 = r7.c()
                java.lang.String r4 = "Invalidating token has failed"
                r1.error(r4, r3)
            L7e:
                com.vk.push.core.base.a r1 = r6.f406458t     // Catch: android.os.RemoteException -> L84
                r1.e2(r7)     // Catch: android.os.RemoteException -> L84
                goto L8c
            L84:
                r7 = move-exception
                T11.f r1 = r5.f406442e
                java.lang.String r3 = "Return token invalidated result by ipc has failed"
                r1.error(r3, r7)
            L8c:
                T11.f r7 = r5.f406442e
                java.lang.String r1 = "Calling re-subscription to retrieve a new push token"
                r7.info(r1)
                ru.rustore.sdk.core.tasks.f$a r7 = ru.rustore.sdk.core.tasks.f.f436778d
                r7.getClass()
                kotlin.Q r7 = ru.rustore.sdk.core.tasks.f.a.a()
                A r1 = r7.f406619b
                ru.rustore.sdk.core.tasks.f r1 = (ru.rustore.sdk.core.tasks.f) r1
                B r7 = r7.f406620c
                ru.rustore.sdk.core.tasks.f$b r7 = (ru.rustore.sdk.core.tasks.f.b) r7
                kb1.j r3 = new kb1.j
                r3.<init>(r5)
                r4 = 0
                r1.b(r3, r4, r4)
                kb1.j r3 = new kb1.j
                r3.<init>(r5)
                r1.b(r4, r3, r4)
                Qa1.a r1 = r5.f406440c
                if (r1 != 0) goto Lc1
                T11.f r7 = r5.f406442e
                java.lang.String r0 = "SubscribeComponent is not initialized"
                r7.error(r0, r4)
                goto Lca
            Lc1:
                r6.f406455q = r2
                java.lang.Object r7 = r1.f(r7, r6)
                if (r7 != r0) goto Lca
                return r0
            Lca:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kb1.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(@Y61.k u uVar, @Y61.k f fVar, @Y61.l Qa1.a aVar, @Y61.k qb1.g gVar, @Y61.k T11.f fVar2) {
        this.f406438a = uVar;
        this.f406439b = fVar;
        this.f406440c = aVar;
        this.f406441d = gVar;
        this.f406442e = fVar2.b("ClientServiceInteractor");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(kb1.i r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof kb1.h
            if (r0 == 0) goto L16
            r0 = r5
            kb1.h r0 = (kb1.h) r0
            int r1 = r0.f406437s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f406437s = r1
            goto L1b
        L16:
            kb1.h r0 = new kb1.h
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f406435q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f406437s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r5)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r5)
            r0.f406437s = r3
            kb1.f r4 = r4.f406439b
            java.lang.Object r4 = r4.e(r0)
            if (r4 != r1) goto L42
            goto L44
        L42:
            com.vk.push.core.push.OnDeleteMessagesResult r1 = com.vk.push.core.push.OnDeleteMessagesResult.f367136b
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.i.f(kb1.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kb1.g
    public final void a(@Y61.k C40764a c40764a, @Y61.k String str, @Y61.k com.vk.push.core.base.a aVar) {
        this.f406442e.info("Checking is push token " + com.vk.push.core.utils.q.a(str) + " exist...");
        C43259k.d(this.f406443f, null, null, new a(c40764a, aVar, str, null), 3);
    }

    @Override // kb1.g
    public final void b(@Y61.k C40764a c40764a, @Y61.k com.vk.push.core.base.a aVar) {
        this.f406442e.info("Token invalidation has requested");
        C43259k.d(this.f406443f, null, null, new c(c40764a, aVar, null), 3);
    }

    @Override // kb1.g
    public final void c(@Y61.k C40764a c40764a, @Y61.k com.vk.push.core.base.a aVar) {
        this.f406442e.info("On delete messages has requested");
        C43259k.d(this.f406443f, null, null, new b(c40764a, aVar, null), 3);
    }

    @Override // c21.InterfaceC26930b
    public final void e() {
        this.f406442e.info("Destroying");
        U.b(this.f406443f, null);
    }
}
