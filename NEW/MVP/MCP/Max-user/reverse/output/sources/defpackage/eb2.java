package defpackage;

/* loaded from: classes.dex */
public final class eb2 extends cb2 {
    static {
        new eb2((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eb2)) {
            return false;
        }
        if (isEmpty() && ((eb2) obj).isEmpty()) {
            return true;
        }
        eb2 eb2Var = (eb2) obj;
        return this.a == eb2Var.a && this.b == eb2Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return fni.b(this.a, this.b) > 0;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
