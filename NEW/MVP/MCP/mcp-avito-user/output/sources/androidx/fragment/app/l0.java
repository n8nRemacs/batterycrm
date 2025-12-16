package androidx.fragment.app;

import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
final class l0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f46569b = new StringBuilder(128);

    public final void a() {
        StringBuilder sb2 = this.f46569b;
        if (sb2.length() > 0) {
            sb2.toString();
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            char c12 = cArr[i12 + i14];
            if (c12 == '\n') {
                a();
            } else {
                this.f46569b.append(c12);
            }
        }
    }
}
