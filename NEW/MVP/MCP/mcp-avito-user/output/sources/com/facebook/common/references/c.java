package com.facebook.common.references;

import com.facebook.infer.annotation.Nullsafe;
import uW0.C48986a;

/* compiled from: FinalizerCloseableReference.java */
@Nullsafe
/* loaded from: classes5.dex */
public class c<T> extends a<T> {
    public c() {
        throw null;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f339840b) {
                    return;
                }
                T tB2 = this.f339841c.b();
                C48986a.l("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f339841c)), tB2 == null ? null : tB2.getClass().getName());
                this.f339841c.a();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.common.references.a
    /* renamed from: a */
    public final a<T> clone() {
        return this;
    }

    @Override // com.facebook.common.references.a
    public final Object clone() {
        return this;
    }

    @Override // com.facebook.common.references.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
