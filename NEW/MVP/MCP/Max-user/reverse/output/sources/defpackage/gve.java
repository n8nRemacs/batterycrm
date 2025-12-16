package defpackage;

/* loaded from: classes.dex */
public final class gve implements sy4 {
    public final jve a;
    public final long b;
    public final Object c;
    public final l42 d;

    public gve(jve jveVar, long j, Object obj, l42 l42Var) {
        this.a = jveVar;
        this.b = j;
        this.c = obj;
        this.d = l42Var;
    }

    @Override // defpackage.sy4
    public final void dispose() {
        jve jveVar = this.a;
        synchronized (jveVar) {
            if (this.b < jveVar.s()) {
                return;
            }
            Object[] objArr = jveVar.Z;
            if (kve.c(objArr, this.b) != this) {
                return;
            }
            kve.d(objArr, this.b, kve.a);
            jveVar.n();
        }
    }
}
