package com.avito.security;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class m {
    public static final void a(Closeable closeable, Throwable th2) throws IOException {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            i0.a(th2, th3);
        }
    }
}
