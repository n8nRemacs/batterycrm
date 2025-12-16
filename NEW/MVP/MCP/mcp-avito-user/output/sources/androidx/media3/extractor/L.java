package androidx.media3.extractor;

import androidx.media3.common.util.C23110a;

/* compiled from: VorbisBitArray.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50392b;

    /* renamed from: c, reason: collision with root package name */
    public int f50393c;

    /* renamed from: d, reason: collision with root package name */
    public int f50394d;

    public L(byte[] bArr) {
        this.f50391a = bArr;
        this.f50392b = bArr.length;
    }

    public final boolean a() {
        boolean z12 = (((this.f50391a[this.f50393c] & 255) >> this.f50394d) & 1) == 1;
        c(1);
        return z12;
    }

    public final int b(int i12) {
        int i13 = this.f50393c;
        int iMin = Math.min(i12, 8 - this.f50394d);
        int i14 = i13 + 1;
        byte[] bArr = this.f50391a;
        int i15 = ((bArr[i13] & 255) >> this.f50394d) & (255 >> (8 - iMin));
        while (iMin < i12) {
            i15 |= (bArr[i14] & 255) << iMin;
            iMin += 8;
            i14++;
        }
        int i16 = i15 & ((-1) >>> (32 - i12));
        c(i12);
        return i16;
    }

    public final void c(int i12) {
        int i13;
        int i14 = i12 / 8;
        int i15 = this.f50393c + i14;
        this.f50393c = i15;
        int i16 = (i12 - (i14 * 8)) + this.f50394d;
        this.f50394d = i16;
        boolean z12 = true;
        if (i16 > 7) {
            this.f50393c = i15 + 1;
            this.f50394d = i16 - 8;
        }
        int i17 = this.f50393c;
        if (i17 < 0 || (i17 >= (i13 = this.f50392b) && (i17 != i13 || this.f50394d != 0))) {
            z12 = false;
        }
        C23110a.g(z12);
    }
}
