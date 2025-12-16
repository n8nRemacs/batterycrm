package z41;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Marshaller.java */
/* renamed from: z41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC50373a {

    /* compiled from: Marshaller.java */
    /* renamed from: z41.a$a, reason: collision with other inner class name */
    public static final class C12943a extends OutputStream {

        /* renamed from: b, reason: collision with root package name */
        public final OutputStream f443833b;

        public C12943a(OutputStream outputStream) {
            this.f443833b = outputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f443833b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i12) throws IOException {
            this.f443833b.write(i12);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f443833b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) throws IOException {
            this.f443833b.write(bArr, i12, i13);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
