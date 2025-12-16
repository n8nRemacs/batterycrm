package defpackage;

/* loaded from: classes.dex */
public final class bud {
    public final c54 a;
    public String b;
    public h54 c;
    public h54 d;
    public boolean e;
    public int f;

    public bud(c54 c54Var, String str, h54 h54Var, h54 h54Var2, boolean z, int i) {
        this.a = c54Var;
        this.b = str;
        this.c = h54Var;
        this.d = h54Var2;
        this.e = z;
        this.f = i;
    }

    public final void a(h54 h54Var) {
        if (this.e) {
            throw new RuntimeException(bud.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        }
        this.d = h54Var;
    }

    public final h54 b() {
        h54 overriddenPushHandler = this.a.getOverriddenPushHandler();
        return overriddenPushHandler == null ? this.c : overriddenPushHandler;
    }

    public final void c(h54 h54Var) {
        if (this.e) {
            throw new RuntimeException(bud.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        }
        this.c = h54Var;
    }

    public final void d(String str) {
        if (this.e) {
            throw new RuntimeException(bud.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        }
        this.b = str;
    }
}
