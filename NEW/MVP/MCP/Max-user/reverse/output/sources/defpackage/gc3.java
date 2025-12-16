package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gc3 extends l6i {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final q9g s;
    public ec3 t;
    public ClippingMediaSource$IllegalClippingException u;
    public long v;
    public long w;

    public gc3(cc3 cc3Var) {
        super(cc3Var.a);
        this.l = cc3Var.b;
        this.m = cc3Var.c;
        this.n = cc3Var.d;
        this.o = cc3Var.e;
        this.p = cc3Var.f;
        this.q = cc3Var.g;
        this.r = new ArrayList();
        this.s = new q9g();
    }

    @Override // defpackage.l6i
    public final void B(s9g s9gVar) {
        if (this.u != null) {
            return;
        }
        E(s9gVar);
    }

    public final void E(s9g s9gVar) {
        long j;
        long j2;
        long j3;
        q9g q9gVar = this.s;
        s9gVar.n(0, q9gVar);
        long j4 = q9gVar.p;
        ec3 ec3Var = this.t;
        long j5 = this.m;
        ArrayList arrayList = this.r;
        if (ec3Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = q9gVar.l;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v = j4 + j;
            this.w = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bc3 bc3Var = (bc3) arrayList.get(i);
                long j7 = this.v;
                long j8 = this.w;
                bc3Var.o = j7;
                bc3Var.X = j8;
            }
            j3 = j2;
        } else {
            j = this.v - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w - j4 : Long.MIN_VALUE;
        }
        try {
            ec3 ec3Var2 = new ec3(s9gVar, j, j3, this.q);
            this.t = ec3Var2;
            n(ec3Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.u = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((bc3) arrayList.get(i2)).Y = this.u;
            }
        }
    }

    @Override // defpackage.ck0
    public final boolean a(k09 k09Var) {
        ck0 ck0Var = this.k;
        return ck0Var.i().e.equals(k09Var.e) && ck0Var.a(k09Var);
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        bc3 bc3Var = new bc3(this.k.c(d99Var, ri4Var, j), this.n, this.v, this.w);
        this.r.add(bc3Var);
        return bc3Var;
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void k() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.u;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.k();
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        ArrayList arrayList = this.r;
        hsi.g(arrayList.remove(p29Var));
        this.k.o(((bc3) p29Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        ec3 ec3Var = this.t;
        ec3Var.getClass();
        E(ec3Var.e);
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void q() {
        super.q();
        this.u = null;
        this.t = null;
    }
}
