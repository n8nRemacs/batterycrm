package androidx.media3.datasource.cache;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import java.io.BufferedOutputStream;

/* compiled from: ReusableBufferedOutputStream.java */
@J
/* loaded from: classes.dex */
final class o extends BufferedOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th == null) {
            return;
        }
        int i12 = M.f47887a;
        throw th;
    }
}
