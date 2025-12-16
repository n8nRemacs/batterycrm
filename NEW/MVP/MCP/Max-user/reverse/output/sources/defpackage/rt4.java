package defpackage;

/* loaded from: classes.dex */
public final class rt4 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt4) && this.a == ((rt4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return xc0.h(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
