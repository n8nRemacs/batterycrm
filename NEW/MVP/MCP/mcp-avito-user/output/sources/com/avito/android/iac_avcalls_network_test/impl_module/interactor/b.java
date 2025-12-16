package com.avito.android.iac_avcalls_network_test.impl_module.interactor;

import BL.a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_avcalls_network_test.impl_module.splitter.ab.configs.NetworkTestOnForegroundTestGroup;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;

/* compiled from: AvCallsNetworkTestInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/b;", "Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/a;", "a", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.iac_avcalls_network_test.impl_module.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f164627a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final KJ.a f164628b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f164629c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UJ.a f164630d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f164631e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PJ.a f164632f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RJ.a f164633g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.app_foreground_provider.util_module.a f164634h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final BL.a f164635i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final H f164636j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final AtomicBoolean f164637k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    @k
    public final AtomicBoolean f164638l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final AtomicBoolean f164639m = new AtomicBoolean(false);

    /* compiled from: AvCallsNetworkTestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvCallsNetworkTestInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls_network_test.impl_module.interactor.AvCallsNetworkTestInteractorImpl$startTracking$1", f = "AvCallsNetworkTestInteractor.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$b, reason: collision with other inner class name */
    public static final class C4813b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164640q;

        /* compiled from: AvCallsNetworkTestInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBL/a$b;", "it", "Lkotlin/G0;", "emit", "(LBL/a$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f164642b;

            public a(b bVar) {
                this.f164642b = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f164642b.f164639m.set(!((a.b) obj).f1353a.isEmpty());
                return G0.f406611a;
            }
        }

        public C4813b(Continuation<? super C4813b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C4813b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4813b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164640q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                InterfaceC43160i interfaceC43160iA = y.a(bVar.f164635i.getF168152e());
                a aVar = new a(bVar);
                this.f164640q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsNetworkTestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls_network_test.impl_module.interactor.AvCallsNetworkTestInteractorImpl$startTracking$2", f = "AvCallsNetworkTestInteractor.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164643q;

        /* compiled from: AvCallsNetworkTestInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f164645b;

            public a(b bVar) {
                this.f164645b = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                b bVar = this.f164645b;
                NetworkTestOnForegroundTestGroup networkTestOnForegroundTestGroupA = bVar.f164632f.a().a();
                networkTestOnForegroundTestGroupA.getClass();
                if (networkTestOnForegroundTestGroupA != NetworkTestOnForegroundTestGroup.f164677d) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTestInteractor", "Skip network test cause user isn't in test group", null);
                    return G0.f406611a;
                }
                if (bVar.f164639m.get()) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTestInteractor", "Skip network test cause IacWatcher has call", null);
                    return G0.f406611a;
                }
                long jNow = bVar.f164631e.now();
                Long lC2 = bVar.f164630d.c();
                if (jNow - (lC2 != null ? lC2.longValue() : 0L) < TimeUnit.DAYS.toMillis(1L)) {
                    RJ.a aVar = bVar.f164633g;
                    aVar.getClass();
                    n<Object> nVar = RJ.a.f14305c[0];
                    if (!((Boolean) aVar.f14306b.a().invoke()).booleanValue()) {
                        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTestInteractor", "Skip network test cause previous test was less then 1 day ago", null);
                        return G0.f406611a;
                    }
                }
                if (bVar.f164637k.get()) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTestInteractor", "Skip network test cause one test is already in progress", null);
                    return G0.f406611a;
                }
                C43259k.d(U.a(bVar.f164627a.a()), null, null, new com.avito.android.iac_avcalls_network_test.impl_module.interactor.c(bVar, jNow, null), 3);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$b, reason: collision with other inner class name */
        public static final class C4814b implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n2 f164646b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$b$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f164647b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_avcalls_network_test.impl_module.interactor.AvCallsNetworkTestInteractorImpl$startTracking$2$invokeSuspend$$inlined$map$1$2", f = "AvCallsNetworkTestInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$b$a$a, reason: collision with other inner class name */
                public static final class C4815a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f164648q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f164649r;

                    public C4815a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.f164648q = obj;
                        this.f164649r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f164647b = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.iac_avcalls_network_test.impl_module.interactor.b.c.C4814b.a.C4815a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$b$a$a r0 = (com.avito.android.iac_avcalls_network_test.impl_module.interactor.b.c.C4814b.a.C4815a) r0
                        int r1 = r0.f164649r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f164649r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$b$a$a r0 = new com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f164648q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f164649r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        com.avito.android.app_foreground_provider.util_module.AppForegroundStatus r5 = (com.avito.android.app_foreground_provider.util_module.AppForegroundStatus) r5
                        boolean r5 = r5.isForeground()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.f164649r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f164647b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b.c.C4814b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C4814b(n2 n2Var) {
                this.f164646b = n2Var;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public final Object collect(@k InterfaceC43172j<? super Boolean> interfaceC43172j, @k Continuation continuation) {
                Object objCollect = this.f164646b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$c, reason: collision with other inner class name */
        public static final class C4816c implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f164651b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f164652c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$c$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f164653b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f164654c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_avcalls_network_test.impl_module.interactor.AvCallsNetworkTestInteractorImpl$startTracking$2$invokeSuspend$$inlined$mapNotNull$1$2", f = "AvCallsNetworkTestInteractor.kt", i = {}, l = {222}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$c$a$a, reason: collision with other inner class name */
                public static final class C4817a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f164655q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f164656r;

                    public C4817a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.f164655q = obj;
                        this.f164656r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j, b bVar) {
                    this.f164653b = interfaceC43172j;
                    this.f164654c = bVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.iac_avcalls_network_test.impl_module.interactor.b.c.C4816c.a.C4817a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$c$a$a r0 = (com.avito.android.iac_avcalls_network_test.impl_module.interactor.b.c.C4816c.a.C4817a) r0
                        int r1 = r0.f164656r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f164656r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$c$a$a r0 = new com.avito.android.iac_avcalls_network_test.impl_module.interactor.b$c$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f164655q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f164656r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        boolean r5 = r5.booleanValue()
                        com.avito.android.iac_avcalls_network_test.impl_module.interactor.b r6 = r4.f164654c
                        java.util.concurrent.atomic.AtomicBoolean r6 = r6.f164638l
                        r6.set(r3)
                        if (r5 == 0) goto L48
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                        goto L49
                    L48:
                        r5 = 0
                    L49:
                        if (r5 == 0) goto L56
                        r0.f164656r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f164653b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_avcalls_network_test.impl_module.interactor.b.c.C4816c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C4816c(InterfaceC43160i interfaceC43160i, b bVar) {
                this.f164651b = interfaceC43160i;
                this.f164652c = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public final Object collect(@k InterfaceC43172j<? super Boolean> interfaceC43172j, @k Continuation continuation) {
                Object objCollect = this.f164651b.collect(new a(interfaceC43172j, this.f164652c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164643q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                C4816c c4816c = new C4816c(C43175k.r(new C4814b(bVar.f164634h.a())), bVar);
                a aVar = new a(bVar);
                this.f164643q = 1;
                if (c4816c.collect(aVar, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public b(@k R0 r02, @k KJ.a aVar, @k InterfaceC28373a interfaceC28373a, @k UJ.a aVar2, @k com.avito.android.server_time.f fVar, @k PJ.a aVar3, @k RJ.a aVar4, @k com.avito.android.app_foreground_provider.util_module.a aVar5, @k BL.a aVar6, @k H h12) {
        this.f164627a = r02;
        this.f164628b = aVar;
        this.f164629c = interfaceC28373a;
        this.f164630d = aVar2;
        this.f164631e = fVar;
        this.f164632f = aVar3;
        this.f164633g = aVar4;
        this.f164634h = aVar5;
        this.f164635i = aVar6;
        this.f164636j = h12;
    }

    @Override // com.avito.android.iac_avcalls_network_test.impl_module.interactor.a
    public final void a() {
        R0 r02 = this.f164627a;
        C43259k.d(U.a(r02.a()), null, null, new C4813b(null), 3);
        C43259k.d(U.a(r02.a()), null, null, new c(null), 3);
    }
}
