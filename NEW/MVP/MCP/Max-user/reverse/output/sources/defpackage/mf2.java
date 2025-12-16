package defpackage;

/* loaded from: classes2.dex */
public final class mf2 {
    public final String a;
    public final long b;
    public final long c;

    public mf2(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mf2.class == obj.getClass()) {
            mf2 mf2Var = (mf2) obj;
            String str = mf2Var.a;
            if (this.b != mf2Var.b || this.c != mf2Var.c) {
                return false;
            }
            String str2 = this.a;
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
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{text='");
        sb.append(uog.h(this.a));
        sb.append("', time=");
        sb.append(this.b);
        sb.append(", id=");
        return utb.l(sb, this.c, '}');
    }
}
