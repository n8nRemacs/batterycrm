package defpackage;

/* loaded from: classes2.dex */
public final class eje implements fje {
    public final int a;

    public eje(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eje) && this.a == ((eje) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "Room(id=", ")");
    }
}
