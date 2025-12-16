package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class l8j {
    public static final bud a(c54 c54Var, ih ihVar, ih ihVar2) {
        bud budVar = new bud(c54Var, null, null, null, false, -1);
        budVar.c(ihVar2);
        budVar.a(ihVar);
        return budVar;
    }

    public static final Boolean b(String str, Bundle bundle) {
        String string = bundle.getString(str, null);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    public static final Integer c(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return Integer.valueOf(Integer.parseInt(string));
        }
        return null;
    }

    public static final Long d(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    public static final long[] e(String str, Bundle bundle) {
        return bundle.containsKey(str) ? j(str, bundle) : new long[0];
    }

    public static final boolean f(String str, Bundle bundle) {
        Boolean boolB = b(str, bundle);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final double g(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Double dValueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final int h(String str, Bundle bundle) {
        Integer numC = c(str, bundle);
        if (numC != null) {
            return numC.intValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final long i(String str, Bundle bundle) {
        Long lD = d(str, bundle);
        if (lD != null) {
            return lD.longValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final long[] j(String str, Bundle bundle) {
        return ue3.e0(lee.o(new nhg(lee.g(vmf.T(k(str, bundle), new String[]{","}, 4), ai4.a), bi4.a)));
    }

    public static final String k(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
