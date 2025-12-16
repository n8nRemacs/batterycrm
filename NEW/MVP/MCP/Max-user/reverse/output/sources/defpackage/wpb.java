package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.SessionDescription;
import org.webrtc.VideoFrame;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

/* loaded from: classes2.dex */
public final class wpb implements je8, c06, lob, dnb {
    public static final Pattern q0 = Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
    public static final Pattern r0 = Pattern.compile("^a=animoji:(\\d+)", 8);
    public static volatile xpb s0 = null;
    public static final usd t0 = new usd(29, false);
    public final Context A;
    public final b7d B;
    public final y6d C;
    public final si1 D;
    public final qi1 E;
    public final l2e F;
    public final lb7 G;
    public final jud H;
    public final j35 I;
    public final d06 J;
    public final boolean K;
    public final String[] L;
    public final String[] M;
    public volatile PeerConnection O;
    public boolean P;
    public MediaConstraints Q;
    public MediaConstraints R;
    public Object S;
    public final WeakReference T;
    public RtpSender U;
    public RtpSender V;
    public RtpSender W;
    public List X;
    public RtpSender Y;
    public final boolean a;
    public ie8 a0;
    public final PeerConnection.IceTransportsType b;
    public final PeerConnection.VpnPreference c;
    public volatile boolean c0;
    public final n2e d;
    public volatile boolean d0;
    public final fa6 e;
    public boolean e0;
    public final boolean f;
    public volatile boolean f0;
    public final boolean g;
    public final boolean h;
    public zpb h0;
    public final boolean i;
    public final za4 i0;
    public final Integer j;
    public final vt3 j0;
    public final Integer k;
    public final h1e k0;
    public final ak l;
    public final boolean l0;
    public boolean m;
    public final float m0;
    public final zi n;
    public final float n0;
    public final boolean o0;
    public final int p0;
    public final boolean s;
    public final xpb t;
    public final Integer u;
    public final rve w;
    public final ove x;
    public final ExecutorService y;
    public final elb z;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public final Handler v = new Handler(Looper.getMainLooper());
    public long N = -1;
    public final ArrayList Z = new ArrayList();
    public boolean b0 = true;
    public volatile boolean g0 = true;

    public wpb(upb upbVar) {
        y6i y6iVar;
        nob nobVar;
        boolean z = false;
        Context applicationContext = upbVar.e.getApplicationContext();
        this.A = applicationContext;
        b7d b7dVar = upbVar.f;
        this.B = b7dVar;
        y6d y6dVar = upbVar.g;
        this.C = y6dVar;
        si1 si1Var = upbVar.d;
        this.D = si1Var;
        qi1 qi1Var = si1Var.z;
        this.E = qi1Var;
        this.t = new xpb(si1Var.B, 5, y6dVar);
        rve rveVar = upbVar.a;
        this.w = rveVar;
        ExecutorService executorService = rveVar != null ? rveVar.a : upbVar.c;
        this.y = executorService;
        this.K = upbVar.n;
        this.L = upbVar.o;
        this.M = upbVar.p;
        this.s = upbVar.A;
        this.u = upbVar.B;
        this.z = executorService == null ? new elb(b7dVar) : null;
        this.x = upbVar.b;
        this.G = new lb7(y6dVar, b7dVar);
        y6i y6iVar2 = upbVar.w;
        if (upbVar.G != null) {
            this.T = new WeakReference(upbVar.G);
        }
        if (upbVar.h) {
            Object nudVar = si1Var.y.c.b ? new nud(0, y6iVar2) : new b6a(28);
            vhb vhbVar = new vhb(6, false);
            vhbVar.c = nudVar;
            vhbVar.b = y6dVar;
            this.H = new jud(vhbVar);
        } else {
            this.H = null;
        }
        if (upbVar.i) {
            wib wibVar = new wib(6);
            wibVar.b = null;
            wibVar.c = null;
            wibVar.b = new jdc(y6iVar2, y6dVar);
            wibVar.c = y6dVar;
            this.I = new j35(wibVar);
        } else {
            this.I = null;
        }
        this.l0 = qi1Var.b;
        this.m0 = qi1Var.c;
        this.n0 = qi1Var.d;
        Future futureSubmit = (executorService == null || rveVar == null) ? null : executorService.submit(new tv0(9, rveVar));
        if (!upbVar.j || futureSubmit == null) {
            y6iVar = y6iVar2;
            this.d = null;
        } else {
            y6iVar = y6iVar2;
            this.d = new n2e(upbVar.g, y6iVar, futureSubmit, this, upbVar.C);
        }
        if (upbVar.k) {
            fa6 fa6Var = new fa6();
            fa6Var.d = new CopyOnWriteArrayList();
            fa6Var.c = y6iVar;
            this.e = fa6Var;
        } else {
            this.e = null;
        }
        this.m = upbVar.l;
        this.J = new d06(this);
        PeerConnection.IceTransportsType iceTransportsType = upbVar.E;
        this.b = iceTransportsType;
        this.c = upbVar.F;
        if (iceTransportsType == null && upbVar.q) {
            z = true;
        }
        this.a = z;
        this.f = upbVar.s;
        this.h = upbVar.t;
        this.g = upbVar.u;
        this.i = upbVar.v;
        ni1 ni1Var = si1Var.B;
        if (ni1Var != null) {
            this.j = ni1Var.h;
            this.k = ni1Var.g;
        } else {
            this.j = null;
            this.k = null;
        }
        if (upbVar.r) {
            this.j0 = new inb(new awd(10, this), y6dVar, new ppb(this), y6iVar);
        } else {
            this.j0 = new ap4(new awd(10, this), y6dVar, new ppb(this), y6iVar);
        }
        this.l = upbVar.x;
        this.n = upbVar.y;
        this.p0 = upbVar.H;
        this.F = upbVar.z;
        if (rveVar != null && (nobVar = rveVar.j) != null) {
            nobVar.d.add(this);
        }
        this.i0 = new za4(rveVar, applicationContext, si1Var, y6dVar);
        this.k0 = upbVar.D;
        this.o0 = upbVar.m;
    }

    public static void C(Context context, xpb xpbVar, NativeLibraryLoader nativeLibraryLoader) {
        if (s0 == null) {
            y6d y6dVar = (y6d) xpbVar.c;
            if (y6dVar != null) {
                usd usdVar = t0;
                usdVar.getClass();
                usdVar.b = new WeakReference(y6dVar);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(t0, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
            s0 = xpbVar;
        }
    }

    public static boolean D() {
        return (s0 == null ? new ypb(true, true, null, null, null, false, false, true, false, false, false, null) : (ypb) s0.b).g;
    }

    public static boolean E(boolean z) {
        ypb ypbVar = s0 == null ? new ypb(true, true, null, null, null, false, false, true, false, false, false, null) : (ypb) s0.b;
        return z ? ypbVar.h : ypbVar.i;
    }

    public static LinkedList f(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            linkedList.add(str);
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final jud A() {
        jud judVar = this.H;
        if (judVar != null) {
            return judVar;
        }
        throw new IllegalStateException("Command executor is not enabled");
    }

    public final PeerConnection.IceConnectionState B() {
        PeerConnection peerConnection = this.O;
        if (peerConnection == null) {
            return null;
        }
        try {
            return peerConnection.iceConnectionState();
        } catch (Exception e) {
            this.C.reportException("PCRTCClient", "pc.conn.state", e);
            return null;
        }
    }

    public final boolean F() {
        return (this.c0 || this.d0 || this.O == null) ? false : true;
    }

    public final void G() {
        ie8 ie8Var = this.a0;
        if (ie8Var != null) {
            this.C.log("PCRTCClient", "maybeUpdateSenders, " + this + ", " + w0a.c(ie8Var));
            if (H() != null) {
                RtpSender rtpSender = this.V;
                RtpSender rtpSender2 = this.U;
                ie8Var.n.log("OKRTCLmsAdapter", "bindTracksWith, " + ie8Var + ", audio sender=" + w0a.c(rtpSender) + " & video sender= " + w0a.c(rtpSender2));
                ie8Var.i.t(rtpSender);
                if (ie8Var.f.d) {
                    ie8Var.y.t(rtpSender2);
                }
            }
        }
    }

    public final PeerConnection H() {
        if (this.O != null && !this.c0 && !this.P) {
            return this.O;
        }
        StringBuilder sb = new StringBuilder();
        if (this.O == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.P) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        if (this.c0) {
            this.C.log("PCRTCClient", this + ": (closed) " + ((Object) sb));
            return null;
        }
        this.C.log("PCRTCClient", this + ": (unclosed null peer connection) " + ((Object) sb));
        return null;
    }

    public final void I(IceCandidate[] iceCandidateArr) {
        this.C.log("PCRTCClient", "removeRemoteIceCandidates, " + this);
        i(new c(this, new eu3(2, iceCandidateArr), 0), "removeRemoteIceCandidates");
    }

    public final void J(zpb zpbVar) {
        if (zpbVar == null || zpbVar.equals(this.h0)) {
            return;
        }
        zpb zpbVar2 = this.h0;
        boolean z = (zpbVar2 == null || Objects.equals(zpbVar2.i, zpbVar.i)) ? false : true;
        this.h0 = zpbVar;
        this.i0.j = zpbVar;
        this.C.log("PCRTCClient", "setPeerVideoSettings, " + this + " settings=" + zpbVar.toString());
        i(new c(this, new npb(this, z, 1), 0), "setPeerVideoSettings");
    }

    public final void K(SessionDescription sessionDescription) {
        this.C.log("PCRTCClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.g0 = false;
        this.f0 = false;
        lb7 lb7Var = this.G;
        if (lb7Var.e == 0) {
            lb7Var.e = SystemClock.elapsedRealtime();
        }
        i(new c(this, new lpb(this, sessionDescription, 1), 0), "setRemoteDescription");
    }

    @Override // defpackage.dnb
    public final void a(ti1 ti1Var, VideoFrame videoFrame) {
        final ti1 ti1Var2;
        final l2e l2eVar = this.F;
        if (l2eVar != null) {
            final long msSinceBoot = l2eVar.b.getMsSinceBoot();
            final Size size = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            ti1Var2 = ti1Var;
            u0e.a().b(new Runnable() { // from class: k2e
                @Override // java.lang.Runnable
                public final void run() {
                    l2e l2eVar2 = l2eVar;
                    ti1 ti1Var3 = ti1Var2;
                    Size size2 = size;
                    long j = msSinceBoot;
                    synchronized (l2eVar2) {
                        if (l2eVar2.d.contains(ti1Var3)) {
                            return;
                        }
                        Long l = (Long) l2eVar2.c.get(ti1Var3);
                        if (l != null) {
                            de.a().b(new nh2(l2eVar2, j - l.longValue(), to8.j(new imb("width", EventItemValueKt.toEventItemValue(size2.getWidth())), new imb("height", EventItemValueKt.toEventItemValue(size2.getHeight()))), 4));
                            l2eVar2.c.remove(ti1Var3);
                            l2eVar2.d.add(ti1Var3);
                        }
                    }
                }
            });
        } else {
            ti1Var2 = ti1Var;
        }
        this.j0.a(ti1Var2, videoFrame);
    }

    @Override // defpackage.je8
    public final void b(ie8 ie8Var) {
        this.C.log("PCRTCClient", "onLocalMediaStreamChanged, " + this + " ms=" + w0a.c(ie8Var));
        final org.webrtc.Size sizeH = ie8Var.h();
        i1e i1eVar = ie8Var.t;
        final int i = i1eVar != null ? i1eVar.g : 0;
        i1e i1eVar2 = ie8Var.t;
        final int i2 = i1eVar2 != null ? i1eVar2.f : 0;
        i(new c(this, new hu3() { // from class: jpb
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                PeerConnection peerConnection = (PeerConnection) obj;
                wpb wpbVar = this.a;
                za4 za4Var = wpbVar.i0;
                wpbVar.G();
                org.webrtc.Size size = sizeH;
                int i3 = size.width;
                int i4 = size.height;
                if (wpbVar.q != i3 || wpbVar.r != i4) {
                    za4Var.f = i4;
                    za4Var.c = i3;
                    y6d y6dVar = wpbVar.C;
                    StringBuilder sb = new StringBuilder("Camera video size changed: ");
                    sb.append(wpbVar.q);
                    sb.append("x");
                    hf3.g(sb, wpbVar.r, " -> ", i3, "x");
                    sb.append(i4);
                    y6dVar.log("PCRTCClient", sb.toString());
                    wpbVar.q = i3;
                    wpbVar.r = i4;
                    wpbVar.u(peerConnection, false);
                }
                int i5 = wpbVar.o;
                int i6 = i;
                int i7 = i2;
                if (i5 == i6 && wpbVar.p == i7) {
                    return;
                }
                za4Var.g = i6;
                za4Var.h = i7;
                wpbVar.o = i6;
                wpbVar.p = i7;
                wpbVar.l(peerConnection, false);
            }
        }, 0), "maybeUpdateSenders");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vpb] */
    @Override // defpackage.c06
    public final void c(long j) {
        ?? r02 = this.S;
        if (r02 != 0) {
            r02.m(this, j);
        }
    }

    public final ae4 d(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel dataChannelCreateDataChannel = this.O.createDataChannel(str, init);
        y6d y6dVar = this.C;
        StringBuilder sbN = az1.n("DATACH create data channel: name: ", str, ", id: ");
        sbN.append(dataChannelCreateDataChannel.id());
        y6dVar.log("PCRTCClient", sbN.toString());
        return new ae4(dataChannelCreateDataChannel, this.C);
    }

    public final String e(String str, boolean z) {
        String string;
        LinkedList<String> linkedListF = f(this.L);
        LinkedList<String> linkedListF2 = f(this.M);
        StringBuilder sb = new StringBuilder("applyPreferCodec, local=");
        sb.append(z);
        sb.append(", filter=");
        boolean z2 = this.K;
        sb.append(z2);
        sb.append(", video=[");
        String string2 = "null";
        if (linkedListF2 == null) {
            string = "null";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : linkedListF2) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(str2);
            }
            string = sb2.toString();
        }
        sb.append(string);
        sb.append("], audio=[");
        if (linkedListF != null) {
            StringBuilder sb3 = new StringBuilder();
            for (String str3 : linkedListF) {
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(str3);
            }
            string2 = sb3.toString();
        }
        sb.append(string2);
        sb.append("]");
        String string3 = sb.toString();
        y6d y6dVar = this.C;
        y6dVar.log("PCRTCClient", string3);
        String strG = t4j.g(str, z2, linkedListF, linkedListF2, y6dVar);
        if (!str.equals(strG)) {
            try {
                y6dVar.log("PCRTCClient", "applyPreferCodec, local=" + z + ", description before=[" + str.replace("\r\n", "\\r\\n") + "]");
                y6dVar.log("PCRTCClient", "applyPreferCodec, local=" + z + ", description after=[" + strG.replace("\r\n", "\\r\\n") + "]");
                return strG;
            } catch (Throwable th) {
                y6dVar.reportException("PCRTCClient", "applyPreferCodec, failed to log sdp difference", th);
            }
        }
        return strG;
    }

    public final PeerConnection.RTCConfiguration g(List list) {
        PeerConnection.IceTransportsType iceTransportsType;
        ArrayList arrayList = new ArrayList();
        this.D.getClass();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str == null || iceServer.password == null || iceServer.username == null) {
                throw new NullPointerException(iceServer.toString());
            }
            if (str.startsWith("turn")) {
                if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                    arrayList.add(iceServer);
                    if (i > 0) {
                        arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                        i--;
                    }
                    z = true;
                }
            } else if (iceServer.uri.startsWith("stun")) {
                arrayList.add(iceServer);
                z2 = true;
            }
        }
        y6d y6dVar = this.C;
        if (!z || !z2) {
            y6dVar.log("PCRTCClient", this + ": stun or turn servers are absent");
        }
        y6dVar.log("PCRTCClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        if (this.a) {
            iceTransportsType = PeerConnection.IceTransportsType.RELAY;
        } else {
            iceTransportsType = this.b;
            if (iceTransportsType == null) {
                iceTransportsType = PeerConnection.IceTransportsType.ALL;
            }
        }
        rTCConfiguration.iceTransportsType = iceTransportsType;
        PeerConnection.VpnPreference vpnPreference = this.c;
        if (vpnPreference != null) {
            rTCConfiguration.vpnPreference = vpnPreference;
        }
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.suspendBelowMinBitrate = this.s;
        Integer num = this.u;
        if (num != null) {
            rTCConfiguration.audioJitterBufferMaxPackets = num.intValue();
            y6dVar.log("PCRTCClient", "Jitter buffer size set to " + rTCConfiguration.audioJitterBufferMaxPackets);
        }
        return rTCConfiguration;
    }

    public final void h(kda kdaVar) {
        j(kdaVar.b);
        i(new kpb(this, kdaVar, 0), "handleSdpCreateFailure");
    }

    public final void i(Runnable runnable, String str) {
        ExecutorService executorService = this.y;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        elb elbVar = this.z;
        elbVar.getClass();
        elbVar.a.execute(new w9i(elbVar, str, runnable));
    }

    public final void j(String str) {
        this.C.log("PCRTCClient", "handleSdpCreateFailure, " + this + ", error=" + str);
        i(new ipb(this, str, 1), "handleSdpCreateFailure");
    }

    public final void k(String str, String str2) {
        this.C.reportException("PCRTCClient", wy1.i("reportError, ", str, " ", str2), new Exception(wy1.h("peer.connection.error.", str)));
        i(new gpb(this, 3), "reportError");
    }

    public final void l(PeerConnection peerConnection, boolean z) {
        y6d y6dVar = this.C;
        try {
            m(peerConnection, z, true, this.Y);
        } catch (IllegalStateException e) {
            y6dVar.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            y6dVar.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(org.webrtc.PeerConnection r27, boolean r28, boolean r29, org.webrtc.RtpSender r30) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpb.m(org.webrtc.PeerConnection, boolean, boolean, org.webrtc.RtpSender):void");
    }

    public final void n(SessionDescription sessionDescription) {
        this.C.log("PCRTCClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        i(new c(this, new lpb(this, sessionDescription, 0), 0), "handleSdpCreateSuccess");
    }

    public final void o(final SessionDescription sessionDescription, final boolean z) {
        this.C.log("PCRTCClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z);
        i(new c(this, new hu3() { // from class: opb
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                final wpb wpbVar = this.a;
                Handler handler = wpbVar.v;
                boolean z2 = z;
                final SessionDescription sessionDescription2 = sessionDescription;
                if (z2) {
                    final int i = 0;
                    handler.post(new Runnable() { // from class: rpb
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vpb] */
                        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, vpb] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    wpb wpbVar2 = wpbVar;
                                    d06 d06Var = wpbVar2.J;
                                    SessionDescription sessionDescription3 = sessionDescription2;
                                    String str = sessionDescription3.description;
                                    if (d06Var.c) {
                                        d06Var.b = 0L;
                                        d06Var.a = 0L;
                                        d06Var.c = false;
                                    }
                                    long jA = d06.a(str);
                                    d06Var.b = jA;
                                    if (jA != 0) {
                                        long j = d06Var.a;
                                        if (j != 0) {
                                            d06Var.c = true;
                                            d06Var.d.c(jA ^ j);
                                        }
                                    }
                                    ?? r1 = wpbVar2.S;
                                    if (r1 != 0) {
                                        r1.k(wpbVar2, sessionDescription3);
                                        break;
                                    }
                                    break;
                                default:
                                    wpb wpbVar3 = wpbVar;
                                    d06 d06Var2 = wpbVar3.J;
                                    SessionDescription sessionDescription4 = sessionDescription2;
                                    String str2 = sessionDescription4.description;
                                    if (d06Var2.c) {
                                        d06Var2.b = 0L;
                                        d06Var2.a = 0L;
                                        d06Var2.c = false;
                                    }
                                    long jA2 = d06.a(str2);
                                    d06Var2.a = jA2;
                                    long j2 = d06Var2.b;
                                    if (j2 != 0 && jA2 != 0) {
                                        d06Var2.c = true;
                                        d06Var2.d.c(jA2 ^ j2);
                                    }
                                    ?? r12 = wpbVar3.S;
                                    if (r12 != 0) {
                                        r12.a(wpbVar3, sessionDescription4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    final int i2 = 1;
                    handler.post(new Runnable() { // from class: rpb
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vpb] */
                        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, vpb] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    wpb wpbVar2 = wpbVar;
                                    d06 d06Var = wpbVar2.J;
                                    SessionDescription sessionDescription3 = sessionDescription2;
                                    String str = sessionDescription3.description;
                                    if (d06Var.c) {
                                        d06Var.b = 0L;
                                        d06Var.a = 0L;
                                        d06Var.c = false;
                                    }
                                    long jA = d06.a(str);
                                    d06Var.b = jA;
                                    if (jA != 0) {
                                        long j = d06Var.a;
                                        if (j != 0) {
                                            d06Var.c = true;
                                            d06Var.d.c(jA ^ j);
                                        }
                                    }
                                    ?? r1 = wpbVar2.S;
                                    if (r1 != 0) {
                                        r1.k(wpbVar2, sessionDescription3);
                                        break;
                                    }
                                    break;
                                default:
                                    wpb wpbVar3 = wpbVar;
                                    d06 d06Var2 = wpbVar3.J;
                                    SessionDescription sessionDescription4 = sessionDescription2;
                                    String str2 = sessionDescription4.description;
                                    if (d06Var2.c) {
                                        d06Var2.b = 0L;
                                        d06Var2.a = 0L;
                                        d06Var2.c = false;
                                    }
                                    long jA2 = d06.a(str2);
                                    d06Var2.a = jA2;
                                    long j2 = d06Var2.b;
                                    if (j2 != 0 && jA2 != 0) {
                                        d06Var2.c = true;
                                        d06Var2.d.c(jA2 ^ j2);
                                    }
                                    ?? r12 = wpbVar3.S;
                                    if (r12 != 0) {
                                        r12.a(wpbVar3, sessionDescription4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        }, 0), "handleSdpSetSuccess");
    }

    public final void p(SessionDescription sessionDescription, boolean z, String str) {
        String str2 = "handleSdpSetFailure " + sessionDescription.type + " " + z + " " + sessionDescription.description;
        y6d y6dVar = this.C;
        y6dVar.log("PCRTCClient", str2);
        y6dVar.reportException("PCRTCClient", ho7.l(new StringBuilder("set."), z ? "local" : "remote", ".sdp.failed"), new Exception(str));
        i(new ipb(this, str, 0), "onSetFailure");
    }

    public final void q(boolean z) {
        nob nobVar;
        this.c0 = true;
        this.g0 = false;
        this.f0 = false;
        this.S = null;
        this.j0.f();
        rve rveVar = this.w;
        if (rveVar != null && (nobVar = rveVar.j) != null) {
            nobVar.d.remove(this);
        }
        this.v.removeCallbacksAndMessages(null);
        if (z) {
            i(new gpb(this, 7), "releaseInternal");
        } else {
            i(new gpb(this, 1), "closeInternal");
        }
    }

    public final void r() throws InterruptedException {
        ae4 ae4Var;
        this.C.log("PCRTCClient", "closeInternal, " + this);
        Object obj = null;
        this.V = null;
        this.U = null;
        this.W = null;
        this.Y = null;
        ie8 ie8Var = this.a0;
        if (ie8Var != null) {
            if (ie8Var.v == this) {
                ie8Var.v = null;
                q2e q2eVar = ie8Var.u;
                if (q2eVar != null) {
                    q2eVar.b.c(new d8c(q2eVar, 29, obj));
                }
            }
            this.a0.c.remove(this);
            this.a0 = null;
        }
        jud judVar = this.H;
        if (judVar != null) {
            Handler handler = judVar.f;
            if (judVar.j.compareAndSet(false, true)) {
                judVar.g.removeCallbacksAndMessages(null);
                handler.removeCallbacksAndMessages(null);
                handler.post(new awa(23, judVar));
                judVar.e.quitSafely();
            }
        }
        j35 j35Var = this.I;
        if (j35Var != null) {
            Handler handler2 = (Handler) j35Var.X;
            if (((AtomicBoolean) j35Var.Z).compareAndSet(false, true)) {
                handler2.removeCallbacksAndMessages(null);
                handler2.post(new awa(24, j35Var));
                ((HandlerThread) j35Var.o).quitSafely();
            }
        }
        fa6 fa6Var = this.e;
        if (fa6Var != null && (ae4Var = (ae4) fa6Var.a) != null) {
            p8i p8iVar = (p8i) fa6Var.b;
            if (p8iVar != null) {
                ae4Var.c(p8iVar);
            }
            fa6Var.a = null;
            fa6Var.b = null;
        }
        jud judVar2 = this.H;
        if (judVar2 != null) {
            try {
                judVar2.e.join(500L);
            } catch (InterruptedException e) {
                this.C.reportException("PCRTCClient", "command.exec.shutdown", e);
            }
        }
        j35 j35Var2 = this.I;
        if (j35Var2 != null) {
            try {
                ((HandlerThread) j35Var2.o).join(500);
            } catch (InterruptedException e2) {
                this.C.reportException("PCRTCClient", "notif.recv.shutdown", e2);
            }
        }
        n2e n2eVar = this.d;
        if (n2eVar != null) {
            n2eVar.f = true;
            for (b9i b9iVar : n2eVar.a.values()) {
                if (b9iVar != null) {
                    b9iVar.a();
                }
            }
            ae4 ae4Var2 = n2eVar.d;
            if (ae4Var2 != null) {
                p8i p8iVar2 = n2eVar.g;
                if (p8iVar2 != null) {
                    ae4Var2.c(p8iVar2);
                }
                n2eVar.d = null;
                n2eVar.g = null;
            }
        }
        zi ziVar = this.n;
        if (ziVar != null) {
            ae4 ae4Var3 = ziVar.c;
            if (ae4Var3 != null) {
                ae4Var3.c(ziVar);
            }
            ziVar.c = null;
        }
        ak akVar = this.l;
        if (akVar != null) {
            akVar.d();
        }
        ak akVar2 = this.l;
        if (akVar2 != null) {
            akVar2.d();
        }
        zi ziVar2 = this.n;
        if (ziVar2 != null) {
            ae4 ae4Var4 = ziVar2.c;
            if (ae4Var4 != null) {
                ae4Var4.c(ziVar2);
            }
            ziVar2.c = null;
        }
        if (this.O != null) {
            this.O.dispose();
            this.C.log("PCRTCClient", this + ": " + w0a.c(this.O) + " was disposed");
            this.O = null;
        }
        this.C.log("PCRTCClient", this + ": " + w0a.c(this) + " was closed");
    }

    public final void s(IceCandidate iceCandidate) {
        this.C.log("PCRTCClient", "addRemoteIceCandidate, " + this);
        i(new c(this, new mpb(this, iceCandidate, 0), 0), "addRemoteIceCandidate");
    }

    public final void t(r8a r8aVar) {
        h1e h1eVar = this.k0;
        if (h1eVar == null) {
            this.C.reportException("PCRTCClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
            return;
        }
        boolean z = r8aVar.b;
        if (z != this.e0) {
            this.e0 = z;
            i(new se5(this, r8aVar, h1eVar, 27), "screenCaptureEnable");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = w0a.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('@');
        sb.append("SendReceive");
        sb.append("PeerConnection@");
        PeerConnection peerConnection = this.O;
        sb.append(peerConnection != null ? Integer.toString(System.identityHashCode(peerConnection)) : "Ø");
        return sb.toString();
    }

    public final void u(PeerConnection peerConnection, boolean z) {
        y6d y6dVar = this.C;
        try {
            m(peerConnection, z, false, this.U);
        } catch (IllegalStateException e) {
            y6dVar.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            y6dVar.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void v(PeerConnection peerConnection) {
        xpb xpbVar = this.t;
        xpbVar.getClass();
        int iU = xpbVar.u(this.Y) + xpbVar.u(this.U) + xpbVar.u(this.W) + xpbVar.u(this.V);
        peerConnection.setBitrate(6000, null, Integer.valueOf(iU));
        this.C.log("PCRTCClient", "Bitrate constraints were set to [6000:" + iU + "]");
    }

    public final void w() {
        this.C.log("PCRTCClient", "createAnswer, " + this);
        this.g0 = false;
        i(new c(this, new hpb(this, 1), 0), "createAnswer");
    }

    public final void x(boolean z) {
        this.C.log("PCRTCClient", "createOffer, " + this + " iceRestart=" + z);
        if (z) {
            this.v.post(new gpb(this, 0));
        }
        this.g0 = false;
        i(new c(this, new npb(this, z, 0), 0), "createOffer");
    }

    public final void y(List list) {
        if (s0 == null) {
            this.C.log("PCRTCClient", "Creating peer connection without initializing factory.");
            return;
        }
        if (!this.d0) {
            this.d0 = true;
            i(new k79(this, 26, list), "createPeerConnection");
            return;
        }
        this.C.log("PCRTCClient", this + ": creation of a peer connection is already scheduled");
    }

    public final void z() {
        this.C.log("PCRTCClient", "createPeerConnectionInternal, " + this);
        if (this.P) {
            this.C.log("PCRTCClient", this + ": fatal error occurred");
            return;
        }
        PeerConnectionFactory peerConnectionFactory = this.w.d;
        if (peerConnectionFactory == null) {
            this.C.log("PCRTCClient", this + ": no peer connection factory");
            return;
        }
        this.C.log("PCRTCClient", this + ": peer connection constraints: " + this.Q.toString());
        PeerConnection.RTCConfiguration rTCConfigurationG = g(this.X);
        if ((this.z == null || elb.d.get() != elb.c) && this.y == null) {
            this.v.post(new awa(8, new RuntimeException()));
        }
        this.O = peerConnectionFactory.createPeerConnection(rTCConfigurationG, this.Q, new wib(this, 1, new h79(12, this.C)));
        if (this.O == null) {
            throw new IllegalStateException("peerconnection is null");
        }
        ie8 ie8Var = (ie8) this.x.a().b;
        this.a0 = ie8Var;
        boolean z = true;
        if (ie8Var != null) {
            this.C.log("PCRTCClient", this + ": has " + w0a.c(this.a0));
            org.webrtc.Size sizeH = this.a0.h();
            this.q = sizeH.width;
            this.r = sizeH.height;
            i1e i1eVar = this.a0.t;
            this.p = i1eVar != null ? i1eVar.f : 0;
            i1e i1eVar2 = this.a0.t;
            this.o = i1eVar2 != null ? i1eVar2.g : 0;
            za4 za4Var = this.i0;
            za4Var.f = this.r;
            za4Var.c = this.q;
            i1e i1eVar3 = this.a0.t;
            za4Var.h = i1eVar3 != null ? i1eVar3.f : 0;
            za4 za4Var2 = this.i0;
            i1e i1eVar4 = this.a0.t;
            za4Var2.g = i1eVar4 != null ? i1eVar4.g : 0;
            PeerConnection peerConnection = this.O;
            ie8 ie8Var2 = this.a0;
            List<String> listSingletonList = Collections.singletonList(ie8Var2.m);
            m50 m50Var = ie8Var2.i;
            AudioTrack audioTrack = m50Var != null ? (AudioTrack) ((MediaStreamTrack) m50Var.e) : null;
            if (audioTrack != null) {
                xpb xpbVar = this.t;
                RtpSender rtpSenderAddTrack = peerConnection.addTrack(audioTrack, listSingletonList);
                xpbVar.j(rtpSenderAddTrack, MediaStreamTrack.AUDIO_TRACK_KIND);
                this.V = rtpSenderAddTrack;
            }
            VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) ie8Var2.y.e);
            if (videoTrack != null) {
                xpb xpbVar2 = this.t;
                RtpSender rtpSenderAddTrack2 = peerConnection.addTrack(videoTrack, listSingletonList);
                xpbVar2.l(rtpSenderAddTrack2, MediaStreamTrack.VIDEO_TRACK_KIND, 30000, 2048000, null, false);
                this.U = rtpSenderAddTrack2;
            }
            v(peerConnection);
            RtpSender rtpSender = this.U;
            if (this.l0 && rtpSender != null) {
                rtpSender.setVideoEncoderObserver(new os0(this, z));
            }
            this.C.log("PCRTCClient", this + ": " + w0a.c(this.V) + "(audio) created");
            this.C.log("PCRTCClient", this + ": " + w0a.c(this.U) + "(video) created");
            G();
            this.a0.c.add(this);
            if (this.o0) {
                ie8 ie8Var3 = this.a0;
                ae4 ae4VarD = d("consumerScreenShare", new DataChannel.Init());
                wpb wpbVar = ie8Var3.v;
                if (wpbVar != null) {
                    wpbVar.C.log("PCRTCClient", "Data channel screen capturer unbound from " + wpbVar);
                }
                ie8Var3.v = this;
                this.C.log("PCRTCClient", "Data channel screen capturer bound to " + this);
                q2e q2eVar = ie8Var3.u;
                if (q2eVar == null) {
                    q2e q2eVar2 = new q2e(ie8Var3.a, ie8Var3.d.getApplicationContext(), ie8Var3.n, ie8Var3.E, ie8Var3.C);
                    ie8Var3.u = q2eVar2;
                    q2eVar = q2eVar2;
                }
                q2eVar.b.c(new d8c(q2eVar, 29, ae4VarD));
            }
        }
        if (this.H != null) {
            ae4 ae4VarD2 = d("producerCommand", new DataChannel.Init());
            jud judVar = this.H;
            if (judVar.j.get()) {
                throw new IllegalStateException("Instance is disposed");
            }
            judVar.f.post(new d8c(judVar, 24, ae4VarD2));
        }
        if (this.I != null) {
            ae4 ae4VarD3 = d("producerNotification", new DataChannel.Init());
            j35 j35Var = this.I;
            if (((AtomicBoolean) j35Var.Z).get()) {
                throw new IllegalStateException("Instance is disposed");
            }
            ((Handler) j35Var.X).post(new d8c(j35Var, 25, ae4VarD3));
        }
        n2e n2eVar = this.d;
        if (n2eVar != null) {
            ae4 ae4VarD4 = d("producerScreenShare", new DataChannel.Init());
            ae4 ae4Var = n2eVar.d;
            if (ae4Var != null) {
                p8i p8iVar = n2eVar.g;
                if (p8iVar != null) {
                    ae4Var.c(p8iVar);
                }
                n2eVar.d = null;
                n2eVar.g = null;
            }
            n2eVar.d = ae4VarD4;
            p8i p8iVar2 = new p8i(3, n2eVar);
            n2eVar.g = p8iVar2;
            ae4VarD4.a(p8iVar2);
        }
        if (this.e != null) {
            ae4 ae4VarD5 = d("asr", new DataChannel.Init());
            fa6 fa6Var = this.e;
            ae4 ae4Var2 = (ae4) fa6Var.a;
            if (ae4Var2 != null) {
                p8i p8iVar3 = (p8i) fa6Var.b;
                if (p8iVar3 != null) {
                    ae4Var2.c(p8iVar3);
                }
                fa6Var.a = null;
                fa6Var.b = null;
            }
            fa6Var.a = ae4VarD5;
            p8i p8iVar4 = new p8i(0, fa6Var);
            fa6Var.b = p8iVar4;
            ae4VarD5.a(p8iVar4);
        }
        int i = this.p0;
        if (i == 1 || i == 3) {
            DataChannel.Init init = new DataChannel.Init();
            if (this.p0 == 3) {
                init.id = 1;
                init.negotiated = true;
            }
            ae4 ae4VarD6 = d("animoji", init);
            ak akVar = this.l;
            if (akVar != null) {
                akVar.f(ae4VarD6);
            }
            zi ziVar = this.n;
            if (ziVar != null) {
                ae4 ae4Var3 = ziVar.c;
                if (ae4Var3 != null) {
                    ae4Var3.c(ziVar);
                }
                ziVar.c = ae4VarD6;
                a93 a93Var = ziVar.b;
                ((AtomicInteger) a93Var.o).set(0);
                ((AtomicInteger) a93Var.X).set(0);
                ae4VarD6.a(ziVar);
            }
        }
        this.C.log("PCRTCClient", this + ": peer connection created");
    }
}
