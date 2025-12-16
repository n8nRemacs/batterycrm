package defpackage;

/* loaded from: classes.dex */
public final class xr8 extends c3 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr8(or8 or8Var, Object obj, int i) {
        super(or8Var);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.or8
    public final void f(bs8 bs8Var) {
        switch (this.b) {
            case 0:
                this.a.e(new pr8(bs8Var, (tm6) this.c));
                break;
            case 1:
                this.a.e(new tk3(bs8Var, 1, (tm6) this.c));
                break;
            default:
                this.a.e(new qu1(bs8Var, 5, (yr8) this.c));
                break;
        }
    }
}
