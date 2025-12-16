package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class rub implements Serializable {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public int b;
    public long c;
    public boolean d;
    public String o;
    public int s0;
    public String t0;
    public int u0;
    public String v0;

    public final boolean equals(Object obj) {
        rub rubVar;
        if (!(obj instanceof rub) || (rubVar = (rub) obj) == null) {
            return false;
        }
        if (this == rubVar) {
            return true;
        }
        return this.b == rubVar.b && this.c == rubVar.c && this.o.equals(rubVar.o) && this.Y == rubVar.Y && this.s0 == rubVar.s0 && this.t0.equals(rubVar.t0) && this.u0 == rubVar.u0 && this.v0.equals(rubVar.v0);
    }

    public final int hashCode() {
        return ((this.v0.hashCode() + utb.k(this.u0, u45.e((((u45.e((Long.valueOf(this.c).hashCode() + ((2173 + this.b) * 53)) * 53, 53, this.o) + (this.Y ? 1231 : 1237)) * 53) + this.s0) * 53, 53, this.t0), 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.b);
        sb.append(" National Number: ");
        sb.append(this.c);
        if (this.X && this.Y) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.Z) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.s0);
        }
        if (this.d) {
            sb.append(" Extension: ");
            sb.append(this.o);
        }
        return sb.toString();
    }
}
