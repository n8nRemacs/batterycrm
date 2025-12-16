package defpackage;

/* loaded from: classes2.dex */
public final class yp9 implements dq9 {
    public final long a;
    public final b5h b;

    public yp9(long j, b5h b5hVar) {
        this.a = j;
        this.b = b5hVar;
    }

    @Override // defpackage.dq9
    public final b5h b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp9)) {
            return false;
        }
        yp9 yp9Var = (yp9) obj;
        return this.a == yp9Var.a && fni.a(this.b, yp9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.eq9
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnPauseRequested(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
