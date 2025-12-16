package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class xui {
    public static String a(String str, il0 il0Var, hl0 hl0Var) {
        int iOrdinal = il0Var.ordinal();
        hl0 hl0Var2 = hl0.a;
        String str2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : hl0Var == hl0Var2 ? "sqr_720" : "w_1440" : hl0Var == hl0Var2 ? "sqr_480" : "w_1080" : hl0Var == hl0Var2 ? "sqr_192" : "w_480" : hl0Var == hl0Var2 ? "sqr_96" : "w_240" : hl0Var == hl0Var2 ? "sqr_64" : "w_180";
        if (l8g.c(str)) {
            return null;
        }
        return u45.k(str, "&fn=", str2);
    }

    public static hf6[] b(ArrayList arrayList) {
        int size = arrayList.size();
        hf6[] hf6VarArr = new hf6[size];
        for (int i = 0; i < size; i++) {
            hf6 hf6Var = ((jz8) arrayList.get(i)).a;
            if (hf6Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hf6VarArr[i] = hf6Var;
        }
        return hf6VarArr;
    }

    public static int c(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iB = zui.b(obj);
        int i4 = iB & i;
        int iD = d(i4, obj3);
        if (iD != 0) {
            int i5 = ~i;
            int i6 = iB & i5;
            int i7 = -1;
            while (true) {
                i2 = iD - 1;
                int i8 = iArr[i2];
                i3 = i8 & i;
                if ((i8 & i5) != i6 || !pui.c(obj, objArr[i2]) || (objArr2 != null && !pui.c(obj2, objArr2[i2]))) {
                    if (i3 == 0) {
                        break;
                    }
                    i7 = i2;
                    iD = i3;
                } else {
                    break;
                }
            }
            if (i7 == -1) {
                f(i4, i3, obj3);
                return i2;
            }
            iArr[i7] = (iArr[i7] & i5) | (i3 & i);
            return i2;
        }
        return -1;
    }

    public static int d(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(ho7.f(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void f(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
