package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hpg extends e9c {
    public byte[] a;
    public int b;

    @Override // defpackage.e9c
    public final Object a() {
        return new gpg(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.e9c
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.e9c
    public final int d() {
        return this.b;
    }
}
