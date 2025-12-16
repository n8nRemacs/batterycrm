package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class fg8 {
    public final tih a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final n9a i;
    public final ru0 j;
    public final ContextScope k;

    public fg8(tih tihVar, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = tihVar;
        this.b = k18Var2;
        this.c = k18Var;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var3;
        this.h = k18Var7;
        Symbol symbol = o9a.a;
        this.i = new n9a();
        int i = s65.d;
        q2b q2bVar = (q2b) lzfVar;
        this.j = new ru0(q2bVar.b(), q2bVar.a(), v9j.h(1000, y65.MILLISECONDS), new cg8(k18Var, null), new bg8(k18Var3, 0));
        this.k = d7j.a(q2bVar.b().plus(zk6.a()).plus(new c84("LogController")));
        tihVar.c(new wd6(k18Var2, 2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fg8 r7, java.util.List r8, java.util.List r9, java.lang.Exception r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg8.a(fg8, java.util.List, java.util.List, java.lang.Exception, q44):java.lang.Object");
    }

    public static final dm b(fg8 fg8Var, fcf fcfVar) {
        fg8Var.getClass();
        hg8 hg8Var = fcfVar.c;
        return new dm(hg8Var.f, hg8Var.c, hg8Var.d, hg8Var.a, hg8Var.b, hg8Var.e);
    }

    public final pb3 c() {
        return (pb3) this.b.getValue();
    }

    public final w0g d() {
        return (w0g) this.h.getValue();
    }

    public final boolean e() {
        ((gu5) ((rt5) this.d.getValue())).getClass();
        return !r0.j(PmsKey.f2analyticsenabled, true);
    }

    public final boolean f(String str, boolean z) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "LogController", "Try sending logs, reason=" + str + ", force=" + z, null);
            }
        }
        if (!this.i.f(null)) {
            wqi.c("LogController", "Log is in progress, skipping.", new Object[0]);
            return false;
        }
        if (!d().s0.add("LOG_DISCONNECTION_BLOCKER")) {
            throw new IllegalStateException("Trying to add already present blocker ".concat("LOG_DISCONNECTION_BLOCKER").toString());
        }
        svi.e(this.k, null, null, new eg8(this, z, null), 3);
        return true;
    }
}
