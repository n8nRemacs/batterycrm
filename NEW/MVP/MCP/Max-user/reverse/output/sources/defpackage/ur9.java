package defpackage;

/* loaded from: classes2.dex */
public final class ur9 implements xr9 {
    public final int a;

    public ur9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur9) && this.a == ((ur9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "ProcessClickMultiSelect(actionId=", ")");
    }
}
