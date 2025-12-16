package defpackage;

/* loaded from: classes.dex */
public final class sb4 extends x42 {
    public final xo0 d;
    public final float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb4(xo0 xo0Var, float f) {
        super(3, xo0Var, Float.valueOf(f));
        s5j.h(xo0Var, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.d = xo0Var;
        this.o = f;
    }

    @Override // defpackage.x42
    public final String toString() {
        StringBuilder sbN = az1.n("[CustomCap: bitmapDescriptor=", String.valueOf(this.d), " refWidth=");
        sbN.append(this.o);
        sbN.append("]");
        return sbN.toString();
    }
}
