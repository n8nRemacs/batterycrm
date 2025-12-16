package defpackage;

/* loaded from: classes.dex */
public final class to7 extends ro7 {
    public static final to7 d = new to7(1, 0, 1);

    @Override // defpackage.ro7
    public final boolean equals(Object obj) {
        if (!(obj instanceof to7)) {
            return false;
        }
        if (isEmpty() && ((to7) obj).isEmpty()) {
            return true;
        }
        to7 to7Var = (to7) obj;
        return this.a == to7Var.a && this.b == to7Var.b;
    }

    @Override // defpackage.ro7
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ro7
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.ro7
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
