package defpackage;

/* loaded from: classes.dex */
public final class o3a implements ry9 {
    public final int a;

    public o3a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3a) && this.a == ((o3a) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
