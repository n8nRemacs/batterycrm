package defpackage;

/* loaded from: classes2.dex */
public final class cq9 implements dq9 {
    public final long a;
    public final b5h b;

    public cq9(long j, b5h b5hVar) {
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
        if (!(obj instanceof cq9)) {
            return false;
        }
        cq9 cq9Var = (cq9) obj;
        return this.a == cq9Var.a && fni.a(this.b, cq9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.eq9
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnVideoEnded(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
