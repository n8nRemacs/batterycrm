package com.google.android.datatransport.runtime;

import AX0.d;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

/* compiled from: TransportRuntimeComponent.java */
@Singleton
@AX0.d
/* loaded from: classes10.dex */
abstract class w implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    @d.a
    public interface a {
    }

    public abstract com.google.android.datatransport.runtime.scheduling.persistence.d a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a().close();
    }
}
