package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ns5 implements drf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ns5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.drf
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = 3;
                return new vr8(((kr5) ((ps5) obj).a.get()).a(), new er5(i2), i2);
            default:
                nm0 nm0Var = ((g5i) obj).d;
                wqi.c("g5i", "getWorkManager: enable = " + nm0Var.u(), new Object[0]);
                Boolean bool = (Boolean) nm0Var.u();
                if (bool != null && bool.booleanValue()) {
                    return vqa.k(Boolean.TRUE);
                }
                wqi.c("g5i", "waiting for enable ...", new Object[0]);
                return nm0Var;
        }
    }
}
