package defpackage;

/* loaded from: classes2.dex */
public final class md9 implements sd9 {
    public final int a;
    public final long b;

    public md9(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md9)) {
            return false;
        }
        md9 md9Var = (md9) obj;
        return this.a == md9Var.a && this.b == md9Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbM = u45.m(this.a, this.b, "OnContextActionClicked(actionId=", ", memberId=");
        sbM.append(")");
        return sbM.toString();
    }
}
