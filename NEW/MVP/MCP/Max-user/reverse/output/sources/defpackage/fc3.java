package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fc3 extends hm3 {
    public final koc k;
    public final long l;
    public final boolean m = true;
    public final ArrayList n = new ArrayList();
    public final p9g o = new p9g();
    public dc3 p;
    public ClippingMediaSource$IllegalClippingException q;
    public long r;
    public long s;

    public fc3(koc kocVar, long j) {
        this.k = kocVar;
        this.l = j;
    }

    @Override // defpackage.bk0
    public final o29 a(c99 c99Var, qi4 qi4Var, long j) {
        ac3 ac3Var = new ac3(this.k.a(c99Var, qi4Var, j), this.m, this.r, this.s);
        this.n.add(ac3Var);
        return ac3Var;
    }

    @Override // defpackage.bk0
    public final i09 f() {
        return this.k.h;
    }

    @Override // defpackage.hm3, defpackage.bk0
    public final void g() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.q;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.g();
    }

    @Override // defpackage.bk0
    public final void i(vgg vggVar) {
        this.j = vggVar;
        this.i = xxg.l(null);
        r(null, this.k);
    }

    @Override // defpackage.bk0
    public final void k(o29 o29Var) {
        ArrayList arrayList = this.n;
        fsi.d(arrayList.remove(o29Var));
        this.k.k(((ac3) o29Var).a);
        if (arrayList.isEmpty()) {
            dc3 dc3Var = this.p;
            dc3Var.getClass();
            s(dc3Var.b);
        }
    }

    @Override // defpackage.hm3, defpackage.bk0
    public final void m() {
        super.m();
        this.q = null;
        this.p = null;
    }

    @Override // defpackage.hm3
    public final void q(Object obj, bk0 bk0Var, r9g r9gVar) {
        if (this.q != null) {
            return;
        }
        s(r9gVar);
    }

    public final void s(r9g r9gVar) {
        long j;
        p9g p9gVar = this.o;
        r9gVar.n(0, p9gVar);
        long j2 = p9gVar.A0;
        dc3 dc3Var = this.p;
        long j3 = this.l;
        ArrayList arrayList = this.n;
        if (dc3Var == null || arrayList.isEmpty()) {
            this.r = j2;
            this.s = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ac3 ac3Var = (ac3) arrayList.get(i);
                long j4 = this.r;
                long j5 = this.s;
                ac3Var.o = j4;
                ac3Var.X = j5;
            }
            j = 0;
        } else {
            j = this.r - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.s - j2;
        }
        try {
            dc3 dc3Var2 = new dc3(r9gVar, j, j3);
            this.p = dc3Var2;
            j(dc3Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ac3) arrayList.get(i2)).Y = this.q;
            }
        }
    }
}
