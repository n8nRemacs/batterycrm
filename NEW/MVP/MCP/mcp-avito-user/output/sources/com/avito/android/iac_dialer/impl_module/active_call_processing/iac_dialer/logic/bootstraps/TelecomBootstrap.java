package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.telecom.OnAddCallCommandResultTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.telecom.OnAddCallFailedWithoutCallIdInTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.telecom.d;
import com.avito.android.util.R0;
import com.huawei.hms.api.FailedBinderCallBack;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;

/* compiled from: TelecomBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0015\u001a\u00020\u00142\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0019\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/bootstraps/TelecomBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/telecom/d;", "telecomManager", "Lcom/avito/android/util/R0;", "dispatchersFactory", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/telecom/d;Lcom/avito/android/util/R0;)V", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "callControl", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "onCallRegisteredInTelecom", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/telecom/a;Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Lcom/avito/android/iac_dialer/impl_module/telecom/d;", "Lcom/avito/android/util/R0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final class TelecomBootstrap implements IacBootstrap {
    public static final int $stable = 8;

    @Y61.k
    private final R0 dispatchersFactory;

    @Y61.k
    private final com.avito.android.iac_dialer.impl_module.telecom.d telecomManager;

    /* compiled from: TelecomBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$onCallRegisteredInTelecom$1", f = "TelecomBootstrap.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165252q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d2<IacEvent> f165253r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165254s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f165255t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f165256u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165257v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.telecom.a f165258w;

        /* compiled from: TelecomBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$a, reason: collision with other inner class name */
        public static final class C4885a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f165259b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165260c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f165261d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.iac_dialer.impl_module.telecom.a f165262e;

            /* compiled from: TelecomBootstrap.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$onCallRegisteredInTelecom$1$2", f = "TelecomBootstrap.kt", i = {1}, l = {142, 151}, m = "emit", n = {"event"}, s = {"L$0"})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$a$a, reason: collision with other inner class name */
            public static final class C4886a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f165263q;

                /* renamed from: r, reason: collision with root package name */
                public Object f165264r;

                /* renamed from: s, reason: collision with root package name */
                public String f165265s;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f165266t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C4885a<T> f165267u;

                /* renamed from: v, reason: collision with root package name */
                public int f165268v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4886a(C4885a<? super T> c4885a, Continuation<? super C4886a> continuation) {
                    super(continuation);
                    this.f165267u = c4885a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f165266t = obj;
                    this.f165268v |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f165267u.emit(null, this);
                }
            }

            public C4885a(String str, IacBootstrap.a aVar, String str2, com.avito.android.iac_dialer.impl_module.telecom.a aVar2) {
                this.f165259b = str;
                this.f165260c = aVar;
                this.f165261d = str2;
                this.f165262e = aVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom.Registered r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.C4885a.emit(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent$Telecom$Registered, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<IacEvent.Telecom.Registered> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f165269b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f165270c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$b$a, reason: collision with other inner class name */
            public static final class C4887a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165271b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f165272c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$onCallRegisteredInTelecom$1$invokeSuspend$$inlined$filter$1$2", f = "TelecomBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$b$a$a, reason: collision with other inner class name */
                public static final class C4888a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165273q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165274r;

                    public C4888a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165273q = obj;
                        this.f165274r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4887a.this.emit(null, this);
                    }
                }

                public C4887a(InterfaceC43172j interfaceC43172j, String str) {
                    this.f165271b = interfaceC43172j;
                    this.f165272c = str;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.b.C4887a.C4888a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$b$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.b.C4887a.C4888a) r0
                        int r1 = r0.f165274r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165274r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$b$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165273q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165274r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent$Telecom$Registered r6 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom.Registered) r6
                        java.lang.String r6 = r6.getCallId()
                        java.lang.String r2 = r4.f165272c
                        boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                        if (r6 == 0) goto L4e
                        r0.f165274r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165271b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.b.C4887a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(c cVar, String str) {
                this.f165269b = cVar;
                this.f165270c = str;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super IacEvent.Telecom.Registered> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165269b.collect(new C4887a(interfaceC43172j, this.f165270c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "eK/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f165276b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eK/a$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$c$a, reason: collision with other inner class name */
            public static final class C4889a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165277b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$onCallRegisteredInTelecom$1$invokeSuspend$$inlined$releaseWaiterOnSubscriptionTo$1$2", f = "TelecomBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$c$a$a, reason: collision with other inner class name */
                public static final class C4890a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165278q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165279r;

                    public C4890a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165278q = obj;
                        this.f165279r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4889a.this.emit(null, this);
                    }
                }

                public C4889a(InterfaceC43172j interfaceC43172j) {
                    this.f165277b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.c.C4889a.C4890a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$c$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.c.C4889a.C4890a) r0
                        int r1 = r0.f165279r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165279r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$c$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165278q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165279r
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
                        boolean r6 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom.Registered
                        if (r6 == 0) goto L43
                        r0.f165279r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165277b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.a.c.C4889a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(InterfaceC43160i interfaceC43160i) {
                this.f165276b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165276b.collect(new C4889a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d2<? extends IacEvent> d2Var, IacBootstrap.d dVar, String str, String str2, IacBootstrap.a aVar, com.avito.android.iac_dialer.impl_module.telecom.a aVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f165253r = d2Var;
            this.f165254s = dVar;
            this.f165255t = str;
            this.f165256u = str2;
            this.f165257v = aVar;
            this.f165258w = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f165253r, this.f165254s, this.f165255t, this.f165256u, this.f165257v, this.f165258w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165252q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IacBootstrap.Companion companion = IacBootstrap.INSTANCE;
                c cVar = new c(C43175k.P(this.f165253r, new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a(this.f165254s, null)));
                String str = this.f165255t;
                b bVar = new b(cVar, str);
                C4885a c4885a = new C4885a(this.f165256u, this.f165257v, str, this.f165258w);
                this.f165252q = 1;
                if (bVar.collect(c4885a, this) == coroutine_suspended) {
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

    /* compiled from: TelecomBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$process$1", f = "TelecomBootstrap.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165281q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d2<IacEvent> f165282r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165283s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165284t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ TelecomBootstrap f165285u;

        /* compiled from: TelecomBootstrap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165286l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IacBootstrap.a aVar) {
                super(0);
                this.f165286l = aVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f165286l.a(OnAddCallFailedWithoutCallIdInTelecomAction.INSTANCE);
                return G0.f406611a;
            }
        }

        /* compiled from: TelecomBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$AddCall;", "addCallEvent", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$AddCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$b$b, reason: collision with other inner class name */
        public static final class C4891b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165287b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TelecomBootstrap f165288c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d2<IacEvent> f165289d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.d f165290e;

            /* JADX WARN: Multi-variable type inference failed */
            public C4891b(IacBootstrap.a aVar, TelecomBootstrap telecomBootstrap, d2<? extends IacEvent> d2Var, IacBootstrap.d dVar) {
                this.f165287b = aVar;
                this.f165288c = telecomBootstrap;
                this.f165289d = d2Var;
                this.f165290e = dVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IacEvent.Telecom.AddCall addCall = (IacEvent.Telecom.AddCall) obj;
                C43259k.d(kotlinx.coroutines.U.a(EmptyCoroutineContext.INSTANCE), null, null, new e0(this.f165287b, addCall, this.f165288c, this.f165289d, this.f165290e, null), 3);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "eK/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f165291b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eK/a$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165292b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$process$1$invokeSuspend$$inlined$releaseWaiterOnSubscriptionTo$1$2", f = "TelecomBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$b$c$a$a, reason: collision with other inner class name */
                public static final class C4892a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165293q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165294r;

                    public C4892a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165293q = obj;
                        this.f165294r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f165292b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.b.c.a.C4892a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$b$c$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.b.c.a.C4892a) r0
                        int r1 = r0.f165294r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165294r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$b$c$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165293q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165294r
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
                        boolean r6 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom.AddCall
                        if (r6 == 0) goto L43
                        r0.f165294r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165292b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(InterfaceC43160i interfaceC43160i) {
                this.f165291b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165291b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d2<? extends IacEvent> d2Var, IacBootstrap.d dVar, IacBootstrap.a aVar, TelecomBootstrap telecomBootstrap, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f165282r = d2Var;
            this.f165283s = dVar;
            this.f165284t = aVar;
            this.f165285u = telecomBootstrap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f165282r, this.f165283s, this.f165284t, this.f165285u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165281q;
            if (i12 == 0) {
                C42729a0.b(obj);
                d.a aVar = com.avito.android.iac_dialer.impl_module.telecom.d.f166409a;
                IacBootstrap.a aVar2 = this.f165284t;
                a aVar3 = new a(aVar2);
                aVar.getClass();
                d.a.f166411b = aVar3;
                IacBootstrap.Companion companion = IacBootstrap.INSTANCE;
                IacBootstrap.d dVar = this.f165283s;
                com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a aVar4 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a(dVar, null);
                d2<IacEvent> d2Var = this.f165282r;
                c cVar = new c(C43175k.P(d2Var, aVar4));
                C4891b c4891b = new C4891b(aVar2, this.f165285u, d2Var, dVar);
                this.f165281q = 1;
                if (cVar.collect(c4891b, this) == coroutine_suspended) {
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
    public TelecomBootstrap(@Y61.k com.avito.android.iac_dialer.impl_module.telecom.d dVar, @Y61.k R0 r02) {
        this.telecomManager = dVar;
        this.dispatchersFactory = r02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCallRegisteredInTelecom(String callId, com.avito.android.iac_dialer.impl_module.telecom.a callControl, d2<? extends IacEvent> eventsFlow, IacBootstrap.a actionCollector, IacBootstrap.d waiter) throws InterruptedException {
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new a(eventsFlow, waiter, callId, "TelecomBootstrap_".concat(C43066x.u0(3, callId)), actionCollector, callControl, null), 3);
        waiter.a("IacEvent.Telecom.Registered_".concat(callId));
        actionCollector.a(new OnAddCallCommandResultTelecomAction(callId, null, Boolean.valueOf(callControl.c())));
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    @Y61.k
    public String getName() {
        return b.a.a(this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    public void process(@Y61.k d2<? extends IacEvent> eventsFlow, @Y61.k IacState initialState, @Y61.k IacBootstrap.a actionCollector, @Y61.k IacBootstrap.d waiter) throws InterruptedException {
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new b(eventsFlow, waiter, actionCollector, this, null), 3);
        waiter.a("IacEvent.Telecom.AddCall");
    }
}
