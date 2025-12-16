package xW0;

import com.facebook.infer.annotation.Nullsafe;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TailAppendingInputStream.java */
@Nullsafe
/* renamed from: xW0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49895b extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f442522b;

    /* renamed from: c, reason: collision with root package name */
    public int f442523c;

    /* renamed from: d, reason: collision with root package name */
    public int f442524d;

    public C49895b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f442522b = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i12) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i12);
            this.f442524d = this.f442523c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 != -1) {
            return i12;
        }
        int i13 = this.f442523c;
        byte[] bArr = this.f442522b;
        if (i13 >= bArr.length) {
            return -1;
        }
        this.f442523c = i13 + 1;
        return bArr[i13] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f442523c = this.f442524d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        int i14;
        int i15 = ((FilterInputStream) this).in.read(bArr, i12, i13);
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        if (i13 == 0) {
            return 0;
        }
        while (i16 < i13) {
            int i17 = this.f442523c;
            byte[] bArr2 = this.f442522b;
            if (i17 >= bArr2.length) {
                i14 = -1;
            } else {
                this.f442523c = i17 + 1;
                i14 = bArr2[i17] & 255;
            }
            if (i14 == -1) {
                break;
            }
            bArr[i12 + i16] = (byte) i14;
            i16++;
        }
        if (i16 > 0) {
            return i16;
        }
        return -1;
    }
}
