package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class h3g implements qe4 {
    public final qe4 a;
    public final hy0 b;
    public boolean c;
    public long d;

    public h3g(qe4 qe4Var, hy0 hy0Var) {
        qe4Var.getClass();
        this.a = qe4Var;
        hy0Var.getClass();
        this.b = hy0Var;
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws CacheDataSink$CacheDataSinkException {
        long jR = this.a.R(ye4Var);
        this.d = jR;
        if (jR == 0) {
            return 0L;
        }
        if (ye4Var.g == -1 && jR != -1) {
            ye4Var = ye4Var.c(0L, jR);
        }
        int i = ye4Var.i;
        this.c = true;
        hy0 hy0Var = this.b;
        hy0Var.getClass();
        ye4Var.h.getClass();
        if (ye4Var.g == -1 && (i & 2) == 2) {
            hy0Var.j = null;
        } else {
            hy0Var.j = ye4Var;
            hy0Var.d = (i & 4) == 4 ? hy0Var.b : BuildConfig.MAX_TIME_TO_UPLOAD;
            hy0Var.h = 0L;
            try {
                hy0Var.b(ye4Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        this.a.S(vggVar);
    }

    @Override // defpackage.qe4
    public final void close() throws CacheDataSink$CacheDataSinkException {
        hy0 hy0Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (((ye4) hy0Var.j) == null) {
                    return;
                }
                try {
                    hy0Var.a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (((ye4) hy0Var.j) != null) {
                    try {
                        hy0Var.a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            hy0 hy0Var = this.b;
            ye4 ye4Var = (ye4) hy0Var.j;
            if (ye4Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (hy0Var.g == hy0Var.d) {
                            hy0Var.a();
                            hy0Var.b(ye4Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, hy0Var.d - hy0Var.g);
                        OutputStream outputStream = hy0Var.f;
                        int i5 = xxg.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        hy0Var.g += j;
                        hy0Var.h += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - i3;
            }
        }
        return i3;
    }

    @Override // defpackage.qe4
    public final Map x() {
        return this.a.x();
    }
}
