package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class ax4 extends ds1 implements mze, vpb, NetworkMonitor.NetworkObserver, j01 {
    public final ExecutorService A;
    public final HashMap B;
    public final HashMap C;
    public final HashMap D;
    public final vd E;
    public final HashMap F;
    public final HashMap G;
    public final y6i H;
    public final wib I;
    public final pud J;
    public final dlb K;
    public boolean L;
    public final j01 M;
    public final yw4 N;
    public final yw4 O;
    public final boolean P;
    public final zh v;
    public final Context w;
    public final pze x;
    public final kme y;
    public final rve z;

    /* JADX WARN: Multi-variable type inference failed */
    public ax4(zw4 zw4Var) {
        tha thaVar;
        super(zw4Var.h, zw4Var.g, zw4Var.j, zw4Var.k, zw4Var.l, zw4Var.m, zw4Var.b, zw4Var.q, zw4Var.r, null, zw4Var.t);
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        this.F = new HashMap();
        this.G = new HashMap();
        this.L = true;
        this.N = new yw4(this, 1);
        this.O = new yw4(this, 2);
        P(this + " ctor");
        this.H = zw4Var.o;
        this.n = zw4Var.u;
        this.I = new wib(zw4Var.v);
        this.M = zw4Var.w;
        this.E = new vd(zw4Var.k);
        this.w = zw4Var.e;
        pze pzeVar = zw4Var.i;
        this.x = pzeVar;
        this.z = zw4Var.a;
        this.A = zw4Var.d;
        this.y = zw4Var.c;
        this.P = zw4Var.n;
        this.v = zw4Var.p;
        pzeVar.k.add(this);
        this.J = zw4Var.s;
        Iterator it = this.k.i().iterator();
        while (it.hasNext()) {
            this.B.put(((yi1) it.next()).a, U());
        }
        ng0 ng0Var = this.d.y;
        lg0 lg0Var = ng0Var.d;
        dlb dlbVar = this.K;
        dlb dlbVar2 = null;
        if (dlbVar != null) {
            dlbVar.f.invoke("stop reporter");
            v08 v08Var = dlbVar.g;
            if (v08Var != null) {
                ty4.a(v08Var);
            }
            dlbVar.g = null;
            dlbVar.h = null;
        }
        y6d y6dVar = this.f;
        d92 d92Var = new d92(20, this);
        ia iaVar = new ia(this, 14, lg0Var);
        pmd pmdVar = ng0Var.b;
        if (pmdVar != null) {
            r84 r84Var = new r84(ng0Var, 3, y6dVar);
            kz0 kz0Var = ng0Var.a;
            if (kz0Var != null) {
                a93 a93Var = new a93();
                a93Var.a = kz0Var;
                a93Var.b = r84Var;
                a93Var.c = new ia5(kz0Var.c, kz0Var.d, 1.0d);
                a93Var.d = new ia5(kz0Var.f, kz0Var.g, 0.0d);
                a93Var.o = new ia5(kz0Var.k, 0.0d, 2);
                a93Var.X = new ia5(kz0Var.j, 0.0d, 2);
                a93Var.Y = new ia5(kz0Var.w, kz0Var.x, 4);
                a93Var.Z = new ia5(kz0Var.y, kz0Var.z, 4);
                thaVar = a93Var;
            } else {
                thaVar = new tha(26);
            }
            dlbVar2 = new dlb(pmdVar, thaVar, y6dVar, d92Var, iaVar, r84Var);
        }
        this.K = dlbVar2;
        if (dlbVar2 != null) {
            j0e j0eVarA = de.a();
            dlbVar2.f.invoke("start reporter");
            v08 v08Var2 = dlbVar2.g;
            if (v08Var2 != null) {
                ty4.a(v08Var2);
            }
            dlbVar2.h = j0eVarA;
            long j = dlbVar2.a.b;
            ssa ssaVarL = vqa.j(j, j, TimeUnit.MILLISECONDS, u0e.a()).l(j0eVarA);
            x6i x6iVar = new x6i(25, dlbVar2);
            iv6 iv6Var = new iv6(26, dlbVar2);
            v08 v08Var3 = new v08(new zkb(0, dlbVar2), new y6i(28, dlbVar2), pdf.d);
            try {
                try {
                    ssaVarL.a(new fsa(new zra(v08Var3, iv6Var, 1), x6iVar, 1));
                    dlbVar2.g = v08Var3;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    raj.c(th);
                    t8j.a(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th2) {
                raj.c(th2);
                t8j.a(th2);
                NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException2.initCause(th2);
                throw nullPointerException2;
            }
        }
        NetworkMonitor.getInstance().addObserver(this);
    }

    public static ti1 T(wpb wpbVar, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == wpbVar) {
                return (ti1) entry.getKey();
            }
        }
        return null;
    }

    @Override // defpackage.ds1
    public final String A() {
        return "DirectCallTopology";
    }

    @Override // defpackage.ds1
    public final void B(ti1 ti1Var, List list, boolean z, uz0 uz0Var) {
        try {
            this.x.h(paj.q(ti1Var, list, z), uz0Var);
        } catch (JSONException unused) {
            this.f.logException("DirectCallTopology", "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    @Override // defpackage.ds1
    public final void C() {
        s("handleIceApplyPermissionChanged, " + this + ", isPermitted=true");
        vd vdVar = this.E;
        vdVar.b = true;
        if (F()) {
            for (Map.Entry entry : this.C.entrySet()) {
                yi1 yi1VarW = w((ti1) entry.getKey());
                if (yi1VarW != null) {
                    vdVar.b(yi1VarW, (wpb) entry.getValue());
                }
            }
        }
    }

    @Override // defpackage.ds1
    public final void D() {
        String strY = ds1.y(1);
        P("handleStateChanged, " + this + ", state=" + strY);
        boolean zF = F();
        pze pzeVar = this.x;
        if (zF) {
            this.f.log("DirectCallTopology", "enable processing signaling replies in " + strY + " state");
            pzeVar.k.add(this);
            R(this.r);
        } else {
            S("disable processing signaling replies in " + strY + " state");
            pzeVar.k.remove(this);
        }
        X();
    }

    @Override // defpackage.ds1
    public final void H(ti1 ti1Var, fje fjeVar, boolean z, vz0 vz0Var) {
        try {
            this.x.h(paj.r(ti1Var, fjeVar, z), vz0Var);
        } catch (JSONException unused) {
            this.f.logException("DirectCallTopology", "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    @Override // defpackage.ds1
    public final void I() {
        HashMap map = this.C;
        S(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages(null);
        this.x.k.remove(this);
        HashMap map2 = this.B;
        for (wpb wpbVar : map2.values()) {
            wpbVar.S = null;
            wpbVar.q(true);
        }
        for (wpb wpbVar2 : map.values()) {
            wpbVar2.S = null;
            wpbVar2.q(true);
        }
        map2.clear();
        map.clear();
        this.D.clear();
        ((HashMap) this.E.c).clear();
        this.F.clear();
        this.G.clear();
        dlb dlbVar = this.K;
        if (dlbVar != null) {
            dlbVar.f.invoke("stop reporter");
            v08 v08Var = dlbVar.g;
            if (v08Var != null) {
                ty4.a(v08Var);
            }
            dlbVar.g = null;
            dlbVar.h = null;
        }
        super.I();
    }

    @Override // defpackage.ds1
    public final void M(wdf wdfVar) {
        w0a.f();
        Iterator it = this.C.entrySet().iterator();
        while (it.hasNext()) {
            wpb wpbVar = (wpb) ((Map.Entry) it.next()).getValue();
            wpbVar.getClass();
            wpbVar.i(new c(wpbVar, new eu3(3, wdfVar), 0), "getStats.new");
        }
    }

    @Override // defpackage.ds1
    public final void N(List list) {
        P("setIceServers, " + this);
        super.N(list);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.i));
        for (wpb wpbVar : this.C.values()) {
            wpbVar.C.log("PCRTCClient", "setConfig, servers=" + listUnmodifiableList + ", " + wpbVar);
            wpbVar.i(new c(wpbVar, new qpb(wpbVar, 4, listUnmodifiableList), 0), "setConfig");
        }
    }

    @Override // defpackage.ds1
    public final void O(nt1 nt1Var, List list) {
        P("setRemoteVideoRenderers, " + this + ", " + nt1Var);
        w0a.f();
        wpb wpbVar = (wpb) this.C.get(nt1Var.b);
        if (wpbVar == null) {
            S("peer connection not found for " + nt1Var);
            return;
        }
        String str = (String) this.D.get(nt1Var.b);
        if (!TextUtils.isEmpty(str)) {
            wpbVar.j0.p(str, nt1Var, list);
            return;
        }
        S(this + ": video track not found for " + nt1Var);
    }

    @Override // defpackage.ds1
    public final void R(zpb zpbVar) {
        Iterator it = this.C.entrySet().iterator();
        while (it.hasNext()) {
            wpb wpbVar = (wpb) ((Map.Entry) it.next()).getValue();
            if (wpbVar != null) {
                wpbVar.J(zpbVar);
                return;
            }
        }
    }

    public final wpb U() {
        s("> createPeerConnectionClient, " + this);
        upb upbVar = new upb();
        upbVar.a = this.z;
        upbVar.b = this.h;
        upbVar.c = this.A;
        upbVar.e = this.w;
        upbVar.f = this.e;
        upbVar.g = this.f;
        si1 si1Var = this.d;
        upbVar.d = si1Var;
        upbVar.q = this.P;
        upbVar.w = this.H;
        upbVar.n = si1Var.n;
        upbVar.o = si1Var.o;
        upbVar.p = si1Var.p;
        upbVar.s = (wpb.s0 == null ? new ypb(true, true, null, null, null, false, false, true, false, false, false, null) : (ypb) wpb.s0.b).a;
        upbVar.t = wpb.E(true);
        qi1 qi1Var = this.d.z;
        upbVar.u = qi1Var.g;
        upbVar.v = qi1Var.h;
        zh zhVar = this.v;
        a93 a93Var = zhVar.e;
        upbVar.y = new zi(zhVar, a93Var);
        upbVar.x = new ak(zhVar, a93Var, null);
        this.v.c.getClass();
        upbVar.H = 4;
        upbVar.A = false;
        qi1 qi1Var2 = this.d.z;
        upbVar.B = qi1Var2.E;
        upbVar.C = this.o;
        upbVar.E = qi1Var2.u;
        upbVar.F = qi1Var2.v;
        upbVar.D = this.s;
        upbVar.G = this;
        wpb wpbVarA = upbVar.a();
        wpbVarA.S = this;
        wpbVarA.O = null;
        wpbVarA.P = false;
        wpbVarA.U = null;
        wpbVarA.V = null;
        wpbVarA.W = null;
        wpbVarA.Y = null;
        wpbVarA.i(new gpb(wpbVarA, 5), "createPeerConnectionFactoryInternal");
        s("< createPeerConnectionClient, " + this);
        return wpbVarA;
    }

    public final void V(yi1 yi1Var) {
        SessionDescription sessionDescription;
        P("maybeProcessRemoteAnswers, for " + yi1Var);
        if (!yi1Var.c()) {
            S(yi1Var + " still not accepted call");
            return;
        }
        k8i k8iVar = (k8i) this.G.get(yi1Var.a);
        if (k8iVar != null) {
            HashMap map = k8iVar.a;
            if (!k8iVar.e || (sessionDescription = (SessionDescription) map.get(yi1Var.k)) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("Found answer for ");
            sb.append(yi1Var);
            sb.append(", peerid=");
            this.f.log("DirectCallTopology", ho7.l(sb, (String) yi1Var.k.a, ", apply it"));
            k8iVar.c = sessionDescription;
            map.clear();
            ((wpb) this.C.get(yi1Var.a)).K(sessionDescription);
        }
    }

    public final void W(wpb wpbVar, PeerConnection.IceConnectionState iceConnectionState) {
        P("maybeRestart, " + this);
        if (!F()) {
            S(this + ": is not active yet");
            return;
        }
        if (!NetworkMonitor.isOnline()) {
            S("No net connectivity");
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            s(wpbVar + " has " + iceConnectionState + " state");
            if (!wpbVar.F() || !wpbVar.g0) {
                S(wpbVar + " not ready or not stable");
                return;
            }
            k8i k8iVar = (k8i) this.G.get(T(wpbVar, this.C));
            if (k8iVar == null || k8iVar.d) {
                return;
            }
            S("Ice failed, restart " + wpbVar);
            k8iVar.d = true;
            k8iVar.e = false;
            k8iVar.c = null;
            k8iVar.a.clear();
            wpbVar.x(true);
        }
    }

    public final void X() {
        P("maybeCreateConnection, " + this);
        if (!F()) {
            this.f.log("DirectCallTopology", this + ": is not active yet");
            return;
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.i));
        for (wpb wpbVar : this.B.values()) {
            if (!wpbVar.F() && !wpbVar.d0) {
                wpbVar.y(listUnmodifiableList);
            }
        }
        Z();
        Y();
    }

    public final void Y() {
        wpb wpbVar;
        P("maybeProcessSelfAnswers");
        if (!F()) {
            S(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.F.entrySet()) {
            ti1 ti1Var = (ti1) entry.getKey();
            k8i k8iVar = (k8i) entry.getValue();
            if (k8iVar.b == null) {
                throw new IllegalStateException("Offer not found for participant=" + ti1Var);
            }
            if (!k8iVar.d && !k8iVar.e && (wpbVar = (wpb) this.C.get(ti1Var)) != null) {
                this.f.log("DirectCallTopology", this + ": start processing scheduled answer for participant=" + ti1Var);
                k8iVar.d = true;
                wpbVar.K(k8iVar.b);
            }
        }
    }

    public final void Z() {
        wpb wpbVar;
        P("maybeProcessSelfOffers");
        if (!F()) {
            S(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.G.entrySet()) {
            ti1 ti1Var = (ti1) entry.getKey();
            k8i k8iVar = (k8i) entry.getValue();
            if (!k8iVar.d && !k8iVar.e && (wpbVar = (wpb) this.C.get(ti1Var)) != null) {
                this.f.log("DirectCallTopology", this + ": start processing scheduled offer for participant=" + ti1Var);
                k8iVar.d = true;
                k8iVar.a.clear();
                k8iVar.c = null;
                wpbVar.x(false);
            }
        }
    }

    @Override // defpackage.vpb
    public final void a(wpb wpbVar, SessionDescription sessionDescription) {
        P("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + wpbVar);
        ti1 ti1VarT = T(wpbVar, this.C);
        if (sessionDescription.type != SessionDescription.Type.OFFER || this.F.get(ti1VarT) == null) {
            return;
        }
        wpbVar.w();
    }

    @Override // defpackage.vpb
    public final void b(wpb wpbVar) {
        P("onPeerConnectionRenegotiationNeeded, " + this + ", " + wpbVar);
    }

    @Override // defpackage.vpb
    public final void d(wpb wpbVar) {
        k01 k01Var;
        P("onPeerConnectionCreated, " + this + ", " + wpbVar);
        HashMap map = this.B;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == wpbVar) {
                map.remove(entry.getKey());
                if (this.r != null) {
                    ((wpb) entry.getValue()).J(this.r);
                }
                this.C.put((ti1) entry.getKey(), (wpb) entry.getValue());
            }
        }
        X();
        if (map.size() != 0 || (k01Var = this.n) == null) {
            return;
        }
        k01Var.z(this);
    }

    @Override // defpackage.vpb
    public final void e(String str) {
    }

    @Override // defpackage.vpb
    public final void f(wpb wpbVar, String str) {
        ti1 ti1Var;
        P("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + wpbVar);
        yi1 yi1VarW = w(T(wpbVar, this.C));
        if (yi1VarW == null || (ti1Var = yi1VarW.a) == null) {
            S(this + ": participant not found for " + w0a.c(wpbVar));
            return;
        }
        this.D.put(ti1Var, str);
        ti1 ti1Var2 = yi1VarW.a;
        kme kmeVar = this.y;
        if (kmeVar.b()) {
            Map remoteVideoRenderers = kmeVar.getRemoteVideoRenderers(ti1Var2);
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
        P("onPeerConnectionIceCandidatesRemoved, " + this + ", " + wpbVar);
        ti1 ti1VarT = T(wpbVar, this.C);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(ti1VarT);
        P(sb.toString());
        try {
            this.x.i(paj.t(ti1VarT, iceCandidateArr));
        } catch (JSONException unused) {
            this.f.logException("DirectCallTopology", "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    @Override // defpackage.vpb
    public final void i(wpb wpbVar, PeerConnection.SignalingState signalingState) {
        P("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + wpbVar);
        if (signalingState == PeerConnection.SignalingState.STABLE) {
            W(wpbVar, wpbVar.B());
        }
        yi1 yi1VarW = w(T(wpbVar, this.C));
        if (yi1VarW != null) {
            this.E.b(yi1VarW, wpbVar);
        }
    }

    @Override // defpackage.vpb
    public final void j(wpb wpbVar, IceCandidate iceCandidate) {
        P("onPeerConnectionIceCandidate, " + this + ", " + wpbVar);
        ti1 ti1VarT = T(wpbVar, this.C);
        P("sendIceCandidateRequest, participant=" + ti1VarT + ", candidate=" + iceCandidate);
        try {
            this.x.i(paj.s(ti1VarT, iceCandidate));
        } catch (JSONException unused) {
            this.f.logException("DirectCallTopology", "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    @Override // defpackage.vpb
    public final void k(wpb wpbVar, SessionDescription sessionDescription) {
        k01 k01Var;
        P("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + wpbVar);
        ti1 ti1VarT = T(wpbVar, this.C);
        yi1 yi1VarW = w(ti1VarT);
        if (yi1VarW == null) {
            this.f.logException("DirectCallTopology", "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            k8i k8iVar = (k8i) this.G.get(ti1VarT);
            if (k8iVar == null) {
                throw new IllegalStateException();
            }
            k8iVar.d = false;
            k8iVar.e = true;
        } else {
            k8i k8iVar2 = (k8i) this.F.get(ti1VarT);
            if (k8iVar2 == null) {
                throw new IllegalStateException();
            }
            k8iVar2.d = false;
            k8iVar2.e = true;
        }
        P("sendOfferAnswerRequest, participant=" + ti1VarT + ", sdp type=" + sessionDescription.type.canonicalForm());
        try {
            this.x.i(paj.b(paj.i(ti1VarT, sessionDescription), "transmit-data"));
            if (sessionDescription.type != type2 || (k01Var = this.n) == null) {
                return;
            }
            k01Var.P.log("OKRTCCall", "handleTopologyOfferCreated, " + this + ", " + yi1VarW + ", sdp=" + sessionDescription.type);
        } catch (JSONException e) {
            throw new RuntimeException("sdp " + sessionDescription.type + " " + sessionDescription.description, e);
        }
    }

    @Override // defpackage.vpb
    public final void l(wpb wpbVar, PeerConnection.IceConnectionState iceConnectionState) {
        P("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + wpbVar);
        W(wpbVar, iceConnectionState);
        k01 k01Var = this.n;
        if (k01Var != null) {
            k01Var.A(this, iceConnectionState);
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            Runnable runnable = this.c;
            Handler handler = this.a;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            yw4 yw4Var = this.O;
            handler.removeCallbacks(yw4Var);
            if (this.L) {
                this.I.C(new odg(this.u, 3));
                ri1 ri1Var = this.d.b;
                handler.postDelayed(yw4Var, 12000L);
            }
            this.t = this.o.getMsSinceBoot();
            this.L = false;
        }
    }

    @Override // defpackage.vpb
    public final void m(wpb wpbVar, long j) {
        ti1 ti1VarT = T(wpbVar, this.B);
        if (ti1VarT == null) {
            ti1VarT = T(wpbVar, this.C);
        }
        if (ti1VarT != null) {
            yi1 yi1VarW = w(ti1VarT);
            k01 k01Var = this.n;
            if (k01Var == null || yi1VarW == null) {
                return;
            }
            k01Var.R0.b.onCallParticipantFingerprint(yi1VarW, j);
        }
    }

    @Override // defpackage.vpb
    public final void o(wpb wpbVar) {
        s06 s06Var = this.g;
        if (s06Var != null && !s06Var.a()) {
            M(new cs1(s06Var));
        }
        this.I.C(new odg(this.t, 2));
        this.a.removeCallbacks(this.O);
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantUpdated(t01 t01Var) {
        onActiveParticipantsRemoved(new s01(t01Var.a, Collections.EMPTY_LIST));
        Collection collection = t01Var.b;
        onActiveParticipantsAdded(new p01(collection, collection));
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsAdded(p01 p01Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsAdded, ");
        sb.append(this);
        sb.append(", ");
        Collection<yi1> collection = p01Var.a;
        sb.append(collection.size());
        P(sb.toString());
        for (yi1 yi1Var : collection) {
            ti1 ti1Var = yi1Var.a;
            HashMap map = this.B;
            if (map.get(ti1Var) != null || this.C.get(yi1Var.a) != null) {
                throw new IllegalStateException("Peer connection is already created for " + yi1Var);
            }
            map.put(yi1Var.a, U());
        }
        X();
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsChanged(q01 q01Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsChanged, ");
        List<yi1> list = q01Var.a;
        sb.append(list.size());
        P(sb.toString());
        for (yi1 yi1Var : list) {
            wpb wpbVar = (wpb) this.C.get(yi1Var.a);
            if (wpbVar != null) {
                V(yi1Var);
                this.E.b(yi1Var, wpbVar);
            }
        }
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsDeAnonimized(r01 r01Var) {
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsRemoved(s01 s01Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsRemoved, ");
        sb.append(this);
        sb.append(", ");
        Collection<yi1> collection = s01Var.a;
        sb.append(collection.size());
        P(sb.toString());
        for (yi1 yi1Var : collection) {
            wpb wpbVar = (wpb) this.B.remove(yi1Var.a);
            if (wpbVar == null) {
                wpbVar = (wpb) this.C.remove(yi1Var.a);
            }
            if (wpbVar != null) {
                wpbVar.S = null;
                wpbVar.q(true);
            }
            this.D.remove(yi1Var.a);
            this.F.remove(yi1Var.a);
            this.G.remove(yi1Var.a);
            ((HashMap) this.E.c).remove(yi1Var);
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        P("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        this.a.post(new yw4(this, 0));
    }

    @Override // defpackage.j01
    public final void onIceRestart() {
        j01 j01Var = this.M;
        if (j01Var != null) {
            j01Var.onIceRestart();
        }
    }

    @Override // defpackage.j01
    public final void onNegotiationError(kda kdaVar) {
        jda jdaVar = kdaVar.a;
        String str = (jdaVar == jda.b || jdaVar == jda.a) ? "direct.topology.create.sdp.failed" : "direct.topology.set.sdp.failed";
        this.f.reportException("DirectCallTopology", str, new Exception(str));
        j01 j01Var = this.M;
        if (j01Var != null) {
            j01Var.onNegotiationError(kdaVar);
        }
    }

    @Override // defpackage.j01
    public final void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState) {
        j01 j01Var = this.M;
        if (j01Var != null) {
            j01Var.onPeerConnectionStateChanged(peerConnectionState);
        }
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) throws JSONException {
        String string;
        ArrayList arrayList;
        String string2 = jSONObject.getString("notification");
        string2.getClass();
        if (string2.equals("custom-data")) {
            ng0 ng0Var = this.d.y;
            lg0 lg0Var = ng0Var.d;
            boolean z = ng0Var.c.a;
            final dlb dlbVar = this.K;
            if (!z || dlbVar == null) {
                StringBuilder sb = new StringBuilder("enabled && reporter != null = ");
                sb.append(z);
                sb.append(" && ");
                sb.append(dlbVar != null);
                string = sb.toString();
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sdk");
                    if (jSONObjectOptJSONObject2 == null) {
                        string = "no sdk";
                    } else if (jSONObjectOptJSONObject2.optString("type").equals("bad-net")) {
                        final double dOptDouble = jSONObjectOptJSONObject2.optDouble("bitrate");
                        dlbVar.f.invoke("submit bitrate: " + dOptDouble);
                        j0e j0eVar = dlbVar.h;
                        if (j0eVar != null) {
                            j0eVar.b(new Runnable() { // from class: alb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dlbVar.b.f(dOptDouble);
                                }
                            });
                        }
                        string = "received bad-net: " + jSONObjectOptJSONObject2;
                    } else {
                        string = "type != bad-net";
                    }
                } else {
                    string = "no data";
                }
            }
            lg0Var.b(this.f, "DirectCallTopology", "handleCustomDataNotification: " + string);
            return;
        }
        if (string2.equals("transmitted-data")) {
            ti1 ti1VarV = paj.v(jSONObject);
            yi1 yi1VarW = w(ti1VarV);
            if (yi1VarW == null) {
                this.f.reportException("DirectCallTopology", "transmitted.data.npe", new Exception("td.unknown.participant.in.p2p"));
                return;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.getJSONObject("data").optJSONObject("sdp");
            SessionDescription sessionDescription = jSONObjectOptJSONObject3 != null ? new SessionDescription(SessionDescription.Type.fromCanonicalForm(jSONObjectOptJSONObject3.getString("type")), jSONObjectOptJSONObject3.getString("sdp")) : null;
            if (sessionDescription != null) {
                if (sessionDescription.type == SessionDescription.Type.ANSWER) {
                    k8i k8iVar = (k8i) this.G.get(ti1VarV);
                    if (k8iVar == null) {
                        StringBuilder sb2 = new StringBuilder("no.scheduled.offer.found");
                        if (this.F.get(ti1VarV) != null) {
                            sb2.append(".but.answer.found");
                        }
                        this.f.logException("DirectCallTopology", "answer.invariant", new Exception(sb2.toString()));
                        return;
                    }
                    if (!k8iVar.e) {
                        this.f.logException("DirectCallTopology", "direct.topology.no.offer.for.answer", new Exception("offer.is.not.ready.yet"));
                        return;
                    }
                    if (k8iVar.c != null) {
                        this.f.log("DirectCallTopology", "Answer was already applied from " + yi1VarW);
                        return;
                    }
                    imb imbVarN = paj.n(jSONObject);
                    if (imbVarN != null) {
                        k8iVar.a.put(imbVarN, sessionDescription);
                        V(yi1VarW);
                        return;
                    } else {
                        this.f.log("DirectCallTopology", "sdp=" + jSONObject.toString());
                        this.f.logException("DirectCallTopology", "direct.topology.bad.sdp", new Exception("bad.sdp.answer.from.participant"));
                        return;
                    }
                }
                return;
            }
            vd vdVar = this.E;
            wpb wpbVar = (wpb) this.C.get(ti1VarV);
            ((y6d) vdVar.d).log("IceCandidatesHandler", "handleTransmittedData, " + yi1VarW);
            imb imbVarN2 = paj.n(jSONObject);
            if (imbVarN2 == null) {
                ((y6d) vdVar.d).log("IceCandidatesHandler", "No peer specified for " + yi1VarW);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("candidate");
            IceCandidate iceCandidate = jSONObjectOptJSONObject4 != null ? new IceCandidate(jSONObjectOptJSONObject4.getString("sdpMid"), jSONObjectOptJSONObject4.getInt("sdpMLineIndex"), jSONObjectOptJSONObject4.getString("candidate")) : null;
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("candidates-removed");
            if (jSONArrayOptJSONArray == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                    arrayList2.add(jSONObject3 != null ? new IceCandidate(jSONObject3.getString("sdpMid"), jSONObject3.getInt("sdpMLineIndex"), jSONObject3.getString("candidate")) : null);
                }
                arrayList = arrayList2;
            }
            if (iceCandidate == null && arrayList == null) {
                return;
            }
            Map map = (Map) ((HashMap) vdVar.c).get(yi1VarW);
            if (map == null) {
                map = new HashMap();
                ((HashMap) vdVar.c).put(yi1VarW, map);
            }
            imb imbVar = (imb) map.get(imbVarN2);
            if (imbVar == null) {
                imbVar = new imb(new ArrayList(), new ArrayList());
                map.put(imbVarN2, imbVar);
            }
            if (iceCandidate != null) {
                ((List) imbVar.a).add(iceCandidate);
            }
            if (arrayList != null) {
                ((List) imbVar.b).addAll(arrayList);
            }
            vdVar.b(yi1VarW, wpbVar);
        }
    }

    @Override // defpackage.j01
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        j01 j01Var = this.M;
        if (j01Var != null) {
            j01Var.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    @Override // defpackage.ds1
    public final void p() {
        P("clearRemoteVideoRenderers");
        w0a.f();
        Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            ((wpb) it.next()).j0.d();
        }
    }

    @Override // defpackage.ds1
    public final void q(ti1 ti1Var, SessionDescription sessionDescription) {
        s("createAnswerFor, " + this + ", participant=" + ti1Var + ", " + sessionDescription.type);
        w0a.f();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type != type2) {
            throw new IllegalArgumentException(type2 + " expected, but " + sessionDescription.type + " specified");
        }
        yi1 yi1VarW = w(ti1Var);
        if (yi1VarW == null) {
            throw new IllegalStateException("Participant(" + ti1Var + ") not found");
        }
        HashMap map = this.G;
        k8i k8iVar = (k8i) map.get(ti1Var);
        y6d y6dVar = this.f;
        if (k8iVar != null) {
            if (!k8iVar.e) {
                y6dVar.log("DirectCallTopology", this + ": unexpected offer (is concurrent call?) from " + yi1VarW);
                return;
            }
            y6dVar.log("DirectCallTopology", "Opponent " + ti1Var + " is requesting for renegotiation, let us accept the request, ");
            map.remove(ti1Var);
        }
        HashMap map2 = this.F;
        k8i k8iVar2 = (k8i) map2.get(ti1Var);
        if (k8iVar2 != null) {
            SessionDescription sessionDescription2 = k8iVar2.b;
            if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                y6dVar.reportException("DirectCallTopology", "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                return;
            }
            if (k8iVar2.d) {
                y6dVar.reportException("DirectCallTopology", "repeated.answer", new Exception("repeated.answer.creation"));
                return;
            }
            S(this + ": re-schedule answer creation for " + yi1VarW);
            map2.remove(ti1Var);
        }
        map2.put(ti1Var, new k8i(sessionDescription));
        Y();
    }

    @Override // defpackage.ds1
    public final void r(yi1 yi1Var, boolean z) {
        P("createOfferFor, " + this + ", " + yi1Var);
        w0a.f();
        dj1 dj1Var = this.k;
        dj1Var.getClass();
        if (yi1Var != null) {
            ti1 ti1Var = yi1Var.a;
            if ((ti1Var != null ? dj1Var.j(ti1Var) : null) != null) {
                ti1 ti1Var2 = yi1Var.a;
                HashMap map = this.G;
                k8i k8iVar = (k8i) map.get(ti1Var2);
                if (k8iVar == null) {
                    map.put(yi1Var.a, new k8i(null));
                } else if (k8iVar.d) {
                    this.f.reportException("DirectCallTopology", "offer.scheduled", new Exception("offer.creation.already.scheduled"));
                } else if (z) {
                    S(this + ": re-schedule offer creation for " + yi1Var);
                    k8iVar.e = false;
                } else {
                    S(this + ": offer already created for " + yi1Var);
                }
                Z();
                return;
            }
        }
        throw new IllegalStateException("Participant not found");
    }

    @Override // defpackage.ds1
    public final Runnable t() {
        return this.N;
    }

    @Override // defpackage.ds1
    public final long u() {
        w0a.f();
        Iterator it = this.C.values().iterator();
        if (it.hasNext()) {
            return ((wpb) it.next()).N;
        }
        return -1L;
    }

    @Override // defpackage.ds1
    public final mdg v() {
        return mdg.b;
    }

    @Override // defpackage.ds1
    public final void z(eef eefVar) {
        w0a.f();
        for (Map.Entry entry : this.C.entrySet()) {
            ti1 ti1Var = (ti1) entry.getKey();
            wpb wpbVar = (wpb) entry.getValue();
            nl nlVar = new nl(this, ti1Var, eefVar, 5);
            wpbVar.getClass();
            wpbVar.i(new c(wpbVar, new qpb(wpbVar, 2, nlVar), 0), "getStats.legacy");
        }
    }
}
