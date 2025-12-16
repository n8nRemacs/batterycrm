package defpackage;

/* loaded from: classes.dex */
public final class si3 extends ui3 {
    public final /* synthetic */ int X;
    public final /* synthetic */ wi3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si3(wi3 wi3Var, int i) {
        super(wi3Var);
        this.X = i;
        this.Y = wi3Var;
    }

    @Override // defpackage.ui3
    public final Object a(int i) {
        switch (this.X) {
            case 0:
                return this.Y.i()[i];
            case 1:
                return new vi3(this.Y, i);
            default:
                return this.Y.j()[i];
        }
    }
}
