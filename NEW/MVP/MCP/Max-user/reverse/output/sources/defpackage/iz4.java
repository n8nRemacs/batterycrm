package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class iz4 extends e9c {
    public double[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
