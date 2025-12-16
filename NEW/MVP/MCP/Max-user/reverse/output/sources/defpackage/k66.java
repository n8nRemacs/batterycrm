package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k66 extends a1 {
    public final /* synthetic */ int c;
    public final kn6 d;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k66(i66 i66Var, kn6 kn6Var, Object obj, int i) {
        super(i66Var);
        this.c = i;
        this.d = kn6Var;
        this.o = obj;
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        switch (this.c) {
            case 0:
                try {
                    Object obj = this.d.a;
                    Objects.requireNonNull(obj, "The initial value supplied is null");
                    this.b.c(new j66(q76Var, obj, (pm0) this.o));
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    xd5.a(th, q76Var);
                }
            default:
                try {
                    Object obj2 = this.d.a;
                    Objects.requireNonNull(obj2, "The seed supplied is null");
                    this.b.c(new i76(q76Var, (zb8) this.o, obj2, i66.a));
                    break;
                } catch (Throwable th2) {
                    raj.c(th2);
                    xd5.a(th2, q76Var);
                    return;
                }
        }
    }
}
