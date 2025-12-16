package defpackage;

/* loaded from: classes2.dex */
public final class fxa {
    public final k18 a;
    public final k18 b;

    public fxa(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final z7c a() {
        return (z7c) this.a.getValue();
    }

    public final boolean b() {
        String string;
        return (a().a.s() == -1 || (string = a().d.g.getString("auth.token", null)) == null || string.length() == 0) ? false : true;
    }

    public final String c() {
        String string;
        if (a().a.s() == 0 || (string = a().d.g.getString("auth.token", null)) == null || string.length() == 0) {
            return null;
        }
        return a().d.g.getString("auth.token", null);
    }

    public final void d(boolean z) {
        wqi.c("fxa", "removeAccount", new Object[0]);
        a().d.c();
        if (z) {
            xi8 xi8Var = (xi8) this.b.getValue();
            xi8Var.getClass();
            wqi.c(xi8.class.getName(), "execute " + Thread.currentThread(), new Object[0]);
            if (xi8Var.e.getAndSet(true)) {
                wqi.q(xi8.class.getName(), "logout in process", new Object[0]);
                return;
            }
            int i = s65.d;
            svi.e(d7j.i(d7j.i((tsd) xi8Var.a.getValue(), ((kl4) xi8Var.b.getValue()).a), bia.a), null, null, new wi8(xi8Var, v9j.i(System.nanoTime(), y65.NANOSECONDS), null), 3).invokeOnCompletion(new wu7(9, xi8Var));
        }
    }
}
