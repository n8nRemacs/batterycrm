package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ty extends OutputStream {
    public final /* synthetic */ int a;
    public final FileOutputStream b;
    public boolean c;

    public ty(File file, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = false;
                this.b = new FileOutputStream(file);
                break;
            default:
                this.c = false;
                this.b = new FileOutputStream(file);
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                FileOutputStream fileOutputStream = this.b;
                if (!this.c) {
                    this.c = true;
                    flush();
                    try {
                        fileOutputStream.getFD().sync();
                    } catch (IOException e) {
                        pai.e("AtomicFile", "Failed to sync file descriptor:", e);
                    }
                    fileOutputStream.close();
                    break;
                }
                break;
            default:
                FileOutputStream fileOutputStream2 = this.b;
                if (!this.c) {
                    this.c = true;
                    flush();
                    try {
                        fileOutputStream2.getFD().sync();
                    } catch (IOException e2) {
                        a8i.m("AtomicFile", "Failed to sync file descriptor:", e2);
                    }
                    fileOutputStream2.close();
                    break;
                }
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                this.b.flush();
                break;
            default:
                this.b.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.a) {
            case 0:
                this.b.write(i);
                break;
            default:
                this.b.write(i);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 0:
                this.b.write(bArr);
                break;
            default:
                this.b.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                this.b.write(bArr, i, i2);
                break;
            default:
                this.b.write(bArr, i, i2);
                break;
        }
    }
}
