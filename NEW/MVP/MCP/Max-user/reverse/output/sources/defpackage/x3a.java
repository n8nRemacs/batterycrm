package defpackage;

/* loaded from: classes.dex */
public final class x3a implements ry9 {
    public final int a;

    public x3a(int i) {
        hsi.a("Unsupported orientation", i == 0 || i == 90 || i == 180 || i == 270);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3a) && this.a == ((x3a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + 527;
    }

    public final String toString() {
        return "Orientation= " + this.a;
    }
}
