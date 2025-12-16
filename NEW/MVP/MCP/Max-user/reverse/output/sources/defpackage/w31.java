package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* loaded from: classes.dex */
public final class w31 extends xfh {
    public final k18 X;
    public final k18 Y;
    public final x26 Z;
    public final s2i b;
    public final wo1 c;
    public final k18 d;
    public final k18 o;
    public final x26 s0;
    public final ph0 t0;
    public final x26 u0;
    public final tcf v0;
    public final hbd w0;

    public w31(s2i s2iVar, wo1 wo1Var) {
        bwf bwfVarD = e51.a.getAccessor().d(10);
        k18 k18Var = fm1.a;
        bwf bwfVarD2 = gm1.a.getAccessor().d(508);
        k18 k18VarC = fm1.c();
        k18 k18VarD = fm1.d();
        k18 k18VarE = fm1.e();
        this.b = s2iVar;
        this.c = wo1Var;
        this.d = bwfVarD2;
        this.o = bwfVarD;
        this.X = k18VarC;
        this.Y = k18VarD;
        x26 x26VarM = gw0.m(new z41(wo1Var.G0, wo1Var.H0, new m31(3, null, 0), 3));
        bwf bwfVar = (bwf) k18VarE;
        this.Z = gw0.u(gw0.i((fve) ((qv1) bwfVarD2.getValue()).u.getValue(), x26VarM, ((v11) ((qv1) bwfVarD2.getValue()).l).F0, new n31(4, null, 0)), ((q2b) ((lzf) bwfVar.getValue())).a());
        this.s0 = gw0.u(gw0.j(new ph0(((qv1) bwfVarD2.getValue()).e(), 3), x26VarM, new ph0(((qv1) bwfVarD2.getValue()).p, 4), new ph0(((qv1) bwfVarD2.getValue()).b(), 5), new o31(k18VarD, null)), ((q2b) ((lzf) bwfVar.getValue())).a());
        hbd hbdVar = wo1Var.A0;
        this.t0 = new ph0(hbdVar, 6);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i = 7;
        this.u0 = gw0.u(new x3(new mwd(new q36(null)), bwfVarD2, i), ((q2b) ((lzf) bwfVar.getValue())).a());
        tcf tcfVarA = ucf.a(t((CallsAudioDeviceInfo) ((mcf) v().r.getValue()).getValue(), (vc1) hbdVar.a.getValue(), ((onb) ((tcf) v().e()).getValue()).a.a.h()));
        this.v0 = tcfVarA;
        this.w0 = new hbd(tcfVarA);
        gw0.w(gw0.u(gw0.i((mcf) ((qv1) bwfVarD2.getValue()).r.getValue(), hbdVar, new ph0(((qv1) bwfVarD2.getValue()).e(), i), new l31(this, null, 0)), ((q2b) ((lzf) bwfVar.getValue())).a()), this.a);
    }

    public final ns0 t(CallsAudioDeviceInfo callsAudioDeviceInfo, vc1 vc1Var, boolean z) {
        ms8 ms8Var = vc1Var.r;
        ms8 ms8Var2 = vc1Var.q;
        boolean z2 = vc1Var.g;
        ms8 ms8Var3 = ms8.d;
        if (z2 && !(vc1Var.e instanceof bo5) && ((gu5) ((rt5) this.Y.getValue())).t()) {
            ms8Var3 = z ? ms8.b : ms8.a;
        }
        return new ns0(ms8Var, ms8Var2, ms8Var3, ko8.b(callsAudioDeviceInfo));
    }

    public final ArrayList u() {
        List<CallsAudioDeviceInfo> availableAudioDevices;
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((w21) v().b).c.get();
        Iterable iterableH0 = (callsAudioManager == null || (availableAudioDevices = callsAudioManager.getAvailableAudioDevices()) == null) ? rd5.a : ue3.h0(availableAudioDevices);
        ArrayList arrayList = new ArrayList(we3.q(iterableH0, 10));
        Iterator it = iterableH0.iterator();
        while (it.hasNext()) {
            arrayList.add(ko8.b((CallsAudioDeviceInfo) it.next()));
        }
        return arrayList;
    }

    public final qv1 v() {
        return (qv1) this.d.getValue();
    }

    public final void w(ms8 ms8Var) {
        if (ms8Var == ms8.c) {
            if (((ca) ((v11) v().l).F0.getValue()).c) {
                return;
            }
            xfh.r(this.c.L0, en1.b);
            return;
        }
        k18 k18Var = this.o;
        if (!((qsb) k18Var.getValue()).c(qsb.h)) {
            ((qsb) k18Var.getValue()).i(this.b, m0b.G);
            return;
        }
        yx1 yx1Var = (yx1) this.X.getValue();
        String str = v().c().c;
        ms8 ms8Var2 = ms8.b;
        long j = ms8Var == ms8Var2 ? 1L : 0L;
        boolean z = v().c().i;
        yx1Var.getClass();
        yx1.d(yx1Var, "AUDIO_ENABLED", str, null, Long.valueOf(j), null, null, z, 116);
        qv1 qv1VarV = v();
        boolean z2 = ms8Var == ms8Var2;
        ((w21) qv1VarV.b).e(z2);
        if (z2) {
            ((e9a) qv1VarV.s.getValue()).h(Boolean.FALSE);
        }
    }

    public final void x(ms8 ms8Var) {
        if (ms8Var == ms8.c) {
            if (((ca) ((v11) v().l).F0.getValue()).b) {
                return;
            }
            xfh.r(this.c.L0, en1.c);
            return;
        }
        k18 k18Var = this.o;
        boolean zC = ((qsb) k18Var.getValue()).c(qsb.m);
        k18 k18Var2 = this.X;
        if (!zC) {
            ((yx1) k18Var2.getValue()).g(v().c().c, "DURING_CALL", v().c().i);
            ((qsb) k18Var.getValue()).m(this.b);
        } else {
            if (v().h.c()) {
                return;
            }
            yx1 yx1Var = (yx1) k18Var2.getValue();
            String str = v().c().c;
            ms8 ms8Var2 = ms8.b;
            long j = ms8Var == ms8Var2 ? 1L : 0L;
            boolean z = v().c().i;
            yx1Var.getClass();
            yx1.d(yx1Var, "VIDEO_ENABLED", str, null, Long.valueOf(j), null, null, z, 116);
            v().g(ms8Var == ms8Var2);
        }
    }
}
