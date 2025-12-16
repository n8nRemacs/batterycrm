package defpackage;

/* loaded from: classes.dex */
public final class q61 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q61(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new m41(this.b, 4, false);
            default:
                return new m41(this.b, 4, true);
        }
    }
}
