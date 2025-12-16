package defpackage;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class pf1 extends xfh {
    public final k18 X;
    public final k18 Y;
    public volatile Long Z;
    public final nf1 b;
    public final py0 c;
    public final zw1 d;
    public final kj1 o;
    public final tcf s0;
    public final hbd t0;
    public final Object u0;
    public final ci5 v0;

    public pf1(nf1 nf1Var, py0 py0Var, zw1 zw1Var, sw1 sw1Var, kj1 kj1Var, k18 k18Var, k18 k18Var2) {
        Object value;
        cf1 cf1Var;
        String str;
        long j;
        this.b = nf1Var;
        this.c = py0Var;
        this.d = zw1Var;
        this.o = kj1Var;
        this.X = k18Var2;
        this.Y = k18Var;
        tcf tcfVarA = ucf.a(cf1.l);
        this.s0 = tcfVarA;
        this.t0 = new hbd(tcfVarA);
        this.u0 = ipi.b(3, new nz(k18Var2, 6));
        this.v0 = new ci5(0);
        gw0.w(new g56(new gbd(sw1Var.a), new kf1(this, null), 1), this.a);
        if (nf1Var instanceof lf1) {
            v();
            return;
        }
        if (!(nf1Var instanceof mf1)) {
            throw new NoWhenBranchMatchedException();
        }
        mf1 mf1Var = (mf1) nf1Var;
        String str2 = mf1Var.d;
        do {
            value = tcfVarA.getValue();
            cf1Var = (cf1) value;
            str = mf1Var.b;
            j = mf1Var.a;
        } while (!tcfVarA.c(value, cf1.a(cf1Var, py0Var.d(!mf1Var.c ? str2 : null, Long.valueOf(j)), dqi.u(str), str2, new af1(py0Var.f(str)), new r5g(str2), cf1.k, ue1.a, false, Long.valueOf(j), null, 1025)));
        long j2 = ((mf1) this.b).a;
        gu5 gu5Var = (gu5) ((rt5) this.X.getValue());
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f58groupcallchatsupport, false)) {
            hbd hbdVarK = ((w63) this.Y.getValue()).k(j2);
            int i = s65.d;
            gw0.w(gw0.C(new g56(gw0.l(zs0.g(hbdVarK, v9j.h(1, y65.SECONDS)), new cj0(5)), new zr0(2, this, pf1.class, "updateActions", "updateActions(Lru/ok/tamtam/chats/Chat;)V", 4, 5), 1), this.a, yve.a, 0), this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final ofb t(boolean z, Long l) {
        return (((Boolean) this.u0.getValue()).booleanValue() && l != null && z) ? new lfb(null, new rfb(yud.G, new k(22, this)), null) : jfb.a;
    }

    public final void u(long j) {
        long j2 = yza.c;
        if (j == j2) {
            v();
            return;
        }
        hbd hbdVar = this.t0;
        CharSequence charSequence = ((cf1) hbdVar.a.getValue()).b;
        ci5 ci5Var = this.v0;
        if (charSequence == null) {
            xfh.r(ci5Var, new tc1(new n5g(b0b.p)));
            return;
        }
        if (j == yza.b) {
            Long l = ((cf1) hbdVar.a.getValue()).i;
            if (l != null) {
                long jLongValue = l.longValue();
                ca1.c.getClass();
                xc0.l(":chats?id=" + jLongValue + "&type=server", ci5Var);
                return;
            }
            return;
        }
        if (j == yza.a) {
            CharSequence charSequence2 = ((cf1) hbdVar.a.getValue()).b;
            if (charSequence2 != null) {
                xfh.r(ci5Var, new qc1(charSequence2));
                return;
            }
            return;
        }
        if (j == yza.d) {
            xfh.r(ci5Var, new rc1(charSequence));
            return;
        }
        if (j == yza.e) {
            xfh.r(ci5Var, new sc1(charSequence));
            return;
        }
        if (j != yza.f) {
            if (j == j2) {
                v();
            }
        } else {
            this.o.j(charSequence.toString(), !((cf1) hbdVar.a.getValue()).h, false, ((cf1) hbdVar.a.getValue()).h, new m3(this, 15, charSequence));
        }
    }

    public final void v() {
        if (((cf1) this.t0.a.getValue()).b == null && this.Z == null) {
            svi.e(this.a, null, null, new of1(this, null), 3);
            return;
        }
        String name = pf1.class.getName();
        boolean z = ((cf1) this.t0.a.getValue()).b != null;
        wqi.q(name, "Skip creating call link: callLink=" + z + " createJoinLinkRequestId=" + this.Z, new Object[0]);
    }
}
