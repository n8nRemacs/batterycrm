package Ic1;

import N41.h;
import N41.i;
import N41.j;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class a {
    public static j a(String str) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.equals("webview") ? i.f11199a : lowerCase.equals("browser") ? h.f11198a : h.f11198a;
    }
}
