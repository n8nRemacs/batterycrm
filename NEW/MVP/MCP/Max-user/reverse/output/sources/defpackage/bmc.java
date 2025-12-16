package defpackage;

/* loaded from: classes2.dex */
public final class bmc extends lmc {
    public final p5g a;

    public bmc(p5g p5gVar) {
        this.a = p5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmc) && this.a.equals(((bmc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExternalShareChannelLink(text=" + this.a + ")";
    }
}
