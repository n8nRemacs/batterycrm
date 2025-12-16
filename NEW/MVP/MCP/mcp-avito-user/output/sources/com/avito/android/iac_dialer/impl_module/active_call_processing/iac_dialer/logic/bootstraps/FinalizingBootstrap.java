package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import com.avito.android.util.R0;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;

/* compiled from: FinalizingBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0014\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/bootstraps/FinalizingBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage;", "iacMetaInfoStorage", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor;", "iacFinalLinkInteractor", "Lcom/avito/android/util/R0;", "dispatchersFactory", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage;Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor;Lcom/avito/android/util/R0;)V", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor;", "Lcom/avito/android/util/R0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final class FinalizingBootstrap implements IacBootstrap {
    public static final int $stable = 8;

    @Y61.k
    private final R0 dispatchersFactory;

    @Y61.k
    private final IacFinalLinkInteractor iacFinalLinkInteractor;

    @Y61.k
    private final IacMetaInfoStorage iacMetaInfoStorage;

    /* compiled from: FinalizingBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$process$1", f = "FinalizingBootstrap.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165107q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f165108r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d2<IacEvent> f165109s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165110t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ FinalizingBootstrap f165111u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165112v;

        /* compiled from: FinalizingBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$a$a, reason: collision with other inner class name */
        public static final class C4853a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f165113b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FinalizingBootstrap f165114c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165115d;

            public C4853a(kotlinx.coroutines.T t12, FinalizingBootstrap finalizingBootstrap, IacBootstrap.a aVar) {
                this.f165113b = t12;
                this.f165114c = finalizingBootstrap;
                this.f165115d = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IacEvent.Finalizing finalizing = (IacEvent.Finalizing) obj;
                boolean z12 = finalizing instanceof IacEvent.Finalizing.ResolveFinalLink;
                FinalizingBootstrap finalizingBootstrap = this.f165114c;
                if (z12) {
                    C43259k.d(this.f165113b, finalizingBootstrap.dispatchersFactory.a(), null, new F(finalizingBootstrap, finalizing, this.f165115d, null), 2);
                } else if (finalizing instanceof IacEvent.Finalizing.SaveMetaToFinalLinkStorage) {
                    IacEvent.Finalizing.SaveMetaToFinalLinkStorage saveMetaToFinalLinkStorage = (IacEvent.Finalizing.SaveMetaToFinalLinkStorage) finalizing;
                    finalizingBootstrap.iacMetaInfoStorage.getF166043a().put(saveMetaToFinalLinkStorage.getCallId(), saveMetaToFinalLinkStorage.getData());
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "eK/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f165116b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eK/a$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$a$b$a, reason: collision with other inner class name */
            public static final class C4854a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165117b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$process$1$invokeSuspend$$inlined$releaseWaiterOnSubscriptionTo$1$2", f = "FinalizingBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$a$b$a$a, reason: collision with other inner class name */
                public static final class C4855a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165118q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165119r;

                    public C4855a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165118q = obj;
                        this.f165119r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4854a.this.emit(null, this);
                    }
                }

                public C4854a(InterfaceC43172j interfaceC43172j) {
                    this.f165117b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap.a.b.C4854a.C4855a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$a$b$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap.a.b.C4854a.C4855a) r0
                        int r1 = r0.f165119r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165119r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$a$b$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165118q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165119r
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
                        boolean r6 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Finalizing
                        if (r6 == 0) goto L43
                        r0.f165119r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165117b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap.a.b.C4854a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i) {
                this.f165116b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165116b.collect(new C4854a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d2<? extends IacEvent> d2Var, IacBootstrap.d dVar, FinalizingBootstrap finalizingBootstrap, IacBootstrap.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f165109s = d2Var;
            this.f165110t = dVar;
            this.f165111u = finalizingBootstrap;
            this.f165112v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f165109s, this.f165110t, this.f165111u, this.f165112v, continuation);
            aVar.f165108r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165107q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f165108r;
                IacBootstrap.Companion companion = IacBootstrap.INSTANCE;
                b bVar = new b(C43175k.P(this.f165109s, new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a(this.f165110t, null)));
                C4853a c4853a = new C4853a(t12, this.f165111u, this.f165112v);
                this.f165107q = 1;
                if (bVar.collect(c4853a, this) == coroutine_suspended) {
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
    public FinalizingBootstrap(@Y61.k IacMetaInfoStorage iacMetaInfoStorage, @Y61.k IacFinalLinkInteractor iacFinalLinkInteractor, @Y61.k R0 r02) {
        this.iacMetaInfoStorage = iacMetaInfoStorage;
        this.iacFinalLinkInteractor = iacFinalLinkInteractor;
        this.dispatchersFactory = r02;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    @Y61.k
    public String getName() {
        return b.a.a(this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    public void process(@Y61.k d2<? extends IacEvent> eventsFlow, @Y61.k IacState initialState, @Y61.k IacBootstrap.a actionCollector, @Y61.k IacBootstrap.d waiter) throws InterruptedException {
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new a(eventsFlow, waiter, this, actionCollector, null), 3);
        waiter.a("IacEvent.Storage");
    }
}
