package defpackage;

/* loaded from: classes2.dex */
public final class v5h implements x5h {
    public final float a;

    public v5h(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5h) && Float.compare(this.a, ((v5h) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "SeekProgress(progress=" + this.a + ")";
    }
}
