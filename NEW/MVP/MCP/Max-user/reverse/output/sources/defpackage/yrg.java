package defpackage;

/* loaded from: classes2.dex */
public final class yrg implements asg {
    public final long a;

    public yrg(long j) {
        this.a = j;
    }

    @Override // defpackage.asg
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrg) && this.a == ((yrg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "InitialEvent(mark=", ")");
    }
}
