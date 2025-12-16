package defpackage;

/* loaded from: classes2.dex */
public final class yv7 extends aw7 {
    public final bw7 d;

    public yv7(bw7 bw7Var) {
        super("client", 1, bw7Var);
        this.d = bw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv7) && fni.a(this.d, ((yv7) obj).d);
    }

    public final int hashCode() {
        bw7 bw7Var = this.d;
        if (bw7Var == null) {
            return 0;
        }
        return bw7Var.hashCode();
    }

    @Override // defpackage.aw7
    public final bw7 l() {
        return this.d;
    }

    public final String toString() {
        return "ClientError(reason=" + this.d + ")";
    }
}
