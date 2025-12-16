package defpackage;

/* loaded from: classes2.dex */
public final class sfb implements ufb {
    public final int a;
    public final int b;
    public final float c;
    public final int d;
    public final em6 e;

    public sfb(int i, em6 em6Var, int i2) {
        int i3 = (i2 & 8) != 0 ? w9b.P : w9b.R;
        this.a = i;
        this.b = 4;
        this.c = 12.0f;
        this.d = i3;
        this.e = em6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfb)) {
            return false;
        }
        sfb sfbVar = (sfb) obj;
        return this.a == sfbVar.a && this.b == sfbVar.b && this.c == sfbVar.c && this.d == sfbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hf3.b(xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31);
    }
}
