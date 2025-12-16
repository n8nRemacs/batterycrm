package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k26 extends e9c {
    public float[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
