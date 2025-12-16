package defpackage;

/* loaded from: classes2.dex */
public final class os8 {
    public final int a;
    public final ps8 b;
    public final zpb c;
    public final boolean d;

    public os8(int i, ps8 ps8Var, zpb zpbVar, boolean z) {
        this.a = i;
        this.b = ps8Var;
        this.c = zpbVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os8)) {
            return false;
        }
        os8 os8Var = (os8) obj;
        return this.a == os8Var.a && fni.a(this.b, os8Var.b) && fni.a(this.c, os8Var.c) && this.d == os8Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (az1.v(this.a) * 31)) * 31;
        zpb zpbVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (zpbVar == null ? 0 : zpbVar.hashCode())) * 31);
    }

    public final String toString() {
        return "NetworkConditionChange(condition=" + ho7.t(this.a) + ", state=" + this.b + ", suggestedVideoSettings=" + this.c + ", preferHardwarePVXEncoder=" + this.d + ")";
    }
}
