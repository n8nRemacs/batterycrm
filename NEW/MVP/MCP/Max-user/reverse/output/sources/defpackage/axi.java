package defpackage;

import java.lang.reflect.Array;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class axi {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable != null && comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        if (comparable != null || comparable2 != null) {
            if (comparable == null && comparable2 != null) {
                return -1;
            }
            if (comparable != null && comparable2 == null) {
                return 1;
            }
        }
        return 0;
    }

    public static int b(int i, Object obj) {
        if (obj == null) {
            return i * 37;
        }
        if (!obj.getClass().isArray()) {
            return (i * 37) + obj.hashCode();
        }
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            i = b(i, Array.get(obj, i2));
        }
        return i;
    }

    public static final zy0 c(sy0 sy0Var) {
        switch (az0.$EnumSwitchMapping$0[sy0Var.ordinal()]) {
            case 1:
                return zy0.b;
            case 2:
                return zy0.c;
            case 3:
                return zy0.d;
            case 4:
                return zy0.o;
            case 5:
                return zy0.Y;
            case 6:
                return zy0.Z;
            case 7:
                return zy0.t0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
