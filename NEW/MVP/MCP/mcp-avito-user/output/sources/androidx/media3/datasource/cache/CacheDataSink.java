package androidx.media3.datasource.cache;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.i;
import j.P;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@J
/* loaded from: classes.dex */
public final class CacheDataSink implements androidx.media3.datasource.i {

    /* renamed from: a, reason: collision with root package name */
    @P
    public androidx.media3.datasource.o f48199a;

    /* renamed from: b, reason: collision with root package name */
    public long f48200b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public File f48201c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public OutputStream f48202d;

    /* renamed from: e, reason: collision with root package name */
    public long f48203e;

    /* renamed from: f, reason: collision with root package name */
    public long f48204f;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public static final class a implements i.a {
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.f48202d;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            M.h(this.f48202d);
            this.f48202d = null;
            this.f48201c = null;
            throw null;
        } catch (Throwable th2) {
            M.h(this.f48202d);
            this.f48202d = null;
            File file = this.f48201c;
            this.f48201c = null;
            file.delete();
            throw th2;
        }
    }

    public final void b(androidx.media3.datasource.o oVar) {
        long j12 = oVar.f48251g;
        if (j12 != -1) {
            Math.min(j12 - this.f48204f, this.f48200b);
        }
        int i12 = M.f47887a;
        throw null;
    }

    @Override // androidx.media3.datasource.i
    public final void close() throws CacheDataSinkException {
        if (this.f48199a == null) {
            return;
        }
        try {
            a();
        } catch (IOException e12) {
            throw new CacheDataSinkException(e12);
        }
    }

    @Override // androidx.media3.datasource.i
    public final void e(androidx.media3.datasource.o oVar) throws CacheDataSinkException {
        oVar.f48252h.getClass();
        if (oVar.f48251g == -1 && oVar.c(2)) {
            this.f48199a = null;
            return;
        }
        this.f48199a = oVar;
        this.f48200b = oVar.c(4) ? 0L : Long.MAX_VALUE;
        this.f48204f = 0L;
        try {
            b(oVar);
            throw null;
        } catch (IOException e12) {
            throw new CacheDataSinkException(e12);
        }
    }

    @Override // androidx.media3.datasource.i
    public final void write(byte[] bArr, int i12, int i13) throws IOException {
        androidx.media3.datasource.o oVar = this.f48199a;
        if (oVar == null) {
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            try {
                long j12 = this.f48203e;
                long j13 = this.f48200b;
                if (j12 == j13) {
                    a();
                    b(oVar);
                    throw null;
                }
                int iMin = (int) Math.min(i13 - i14, j13 - j12);
                OutputStream outputStream = this.f48202d;
                int i15 = M.f47887a;
                outputStream.write(bArr, i12 + i14, iMin);
                i14 += iMin;
                long j14 = iMin;
                this.f48203e += j14;
                this.f48204f += j14;
            } catch (IOException e12) {
                throw new CacheDataSinkException(e12);
            }
        }
    }
}
