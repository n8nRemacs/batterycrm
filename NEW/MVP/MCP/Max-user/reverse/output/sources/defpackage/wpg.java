package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wpg extends e9c {
    public short[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return new vpg(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
