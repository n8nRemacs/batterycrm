package defpackage;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class zf1 extends cg1 {
    public final p5g b;
    public final in1 c;

    public zf1(p5g p5gVar, in1 in1Var) {
        super(vfh.b);
        this.b = p5gVar;
        this.c = in1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf1)) {
            return false;
        }
        zf1 zf1Var = (zf1) obj;
        return this.b.equals(zf1Var.b) && fni.a(this.c, zf1Var.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 225L;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if ((t98Var instanceof zf1 ? (zf1) t98Var : null) == null) {
            return null;
        }
        yf1 yf1Var = new yf1(9);
        BitSet bitSet = (BitSet) yf1Var.b;
        bitSet.set(0, !fni.a(this.c, r6.c));
        bitSet.set(1, !this.b.equals(r6.b));
        return yf1Var;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 225;
    }

    public final String toString() {
        return "Sharing(title=" + this.b + ", sharingState=" + this.c + ")";
    }
}
