package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class if2 extends utb {
    public final long[] a;

    public if2(long[] jArr) {
        this.a = jArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof if2) && Objects.equals(this.a, ((if2) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(if2.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
