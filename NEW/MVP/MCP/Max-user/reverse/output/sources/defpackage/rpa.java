package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class rpa {
    public static final /* synthetic */ yy7[] c = {new toc(rpa.class, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), ho7.d(vid.a, rpa.class, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0)};
    public static final String d = rpa.class.getName();
    public final kz4 a;
    public final kz4 b;

    public rpa(kz4 kz4Var, kz4 kz4Var2) {
        this.a = kz4Var2;
        this.b = kz4Var;
    }

    public static void a(Map map, ws5 ws5Var) {
        long j = ws5Var.a;
        Long l = ws5Var.g;
        map.put("trid", Long.valueOf(j));
        String str = ws5Var.h;
        if (str != null) {
            map.put("eKey", str);
        }
        if (l != null) {
            map.put("ttime", l);
            map.put("dtime", Long.valueOf(ws5Var.j - l.longValue()));
            map.put("fcmdtime", Long.valueOf(ws5Var.i - l.longValue()));
        }
        Long l2 = ws5Var.e;
        if (l2 != null) {
            map.put("suid", l2);
        }
    }

    public final dd b() {
        yy7 yy7Var = c[1];
        return (dd) this.b.get();
    }

    public final yi5 c() {
        yy7 yy7Var = c[0];
        return (yi5) this.a.get();
    }
}
