package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.U;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import shark.AndroidResourceIdNames;

/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes6.dex */
public final class f implements k {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36580j f344493b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344494c;

    /* renamed from: d, reason: collision with root package name */
    public long f344495d;

    /* renamed from: f, reason: collision with root package name */
    public int f344497f;

    /* renamed from: g, reason: collision with root package name */
    public int f344498g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f344496e = new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344492a = new byte[4096];

    static {
        H.a("goog.exo.extractor");
    }

    public f(InterfaceC36580j interfaceC36580j, long j12, long j13) {
        this.f344493b = interfaceC36580j;
        this.f344495d = j12;
        this.f344494c = j13;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final boolean a(byte[] bArr, int i12, int i13, boolean z12) {
        if (!l(i13, z12)) {
            return false;
        }
        System.arraycopy(this.f344496e, this.f344497f - i13, bArr, i12, i13);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void b(int i12, int i13, byte[] bArr) {
        a(bArr, i12, i13, false);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final boolean d(byte[] bArr, int i12, int i13, boolean z12) throws EOFException, InterruptedIOException {
        int iMin;
        int i14 = this.f344498g;
        if (i14 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i14, i13);
            System.arraycopy(this.f344496e, 0, bArr, i12, iMin);
            p(iMin);
        }
        int iN2 = iMin;
        while (iN2 < i13 && iN2 != -1) {
            iN2 = n(bArr, i12, i13, iN2, z12);
        }
        if (iN2 != -1) {
            this.f344495d += iN2;
        }
        return iN2 != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void f() {
        this.f344497f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final long g() {
        return this.f344495d + this.f344497f;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final long getLength() {
        return this.f344494c;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final long getPosition() {
        return this.f344495d;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void h(int i12) throws EOFException, InterruptedIOException {
        l(i12, false);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void i(int i12) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f344498g, i12);
        p(iMin);
        int iN2 = iMin;
        while (iN2 < i12 && iN2 != -1) {
            byte[] bArr = this.f344492a;
            iN2 = n(bArr, -iN2, Math.min(i12, bArr.length + iN2), iN2, false);
        }
        if (iN2 != -1) {
            this.f344495d += iN2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final int j(int i12, int i13, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        m(i13);
        int i14 = this.f344498g;
        int i15 = this.f344497f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            iMin = n(this.f344496e, i15, i13, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f344498g += iMin;
        } else {
            iMin = Math.min(i13, i16);
        }
        System.arraycopy(this.f344496e, this.f344497f, bArr, i12, iMin);
        this.f344497f += iMin;
        return iMin;
    }

    public final boolean l(int i12, boolean z12) throws EOFException, InterruptedIOException {
        m(i12);
        int iN2 = this.f344498g - this.f344497f;
        while (iN2 < i12) {
            iN2 = n(this.f344496e, this.f344497f, i12, iN2, z12);
            if (iN2 == -1) {
                return false;
            }
            this.f344498g = this.f344497f + iN2;
        }
        this.f344497f += i12;
        return true;
    }

    public final void m(int i12) {
        int i13 = this.f344497f + i12;
        byte[] bArr = this.f344496e;
        if (i13 > bArr.length) {
            this.f344496e = Arrays.copyOf(this.f344496e, U.k(bArr.length * 2, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13, i13 + 524288));
        }
    }

    public final int n(byte[] bArr, int i12, int i13, int i14, boolean z12) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i15 = this.f344493b.read(bArr, i12 + i14, i13 - i14);
        if (i15 != -1) {
            return i14 + i15;
        }
        if (i14 == 0 && z12) {
            return -1;
        }
        throw new EOFException();
    }

    public final int o(int i12) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f344498g, i12);
        p(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f344492a;
            iMin = n(bArr, 0, Math.min(i12, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f344495d += iMin;
        }
        return iMin;
    }

    public final void p(int i12) {
        int i13 = this.f344498g - i12;
        this.f344498g = i13;
        this.f344497f = 0;
        byte[] bArr = this.f344496e;
        byte[] bArr2 = i13 < bArr.length - 524288 ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13] : bArr;
        System.arraycopy(bArr, i12, bArr2, 0, i13);
        this.f344496e = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        int i14 = this.f344498g;
        int iN2 = 0;
        if (i14 != 0) {
            int iMin = Math.min(i14, i13);
            System.arraycopy(this.f344496e, 0, bArr, i12, iMin);
            p(iMin);
            iN2 = iMin;
        }
        if (iN2 == 0) {
            iN2 = n(bArr, i12, i13, 0, true);
        }
        if (iN2 != -1) {
            this.f344495d += iN2;
        }
        return iN2;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void readFully(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        d(bArr, i12, i13, false);
    }
}
