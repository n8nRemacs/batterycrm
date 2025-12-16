package defpackage;

/* loaded from: classes.dex */
public final class c9c {
    public static final c9c e = new c9c(null, null, xn5.a, n41.h);
    public final String a;
    public final gxi b;
    public final co5 c;
    public final n41 d;

    public c9c(String str, gxi gxiVar, co5 co5Var, n41 n41Var) {
        this.a = str;
        this.b = gxiVar;
        this.c = co5Var;
        this.d = n41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9c)) {
            return false;
        }
        c9c c9cVar = (c9c) obj;
        return fni.a(this.a, c9cVar.a) && fni.a(this.b, c9cVar.b) && fni.a(this.c, c9cVar.c) && fni.a(this.d, c9cVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        gxi gxiVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (gxiVar != null ? gxiVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousCallState(callId=" + this.a + ", recallTarget=" + this.b + ", state=" + this.c + ", chatInfo=" + this.d + ")";
    }
}
