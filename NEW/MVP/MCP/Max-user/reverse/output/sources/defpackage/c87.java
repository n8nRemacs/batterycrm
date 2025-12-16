package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c87 extends y77 {
    public boolean d;

    @Override // defpackage.y77, defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        long jB = super.b(qu0Var, j);
        if (jB != -1) {
            return jB;
        }
        this.d = true;
        l();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.d) {
            l();
        }
        this.b = true;
    }
}
