package defpackage;

/* loaded from: classes2.dex */
public final class ame implements bme {
    public final ake a;

    public ame(ake akeVar) {
        this.a = akeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ame) && fni.a(this.a, ((ame) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsInfo(event=" + this.a + ")";
    }
}
