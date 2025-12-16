package defpackage;

/* loaded from: classes2.dex */
public final class zle implements bme {
    public final yje a;

    public zle(yje yjeVar) {
        this.a = yjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zle) && fni.a(this.a, ((zle) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsClose(event=" + this.a + ")";
    }
}
