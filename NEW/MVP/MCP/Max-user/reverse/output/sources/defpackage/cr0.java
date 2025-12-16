package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cr0 extends e9c {
    public boolean[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
