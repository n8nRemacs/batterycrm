package defpackage;

/* loaded from: classes2.dex */
public abstract class tmf extends fm {
    public final String b;

    public tmf(String str, String str2) {
        super(str);
        this.b = str2;
    }

    @Override // defpackage.fm
    public final void d(gy7 gy7Var) {
        String str = this.b;
        if (str == null || str.length() == 0) {
            gy7Var.getClass();
        } else {
            gy7Var.b0(this.a);
            ((e2) gy7Var).h(str);
        }
    }

    public final String toString() {
        return this.a + " = " + ((Object) this.b);
    }
}
