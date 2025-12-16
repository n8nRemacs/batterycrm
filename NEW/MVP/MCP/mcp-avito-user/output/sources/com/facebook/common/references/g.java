package com.facebook.common.references;

import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: RefCountCloseableReference.java */
@Nullsafe
/* loaded from: classes5.dex */
public class g<T> extends a<T> {
    public g() {
        throw null;
    }

    @Override // com.facebook.common.references.a
    /* renamed from: a */
    public final a<T> clone() {
        o.d(j());
        return new g(this.f339841c, this.f339842d, this.f339843e);
    }
}
