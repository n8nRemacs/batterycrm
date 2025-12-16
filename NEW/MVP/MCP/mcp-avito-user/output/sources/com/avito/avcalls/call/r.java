package com.avito.avcalls.call;

import com.avito.avcalls.call.models.CallDirection;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.InvitingState;
import com.avito.avcalls.call.models.MediaSenderState;
import com.avito.avcalls.call.models.MediaStatus;
import com.avito.avcalls.call.models.PeerStatus;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.signaling.proto.OptionsUpdate;
import com.avito.avcalls.signaling.proto.VoipMessage;
import com.avito.avcalls.signaling.x;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/call/r;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final com.avito.avcalls.utils.logs.a f332790n = new com.avito.avcalls.utils.logs.a("CallSession");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f332791a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f332792b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43238h f332793c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A f332794d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.config.a f332795e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.stats.d f332796f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.H f332797g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.q f332798h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.utils.coroutines.e f332799i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Long f332800j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Long f332801k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Long f332802l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Z1<CallState> f332803m;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/call/r$a;", "", "<init>", "()V", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/call/r$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f332804b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f332805c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f332806d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f332807e;

        static {
            b bVar = new b("AUDIO", 0);
            f332804b = bVar;
            b bVar2 = new b("VIDEO", 1);
            f332805c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f332806d = bVarArr;
            f332807e = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f332806d.clone();
        }
    }

    /* compiled from: CallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b bVar = b.f332804b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.call.CallSession$startTerminationTimer$1", f = "CallSession.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332808q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ TerminateReason f332810s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TerminateReason terminateReason, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f332810s = terminateReason;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return r.this.new d(this.f332810s, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((d) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332808q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f332808q = 1;
                if (r.this.h(this.f332810s, true, this) == coroutine_suspended) {
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

    /* compiled from: CallSession.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.call.CallSession$updateLocalMediaStatusAndSendUpdateMessage$1", f = "CallSession.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332811q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MediaStatus f332813s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MediaStatus mediaStatus, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f332813s = mediaStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return r.this.new e(this.f332813s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332811q;
            if (i12 == 0) {
                C42729a0.b(obj);
                r rVar = r.this;
                A a12 = rVar.f332794d;
                String localUserId = rVar.a().getLocalUserId();
                String userId = rVar.a().getPeerStatus().getUserId();
                MediaSenderState mss = this.f332813s.getMss();
                this.f332811q = 1;
                obj = a12.i(rVar.f332791a, localUserId, userId, mss, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            com.avito.avcalls.signaling.x xVar = (com.avito.avcalls.signaling.x) obj;
            if (!(xVar instanceof x.c)) {
                if (!(xVar instanceof x.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                r.f332790n.a("updateLocalMediaStatusAndSendUpdateMessage", "can't send update, api error=" + ((x.b) xVar), null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CallDirection callDirection, @Y61.k C43238h c43238h, @Y61.k C43238h c43238h2, @Y61.k A a12, @Y61.k V v12, @Y61.k com.avito.avcalls.config.a aVar, @Y61.k com.avito.avcalls.stats.d dVar, @Y61.k Y41.p pVar, @Y61.k CallMetaInfo callMetaInfo) {
        this.f332791a = str;
        this.f332792b = c43238h;
        this.f332793c = c43238h2;
        this.f332794d = a12;
        this.f332795e = aVar;
        this.f332796f = dVar;
        this.f332797g = (kotlin.jvm.internal.H) pVar;
        this.f332799i = new com.avito.avcalls.utils.coroutines.e(c43238h);
        CallState.INSTANCE.getClass();
        this.f332803m = p2.a(new CallState(str, str2, callDirection, InvitingState.Allocating.INSTANCE, new MediaStatus(new MediaSenderState(true, false, false), false), new PeerStatus(str3, "", false, new MediaStatus(new MediaSenderState(true, false, false), false)), z12, false, CameraPosition.FRONT, false, callMetaInfo));
        f332790n.b("init", new Object[0]);
        this.f332798h = new com.avito.avcalls.rtc.q(new com.avito.avcalls.rtc.g(c43238h, str, v12.f332636b.f332870b, v12.f332635a, z12, v12.f332639e, v12.f332637c, v12.f332638d));
        C43259k.d(c43238h, null, null, new C36206l(this, null), 3);
        C43259k.d(c43238h, null, null, new C36207m(this, null), 3);
        C43259k.d(c43238h, null, null, new C36208n(this, null), 3);
        C43259k.d(c43238h, null, null, new C36209o(z12, this, null), 3);
        C43259k.d(c43238h, null, null, new C36210p(z12, this, null), 3);
        C43259k.d(c43238h, null, null, new C36211q(this, null), 3);
    }

    @Y61.k
    public final CallState a() {
        return this.f332803m.getValue();
    }

    @Y61.k
    public final InvitingState b() {
        return a().getInvitingState();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.p, kotlin.jvm.internal.H] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.avito.avcalls.call.C36212s
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.avcalls.call.s r0 = (com.avito.avcalls.call.C36212s) r0
            int r1 = r0.f332819v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f332819v = r1
            goto L18
        L13:
            com.avito.avcalls.call.s r0 = new com.avito.avcalls.call.s
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f332817t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f332819v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.f332816s
            long r3 = r0.f332815r
            com.avito.avcalls.call.r r0 = r0.f332814q
            kotlin.C42729a0.b(r12)
            r9 = r1
            r2 = r3
            r4 = r9
            goto L7c
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.C42729a0.b(r12)
            com.avito.avcalls.config.a r12 = r11.f332795e
            boolean r12 = r12.getF332858i()
            if (r12 != 0) goto L48
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        L48:
            java.lang.Long r12 = r11.f332800j
            if (r12 == 0) goto L9e
            long r4 = r12.longValue()
            java.lang.Long r12 = r11.f332801k
            if (r12 == 0) goto L9b
            long r6 = r12.longValue()
            r0.f332814q = r11
            r0.f332815r = r4
            r0.f332816s = r6
            r0.f332819v = r3
            com.avito.avcalls.rtc.q r12 = r11.f332798h
            com.avito.avcalls.utils.logs.a r2 = r12.F()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = "getStatsReport"
            r2.b(r8, r3)
            com.avito.avcalls.rtc.g r12 = r12.f333215b
            com.avito.avcalls.rtc.peer_connection.a r12 = r12.f333144h
            java.lang.Object r12 = com.avito.avcalls.rtc.peer_connection.h.a(r12, r0)
            if (r12 != r1) goto L79
            return r1
        L79:
            r0 = r11
            r2 = r4
            r4 = r6
        L7c:
            r6 = r12
            com.avito.avcalls.stats.a r6 = (com.avito.avcalls.stats.a) r6
            com.avito.avcalls.stats.d r1 = r0.f332796f
            java.lang.String r12 = r1.a(r2, r4, r6)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.avito.avcalls.utils.logs.a r2 = com.avito.avcalls.call.r.f332790n
            java.lang.String r3 = "getStatsReportIfNeeded"
            r2.c(r12, r3, r1)
            kotlin.jvm.internal.H r1 = r0.f332797g
            com.avito.avcalls.call.models.CallState r0 = r0.a()
            r1.invoke(r12, r0)
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        L9b:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        L9e:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.r.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public abstract Object d(@Y61.k VoipMessage voipMessage, @Y61.k Continuation<? super G0> continuation);

    public final void e(CallState callState) {
        Z1<CallState> z12 = this.f332803m;
        if (!kotlin.jvm.internal.L.f(z12.getValue(), callState)) {
            f332790n.b("flow.state.set", callState);
        }
        z12.setValue(callState);
    }

    public final void f(@Y61.k InvitingState invitingState) {
        CallState callStateA = a();
        e(callStateA.copy((2039 & 1) != 0 ? callStateA.callId : null, (2039 & 2) != 0 ? callStateA.localUserId : null, (2039 & 4) != 0 ? callStateA.direction : null, (2039 & 8) != 0 ? callStateA.invitingState : invitingState, (2039 & 16) != 0 ? callStateA.localMediaStatus : null, (2039 & 32) != 0 ? callStateA.peerStatus : null, (2039 & 64) != 0 ? callStateA.isVideo : false, (2039 & 128) != 0 ? callStateA.videoTxAllowed : false, (2039 & 256) != 0 ? callStateA.defaultCamera : null, (2039 & 512) != 0 ? callStateA.defaultCameraEnabled : false, (2039 & 1024) != 0 ? callStateA.callMetaInfo : null));
    }

    public final void g(long j12, @Y61.k TerminateReason terminateReason) {
        f332790n.b("startTerminationTimer", Long.valueOf(j12), terminateReason);
        this.f332799i.a(j12, new d(terminateReason, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@Y61.k com.avito.avcalls.call.models.TerminateReason r9, boolean r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.r.h(com.avito.avcalls.call.models.TerminateReason, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void i(b bVar, boolean z12) {
        MediaSenderState mediaSenderStateCopy$default;
        if (a().getInvitingState() instanceof InvitingState.Terminated) {
            return;
        }
        Object[] objArr = {bVar, Boolean.valueOf(z12)};
        com.avito.avcalls.utils.logs.a aVar = f332790n;
        aVar.b("updateLocalMediaStatusAndSendUpdateMessage", objArr);
        MediaStatus localMediaStatus = a().getLocalMediaStatus();
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            mediaSenderStateCopy$default = MediaSenderState.copy$default(localMediaStatus.getMss(), z12, false, false, 6, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            mediaSenderStateCopy$default = MediaSenderState.copy$default(localMediaStatus.getMss(), false, z12, false, 5, null);
        }
        MediaStatus mediaStatusCopy$default = MediaStatus.copy$default(localMediaStatus, mediaSenderStateCopy$default, false, 2, null);
        if (kotlin.jvm.internal.L.f(mediaStatusCopy$default, a().getLocalMediaStatus())) {
            aVar.c("localMediaStatus was not changed", "updateLocalMediaStatusAndSendUpdateMessage", new Object[0]);
            return;
        }
        aVar.c("newLocalMediaStatus=" + mediaStatusCopy$default, "updateLocalMediaStatusAndSendUpdateMessage", new Object[0]);
        CallState callStateA = a();
        e(callStateA.copy((2039 & 1) != 0 ? callStateA.callId : null, (2039 & 2) != 0 ? callStateA.localUserId : null, (2039 & 4) != 0 ? callStateA.direction : null, (2039 & 8) != 0 ? callStateA.invitingState : null, (2039 & 16) != 0 ? callStateA.localMediaStatus : mediaStatusCopy$default, (2039 & 32) != 0 ? callStateA.peerStatus : null, (2039 & 64) != 0 ? callStateA.isVideo : false, (2039 & 128) != 0 ? callStateA.videoTxAllowed : false, (2039 & 256) != 0 ? callStateA.defaultCamera : null, (2039 & 512) != 0 ? callStateA.defaultCameraEnabled : false, (2039 & 1024) != 0 ? callStateA.callMetaInfo : null));
        C43259k.d(this.f332792b, null, null, new e(mediaStatusCopy$default, null), 3);
    }

    public final void j(@Y61.k VoipMessage voipMessage) {
        Boolean bool;
        Boolean bool2;
        f332790n.b("updateStateFromVoipMessage", voipMessage);
        VoipMessage.MediaSender mediaSender = voipMessage.f333350d;
        MediaSenderState mediaSenderState = mediaSender != null ? new MediaSenderState(mediaSender.f333354a, mediaSender.f333355b, false) : a().getPeerStatus().getMediaStatus().getMss();
        OptionsUpdate optionsUpdate = voipMessage.f333353g;
        boolean videoTxAllowed = (optionsUpdate == null || (bool2 = optionsUpdate.f333336a) == null) ? a().getVideoTxAllowed() : bool2.booleanValue();
        CameraPosition cameraPositionA = AQ0.b.a(optionsUpdate != null ? optionsUpdate.f333337b : null);
        if (cameraPositionA == null) {
            cameraPositionA = a().getDefaultCamera();
        }
        CameraPosition cameraPosition = cameraPositionA;
        boolean defaultCameraEnabled = (optionsUpdate == null || (bool = optionsUpdate.f333338c) == null) ? a().getDefaultCameraEnabled() : bool.booleanValue();
        CallState callStateA = a();
        e(callStateA.copy((2039 & 1) != 0 ? callStateA.callId : null, (2039 & 2) != 0 ? callStateA.localUserId : null, (2039 & 4) != 0 ? callStateA.direction : null, (2039 & 8) != 0 ? callStateA.invitingState : null, (2039 & 16) != 0 ? callStateA.localMediaStatus : null, (2039 & 32) != 0 ? callStateA.peerStatus : PeerStatus.copy$default(a().getPeerStatus(), null, null, false, MediaStatus.copy$default(a().getPeerStatus().getMediaStatus(), mediaSenderState, false, 2, null), 7, null), (2039 & 64) != 0 ? callStateA.isVideo : false, (2039 & 128) != 0 ? callStateA.videoTxAllowed : videoTxAllowed, (2039 & 256) != 0 ? callStateA.defaultCamera : cameraPosition, (2039 & 512) != 0 ? callStateA.defaultCameraEnabled : defaultCameraEnabled, (2039 & 1024) != 0 ? callStateA.callMetaInfo : null));
    }
}
