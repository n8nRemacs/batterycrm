package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import j.InterfaceC42148d;
import j.X;

/* compiled from: LocaleManagerCompat.java */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: LocaleManagerCompat.java */
    @X
    public static class a {
    }

    /* compiled from: LocaleManagerCompat.java */
    @X
    public static class b {
    }

    /* compiled from: LocaleManagerCompat.java */
    @X
    public static class c {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    @j.N
    @InterfaceC42148d
    public static androidx.core.os.q a(@j.N Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.q.a(C22754l.b(context));
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? androidx.core.os.q.g(c.a(systemService)) : androidx.core.os.q.f44804b;
    }
}
