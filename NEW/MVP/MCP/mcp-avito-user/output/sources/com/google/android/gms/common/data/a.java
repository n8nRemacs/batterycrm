package com.google.android.gms.common.data;

import j.N;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class a<T> implements b<T> {
    @Override // com.google.android.gms.common.data.b
    public int getCount() {
        return 0;
    }

    @Override // java.lang.Iterable
    @N
    public final Iterator<T> iterator() {
        return new c(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.common.api.o
    public final void release() {
    }
}
