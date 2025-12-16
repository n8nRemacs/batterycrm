package defpackage;

/* loaded from: classes.dex */
public final class q37 extends v37 {
    public final int a;

    public q37(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q37) && this.a == ((q37) obj).a;
    }

    public final int hashCode() {
        return az1.v(this.a);
    }

    public final String toString() {
        return "CallType(callMediaType=" + u45.v(this.a) + ")";
    }
}
