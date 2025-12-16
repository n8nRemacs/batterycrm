package defpackage;

/* loaded from: classes2.dex */
public final class vn9 implements zn9 {
    public final vf6 a;

    public vn9(vf6 vf6Var) {
        this.a = vf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn9) && fni.a(this.a, ((vn9) obj).a);
    }

    public final int hashCode() {
        vf6 vf6Var = this.a;
        if (vf6Var == null) {
            return 0;
        }
        return vf6Var.hashCode();
    }

    public final String toString() {
        return "OnMessageSend(forwardMessagesSendData=" + this.a + ")";
    }
}
