package defpackage;

import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public final class xf1 extends cg1 {
    public final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(ly6 ly6Var) {
        super(vfh.c);
        List list = ly6Var != null ? ly6Var.a : null;
        list = list == null ? hd5.a : list;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf1) && fni.a(this.b, ((xf1) obj).b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 222L;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if ((t98Var instanceof xf1 ? (xf1) t98Var : null) == null) {
            return null;
        }
        wf1 wf1Var = new wf1(9);
        ((BitSet) wf1Var.b).set(0, !this.b.equals(r4.b));
        return wf1Var;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 222;
    }

    public final String toString() {
        return "Grid(opponentsPages=" + this.b + ")";
    }
}
