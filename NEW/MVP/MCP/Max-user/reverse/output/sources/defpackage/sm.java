package defpackage;

/* loaded from: classes2.dex */
public abstract class sm {
    public final long a;
    public n2 b;
    public tm c;

    public sm(long j) {
        this.a = j;
    }

    public abstract n2 i();

    public final hwa j() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return tmVar.a();
    }

    public final tw0 k() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return tmVar.b();
    }

    public final ve2 l() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return tmVar.c();
    }

    public final qv3 m() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return (qv3) tmVar.m.getValue();
    }

    public final qi9 n() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return tmVar.d();
    }

    public final k1a o() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return (k1a) tmVar.o.getValue();
    }

    public final z7c p() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return (z7c) tmVar.d.getValue();
    }

    public final n2 q() {
        if (this.b == null) {
            this.b = i();
        }
        return this.b;
    }

    public final a3g r() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return tmVar.e();
    }

    public String toString() {
        return getClass().getSimpleName() + "/requestId: " + this.a;
    }
}
