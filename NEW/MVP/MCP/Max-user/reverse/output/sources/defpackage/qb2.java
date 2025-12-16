package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class qb2 implements Serializable {
    public final int A0;
    public final kt2 B0;
    public final String C0;
    public final hfd D0;
    public final int E0;
    public final fz6 F0;
    public final fh9 G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    public final long K0;
    public final LinkedHashMap L0;
    public final j2h M0;
    public final ds0 N0;
    public final long O0;
    public final LinkedHashMap P0;
    public final long Q0;
    public final boolean R0;
    public final long S0;
    public final String T0;
    public final long U0;
    public final long V0;
    public final int W0;
    public final String X;
    public final int X0;
    public final String Y;
    public final String Z;
    public final long a;
    public final String b;
    public final long c;
    public final LinkedHashMap d;
    public final long o;
    public final fh9 s0;
    public final long t0;
    public final long u0;
    public final int v0;
    public final long w0;
    public final int x0;
    public final String y0;
    public final sz z0;

    public qb2(ob2 ob2Var) {
        this.a = ob2Var.a;
        this.W0 = ob2Var.N;
        this.b = ob2Var.b;
        this.c = ob2Var.c;
        this.d = ob2Var.d;
        this.o = ob2Var.e;
        this.X = ob2Var.f;
        this.Y = ob2Var.g;
        this.Z = ob2Var.h;
        this.s0 = ob2Var.i;
        this.t0 = ob2Var.j;
        this.u0 = ob2Var.k;
        this.v0 = ob2Var.l;
        this.w0 = ob2Var.m;
        this.x0 = ob2Var.r;
        this.y0 = ob2Var.s;
        this.z0 = ob2Var.t;
        this.A0 = ob2Var.u;
        this.B0 = ob2Var.v;
        this.X0 = ob2Var.O;
        this.C0 = ob2Var.n;
        this.D0 = ob2Var.o;
        this.E0 = ob2Var.p;
        this.F0 = ob2Var.q;
        this.G0 = ob2Var.w;
        this.H0 = ob2Var.x;
        this.I0 = ob2Var.y;
        this.J0 = ob2Var.z;
        this.K0 = ob2Var.A;
        this.L0 = ob2Var.B;
        this.M0 = ob2Var.C;
        this.N0 = new ds0(ob2Var.D, ob2Var.E);
        this.O0 = ob2Var.F;
        this.P0 = ob2Var.G;
        this.Q0 = ob2Var.H;
        this.R0 = ob2Var.I;
        this.S0 = ob2Var.J;
        this.T0 = ob2Var.K;
        this.U0 = ob2Var.L;
        this.V0 = ob2Var.M;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0735 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qb2 a(defpackage.tm9 r29) {
        /*
            Method dump skipped, instructions count: 2878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb2.a(tm9):qb2");
    }

    public final String toString() {
        int iD = zdi.d(this.d);
        int iA = zdi.a(this.z0);
        StringBuilder sbL = az1.l(this.a, "{id=", ", type=");
        sbL.append(wy1.y(this.W0));
        sbL.append(", status='");
        sbL.append(this.b);
        sbL.append("', owner=");
        utb.n(sbL, this.c, ", participants=", iD);
        az1.r(this.o, ", created=", ", lastMessage=", sbL);
        sbL.append(this.s0);
        sbL.append(", cid=");
        sbL.append(this.t0);
        az1.r(this.u0, ", lastEventTime=", ", newMessages=", sbL);
        hf3.g(sbL, this.v0, ", participantsCount=", this.x0, ", admins=");
        sbL.append(iA);
        sbL.append(", chatOptions=");
        sbL.append(this.B0);
        sbL.append(", botsInfo=");
        sbL.append(this.N0);
        sbL.append(", getLastMentionMessageId=");
        sbL.append(this.Q0);
        az1.r(this.S0, ", lastReactedMessageId=", ", lastReaction=", sbL);
        sbL.append(this.T0);
        sbL.append(", markedAsUnread=");
        sbL.append(this.R0);
        sbL.append(", lastFireDelayedErrorTime=");
        sbL.append(this.V0);
        return u45.i(this.U0, ", lastDelayedUpdateTime=", "}", sbL);
    }
}
