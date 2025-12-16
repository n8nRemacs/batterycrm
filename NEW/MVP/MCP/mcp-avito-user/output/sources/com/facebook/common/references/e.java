package com.facebook.common.references;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: NoOpCloseableReference.java */
@Nullsafe
/* loaded from: classes5.dex */
public class e<T> extends a<T> {
    public e() {
        throw null;
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
