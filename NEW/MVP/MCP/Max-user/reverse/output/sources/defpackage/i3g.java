package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class i3g implements se4 {
    public final se4 a;
    public final hy0 b;
    public boolean c;
    public long d;

    public i3g(se4 se4Var, hy0 hy0Var) {
        this.a = se4Var;
        hy0Var.getClass();
        this.b = hy0Var;
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) throws CacheDataSink$CacheDataSinkException {
        long jH = this.a.H(ze4Var);
        this.d = jH;
        if (jH == 0) {
            return 0L;
        }
        if (ze4Var.g == -1 && jH != -1) {
            ze4Var = ze4Var.d(0L, jH);
        }
        int i = ze4Var.i;
        this.c = true;
        hy0 hy0Var = this.b;
        hy0Var.getClass();
        ze4Var.h.getClass();
        if (ze4Var.g == -1 && (i & 2) == 2) {
            hy0Var.j = null;
        } else {
            hy0Var.j = ze4Var;
            hy0Var.d = (i & 4) == 4 ? hy0Var.b : BuildConfig.MAX_TIME_TO_UPLOAD;
            hy0Var.h = 0L;
            try {
                hy0Var.c(ze4Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        wggVar.getClass();
        this.a.I(wggVar);
    }

    @Override // defpackage.se4
    public final void close() throws CacheDataSink$CacheDataSinkException {
        hy0 hy0Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (((ze4) hy0Var.j) == null) {
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
                if (((ze4) hy0Var.j) != null) {
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

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            hy0 hy0Var = this.b;
            ze4 ze4Var = (ze4) hy0Var.j;
            if (ze4Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (hy0Var.g == hy0Var.d) {
                            hy0Var.a();
                            hy0Var.c(ze4Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, hy0Var.d - hy0Var.g);
                        OutputStream outputStream = hy0Var.f;
                        String str = zxg.a;
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

    @Override // defpackage.se4
    public final Map x() {
        return this.a.x();
    }
}
