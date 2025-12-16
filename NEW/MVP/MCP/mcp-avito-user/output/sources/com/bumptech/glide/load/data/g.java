package com.bumptech.glide.load.data;

import j.N;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes5.dex */
public final class g extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f338859d = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final int f338860e = 31;

    /* renamed from: b, reason: collision with root package name */
    public final byte f338861b;

    /* renamed from: c, reason: collision with root package name */
    public int f338862c;

    public g(InputStream inputStream, int i12) {
        super(inputStream);
        if (i12 < -1 || i12 > 8) {
            throw new IllegalArgumentException(AK.c.g(i12, "Cannot add invalid orientation: "));
        }
        this.f338861b = (byte) i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i12;
        int i13 = this.f338862c;
        int i14 = (i13 < 2 || i13 > (i12 = f338860e)) ? super.read() : i13 == i12 ? this.f338861b : f338859d[i13 - 2] & 255;
        if (i14 != -1) {
            this.f338862c++;
        }
        return i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j12) throws IOException {
        long jSkip = super.skip(j12);
        if (jSkip > 0) {
            this.f338862c = (int) (this.f338862c + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@N byte[] bArr, int i12, int i13) throws IOException {
        int i14;
        int i15 = this.f338862c;
        int i16 = f338860e;
        if (i15 > i16) {
            i14 = super.read(bArr, i12, i13);
        } else if (i15 == i16) {
            bArr[i12] = this.f338861b;
            i14 = 1;
        } else if (i15 < 2) {
            i14 = super.read(bArr, i12, 2 - i15);
        } else {
            int iMin = Math.min(i16 - i15, i13);
            System.arraycopy(f338859d, this.f338862c - 2, bArr, i12, iMin);
            i14 = iMin;
        }
        if (i14 > 0) {
            this.f338862c += i14;
        }
        return i14;
    }
}
