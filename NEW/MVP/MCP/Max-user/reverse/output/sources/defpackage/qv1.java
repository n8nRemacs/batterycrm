package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* loaded from: classes.dex */
public final class qv1 {
    public static final /* synthetic */ yy7[] z;
    public final tv1 a;
    public final v21 b;
    public final x65 c;
    public final nnb d;
    public final f41 e;
    public final s41 f;
    public final px1 g;
    public final g1e h;
    public final u1e i;
    public final vpc j;
    public final sv1 k;
    public final z01 l;
    public final jd1 m;
    public final k18 n;
    public final tcf o;
    public final hbd p;
    public final bwf q;
    public final bwf r;
    public final bwf s;
    public final og4 t;
    public final bwf u;
    public final bwf v;
    public final t9f w;
    public final g56 x;
    public final bwf y;

    static {
        z8a z8aVar = new z8a(qv1.class, "vpnStatusJob", "getVpnStatusJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        z = new yy7[]{z8aVar};
    }

    public qv1(tv1 tv1Var, v21 v21Var, x65 x65Var, nnb nnbVar, f41 f41Var, s41 s41Var, px1 px1Var, g1e g1eVar, u1e u1eVar, vpc vpcVar, sv1 sv1Var, z01 z01Var, jd1 jd1Var, k18 k18Var, ur3 ur3Var) {
        k18 k18VarE = fm1.e();
        this.a = tv1Var;
        this.b = v21Var;
        this.c = x65Var;
        this.d = nnbVar;
        this.e = f41Var;
        this.f = s41Var;
        this.g = px1Var;
        this.h = g1eVar;
        this.i = u1eVar;
        this.j = vpcVar;
        this.k = sv1Var;
        this.l = z01Var;
        this.m = jd1Var;
        this.n = k18Var;
        tcf tcfVarA = ucf.a(new bt1(255));
        this.o = tcfVarA;
        this.p = new hbd(tcfVarA);
        this.q = new bwf(new hv1(this, 0));
        int i = 1;
        this.r = new bwf(new hv1(this, i));
        this.s = new bwf(new jl1(17));
        int i2 = og4.f;
        int i3 = s65.d;
        this.t = new og4(new n7(v9j.h(10, y65.SECONDS)), new vy1(27, new hv1(this, 2)));
        this.u = new bwf(new hv1(this, 3));
        this.v = new bwf(new hv1(this, 4));
        this.w = c7j.c();
        this.x = new g56(gw0.m(gw0.c(new ov1(ur3Var, null))), new pv1(this, null), i);
        this.y = new bwf(new hv1(this, 5));
        ((hw1) tv1Var).e(new iv1(this));
        gw0.w(gw0.u(new g56(new d53(gw0.m(new ph0(e(), 22)), 12), new jv1(this, null), i), ((q2b) ((lzf) ((bwf) k18VarE).getValue())).a()), sv1Var);
    }

    public final void a(vfh vfhVar) {
        while (true) {
            tcf tcfVar = this.o;
            Object value = tcfVar.getValue();
            vfh vfhVar2 = vfhVar;
            if (tcfVar.c(value, bt1.a((bt1) value, null, null, null, vfhVar2, null, 0L, 239))) {
                return;
            } else {
                vfhVar = vfhVar2;
            }
        }
    }

    public final mcf b() {
        return ((hw1) this.a).b1;
    }

    public final mb4 c() {
        return (mb4) ((hw1) this.a).b1.getValue();
    }

    public final cnb d() {
        return ((onb) ((dob) this.d).z0.getValue()).a;
    }

    public final mcf e() {
        return ((dob) this.d).z0;
    }

    public final tcf f() {
        return ((d2e) this.i).t0;
    }

    public final void g(boolean z2) {
        if (this.h.c()) {
            return;
        }
        this.e.c(z2);
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((w21) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, z2, true, null, null, 12, null);
        }
    }

    public final void h(long j) {
        while (true) {
            tcf tcfVar = this.o;
            Object value = tcfVar.getValue();
            long j2 = j;
            if (tcfVar.c(value, bt1.a((bt1) value, null, null, null, null, null, j2, 127))) {
                return;
            } else {
                j = j2;
            }
        }
    }

    public final void i(zi1 zi1Var, boolean z2) {
        tcf tcfVar;
        Object value;
        bt1 bt1Var;
        zi1 zi1Var2;
        do {
            tcfVar = this.o;
            value = tcfVar.getValue();
            bt1Var = (bt1) value;
            zi1Var2 = (!z2 && fni.a(bt1Var.a, zi1Var)) ? null : zi1Var;
        } while (!tcfVar.c(value, bt1.a(bt1Var, zi1Var2, null, null, zi1Var2 != null ? vfh.a : bt1Var.e, null, 0L, 238)));
    }

    public final void j(zi1 zi1Var) {
        while (true) {
            tcf tcfVar = this.o;
            Object value = tcfVar.getValue();
            zi1 zi1Var2 = zi1Var;
            if (tcfVar.c(value, bt1.a((bt1) value, null, zi1Var2, null, null, null, 0L, 253))) {
                return;
            } else {
                zi1Var = zi1Var2;
            }
        }
    }

    public final void k(boolean z2) {
        RecordManager.StopParams stopParams = new RecordManager.StopParams(null, z2, null, null, 13, null);
        d2e d2eVar = (d2e) this.i;
        d2eVar.getClass();
        wqi.m("ScreenRecordControllerTag", "stopRecordBroadcast", new Object[0]);
        ReentrantLock reentrantLock = d2eVar.Z;
        reentrantLock.lock();
        try {
            if (((e2e) d2eVar.t0.getValue()).a != f2e.a) {
                wqi.m("ScreenRecordControllerTag", "startRecordBroadcast already finished", new Object[0]);
                reentrantLock.unlock();
                return;
            }
            ((yx1) d2eVar.o.getValue()).f(false);
            RecordManager recordManagerA = d2eVar.a();
            if (recordManagerA != null) {
                RecordManager.stopRecord$default(recordManagerA, stopParams, new l3b(d2eVar, 23, stopParams), null, 4, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void l(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        yx1 yx1Var = (yx1) this.n.getValue();
        String str = c().c;
        int i = kv1.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        String str2 = i != 1 ? i != 2 ? "HEADPHONES" : "DYNAMIC" : "PHONE";
        boolean z2 = c().i;
        yx1Var.getClass();
        yx1.d(yx1Var, "SPEAKER_MODE_CHANGED", str, str2, null, null, null, z2, 120);
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((w21) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setAudioDeviceAsync$default(callsAudioManager, callsAudioDeviceInfo, null, null, 6, null);
        }
    }

    public final void m() {
        Object value;
        w21 w21Var;
        CallsAudioDeviceInfo callsAudioDeviceInfoB;
        f9a f9aVar = (f9a) this.q.getValue();
        do {
            value = f9aVar.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
            w21Var = (w21) this.b;
            callsAudioDeviceInfoB = w21Var.b();
            CallsAudioManager callsAudioManager = (CallsAudioManager) w21Var.c.get();
            if (callsAudioManager != null) {
                CallsAudioManager.setAudioDeviceAsync$default(callsAudioManager, callsAudioDeviceInfo, null, null, 6, null);
            }
        } while (!f9aVar.c(value, callsAudioDeviceInfoB));
        xtd xtdVar = new xtd(20, this);
        CallsAudioManager callsAudioManager2 = (CallsAudioManager) w21Var.c.get();
        if (callsAudioManager2 != null) {
            callsAudioManager2.setOnAudioDeviceChangeListener(xtdVar);
        }
    }

    public final void n() {
        AudioLevelListener audioLevelListener = (AudioLevelListener) this.v.getValue();
        w21 w21Var = (w21) this.b;
        w21Var.getClass();
        try {
            MicrophoneManager microphoneManagerC = w21Var.c();
            if (microphoneManagerC != null) {
                microphoneManagerC.registerAudioSampleCallback(250L, audioLevelListener);
            }
        } catch (Exception e) {
            wqi.p("CallAudioController", "CallAudioController can't register mic audio listener due to: " + e.getMessage() + ".", e);
        }
    }

    public final void o(dxg dxgVar) {
        tcf tcfVar = this.o;
        if (((bt1) tcfVar.getValue()).g == dxg.c && dxgVar != dxg.d) {
            return;
        }
        while (true) {
            Object value = tcfVar.getValue();
            dxg dxgVar2 = dxgVar;
            if (tcfVar.c(value, bt1.a((bt1) value, null, null, null, null, dxgVar2, 0L, 191))) {
                return;
            } else {
                dxgVar = dxgVar2;
            }
        }
    }
}
