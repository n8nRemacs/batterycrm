package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;

/* loaded from: classes.dex */
public final class wib implements vib, PeerConnection.Observer, v2f, m9f, kw8, o8e, tof, lva, o44 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ wib(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public static wib w(fb0 fb0Var, da0 da0Var) {
        z5j.e(fb0Var, "quality cannot be null");
        z5j.e(da0Var, "fallbackStrategy cannot be null");
        z5j.a("Invalid quality: " + fb0Var, fb0.k.contains(fb0Var));
        return new wib(Collections.singletonList(fb0Var), da0Var);
    }

    public static wib x(List list, da0 da0Var) {
        z5j.e(list, "qualities cannot be null");
        z5j.a("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fb0 fb0Var = (fb0) it.next();
            z5j.a("qualities contain invalid quality: " + fb0Var, fb0.k.contains(fb0Var));
        }
        return new wib(list, da0Var);
    }

    public void A(JSONObject jSONObject) {
        xt1 xt1Var;
        xpb xpbVar = (xpb) this.b;
        try {
            xt1Var = new xt1(!jSONObject.optBoolean("disprove", false));
        } catch (JSONException e) {
            ((y6d) xpbVar.c).logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            xt1Var = null;
        }
        if (xt1Var != null) {
            ((ku1) this.c).onPromotionUpdated(xt1Var);
        }
    }

    public void B(o1j o1jVar) {
        ike ikeVar = (ike) this.c;
        ((j8a) this.b).i(o1jVar);
        if (o1jVar instanceof uib) {
            ikeVar.i((uib) o1jVar);
        } else if (o1jVar instanceof sib) {
            ikeVar.j(((sib) o1jVar).b);
        }
    }

    public void C(odg odgVar) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        ndg ndgVar = odgVar.a;
        if (ndgVar != ndg.SUCCESS_CONNECTION || linkedHashSet.contains(ndg.NO_CONNECTION_TIMEOUT)) {
            if (ndgVar != ndg.SUCCESS_AUDIO || linkedHashSet.contains(ndg.NO_DATA_TIMEOUT)) {
                ((sdg) this.b).a(odgVar);
                linkedHashSet.add(ndgVar);
            }
        }
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        v2f v2fVar = (v2f) this.b;
        try {
            ((k2f) this.c).c.accept(obj);
            v2fVar.a(obj);
        } catch (Throwable th) {
            raj.c(th);
            v2fVar.onError(th);
        }
    }

    @Override // defpackage.kw8
    public void b(int i, za4 za4Var, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) za4Var.i, j, i2);
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        ((v2f) this.b).c(py4Var);
    }

    @Override // defpackage.kw8
    public void d(long j, int i, int i2, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.o8e
    public void e(z9g z9gVar, kp5 kp5Var, mjg mjgVar) {
    }

    @Override // defpackage.o8e
    public void f(umb umbVar) {
        jjg jjgVar = (jjg) this.c;
        SparseArray sparseArray = jjgVar.Z;
        u62 u62Var = (u62) this.b;
        if (umbVar.x() == 0 && (umbVar.x() & 128) != 0) {
            umbVar.K(6);
            int iA = umbVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                umbVar.h(0, u62Var.d, 4);
                u62Var.q(0);
                int i2 = u62Var.i(16);
                u62Var.t(3);
                if (i2 == 0) {
                    u62Var.t(13);
                } else {
                    int i3 = u62Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new q8e(new ggg(jjgVar, i3)));
                        jjgVar.x0++;
                    }
                }
            }
            if (jjgVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.kw8
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    @Override // defpackage.kw8
    public void g(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.kw8
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.b).getInputBuffer(i);
    }

    @Override // defpackage.kw8
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.b).getOutputBuffer(i);
    }

    @Override // defpackage.kw8
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.kw8
    public int h() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.kw8
    public int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.kw8
    public void j(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.kw8
    public void k(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.kw8
    public void l(int i) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.kw8
    public void n() {
        ((MediaCodec) this.b).detachOutputSurface();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        String string;
        wpb wpbVar = (wpb) this.c;
        y6d y6dVar = wpbVar.C;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddStream, ");
        sb.append(wpbVar);
        sb.append(", stream =");
        sb.append(w0a.c(mediaStream));
        sb.append(", video tracks=");
        List<VideoTrack> list = mediaStream.videoTracks;
        if (list == null || list.isEmpty()) {
            string = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            for (VideoTrack videoTrack : list) {
                if (!z) {
                    sb2.append(", ");
                }
                if (videoTrack != null) {
                    sb2.append(videoTrack.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(videoTrack));
                } else {
                    sb2.append((char) 216);
                }
                z = false;
            }
            sb2.append(']');
            string = sb2.toString();
        }
        sb.append(string);
        y6dVar.log("PCRTCClient", sb.toString());
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        String string;
        wpb wpbVar = (wpb) this.c;
        y6d y6dVar = wpbVar.C;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddTrack, ");
        sb.append(wpbVar);
        sb.append(", receiver=");
        sb.append(rtpReceiver);
        sb.append(", streams=");
        boolean z = w0a.a;
        if (mediaStreamArr == null || mediaStreamArr.length == 0) {
            string = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int length = mediaStreamArr.length;
            boolean z2 = true;
            int i = 0;
            while (i < length) {
                MediaStream mediaStream = mediaStreamArr[i];
                if (!z2) {
                    sb2.append(", ");
                }
                if (mediaStream != null) {
                    sb2.append(mediaStream.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(mediaStream));
                } else {
                    sb2.append((char) 216);
                }
                i++;
                z2 = false;
            }
            sb2.append(']');
            string = sb2.toString();
        }
        sb.append(string);
        y6dVar.log("PCRTCClient", sb.toString());
        rtpReceiver.SetObserver(new ppb(wpbVar));
        wpbVar.j0.k(rtpReceiver, mediaStreamArr);
        wpbVar.v.post(new k79(wpbVar, 23, mediaStreamArr));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handleConnectionStateChanged, " + wpbVar + " state " + peerConnectionState);
        wpbVar.v.post(new k79(wpbVar, 22, peerConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        wpb wpbVar = (wpb) this.c;
        y6d y6dVar = wpbVar.C;
        if ("animoji".equals(dataChannel.label()) && wpbVar.p0 == 2) {
            ae4 ae4Var = new ae4(dataChannel, y6dVar);
            zi ziVar = wpbVar.n;
            if (ziVar != null) {
                ae4 ae4Var2 = ziVar.c;
                if (ae4Var2 != null) {
                    ae4Var2.c(ziVar);
                }
                ziVar.c = ae4Var;
                a93 a93Var = ziVar.b;
                ((AtomicInteger) a93Var.o).set(0);
                ((AtomicInteger) a93Var.X).set(0);
                ae4Var.a(ziVar);
            }
            ak akVar = wpbVar.l;
            if (akVar != null) {
                akVar.f(ae4Var);
            }
        }
        y6dVar.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + "/" + dataChannel.id());
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        ((v2f) this.b).onError(th);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionIceCandidate, " + wpbVar);
        wpbVar.i(new c(wpbVar, new mpb(wpbVar, iceCandidate, 1), 0), "onIceCandidate");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionIceCandidatesRemoved, " + wpbVar);
        wpbVar.i(new c(wpbVar, new qpb(wpbVar, 3, iceCandidateArr), 0), "onIceCandidatesRemoved");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        wpb wpbVar = (wpb) this.c;
        lb7 lb7Var = wpbVar.G;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionIceConnectionChange, " + wpbVar + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        if (iceConnectionState == iceConnectionState2) {
            lb7Var.a(true);
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            lb7Var.a(false);
        }
        if (iceConnectionState == iceConnectionState2 && wpbVar.m) {
            and andVar = new and(true);
            jud judVar = wpbVar.H;
            if (judVar != null) {
                judVar.d(new hud(new hud(andVar)));
            }
        }
        wpbVar.v.post(new k79(wpbVar, 21, iceConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z) {
        ((wpb) this.c).getClass();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionIceGatheringChange, " + wpbVar + ", state=" + iceGatheringState);
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            lb7 lb7Var = wpbVar.G;
            lb7Var.getClass();
            lb7Var.d = SystemClock.elapsedRealtime();
        }
        wpbVar.i(new c(wpbVar, new qpb(wpbVar, 0, iceGatheringState), 0), "onIceGatheringChange");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionRemoveStream, " + wpbVar + ", stream=" + w0a.c(mediaStream));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionRenegotiationNeeded, " + wpbVar);
        wpbVar.v.post(new gpb(wpbVar, 4));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        h79 h79Var = (h79) this.b;
        if (candidatePairChangeEvent != null) {
            v9i v9iVar = new v9i(candidatePairChangeEvent.local, candidatePairChangeEvent.remote);
            ((y6d) h79Var.b).log("ConnectionLogger", "Active connection: " + ((v9i) h79Var.c) + "-> " + v9iVar + ", reason=" + candidatePairChangeEvent.reason);
            h79Var.c = v9iVar;
        }
        wpb wpbVar = (wpb) this.c;
        y6d y6dVar = wpbVar.C;
        StringBuilder sb = new StringBuilder("handleSelectedCandidatePairChanged, ");
        sb.append(wpbVar);
        sb.append(", event=");
        sb.append("CandidatePairChangeEvent\nlocal=" + candidatePairChangeEvent.local + "\nremote=" + candidatePairChangeEvent.remote + "\nlastDataReceivedMs=" + candidatePairChangeEvent.lastDataReceivedMs + "\nreason=" + candidatePairChangeEvent.reason + "\nestimatedDisconnectedTimeMs=" + candidatePairChangeEvent.estimatedDisconnectedTimeMs);
        y6dVar.log("PCRTCClient", sb.toString());
        wpbVar.v.post(new k79(wpbVar, 19, candidatePairChangeEvent));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        wpb wpbVar = (wpb) this.c;
        wpbVar.C.log("PCRTCClient", "handlePeerConnectionSignalingChange, " + wpbVar + ", state=" + signalingState);
        wpbVar.v.post(new k79(wpbVar, 20, signalingState));
    }

    @Override // defpackage.lva
    public void p(Task task) {
        ((Map) ((xpb) this.c).c).remove((n2g) this.b);
    }

    @Override // defpackage.m9f
    public long q(long j) {
        ek8 ek8Var = (ek8) this.b;
        Long lValueOf = (Long) ek8Var.b(j);
        if (lValueOf == null) {
            n7 n7Var = (n7) this.c;
            long j2 = n7Var.a;
            n7Var.a = 1 + j2;
            lValueOf = Long.valueOf(j2);
            ek8Var.e(j, lValueOf);
        }
        return lValueOf.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x037d, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    @Override // defpackage.tof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(byte[] r19, int r20, int r21, defpackage.sof r22, defpackage.fu3 r23) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wib.r(byte[], int, int, sof, fu3):void");
    }

    @Override // defpackage.kw8
    public void release() {
        sa9 sa9Var = (sa9) this.c;
        MediaCodec mediaCodec = (MediaCodec) this.b;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && sa9Var != null) {
                sa9Var.E(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && sa9Var != null) {
                sa9Var.E(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.o44
    public Object s(Task task) {
        Bundle bundle;
        fud fudVar = (fud) this.b;
        Bundle bundle2 = (Bundle) this.c;
        fudVar.getClass();
        return (task.h() && (bundle = (Bundle) task.f()) != null && bundle.containsKey("google.messenger")) ? fudVar.a(bundle2).m(ex4.d, jbe.B0) : task;
    }

    @Override // defpackage.kw8
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.kw8
    public void t(hx8 hx8Var, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new zx(this, hx8Var, 1), handler);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "QualitySelector{preferredQualities=" + ((List) this.b) + ", fallbackStrategy=" + ((da0) this.c) + "}";
            case 5:
                return ((Instant) this.c).toString() + " (in " + ((m5c) this.b) + ")";
            case 16:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.tof
    public int u() {
        return 1;
    }

    public void v(jp5 jp5Var, mjg mjgVar) {
        rfg[] rfgVarArr = (rfg[]) this.c;
        for (int i = 0; i < rfgVarArr.length; i++) {
            mjgVar.a();
            mjgVar.b();
            rfg rfgVarB = jp5Var.B(mjgVar.e, 3);
            gf6 gf6Var = (gf6) ((List) this.b).get(i);
            String str = gf6Var.v0;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            fsi.a(strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "), z);
            String str2 = gf6Var.a;
            if (str2 == null) {
                mjgVar.b();
                str2 = mjgVar.f;
            }
            ef6 ef6Var = new ef6();
            ef6Var.a = str2;
            ef6Var.k = str;
            ef6Var.d = gf6Var.d;
            ef6Var.c = gf6Var.c;
            ef6Var.C = gf6Var.N0;
            ef6Var.m = gf6Var.x0;
            rfgVarB.d(new gf6(ef6Var));
            rfgVarArr[i] = rfgVarB;
        }
    }

    public String y(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(org.json.JSONObject r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.c
            ku1 r0 = (defpackage.ku1) r0
            java.lang.Object r1 = r11.b
            xpb r1 = (defpackage.xpb) r1
            java.lang.String r2 = "feedback"
            java.lang.Object r3 = r1.b
            mnb r3 = (defpackage.mnb) r3
            r4 = 0
            java.lang.String r5 = "eventType"
            java.lang.String r5 = r12.getString(r5)     // Catch: org.json.JSONException -> L42
            int r5 = defpackage.a9h.r(r5)     // Catch: org.json.JSONException -> L42
            int r5 = defpackage.az1.v(r5)     // Catch: org.json.JSONException -> L42
            java.lang.String r6 = "removedParticipantIds"
            java.lang.String r7 = "addedParticipantIds"
            java.lang.String r8 = "totalCount"
            hd5 r9 = defpackage.hd5.a
            if (r5 == 0) goto L6b
            r10 = 1
            if (r5 == r10) goto L4a
            r3 = 2
            if (r5 != r3) goto L44
            boolean r3 = r12.has(r2)     // Catch: org.json.JSONException -> L42
            if (r3 == 0) goto L96
            vt1 r3 = new vt1     // Catch: org.json.JSONException -> L42
            org.json.JSONObject r12 = r12.getJSONObject(r2)     // Catch: org.json.JSONException -> L42
            z81 r12 = defpackage.v1a.F(r12)     // Catch: org.json.JSONException -> L42
            r3.<init>(r12)     // Catch: org.json.JSONException -> L42
            r4 = r3
            goto L96
        L42:
            r12 = move-exception
            goto L8b
        L44:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch: org.json.JSONException -> L42
            r12.<init>()     // Catch: org.json.JSONException -> L42
            throw r12     // Catch: org.json.JSONException -> L42
        L4a:
            int r2 = r12.getInt(r8)     // Catch: org.json.JSONException -> L42
            org.json.JSONArray r5 = r12.optJSONArray(r7)     // Catch: org.json.JSONException -> L42
            if (r5 == 0) goto L59
            java.util.ArrayList r5 = r3.a(r5)     // Catch: org.json.JSONException -> L42
            goto L5a
        L59:
            r5 = r9
        L5a:
            org.json.JSONArray r12 = r12.optJSONArray(r6)     // Catch: org.json.JSONException -> L42
            if (r12 == 0) goto L64
            java.util.ArrayList r9 = r3.a(r12)     // Catch: org.json.JSONException -> L42
        L64:
            wt1 r12 = new wt1     // Catch: org.json.JSONException -> L42
            r12.<init>(r2, r5, r9)     // Catch: org.json.JSONException -> L42
        L69:
            r4 = r12
            goto L96
        L6b:
            int r2 = r12.optInt(r8)     // Catch: org.json.JSONException -> L42
            org.json.JSONArray r5 = r12.optJSONArray(r7)     // Catch: org.json.JSONException -> L42
            if (r5 == 0) goto L7a
            java.util.ArrayList r5 = r3.a(r5)     // Catch: org.json.JSONException -> L42
            goto L7b
        L7a:
            r5 = r9
        L7b:
            org.json.JSONArray r12 = r12.optJSONArray(r6)     // Catch: org.json.JSONException -> L42
            if (r12 == 0) goto L85
            java.util.ArrayList r9 = r3.a(r12)     // Catch: org.json.JSONException -> L42
        L85:
            ut1 r12 = new ut1     // Catch: org.json.JSONException -> L42
            r12.<init>(r2, r5, r9)     // Catch: org.json.JSONException -> L42
            goto L69
        L8b:
            java.lang.Object r1 = r1.c
            y6d r1 = (defpackage.y6d) r1
            java.lang.String r2 = "WaitingRoomNotificationParser"
            java.lang.String r3 = "Can't parse chat room notification"
            r1.logException(r2, r3, r12)
        L96:
            if (r4 == 0) goto Lb5
            boolean r12 = r4 instanceof defpackage.ut1
            if (r12 == 0) goto La2
            ut1 r4 = (defpackage.ut1) r4
            r0.onAttendee(r4)
            return
        La2:
            boolean r12 = r4 instanceof defpackage.vt1
            if (r12 == 0) goto Lac
            vt1 r4 = (defpackage.vt1) r4
            r0.onFeedback(r4)
            return
        Lac:
            boolean r12 = r4 instanceof defpackage.wt1
            if (r12 == 0) goto Lb5
            wt1 r4 = (defpackage.wt1) r4
            r0.onHandUp(r4)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wib.z(org.json.JSONObject):void");
    }

    public /* synthetic */ wib(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public wib(k01 k01Var) {
        this.a = 14;
        this.b = k01Var;
        this.c = new LinkedHashSet();
    }

    public wib(u5i u5iVar) {
        this.a = 21;
        this.c = new cyi();
        this.b = u5iVar;
        u1j.v();
    }

    public wib(Context context) {
        this.a = 11;
        s5j.g(context);
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(h5d.common_google_play_services_unknown_issue);
    }

    public wib(qm3 qm3Var) {
        this.a = 2;
        this.b = qm3Var;
        this.c = rw4.a();
    }

    public wib(qee qeeVar) {
        this.a = 17;
        this.b = qeeVar;
        this.c = new AtomicInteger(0);
    }

    public wib(List list) {
        this.a = 7;
        this.b = list;
        this.c = new rfg[list.size()];
    }

    public wib(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new b44(evd.i, new n5g(x8b.q1), Integer.valueOf(ivd.A), (Integer) null, 20);
                this.c = new b44(evd.d, new n5g(x8b.p1), Integer.valueOf(ivd.O), (Integer) null, 20);
                break;
            case 6:
                break;
            case 19:
                this.b = new umb();
                this.c = new h1i();
                break;
            default:
                this.b = new j8a();
                this.c = new ike();
                B(vib.Q);
                break;
        }
    }

    public wib(MediaCodec mediaCodec, sa9 sa9Var) {
        this.a = 12;
        this.b = mediaCodec;
        this.c = sa9Var;
        if (Build.VERSION.SDK_INT < 35 || sa9Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) sa9Var.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            hsi.g(((HashSet) sa9Var.a).add(mediaCodec));
        }
    }

    public wib(n7 n7Var) {
        this.a = 10;
        this.c = n7Var;
        this.b = new ek8((Object) null);
    }

    public wib(List list, da0 da0Var) {
        this.a = 4;
        z5j.a("No preferred quality and fallback strategy.", (list.isEmpty() && da0Var == da0.c) ? false : true);
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = da0Var;
    }

    public wib(jjg jjgVar) {
        this.a = 15;
        this.c = jjgVar;
        this.b = new u62(new byte[4], 4, 3, (byte) 0);
    }
}
