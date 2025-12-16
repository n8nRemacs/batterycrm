package defpackage;

/* loaded from: classes.dex */
public final class uw0 extends x42 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw0(int i, xo0 xo0Var, Float f, int i2) {
        super(i, xo0Var, f);
        this.d = i2;
    }

    @Override // defpackage.x42
    public final String toString() {
        switch (this.d) {
            case 0:
                return "[ButtCap]";
            case 1:
                return "[RoundCap]";
            default:
                return "[SquareCap]";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0() {
        super(0, null, null);
        this.d = 0;
    }
}
