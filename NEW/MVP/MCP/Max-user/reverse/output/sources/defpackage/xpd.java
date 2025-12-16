package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class xpd extends BufferedOutputStream {
    public final /* synthetic */ int a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpd(OutputStream outputStream, int i) {
        super(outputStream);
        this.a = i;
    }

    public final void c(OutputStream outputStream) {
        switch (this.a) {
            case 0:
                fsi.d(this.b);
                ((BufferedOutputStream) this).out = outputStream;
                ((BufferedOutputStream) this).count = 0;
                this.b = false;
                break;
            default:
                hsi.g(this.b);
                ((BufferedOutputStream) this).out = outputStream;
                ((BufferedOutputStream) this).count = 0;
                this.b = false;
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = null;
        switch (this.a) {
            case 0:
                this.b = true;
                try {
                    flush();
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
                int i = xxg.a;
                throw th;
            default:
                this.b = true;
                try {
                    flush();
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    ((BufferedOutputStream) this).out.close();
                } catch (Throwable th5) {
                    if (th == null) {
                        th = th5;
                    }
                }
                if (th == null) {
                    return;
                }
                String str = zxg.a;
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpd(OutputStream outputStream, int i, int i2) {
        super(outputStream, i);
        this.a = i2;
    }
}
