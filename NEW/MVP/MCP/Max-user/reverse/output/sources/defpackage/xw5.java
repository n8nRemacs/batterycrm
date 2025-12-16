package defpackage;

/* loaded from: classes.dex */
public final class xw5 {
    public final ea0 a;
    public final ea0 b;

    public xw5(ea0 ea0Var) {
        this.a = ea0Var;
        this.b = ea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw5)) {
            return false;
        }
        return this.b.equals(((xw5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
