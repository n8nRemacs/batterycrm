package defpackage;

import java.util.HashMap;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class dd {
    public final k18 a;
    public final k18 b;

    public dd(k18 k18Var, k18 k18Var2) {
        this.a = k18Var2;
        this.b = k18Var;
    }

    public final fg8 a() {
        return (fg8) this.b.getValue();
    }

    public final void b(String str, Map map) {
        if (a().e()) {
            return;
        }
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c = "PUSH";
        xp7Var.d = str;
        xp7Var.c(to8.s(map));
        h(xp7Var.d());
    }

    public final void c(int i, String str) {
        if (a().e()) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        us usVar = new us(1);
        usVar.put(SdkMetricStatEvent.VALUE_KEY, numValueOf);
        if (str.length() == 0) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        h(new hg8(0L, 0L, System.currentTimeMillis(), "ACTION", str, usVar));
    }

    public final void d(long j, String str, String str2) {
        if (a().e()) {
            return;
        }
        xp7 xp7Var = new xp7();
        xp7Var.c = "ACTION";
        xp7Var.d = str;
        xp7Var.b(Long.valueOf(j), "duration");
        if (str2 != null) {
            xp7Var.b(str2, SdkMetricStatEvent.VALUE_KEY);
        }
        h(xp7Var.d());
    }

    public final void e(String str) {
        if (a().e()) {
            return;
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        h(new hg8(0L, 0L, System.currentTimeMillis(), "ACTION", str, new us(0)));
    }

    public final void f(String str, String str2) {
        if (a().e()) {
            return;
        }
        us usVar = new us(1);
        usVar.put(SdkMetricStatEvent.VALUE_KEY, str2);
        if (str.length() == 0) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        h(new hg8(0L, 0L, System.currentTimeMillis(), "ACTION", str, usVar));
    }

    public final void g(String str, HashMap map) {
        if (a().e()) {
            return;
        }
        xp7 xp7Var = new xp7();
        xp7Var.c = "ACTION";
        xp7Var.d = str;
        xp7Var.c(map);
        xp7Var.o = ((pe8) ((pb3) this.a.getValue())).K();
        h(xp7Var.d());
    }

    public final void h(hg8 hg8Var) {
        hg8 hg8Var2;
        if (a().e()) {
            return;
        }
        if (hg8Var.c == 0 || hg8Var.d == 0) {
            hg8Var2 = new hg8(((w4e) ((pb3) this.a.getValue())).s(), ((pe8) ((pb3) this.a.getValue())).K(), hg8Var.f, hg8Var.a, hg8Var.b, hg8Var.e);
        } else {
            hg8Var2 = hg8Var;
        }
        fg8 fg8VarA = a();
        if (fg8VarA.e()) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "LogController", "store " + hg8Var2, null);
            }
        }
        if (fni.a(hg8Var2.b, "COLD_START") || fni.a(hg8Var2.b, "WARM_START")) {
            hwa hwaVar = (hwa) fg8VarA.e.getValue();
            hwa.r(hwaVar, new ba4(hwaVar.t().a.k(), new dm(hg8Var2.f, hg8Var2.c, hg8Var2.d, hg8Var2.a, hg8Var2.b, hg8Var2.e)));
            return;
        }
        ru0 ru0Var = fg8VarA.j;
        fcf fcfVar = new fcf(0L, System.currentTimeMillis(), hg8Var2);
        jve jveVar = ru0Var.h;
        if (!ru0Var.i.get() || ((Number) ((eof) jveVar.i()).getValue()).intValue() == 0) {
            ru0Var.k.add(fcfVar);
        } else {
            jveVar.h(fcfVar);
        }
    }

    public final void i(long j, String str) {
        if (a().e() || str.length() == 0) {
            return;
        }
        Long lValueOf = Long.valueOf(j);
        us usVar = new us(1);
        usVar.put("duration", lValueOf);
        if (str.length() == 0) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        h(new hg8(0L, 0L, System.currentTimeMillis(), "SCREEN", str, usVar));
    }
}
