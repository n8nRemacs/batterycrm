package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices.OnAudioStateChangedFromTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.telecom.OnAddCallCommandResultTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.telecom.state.OnAnswerRequestFromTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.telecom.state.OnDisconnectedFromTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.telecom.state.OnSilenceRequestFromTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d2;

/* compiled from: TelecomBootstrap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.TelecomBootstrap$process$1$2$1", f = "TelecomBootstrap.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class e0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f165356q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.a f165357r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacEvent.Telecom.AddCall f165358s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TelecomBootstrap f165359t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2<IacEvent> f165360u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.d f165361v;

    /* compiled from: TelecomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "callControl", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/telecom/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.iac_dialer.impl_module.telecom.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TelecomBootstrap f165362l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacEvent.Telecom.AddCall f165363m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d2<IacEvent> f165364n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165365o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f165366p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TelecomBootstrap telecomBootstrap, IacEvent.Telecom.AddCall addCall, d2<? extends IacEvent> d2Var, IacBootstrap.a aVar, IacBootstrap.d dVar) {
            super(1);
            this.f165362l = telecomBootstrap;
            this.f165363m = addCall;
            this.f165364n = d2Var;
            this.f165365o = aVar;
            this.f165366p = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.iac_dialer.impl_module.telecom.a aVar) throws InterruptedException {
            String callId = this.f165363m.getCallId();
            this.f165362l.onCallRegisteredInTelecom(callId, aVar, this.f165364n, this.f165365o, this.f165366p);
            return G0.f406611a;
        }
    }

    /* compiled from: TelecomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "t", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165367l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacEvent.Telecom.AddCall f165368m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacBootstrap.a aVar, IacEvent.Telecom.AddCall addCall) {
            super(1);
            this.f165367l = aVar;
            this.f165368m = addCall;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f165367l.a(new OnAddCallCommandResultTelecomAction(this.f165368m.getCallId(), th2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: TelecomBootstrap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165369l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacEvent.Telecom.AddCall f165370m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IacBootstrap.a aVar, IacEvent.Telecom.AddCall addCall) {
            super(0);
            this.f165369l = aVar;
            this.f165370m = addCall;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f165369l.a(new OnSilenceRequestFromTelecomAction(this.f165370m.getCallId()));
            return G0.f406611a;
        }
    }

    /* compiled from: TelecomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "callType", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165371l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacEvent.Telecom.AddCall f165372m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IacBootstrap.a aVar, IacEvent.Telecom.AddCall addCall) {
            super(1);
            this.f165371l = aVar;
            this.f165372m = addCall;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.booleanValue();
            IacEvent.Telecom.AddCall addCall = this.f165372m;
            this.f165371l.a(new OnAnswerRequestFromTelecomAction(addCall.getCallId(), addCall.isVideo()));
            return G0.f406611a;
        }
    }

    /* compiled from: TelecomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;", "reasonBundle", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<TerminateReasonBundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165373l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacEvent.Telecom.AddCall f165374m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(IacBootstrap.a aVar, IacEvent.Telecom.AddCall addCall) {
            super(1);
            this.f165373l = aVar;
            this.f165374m = addCall;
        }

        @Override // Y41.l
        public final G0 invoke(TerminateReasonBundle terminateReasonBundle) {
            TerminateReasonBundle terminateReasonBundle2 = terminateReasonBundle;
            this.f165373l.a(new OnDisconnectedFromTelecomAction(this.f165374m.getCallId(), terminateReasonBundle2.getReason(), terminateReasonBundle2.getIsLocal()));
            return G0.f406611a;
        }
    }

    /* compiled from: TelecomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<AudioState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.a f165375l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacEvent.Telecom.AddCall f165376m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(IacBootstrap.a aVar, IacEvent.Telecom.AddCall addCall) {
            super(1);
            this.f165375l = aVar;
            this.f165376m = addCall;
        }

        @Override // Y41.l
        public final G0 invoke(AudioState audioState) {
            this.f165375l.a(new OnAudioStateChangedFromTelecomAction(this.f165376m.getCallId(), audioState));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(IacBootstrap.a aVar, IacEvent.Telecom.AddCall addCall, TelecomBootstrap telecomBootstrap, d2<? extends IacEvent> d2Var, IacBootstrap.d dVar, Continuation<? super e0> continuation) {
        super(2, continuation);
        this.f165357r = aVar;
        this.f165358s = addCall;
        this.f165359t = telecomBootstrap;
        this.f165360u = d2Var;
        this.f165361v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e0(this.f165357r, this.f165358s, this.f165359t, this.f165360u, this.f165361v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((e0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f165356q;
        IacBootstrap.a aVar = this.f165357r;
        IacEvent.Telecom.AddCall addCall = this.f165358s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                IacBootstrap.a aVar2 = new IacBootstrap.a(aVar.f164972b, androidx.compose.foundation.H.o(new StringBuilder(), aVar.f164971a, '_', addCall.getCallId()));
                TelecomBootstrap telecomBootstrap = this.f165359t;
                com.avito.android.iac_dialer.impl_module.telecom.d dVar = telecomBootstrap.telecomManager;
                String callId = addCall.getCallId();
                IacCallDirection direction = addCall.getDirection();
                boolean zIsVideo = addCall.isVideo();
                List<String> tags = addCall.getTags();
                a aVar3 = new a(telecomBootstrap, this.f165358s, this.f165360u, aVar2, this.f165361v);
                b bVar = new b(aVar, addCall);
                c cVar = new c(aVar2, addCall);
                d dVar2 = new d(aVar2, addCall);
                e eVar = new e(aVar2, addCall);
                f fVar = new f(aVar, addCall);
                this.f165356q = 1;
                if (dVar.b(callId, direction, zIsVideo, tags, aVar3, bVar, cVar, dVar2, eVar, fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Throwable th2) {
            aVar.a(new OnAddCallCommandResultTelecomAction(addCall.getCallId(), th2, null));
        }
        return G0.f406611a;
    }
}
