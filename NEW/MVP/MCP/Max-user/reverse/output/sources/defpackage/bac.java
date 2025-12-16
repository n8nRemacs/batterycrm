package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class bac implements j48 {
    public static final bac s0 = new bac();
    public int a;
    public int b;
    public Handler o;
    public boolean c = true;
    public boolean d = true;
    public final l48 X = new l48(this);
    public final awa Y = new awa(13, this);
    public final iv6 Z = new iv6(28, this);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (!this.c) {
                this.o.removeCallbacks(this.Y);
            } else {
                this.X.d(k38.ON_RESUME);
                this.c = false;
            }
        }
    }

    @Override // defpackage.j48
    public final l48 p() {
        return this.X;
    }
}
