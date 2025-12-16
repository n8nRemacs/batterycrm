package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hpf implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz9 b;

    public /* synthetic */ hpf(lz9 lz9Var, int i) {
        this.a = i;
        this.b = lz9Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        ku3 ku3Var = (ku3) obj;
        switch (this.a) {
            case 0:
                if (!ku3Var.v()) {
                    this.b.getClass();
                }
                break;
            case 1:
                if (!ku3Var.v()) {
                    this.b.getClass();
                }
                break;
        }
        return this.b.k(ku3Var, "@");
    }
}
