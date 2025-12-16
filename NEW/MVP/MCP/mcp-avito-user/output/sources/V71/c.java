package V71;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ArrayEquals.java */
/* loaded from: classes7.dex */
public class c extends l {
    public static Object[] d(Object obj) {
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        Object[] objArr = new Object[Array.getLength(obj)];
        for (int i12 = 0; i12 < Array.getLength(obj); i12++) {
            objArr[i12] = Array.get(obj, i12);
        }
        return objArr;
    }

    @Override // V71.l, org.mockito.d
    public final boolean b(Object obj) {
        Object obj2 = this.f16930b;
        if (obj2 == null || obj == null) {
            return k.a(obj2, obj);
        }
        if ((obj2 instanceof boolean[]) && (obj instanceof boolean[])) {
            return Arrays.equals((boolean[]) obj2, (boolean[]) obj);
        }
        if ((obj2 instanceof byte[]) && (obj instanceof byte[])) {
            return Arrays.equals((byte[]) obj2, (byte[]) obj);
        }
        if ((obj2 instanceof char[]) && (obj instanceof char[])) {
            return Arrays.equals((char[]) obj2, (char[]) obj);
        }
        if ((obj2 instanceof double[]) && (obj instanceof double[])) {
            return Arrays.equals((double[]) obj2, (double[]) obj);
        }
        if ((obj2 instanceof float[]) && (obj instanceof float[])) {
            return Arrays.equals((float[]) obj2, (float[]) obj);
        }
        if ((obj2 instanceof int[]) && (obj instanceof int[])) {
            return Arrays.equals((int[]) obj2, (int[]) obj);
        }
        if ((obj2 instanceof long[]) && (obj instanceof long[])) {
            return Arrays.equals((long[]) obj2, (long[]) obj);
        }
        if ((obj2 instanceof short[]) && (obj instanceof short[])) {
            return Arrays.equals((short[]) obj2, (short[]) obj);
        }
        if ((obj2 instanceof Object[]) && (obj instanceof Object[])) {
            return Arrays.equals((Object[]) obj2, (Object[]) obj);
        }
        return false;
    }

    @Override // V71.l
    public final String toString() {
        Object obj = this.f16930b;
        if (obj == null || !obj.getClass().isArray()) {
            return org.mockito.internal.matchers.text.d.a(obj);
        }
        Object[] objArrD = d(obj);
        StringBuilder sb2 = new StringBuilder("[");
        for (int i12 = 0; i12 < objArrD.length; i12++) {
            sb2.append(new l(objArrD[i12]));
            if (i12 != objArrD.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
