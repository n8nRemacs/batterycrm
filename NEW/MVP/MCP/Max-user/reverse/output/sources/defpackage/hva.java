package defpackage;

/* loaded from: classes.dex */
public final class hva implements b48, j42 {
    public final l48 a;
    public final bva b;
    public iva c;
    public final /* synthetic */ jva d;

    public hva(jva jvaVar, l48 l48Var, bva bvaVar) {
        this.d = jvaVar;
        this.a = l48Var;
        this.b = bvaVar;
        l48Var.a(this);
    }

    @Override // defpackage.j42
    public final void cancel() {
        this.a.f(this);
        this.b.b.remove(this);
        iva ivaVar = this.c;
        if (ivaVar != null) {
            ivaVar.cancel();
        }
        this.c = null;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        if (k38Var == k38.ON_START) {
            this.c = this.d.b(this.b);
            return;
        }
        if (k38Var != k38.ON_STOP) {
            if (k38Var == k38.ON_DESTROY) {
                cancel();
            }
        } else {
            iva ivaVar = this.c;
            if (ivaVar != null) {
                ivaVar.cancel();
            }
        }
    }
}
