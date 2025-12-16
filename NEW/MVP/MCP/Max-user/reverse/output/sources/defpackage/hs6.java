package defpackage;

/* loaded from: classes2.dex */
public final class hs6 {
    public volatile long a;
    public volatile long b;
    public final /* synthetic */ is6 c;

    public hs6(is6 is6Var) {
        this.c = is6Var;
    }

    @vnf
    public final void onEvent(th2 th2Var) throws Throwable {
        if (th2Var.a != this.b) {
            return;
        }
        wqi.c("is6", "onEvent " + th2Var, new Object[0]);
        this.c.d.makeCompleting$kotlinx_coroutines_core(this.c.c.J(this.a));
    }
}
