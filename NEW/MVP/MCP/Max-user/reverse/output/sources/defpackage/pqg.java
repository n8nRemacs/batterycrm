package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class pqg implements j01, vpb {
    public static final Pattern z = Pattern.compile("a=ssrc:(\\d+)");
    public final si1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final b7d e;
    public final y6d f;
    public final pze g;
    public final t7c h;
    public final rve i;
    public final HashSet j = new HashSet();
    public final dd3 k;
    public final zh l;
    public final gfe m;
    public zpb n;
    public final boolean o;
    public final boolean p;
    public final upb q;
    public volatile wpb r;
    public SessionDescription s;
    public boolean t;
    public String u;
    public final CopyOnWriteArraySet v;
    public r8a w;
    public final boolean x;
    public final j01 y;

    public pqg(ffe ffeVar, gfe gfeVar) {
        si1 si1Var = ffeVar.m;
        this.a = si1Var;
        this.b = ffeVar.j;
        this.c = ffeVar.k;
        this.d = ffeVar.l;
        this.m = gfeVar;
        b7d b7dVar = ffeVar.p;
        this.e = b7dVar;
        y6d y6dVar = ffeVar.o;
        this.f = y6dVar;
        this.g = ffeVar.i;
        this.h = ffeVar.r;
        rve rveVar = ffeVar.a;
        this.i = rveVar;
        this.l = ffeVar.u;
        this.k = ffeVar.n;
        this.o = ffeVar.D;
        this.v = new CopyOnWriteArraySet();
        this.p = ffeVar.s;
        this.x = ffeVar.D;
        this.y = ffeVar.C;
        upb upbVar = new upb();
        upbVar.a = rveVar;
        upbVar.b = ffeVar.b;
        upbVar.c = ffeVar.d;
        upbVar.e = ffeVar.e;
        upbVar.f = b7dVar;
        upbVar.g = y6dVar;
        upbVar.h = true;
        upbVar.i = true;
        upbVar.d = si1Var;
        upbVar.j = si1Var.h;
        upbVar.m = si1Var.i;
        upbVar.r = si1Var.j > 0;
        upbVar.w = ffeVar.t;
        si1 si1Var2 = ffeVar.m;
        upbVar.n = si1Var2.n;
        upbVar.o = si1Var2.o;
        upbVar.p = si1Var2.p;
        zh zhVar = ffeVar.u;
        upbVar.x = new ak(zhVar, zhVar.e, 2);
        zh zhVar2 = ffeVar.u;
        upbVar.y = new zi(zhVar2, zhVar2.e);
        upbVar.H = 1;
        qi1 qi1Var = si1Var.z;
        upbVar.u = qi1Var.g;
        upbVar.v = qi1Var.h;
        upbVar.t = wpb.E(false);
        upbVar.s = (wpb.s0 == null ? new ypb(true, true, null, null, null, false, false, true, false, false, false, null) : (ypb) wpb.s0.b).b;
        upbVar.z = ffeVar.x;
        si1 si1Var3 = ffeVar.m;
        upbVar.k = si1Var3.t;
        upbVar.A = ffeVar.y;
        upbVar.B = si1Var3.z.E;
        upbVar.C = ffeVar.z;
        upbVar.D = ffeVar.A;
        upbVar.G = this;
        this.q = upbVar;
        c();
        if (this.r != null) {
            this.r.J(this.n);
        }
    }

    @Override // defpackage.vpb
    public final void a(wpb wpbVar, SessionDescription sessionDescription) {
        if (sessionDescription.type == SessionDescription.Type.OFFER) {
            if (wpbVar.g0) {
                throw new IllegalStateException();
            }
            this.r.w();
        }
    }

    @Override // defpackage.vpb
    public final void b(wpb wpbVar) {
        this.f.log("UnifiedPeerConnection", "onPeerConnectionRenegotiationNeeded, " + wpbVar);
    }

    public final void c() {
        upb upbVar = this.q;
        upbVar.l = this.t;
        this.r = upbVar.a();
        this.r.S = this;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kud kudVar = (kud) obj;
            u5i u5iVar = this.r.A().n;
            if (kudVar == null) {
                u5iVar.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) u5iVar.b).add(kudVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            pud pudVar = (pud) obj2;
            j35 j35Var = this.r.I;
            if (j35Var == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            }
            if (pudVar == null) {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) j35Var.b).add(pudVar);
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            d01 d01Var = (d01) obj3;
            if (this.r.e != null) {
                ((CopyOnWriteArrayList) this.r.e.d).add(d01Var);
            }
        }
        wpb wpbVar = this.r;
        wpbVar.O = null;
        wpbVar.P = false;
        wpbVar.U = null;
        wpbVar.V = null;
        wpbVar.W = null;
        wpbVar.Y = null;
        wpbVar.i(new gpb(wpbVar, 5), "createPeerConnectionFactoryInternal");
    }

    @Override // defpackage.vpb
    public final void d(wpb wpbVar) {
        if (this.r.F()) {
            gfe gfeVar = this.m;
            gfeVar.getClass();
            gfeVar.P("resendDisplayLayouts, " + gfeVar);
            kw4 kw4Var = gfeVar.C;
            List list = kw4Var.c;
            gfeVar.B.getClass();
            gfeVar.A.p(osf.a(list));
            kw4Var.e = true;
            kw4Var.a(kw4Var.c);
            k01 k01Var = gfeVar.n;
            if (k01Var != null) {
                k01Var.z(gfeVar);
            }
        }
        if (this.r.g0 && this.s != null) {
            if (this.x) {
                wpb wpbVar2 = this.r;
                if (wpbVar2.O != null && wpbVar2.O.signalingState() == PeerConnection.SignalingState.STABLE && wpbVar2.O.getRemoteDescription() == null) {
                    n("apply postponed remote sdp=" + this.s.type.canonicalForm() + " to just created " + wpbVar);
                    this.r.K(this.s);
                }
            } else {
                n("apply postponed remote sdp=" + this.s.type.canonicalForm() + " to just created " + wpbVar);
                this.r.K(this.s);
                this.s = null;
            }
        }
        this.r.t(this.w);
    }

    @Override // defpackage.vpb
    public final void e(String str) {
        n("audio-mix enabled");
        gfe gfeVar = this.m;
        gfeVar.getClass();
        if (str == null || !str.endsWith("audio-mix") || gfeVar.n == null) {
            return;
        }
        gfeVar.s("audio-mix enabled");
    }

    @Override // defpackage.vpb
    public final void f(wpb wpbVar, String str) {
        ti1 ti1Var;
        gfe gfeVar = this.m;
        kme kmeVar = gfeVar.w;
        gfeVar.P("onPeerConnectionRemoteVideoTrackAdded, " + gfeVar + ", client=" + wpbVar + ", track=" + str);
        ti1 ti1VarK = paj.K(str);
        yi1 yi1VarW = ti1VarK != null ? gfeVar.w(ti1VarK) : null;
        if (yi1VarW == null || (ti1Var = yi1VarW.a) == null) {
            gfeVar.f.log("ServerCallTopology", "Cant find participant  for " + str + " video track, " + wpbVar);
            return;
        }
        if (kmeVar.b()) {
            Map remoteVideoRenderers = kmeVar.getRemoteVideoRenderers(ti1Var);
            for (nt1 nt1Var : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(nt1Var);
                if (list != null) {
                    wpbVar.j0.p(str, nt1Var, list);
                }
            }
        }
    }

    @Override // defpackage.vpb
    public final void g(wpb wpbVar, IceCandidate[] iceCandidateArr) {
    }

    public final void h() {
        this.r.S = null;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kud kudVar = (kud) obj;
            u5i u5iVar = this.r.A().n;
            if (kudVar == null) {
                u5iVar.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) u5iVar.b).remove(kudVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            pud pudVar = (pud) obj2;
            j35 j35Var = this.r.I;
            if (j35Var == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            }
            if (pudVar == null) {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) j35Var.b).remove(pudVar);
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            d01 d01Var = (d01) obj3;
            if (this.r.e != null) {
                ((CopyOnWriteArrayList) this.r.e.d).remove(d01Var);
            }
        }
        this.r.q(false);
    }

    @Override // defpackage.vpb
    public final void i(wpb wpbVar, PeerConnection.SignalingState signalingState) {
        PeerConnection.SignalingState signalingState2 = PeerConnection.SignalingState.STABLE;
        if (signalingState == signalingState2 && this.s != null && this.r.F()) {
            if (!this.x) {
                n("apply postponed remote sdp=" + this.s.type.canonicalForm() + " to " + wpbVar);
                this.r.K(this.s);
                this.s = null;
                return;
            }
            wpb wpbVar2 = this.r;
            if (wpbVar2.O != null && wpbVar2.O.signalingState() == signalingState2 && wpbVar2.O.getRemoteDescription() == null) {
                n("apply postponed remote sdp=" + this.s.type.canonicalForm() + " to " + wpbVar);
                this.r.K(this.s);
            }
        }
    }

    @Override // defpackage.vpb
    public final void j(wpb wpbVar, IceCandidate iceCandidate) {
    }

    @Override // defpackage.vpb
    public final void k(wpb wpbVar, SessionDescription sessionDescription) throws JSONException {
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.ANSWER;
        y6d y6dVar = this.f;
        if (type != type2) {
            y6dVar.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
            return;
        }
        String str = this.u;
        y6dVar.log("UnifiedPeerConnection", "sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
        try {
            pze pzeVar = this.g;
            HashSet hashSet = this.j;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", sessionDescription.description);
            if (!hashSet.isEmpty()) {
                jSONObject.put("ssrcs", new JSONArray((Collection) hashSet));
            }
            if (str != null) {
                int length = str.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount >= length) {
                        break;
                    }
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (!Character.isWhitespace(iCodePointAt)) {
                        jSONObject.put("sessionId", str);
                        break;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            pzeVar.i(paj.b(jSONObject, "accept-producer"));
        } catch (JSONException unused) {
            y6dVar.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
        }
    }

    @Override // defpackage.vpb
    public final void l(wpb wpbVar, PeerConnection.IceConnectionState iceConnectionState) {
        this.f.log("UnifiedPeerConnection", "onPeerConnectionIceConnectionChange, " + wpbVar + " state=" + iceConnectionState);
        gfe gfeVar = this.m;
        if (gfeVar.F()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                this.v.add(this.u);
                if (!this.o) {
                    this.g.i(paj.b(null, "request-realloc"));
                }
            }
            k01 k01Var = gfeVar.n;
            if (k01Var != null) {
                k01Var.A(gfeVar, iceConnectionState);
            }
        }
    }

    public final void n(String str) {
        this.f.log("UnifiedPeerConnection", str);
    }

    @Override // defpackage.vpb
    public final void o(wpb wpbVar) {
        gfe gfeVar = this.m;
        s06 s06Var = gfeVar.g;
        if (s06Var == null || s06Var.a()) {
            return;
        }
        gfeVar.M(new cs1(s06Var));
    }

    @Override // defpackage.j01
    public final void onIceRestart() {
        j01 j01Var = this.y;
        if (j01Var != null) {
            j01Var.onIceRestart();
        }
    }

    @Override // defpackage.j01
    public final void onNegotiationError(kda kdaVar) {
        jda jdaVar = kdaVar.a;
        String str = (jdaVar == jda.b || jdaVar == jda.a) ? "server.topology.create.sdp.failed" : "server.topology.set.sdp.failed";
        this.f.reportException("UnifiedPeerConnection", str, new Exception(str));
        j01 j01Var = this.y;
        if (j01Var != null) {
            j01Var.onNegotiationError(kdaVar);
        }
    }

    @Override // defpackage.j01
    public final void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState) {
        j01 j01Var = this.y;
        if (j01Var != null) {
            j01Var.onPeerConnectionStateChanged(peerConnectionState);
        }
    }

    @Override // defpackage.j01
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        j01 j01Var = this.y;
        if (j01Var != null) {
            j01Var.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    public final void p(awd awdVar) {
        n2e n2eVar = this.r.d;
        if (n2eVar == null || n2eVar.f) {
            return;
        }
        n2eVar.h = Collections.unmodifiableSet((HashSet) awdVar.b);
        Iterator it = n2eVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!n2eVar.h.contains(entry.getKey())) {
                b9i b9iVar = (b9i) entry.getValue();
                if (b9iVar != null) {
                    b9iVar.a();
                }
                it.remove();
            }
        }
    }
}
