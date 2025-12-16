package defpackage;

/* loaded from: classes2.dex */
public final class g3a {
    public final nt1 a;
    public final float b;
    public final boolean c;
    public final Long d;
    public final boolean e;

    public g3a(nt1 nt1Var, float f, boolean z, Long l, boolean z2) {
        this.a = nt1Var;
        this.b = f;
        this.c = z;
        this.d = l;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3a)) {
            return false;
        }
        g3a g3aVar = (g3a) obj;
        return fni.a(this.a, g3aVar.a) && Float.compare(this.b, g3aVar.b) == 0 && this.c == g3aVar.c && fni.a(this.d, g3aVar.d) && this.e == g3aVar.e;
    }

    public final int hashCode() {
        int iB = fui.b(hf3.b(this.a.hashCode() * 31, this.b, 31), this.c);
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((iB + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieStateUpdate(trackKey=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return az1.k(sb, this.e, ")");
    }
}
