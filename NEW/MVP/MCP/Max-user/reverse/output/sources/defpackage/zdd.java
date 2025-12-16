package defpackage;

/* loaded from: classes2.dex */
public final class zdd implements eed {
    public final d3 a;

    public zdd(d3 d3Var) {
        this.a = d3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdd) && fni.a(this.a, ((zdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediaMessageSend(media=" + this.a + ")";
    }
}
