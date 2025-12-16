package defpackage;

/* loaded from: classes2.dex */
public abstract class e2 implements gy7 {
    @Override // defpackage.gy7
    public void X() {
        c("null");
    }

    public abstract void c(String str);

    public final void d(String str) {
        if (str != null) {
            h(str);
        } else {
            X();
        }
    }

    public final void i(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            c(Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric value to be finite but was " + d);
        }
    }

    public final void l(int i) {
        c(Integer.toString(i));
    }
}
