package defpackage;

/* loaded from: classes2.dex */
public final class aq9 implements dq9 {
    public final long a;
    public final b5h b;
    public final float c;

    public aq9(long j, b5h b5hVar, float f) {
        this.a = j;
        this.b = b5hVar;
        this.c = f;
    }

    @Override // defpackage.dq9
    public final b5h b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq9)) {
            return false;
        }
        aq9 aq9Var = (aq9) obj;
        return this.a == aq9Var.a && fni.a(this.b, aq9Var.b) && Float.compare(this.c, aq9Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.eq9
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnSeek(messageId=" + this.a + ", model=" + this.b + ", progress=" + this.c + ")";
    }
}
