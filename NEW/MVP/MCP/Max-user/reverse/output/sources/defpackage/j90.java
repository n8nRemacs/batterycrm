package defpackage;

/* loaded from: classes.dex */
public final class j90 {
    public final int a;
    public final long b;

    public j90(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj;
        return az1.c(this.a, j90Var.a) && this.b == j90Var.b;
    }

    public final int hashCode() {
        int iV = (az1.v(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return iV ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return ho7.k(sb, this.b, "}");
    }
}
