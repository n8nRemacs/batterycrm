package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mo7 extends e9c {
    public int[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
