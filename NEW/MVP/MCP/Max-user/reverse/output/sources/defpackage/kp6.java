package defpackage;

/* loaded from: classes2.dex */
public final class kp6 implements lp6 {
    public final float a;

    public kp6(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp6) && Float.compare(this.a, ((kp6) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "UpdateCameraTranslation(translationY=" + this.a + ")";
    }
}
