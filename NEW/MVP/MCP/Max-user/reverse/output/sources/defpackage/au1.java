package defpackage;

/* loaded from: classes.dex */
public final class au1 implements cu1 {
    public final long a;

    public au1(long j) {
        this.a = j;
    }

    @Override // defpackage.cu1
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au1) && this.a == ((au1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "None(lastUpdate=", ")");
    }
}
