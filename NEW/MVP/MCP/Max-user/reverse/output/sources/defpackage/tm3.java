package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class tm3 extends ijb implements Serializable {
    public final Comparator[] a;

    public tm3(mx0 mx0Var, mx0 mx0Var2) {
        this.a = new Comparator[]{mx0Var, mx0Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tm3) {
            return Arrays.equals(this.a, ((tm3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.l(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
