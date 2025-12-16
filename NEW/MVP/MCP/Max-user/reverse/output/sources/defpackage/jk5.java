package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class jk5 extends MediaDataSource {
    public long a;
    public final /* synthetic */ ok5 b;

    public jk5(ok5 ok5Var) {
        this.b = ok5Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            ok5 ok5Var = this.b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ok5Var.a.available()) {
                    return -1;
                }
                ok5Var.d(j);
                this.a = j;
            }
            if (i2 > ok5Var.a.available()) {
                i2 = ok5Var.a.available();
            }
            int i3 = ok5Var.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }
}
