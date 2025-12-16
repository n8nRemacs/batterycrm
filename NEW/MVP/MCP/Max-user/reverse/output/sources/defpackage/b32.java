package defpackage;

/* loaded from: classes2.dex */
public final class b32 {
    public final int a;

    public b32(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b32) && this.a == ((b32) obj).a;
    }

    public final int hashCode() {
        return az1.v(this.a);
    }

    public final String toString() {
        return "CameraParams(facing=" + wy1.v(this.a) + ")";
    }
}
