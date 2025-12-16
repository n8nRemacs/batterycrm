package androidx.core.os;

import j.P;
import j.X;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
final class r implements s {

    /* compiled from: LocaleListCompatWrapper.java */
    @X
    public static class a {
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        q qVar = q.f44804b;
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    @Override // androidx.core.os.s
    @P
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        ((r) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @j.N
    public final String toString() {
        throw null;
    }
}
