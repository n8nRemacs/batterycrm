package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class we8 {
    public static final we8 b = new we8(new xe8(ve8.a(new Locale[0])));
    public final xe8 a;

    public we8(xe8 xe8Var) {
        this.a = xe8Var;
    }

    public static we8 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = ue8.a(strArrSplit[i]);
        }
        return new we8(new xe8(ve8.a(localeArr)));
    }

    public final int b() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof we8) {
            return this.a.equals(((we8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
