package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionEffect;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessingInfo;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareEffect;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessingInfo;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.g;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.p2;
import pK.InterfaceC46970a;

/* compiled from: IacDialer.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u00020\u0001:\u00015BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0017020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010)¨\u00066"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/IacDialerImpl;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/IacDialer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/i;", "stateInitialProvider", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/a;", "bootstrapsProvider", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/e;", "middlewaresProvider", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/c;", "dispatcherProvider", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/g;", "logger", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/k;", "tryCatch", "LpK/a;", "currentTime", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/i;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/e;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/c;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/g;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/k;LpK/a;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "action", "Lkotlin/G0;", "scheduleActionInternal", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", RequestReviewResultKt.INFO_TYPE, "processAction", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;)V", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "accept", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;Ljava/lang/String;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/i;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/e;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/c;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/g;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/k;", "LpK/a;", "Lkotlinx/coroutines/flow/Y1;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "events", "Lkotlinx/coroutines/flow/Y1;", "getEvents", "()Lkotlinx/coroutines/flow/Y1;", "Lkotlinx/coroutines/flow/Z1;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "Lkotlinx/coroutines/flow/Z1;", "getState", "()Lkotlinx/coroutines/flow/Z1;", "Lkotlin/Q;", "actionsQueue", "Companion", "b", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class IacDialerImpl implements IacDialer {

    @k
    private final Y1<Q<IacAction, IacActionProcessingInfo>> actionsQueue;

    @k
    private final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.a bootstrapsProvider;

    @k
    private final InterfaceC46970a currentTime;

    @k
    private final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.c dispatcherProvider;

    @k
    private final Y1<IacEvent> events = f2.a(0, 16, BufferOverflow.f410779d);

    @k
    private final g logger;

    @k
    private final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.e middlewaresProvider;

    @k
    private final Z1<IacState> state;

    @k
    private final i stateInitialProvider;

    @k
    private final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.k tryCatch;
    public static final int $stable = 8;

    @k
    private static final AtomicInteger actionIndexCounter = new AtomicInteger(0);

    /* compiled from: IacDialer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialerImpl$1", f = "IacDialer.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164948q;

        /* compiled from: IacDialer.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialerImpl$1$1", f = "IacDialer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialerImpl$a$a, reason: collision with other inner class name */
        public static final class C4826a extends SuspendLambda implements p<InterfaceC43172j<? super Q<? extends IacAction, ? extends IacActionProcessingInfo>>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ IacDialerImpl f164950q;

            /* compiled from: IacDialer.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialerImpl$a$a$a, reason: collision with other inner class name */
            public static final class C4827a extends N implements l<Throwable, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ IacBootstrap f164951l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4827a(IacBootstrap iacBootstrap) {
                    super(1);
                    this.f164951l = iacBootstrap;
                }

                @Override // Y41.l
                public final G0 invoke(Throwable th2) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacDialer", "Error in " + this.f164951l.getName() + ":processing", th2);
                    return G0.f406611a;
                }
            }

            /* compiled from: IacDialer.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialerImpl$a$a$b */
            public static final class b extends N implements Y41.a<G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ IacBootstrap f164952l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ IacDialerImpl f164953m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ IacBootstrap.d f164954n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(IacBootstrap iacBootstrap, IacDialerImpl iacDialerImpl, IacBootstrap.d dVar) {
                    super(0);
                    this.f164952l = iacBootstrap;
                    this.f164953m = iacDialerImpl;
                    this.f164954n = dVar;
                }

                @Override // Y41.a
                public final G0 invoke() {
                    IacDialerImpl iacDialerImpl = this.f164953m;
                    Y1<IacEvent> events = iacDialerImpl.getEvents();
                    IacState value = iacDialerImpl.getState().getValue();
                    IacBootstrap iacBootstrap = this.f164952l;
                    iacBootstrap.process(events, value, new IacBootstrap.a(new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.a(2, iacDialerImpl, IacDialerImpl.class, "accept", "accept(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;Ljava/lang/String;)V", 0), iacBootstrap.getName()), this.f164954n);
                    return G0.f406611a;
                }
            }

            /* compiled from: IacDialer.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "logMsg", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialerImpl$a$a$c */
            public static final class c extends N implements l<String, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ IacBootstrap f164955l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(IacBootstrap iacBootstrap) {
                    super(1);
                    this.f164955l = iacBootstrap;
                }

                @Override // Y41.l
                public final G0 invoke(String str) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialer", this.f164955l.getName() + ": " + str, null);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4826a(IacDialerImpl iacDialerImpl, Continuation<? super C4826a> continuation) {
                super(2, continuation);
                this.f164950q = iacDialerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C4826a(this.f164950q, continuation);
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super Q<? extends IacAction, ? extends IacActionProcessingInfo>> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C4826a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("IacDialer", "Start bootstraps", null);
                IacDialerImpl iacDialerImpl = this.f164950q;
                for (IacBootstrap iacBootstrap : iacDialerImpl.bootstrapsProvider.a()) {
                    iacDialerImpl.tryCatch.a(new C4827a(iacBootstrap)).b(new b(iacBootstrap, iacDialerImpl, new IacBootstrap.d(new c(iacBootstrap))));
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialer", iacBootstrap.getName() + ": done", null);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: IacDialer.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IacDialerImpl f164956b;

            public b(IacDialerImpl iacDialerImpl) {
                this.f164956b = iacDialerImpl;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Q q12 = (Q) obj;
                this.f164956b.processAction((IacAction) q12.f406619b, (IacActionProcessingInfo) q12.f406620c);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return IacDialerImpl.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164948q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IacDialerImpl iacDialerImpl = IacDialerImpl.this;
                C43137a0 c43137a0 = new C43137a0(new C4826a(iacDialerImpl, null), iacDialerImpl.actionsQueue);
                b bVar = new b(iacDialerImpl);
                this.f164948q = 1;
                if (c43137a0.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: IacDialer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacActionProcessing f164957l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IacActionProcessing iacActionProcessing) {
            super(1);
            this.f164957l = iacActionProcessing;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f164957l.getOut().addEffect(new IacActionEffect.UnhandledError(th2));
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacAction f164958l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacActionProcessing f164959m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IacAction iacAction, IacActionProcessing iacActionProcessing) {
            super(0);
            this.f164958l = iacAction;
            this.f164959m = iacActionProcessing;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f164958l.process(this.f164959m);
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacMiddlewareProcessing f164960l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(IacMiddlewareProcessing iacMiddlewareProcessing) {
            super(1);
            this.f164960l = iacMiddlewareProcessing;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f164960l.getOut().addEffect(new IacMiddlewareEffect.UnhandledError(th2));
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacMiddleware f164961l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacMiddlewareProcessing f164962m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(IacMiddleware iacMiddleware, IacMiddlewareProcessing iacMiddlewareProcessing) {
            super(0);
            this.f164961l = iacMiddleware;
            this.f164962m = iacMiddlewareProcessing;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f164961l.process(this.f164962m);
            return G0.f406611a;
        }
    }

    @Inject
    public IacDialerImpl(@k i iVar, @k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.a aVar, @k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.e eVar, @k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.c cVar, @k g gVar, @k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.k kVar, @k InterfaceC46970a interfaceC46970a) {
        this.stateInitialProvider = iVar;
        this.bootstrapsProvider = aVar;
        this.middlewaresProvider = eVar;
        this.dispatcherProvider = cVar;
        this.logger = gVar;
        this.tryCatch = kVar;
        this.currentTime = interfaceC46970a;
        IacState.Idle idleA = iVar.a();
        com.avito.android.iac_dialer.impl_module.utils.b bVar = com.avito.android.iac_dialer.impl_module.utils.b.f166511a;
        HasIndex hasIndexA = bVar.a(idleA.getIndexType());
        if (hasIndexA == null) {
            idleA.setIndex(0);
            bVar.b(idleA.getIndexType(), idleA);
        } else if (hasIndexA.equals(idleA)) {
            idleA.setIndex(hasIndexA.getIndex());
        } else {
            idleA.setIndex(hasIndexA.getIndex() + 1);
            bVar.b(idleA.getIndexType(), idleA);
        }
        this.state = p2.a(idleA);
        this.actionsQueue = f2.a(16, 16, BufferOverflow.f410777b);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar2.d("IacDialer", "IacDialer instance will be created", null);
        bVar2.d("IacDialer", "Initial state: ".concat(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k.a(getState().getValue())), null);
        C43259k.d(U.a(cVar.a()), null, null, new a(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processAction(IacAction action, IacActionProcessingInfo info) {
        IacState value = getState().getValue();
        info.setIndex(actionIndexCounter.incrementAndGet());
        info.setProcessingStartedAt(this.currentTime.get());
        IacActionProcessing iacActionProcessing = new IacActionProcessing(value, info, new IacActionOutput(null));
        this.tryCatch.a(new c(iacActionProcessing)).b(new d(action, iacActionProcessing));
        IacState state = iacActionProcessing.getState();
        List<IacActionEffect> effects = iacActionProcessing.getOut().getEffects();
        if (effects != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : effects) {
                if (obj instanceof IacActionEffect.EmitState) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IacActionEffect.EmitState emitState = (IacActionEffect.EmitState) it.next();
                IacState state2 = emitState.getState();
                com.avito.android.iac_dialer.impl_module.utils.b bVar = com.avito.android.iac_dialer.impl_module.utils.b.f166511a;
                HasIndex hasIndexA = bVar.a(state2.getIndexType());
                if (hasIndexA == null) {
                    state2.setIndex(0);
                    bVar.b(state2.getIndexType(), state2);
                } else if (hasIndexA.equals(state2)) {
                    state2.setIndex(hasIndexA.getIndex());
                } else {
                    state2.setIndex(hasIndexA.getIndex() + 1);
                    bVar.b(state2.getIndexType(), state2);
                }
                if (state2.getIndex() != state.getIndex()) {
                    for (IacMiddleware iacMiddleware : this.middlewaresProvider.a()) {
                        IacMiddlewareProcessing iacMiddlewareProcessing = new IacMiddlewareProcessing(state, state2, new IacMiddlewareProcessingInfo(iacMiddleware.getName(), iacActionProcessing.getCurrentTime()), new IacMiddlewareOutput(null));
                        emitState.getAllMiddlewaresProcessings().add(iacMiddlewareProcessing);
                        this.tryCatch.a(new e(iacMiddlewareProcessing)).b(new f(iacMiddleware, iacMiddlewareProcessing));
                    }
                    state = state2;
                }
            }
        }
        iacActionProcessing.getProcessingInfo().setCalculatingFinishedAt(this.currentTime.get());
        this.logger.a(iacActionProcessing);
        List<IacActionEffect> effects2 = iacActionProcessing.getOut().getEffects();
        if (effects2 != null) {
            for (IacActionEffect iacActionEffect : effects2) {
                if (!(iacActionEffect instanceof IacActionEffect.UnhandledError ? true : iacActionEffect instanceof IacActionEffect.WriteLog)) {
                    if (iacActionEffect instanceof IacActionEffect.EmitAction) {
                        scheduleActionInternal(((IacActionEffect.EmitAction) iacActionEffect).getAction());
                    } else if (iacActionEffect instanceof IacActionEffect.EmitEvent) {
                        getEvents().K5(((IacActionEffect.EmitEvent) iacActionEffect).getEvent());
                    } else if (iacActionEffect instanceof IacActionEffect.EmitState) {
                        IacActionEffect.EmitState emitState2 = (IacActionEffect.EmitState) iacActionEffect;
                        getState().setValue(emitState2.getState());
                        Iterator<T> it2 = emitState2.getAllMiddlewaresProcessings().iterator();
                        while (it2.hasNext()) {
                            List<IacMiddlewareEffect> effects3 = ((IacMiddlewareProcessing) it2.next()).getOut().getEffects();
                            if (effects3 != null) {
                                for (IacMiddlewareEffect iacMiddlewareEffect : effects3) {
                                    if (!(iacMiddlewareEffect instanceof IacMiddlewareEffect.UnhandledError ? true : iacMiddlewareEffect instanceof IacMiddlewareEffect.WriteLog)) {
                                        if (iacMiddlewareEffect instanceof IacMiddlewareEffect.EmitAction) {
                                            scheduleActionInternal(((IacMiddlewareEffect.EmitAction) iacMiddlewareEffect).getAction());
                                        } else if (iacMiddlewareEffect instanceof IacMiddlewareEffect.EmitEvent) {
                                            getEvents().K5(((IacMiddlewareEffect.EmitEvent) iacMiddlewareEffect).getEvent());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        iacActionProcessing.getProcessingInfo().setPublishingFinishedAt(this.currentTime.get());
    }

    private final void scheduleActionInternal(IacAction action) {
        this.actionsQueue.K5(new Q<>(action, new IacActionProcessingInfo(-1, action.toString(), action.getName(), this.currentTime.get(), -1L, -1L, -1L)));
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer
    public void accept(@k IacAction action, @k String from) {
        this.logger.b(action, from);
        scheduleActionInternal(action);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer
    @k
    public Y1<IacEvent> getEvents() {
        return this.events;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer
    @k
    public Z1<IacState> getState() {
        return this.state;
    }
}
