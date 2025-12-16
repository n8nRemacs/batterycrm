package defpackage;

/* loaded from: classes2.dex */
public final class cl9 {
    public final long a;
    public final long b;
    public final String c;

    public cl9(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cl9.class == obj.getClass()) {
            cl9 cl9Var = (cl9) obj;
            String str = cl9Var.c;
            if (this.a != cl9Var.a || this.b != cl9Var.b) {
                return false;
            }
            String str2 = this.c;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMediaUploadKey{messageId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", attachLocalId='");
        return ho7.l(sb, this.c, "'}");
    }
}
