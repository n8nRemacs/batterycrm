package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import shark.AndroidResourceIdNames;

/* loaded from: classes8.dex */
public final class to implements su {

    /* renamed from: b, reason: collision with root package name */
    private final dn f390253b;

    /* renamed from: c, reason: collision with root package name */
    private final long f390254c;

    /* renamed from: d, reason: collision with root package name */
    private long f390255d;

    /* renamed from: f, reason: collision with root package name */
    private int f390257f;

    /* renamed from: g, reason: collision with root package name */
    private int f390258g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f390256e = new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f390252a = new byte[4096];

    static {
        st.a("goog.exo.extractor");
    }

    public to(gn gnVar, long j12, long j13) {
        this.f390253b = gnVar;
        this.f390255d = j12;
        this.f390254c = j13;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final void a(byte[] bArr, int i12, int i13) {
        b(bArr, i12, i13, false);
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final boolean b(byte[] bArr, int i12, int i13, boolean z12) {
        if (!a(z12, i13)) {
            return false;
        }
        System.arraycopy(this.f390256e, this.f390257f - i13, bArr, i12, i13);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final void c() {
        this.f390257f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final long e() {
        return this.f390255d + this.f390257f;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final long getPosition() {
        return this.f390255d;
    }

    @Override // com.yandex.mobile.ads.impl.su, com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        int i14 = this.f390258g;
        int iA2 = 0;
        if (i14 != 0) {
            int iMin = Math.min(i14, i13);
            System.arraycopy(this.f390256e, 0, bArr, i12, iMin);
            int i15 = this.f390258g - iMin;
            this.f390258g = i15;
            this.f390257f = 0;
            byte[] bArr2 = this.f390256e;
            byte[] bArr3 = i15 < bArr2.length - 524288 ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i15] : bArr2;
            System.arraycopy(bArr2, iMin, bArr3, 0, i15);
            this.f390256e = bArr3;
            iA2 = iMin;
        }
        if (iA2 == 0) {
            iA2 = a(bArr, i12, i13, 0, true);
        }
        if (iA2 != -1) {
            this.f390255d += iA2;
        }
        return iA2;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final void readFully(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        a(bArr, i12, i13, false);
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final long a() {
        return this.f390254c;
    }

    public final int c(int i12) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f390258g, i12);
        int i13 = this.f390258g - iMin;
        this.f390258g = i13;
        this.f390257f = 0;
        byte[] bArr = this.f390256e;
        byte[] bArr2 = i13 < bArr.length - 524288 ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13] : bArr;
        System.arraycopy(bArr, iMin, bArr2, 0, i13);
        this.f390256e = bArr2;
        if (iMin == 0) {
            byte[] bArr3 = this.f390252a;
            iMin = a(bArr3, 0, Math.min(i12, bArr3.length), 0, true);
        }
        if (iMin != -1) {
            this.f390255d += iMin;
        }
        return iMin;
    }

    public final boolean a(boolean z12, int i12) {
        int i13 = this.f390257f + i12;
        byte[] bArr = this.f390256e;
        if (i13 > bArr.length) {
            int length = bArr.length * 2;
            int i14 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13;
            int i15 = pc1.f388768a;
            this.f390256e = Arrays.copyOf(this.f390256e, Math.max(i14, Math.min(length, i13 + 524288)));
        }
        int iA2 = this.f390258g - this.f390257f;
        while (iA2 < i12) {
            iA2 = a(this.f390256e, this.f390257f, i12, iA2, z12);
            if (iA2 == -1) {
                return false;
            }
            this.f390258g = this.f390257f + iA2;
        }
        this.f390257f += i12;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final void b(int i12) {
        a(false, i12);
    }

    public final int b(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        int iMin;
        int i14 = this.f390257f + i13;
        byte[] bArr2 = this.f390256e;
        if (i14 > bArr2.length) {
            int length = bArr2.length * 2;
            int i15 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i14;
            int i16 = pc1.f388768a;
            this.f390256e = Arrays.copyOf(this.f390256e, Math.max(i15, Math.min(length, i14 + 524288)));
        }
        int i17 = this.f390258g;
        int i18 = this.f390257f;
        int i19 = i17 - i18;
        if (i19 == 0) {
            iMin = a(this.f390256e, i18, i13, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f390258g += iMin;
        } else {
            iMin = Math.min(i13, i19);
        }
        System.arraycopy(this.f390256e, this.f390257f, bArr, i12, iMin);
        this.f390257f += iMin;
        return iMin;
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final void a(int i12) {
        int iMin = Math.min(this.f390258g, i12);
        int i13 = this.f390258g - iMin;
        this.f390258g = i13;
        this.f390257f = 0;
        byte[] bArr = this.f390256e;
        byte[] bArr2 = i13 < bArr.length - 524288 ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13] : bArr;
        System.arraycopy(bArr, iMin, bArr2, 0, i13);
        this.f390256e = bArr2;
        int iA2 = iMin;
        while (iA2 < i12 && iA2 != -1) {
            iA2 = a(this.f390252a, -iA2, Math.min(i12, this.f390252a.length + iA2), iA2, false);
        }
        if (iA2 != -1) {
            this.f390255d += iA2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.su
    public final boolean a(byte[] bArr, int i12, int i13, boolean z12) throws EOFException, InterruptedIOException {
        int iA2;
        int i14 = this.f390258g;
        if (i14 == 0) {
            iA2 = 0;
        } else {
            int iMin = Math.min(i14, i13);
            System.arraycopy(this.f390256e, 0, bArr, i12, iMin);
            int i15 = this.f390258g - iMin;
            this.f390258g = i15;
            this.f390257f = 0;
            byte[] bArr2 = this.f390256e;
            byte[] bArr3 = i15 < bArr2.length - 524288 ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i15] : bArr2;
            System.arraycopy(bArr2, iMin, bArr3, 0, i15);
            this.f390256e = bArr3;
            iA2 = iMin;
        }
        while (iA2 < i13 && iA2 != -1) {
            iA2 = a(bArr, i12, i13, iA2, z12);
        }
        if (iA2 != -1) {
            this.f390255d += iA2;
        }
        return iA2 != -1;
    }

    private int a(byte[] bArr, int i12, int i13, int i14, boolean z12) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int i15 = this.f390253b.read(bArr, i12 + i14, i13 - i14);
            if (i15 != -1) {
                return i14 + i15;
            }
            if (i14 == 0 && z12) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
