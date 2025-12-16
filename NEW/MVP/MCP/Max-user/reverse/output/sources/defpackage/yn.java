package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class yn {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static we8 b(Configuration configuration) {
        return we8.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(we8 we8Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(we8Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, we8 we8Var) {
        configuration.setLocales(LocaleList.forLanguageTags(we8Var.a.a.toLanguageTags()));
    }
}
