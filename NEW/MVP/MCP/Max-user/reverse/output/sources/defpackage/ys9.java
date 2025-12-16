package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ys9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu9 b;
    public final /* synthetic */ y58 c;

    public /* synthetic */ ys9(vu9 vu9Var, y58 y58Var, int i) {
        this.a = i;
        this.b = vu9Var;
        this.c = y58Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        ci5 ci5Var;
        String strConcat;
        switch (this.a) {
            case 0:
                ci5Var = this.b.J1;
                qr9 qr9Var = qr9.c;
                String str = ((w58) this.c).a;
                qr9Var.getClass();
                strConcat = ":call-join-preview?link=".concat(str);
                break;
            default:
                ci5Var = this.b.J1;
                qr9 qr9Var2 = qr9.c;
                String str2 = ((w58) this.c).a;
                qr9Var2.getClass();
                strConcat = ":call-join-preview?link=".concat(str2);
                break;
        }
        xc0.l(strConcat, ci5Var);
        return qqg.a;
    }
}
