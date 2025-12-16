package defpackage;

import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public final class bg1 extends cg1 {
    public final List b;
    public final bn8 c;
    public final xib d;
    public final boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(t7f t7fVar) {
        super(vfh.a);
        List list = t7fVar != null ? t7fVar.a : null;
        list = list == null ? hd5.a : list;
        bn8 bn8Var = t7fVar != null ? t7fVar.b : null;
        xib xibVar = t7fVar != null ? t7fVar.c : null;
        boolean z = t7fVar != null ? t7fVar.d : false;
        this.b = list;
        this.c = bn8Var;
        this.d = xibVar;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg1)) {
            return false;
        }
        bg1 bg1Var = (bg1) obj;
        return fni.a(this.b, bg1Var.b) && fni.a(this.c, bg1Var.c) && fni.a(this.d, bg1Var.d) && this.o == bg1Var.o;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 111L;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        bn8 bn8Var = this.c;
        int iHashCode2 = (iHashCode + (bn8Var == null ? 0 : bn8Var.hashCode())) * 31;
        xib xibVar = this.d;
        return Boolean.hashCode(this.o) + ((iHashCode2 + (xibVar != null ? xibVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        bg1 bg1Var = t98Var instanceof bg1 ? (bg1) t98Var : null;
        if (bg1Var == null) {
            return null;
        }
        ag1 ag1Var = new ag1(9);
        BitSet bitSet = (BitSet) ag1Var.b;
        bitSet.set(0, !this.b.equals(bg1Var.b));
        bitSet.set(1, (fni.a(this.c, bg1Var.c) && fni.a(this.d, bg1Var.d)) ? false : true);
        bitSet.set(2, this.o != bg1Var.o);
        return ag1Var;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 111;
    }

    public final String toString() {
        return "Speaker(opponentsPages=" + this.b + ", mainOpponentState=" + this.c + ", opponentPipState=" + this.d + ", isP2GCallAnimationDepended=" + this.o + ")";
    }
}
