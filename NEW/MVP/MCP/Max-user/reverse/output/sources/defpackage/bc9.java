package defpackage;

/* loaded from: classes.dex */
public final class bc9 implements wta {
    public final cb8 a;
    public final wta b;
    public int c = -1;

    public bc9(cb8 cb8Var, wta wtaVar) {
        this.a = cb8Var;
        this.b = wtaVar;
    }

    @Override // defpackage.wta
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.f(this);
    }
}
