package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.app.OnAppForegroundStatusChangedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.util.R0;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43194q0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;

/* compiled from: AppForegroundStatusBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0012\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/bootstraps/AppForegroundStatusBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "Lcom/avito/android/app_foreground_provider/util_module/a;", "appForegroundStatusProvider", "Lcom/avito/android/util/R0;", "dispatchersFactory", "<init>", "(Lcom/avito/android/app_foreground_provider/util_module/a;Lcom/avito/android/util/R0;)V", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Lcom/avito/android/app_foreground_provider/util_module/a;", "Lcom/avito/android/util/R0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final class AppForegroundStatusBootstrap implements IacBootstrap {
    public static final int $stable = 8;

    @Y61.k
    private final com.avito.android.app_foreground_provider.util_module.a appForegroundStatusProvider;

    @Y61.k
    private final R0 dispatchersFactory;

    /* compiled from: AppForegroundStatusBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$process$1", f = "AppForegroundStatusBootstrap.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165001q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165003s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IacState f165004t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165005u;

        /* compiled from: AppForegroundStatusBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$process$1$2", f = "AppForegroundStatusBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$a, reason: collision with other inner class name */
        public static final class C4834a extends SuspendLambda implements Y41.p<LifecycleStatus.App, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f165006q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ IacState f165007r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4834a(IacState iacState, Continuation<? super C4834a> continuation) {
                super(2, continuation);
                this.f165007r = iacState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4834a c4834a = new C4834a(this.f165007r, continuation);
                c4834a.f165006q = obj;
                return c4834a;
            }

            @Override // Y41.p
            public final Object invoke(LifecycleStatus.App app, Continuation<? super Boolean> continuation) {
                return ((C4834a) create(app, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return Boxing.boxBoolean(kotlin.jvm.internal.L.f((LifecycleStatus.App) this.f165006q, this.f165007r.getAppearance().getApp()));
            }
        }

        /* compiled from: AppForegroundStatusBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165008b;

            public b(IacBootstrap.a aVar) {
                this.f165008b = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f165008b.a(new OnAppForegroundStatusChangedAction((LifecycleStatus.App) obj));
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC43160i<LifecycleStatus.App> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f165009b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$c$a, reason: collision with other inner class name */
            public static final class C4835a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165010b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$process$1$invokeSuspend$$inlined$map$1$2", f = "AppForegroundStatusBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$c$a$a, reason: collision with other inner class name */
                public static final class C4836a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165011q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165012r;

                    public C4836a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165011q = obj;
                        this.f165012r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4835a.this.emit(null, this);
                    }
                }

                public C4835a(InterfaceC43172j interfaceC43172j) {
                    this.f165010b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap.a.c.C4835a.C4836a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$c$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap.a.c.C4835a.C4836a) r0
                        int r1 = r0.f165012r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165012r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$c$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165011q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165012r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L54
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        com.avito.android.app_foreground_provider.util_module.AppForegroundStatus r5 = (com.avito.android.app_foreground_provider.util_module.AppForegroundStatus) r5
                        boolean r6 = r5.isForeground()
                        if (r6 == 0) goto L3f
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus$App$Started r5 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus.App.Started.INSTANCE
                        goto L49
                    L3f:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus$App$Created r6 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus$App$Created
                        boolean r5 = r5.getWasForeground()
                        r6.<init>(r5)
                        r5 = r6
                    L49:
                        r0.f165012r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165010b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L54
                        return r1
                    L54:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap.a.c.C4835a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(d dVar) {
                this.f165009b = dVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super LifecycleStatus.App> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165009b.collect(new C4835a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "eK/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f165014b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eK/a$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$d$a, reason: collision with other inner class name */
            public static final class C4837a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165015b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$process$1$invokeSuspend$$inlined$releaseWaiterOnSubscriptionTo$1$2", f = "AppForegroundStatusBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$d$a$a, reason: collision with other inner class name */
                public static final class C4838a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165016q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165017r;

                    public C4838a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165016q = obj;
                        this.f165017r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4837a.this.emit(null, this);
                    }
                }

                public C4837a(InterfaceC43172j interfaceC43172j) {
                    this.f165015b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap.a.d.C4837a.C4838a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$d$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap.a.d.C4837a.C4838a) r0
                        int r1 = r0.f165017r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165017r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$d$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap$a$d$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165016q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165017r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        boolean r6 = r5 instanceof com.avito.android.app_foreground_provider.util_module.AppForegroundStatus
                        if (r6 == 0) goto L43
                        r0.f165017r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165015b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AppForegroundStatusBootstrap.a.d.C4837a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public d(InterfaceC43160i interfaceC43160i) {
                this.f165014b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165014b.collect(new C4837a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IacBootstrap.d dVar, IacState iacState, IacBootstrap.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f165003s = dVar;
            this.f165004t = iacState;
            this.f165005u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AppForegroundStatusBootstrap.this.new a(this.f165003s, this.f165004t, this.f165005u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165001q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IacBootstrap.Companion companion = IacBootstrap.INSTANCE;
                C43194q0 c43194q0 = new C43194q0(new C4834a(this.f165004t, null), new c(new d(C43175k.P(AppForegroundStatusBootstrap.this.appForegroundStatusProvider.a(), new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a(this.f165003s, null)))));
                b bVar = new b(this.f165005u);
                this.f165001q = 1;
                if (c43194q0.collect(bVar, this) == coroutine_suspended) {
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

    @Inject
    public AppForegroundStatusBootstrap(@Y61.k com.avito.android.app_foreground_provider.util_module.a aVar, @Y61.k R0 r02) {
        this.appForegroundStatusProvider = aVar;
        this.dispatchersFactory = r02;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    @Y61.k
    public String getName() {
        return b.a.a(this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    public void process(@Y61.k d2<? extends IacEvent> eventsFlow, @Y61.k IacState initialState, @Y61.k IacBootstrap.a actionCollector, @Y61.k IacBootstrap.d waiter) throws InterruptedException {
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new a(waiter, initialState, actionCollector, null), 3);
        waiter.a("appForegroundStatusProvider.statusFlow");
    }
}
