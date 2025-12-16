package wW0;

import androidx.media3.exoplayer.C23179x;
import com.facebook.common.internal.o;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.io.InputStream;

/* compiled from: PooledByteBufferInputStream.java */
@J41.c
@Nullsafe
/* loaded from: classes5.dex */
public class h extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    @k0
    public final PooledByteBuffer f441526b;

    /* renamed from: c, reason: collision with root package name */
    @k0
    public int f441527c;

    /* renamed from: d, reason: collision with root package name */
    @k0
    public int f441528d;

    public h(PooledByteBuffer pooledByteBuffer) {
        o.a(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f441526b = pooledByteBuffer;
        this.f441527c = 0;
        this.f441528d = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f441526b.size() - this.f441527c;
    }

    @Override // java.io.InputStream
    public final void mark(int i12) {
        this.f441528d = this.f441527c;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i12 = this.f441527c;
        this.f441527c = i12 + 1;
        return this.f441526b.l(i12) & 255;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f441527c = this.f441528d;
    }

    @Override // java.io.InputStream
    public final long skip(long j12) {
        o.a(Boolean.valueOf(j12 >= 0));
        int iMin = Math.min((int) j12, available());
        this.f441527c += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        if (i12 >= 0 && i13 >= 0 && i12 + i13 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i13 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i13);
            this.f441526b.e(this.f441527c, i12, iMin, bArr);
            this.f441527c += iMin;
            return iMin;
        }
        StringBuilder sb2 = new StringBuilder("length=");
        C23179x.a(sb2, bArr.length, "; regionStart=", i12, "; regionLength=");
        sb2.append(i13);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
