package com.google.android.gms.common.api;

import com.google.android.gms.common.api.r;
import com.google.android.gms.common.data.a;
import j.N;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class g<T, R extends com.google.android.gms.common.data.a<T> & r> extends q<R> implements com.google.android.gms.common.data.b<T> {
    @RX0.a
    public g() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.gms.common.data.a) this.f349259b).getClass();
    }

    @Override // com.google.android.gms.common.data.b
    @N
    public final T get(int i12) {
        return ((com.google.android.gms.common.data.a) this.f349259b).get(i12);
    }

    @Override // com.google.android.gms.common.data.b
    public final int getCount() {
        return ((com.google.android.gms.common.data.a) this.f349259b).getCount();
    }

    @Override // java.lang.Iterable
    @N
    public final Iterator<T> iterator() {
        com.google.android.gms.common.data.a aVar = (com.google.android.gms.common.data.a) this.f349259b;
        aVar.getClass();
        return new com.google.android.gms.common.data.c(aVar);
    }

    @Override // com.google.android.gms.common.api.o
    public final void release() {
        ((com.google.android.gms.common.data.a) this.f349259b).getClass();
    }
}
