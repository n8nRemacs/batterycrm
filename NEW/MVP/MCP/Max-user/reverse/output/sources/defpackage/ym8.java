package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ym8 extends utb {
    public final xm8 a;
    public final List b;

    public ym8(xm8 xm8Var, List list) {
        this.a = xm8Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ym8)) {
            return false;
        }
        ym8 ym8Var = (ym8) obj;
        return Objects.equals(this.a, ym8Var.a) && Objects.equals(this.b, ym8Var.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(ym8.class.getSimpleName());
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
