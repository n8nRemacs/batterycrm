package defpackage;

/* loaded from: classes.dex */
public abstract class au7 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            StringBuilder sbM = ho7.m(i, "Given job ID ", " is different than previous ");
            sbM.append(this.b);
            throw new IllegalArgumentException(sbM.toString());
        }
    }
}
