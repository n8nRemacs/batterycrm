package androidx.core.os;

import android.os.LocaleList;
import j.P;
import j.X;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f44804b = g(new LocaleList(new Locale[0]));

    /* renamed from: a, reason: collision with root package name */
    public final t f44805a;

    /* compiled from: LocaleListCompat.java */
    @X
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f44806a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    /* compiled from: LocaleListCompat.java */
    @X
    public static class b {
    }

    public q(t tVar) {
        this.f44805a = tVar;
    }

    @j.N
    public static q a(@P String str) {
        if (str == null || str.isEmpty()) {
            return f44804b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i12 = 0; i12 < length; i12++) {
            String str2 = strArrSplit[i12];
            int i13 = a.f44806a;
            localeArr[i12] = Locale.forLanguageTag(str2);
        }
        return g(new LocaleList(localeArr));
    }

    @j.N
    @X
    public static q g(@j.N LocaleList localeList) {
        return new q(new t(localeList));
    }

    @P
    public final Locale b(int i12) {
        return this.f44805a.f44807a.get(i12);
    }

    public final boolean c() {
        return this.f44805a.f44807a.isEmpty();
    }

    @j.F
    public final int d() {
        return this.f44805a.f44807a.size();
    }

    @j.N
    public final String e() {
        return this.f44805a.f44807a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (this.f44805a.equals(((q) obj).f44805a)) {
                return true;
            }
        }
        return false;
    }

    @P
    public final Object f() {
        return this.f44805a.f44807a;
    }

    public final int hashCode() {
        return this.f44805a.f44807a.hashCode();
    }

    @j.N
    public final String toString() {
        return this.f44805a.f44807a.toString();
    }
}
