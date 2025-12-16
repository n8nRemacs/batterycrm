package defpackage;

/* loaded from: classes.dex */
public final class lx4 implements brf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lx4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.brf
    public final Object get() {
        switch (this.a) {
            case 0:
                nx4 nx4Var = (nx4) this.b;
                nx4Var.j.getClass();
                return nx4Var.j.getApplicationContext().getCacheDir();
            case 1:
                return ((iz5) ((k18) this.b).getValue()).k();
            default:
                return this.b;
        }
    }
}
