package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.RtcException;
import com.avito.avcalls.android.rtc.Sdp;
import com.avito.avcalls.android.signaling.proto.IceConfig;
import com.avito.avcalls.android.video.CameraPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* compiled from: PCSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/rtc/i;", "Lcom/avito/avcalls/android/rtc/g;", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f331918a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.config.h f331919b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f331920c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<com.avito.avcalls.android.video.x> f331921d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<com.avito.avcalls.android.video.l> f331922e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final wQ0.c f331923f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final w f331924g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final d f331925h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final p f331926i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList<IceCandidate> f331927j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public C36192b f331928k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public A f331929l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final b f331930m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final A f331931n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final n2<SignalingState> f331932o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public z f331933p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public C36193c f331934q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f331935r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final d2<List<IceCandidate>> f331936s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final n2<Boolean> f331937t;

    /* compiled from: PCSession.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/i$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C f331938a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final C f331939b;

        public b(@Y61.k C c12, @Y61.l C c13) {
            this.f331938a = c12;
            this.f331939b = c13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f331938a, bVar.f331938a) && L.f(this.f331939b, bVar.f331939b);
        }

        public final int hashCode() {
            int iHashCode = this.f331938a.hashCode() * 31;
            C c12 = this.f331939b;
            return iHashCode + (c12 == null ? 0 : c12.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "VideoTracksHolder(local=" + this.f331938a + ", remote=" + this.f331939b + ')';
        }
    }

    /* compiled from: PCSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[Sdp.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Sdp.Type.Companion companion = Sdp.Type.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public i(@Y61.k C43238h c43238h, @Y61.k String str, @Y61.k com.avito.avcalls.android.config.h hVar, @Y61.k e eVar, boolean z12, @Y61.k InterfaceC42726C interfaceC42726C, @Y61.k InterfaceC42726C interfaceC42726C2, @Y61.k wQ0.c cVar) throws RtcException.CantCreatePeerConnectionException {
        Object next;
        RtpReceiver receiver;
        this.f331918a = str;
        this.f331919b = hVar;
        this.f331920c = z12;
        this.f331921d = interfaceC42726C;
        this.f331922e = interfaceC42726C2;
        this.f331923f = cVar;
        w wVar = (w) eVar.f331902a.getValue();
        this.f331924g = wVar;
        this.f331925h = new d();
        this.f331927j = new ArrayList<>();
        z.INSTANCE.getClass();
        z zVar = new z(C42784z0.f406748b, false, true, true);
        this.f331933p = zVar;
        wVar.getClass();
        x xVar = new x();
        PeerConnection.RTCConfiguration rTCConfigurationA = zQ0.d.a(zVar);
        PeerConnectionFactory peerConnectionFactory = wVar.f331980b;
        PeerConnection peerConnectionCreatePeerConnection = peerConnectionFactory.createPeerConnection(rTCConfigurationA, xVar);
        if (peerConnectionCreatePeerConnection == null) {
            throw new RtcException.CantCreatePeerConnectionException();
        }
        this.f331926i = new p(str, peerConnectionCreatePeerConnection, wVar.f331979a);
        e2 e2Var = xVar.f331982b;
        n nVar = new n(new l(e2Var));
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411432b;
        this.f331937t = C43175k.U(nVar, c43238h, i2Var, Boolean.FALSE);
        this.f331936s = C43175k.S(com.avito.avcalls.android.utils.coroutines.g.a(new o(new m(e2Var)), hVar.getF331663k()), c43238h, i2Var, 0);
        this.f331932o = p2.a(SignalingState.f331896g);
        C c12 = null;
        C43259k.d(c43238h, null, null, new h(xVar, this, null), 3);
        if (z12) {
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("PCSession", "createVideoTrack(): id=selfVideo");
            C c13 = new C(peerConnectionFactory.createVideoTrack("selfVideo", ((com.avito.avcalls.android.video.x) interfaceC42726C.getValue()).f332534a));
            RtpSender rtpSenderAddTrack = peerConnectionCreatePeerConnection.addTrack(c13.f331870a, C42745f0.j("localMediaStream"));
            this.f331931n = rtpSenderAddTrack != null ? new A(rtpSenderAddTrack, c13.a().id()) : null;
            g.Companion.c("PCSession", "createRemoteVideoTrack()");
            Iterator<T> it = peerConnectionCreatePeerConnection.getTransceivers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((RtpTransceiver) next).getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                        break;
                    }
                }
            }
            RtpTransceiver rtpTransceiver = (RtpTransceiver) next;
            MediaStreamTrack mediaStreamTrackTrack = (rtpTransceiver == null || (receiver = rtpTransceiver.getReceiver()) == null) ? null : receiver.track();
            VideoTrack videoTrack = mediaStreamTrackTrack instanceof VideoTrack ? (VideoTrack) mediaStreamTrackTrack : null;
            C c14 = videoTrack == null ? null : new C(videoTrack);
            if (c14 == null) {
                g.Companion.b(com.avito.avcalls.android.logger.g.INSTANCE, "PCSession", "createRemoteVideoTrack(): unable to receive remote video track");
            } else {
                c12 = c14;
            }
            this.f331930m = new b(c13, c12);
        } else {
            this.f331930m = null;
            this.f331931n = null;
        }
        wQ0.c cVar2 = this.f331923f;
        String str2 = this.f331926i.f331968a;
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "registerClient id=".concat(str2);
        companion.getClass();
        g.Companion.c("AudioDeviceController", strConcat);
        cVar2.f441435c.put(str2, Boolean.TRUE);
    }

    public final void a() {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String str = "addLocalAudioTrack(): localAudioTrack=" + this.f331928k;
        companion.getClass();
        g.Companion.c("PCSession", str);
        if (this.f331928k != null) {
            return;
        }
        d dVar = new d();
        w wVar = this.f331924g;
        C36192b c36192b = new C36192b(wVar.f331980b.createAudioTrack("selfAudio", wVar.f331980b.createAudioSource(dVar.f331901a)));
        RtpSender rtpSenderAddTrack = this.f331926i.f331969b.addTrack(c36192b.f331899a, C42745f0.j("localMediaStream"));
        this.f331929l = rtpSenderAddTrack != null ? new A(rtpSenderAddTrack, c36192b.a().id()) : null;
        this.f331928k = c36192b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k com.avito.avcalls.android.rtc.Sdp r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.avcalls.android.rtc.j
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.avcalls.android.rtc.j r0 = (com.avito.avcalls.android.rtc.j) r0
            int r1 = r0.f331943t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331943t = r1
            goto L18
        L13:
            com.avito.avcalls.android.rtc.j r0 = new com.avito.avcalls.android.rtc.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f331941r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f331943t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f331940q
            com.avito.avcalls.android.rtc.Sdp r7 = (com.avito.avcalls.android.rtc.Sdp) r7
            kotlin.C42729a0.b(r8)
            goto Lac
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f331940q
            com.avito.avcalls.android.rtc.i r7 = (com.avito.avcalls.android.rtc.i) r7
            kotlin.C42729a0.b(r8)
            goto L9c
        L44:
            java.lang.Object r7 = r0.f331940q
            com.avito.avcalls.android.rtc.i r7 = (com.avito.avcalls.android.rtc.i) r7
            kotlin.C42729a0.b(r8)
            goto L6c
        L4c:
            kotlin.C42729a0.b(r8)
            com.avito.avcalls.android.logger.g$a r8 = com.avito.avcalls.android.logger.g.INSTANCE
            r8.getClass()
            java.lang.String r8 = "PCSession"
            java.lang.String r2 = "createAnswer()"
            com.avito.avcalls.android.logger.g.Companion.c(r8, r2)
            r6.a()
            r0.f331940q = r6
            r0.f331943t = r5
            com.avito.avcalls.android.rtc.p r8 = r6.f331926i
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r7 = r6
        L6c:
            com.avito.avcalls.android.rtc.p r8 = r7.f331926i
            r0.f331940q = r7
            r0.f331943t = r4
            r8.getClass()
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4)
            com.avito.avcalls.android.rtc.q r4 = new com.avito.avcalls.android.rtc.q
            r4.<init>(r2)
            com.avito.avcalls.android.rtc.d r5 = r7.f331925h
            org.webrtc.MediaConstraints r5 = r5.f331901a
            org.webrtc.PeerConnection r8 = r8.f331969b
            r8.createAnswer(r4, r5)
            java.lang.Object r8 = r2.getOrThrow()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto L99
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L99:
            if (r8 != r1) goto L9c
            return r1
        L9c:
            com.avito.avcalls.android.rtc.Sdp r8 = (com.avito.avcalls.android.rtc.Sdp) r8
            com.avito.avcalls.android.rtc.p r7 = r7.f331926i
            r0.f331940q = r8
            r0.f331943t = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto Lab
            return r1
        Lab:
            r7 = r8
        Lac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.rtc.i.b(com.avito.avcalls.android.rtc.Sdp, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.avcalls.android.rtc.k
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.avcalls.android.rtc.k r0 = (com.avito.avcalls.android.rtc.k) r0
            int r1 = r0.f331947t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331947t = r1
            goto L18
        L13:
            com.avito.avcalls.android.rtc.k r0 = new com.avito.avcalls.android.rtc.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f331945r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f331947t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f331944q
            com.avito.avcalls.android.rtc.Sdp r0 = (com.avito.avcalls.android.rtc.Sdp) r0
            kotlin.C42729a0.b(r7)
            goto L93
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f331944q
            com.avito.avcalls.android.rtc.i r2 = (com.avito.avcalls.android.rtc.i) r2
            kotlin.C42729a0.b(r7)
            goto L83
        L40:
            kotlin.C42729a0.b(r7)
            com.avito.avcalls.android.logger.g$a r7 = com.avito.avcalls.android.logger.g.INSTANCE
            r7.getClass()
            java.lang.String r7 = "PCSession"
            java.lang.String r2 = "createOffer()"
            com.avito.avcalls.android.logger.g.Companion.c(r7, r2)
            r6.a()
            r0.f331944q = r6
            r0.f331947t = r4
            com.avito.avcalls.android.rtc.p r7 = r6.f331926i
            r7.getClass()
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4)
            com.avito.avcalls.android.rtc.r r4 = new com.avito.avcalls.android.rtc.r
            r4.<init>(r2)
            com.avito.avcalls.android.rtc.d r5 = r6.f331925h
            org.webrtc.MediaConstraints r5 = r5.f331901a
            org.webrtc.PeerConnection r7 = r7.f331969b
            r7.createOffer(r4, r5)
            java.lang.Object r7 = r2.getOrThrow()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r2) goto L7f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L7f:
            if (r7 != r1) goto L82
            return r1
        L82:
            r2 = r6
        L83:
            com.avito.avcalls.android.rtc.Sdp r7 = (com.avito.avcalls.android.rtc.Sdp) r7
            com.avito.avcalls.android.rtc.p r2 = r2.f331926i
            r0.f331944q = r7
            r0.f331947t = r3
            java.lang.Object r0 = r2.a(r7, r0)
            if (r0 != r1) goto L92
            return r1
        L92:
            r0 = r7
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.rtc.i.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object d(@Y61.k Continuation<? super com.avito.avcalls.android.stats.a> continuation) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("PCSession", "getStatsReport()");
        p pVar = this.f331926i;
        pVar.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        pVar.f331969b.getStats(new s(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final C e(boolean z12) {
        b bVar = this.f331930m;
        if (z12) {
            if (bVar != null) {
                return bVar.f331938a;
            }
            return null;
        }
        if (bVar != null) {
            return bVar.f331939b;
        }
        return null;
    }

    public final void f(boolean z12, @Y61.k CameraPosition cameraPosition) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        StringBuilder sb2 = new StringBuilder("setCameraEnabled(): isEnabled=");
        sb2.append(z12);
        sb2.append(", defaultCamera=");
        sb2.append(cameraPosition);
        sb2.append(", videoTracks=");
        b bVar = this.f331930m;
        sb2.append(bVar);
        String string = sb2.toString();
        companion.getClass();
        g.Companion.c("PCSession", string);
        if (bVar != null) {
            C c12 = bVar.f331938a;
            if (c12.a().enabled() != z12) {
                c12.b(z12);
            }
            InterfaceC42726C<com.avito.avcalls.android.video.l> interfaceC42726C = this.f331922e;
            String str = this.f331918a;
            if (z12) {
                interfaceC42726C.getValue().c(cameraPosition, str);
            } else {
                interfaceC42726C.getValue().b(str);
            }
        }
    }

    public final void g(@Y61.k IceConfig iceConfig) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("PCSession", "setIceConfig(): config=" + iceConfig);
        z zVar = this.f331933p;
        z zVar2 = new z(iceConfig.f332098a, zVar.f331985b, zVar.f331986c, zVar.f331987d);
        p pVar = this.f331926i;
        pVar.getClass();
        pVar.f331969b.setConfiguration(zQ0.d.a(zVar2));
        this.f331933p = zVar2;
    }

    public final void h(@Y61.k List<IceCandidate> list) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        StringBuilder sb2 = new StringBuilder("setRemoteIceCandidates(): signalingState=");
        n2<SignalingState> n2Var = this.f331932o;
        sb2.append(n2Var.getValue());
        sb2.append(", iceCandidates=");
        sb2.append(list);
        String string = sb2.toString();
        companion.getClass();
        g.Companion.c("PCSession", string);
        if (n2Var.getValue() != SignalingState.f331891b) {
            this.f331927j.addAll(list);
            return;
        }
        for (IceCandidate iceCandidate : list) {
            p pVar = this.f331926i;
            pVar.getClass();
            String str = iceCandidate.f331871a;
            if (str == null) {
                str = "";
            }
            pVar.f331969b.addIceCandidate(new org.webrtc.IceCandidate(str, iceCandidate.f331872b, iceCandidate.f331873c));
        }
    }

    @Y61.l
    public final Object i(@Y61.k Sdp sdp, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("PCSession", "setRemoteSdp()");
        int iOrdinal = sdp.f331883a.ordinal();
        if (iOrdinal == 0) {
            throw new UnsupportedOperationException("Unexpected OFFER in setRemoteSdp");
        }
        if (iOrdinal == 1) {
            n2<SignalingState> n2Var = this.f331932o;
            if (n2Var.getValue() == SignalingState.f331892c) {
                Object objB = this.f331926i.b(sdp, (ContinuationImpl) continuation);
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
            }
            g.Companion.c("PCSession", "setRemoteSdp(): Skip setting remote SDP due to signalingState=" + n2Var.getValue());
        }
        return G0.f406611a;
    }

    public final void j(boolean z12) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        StringBuilder sb2 = new StringBuilder("setVideoTxEnabled(): isEnabled=");
        sb2.append(z12);
        sb2.append(", videoTracks=");
        b bVar = this.f331930m;
        sb2.append(bVar);
        sb2.append(", localVideoTrackSender=");
        A a12 = this.f331931n;
        sb2.append(a12);
        String string = sb2.toString();
        companion.getClass();
        g.Companion.c("PCSession", string);
        if (bVar != null) {
            C c12 = bVar.f331938a;
            if (a12 == null) {
                return;
            }
            if (!z12) {
                c12 = null;
            }
            a12.a(c12);
        }
    }
}
