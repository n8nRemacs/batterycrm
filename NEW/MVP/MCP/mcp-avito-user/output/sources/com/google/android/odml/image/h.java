package com.google.android.odml.image;

import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* loaded from: classes6.dex */
public class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public int f357992b;

    /* compiled from: com.google.android.odml:image@@1.0.0-beta1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: com.google.android.odml:image@@1.0.0-beta1 */
    public static final class b {
        public /* synthetic */ b(h hVar, s sVar) {
        }
    }

    /* compiled from: com.google.android.odml:image@@1.0.0-beta1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i12 = this.f357992b - 1;
        this.f357992b = i12;
        if (i12 == 0) {
            throw null;
        }
    }
}
