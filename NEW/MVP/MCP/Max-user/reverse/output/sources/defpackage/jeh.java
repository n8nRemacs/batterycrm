package defpackage;

/* loaded from: classes.dex */
public final class jeh implements wfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm6 b;

    public /* synthetic */ jeh(int i, cm6 cm6Var) {
        this.a = i;
        this.b = cm6Var;
    }

    @Override // defpackage.wfh
    public final xfh a(Class cls) {
        switch (this.a) {
            case 0:
                return (xfh) cls.cast(((kvf) this.b).invoke());
            case 1:
                return (xfh) cls.cast(((q8g) this.b).invoke());
            case 2:
                return (xfh) cls.cast(((rth) this.b).invoke());
            case 3:
                return (xfh) cls.cast(((wj1) this.b).invoke());
            default:
                return (xfh) cls.cast(((dwh) this.b).invoke());
        }
    }
}
