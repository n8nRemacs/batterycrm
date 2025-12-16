package defpackage;

/* loaded from: classes.dex */
public final class lgi extends ui3 {
    public final /* synthetic */ int X;
    public final /* synthetic */ wi3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgi(wi3 wi3Var, int i) {
        super(wi3Var, (byte) 0);
        this.X = i;
        this.Y = wi3Var;
    }

    @Override // defpackage.ui3
    public final Object b(int i) {
        int i2 = this.X;
        wi3 wi3Var = this.Y;
        switch (i2) {
            case 0:
                Object obj = wi3.v0;
                return wi3Var.m()[i];
            case 1:
                return new ihi(wi3Var, i);
            default:
                Object obj2 = wi3.v0;
                return wi3Var.n()[i];
        }
    }
}
