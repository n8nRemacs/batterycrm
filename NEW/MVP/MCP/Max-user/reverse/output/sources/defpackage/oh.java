package defpackage;

/* loaded from: classes2.dex */
public final class oh extends sh {
    public final float a;

    public oh(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh) && Float.compare(this.a, ((oh) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "FloatNumber(value=" + this.a + ")";
    }
}
