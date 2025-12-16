package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class t12 implements dn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t12(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dn6
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                o38 o38Var = (o38) this.b;
                o38Var.q = (x9c) obj;
                o38Var.s();
                o38Var.r(null);
                return null;
            case 1:
                le8 le8Var = (le8) obj;
                le8Var.i = (gsc) this.b;
                return le8Var;
            case 2:
                ((u8c) this.b).b(z8c.b);
                return null;
            default:
                return (w9c) ((i0) this.b).invoke(obj);
        }
    }
}
