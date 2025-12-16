package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class gfe extends ds1 implements mze {
    public final pqg A;
    public final osf B;
    public final kw4 C;
    public final t7c v;
    public final kme w;
    public final pze x;
    public long y;
    public long z;

    public gfe(ffe ffeVar) {
        super(ffeVar.h, ffeVar.g, ffeVar.m, ffeVar.o, ffeVar.p, ffeVar.q, ffeVar.b, ffeVar.v, ffeVar.w, ffeVar.A, ffeVar.z);
        P(this + " ctor");
        pze pzeVar = ffeVar.i;
        this.x = pzeVar;
        this.w = ffeVar.c;
        this.v = ffeVar.r;
        this.n = ffeVar.B;
        pzeVar.k.add(this);
        this.B = new osf();
        pqg pqgVar = new pqg(ffeVar, this);
        this.A = pqgVar;
        this.C = new kw4(ffeVar.o, pqgVar);
    }

    @Override // defpackage.ds1
    public final String A() {
        return "ServerCallTopology";
    }

    @Override // defpackage.ds1
    public final void B(ti1 ti1Var, List list, boolean z, uz0 uz0Var) {
        try {
            this.x.h(paj.q(ti1Var, list, z), uz0Var);
        } catch (JSONException unused) {
            this.f.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4 A[Catch: JSONException -> 0x014a, TryCatch #0 {JSONException -> 0x014a, blocks: (B:12:0x0091, B:17:0x00a8, B:19:0x00c1, B:21:0x00cb, B:22:0x00d5, B:30:0x00e8, B:32:0x00f4, B:35:0x011d, B:39:0x0128, B:34:0x0114, B:26:0x00e1, B:18:0x00ba), top: B:55:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114 A[Catch: JSONException -> 0x014a, TryCatch #0 {JSONException -> 0x014a, blocks: (B:12:0x0091, B:17:0x00a8, B:19:0x00c1, B:21:0x00cb, B:22:0x00d5, B:30:0x00e8, B:32:0x00f4, B:35:0x011d, B:39:0x0128, B:34:0x0114, B:26:0x00e1, B:18:0x00ba), top: B:55:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfe.D():void");
    }

    @Override // defpackage.ds1
    public final void H(ti1 ti1Var, fje fjeVar, boolean z, vz0 vz0Var) {
        try {
            this.x.h(paj.r(ti1Var, fjeVar, z), vz0Var);
        } catch (JSONException unused) {
            this.f.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    @Override // defpackage.ds1
    public final void I() {
        S(this + " release");
        this.a.removeCallbacksAndMessages(null);
        this.x.k.remove(this);
        pqg pqgVar = this.A;
        pqgVar.h();
        pqgVar.r.q(true);
        super.I();
    }

    @Override // defpackage.ds1
    public final void J(long j, long j2) {
        omd omdVar = new omd(j, j2);
        this.d.y.d.b(this.f, "ServerCallTopology", "send report-network-stat: " + omdVar);
        this.A.r.A().d(new hud(new hud(omdVar)));
    }

    @Override // defpackage.ds1
    public final void K(a7d a7dVar) {
        ArrayList arrayListC = lbj.c(a7dVar.c);
        if (arrayListC.isEmpty()) {
            return;
        }
        j9f j9fVar = (j9f) arrayListC.get(0);
        u42 u42VarC = a7dVar.c();
        if (u42VarC != null) {
            ArrayList arrayListE = lbj.e(arrayListC, u42VarC);
            if (!arrayListE.isEmpty()) {
                j9fVar = (j9f) arrayListE.get(0);
            }
        }
        this.d.getClass();
        long j = j9fVar.o;
        if (j == this.y && j9fVar.p == this.z) {
            return;
        }
        long j2 = j9fVar.p;
        if (j2 <= 0 || j <= 0) {
            return;
        }
        this.y = j;
        this.z = j2;
        qmd qmdVar = new qmd(j2, j);
        jud judVarA = this.A.r.A();
        u4e u4eVar = new u4e(5, this);
        hud hudVar = new hud(qmdVar);
        hudVar.c = u4eVar;
        judVarA.d(new hud(hudVar));
    }

    @Override // defpackage.ds1
    public final void L(boolean z) {
        this.A.r.A().d(new hud(new hud(new and(z))));
        pqg pqgVar = this.A;
        pqgVar.t = z;
        pqgVar.r.m = pqgVar.t;
    }

    @Override // defpackage.ds1
    public final void M(wdf wdfVar) {
        pqg pqgVar = this.A;
        if (pqgVar.r != null) {
            wpb wpbVar = pqgVar.r;
            wpbVar.getClass();
            wpbVar.i(new c(wpbVar, new eu3(3, wdfVar), 0), "getStats.new");
        }
    }

    @Override // defpackage.ds1
    public final void O(nt1 nt1Var, List list) {
        pqg pqgVar = this.A;
        if (pqgVar.r.F()) {
            pqgVar.r.j0.p("video-" + nt1Var.b.b(), nt1Var, list);
        }
    }

    @Override // defpackage.ds1
    public final void Q(List list) {
        P("updateDisplayLayouts, " + this);
        this.C.a(list);
        this.B.getClass();
        this.A.p(osf.a(list));
    }

    @Override // defpackage.ds1
    public final void R(zpb zpbVar) {
        pqg pqgVar = this.A;
        pqgVar.n = zpbVar;
        if (pqgVar.r != null) {
            pqgVar.r.J(pqgVar.n);
        }
    }

    @Override // defpackage.ds1, defpackage.mt1
    public final void c(usd usdVar) {
        pqg pqgVar = this.A;
        sbh sbhVar = (sbh) usdVar.b;
        if (pqgVar.r != null) {
            wpb wpbVar = pqgVar.r;
            za4 za4Var = wpbVar.i0;
            if (sbhVar.equals((sbh) ((LinkedHashMap) ((znd) za4Var.i).a).get(Integer.valueOf(sbhVar.c)))) {
                return;
            }
            ((LinkedHashMap) ((znd) za4Var.i).a).put(Integer.valueOf(sbhVar.c), sbhVar);
            wpbVar.C.log("PCRTCClient", "updateVideoQuality, " + wpbVar + " update=" + sbhVar);
            wpbVar.i(new c(wpbVar, new qpb(wpbVar, 1, sbhVar), 0), "updateVideoQuality");
        }
    }

    @Override // defpackage.ds1, defpackage.q8a
    public final void h(r8a r8aVar) {
        pqg pqgVar = this.A;
        pqgVar.r.t(r8aVar);
        pqgVar.w = r8aVar;
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantUpdated(t01 t01Var) {
        onActiveParticipantsRemoved(new s01(t01Var.a, Collections.EMPTY_LIST));
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsAdded(p01 p01Var) {
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsChanged(q01 q01Var) {
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsDeAnonimized(r01 r01Var) {
    }

    @Override // defpackage.ds1, defpackage.u01
    public final void onActiveParticipantsRemoved(s01 s01Var) {
        P("onCallParticipantsRemoved, " + s01Var.a.size());
        for (yi1 yi1Var : s01Var.a) {
            ti1 ti1Var = yi1Var.a;
            if (ti1Var != null) {
                pqg pqgVar = this.A;
                if (pqgVar.r.F()) {
                    pqgVar.r.j0.e(ti1Var, "video-" + ti1Var.b());
                }
            }
            ti1 ti1Var2 = yi1Var.a;
            if (ti1Var2 != null) {
                kw4 kw4Var = this.C;
                Set hashSet = (Set) kw4Var.d.get(ti1Var2);
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hc8 hc8Var = new hc8(5);
                hc8Var.b = ti1Var2;
                hc8Var.c = cdh.a;
                hashSet.add(hc8Var.u());
                hc8 hc8Var2 = new hc8(5);
                hc8Var2.b = ti1Var2;
                hc8Var2.c = cdh.b;
                hashSet.add(hc8Var2.u());
                ife ifeVar = new ife();
                ifeVar.a = true;
                ArrayList arrayList = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jfe((nt1) it.next(), ifeVar));
                }
                atg atgVar = new atg(arrayList, false);
                jud judVarA = kw4Var.b.r.A();
                jw4 jw4Var = new jw4(kw4Var, 2);
                jw4 jw4Var2 = new jw4(kw4Var, 3);
                hud hudVar = new hud(atgVar);
                hudVar.c = jw4Var;
                hudVar.d = jw4Var2;
                judVarA.d(new hud(hudVar));
            }
        }
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) throws JSONException {
        List listUnmodifiableList;
        String string = jSONObject.getString("notification");
        if (!"producer-updated".equals(string)) {
            if ("consumer-answered".equals(string)) {
                this.A.getClass();
                return;
            }
            return;
        }
        pqg pqgVar = this.A;
        pqgVar.getClass();
        pqgVar.f.log("UnifiedPeerConnection", "handleProducerUpdatedNotify, " + pqgVar + " " + jSONObject);
        String string2 = jSONObject.getString("sessionId");
        if (pqgVar.v.contains(string2)) {
            pqgVar.f.log("UnifiedPeerConnection", wy1.h("producer-updated contains expired sessionId: ", string2));
        } else {
            String string3 = jSONObject.getString("description");
            SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string3);
            Matcher matcher = pqg.z.matcher(string3);
            HashSet hashSet = pqgVar.j;
            hashSet.clear();
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            String str = pqgVar.u;
            pqgVar.u = string2;
            if (str == null || str.equals(string2)) {
                if (pqgVar.r.g0 && pqgVar.s != null) {
                    pqgVar.f.log("UnifiedPeerConnection", "producer is stable but offerForProducer exists");
                    pqgVar.s = null;
                }
                if (pqgVar.r.g0) {
                    pqgVar.n("set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + pqgVar.r);
                    pqgVar.r.K(sessionDescription);
                } else {
                    pqgVar.f.log("UnifiedPeerConnection", pqgVar.r + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                    pqgVar.s = sessionDescription;
                }
            } else {
                pqgVar.v.add(str);
                pqgVar.f.log("UnifiedPeerConnection", pqgVar.r + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                pqgVar.s = sessionDescription;
                pqgVar.h();
                pqgVar.c();
                if (pqgVar.r != null) {
                    pqgVar.r.J(pqgVar.n);
                }
                pqgVar.i.e.e = false;
                if (!pqgVar.r.F()) {
                    wpb wpbVar = pqgVar.r;
                    if (pqgVar.a.c) {
                        gfe gfeVar = pqgVar.m;
                        gfeVar.getClass();
                        listUnmodifiableList = Collections.unmodifiableList(new ArrayList(gfeVar.i));
                    } else {
                        listUnmodifiableList = Collections.EMPTY_LIST;
                    }
                    wpbVar.y(listUnmodifiableList);
                }
            }
        }
        P("resendDisplayLayouts, " + this);
        List list = this.C.c;
        this.B.getClass();
        this.A.p(osf.a(list));
        kw4 kw4Var = this.C;
        kw4Var.e = true;
        kw4Var.a(kw4Var.c);
    }

    @Override // defpackage.ds1
    public final Runnable t() {
        ri1 ri1Var = this.d.b;
        return new bee(3, this);
    }

    @Override // defpackage.ds1
    public final mdg v() {
        return mdg.c;
    }

    @Override // defpackage.ds1
    public final Map x() {
        int i;
        n2e n2eVar = this.A.r.d;
        if (n2eVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = n2eVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b9i b9iVar = (b9i) entry.getValue();
            if (b9iVar != null) {
                uh4 uh4Var = b9iVar.g;
                long j = b9iVar.l.get();
                long j2 = b9iVar.m.get();
                long j3 = b9iVar.n.get();
                long j4 = b9iVar.o.get();
                Iterator it2 = it;
                long j5 = b9iVar.p.get();
                long j6 = b9iVar.q.get();
                long j7 = b9iVar.r.get();
                long j8 = b9iVar.s.get();
                long j9 = b9iVar.t.get();
                long j10 = b9iVar.y.get();
                long j11 = b9iVar.z.get();
                g9g g9gVar = b9iVar.u;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                g9gVar.getClass();
                long j12 = (long) g9gVar.b.b;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                double dConvert = timeUnit.convert(j12, timeUnit2);
                g9g g9gVar2 = b9iVar.v;
                g9gVar2.getClass();
                double dConvert2 = timeUnit.convert((long) g9gVar2.b.b, timeUnit2);
                g9g g9gVar3 = b9iVar.w;
                g9gVar3.getClass();
                double dConvert3 = timeUnit.convert((long) g9gVar3.b.b, timeUnit2);
                g9g g9gVar4 = b9iVar.x;
                g9gVar4.getClass();
                double dConvert4 = timeUnit.convert((long) g9gVar4.b.b, timeUnit2);
                if (uh4Var != null && (i = uh4Var.X) != 1 && i != 2) {
                    throw null;
                }
                if (uh4Var != null) {
                    uh4Var.w0.get();
                }
                if (uh4Var != null) {
                    uh4Var.x0.get();
                }
                map.put((ti1) entry.getKey(), new o2e(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, dConvert, dConvert2, dConvert3, dConvert4, (yk6) b9iVar.A.c));
                it = it2;
            }
        }
        return map;
    }

    @Override // defpackage.ds1
    public final void z(eef eefVar) {
        z9a z9aVar = new z9a(this, 23, eefVar);
        pqg pqgVar = this.A;
        if (pqgVar.r != null) {
            wpb wpbVar = pqgVar.r;
            wpbVar.getClass();
            wpbVar.i(new c(wpbVar, new qpb(wpbVar, 2, z9aVar), 0), "getStats.legacy");
        }
    }
}
