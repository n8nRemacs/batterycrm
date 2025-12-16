package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class ml6 {
    public static ll6 a;
    public static SimpleDateFormat b;
    public static SimpleDateFormat d;
    public static SimpleDateFormat f;
    public static SimpleDateFormat h;
    public static SimpleDateFormat j;
    public static SimpleDateFormat l;
    public static SimpleDateFormat p;
    public static SimpleDateFormat q;
    public static Boolean r;
    public static SimpleDateFormat t;
    public static final Object c = new Object();
    public static final Object e = new Object();
    public static final Object g = new Object();
    public static final Object i = new Object();
    public static final Object k = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static final Object s = new Object();
    public static final Object u = new Object();

    public static String a(Context context, Locale locale, long j2, long j3, boolean z) {
        long j4 = j3 - j2;
        mf4 mf4VarI = mf4.i(j2, TimeZone.getDefault());
        if (j4 < 86400000) {
            return j(mf4.i(j3, TimeZone.getDefault()), mf4.i(j2, TimeZone.getDefault())) ? b(context, j2, locale) : z ? j4 < 14400000 ? b(context, j2, locale) : context.getString(c5d.tt_dates_yesterday) : String.format(context.getString(c5d.tt_dates_yesterday_at), b(context, j2, locale));
        }
        mf4 mf4VarI2 = mf4.i(j3, TimeZone.getDefault());
        return mf4VarI.m().p(1).equals(mf4VarI2.m()) ? z ? context.getString(c5d.tt_dates_yesterday) : String.format(context.getString(c5d.tt_dates_yesterday_at), b(context, j2, locale)) : mf4VarI.a.equals(mf4VarI2.a) ? g(locale, j2, false) : g(locale, j2, true);
    }

    public static String b(Context context, long j2, Locale locale) {
        String str;
        synchronized (c) {
            str = d(context, locale).format(Long.valueOf(j2));
        }
        return str;
    }

    public static String c(long j2) {
        int i2 = ((int) j2) / 60;
        long j3 = j2 - (i2 * 60);
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(":");
        sb.append(j3 < 10 ? "0" : "");
        sb.append(j3);
        return sb.toString();
    }

    public static DateFormat d(Context context, Locale locale) {
        boolean zBooleanValue;
        if (b == null) {
            synchronized (s) {
                try {
                    if (r == null) {
                        r = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                    }
                    zBooleanValue = r.booleanValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            b = new SimpleDateFormat(zBooleanValue ? "HH:mm" : "h:mm a", locale);
        }
        return b;
    }

    public static y21 e(long j2, long j3) {
        if (j2 <= 0) {
            return new y21(0L, 10, 1, false);
        }
        long j4 = j3 - j2;
        if (j4 < 0) {
            return new y21(0L, 10, 1, false);
        }
        if (j(mf4.i(j3, TimeZone.getDefault()), mf4.i(j2, TimeZone.getDefault()))) {
            if (j4 < 60000) {
                return new y21(0L, 1, 1, false);
            }
            if (j4 < 3600000) {
                return new y21((int) (j4 / 60000), 2, 1, false);
            }
            if (j4 < 86400000) {
                return new y21((int) (j4 / 3600000), 3, 1, false);
            }
        }
        if (j4 < 3600000) {
            return new y21((int) (j4 / 60000), 2, 1, false);
        }
        if (j4 < 86400000) {
            return new y21(j2, 4, 1, false);
        }
        if (j4 < 129600000) {
            return new y21(0L, 4, 1, false);
        }
        return mf4.i(j2, TimeZone.getDefault()).a.equals(mf4.i(j3, TimeZone.getDefault()).a) ? new y21(j2, 9, 1, false) : new y21(j2, 8, 1, false);
    }

    public static String f(Locale locale, long j2, boolean z) {
        String str;
        String str2;
        if (z) {
            synchronized (k) {
                if (j == null) {
                    j = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str2 = j.format(Long.valueOf(j2));
            }
            return str2;
        }
        synchronized (i) {
            if (h == null) {
                h = new SimpleDateFormat("d MMM", locale);
            }
            str = h.format(Long.valueOf(j2));
        }
        return str;
    }

    public static String g(Locale locale, long j2, boolean z) {
        String str;
        String str2;
        if (z) {
            synchronized (g) {
                if (f == null) {
                    f = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str2 = f.format(Long.valueOf(j2));
            }
            return str2;
        }
        synchronized (e) {
            if (d == null) {
                d = new SimpleDateFormat("d MMM", locale);
            }
            str = d.format(Long.valueOf(j2));
        }
        return str;
    }

    public static String h(Context context, Locale locale, long j2, boolean z) {
        String strF;
        String string = context.getString(c5d.tt_at);
        if (z) {
            synchronized (m) {
                if (l == null) {
                    l = new SimpleDateFormat("dd.MM.yy", locale);
                }
                strF = l.format(Long.valueOf(j2));
            }
        } else {
            strF = f(locale, j2, false);
        }
        return String.format(string, strF, b(context, j2, locale));
    }

    public static ll6 i() {
        v17 v17Var;
        ll6 ll6Var = a;
        if (ll6Var != null) {
            return ll6Var;
        }
        synchronized (ml6.class) {
            v17Var = new v17(18, (byte) 0);
            a = v17Var;
        }
        return v17Var;
    }

    public static boolean j(mf4 mf4Var, mf4 mf4Var2) {
        return mf4Var.c.equals(mf4Var2.c) && mf4Var.b.equals(mf4Var2.b) && mf4Var.a.equals(mf4Var2.a);
    }

    public static crf k(crf crfVar) {
        return ((crfVar instanceof irf) || (crfVar instanceof hrf)) ? crfVar : crfVar instanceof Serializable ? new hrf(crfVar) : new irf(crfVar);
    }

    public static final void l(esg esgVar) {
        esgVar.b(1, new qu4(22));
        esgVar.d(573, new qu4(23));
        esgVar.d(574, new a13(18));
        esgVar.d(575, new a13(19));
        esgVar.d(576, new em(26));
    }
}
