package defpackage;

import android.util.LruCache;

/* loaded from: classes2.dex */
public final class x6g {
    public static final LruCache a = new LruCache(2);

    public static void a(of0 of0Var, c7g c7gVar) {
        if (of0Var == null) {
            return;
        }
        wqi.c("ThemeBackgroundCache", "Save theme " + of0Var + " to cache.", new Object[0]);
        a.put(of0Var, c7gVar);
    }
}
