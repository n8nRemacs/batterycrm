package androidx.media3.extractor;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import shark.AndroidResourceIdNames;

/* compiled from: DefaultExtractorInput.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23191j implements q {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.datasource.j f50581b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50582c;

    /* renamed from: d, reason: collision with root package name */
    public long f50583d;

    /* renamed from: f, reason: collision with root package name */
    public int f50585f;

    /* renamed from: g, reason: collision with root package name */
    public int f50586g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f50584e = new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50580a = new byte[4096];

    static {
        androidx.media3.common.A.a("media3.extractor");
    }

    public C23191j(androidx.media3.datasource.j jVar, long j12, long j13) {
        this.f50581b = jVar;
        this.f50583d = j12;
        this.f50582c = j13;
    }

    @Override // androidx.media3.extractor.q
    public final boolean a(byte[] bArr, int i12, int i13, boolean z12) {
        if (!k(i13, z12)) {
            return false;
        }
        System.arraycopy(this.f50584e, this.f50585f - i13, bArr, i12, i13);
        return true;
    }

    @Override // androidx.media3.extractor.q
    public final void b(int i12, int i13, byte[] bArr) {
        a(bArr, i12, i13, false);
    }

    @Override // androidx.media3.extractor.q
    public final boolean d(byte[] bArr, int i12, int i13, boolean z12) throws EOFException, InterruptedIOException {
        int iMin;
        int i14 = this.f50586g;
        if (i14 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i14, i13);
            System.arraycopy(this.f50584e, 0, bArr, i12, iMin);
            p(iMin);
        }
        int iN2 = iMin;
        while (iN2 < i13 && iN2 != -1) {
            iN2 = n(bArr, i12, i13, iN2, z12);
        }
        if (iN2 != -1) {
            this.f50583d += iN2;
        }
        return iN2 != -1;
    }

    @Override // androidx.media3.extractor.q
    public final void f() {
        this.f50585f = 0;
    }

    @Override // androidx.media3.extractor.q
    public final long g() {
        return this.f50583d + this.f50585f;
    }

    @Override // androidx.media3.extractor.q
    public final long getLength() {
        return this.f50582c;
    }

    @Override // androidx.media3.extractor.q
    public final long getPosition() {
        return this.f50583d;
    }

    @Override // androidx.media3.extractor.q
    public final void h(int i12) throws EOFException, InterruptedIOException {
        k(i12, false);
    }

    @Override // androidx.media3.extractor.q
    public final void i(int i12) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f50586g, i12);
        p(iMin);
        int iN2 = iMin;
        while (iN2 < i12 && iN2 != -1) {
            byte[] bArr = this.f50580a;
            iN2 = n(bArr, -iN2, Math.min(i12, bArr.length + iN2), iN2, false);
        }
        if (iN2 != -1) {
            this.f50583d += iN2;
        }
    }

    public final boolean k(int i12, boolean z12) throws EOFException, InterruptedIOException {
        l(i12);
        int iN2 = this.f50586g - this.f50585f;
        while (iN2 < i12) {
            iN2 = n(this.f50584e, this.f50585f, i12, iN2, z12);
            if (iN2 == -1) {
                return false;
            }
            this.f50586g = this.f50585f + iN2;
        }
        this.f50585f += i12;
        return true;
    }

    public final void l(int i12) {
        int i13 = this.f50585f + i12;
        byte[] bArr = this.f50584e;
        if (i13 > bArr.length) {
            this.f50584e = Arrays.copyOf(this.f50584e, androidx.media3.common.util.M.k(bArr.length * 2, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13, i13 + 524288));
        }
    }

    public final int m(int i12, int i13, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        l(i13);
        int i14 = this.f50586g;
        int i15 = this.f50585f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            iMin = n(this.f50584e, i15, i13, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f50586g += iMin;
        } else {
            iMin = Math.min(i13, i16);
        }
        System.arraycopy(this.f50584e, this.f50585f, bArr, i12, iMin);
        this.f50585f += iMin;
        return iMin;
    }

    public final int n(byte[] bArr, int i12, int i13, int i14, boolean z12) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i15 = this.f50581b.read(bArr, i12 + i14, i13 - i14);
        if (i15 != -1) {
            return i14 + i15;
        }
        if (i14 == 0 && z12) {
            return -1;
        }
        throw new EOFException();
    }

    public final int o(int i12) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f50586g, i12);
        p(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f50580a;
            iMin = n(bArr, 0, Math.min(i12, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f50583d += iMin;
        }
        return iMin;
    }

    public final void p(int i12) {
        int i13 = this.f50586g - i12;
        this.f50586g = i13;
        this.f50585f = 0;
        byte[] bArr = this.f50584e;
        byte[] bArr2 = i13 < bArr.length - 524288 ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i13] : bArr;
        System.arraycopy(bArr, i12, bArr2, 0, i13);
        this.f50584e = bArr2;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        int i14 = this.f50586g;
        int iN2 = 0;
        if (i14 != 0) {
            int iMin = Math.min(i14, i13);
            System.arraycopy(this.f50584e, 0, bArr, i12, iMin);
            p(iMin);
            iN2 = iMin;
        }
        if (iN2 == 0) {
            iN2 = n(bArr, i12, i13, 0, true);
        }
        if (iN2 != -1) {
            this.f50583d += iN2;
        }
        return iN2;
    }

    @Override // androidx.media3.extractor.q
    public final void readFully(byte[] bArr, int i12, int i13) throws EOFException, InterruptedIOException {
        d(bArr, i12, i13, false);
    }
}
