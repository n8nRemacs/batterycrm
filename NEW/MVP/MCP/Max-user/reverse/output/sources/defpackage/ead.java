package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ead implements em6 {
    public final /* synthetic */ had a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ead(had hadVar, int i, int i2) {
        this.a = hadVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        had hadVar = this.a;
        if (hadVar.u0 == 2) {
            hadVar.update(this.b, this.c - iIntValue, -1, iIntValue);
        }
        return qqg.a;
    }
}
