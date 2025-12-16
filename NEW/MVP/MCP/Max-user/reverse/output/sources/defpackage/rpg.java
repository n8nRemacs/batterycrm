package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rpg extends e9c {
    public long[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return new qpg(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
