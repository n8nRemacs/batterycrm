package defpackage;

/* loaded from: classes.dex */
public final class ht1 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ it1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht1(it1 it1Var, int i) {
        super(12, gt1.b);
        this.c = i;
        this.d = it1Var;
        switch (i) {
            case 1:
                super(12, (Object) null);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((gt1) obj) != ((gt1) obj2)) {
                    it1.C(this.d);
                    break;
                }
                break;
            default:
                yeb yebVarY = (yeb) obj2;
                if (!fni.a((yeb) obj, yebVarY)) {
                    it1 it1Var = this.d;
                    if (yebVarY == null) {
                        yebVarY = a93.s0.y(it1Var);
                    }
                    it1Var.onThemeChanged(yebVarY);
                    break;
                }
                break;
        }
    }
}
