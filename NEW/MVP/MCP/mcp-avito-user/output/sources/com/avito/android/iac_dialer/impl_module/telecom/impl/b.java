package com.avito.android.iac_dialer.impl_module.telecom.impl;

import IK.a;
import Y41.p;
import Y41.q;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import android.telecom.Connection;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionInputData;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43314z;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: IacConnection.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/b;", "Landroid/telecom/Connection;", "b", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends Connection {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final IacConnectionInputData f166438a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<G0> f166439b = B.a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final IK.a f166440c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f166441d;

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "t", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            StringBuilder sb2 = new StringBuilder("Exception in callScope ");
            b bVar = b.this;
            sb2.append(bVar.f166438a.getCallId());
            sb2.append(". Let's terminate call");
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(bVar.a(), sb2.toString(), th3);
            b.d(bVar, "callScope.exceptionHandler", null, th3, 2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/b$b;", "", "<init>", "()V", "", "WAIT_FOR_RINGING_OR_DIALING", "J", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.telecom.impl.b$b, reason: collision with other inner class name */
    public static final class C4942b {
        public /* synthetic */ C4942b(C42822w c42822w) {
            this();
        }

        public C4942b() {
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166443a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166443a = iArr;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements q<CallEndpoint, Executor, OutcomeReceiver, G0> {
        @Override // Y41.q
        public final G0 invoke(CallEndpoint callEndpoint, Executor executor, OutcomeReceiver outcomeReceiver) {
            OutcomeReceiver outcomeReceiverG = Is0.d.g(outcomeReceiver);
            ((b) this.receiver).requestCallEndpointChange(androidx.privacysandbox.ads.adservices.measurement.b.q(callEndpoint), executor, outcomeReceiverG);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<AudioState, G0> {
        @Override // Y41.l
        public final G0 invoke(AudioState audioState) {
            ((b) this.receiver).e(audioState);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ((b) this.receiver).setAudioRoute(num.intValue());
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<BluetoothDevice, G0> {
        @Override // Y41.l
        public final G0 invoke(BluetoothDevice bluetoothDevice) {
            ((b) this.receiver).requestBluetoothAudio(bluetoothDevice);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<AudioState, G0> {
        @Override // Y41.l
        public final G0 invoke(AudioState audioState) {
            ((b) this.receiver).e(audioState);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends H implements Y41.l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ((b) this.receiver).setAudioRoute(num.intValue());
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends H implements Y41.l<AudioState, G0> {
        @Override // Y41.l
        public final G0 invoke(AudioState audioState) {
            ((b) this.receiver).e(audioState);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$onAnswer$1", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f166445r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i12, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f166445r = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new k(this.f166445r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.this.f166438a.getCallbacks().getOnAnswerRequested().invoke(Boxing.boxBoolean(this.f166445r != 0));
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$onAudioStateChanged$1", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AudioState f166447r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AudioState audioState, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f166447r = audioState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new l(this.f166447r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.this.f166438a.getCallbacks().getOnAudioStateChanged().invoke(this.f166447r);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$onDisconnect$1", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new m(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.d(b.this, "onDisconnect", new TerminateReasonBundle(TerminateReason.Hangup.INSTANCE, true), null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$onReject$1", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new n(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.d(b.this, "onReject", new TerminateReasonBundle(TerminateReason.Reject.INSTANCE, true), null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$onSilence$1", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new o(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.this.f166438a.getCallbacks().getOnSilenceRequested().invoke();
            return G0.f406611a;
        }
    }

    static {
        new C4942b(null);
    }

    public b(@Y61.k IacConnectionInputData iacConnectionInputData) {
        this.f166438a = iacConnectionInputData;
        com.avito.android.iac_dialer.impl_module.telecom.impl.a aVar = new com.avito.android.iac_dialer.impl_module.telecom.impl.a(this);
        int i12 = Build.VERSION.SDK_INT;
        this.f166440c = i12 >= 34 ? new IK.f(iacConnectionInputData.getCallId(), new d(3, this, b.class, "requestCallEndpointChange", "requestCallEndpointChange(Landroid/telecom/CallEndpoint;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V", 0), new e(1, this, b.class, "onAudioStateChanged", "onAudioStateChanged(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)V", 0)) : i12 >= 28 ? new IK.c(iacConnectionInputData.getCallId(), new f(1, this, b.class, "setAudioRoute", "setAudioRoute(I)V", 0), new g(1, this, b.class, "requestBluetoothAudio", "requestBluetoothAudio(Landroid/bluetooth/BluetoothDevice;)V", 0), new h(1, this, b.class, "onAudioStateChanged", "onAudioStateChanged(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)V", 0)) : new IK.b(iacConnectionInputData.getCallId(), new i(1, this, b.class, "setAudioRoute", "setAudioRoute(I)V", 0), new j(1, this, b.class, "onAudioStateChanged", "onAudioStateChanged(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)V", 0));
        this.f166441d = new AtomicBoolean(false);
        b("init - start");
        iacConnectionInputData.setOnCallScopeException(new a());
        setConnectionProperties(128);
        setAudioModeIsVoip(true);
        int i13 = c.f166443a[iacConnectionInputData.getDirection().ordinal()];
        if (i13 == 1) {
            setDialing();
        } else if (i13 == 2) {
            setRinging();
        }
        iacConnectionInputData.getCallbacks().getOnCallAdded().invoke(aVar);
        b("init - done");
    }

    public static void d(b bVar, String str, TerminateReasonBundle terminateReasonBundle, Throwable th2, int i12) {
        if ((i12 & 2) != 0) {
            terminateReasonBundle = null;
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        bVar.getClass();
        bVar.b("moveConnectionStateToDisconnected(from='" + str + "', reason=" + terminateReasonBundle + ", t=" + th2 + ')');
        IacConnectionInputData iacConnectionInputData = bVar.f166438a;
        T callScope = iacConnectionInputData.getCallScope();
        if (U.e(callScope)) {
            U.b(callScope, null);
        }
        if (bVar.f166441d.getAndSet(true)) {
            bVar.b("moveConnectionStateToDisconnected() callTerminationScope.launch - not started cause was already launched early");
        } else {
            C43259k.d(iacConnectionInputData.getCallTerminationScope(), null, null, new com.avito.android.iac_dialer.impl_module.telecom.impl.f(bVar, terminateReasonBundle, null), 3);
        }
    }

    @Y61.k
    public final String a() {
        return "IacConnection_".concat(C43066x.u0(3, this.f166438a.getCallId()));
    }

    public final void b(@Y61.k String str) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(a(), str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k Y41.a r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.iac_dialer.impl_module.telecom.impl.c
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.iac_dialer.impl_module.telecom.impl.c r0 = (com.avito.android.iac_dialer.impl_module.telecom.impl.c) r0
            int r1 = r0.f166453s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166453s = r1
            goto L18
        L13:
            com.avito.android.iac_dialer.impl_module.telecom.impl.c r0 = new com.avito.android.iac_dialer.impl_module.telecom.impl.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f166451q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f166453s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C42729a0.b(r7)
            java.lang.String r7 = "moveConnectionStateToActive()"
            r5.b(r7)
            com.avito.android.iac_dialer.impl_module.telecom.IacConnectionInputData r7 = r5.f166438a
            kotlinx.coroutines.T r7 = r7.getCallScope()
            com.avito.android.iac_dialer.impl_module.telecom.impl.e r2 = new com.avito.android.iac_dialer.impl_module.telecom.impl.e
            r4 = 0
            r2.<init>(r6, r5, r4)
            r6 = 3
            kotlinx.coroutines.a0 r6 = kotlinx.coroutines.C43259k.b(r7, r4, r2, r6)
            r0.f166453s = r3
            java.lang.Object r7 = r6.F(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            kotlin.Z r7 = (kotlin.Z) r7
            java.lang.Object r6 = r7.f406625b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.telecom.impl.b.c(Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void e(@Y61.k AudioState audioState) {
        C43259k.d(this.f166438a.getCallScope(), null, null, new l(audioState, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onAnswer() {
        onAnswer(this.f166438a.isVideo() ? 3 : 0);
    }

    @Override // android.telecom.Connection
    @SuppressLint({"NewApi"})
    public final void onAvailableCallEndpointsChanged(@Y61.k List<CallEndpoint> list) {
        IK.a aVar = this.f166440c;
        if ((aVar instanceof IK.b) || (aVar instanceof IK.c) || !(aVar instanceof IK.f)) {
            return;
        }
        IK.f fVar = (IK.f) aVar;
        fVar.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(fVar.f8145g, "onAvailableCallEndpointsChanged(" + list + ')', null);
        List<CallEndpoint> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(fVar.b(androidx.privacysandbox.ads.adservices.measurement.b.q(it.next())));
        }
        fVar.f8143e = C42745f0.P0(arrayList);
        AudioState audioState = new AudioState(fVar.f8142d, fVar.f8143e);
        if (audioState.equals(fVar.f8144f)) {
            return;
        }
        ((e) fVar.f8140b).invoke(audioState);
        fVar.f8144f = audioState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // android.telecom.Connection
    @SuppressLint({"NewApi"})
    @InterfaceC42830m
    public final void onCallAudioStateChanged(@Y61.l CallAudioState callAudioState) {
        ?? SingletonList;
        if (callAudioState == null) {
            return;
        }
        IK.a aVar = this.f166440c;
        AudioDevice audioDeviceC = null;
        if (aVar instanceof IK.b) {
            IK.b bVar = (IK.b) aVar;
            String str = bVar.f8128f;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "onCallAudioStateChanged(...)", null);
            try {
                bVar.f8125c = IK.b.b(a.C0459a.a(callAudioState.getRoute()));
            } catch (Exception e12) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(str, "onCallAudioStateChanged: error in calculating currentDevice", e12);
            }
            try {
                LinkedHashSet linkedHashSetB = a.C0459a.b(callAudioState);
                ArrayList arrayList = new ArrayList(C42745f0.q(linkedHashSetB, 10));
                Iterator it = linkedHashSetB.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.C0459a.a(((Number) it.next()).intValue()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AudioDevice audioDeviceB = IK.b.b((AudioDevice.Type) it2.next());
                    if (audioDeviceB != null) {
                        arrayList2.add(audioDeviceB);
                    }
                }
                bVar.f8126d = C42745f0.P0(arrayList2);
            } catch (Exception e13) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(str, "onCallAudioStateChanged: error in calculating availableDevices", e13);
            }
            AudioState audioState = new AudioState(bVar.f8125c, bVar.f8126d);
            if (audioState.equals(bVar.f8127e)) {
                return;
            }
            ((j) bVar.f8124b).invoke(audioState);
            bVar.f8127e = audioState;
            return;
        }
        if (!(aVar instanceof IK.c)) {
            boolean z12 = aVar instanceof IK.f;
            return;
        }
        IK.c cVar = (IK.c) aVar;
        String str2 = cVar.f8137h;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str2, "onCallAudioStateChanged(...)", null);
        try {
            AudioDevice.Type typeA = a.C0459a.a(callAudioState.getRoute());
            if (typeA != AudioDevice.Type.BLUETOOTH) {
                audioDeviceC = IK.c.c(typeA);
            } else if (callAudioState.getActiveBluetoothDevice() != null) {
                audioDeviceC = cVar.b(callAudioState.getActiveBluetoothDevice());
            }
            cVar.f8134e = audioDeviceC;
        } catch (Exception e14) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(str2, "onCallAudioStateChanged: error in calculating currentDevice", e14);
        }
        try {
            LinkedHashSet linkedHashSetB2 = a.C0459a.b(callAudioState);
            ArrayList arrayList3 = new ArrayList(C42745f0.q(linkedHashSetB2, 10));
            Iterator it3 = linkedHashSetB2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(a.C0459a.a(((Number) it3.next()).intValue()));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                AudioDevice.Type type = (AudioDevice.Type) it4.next();
                if (type == AudioDevice.Type.BLUETOOTH) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Collection<BluetoothDevice> supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices();
                    SingletonList = new ArrayList(C42745f0.q(supportedBluetoothDevices, 10));
                    for (BluetoothDevice bluetoothDevice : supportedBluetoothDevices) {
                        AudioDevice audioDeviceB2 = cVar.b(bluetoothDevice);
                        if (audioDeviceB2 != null) {
                            linkedHashMap.put(audioDeviceB2.getId(), bluetoothDevice);
                        }
                        SingletonList.add(audioDeviceB2);
                    }
                    cVar.f8133d = linkedHashMap;
                } else {
                    SingletonList = Collections.singletonList(IK.c.c(type));
                }
                arrayList4.add(SingletonList);
            }
            cVar.f8135f = C42745f0.P0(C42745f0.C(C42745f0.H(arrayList4)));
        } catch (Exception e15) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(str2, "onCallAudioStateChanged: error in calculating availableDevices", e15);
        }
        AudioState audioState2 = new AudioState(cVar.f8134e, cVar.f8135f);
        if (audioState2.equals(cVar.f8136g)) {
            return;
        }
        ((h) cVar.f8132c).invoke(audioState2);
        cVar.f8136g = audioState2;
    }

    @Override // android.telecom.Connection
    @SuppressLint({"NewApi"})
    public final void onCallEndpointChanged(@Y61.k CallEndpoint callEndpoint) {
        IK.a aVar = this.f166440c;
        if ((aVar instanceof IK.b) || (aVar instanceof IK.c) || !(aVar instanceof IK.f)) {
            return;
        }
        IK.f fVar = (IK.f) aVar;
        fVar.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(fVar.f8145g, "onCallEndpointChanged(" + callEndpoint + ')', null);
        fVar.f8142d = fVar.b(callEndpoint);
        AudioState audioState = new AudioState(fVar.f8142d, fVar.f8143e);
        if (audioState.equals(fVar.f8144f)) {
            return;
        }
        ((e) fVar.f8140b).invoke(audioState);
        fVar.f8144f = audioState;
    }

    @Override // android.telecom.Connection
    public final void onDisconnect() {
        b("onDisconnect(). Disconnect requested by telecom - Let's terminate call");
        C43259k.d(this.f166438a.getCallScope(), null, null, new m(null), 3);
    }

    @Override // android.telecom.Connection
    public final void onMuteStateChanged(boolean z12) {
        super.onMuteStateChanged(z12);
        b("onMuteStateChanged(isMuted=" + z12 + ')');
    }

    @Override // android.telecom.Connection
    public final void onReject() {
        b("onReject(). Reject requested by telecom - Let's terminate call");
        C43259k.d(this.f166438a.getCallScope(), null, null, new n(null), 3);
    }

    @Override // android.telecom.Connection
    public final void onSilence() {
        b("onSilence(). Silence requested by telecom - Let's send it to the app");
        C43259k.d(this.f166438a.getCallScope(), null, null, new o(null), 3);
    }

    @Override // android.telecom.Connection
    public final void onStateChanged(int i12) {
        String str;
        switch (i12) {
            case 0:
                str = "INITIALIZING";
                break;
            case 1:
                str = "NEW";
                break;
            case 2:
                str = "RINGING";
                break;
            case 3:
                str = "DIALING";
                break;
            case 4:
                str = "ACTIVE";
                break;
            case 5:
                str = "HOLDING";
                break;
            case 6:
                str = "DISCONNECTED";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        b("onStateChanged: state=".concat(str));
        if (i12 == 2 || i12 == 3) {
            this.f166439b.n(G0.f406611a);
        }
    }

    @Override // android.telecom.Connection
    public final void onAnswer(int i12) {
        b("onAnswer(videoState=" + i12 + "). Answer requested by telecom - Let's send it to the app");
        C43259k.d(this.f166438a.getCallScope(), null, null, new k(i12, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onReject(int i12) {
        onReject();
    }

    @Override // android.telecom.Connection
    public final void onReject(@Y61.l String str) {
        onReject();
    }
}
