package androidx.media3.common.util;

import java.io.OutputStream;

/* compiled from: AtomicFile.java */
@J
/* renamed from: androidx.media3.common.util.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23111b {

    /* compiled from: AtomicFile.java */
    /* renamed from: androidx.media3.common.util.b$a */
    public static final class a extends OutputStream {

        /* renamed from: b, reason: collision with root package name */
        public boolean f47898b;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f47898b) {
                return;
            }
            this.f47898b = true;
            throw null;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(int i12) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) {
            throw null;
        }
    }
}
