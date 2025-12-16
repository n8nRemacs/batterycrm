package defpackage;

import android.util.LruCache;

/* loaded from: classes2.dex */
public final class i2h {
    public static final LruCache b = new LruCache(1000);
    public final k18 a;

    public i2h(k18 k18Var) {
        this.a = k18Var;
    }

    public final g2h a(String str) {
        LruCache lruCache = b;
        h2h h2hVar = (h2h) lruCache.get(str);
        if (h2hVar == null) {
            return null;
        }
        gu5 gu5Var = (gu5) ((rt5) this.a.getValue());
        if (h2hVar.b + Math.max(((Number) gu5Var.P.D(gu5Var, gu5.S[30])).longValue(), 60000L) > System.currentTimeMillis()) {
            return h2hVar.a;
        }
        lruCache.remove(str);
        return null;
    }
}
