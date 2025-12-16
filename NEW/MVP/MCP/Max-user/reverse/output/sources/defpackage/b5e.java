package defpackage;

/* loaded from: classes2.dex */
public final class b5e extends u08 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5e(ha8 ha8Var, int i) {
        super(1);
        this.a = i;
        this.b = ha8Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.cancel(false);
                break;
            default:
                this.b.cancel(false);
                break;
        }
        return qqg.a;
    }
}
