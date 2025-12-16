package defpackage;

/* loaded from: classes.dex */
public final class bsb {
    public final k18 a;

    public bsb(k18 k18Var) {
        this.a = k18Var;
    }

    public final ms8 a(boolean z) {
        return !b().c(qsb.m) ? ms8.o : z ? ms8.b : ms8.a;
    }

    public final qsb b() {
        return (qsb) this.a.getValue();
    }

    public final boolean c(s2i s2iVar) {
        if (b().c(qsb.h)) {
            return false;
        }
        b().i(s2iVar, m0b.G);
        return true;
    }
}
