package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o3c {
    public static final o3c b;
    public static final String c;
    public final a26 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        hsi.g(!false);
        b = new o3c(new a26(sparseBooleanArray));
        String str = zxg.a;
        c = Integer.toString(0, 36);
    }

    public o3c(a26 a26Var) {
        this.a = a26Var;
    }

    public static o3c b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            hsi.g(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        hsi.g(!false);
        return new o3c(new a26(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            a26 a26Var = this.a;
            if (i >= a26Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(a26Var.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3c) {
            return this.a.equals(((o3c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
