package androidx.core.app;

import androidx.annotation.RestrictTo;
import j.X;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PendingIntentCompat.java */
/* loaded from: classes.dex */
public final class J {

    /* compiled from: PendingIntentCompat.java */
    @X
    public static class a {
    }

    /* compiled from: PendingIntentCompat.java */
    @X
    public static class b {
    }

    /* compiled from: PendingIntentCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    /* compiled from: PendingIntentCompat.java */
    public static class d implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }
}
