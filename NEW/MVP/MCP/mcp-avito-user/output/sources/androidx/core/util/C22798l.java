package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.Writer;

/* compiled from: LogWriter.java */
@RestrictTo
@Deprecated
/* renamed from: androidx.core.util.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22798l extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i12, int i13) {
        if (i13 > 0) {
            if (cArr[i12] != '\n') {
                throw null;
            }
            throw null;
        }
    }
}
