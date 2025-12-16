package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class aj1 implements bj1 {
    public final zi1 a;
    public final h29 b;
    public final h29 c;
    public final h29 d;
    public final boolean e;
    public final boolean f;
    public final vch g;
    public final vch h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final int v;

    public aj1(zi1 zi1Var, h29 h29Var, h29 h29Var2, h29 h29Var3, boolean z, boolean z2, vch vchVar, vch vchVar2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, List list, int i) {
        this.a = zi1Var;
        this.b = h29Var;
        this.c = h29Var2;
        this.d = h29Var3;
        this.e = z;
        this.f = z2;
        this.g = vchVar;
        this.h = vchVar2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = j;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = z13;
        this.u = list;
        this.v = i;
    }

    @Override // defpackage.bj1
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.bj1
    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        return this.a.equals(aj1Var.a) && this.b == aj1Var.b && this.c == aj1Var.c && this.d == aj1Var.d && this.e == aj1Var.e && this.f == aj1Var.f && this.g.equals(aj1Var.g) && this.h.equals(aj1Var.h) && this.i == aj1Var.i && this.j == aj1Var.j && this.k == aj1Var.k && this.l == aj1Var.l && this.m == aj1Var.m && this.n == aj1Var.n && this.o == aj1Var.o && this.p == aj1Var.p && this.q == aj1Var.q && this.r == aj1Var.r && this.s == aj1Var.s && this.t == aj1Var.t && this.u.equals(aj1Var.u) && this.v == aj1Var.v;
    }

    @Override // defpackage.bj1
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bj1
    public final boolean g() {
        return this.p;
    }

    @Override // defpackage.bj1
    public final zi1 getId() {
        return this.a;
    }

    @Override // defpackage.bj1
    public final boolean h() {
        return this.r;
    }

    public final int hashCode() {
        return az1.v(this.v) + xrf.l(this.u, a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.a(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b((this.h.hashCode() + ((this.g.hashCode() + a9h.b(a9h.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31);
    }

    @Override // defpackage.bj1
    public final boolean i() {
        return this.j;
    }

    @Override // defpackage.bj1
    public final boolean isConnected() {
        return this.l;
    }

    @Override // defpackage.bj1
    public final boolean k() {
        return this.q;
    }

    @Override // defpackage.bj1
    public final boolean n() {
        return this.k;
    }

    @Override // defpackage.bj1
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.bj1
    public final vch p() {
        return this.h;
    }

    @Override // defpackage.bj1
    public final int r() {
        return this.v;
    }

    @Override // defpackage.bj1
    public final vch s() {
        return this.g;
    }

    @Override // defpackage.bj1
    public final boolean t() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantImpl(id=");
        sb.append(this.a);
        sb.append(", audioOptionState=");
        sb.append(this.b);
        sb.append(", videoOptionState=");
        sb.append(this.c);
        sb.append(", screenShareOptionState=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        az1.t(", isShareAudioEnabled=", ", videoState=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", screenCaptureState=");
        sb.append(this.h);
        sb.append(", isCreator=");
        az1.t(", isAdmin=", ", isConnectedOnce=", sb, this.i, this.j);
        az1.t(", isConnected=", ", isAccepted=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", acceptCallEpochMs=");
        sb.append(this.n);
        hf3.f(", isSelf=", ", isPrimarySpeaker=", sb, this.o, this.p);
        hf3.f(", isTalking=", ", isRaiseHand=", sb, this.q, this.r);
        hf3.f(", hasRegisteredPeers=", ", hasMediaBytes=", sb, this.s, this.t);
        sb.append(", movies=");
        sb.append(this.u);
        sb.append(", networkStatus=");
        int i = this.v;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BAD" : "MEDIUM" : "GOOD");
        sb.append(")");
        return sb.toString();
    }
}
