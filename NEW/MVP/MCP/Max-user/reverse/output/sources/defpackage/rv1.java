package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rv1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;
    public final /* synthetic */ k18 c;

    public /* synthetic */ rv1(k18 k18Var, k18 k18Var2, int i) {
        this.a = i;
        this.b = k18Var;
        this.c = k18Var2;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return zk6.a().plus(((q2b) ((lzf) this.b.getValue())).b()).plus((x74) this.c.getValue());
            case 1:
                return d7j.a(eoi.a().plus(((q2b) ((lzf) this.b.getValue())).a().limitedParallelism(1, "non-contacts")).plus((x74) this.c.getValue()));
            case 2:
                return d7j.a(((q2b) ((lzf) this.b.getValue())).b().limitedParallelism(1, "shortcuts").plus((x74) this.c.getValue()));
            case 3:
                return new sya(this.b, this.c);
            default:
                return zk6.a().plus(((q2b) ((lzf) this.b.getValue())).b()).plus((x74) this.c.getValue());
        }
    }
}
