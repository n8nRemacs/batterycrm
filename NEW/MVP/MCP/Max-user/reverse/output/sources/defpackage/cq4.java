package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cq4 implements uq4 {
    public final /* synthetic */ nq4 a;

    public /* synthetic */ cq4(nq4 nq4Var) {
        this.a = nq4Var;
    }

    @Override // defpackage.uq4
    public zjd f(int i, lfg lfgVar, int[] iArr) {
        tg7 tg7VarI = wg7.i();
        for (int i2 = 0; i2 < lfgVar.a; i2++) {
            tg7VarI.a(new iq4(i, lfgVar, i2, this.a, iArr[i2]));
        }
        return tg7VarI.i();
    }
}
