package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsConnectionQuality;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.C30853v;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.connection.OnAvCallsConnectionQualityChangedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.avcalls.OnAvCallsCallStateChangedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.webrtc_stats.OnWebRtcStatsDeliveredAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.init.OnNewIncomingCallFromAvCallsAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.OnAvCallsCameraPositionChangedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.ConnectionQuality;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: AvCallsBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/bootstraps/AvCallsBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "LHJ/a;", "avCalls", "LMJ/b;", "avCallsVideoRendererStorage", "Lcom/avito/android/util/R0;", "dispatchersFactory", "Lcom/avito/android/deep_linking/x;", "deepLinkFactory", "<init>", "(LHJ/a;LMJ/b;Lcom/avito/android/util/R0;Lcom/avito/android/deep_linking/x;)V", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "LHJ/a;", "LMJ/b;", "Lcom/avito/android/util/R0;", "Lcom/avito/android/deep_linking/x;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final class AvCallsBootstrap implements IacBootstrap {
    public static final int $stable = 8;

    @Y61.k
    private final HJ.a avCalls;

    @Y61.k
    private final MJ.b avCallsVideoRendererStorage;

    @Y61.k
    private final com.avito.android.deep_linking.x deepLinkFactory;

    @Y61.k
    private final R0 dispatchersFactory;

    /* compiled from: AvCallsBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$process$1", f = "AvCallsBootstrap.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165019q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d2<IacEvent> f165020r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165021s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AvCallsBootstrap f165022t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165023u;

        /* compiled from: AvCallsBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$a$a, reason: collision with other inner class name */
        public static final class C4839a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvCallsBootstrap f165024b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165025c;

            public C4839a(IacBootstrap.a aVar, AvCallsBootstrap avCallsBootstrap) {
                this.f165024b = avCallsBootstrap;
                this.f165025c = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                AvCallsCameraPosition avCallsCameraPosition;
                AvCallsTerminateReason unknown;
                IacEvent.AvCalls avCalls = (IacEvent.AvCalls) obj;
                boolean z12 = avCalls instanceof IacEvent.AvCalls.CreateOutgoingCall;
                IacBootstrap.a aVar = this.f165025c;
                AvCallsBootstrap avCallsBootstrap = this.f165024b;
                if (z12) {
                    IacEvent.AvCalls.CreateOutgoingCall createOutgoingCall = (IacEvent.AvCalls.CreateOutgoingCall) avCalls;
                    A1.e(avCallsBootstrap.avCalls.n(createOutgoingCall.getCallId(), createOutgoingCall.getTo(), createOutgoingCall.getFrom(), createOutgoingCall.isVideo(), createOutgoingCall.getCreateCallMetaInfo()), new C30845m(aVar, avCalls), new C30846n(aVar, avCallsBootstrap));
                } else if (avCalls instanceof IacEvent.AvCalls.StartOutgoingCall) {
                    A1.e(avCallsBootstrap.avCalls.j(((IacEvent.AvCalls.StartOutgoingCall) avCalls).getCallId()), C30847o.f165397l, C30848p.f165398l);
                } else if (avCalls instanceof IacEvent.AvCalls.SendRingingForIncomingCall) {
                    A1.e(avCallsBootstrap.avCalls.l(((IacEvent.AvCalls.SendRingingForIncomingCall) avCalls).getCallId()), C30849q.f165399l, r.f165400l);
                } else if (avCalls instanceof IacEvent.AvCalls.AcceptIncomingCall) {
                    A1.e(avCallsBootstrap.avCalls.i(((IacEvent.AvCalls.AcceptIncomingCall) avCalls).getCallId()), new C30850s(aVar), C30851t.f165402l);
                } else if (avCalls instanceof IacEvent.AvCalls.TerminateCall) {
                    HJ.a aVar2 = avCallsBootstrap.avCalls;
                    IacEvent.AvCalls.TerminateCall terminateCall = (IacEvent.AvCalls.TerminateCall) avCalls;
                    String callId = terminateCall.getCallId();
                    TerminateReason terminateReason = terminateCall.getTerminateReason();
                    if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.AnswerTimeout.INSTANCE)) {
                        unknown = AvCallsTerminateReason.AnswerTimeout.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.Busy.INSTANCE)) {
                        unknown = AvCallsTerminateReason.Busy.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.ConnectTimeout.INSTANCE)) {
                        unknown = AvCallsTerminateReason.ConnectTimeout.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.Hangup.INSTANCE)) {
                        unknown = AvCallsTerminateReason.Hangup.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.InternalError.INSTANCE)) {
                        unknown = AvCallsTerminateReason.InternalError.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.NoMicAccess.INSTANCE)) {
                        unknown = AvCallsTerminateReason.NoMicAccess.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.Reject.INSTANCE)) {
                        unknown = AvCallsTerminateReason.Reject.INSTANCE;
                    } else if (kotlin.jvm.internal.L.f(terminateReason, TerminateReason.ServerError.INSTANCE)) {
                        unknown = AvCallsTerminateReason.ServerError.INSTANCE;
                    } else {
                        if (!(terminateReason instanceof TerminateReason.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        unknown = new AvCallsTerminateReason.Unknown(((TerminateReason.Unknown) terminateReason).getReason());
                    }
                    A1.e(aVar2.h(callId, unknown), C30852u.f165403l, C30840h.f165381l);
                } else if (avCalls instanceof IacEvent.AvCalls.HandleCallDeliveredByPush) {
                    A1.e(avCallsBootstrap.avCalls.m(((IacEvent.AvCalls.HandleCallDeliveredByPush) avCalls).getJson()), C30841i.f165384l, C30842j.f165385l);
                } else if (avCalls instanceof IacEvent.AvCalls.HandleSocketMessage) {
                    A1.e(avCallsBootstrap.avCalls.k(((IacEvent.AvCalls.HandleSocketMessage) avCalls).getJson()), C30843k.f165389l, C30844l.f165390l);
                } else if (avCalls instanceof IacEvent.AvCalls.EnableSendingAudio) {
                    IacEvent.AvCalls.EnableSendingAudio enableSendingAudio = (IacEvent.AvCalls.EnableSendingAudio) avCalls;
                    avCallsBootstrap.avCalls.c(enableSendingAudio.getCallId(), enableSendingAudio.isEnabled());
                } else if (avCalls instanceof IacEvent.AvCalls.EnableSendingVideo) {
                    IacEvent.AvCalls.EnableSendingVideo enableSendingVideo = (IacEvent.AvCalls.EnableSendingVideo) avCalls;
                    avCallsBootstrap.avCalls.a(enableSendingVideo.getCallId(), enableSendingVideo.isEnabled());
                } else if (avCalls instanceof IacEvent.AvCalls.AttachVideoRenderer) {
                    IacEvent.AvCalls.AttachVideoRenderer attachVideoRenderer = (IacEvent.AvCalls.AttachVideoRenderer) avCalls;
                    avCallsBootstrap.avCalls.g(attachVideoRenderer.getCallId(), true, avCallsBootstrap.avCallsVideoRendererStorage.a(attachVideoRenderer.getCallId(), true));
                    avCallsBootstrap.avCalls.g(attachVideoRenderer.getCallId(), false, avCallsBootstrap.avCallsVideoRendererStorage.a(attachVideoRenderer.getCallId(), false));
                } else if (avCalls instanceof IacEvent.AvCalls.DetachVideoRenderer) {
                    IacEvent.AvCalls.DetachVideoRenderer detachVideoRenderer = (IacEvent.AvCalls.DetachVideoRenderer) avCalls;
                    avCallsBootstrap.avCalls.e(detachVideoRenderer.getCallId(), true, avCallsBootstrap.avCallsVideoRendererStorage.a(detachVideoRenderer.getCallId(), true));
                    avCallsBootstrap.avCalls.e(detachVideoRenderer.getCallId(), false, avCallsBootstrap.avCallsVideoRendererStorage.a(detachVideoRenderer.getCallId(), false));
                    avCallsBootstrap.avCallsVideoRendererStorage.b(detachVideoRenderer.getCallId(), true);
                    avCallsBootstrap.avCallsVideoRendererStorage.b(detachVideoRenderer.getCallId(), false);
                } else if (avCalls instanceof IacEvent.AvCalls.SwitchCamera) {
                    HJ.a aVar3 = avCallsBootstrap.avCalls;
                    int i12 = C30853v.a.f165405b[((IacEvent.AvCalls.SwitchCamera) avCalls).getPosition().ordinal()];
                    if (i12 == 1) {
                        avCallsCameraPosition = AvCallsCameraPosition.f164614b;
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        avCallsCameraPosition = AvCallsCameraPosition.f164615c;
                    }
                    aVar3.d(avCallsCameraPosition);
                } else if (avCalls instanceof IacEvent.AvCalls.SendDtmf) {
                    IacEvent.AvCalls.SendDtmf sendDtmf = (IacEvent.AvCalls.SendDtmf) avCalls;
                    avCallsBootstrap.avCalls.b(sendDtmf.getCallId(), sendDtmf.getTone());
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "eK/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f165026b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eK/a$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$a$b$a, reason: collision with other inner class name */
            public static final class C4840a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f165027b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$process$1$invokeSuspend$$inlined$releaseWaiterOnSubscriptionTo$1$2", f = "AvCallsBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$a$b$a$a, reason: collision with other inner class name */
                public static final class C4841a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f165028q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f165029r;

                    public C4841a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f165028q = obj;
                        this.f165029r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4840a.this.emit(null, this);
                    }
                }

                public C4840a(InterfaceC43172j interfaceC43172j) {
                    this.f165027b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap.a.b.C4840a.C4841a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$a$b$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap.a.b.C4840a.C4841a) r0
                        int r1 = r0.f165029r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f165029r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$a$b$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f165028q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f165029r
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
                        boolean r6 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.AvCalls
                        if (r6 == 0) goto L43
                        r0.f165029r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f165027b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap.a.b.C4840a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i) {
                this.f165026b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f165026b.collect(new C4840a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d2<? extends IacEvent> d2Var, IacBootstrap.d dVar, AvCallsBootstrap avCallsBootstrap, IacBootstrap.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f165020r = d2Var;
            this.f165021s = dVar;
            this.f165022t = avCallsBootstrap;
            this.f165023u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f165020r, this.f165021s, this.f165022t, this.f165023u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165019q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IacBootstrap.Companion companion = IacBootstrap.INSTANCE;
                b bVar = new b(C43175k.P(this.f165020r, new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a(this.f165021s, null)));
                C4839a c4839a = new C4839a(this.f165023u, this.f165022t);
                this.f165019q = 1;
                if (bVar.collect(c4839a, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsBootstrap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$process$2", f = "AvCallsBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165032r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165033s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f165034t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f165035u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ IacState f165036v;

        /* compiled from: AvCallsBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.d f165037b;

            public a(IacBootstrap.d dVar) {
                this.f165037b = dVar;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                this.f165037b.f164975b.set(true);
            }
        }

        /* compiled from: AvCallsBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", "avcallsEvent", "Lkotlin/G0;", "accept", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$b$b, reason: collision with other inner class name */
        public static final class C4842b<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IacBootstrap.a f165038b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AvCallsBootstrap f165039c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f165040d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f165041e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ IacState f165042f;

            /* compiled from: AvCallsBootstrap.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AvCallsBootstrap$b$b$a */
            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f165043a;

                static {
                    int[] iArr = new int[AvCallsConnectionQuality.values().length];
                    try {
                        iArr[AvCallsConnectionQuality.NO_DATA.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AvCallsConnectionQuality.f164618OK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AvCallsConnectionQuality.UNSTABLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f165043a = iArr;
                }
            }

            public C4842b(IacBootstrap.a aVar, AvCallsBootstrap avCallsBootstrap, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, IacState iacState) {
                this.f165038b = aVar;
                this.f165039c = avCallsBootstrap;
                this.f165040d = atomicBoolean;
                this.f165041e = atomicBoolean2;
                this.f165042f = iacState;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                ConnectionQuality connectionQuality;
                IacCameraPosition iacCameraPosition;
                AvCallsEvent avCallsEvent = (AvCallsEvent) obj;
                boolean z12 = avCallsEvent instanceof AvCallsEvent.CallStateChanged;
                AvCallsBootstrap avCallsBootstrap = this.f165039c;
                IacBootstrap.a aVar = this.f165038b;
                if (z12) {
                    aVar.a(new OnAvCallsCallStateChangedAction(C30853v.a(((AvCallsEvent.CallStateChanged) avCallsEvent).getState(), avCallsBootstrap.deepLinkFactory)));
                    return;
                }
                if (avCallsEvent instanceof AvCallsEvent.CallTerminated) {
                    return;
                }
                if (avCallsEvent instanceof AvCallsEvent.CameraPositionChanged) {
                    AvCallsCameraPosition cameraPosition = ((AvCallsEvent.CameraPositionChanged) avCallsEvent).getCameraPosition();
                    if (cameraPosition != null) {
                        int iOrdinal = cameraPosition.ordinal();
                        if (iOrdinal == 0) {
                            iacCameraPosition = IacCameraPosition.FRONT;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iacCameraPosition = IacCameraPosition.BACK;
                        }
                    } else {
                        iacCameraPosition = null;
                    }
                    AtomicBoolean atomicBoolean = this.f165040d;
                    if (atomicBoolean.get() || iacCameraPosition != null) {
                        atomicBoolean.set(true);
                        aVar.a(new OnAvCallsCameraPositionChangedAction(iacCameraPosition));
                        return;
                    }
                    return;
                }
                if (!(avCallsEvent instanceof AvCallsEvent.ConnectionQualityChanged)) {
                    if (avCallsEvent instanceof AvCallsEvent.NewIncomingCallReceived) {
                        aVar.a(new OnNewIncomingCallFromAvCallsAction(C30853v.a(((AvCallsEvent.NewIncomingCallReceived) avCallsEvent).getState(), avCallsBootstrap.deepLinkFactory)));
                        return;
                    } else {
                        if (avCallsEvent instanceof AvCallsEvent.StatsReportDelivered) {
                            AvCallsEvent.StatsReportDelivered statsReportDelivered = (AvCallsEvent.StatsReportDelivered) avCallsEvent;
                            aVar.a(new OnWebRtcStatsDeliveredAction(statsReportDelivered.getStatsReportJson(), C30853v.a(statsReportDelivered.getState(), avCallsBootstrap.deepLinkFactory)));
                            return;
                        }
                        return;
                    }
                }
                int i12 = a.f165043a[((AvCallsEvent.ConnectionQualityChanged) avCallsEvent).getConnectionQuality().ordinal()];
                if (i12 == 1) {
                    connectionQuality = ConnectionQuality.NO_DATA;
                } else if (i12 == 2) {
                    connectionQuality = ConnectionQuality.f165511OK;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    connectionQuality = ConnectionQuality.UNSTABLE;
                }
                AtomicBoolean atomicBoolean2 = this.f165041e;
                if (atomicBoolean2.get() || connectionQuality != this.f165042f.getAppearance().getConnectionQuality()) {
                    atomicBoolean2.set(true);
                    aVar.a(new OnAvCallsConnectionQualityChangedAction(connectionQuality));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacBootstrap.d dVar, IacBootstrap.a aVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, IacState iacState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f165032r = dVar;
            this.f165033s = aVar;
            this.f165034t = atomicBoolean;
            this.f165035u = atomicBoolean2;
            this.f165036v = iacState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AvCallsBootstrap.this.new b(this.f165032r, this.f165033s, this.f165034t, this.f165035u, this.f165036v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AvCallsBootstrap avCallsBootstrap = AvCallsBootstrap.this;
            io.reactivex.rxjava3.core.z<AvCallsEvent> zVarF = avCallsBootstrap.avCalls.f();
            a aVar = new a(this.f165032r);
            zVarF.getClass();
            zVarF.J(io.reactivex.rxjava3.internal.functions.a.f401993c, aVar).t0(new C4842b(this.f165033s, avCallsBootstrap, this.f165034t, this.f165035u, this.f165036v));
            return G0.f406611a;
        }
    }

    @Inject
    public AvCallsBootstrap(@Y61.k HJ.a aVar, @Y61.k MJ.b bVar, @Y61.k R0 r02, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.avCalls = aVar;
        this.avCallsVideoRendererStorage = bVar;
        this.dispatchersFactory = r02;
        this.deepLinkFactory = xVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    @Y61.k
    public String getName() {
        return b.a.a(this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    public void process(@Y61.k d2<? extends IacEvent> eventsFlow, @Y61.k IacState initialState, @Y61.k IacBootstrap.a actionCollector, @Y61.k IacBootstrap.d waiter) throws InterruptedException {
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new a(eventsFlow, waiter, this, actionCollector, null), 3);
        waiter.a("IacEvent.CanRecallInteractor");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new b(waiter, actionCollector, new AtomicBoolean(false), atomicBoolean, initialState, null), 3);
        waiter.a("avCalls.eventStream");
    }
}
