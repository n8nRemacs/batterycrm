package androidx.media3.extractor.mkv;

import androidx.media3.extractor.C23191j;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: VarintReader.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f50871d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50872a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f50873b;

    /* renamed from: c, reason: collision with root package name */
    public int f50874c;

    public static long a(int i12, byte[] bArr, boolean z12) {
        long j12 = bArr[0] & 255;
        if (z12) {
            j12 &= ~f50871d[i12 - 1];
        }
        for (int i13 = 1; i13 < i12; i13++) {
            j12 = (j12 << 8) | (bArr[i13] & 255);
        }
        return j12;
    }

    public static int b(int i12) {
        for (int i13 = 0; i13 < 8; i13++) {
            if ((f50871d[i13] & i12) != 0) {
                return i13 + 1;
            }
        }
        return -1;
    }

    public final long c(C23191j c23191j, boolean z12, boolean z13, int i12) throws EOFException, InterruptedIOException {
        int i13 = this.f50873b;
        byte[] bArr = this.f50872a;
        if (i13 == 0) {
            if (!c23191j.d(bArr, 0, 1, z12)) {
                return -1L;
            }
            int iB2 = b(bArr[0] & 255);
            this.f50874c = iB2;
            if (iB2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f50873b = 1;
        }
        int i14 = this.f50874c;
        if (i14 > i12) {
            this.f50873b = 0;
            return -2L;
        }
        if (i14 != 1) {
            c23191j.d(bArr, 1, i14 - 1, false);
        }
        this.f50873b = 0;
        return a(this.f50874c, bArr, z13);
    }
}
