package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.m;
import ru.ok.android.externcalls.sdk.p;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.android.webrtc.model.exception.ServiceUnavailableException;

/* loaded from: classes2.dex */
public final class k01 implements je8, NetworkMonitor.NetworkObserver, sdg {
    public long A;
    public final y8g A0;
    public long B;
    public final h1e B0;
    public int C0;
    public ti1 D0;
    public List E0;
    public List F;
    public volatile boolean F0;
    public final sf1 G0;
    public boolean H;
    public final bwf H0;
    public final int I;
    public final mc5 I0;
    public boolean J;
    public final v32 J0;
    public m07 K;
    public final sa9 K0;
    public boolean L;
    public final v17 L0;
    public final lqh M;
    public final y87 M0;
    public final lqh N;
    public final fr1 N0;
    public final b7d O;
    public final f0f O0;
    public final y6d P;
    public final j35 P0;
    public final kg0 Q;
    public final hfd Q0;
    public final boolean R;
    public final qf1 R0;
    public final xo8 S0;
    public final kp1 T0;
    public boolean U;
    public final bwf U0;
    public p V;
    public final bwf V0;
    public j01 W;
    public final bwf W0;
    public boolean X;
    public final s06 X0;
    public m Y;
    public final boolean Y0;
    public final bwf Z;
    public final ys4 Z0;
    public boolean a;
    public long a0;
    public ecf a1;
    public aia b;
    public final py0 b1;
    public final ExecutorService c;
    public final fo4 c1;
    public final ExecutorService d;
    public volatile boolean d1;
    public final mw6 e0;
    public final jkc e1;
    public final rve f0;
    public final xt4 f1;
    public final sz0 g;
    public final ove g0;
    public zpb g1;
    public final d91 h;
    public final f54 h0;
    public zpb h1;
    public final wd8 i0;
    public final i0g i1;
    public final t7c j0;
    public pze k;
    public final dj1 k0;
    public final Context m;
    public final CopyOnWriteArraySet m0;
    public final si1 n;
    public boolean n0;
    public final qi1 o;
    public ds1 o0;
    public String p;
    public final vgd p0;
    public boolean q;
    public ds1 q0;
    public final EglBase r;
    public us4 r0;
    public final ah1 s;
    public volatile f01 s0;
    public boolean t0;
    public boolean u;
    public final r8a u0;
    public boolean v;
    public final cs0 v0;
    public final boolean w;
    public boolean w0;
    public final p64 x;
    public final y6i x0;
    public final boolean y;
    public final zh y0;
    public String z;
    public final li z0;
    public final mze e = new zz0(this, 1);
    public final mze f = new zz0(this, 2);
    public final i9i i = new i9i(this);
    public final d01 j = new d01(this);
    public final Handler l = new Handler(Looper.getMainLooper());
    public final EnumSet t = EnumSet.noneOf(i01.class);
    public boolean C = false;
    public final thg D = new thg(5, this);
    public boolean E = false;
    public final ArrayList G = new ArrayList();
    public boolean S = true;
    public boolean T = true;
    public final o9i b0 = new o9i(this);
    public final t9i c0 = new t9i(this);
    public final kme d0 = new kme(9, this);
    public final CopyOnWriteArraySet l0 = new CopyOnWriteArraySet();

    public k01(Context context, si1 si1Var, boolean z, boolean z2, yi1 yi1Var, p64 p64Var, b7d b7dVar, y6d y6dVar, z6d z6dVar, hqa hqaVar, btd btdVar, li liVar, y8g y8gVar, CallAnalyticsSender callAnalyticsSender, t7c t7cVar, h1e h1eVar, d91 d91Var) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.m0 = copyOnWriteArraySet;
        this.C0 = 0;
        this.i1 = new i0g();
        this.A0 = y8gVar;
        qf1 qf1Var = new qf1();
        this.R0 = qf1Var;
        xo8 xo8Var = new xo8(qf1Var);
        this.S0 = xo8Var;
        final dj1 dj1Var = new dj1(yi1Var, qf1Var, xo8Var, y6dVar);
        this.k0 = dj1Var;
        this.n = si1Var;
        qi1 qi1Var = si1Var.z;
        this.o = qi1Var;
        this.Z = new bwf(new l(25));
        this.v = z;
        this.w = z2;
        r8a r8aVar = yi1Var.c;
        this.u0 = r8aVar;
        this.v0 = new cs0();
        this.x = p64Var;
        this.h = d91Var;
        this.y = d91Var.b;
        this.O = b7dVar;
        this.P = y6dVar;
        enb enbVar = new enb(y6dVar, 18);
        this.j0 = t7cVar;
        this.Y0 = si1Var.i;
        y6i y6iVar = new y6i(22);
        this.x0 = y6iVar;
        this.I0 = new mc5(6, y6dVar);
        ng0 ng0Var = si1Var.y;
        this.Q = new kg0(ng0Var.a != null, ng0Var.c.a);
        this.J0 = new v32(2, y6dVar);
        final int i = 0;
        final int i2 = 1;
        this.M0 = new y87(y6dVar, enbVar, new em6(this) { // from class: b01
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.b.o0.z((eef) obj);
                        break;
                    case 1:
                        this.b.o0.M((wdf) obj);
                        break;
                    case 2:
                        this.b.o0.z((eef) obj);
                        break;
                    default:
                        this.b.o0.M((wdf) obj);
                        break;
                }
                return qqg.a;
            }
        }, new em6(this) { // from class: b01
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.o0.z((eef) obj);
                        break;
                    case 1:
                        this.b.o0.M((wdf) obj);
                        break;
                    case 2:
                        this.b.o0.z((eef) obj);
                        break;
                    default:
                        this.b.o0.M((wdf) obj);
                        break;
                }
                return qqg.a;
            }
        }, new pz0(this), y8gVar);
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext;
        NetworkMonitor.init(applicationContext);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        vgd vgdVar = new vgd(8, new rz0(this, 4));
        this.p0 = vgdVar;
        fr1 fr1Var = (fr1) new gr1(applicationContext, new i21(b7dVar, callAnalyticsSender), y8gVar, connectivityManager, telephonyManager, y6dVar, vgdVar, p64Var, si1Var).b.getValue();
        this.N0 = fr1Var;
        Objects.requireNonNull(fr1Var);
        this.g = new sz0(fr1Var, 0);
        copyOnWriteArraySet.add(fr1Var);
        fr1Var.m.c.getClass();
        y6dVar.log("OKRTCCall", "Call<init> caller = " + z + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        this.o0 = new m65(dj1Var, si1Var, y6dVar, b7dVar, qf1Var, y8gVar);
        vgdVar.b = new rz0(this, 5);
        this.e0 = new mw6(si1Var, y6dVar, b7dVar, yi1Var);
        x("rtc.init.sw.codec.false");
        StringBuilder sb = new StringBuilder("rtc.abi.");
        sb.append(Build.CPU_ABI);
        x(sb.toString());
        jkc jkcVar = new jkc(y6dVar, b7dVar);
        this.e1 = jkcVar;
        qk3 qk3VarH = new kk3(2, new tv0(1, jkcVar)).h(u0e.a());
        n42 n42Var = new n42(1);
        qk3VarH.f(n42Var);
        ((zl3) jkcVar.c).a(n42Var);
        EglBase eglBaseCreate = EglBase.create();
        this.r = eglBaseCreate;
        y6dVar.log("OKRTCCall", w0a.c(eglBaseCreate) + " was created");
        this.s = new ah1(y6dVar, eglBaseCreate.getEglBaseContext(), EglBase.CONFIG_PLAIN, null);
        int numberOfCameras = Camera.getNumberOfCameras();
        this.I = numberOfCameras;
        w(hcf.callDevices, numberOfCameras + "_1");
        this.M = new lqh("pc_created", y6dVar);
        this.N = new lqh("accepted", y6dVar);
        ys4 ys4Var = new ys4(y6dVar);
        this.Z0 = ys4Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.c = executorServiceNewSingleThreadExecutor;
        this.d = Executors.newSingleThreadExecutor();
        rve rveVar = new rve(executorServiceNewSingleThreadExecutor, eglBaseCreate, y6dVar, si1Var, ys4Var, fr1Var.j);
        this.f0 = rveVar;
        wd8 wd8Var = new wd8(context, y6dVar);
        this.i0 = wd8Var;
        fo4 fo4Var = new fo4(context);
        fo4Var.d = si1Var.g;
        fo4Var.b = hqaVar;
        fo4Var.o = wd8Var;
        fo4Var.a = qi1Var.a;
        fo4Var.c = y6dVar;
        if (hqaVar == null) {
            throw new IllegalStateException();
        }
        f54 f54Var = new f54(fo4Var);
        this.h0 = f54Var;
        awd awdVar = new awd(9, this);
        mve mveVar = new mve();
        mveVar.a = rveVar;
        mveVar.b = f54Var;
        mveVar.i = Integer.valueOf(qi1Var.e);
        mveVar.c = r8aVar;
        mveVar.d = context;
        mveVar.e = y6dVar;
        mveVar.j = true;
        mveVar.k = eglBaseCreate.getEglBaseContext();
        mveVar.f = si1Var;
        mveVar.g = new pz0(this);
        mveVar.l = wd8Var;
        mveVar.n = btdVar;
        mveVar.m = y8gVar;
        mveVar.o = new xtd(9, enbVar);
        mveVar.h = awdVar;
        ove oveVarA = mveVar.a();
        this.g0 = oveVarA;
        oveVarA.n.add(this);
        znd zndVar = new znd(this);
        oveVarA.w = zndVar;
        if (oveVarA.o != null) {
            oveVarA.o.x = zndVar;
        }
        final int i3 = 0;
        r8aVar.b(new q8a(this) { // from class: tz0
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // defpackage.q8a
            public final void h(r8a r8aVar2) {
                switch (i3) {
                    case 0:
                        r7 r7Var = this.b.N0.m;
                        boolean z3 = r8aVar2.f;
                        t7 t7Var = r7Var.b;
                        if (!z3) {
                            t7Var.a();
                            break;
                        } else if (!t7Var.b) {
                            t7Var.b = true;
                            t7Var.a = ((y8g) t7Var.c).getMsSinceBoot();
                            break;
                        }
                        break;
                    default:
                        r7 r7Var2 = this.b.N0.m;
                        boolean z4 = r8aVar2.f;
                        t7 t7Var2 = r7Var2.b;
                        if (!z4) {
                            t7Var2.a();
                            break;
                        } else if (!t7Var2.b) {
                            t7Var2.b = true;
                            t7Var2.a = ((y8g) t7Var2.c).getMsSinceBoot();
                            break;
                        }
                        break;
                }
            }
        });
        r8aVar.b(new nb4(new oz0(dj1Var, 0)));
        AndroidVideoDecoder.errorCallback = new pz0(this);
        NetworkMonitor.getInstance().addObserver(this);
        this.R = si1Var.f;
        this.H0 = new bwf(new m3(y6dVar, 6, z6dVar));
        this.K0 = new sa9(new i40(new hfd(14, this), new zid(this), y6dVar, si1Var));
        this.L0 = new v17(29, (byte) 0);
        this.y0 = new zh(this, rveVar, y6dVar, y6iVar, liVar, r8aVar, eglBaseCreate);
        liVar.j(new m3(this, 7, liVar));
        final int i4 = 0;
        sf1 sf1Var = new sf1(dj1Var, y6dVar, new qk(1, this), new kk4(29), new cm6() { // from class: qz0
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return dj1Var.k;
                    default:
                        return Integer.valueOf(dj1Var.q());
                }
            }
        }, wd8Var, si1Var);
        this.G0 = sf1Var;
        f0f f0fVar = new f0f(y6dVar, yi1Var, sf1Var);
        this.O0 = f0fVar;
        kp1 kp1Var = new kp1(y6dVar, dj1Var, xo8Var, sf1Var, qf1Var, new xt4(f0fVar.g, 20, new rz0(this, 8)), new xo8(f0fVar.o, 20, new rz0(this, 9)), y8gVar);
        this.T0 = kp1Var;
        this.P0 = new j35(kp1Var, dj1Var, f0fVar, new qk(1, this), qf1Var, y6dVar, si1Var);
        this.Q0 = new hfd(qf1Var);
        this.U0 = new bwf(new rz0(this, 0));
        this.V0 = new bwf(new rz0(this, 1));
        this.W0 = new bwf(new m3(this, 8, y8gVar));
        final int i5 = 1;
        v06 v06Var = new v06(fr1Var.j, enbVar, y8gVar, z, z2, qi1Var.w, new i6(18, yi1Var), vgdVar, new cm6() { // from class: qz0
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return dj1Var.k;
                    default:
                        return Integer.valueOf(dj1Var.q());
                }
            }
        }, y6dVar);
        this.X0 = v06Var.b;
        ((CopyOnWriteArraySet) qf1Var.c.b).add(v06Var.c);
        this.b1 = new py0(6, this);
        this.B0 = h1eVar;
        fo4 fo4Var2 = new fo4(y6dVar, new rz0(this, 3));
        this.c1 = fo4Var2;
        fo4Var2.X = new oz0(dj1Var, 1);
        D(200L, new zih(new xtd(8, fo4Var2)));
        this.f1 = new xt4(7, y6dVar);
    }

    public static boolean v(yi1 yi1Var) {
        for (wi1 wi1Var : yi1Var.e) {
            if (wi1Var == wi1.b || wi1Var == wi1.a) {
                return true;
            }
        }
        return false;
    }

    public final void A(ds1 ds1Var, PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.P.log("OKRTCCall", "handleTopologyIceConnectionChange, " + ds1Var + ", state=" + iceConnectionState);
        w(hcf.callIceConnectionState, iceConnectionState.toString());
        if (ds1Var != this.o0) {
            if (ds1Var != this.q0) {
                this.P.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
                return;
            }
            return;
        }
        boolean z = iceConnectionState == PeerConnection.IceConnectionState.CONNECTED;
        ss3 ss3Var = this.N0.k;
        if (ss3Var.j != z) {
            ss3Var.j = z;
            if (z) {
                ss3Var.a();
            } else {
                dq0 dq0Var = ss3Var.d;
                dq0Var.b = 0L;
                dq0Var.c = 0L;
                hk8 hk8Var = ss3Var.f;
                hk8Var.a = 0L;
                hk8Var.b = 0L;
                ss3Var.g = 1.0d;
                ss3Var.e = 0.0d;
            }
        }
        if (!z) {
            if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
                if (this.E) {
                    this.A = (SystemClock.elapsedRealtime() - this.B) + this.A;
                }
                this.E = false;
                l(x71.b, null);
                return;
            }
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                ds1 ds1Var2 = this.o0;
                mdg mdgVar = mdg.c;
                if (ds1Var2.E(mdgVar) && NetworkMonitor.isOnline() && (i = this.C0) < 3) {
                    this.C0 = i + 1;
                    f(mdgVar, true);
                    d(this.o0);
                }
                this.l.removeCallbacks(this.D);
                boolean zE = ds1Var.E(mdg.b);
                if (!(this.z == null && this.a0 == 0 && this.h.a) && zE) {
                    return;
                }
                Handler handler = this.l;
                thg thgVar = this.D;
                ri1 ri1Var = this.n.b;
                handler.postDelayed(thgVar, 30000);
                return;
            }
            return;
        }
        fr1 fr1Var = this.N0;
        cr1 cr1Var = fr1Var.h;
        cr1Var.h.q();
        cr1Var.i.s();
        py0 py0Var = (py0) cr1Var.k.c;
        py0Var.b = null;
        py0Var.c = null;
        cr1Var.j.reset();
        ka5 ka5Var = cr1Var.l;
        ((kce) ka5Var.a).b = null;
        ((kce) ka5Var.b).b = null;
        ((kme) fr1Var.g.o).b = null;
        this.E = true;
        if (this.S) {
            final fde fdeVar = this.N0.f;
            fdeVar.getClass();
            long jU = ds1Var.u();
            if (jU != -1) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - jU;
                ds1Var.z(new eef() { // from class: br1
                    @Override // defpackage.eef
                    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, os0[] os0VarArr, Map map, ds1 ds1Var3) {
                        fde fdeVar2 = fdeVar;
                        v6d v6dVar = new v6d((y6d) fdeVar2.d, statsReportArr);
                        HashMap map2 = new HashMap();
                        b7d b7dVar = (b7d) ((i21) fdeVar2.a).d;
                        map2.put("vcid", b7dVar.conversationId);
                        String str = (String) v6dVar.d;
                        if (str == null) {
                            str = "";
                        }
                        map2.put("local_connection_type", str);
                        String str2 = (String) v6dVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        map2.put("remote_connection_type", str2);
                        String str3 = (String) v6dVar.o;
                        if (str3 == null) {
                            str3 = "";
                        }
                        map2.put("local_address", str3);
                        String str4 = (String) v6dVar.X;
                        map2.put("remote_address", str4 != null ? str4 : "");
                        map2.put("network_type", w0a.b((ConnectivityManager) fdeVar2.b, (TelephonyManager) fdeVar2.c));
                        map2.put("stat_time_delta", String.valueOf(jElapsedRealtime));
                        b7dVar.log(b7d.COLLECTOR_WEBRTC, "callStatConnect", map2);
                    }
                });
            }
        }
        this.S = false;
        this.B = SystemClock.elapsedRealtime();
        l(x71.a, null);
        this.l.removeCallbacks(this.D);
        if (this.R) {
            kg0 kg0Var = this.Q;
            kg0Var.c.b = 0.0d;
            kg0Var.b.b = 0.0d;
            kg0Var.m = false;
            kg0Var.p = Double.NaN;
            kg0Var.o = Double.NaN;
            kg0Var.a();
        }
        this.C0 = 0;
        ds1 ds1Var3 = this.q0;
        if (ds1Var3 != null) {
            ds1Var3.I();
            this.q0 = null;
        }
    }

    public final void B(ds1 ds1Var) throws JSONException {
        if (ds1Var.E(mdg.b)) {
            this.P.log("OKRTCCall", "onTopologyUpgradeProposed");
            pze pzeVar = this.k;
            fr6 fr6VarB = paj.b(null, "switch-topology");
            JSONObject jSONObject = fr6VarB.a;
            try {
                jSONObject.put("topology", "SERVER");
                jSONObject.put("force", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            pzeVar.i(fr6VarB);
            Handler handler = this.l;
            thg thgVar = this.D;
            handler.removeCallbacks(thgVar);
            ri1 ri1Var = this.n.b;
            handler.postDelayed(thgVar, 30000);
        }
    }

    public final void C() {
        this.P.log("OKRTCCall", "onUserAnswered");
        if (this.F0) {
            if (!((k01) this.b1.b).t.contains(i01.o)) {
                return;
            }
            py0 py0Var = this.b1;
            k01 k01Var = (k01) py0Var.b;
            if (k01Var.k0.i().isEmpty()) {
                if (((lnb) py0Var.c) == null) {
                    lnb lnbVar = new lnb(py0Var);
                    ((CopyOnWriteArraySet) k01Var.R0.c.b).add(lnbVar);
                    py0Var.c = lnbVar;
                    return;
                }
                return;
            }
        }
        py0 py0Var2 = this.b1;
        lnb lnbVar2 = (lnb) py0Var2.c;
        if (lnbVar2 != null) {
            ((CopyOnWriteArraySet) ((k01) py0Var2.b).R0.c.b).remove(lnbVar2);
            py0Var2.c = null;
        }
        boolean z = this.w0;
        this.w0 = true;
        if (j()) {
            this.n0 = true;
            yi1 yi1Var = this.k0.a;
            boolean z2 = !z && yi1Var.c();
            if (yi1Var.c()) {
                J();
            } else {
                yi1Var.g(yi1.t);
                I();
            }
            if (z2) {
                d(this.o0);
                l(x71.t0, null);
            }
        }
    }

    public final void D(long j, nz9 nz9Var) {
        rve rveVar = this.f0;
        rveVar.a.execute(new nh2(rveVar, nz9Var, j, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(boolean r8) {
        /*
            r7 = this;
            x71 r0 = defpackage.x71.o
            boolean r1 = r7.j()
            if (r1 != 0) goto La
            goto L83
        La:
            ds1 r1 = r7.o0
            mdg r2 = defpackage.mdg.c
            boolean r1 = r1.E(r2)
            if (r1 == 0) goto L83
            r1 = 0
            if (r8 == 0) goto L3c
            ove r8 = r7.g0
            r8a r2 = r7.u0
            boolean r2 = r2.c
            ie8 r8 = r8.o
            if (r8 == 0) goto L3c
            if (r2 == 0) goto L2e
            i1e r8 = r8.t
            if (r8 == 0) goto L3c
            org.webrtc.ScreenCapturerAndroid r8 = r8.a
            android.media.projection.MediaProjection r8 = r8.getMediaProjection()
            goto L3d
        L2e:
            q2e r8 = r8.u
            if (r8 != 0) goto L33
            goto L3c
        L33:
            mj6 r8 = r8.d
            org.webrtc.ScreenCapturerAndroid r8 = r8.X
            android.media.projection.MediaProjection r8 = r8.getMediaProjection()
            goto L3d
        L3c:
            r8 = r1
        L3d:
            if (r8 == 0) goto L61
            rve r2 = r7.f0
            ove r3 = r7.g0
            java.util.concurrent.ExecutorService r4 = r2.a
            zcd r5 = new zcd
            r6 = 6
            r5.<init>(r2, r3, r8, r6)
            r4.execute(r5)
            r8a r8 = r7.u0
            boolean r2 = r8.b
            if (r2 == 0) goto L60
            r2 = 1
            r8.d = r2
            r8.a()
            r7.J()
            r7.l(r0, r1)
        L60:
            return
        L61:
            rve r8 = r7.f0
            ove r2 = r7.g0
            java.util.concurrent.ExecutorService r3 = r8.a
            aee r4 = new aee
            r5 = 10
            r4.<init>(r8, r5, r2)
            r3.execute(r4)
            r8a r8 = r7.u0
            boolean r2 = r8.b
            if (r2 == 0) goto L83
            r2 = 0
            r8.d = r2
            r8.a()
            r7.J()
            r7.l(r0, r1)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k01.E(boolean):void");
    }

    public final void F(boolean z) {
        if (j()) {
            if (!z) {
                if (!this.i0.c && this.i0.a() && this.i0.c) {
                    rve rveVar = this.f0;
                    rveVar.a.execute(new qve(rveVar, 0));
                } else if (wpb.D()) {
                    rve rveVar2 = this.f0;
                    rveVar2.a.execute(new qve(rveVar2, 0));
                }
            }
            sf1 sf1Var = this.G0;
            if (z) {
                sf1Var.getClass();
            } else {
                if (!sf1Var.e.c) {
                    return;
                }
                if (!sf1.d(new tv(0, 11, p8a.class, sf1Var.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            }
            rve rveVar3 = this.f0;
            rveVar3.a.execute(new pve(rveVar3, z, 1));
            r8a r8aVar = this.u0;
            boolean z2 = !z;
            if (r8aVar.e != z2) {
                r8aVar.e = z2;
                r8aVar.a();
            }
            J();
        }
    }

    public final void G(final aia aiaVar) {
        final rve rveVar = this.f0;
        if (rveVar == null) {
            return;
        }
        boolean z = aiaVar.c;
        boolean z2 = aiaVar.d;
        boolean z3 = aiaVar.b;
        final boolean z4 = false;
        if (this.U) {
            z |= z2;
            z3 |= z2;
            z2 = false;
        }
        final boolean z5 = z;
        boolean z6 = z3;
        this.b = aiaVar;
        this.P.log("OKRTCCall", "new debug params " + aiaVar);
        final String str = aiaVar.f;
        if (!this.U && z2 && str != null) {
            z4 = true;
        }
        this.c.execute(new Runnable() { // from class: a01
            @Override // java.lang.Runnable
            public final void run() {
                k01 k01Var = this.a;
                aia aiaVar2 = aiaVar;
                rve rveVar2 = rveVar;
                boolean z7 = z5;
                boolean z8 = z4;
                String str2 = str;
                Runnable runnable = aiaVar2.m;
                rveVar2.a.execute(new pve(rveVar2, z7, 0));
                rveVar2.d.setPreprocessorParams(z8, aiaVar2.e, str2, aiaVar2.g, aiaVar2.h, aiaVar2.i, aiaVar2.j, aiaVar2.k, aiaVar2.l, z8 ? new c01(k01Var, runnable, 0) : new mc(6));
            }
        });
        boolean z7 = aiaVar.a;
        cs0 cs0Var = this.v0;
        cs0Var.a = z7;
        cs0Var.b = z6;
        this.k.i(new uze(cs0Var));
    }

    public final void H(ti1 ti1Var) {
        int i = 26;
        this.k0.f(new bnb(ti1Var, new uha(i), new uha(i), new uha(i), new uha(i), new uha(i), new uha(i), new uha(i), new uha(i)), dje.a);
    }

    public final void I() throws JSONException {
        this.L0.getClass();
        d0f d0fVarJ = v17.j(this.u0);
        ((i40) this.K0.a).h = d0fVarJ;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "accept-call");
            jSONObject.put("mediaSettings", paj.m(d0fVarJ, false, false));
            this.k.h(new fr6(jSONObject), new zz0(this, 0));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void J() {
        this.P.log("OKRTCCall", "sendMediaSettingsChange");
        this.L0.getClass();
        ((lqc) this.K0.b).f(v17.j(this.u0));
    }

    public final void K() {
        if (this.C) {
            this.P.log("OKRTCCall", "Can't start interaction twice. Ignore");
            return;
        }
        this.C = true;
        J();
        Iterator it = this.k0.i().iterator();
        while (it.hasNext()) {
            this.o0.r((yi1) it.next(), true);
        }
        w(hcf.callStart, this.y ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    @Override // defpackage.sdg
    public final void a(odg odgVar) {
        this.R0.v.a(odgVar);
    }

    @Override // defpackage.je8
    public final void b(ie8 ie8Var) {
        this.P.log("OKRTCCall", "onLocalMediaStreamChanged, " + w0a.c(ie8Var));
        this.l.post(new nz0(this, 4));
    }

    public final void c(i01 i01Var) {
        int i = h9i.a[i01Var.ordinal()];
        l(i != 1 ? i != 2 ? i != 3 ? i != 4 ? x71.O0 : x71.N0 : x71.M0 : x71.L0 : x71.K0, null);
    }

    public final void d(ds1 ds1Var) {
        String str = "maybeSetTopologyState, " + ds1Var + ", state=" + ds1.y(1);
        y6d y6dVar = this.P;
        y6dVar.log("OKRTCCall", str);
        if (!this.X) {
            y6dVar.log("OKRTCCall", "cant set " + ds1Var + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.v) {
            if (!this.n0) {
                y6dVar.log("OKRTCCall", "cant set " + ds1Var + " to active state, conversation is not started yet");
                return;
            }
            if (!this.w0) {
                y6dVar.log("OKRTCCall", "cant set " + ds1Var + " to active state, user is not accepted call yet");
                return;
            }
        }
        ds1Var.N(this.F);
        w0a.f();
        if (true != ds1Var.q) {
            ds1Var.q = true;
            ds1Var.C();
        }
        w0a.f();
        if (1 != ds1Var.p) {
            ds1Var.p = 1;
            ds1Var.D();
        }
        this.u0.a();
    }

    public final void e(m07 m07Var) {
        this.P.log("OKRTCCall", "hangup, " + w0a.c(m07Var) + ", unknown");
        w0a.f();
        w(hcf.callHangup, m07Var.toString());
        if (this.k == null) {
            q(m07Var, "hangup." + m07Var + ".unknown");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IceCandidatePairChangedStat.KEY_REASON, m07Var.toString());
            pze pzeVar = this.k;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("command", "hangup");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                pzeVar.q = false;
                w0a.f();
                bee beeVar = new bee(7, pzeVar);
                pzeVar.c.postDelayed(beeVar, 8000L);
                pzeVar.d(new fr6(jSONObject2), true, new v8i(pzeVar, beeVar), null);
                this.T = false;
                q(m07Var, "hangup." + m07Var + ".unknown");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void f(mdg mdgVar, boolean z) {
        mdg mdgVar2;
        y8g y8gVar;
        us8 us8Var;
        ds1 gfeVar;
        boolean z2;
        us8 us8Var2;
        mdg mdgVar3 = mdg.c;
        mdg mdgVarV = this.o0.v();
        this.Z0.b(this.o0);
        ds1 ds1Var = this.q0;
        if (ds1Var != null) {
            ds1Var.I();
            this.q0 = null;
        }
        if (this.o0.E(mdgVar)) {
            this.o0.I();
        } else {
            this.q0 = this.o0;
        }
        y87 y87Var = this.M0;
        qf1 qf1Var = this.R0;
        zh zhVar = this.y0;
        y6i y6iVar = this.x0;
        ove oveVar = this.g0;
        kme kmeVar = this.d0;
        EglBase eglBase = this.r;
        ExecutorService executorService = this.c;
        rve rveVar = this.f0;
        s06 s06Var = this.X0;
        b7d b7dVar = this.O;
        i9i i9iVar = this.i;
        r8a r8aVar = this.u0;
        mdg mdgVar4 = mdgVar3;
        dj1 dj1Var = this.k0;
        Context context = this.m;
        y8g y8gVar2 = this.A0;
        si1 si1Var = this.n;
        y6d y6dVar = this.P;
        mdg mdgVar5 = mdg.b;
        if (mdgVar == mdgVar5) {
            zw4 zw4Var = new zw4();
            mdgVar2 = mdgVar5;
            zw4Var.n = false;
            zw4Var.e = context;
            zw4Var.h = dj1Var;
            zw4Var.g = r8aVar;
            zw4Var.i = this.k;
            zw4Var.s = i9iVar;
            zw4Var.l = b7dVar;
            zw4Var.k = y6dVar;
            zw4Var.m = s06Var;
            zw4Var.j = si1Var;
            zw4Var.a = rveVar;
            zw4Var.d = executorService;
            zw4Var.f = eglBase;
            zw4Var.c = kmeVar;
            zw4Var.b = oveVar;
            zw4Var.n = this.h.c;
            zw4Var.o = y6iVar;
            zw4Var.p = zhVar;
            zw4Var.q = qf1Var;
            zw4Var.t = y8gVar2;
            if (((os0) si1Var.s.b).a) {
                if (this.a1 == null) {
                    this.a1 = new ecf(y87Var, y6dVar, si1Var.y.a != null);
                }
                us8Var2 = new us8(this.a1, (ss8) ((os0) si1Var.s.b).b, y8gVar2, y6dVar);
            } else {
                us8Var2 = null;
            }
            zw4Var.r = us8Var2;
            zw4Var.u = this;
            zw4Var.v = this;
            zw4Var.w = this.W;
            if (zw4Var.a == null || zw4Var.e == null || zw4Var.h == null || zw4Var.g == null || zw4Var.i == null || zw4Var.j == null || zw4Var.k == null || zw4Var.l == null || zw4Var.f == null || zw4Var.c == null || zw4Var.b == null || zw4Var.o == null || zw4Var.q == null || zw4Var.t == null) {
                throw new IllegalStateException();
            }
            gfeVar = new ax4(zw4Var);
        } else {
            mdgVar2 = mdgVar5;
            if (mdgVar != mdgVar4) {
                throw new IllegalArgumentException("Unsupported topology: " + mdgVar);
            }
            ffe ffeVar = new ffe();
            mdgVar4 = mdgVar4;
            ArrayList arrayList = ffeVar.k;
            ffeVar.e = context;
            ffeVar.h = dj1Var;
            ffeVar.g = r8aVar;
            ffeVar.i = this.k;
            ffeVar.j.add(new kud(y6dVar));
            arrayList.add(i9iVar);
            arrayList.add(new qud(y6dVar));
            ffeVar.p = b7dVar;
            ffeVar.q = s06Var;
            ffeVar.o = y6dVar;
            ffeVar.m = si1Var;
            ffeVar.n = (dd3) this.Z.getValue();
            ffeVar.a = rveVar;
            ffeVar.d = executorService;
            ffeVar.f = eglBase;
            ffeVar.c = kmeVar;
            ffeVar.b = oveVar;
            ffeVar.r = this.j0;
            ffeVar.s = z;
            ffeVar.t = y6iVar;
            ffeVar.u = zhVar;
            ffeVar.v = qf1Var;
            ffeVar.x = (l2e) this.W0.getValue();
            ffeVar.l.add(this.j);
            ffeVar.D = this.o.A;
            if (((os0) si1Var.s.c).a) {
                if (this.a1 == null) {
                    this.a1 = new ecf(y87Var, y6dVar, si1Var.y.a != null);
                }
                y8gVar = y8gVar2;
                us8Var = new us8(this.a1, (ss8) ((os0) si1Var.s.c).b, y8gVar, y6dVar);
            } else {
                y8gVar = y8gVar2;
                us8Var = null;
            }
            ffeVar.w = us8Var;
            ffeVar.y = si1Var.v;
            ffeVar.z = y8gVar;
            ffeVar.A = this.B0;
            ffeVar.B = this;
            ffeVar.C = this.W;
            if (ffeVar.e == null || ffeVar.h == null || ffeVar.g == null || ffeVar.i == null || ffeVar.m == null || ffeVar.o == null || ffeVar.p == null || ffeVar.f == null || ffeVar.c == null || ffeVar.b == null || ffeVar.t == null || ffeVar.v == null || y8gVar == null) {
                throw new IllegalStateException();
            }
            gfeVar = new gfe(ffeVar);
        }
        this.p0.b = new rz0(this, 11);
        gfeVar.N(this.F);
        this.o0 = gfeVar;
        ys4 ys4Var = this.Z0;
        us8 us8Var3 = gfeVar.m;
        ((y6d) ys4Var.a).log("MediaAdaptation", "Set new condition provider source. Is null = " + (us8Var3 == null));
        us8 us8Var4 = (us8) ys4Var.c;
        if (us8Var4 != null) {
            us8Var4.i.remove((xs4) ys4Var.o);
        }
        ys4Var.c = us8Var3;
        if (us8Var3 == null) {
            z2 = true;
            os8 os8Var = new os8(1, new ps8(0.0d, 0.0d), null, true);
            ((y6d) ys4Var.a).log("MediaAdaptation", "Since there are no new provider, trigger state change to " + os8Var);
            ((xs4) ys4Var.o).n(os8Var);
        } else {
            z2 = true;
            xs4 xs4Var = (xs4) ys4Var.o;
            us8Var3.i.add(xs4Var);
            int i = us8Var3.g;
            ps8 ps8Var = us8Var3.h;
            zpb zpbVarA = us8Var3.a(i);
            boolean z3 = true;
            if (us8Var3.g != 1) {
                qs8 qs8Var = us8Var3.e.a;
            } else {
                z3 = false;
            }
            os8 os8Var2 = new os8(i, ps8Var, zpbVarA, z3);
            us8Var3.c.log("MediaAdaptation", "Got new subscriber, trigger my state event: " + os8Var2);
            xs4Var.n(os8Var2);
        }
        this.Z0.a(this.o0);
        boolean z4 = mdgVarV == mdgVar2 ? z2 : false;
        boolean z5 = mdgVar == mdgVar4 ? z2 : false;
        if (z4 && z5) {
            l(x71.Q0, null);
        }
        mdg mdgVarV2 = this.o0.v();
        Iterator it = this.m0.iterator();
        while (it.hasNext()) {
            ((qdg) it.next()).onTopologyUpdated(mdgVarV, mdgVarV2);
        }
    }

    public final void g(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(i01.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.P.log("OKRTCCall", ho7.i("got unknown conversation option '", string, "'"));
            }
        }
        EnumSet enumSet = this.t;
        ArrayList arrayList2 = new ArrayList(enumSet);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(enumSet);
        enumSet.clear();
        enumSet.addAll(arrayList);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            c((i01) obj);
        }
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            c((i01) obj2);
        }
    }

    public final void h(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        j35 j35Var = this.P0;
        ((xo8) j35Var.d).G(jSONObject);
        ((xo8) j35Var.d).H(jSONObject);
        boolean z = false;
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (true) {
                if (i >= jSONArrayOptJSONArray.length()) {
                    break;
                }
                if ("ADD_PARTICIPANT".equalsIgnoreCase(jSONArrayOptJSONArray.optString(i))) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        boolean z2 = w0a.a;
        this.P.log("OKRTCCall", "setFeatureAddParticipantEnabled, ".concat(z ? "yes" : "no"));
        if (this.t0 != z) {
            this.t0 = z;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:141|(3:143|(1:145)(1:146)|147)(1:148)|149|(3:151|(1:153)(1:154)|155)(1:156)|157|(1:160)|161|(3:165|(6:168|271|169|(3:296|173|299)(1:298)|297|166)|295)|174|(1:176)|177|(2:184|(1:186)(16:187|(1:189)|190|(2:194|(1:196))|197|(1:199)(1:200)|201|(1:203)|204|(1:206)|207|(1:209)|210|269|211|(17:213|267|214|221|(1:231)|232|(1:236)(1:235)|237|265|238|(1:240)(1:244)|(1:248)|249|273|250|(1:252)(1:256)|(1:312)(4:260|(1:262)|263|264))(15:226|227|(0)|232|(1:236)(0)|237|265|238|(0)(0)|(0)|249|273|250|(0)(0)|(0)(0))))(1:182)|183|190|(3:192|194|(0))|197|(0)(0)|201|(0)|204|(0)|207|(0)|210|269|211|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0671, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0672, code lost:
    
        r7 = "RecordInfoParser";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0658 A[Catch: JSONException -> 0x0671, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0671, blocks: (B:211:0x0652, B:213:0x0658, B:217:0x0662, B:214:0x065c), top: B:269:0x0652, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06c8 A[Catch: JSONException -> 0x06d1, TRY_LEAVE, TryCatch #0 {JSONException -> 0x06d1, blocks: (B:238:0x06c2, B:240:0x06c8), top: B:265:0x06c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0700 A[Catch: JSONException -> 0x071e, TRY_LEAVE, TryCatch #4 {JSONException -> 0x071e, blocks: (B:250:0x06fa, B:252:0x0700), top: B:273:0x06fa }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e3  */
    /* JADX WARN: Type inference failed for: r4v34, types: [tt] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v48, types: [h0f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(org.json.JSONObject r39, boolean r40, boolean r41) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k01.i(org.json.JSONObject, boolean, boolean):void");
    }

    public final boolean j() {
        if (!this.u) {
            return true;
        }
        this.P.log("OKRTCCall", "Call is already destroyed, reason=" + this.p);
        return false;
    }

    public final void k(ti1 ti1Var, Boolean bool, Boolean bool2, mze mzeVar) {
        y6d y6dVar = this.P;
        y6dVar.log("OKRTCCall", "addParticipant, participant=" + ti1Var);
        if (j()) {
            yi1 yi1VarJ = this.k0.j(ti1Var);
            zva zvaVar = this.N0.g;
            b7d b7dVar = (b7d) ((i21) zvaVar.b).d;
            Long lA = ((kme) zvaVar.o).a();
            if (lA != null) {
                long jLongValue = lA.longValue();
                HashMap map = new HashMap();
                map.put("vcid", b7dVar.conversationId);
                map.put("stat_time_delta", String.valueOf(jLongValue));
                map.put("network_type", w0a.b((ConnectivityManager) zvaVar.c, (TelephonyManager) zvaVar.d));
                zva.j(ti1Var, yi1VarJ, map);
                b7dVar.log(b7d.COLLECTOR_WEBRTC, "callAddParticipant", map);
            }
            try {
                pze pzeVar = this.k;
                boolean zBooleanValue = bool2.booleanValue();
                JSONObject jSONObject = new JSONObject();
                paj.c(ti1Var, jSONObject, false);
                pzeVar.d(paj.a(jSONObject, bool, zBooleanValue), false, new wz0(this, ti1Var, mzeVar, 0), mzeVar);
            } catch (JSONException e) {
                y6dVar.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public final void l(x71 x71Var, Object obj) {
        y6d y6dVar = this.P;
        y6dVar.log("OKRTCCall", "dispatch [ " + x71Var + " ]");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.l.post(new cj(this, x71Var, obj, 8));
            return;
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            try {
                ((g01) obj2).onEvent(this, x71Var, obj);
            } catch (Throwable th) {
                y6dVar.logException("OKRTCCall", "Error on dispatch event " + x71Var, th);
            }
        }
    }

    public final void m(JSONObject jSONObject) throws JSONException {
        j0f j0fVarI;
        try {
            if (jSONObject.has("rooms")) {
                lqh lqhVar = (lqh) this.P0.b;
                JSONObject jSONObject2 = jSONObject.getJSONObject("rooms");
                if (lqhVar.a && (j0fVarI = ((aqc) lqhVar.d).i(jSONObject2)) != null) {
                    ((kp1) lqhVar.e).e(j0fVarI);
                }
            }
        } catch (JSONException e) {
            this.P.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    public final void n(boolean z) {
        if (j()) {
            if (z) {
                this.i0.a();
            }
            sf1 sf1Var = this.G0;
            if (!z) {
                sf1Var.getClass();
            } else {
                if (!sf1Var.e.d) {
                    return;
                }
                if (!sf1.d(new tv(0, 13, p8a.class, sf1Var.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            }
            if (z && this.u0.g) {
                zh zhVar = this.y0;
                if (zhVar.i) {
                    zhVar.f.s();
                }
            }
            this.P.log("OKRTCCall", "Update my settings with video enabled=" + z);
            r8a r8aVar = this.u0;
            if (r8aVar.f != z) {
                r8aVar.f = z;
                r8aVar.a();
            }
            l(x71.o, null);
        }
    }

    public final void o(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.opt("sdk") == null) {
                this.l.post(new cj(this, paj.v(jSONObject), jSONObjectOptJSONObject, 10));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sdk");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optString("type").equals("bad-net") && this.R) {
                kg0 kg0Var = this.Q;
                kg0Var.getClass();
                if ("bad-net".equals(jSONObjectOptJSONObject2.optString("type"))) {
                    kg0Var.m = jSONObjectOptJSONObject2.optBoolean(SdkMetricStatEvent.VALUE_KEY);
                    kg0Var.n = jSONObjectOptJSONObject2.has(SdkMetricStatEvent.VALUE_KEY);
                    kg0Var.o = jSONObjectOptJSONObject2.optDouble(RttRateHintConfig.RTT);
                    kg0Var.p = jSONObjectOptJSONObject2.optDouble("loss");
                    kg0Var.a();
                }
            }
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.l.post(new nz0(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE));
    }

    public final void p(String str) {
        l(x71.c, null);
        pze pzeVar = this.k;
        if (pzeVar != null) {
            pzeVar.g();
        }
        q(null, "conversation_ended." + str);
    }

    public final void q(m07 m07Var, String str) {
        ConversationEndReason error;
        long msSinceBoot;
        int i;
        this.P.log("OKRTCCall", wy1.h("destroy.reason=", str));
        w0a.f();
        if (this.u) {
            this.P.log("OKRTCCall", "   already destroyed, reason=" + this.p);
            return;
        }
        this.u = true;
        xt4 xt4Var = this.f1;
        switch (m07Var == null ? -1 : n07.$EnumSwitchMapping$0[m07Var.ordinal()]) {
            case -1:
                error = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                error = ConversationEndReason.SignalingTimeout.INSTANCE;
                break;
            case 2:
                error = ConversationEndReason.Busy.INSTANCE;
                break;
            case 3:
                error = ConversationEndReason.Missed.INSTANCE;
                break;
            case 4:
                error = ConversationEndReason.Rejected.INSTANCE;
                break;
            case 5:
                error = new ConversationEndReason.Error(new RuntimeException("Call error"));
                break;
            case 6:
                error = ConversationEndReason.Hangup.INSTANCE;
                break;
            case 7:
                error = ConversationEndReason.Canceled.INSTANCE;
                break;
            case 8:
                error = ConversationEndReason.CallTimeout.INSTANCE;
                break;
            case 9:
                error = ConversationEndReason.RemovedFromCall.INSTANCE;
                break;
            case 10:
                error = new ConversationEndReason.ObsoleteClient(null);
                break;
            case 11:
                error = new ConversationEndReason.Error(new ServiceUnavailableException());
                break;
        }
        xt4Var.D(error);
        z21 z21Var = this.N0.l;
        y8g y8gVar = (y8g) z21Var.d;
        qt6 qt6Var = (qt6) z21Var.c;
        qt6Var.o = null;
        try {
            ((Context) qt6Var.b).unregisterReceiver((eo) qt6Var.X);
        } catch (Exception e) {
            a9h.o("Can't unregister BroadcastReceiver: ", e.getMessage(), (y6d) qt6Var.c, "CallBatteryRetriever");
        }
        y21 y21Var = (y21) z21Var.e;
        if (y21Var != null && z21Var.a) {
            y21 y21Var2 = (y21) z21Var.f;
            y21 y21Var3 = (y21) z21Var.g;
            if (y21Var2 == null || y21Var3 == null) {
                msSinceBoot = y8gVar.getMsSinceBoot() - y21Var.c;
                i = 0;
            } else {
                i = y21Var3.b - y21Var2.b;
                msSinceBoot = y21Var3.c - y21Var2.c;
            }
            Long serverTimeMs = y8gVar.getServerTimeMs();
            if (serverTimeMs != null) {
                Map mapJ = to8.j(new imb("battery_level_change", EventItemValueKt.toEventItemValue(Math.abs(i))), new imb("stat_time_delta", EventItemValueKt.toEventItemValue(msSinceBoot)), new imb("timestamp", EventItemValueKt.toEventItemValue(serverTimeMs.longValue())));
                EventItemsMap eventItemsMap = (EventItemsMap) z21Var.i;
                if (eventItemsMap != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(eventItemsMap.getItems());
                    linkedHashMap.putAll(mapJ);
                    ((CallAnalyticsSender) z21Var.b).send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(linkedHashMap)).build());
                }
            }
        }
        r7 r7Var = this.N0.m;
        r7Var.b.a();
        r7Var.c.c = null;
        this.m0.remove(this.N0);
        ah1 ah1Var = this.s;
        if (ah1Var != null) {
            ah1Var.a();
        }
        zh zhVar = this.y0;
        zhVar.f.s();
        ej ejVar = zhVar.h;
        if (!ejVar.p) {
            ejVar.p = true;
            ejVar.g.removeCallbacksAndMessages(null);
            ejVar.g.postAtFrontOfQueue(new o3(7, ejVar));
            ejVar.o.a();
            ejVar.f.quitSafely();
            ejVar.j.clear();
            ejVar.h.quitSafely();
            ejVar.c.getClass();
        }
        NetworkMonitor.getInstance().removeObserver(this);
        this.l0.clear();
        this.m0.clear();
        y87 y87Var = this.M0;
        y87Var.e = true;
        ((Handler) y87Var.k).removeCallbacks((lcf) y87Var.n);
        ((LinkedHashSet) y87Var.l).clear();
        v08 v08Var = (v08) y87Var.m;
        if (v08Var != null) {
            ty4.a(v08Var);
        }
        y87Var.m = null;
        this.l.removeCallbacks(this.D);
        this.o0.I();
        ys4 ys4Var = this.Z0;
        if (ys4Var != null) {
            ys4Var.b(this.o0);
        }
        this.o0 = new m65(this.k0, this.n, this.P, this.O, this.R0, this.A0);
        this.p0.b = new rz0(this, 2);
        ds1 ds1Var = this.q0;
        if (ds1Var != null) {
            ds1Var.I();
            this.q0 = null;
        }
        ecf ecfVar = this.a1;
        if (ecfVar != null) {
            ((HashMap) ecfVar.a.c).remove(ecfVar);
        }
        x("rtc.destroy." + str);
        this.p = str;
        if (this.E) {
            this.A = (SystemClock.elapsedRealtime() - this.B) + this.A;
            this.E = false;
        }
        long j = this.A;
        if (j == 0) {
            x("rtc.connected.time2.-1");
        } else {
            long j2 = j / 60000;
            this.A = j2;
            this.A = Math.min(j2, 10L);
            x("rtc.connected.time2." + this.A);
        }
        pze pzeVar = this.k;
        if (pzeVar != null && this.T) {
            pzeVar.k.remove(this.e);
            this.k.l.remove(this.f);
            this.k.m.remove(this.g);
            this.k.g();
            this.k = null;
        }
        this.k0.h();
        dj1 dj1Var = this.k0;
        dj1Var.e.a = rd5.a;
        dj1Var.i = null;
        dj1Var.f.clear();
        dj1Var.g.clear();
        dj1Var.h.clear();
        dj1Var.c.r();
        ove oveVar = this.g0;
        oveVar.p = null;
        ie8 ie8Var = oveVar.o;
        if (ie8Var != null) {
            ie8Var.j(null);
        }
        ove oveVar2 = this.g0;
        oveVar2.k.log("SlmsSource", "release");
        oveVar2.n.clear();
        oveVar2.e.a.remove(oveVar2);
        oveVar2.c.a.execute(new bee(4, oveVar2));
        this.h0.i = null;
        rve rveVar = this.f0;
        rveVar.b.log("SharedPeerConnectionFac", "release");
        rveVar.a.execute(new qve(rveVar, 1));
        this.c.execute(new nz0(this, 1));
        l(x71.Z, null);
        this.D0 = null;
        this.G0.getClass();
        v08 v08Var2 = (v08) this.K0.c;
        v08Var2.getClass();
        ty4.a(v08Var2);
        fr1 fr1Var = this.N0;
        i21 i21Var = fr1Var.a;
        i21Var.b = true;
        ((CallAnalyticsSender) i21Var.e).setIdle(true);
        v6d v6dVar = fr1Var.i;
        ((zl3) v6dVar.X).dispose();
        v6dVar.X = new zl3();
        v08 v08Var3 = (v08) this.c1.o;
        v08Var3.getClass();
        ty4.a(v08Var3);
        AndroidVideoDecoder.errorCallback = null;
        ((zl3) this.e1.c).dispose();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(org.json.JSONObject r42) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 4264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k01.r(org.json.JSONObject):void");
    }

    public final ti1 s() {
        dj1 dj1Var = this.k0;
        dj1Var.getClass();
        ArrayList arrayList = new ArrayList(dj1Var.d(dj1Var.k).keySet());
        if (arrayList.size() == 1) {
            return (ti1) arrayList.get(0);
        }
        return null;
    }

    public final void t(oze ozeVar, List list, boolean z) {
        Intent intentRegisterReceiver;
        y6d y6dVar = this.P;
        y6dVar.log("OKRTCCall", "init");
        w0a.f();
        if (this.H) {
            throw new IllegalStateException("Is already initialized");
        }
        boolean z2 = true;
        this.H = true;
        si1 si1Var = this.n;
        ri1 ri1Var = si1Var.b;
        boolean z3 = si1Var.k;
        qi1 qi1Var = this.o;
        pze pzeVar = new pze(ozeVar, this.x, this.P, this.O, z3, qi1Var.i);
        this.k = pzeVar;
        pzeVar.k.add(this.e);
        this.k.l.add(this.f);
        this.k.m.add(this.g);
        this.F = list;
        StringBuilder sb = new StringBuilder();
        dj1 dj1Var = this.k0;
        sb.append(dj1Var.q());
        sb.append(" participants");
        y6dVar.log("OKRTCCall", sb.toString());
        if (dj1Var.q() > 1) {
            f(mdg.c, false);
        } else if (dj1Var.q() == 1) {
            f(mdg.b, false);
            if (z) {
                ds1 ds1Var = this.o0;
                ds1Var.getClass();
                w0a.f();
                if (1 != ds1Var.p) {
                    ds1Var.p = 1;
                    ds1Var.D();
                }
            }
        }
        if (this.v && !qi1Var.j) {
            K();
        }
        if (this.R) {
            this.Q.k.add(new fai(this));
        }
        z21 z21Var = this.N0.l;
        qt6 qt6Var = (qt6) z21Var.c;
        qt6Var.o = (iv6) z21Var.h;
        y21 y21Var = null;
        try {
            intentRegisterReceiver = ((Context) qt6Var.b).registerReceiver((eo) qt6Var.X, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception e) {
            a9h.o("Can't register BroadcastReceiver: ", e.getMessage(), (y6d) qt6Var.c, "CallBatteryRetriever");
            intentRegisterReceiver = null;
        }
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            long msSinceBoot = ((y8g) qt6Var.d).getMsSinceBoot();
            int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra2 != 2 && intExtra2 != 5) {
                z2 = false;
            }
            y21Var = new y21(intExtra, msSinceBoot, z2);
        }
        z21Var.e = y21Var;
    }

    public final boolean u() {
        return this.v ? this.N.a : this.w0;
    }

    public final void w(hcf hcfVar, String str) {
        this.O.log(hcfVar, str, (String) null);
    }

    public final void x(String str) {
        w(hcf.app_event, str);
    }

    public final int y(ti1 ti1Var, JSONObject jSONObject) {
        yi1 yi1VarF;
        dje djeVar = dje.a;
        dj1 dj1Var = this.k0;
        if (jSONObject == null) {
            int i = 26;
            yi1VarF = dj1Var.f(new bnb(ti1Var, new uha(i), new uha(i), new uha(i), new uha(i), new uha(i), new uha(i), new uha(i), new uha(i)), djeVar);
        } else {
            if ("ACCEPTED".equals(jSONObject.optString("state"))) {
                return 2;
            }
            sf1 sf1Var = this.G0;
            p8a p8aVarF = sf1Var.f(jSONObject, ti1Var, "onParticipantAddedToCall", sf1Var.h(djeVar).a(), true);
            pmb uhaVar = new uha(26);
            int i2 = 26;
            uha uhaVar2 = new uha(i2);
            uha uhaVar3 = new uha(i2);
            pmb uhaVar4 = new uha(26);
            k5 k5Var = new k5(paj.n(jSONObject));
            k5 k5Var2 = new k5(p8aVarF);
            r8a r8aVarL = paj.l(jSONObject);
            if (r8aVarL != null) {
                uhaVar = new k5(r8aVarL);
            }
            pmb k5Var3 = uhaVar2;
            k5 k5Var4 = new k5(paj.u(jSONObject));
            o81 o81VarH = paj.h(jSONObject);
            if (o81VarH != null) {
                k5Var3 = new k5(o81VarH);
            }
            k5 k5Var5 = new k5(this.O0.a.s(jSONObject, djeVar));
            xi1 xi1VarG = paj.G(jSONObject);
            yi1VarF = dj1Var.f(new bnb(ti1Var, k5Var, k5Var2, uhaVar, k5Var4, k5Var3, k5Var5, uhaVar3, xi1VarG != null ? new k5(xi1VarG) : uhaVar4), djeVar);
        }
        this.o0.r(yi1VarF, true);
        return 1;
    }

    public final void z(ds1 ds1Var) {
        this.P.log("OKRTCCall", "handleTopologyCreated, " + ds1Var);
        lqh lqhVar = this.M;
        if (lqhVar.a) {
            return;
        }
        lqhVar.g();
    }

    public k01(Context context, y8g y8gVar, qf1 qf1Var, xo8 xo8Var, dj1 dj1Var, si1 si1Var, bwf bwfVar, boolean z, boolean z2, r8a r8aVar, cs0 cs0Var, p64 p64Var, b7d b7dVar, y6d y6dVar, t7c t7cVar, boolean z3, y6i y6iVar, mc5 mc5Var, kg0 kg0Var, v32 v32Var, hc8 hc8Var, fr1 fr1Var, m65 m65Var, vgd vgdVar, mw6 mw6Var, jkc jkcVar, EglBase eglBase, ah1 ah1Var, ExecutorService executorService, ExecutorService executorService2, lqh lqhVar, lqh lqhVar2, ys4 ys4Var, rve rveVar, wd8 wd8Var, f54 f54Var, mve mveVar, boolean z4, bwf bwfVar2, v17 v17Var, ra3 ra3Var, li liVar, sf1 sf1Var, f0f f0fVar, cb6 cb6Var, t86 t86Var, hfd hfdVar, bwf bwfVar3, bwf bwfVar4, bwf bwfVar5, s06 s06Var, t06 t06Var, h1e h1eVar, fo4 fo4Var, xt4 xt4Var, int i, d91 d91Var) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.m0 = copyOnWriteArraySet;
        this.C0 = 0;
        this.i1 = new i0g();
        this.m = context;
        this.A0 = y8gVar;
        this.R0 = qf1Var;
        this.S0 = xo8Var;
        this.k0 = dj1Var;
        this.n = si1Var;
        this.o = si1Var.z;
        this.Z = bwfVar;
        this.v = z;
        this.w = z2;
        this.u0 = r8aVar;
        this.v0 = cs0Var;
        this.x = p64Var;
        this.y = d91Var.b;
        this.O = b7dVar;
        this.P = y6dVar;
        this.j0 = t7cVar;
        this.Y0 = z3;
        this.x0 = y6iVar;
        this.I0 = mc5Var;
        this.Q = kg0Var;
        this.J0 = v32Var;
        final int i2 = 2;
        final int i3 = 3;
        this.M0 = new y87((y6d) hc8Var.c, (enb) hc8Var.b, new em6(this) { // from class: b01
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.o0.z((eef) obj);
                        break;
                    case 1:
                        this.b.o0.M((wdf) obj);
                        break;
                    case 2:
                        this.b.o0.z((eef) obj);
                        break;
                    default:
                        this.b.o0.M((wdf) obj);
                        break;
                }
                return qqg.a;
            }
        }, new em6(this) { // from class: b01
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        this.b.o0.z((eef) obj);
                        break;
                    case 1:
                        this.b.o0.M((wdf) obj);
                        break;
                    case 2:
                        this.b.o0.z((eef) obj);
                        break;
                    default:
                        this.b.o0.M((wdf) obj);
                        break;
                }
                return qqg.a;
            }
        }, new pz0(this), (y8g) hc8Var.d);
        this.N0 = fr1Var;
        this.o0 = m65Var;
        this.p0 = vgdVar;
        this.e0 = mw6Var;
        this.e1 = jkcVar;
        this.r = eglBase;
        this.s = ah1Var;
        this.c = executorService;
        this.d = executorService2;
        this.M = lqhVar;
        this.N = lqhVar2;
        this.Z0 = ys4Var;
        this.f0 = rveVar;
        this.i0 = wd8Var;
        this.h0 = f54Var;
        mveVar.h = new awd(9, this);
        ove oveVarA = mveVar.a();
        this.g0 = oveVarA;
        this.R = z4;
        this.H0 = bwfVar2;
        this.K0 = new sa9(new i40(new hfd(14, this), new zid(this), y6dVar, si1Var));
        this.L0 = v17Var;
        this.y0 = new zh(this, (rve) ra3Var.a, (y6d) ra3Var.b, (y6i) ra3Var.c, (li) ra3Var.d, (r8a) ra3Var.e, (EglBase) ra3Var.f);
        this.z0 = liVar;
        this.G0 = sf1Var;
        sf1Var.c = new qk(1, this);
        this.O0 = f0fVar;
        kp1 kp1Var = new kp1((y6d) cb6Var.a, (dj1) cb6Var.b, (xo8) cb6Var.c, (sf1) cb6Var.d, (qf1) cb6Var.e, new xt4(f0fVar.g, 20, new rz0(this, 6)), new xo8(f0fVar.o, 20, new rz0(this, 7)), (y8g) cb6Var.f);
        this.T0 = kp1Var;
        this.P0 = new j35(kp1Var, (dj1) t86Var.a, (f0f) t86Var.b, new qk(1, this), (qf1) t86Var.c, (y6d) t86Var.d, (si1) t86Var.e);
        this.Q0 = hfdVar;
        this.U0 = bwfVar3;
        this.V0 = bwfVar4;
        this.W0 = bwfVar5;
        this.X0 = s06Var;
        ((CopyOnWriteArraySet) qf1Var.c.b).add(t06Var);
        this.b1 = new py0(6, this);
        this.B0 = h1eVar;
        this.c1 = fo4Var;
        this.f1 = xt4Var;
        this.I = i;
        this.h = d91Var;
        NetworkMonitor.init(context);
        Objects.requireNonNull(fr1Var);
        this.g = new sz0(fr1Var, 1);
        copyOnWriteArraySet.add(fr1Var);
        fr1Var.m.c.getClass();
        y6dVar.log("OKRTCCall", "Call<init> caller = " + this.v + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        x("rtc.init.sw.codec.false");
        StringBuilder sb = new StringBuilder("rtc.abi.");
        sb.append(Build.CPU_ABI);
        x(sb.toString());
        qk3 qk3VarH = new kk3(2, new tv0(1, jkcVar)).h(u0e.a());
        n42 n42Var = new n42(1);
        qk3VarH.f(n42Var);
        ((zl3) jkcVar.c).a(n42Var);
        y6dVar.log("OKRTCCall", w0a.c(eglBase) + " was created");
        w(hcf.callDevices, i + "_1");
        oveVarA.n.add(this);
        w7c w7cVar = new w7c(this);
        oveVarA.w = w7cVar;
        if (oveVarA.o != null) {
            oveVarA.o.x = w7cVar;
        }
        final int i4 = 1;
        r8aVar.b(new q8a(this) { // from class: tz0
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // defpackage.q8a
            public final void h(r8a r8aVar2) {
                switch (i4) {
                    case 0:
                        r7 r7Var = this.b.N0.m;
                        boolean z32 = r8aVar2.f;
                        t7 t7Var = r7Var.b;
                        if (!z32) {
                            t7Var.a();
                            break;
                        } else if (!t7Var.b) {
                            t7Var.b = true;
                            t7Var.a = ((y8g) t7Var.c).getMsSinceBoot();
                            break;
                        }
                        break;
                    default:
                        r7 r7Var2 = this.b.N0.m;
                        boolean z42 = r8aVar2.f;
                        t7 t7Var2 = r7Var2.b;
                        if (!z42) {
                            t7Var2.a();
                            break;
                        } else if (!t7Var2.b) {
                            t7Var2.b = true;
                            t7Var2.a = ((y8g) t7Var2.c).getMsSinceBoot();
                            break;
                        }
                        break;
                }
            }
        });
        Objects.requireNonNull(dj1Var);
        r8aVar.b(new nb4(new oz0(dj1Var, 2)));
        AndroidVideoDecoder.errorCallback = new pz0(this);
        NetworkMonitor.getInstance().addObserver(this);
        liVar.j(new rz0(this, 10));
        fo4Var.X = new oz0(dj1Var, 3);
        D(200L, new zih(new xtd(8, fo4Var)));
    }
}
