package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class di8 extends yqb {
    public static final di8 g;
    public static volatile String h;
    public static final r5j i;
    public static volatile boolean j;
    public static final String k;

    static {
        fo4 fo4Var = new fo4();
        fo4Var.a = true;
        g = new di8(fo4Var.a());
        i = new r5j(1L);
        j = true;
        k = "login";
    }

    public static void o(bi8 bi8Var) {
        String str = h;
        ceg cegVar = str != null ? new ceg(str) : null;
        String str2 = cegVar != null ? cegVar.a : null;
        if (str2 != null) {
            ((AtomicLong) i.b).set(0L);
            yqb.e(g, bi8Var, str2);
            return;
        }
        String str3 = g.b;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.X;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str3, "Invoked 'fail', but traceId is null or empty!", null);
        }
    }

    public static void p() {
        String str = h;
        ceg cegVar = str != null ? new ceg(str) : null;
        String str2 = cegVar != null ? cegVar.a : null;
        if (str2 != null) {
            yqb.c(g, "login_handled", 6, str2, 48);
            return;
        }
        String str3 = g.b;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.X;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str3, "Invoked 'onLoginHandled', but traceId is null or empty!", null);
        }
    }

    @Override // defpackage.yqb
    public final String g() {
        return k;
    }

    @Override // defpackage.yqb
    public final void i(boolean z) {
        ((AtomicLong) i.b).set(0L);
        if (z) {
            q(false);
        }
    }

    @Override // defpackage.yqb
    public final c9a j() {
        long[] jArr = fzd.a;
        c9a c9aVar = new c9a();
        di8 di8Var = g;
        erb erbVar = di8Var.a.d;
        if (erbVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c9aVar.i("class", Byte.valueOf(((nv4) erbVar.b.getValue()).a));
        erb erbVar2 = di8Var.a.d;
        if (erbVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        k18 k18Var = erbVar2.c;
        c9aVar.i("connection_type", Integer.valueOf(((ur3) k18Var.getValue()).f() ? ((ur3) k18Var.getValue()).b().a : 1));
        if (j) {
            c9aVar.i("is_first_login", 1);
        }
        erb erbVar3 = di8Var.a.d;
        if (erbVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!((tih) erbVar3.d.getValue()).d()) {
            c9aVar.i("background", 1);
        }
        return c9aVar;
    }

    @Override // defpackage.yqb
    public final long k(c9a c9aVar) {
        if (!j) {
            return super.k(c9aVar);
        }
        int i2 = s65.d;
        return v9j.h(HttpStatus.SC_MULTIPLE_CHOICES, y65.SECONDS);
    }

    public final void q(boolean z) {
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("Setting isFirstLogin=", z), null);
            }
        }
        j = z;
    }

    public final void r(Long l) {
        lg8 lg8Var = lg8.d;
        r5j r5jVar = i;
        if (((AtomicLong) r5jVar.b).compareAndSet(1L, 2L)) {
            String str = this.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Started collected 'login', reason=COLD_START, sliceTime=" + l, null);
            }
            if (l == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            h = yqb.l(this, null, null, l, 3);
            return;
        }
        if ((((AtomicLong) r5jVar.b).get() & 2) == 0) {
            String str2 = this.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str2, "Started collected 'login', reason=WARM_START", null);
            }
            long[] jArr = fzd.a;
            c9a c9aVar = new c9a();
            c9aVar.i("warm_start", 1);
            h = yqb.l(this, null, c9aVar, null, 5);
            return;
        }
        String str3 = this.b;
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
            l6bVar3.c(lg8Var, str3, "Skip starting 'login', already collecting COLD_START", null);
        }
        String str4 = h;
        ceg cegVar = str4 != null ? new ceg(str4) : null;
        String str5 = cegVar != null ? cegVar.a : null;
        if (str5 != null) {
            yqb.c(g, "app_start_to_connection", 0, str5, 56);
            return;
        }
        String str6 = g.b;
        l6b l6bVar4 = wqi.a;
        if (l6bVar4 == null) {
            return;
        }
        lg8 lg8Var2 = lg8.X;
        if (l6bVar4.b(lg8Var2)) {
            l6bVar4.c(lg8Var2, str6, "Invoked 'onAppStarted', but traceId is null or empty!", null);
        }
    }
}
