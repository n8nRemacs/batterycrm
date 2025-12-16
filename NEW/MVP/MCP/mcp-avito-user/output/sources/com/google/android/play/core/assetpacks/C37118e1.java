package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37118e1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f358309a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f358310b = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f358313e = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f358311c = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f358316h = false;

    /* renamed from: f, reason: collision with root package name */
    public int f358314f = 30;

    /* renamed from: d, reason: collision with root package name */
    public long f358312d = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f358315g = -1;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public String f358317i = null;

    public final int a(byte[] bArr, int i12, int i13) {
        int iC2 = c(30, i12, i13, bArr);
        if (iC2 == -1) {
            return -1;
        }
        if (this.f358311c == -1) {
            byte[] bArr2 = this.f358309a;
            long jA2 = ((C37108b0.a(2, bArr2) << 16) | C37108b0.a(0, bArr2)) & 4294967295L;
            this.f358311c = jA2;
            if (jA2 == 67324752) {
                this.f358316h = false;
                byte[] bArr3 = this.f358309a;
                this.f358312d = ((C37108b0.a(20, bArr3) << 16) | C37108b0.a(18, bArr3)) & 4294967295L;
                this.f358315g = C37108b0.a(8, this.f358309a);
                this.f358313e = C37108b0.a(26, this.f358309a);
                int iA2 = this.f358313e + 30 + C37108b0.a(28, this.f358309a);
                this.f358314f = iA2;
                int length = this.f358309a.length;
                if (length < iA2) {
                    do {
                        length += length;
                    } while (length < iA2);
                    this.f358309a = Arrays.copyOf(this.f358309a, length);
                }
            } else {
                this.f358316h = true;
            }
        }
        int iC3 = c(this.f358314f, i12 + iC2, i13 - iC2, bArr);
        if (iC3 == -1) {
            return -1;
        }
        int i14 = iC2 + iC3;
        if (!this.f358316h && this.f358317i == null) {
            this.f358317i = new String(this.f358309a, 30, this.f358313e);
        }
        return i14;
    }

    public final C37105a0 b() {
        int i12 = this.f358310b;
        int i13 = this.f358314f;
        if (i12 < i13) {
            return new C37105a0(this.f358317i, this.f358312d, this.f358315g, true, this.f358316h, Arrays.copyOf(this.f358309a, i12));
        }
        C37105a0 c37105a0 = new C37105a0(this.f358317i, this.f358312d, this.f358315g, false, this.f358316h, Arrays.copyOf(this.f358309a, i13));
        this.f358310b = 0;
        this.f358313e = -1;
        this.f358311c = -1L;
        this.f358316h = false;
        this.f358314f = 30;
        this.f358312d = -1L;
        this.f358315g = -1;
        this.f358317i = null;
        return c37105a0;
    }

    public final int c(int i12, int i13, int i14, byte[] bArr) {
        int i15 = this.f358310b;
        if (i15 >= i12) {
            return 0;
        }
        int iMin = Math.min(i14, i12 - i15);
        System.arraycopy(bArr, i13, this.f358309a, this.f358310b, iMin);
        int i16 = this.f358310b + iMin;
        this.f358310b = i16;
        if (i16 < i12) {
            return -1;
        }
        return iMin;
    }
}
