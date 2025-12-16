package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class d1g {
    public static final /* synthetic */ int b = 0;
    public final k18 a;

    public d1g(k18 k18Var) {
        this.a = k18Var;
    }

    public static boolean a(int i) {
        return i == 2 || i == 3;
    }

    public static boolean c(Throwable th) {
        return (th instanceof TamErrorException) && qaj.c(((TamErrorException) th).a.b);
    }

    public static boolean d(Throwable th) {
        return (th instanceof TamErrorException) && "io.exception".equals(((TamErrorException) th).a.b);
    }

    public final mta b() {
        return ((oje) this.a.getValue()).g.g(new vef(16)).q(1L);
    }
}
