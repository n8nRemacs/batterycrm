package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class q64 implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu3 b;

    public /* synthetic */ q64(hu3 hu3Var, int i) {
        this.a = i;
        this.b = hu3Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        hu3 hu3Var;
        Object obj2;
        switch (this.a) {
            case 0:
                hu3Var = this.b;
                obj2 = (Throwable) obj;
                break;
            default:
                hu3Var = this.b;
                obj2 = (String) obj;
                break;
        }
        hu3Var.accept(obj2);
    }
}
