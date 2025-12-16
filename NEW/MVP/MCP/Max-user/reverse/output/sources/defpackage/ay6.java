package defpackage;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ay6 extends ArrayList {
    public final Class a;
    public final Class b;

    public ay6(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sa9 a() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        sa9 sa9Var = new sa9();
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i2] = numValueOf.intValue();
        }
        sa9Var.a = iArr;
        sa9Var.b = sa9.o(objArr, iArr);
        sa9Var.c = sa9.o(objArr2, iArr);
        return sa9Var;
    }
}
