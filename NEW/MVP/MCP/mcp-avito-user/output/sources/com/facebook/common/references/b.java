package com.facebook.common.references;

import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import uW0.C48986a;

/* compiled from: DefaultCloseableReference.java */
@Nullsafe
/* loaded from: classes5.dex */
public class b<T> extends a<T> {
    public b() {
        throw null;
    }

    @Override // com.facebook.common.references.a
    /* renamed from: a */
    public final a<T> clone() {
        o.d(j());
        Throwable th2 = this.f339843e;
        return new b(this.f339841c, this.f339842d, th2 != null ? new Throwable(th2) : null);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f339840b) {
                    return;
                }
                T tB2 = this.f339841c.b();
                C48986a.l("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f339841c)), tB2 == null ? null : tB2.getClass().getName());
                this.f339842d.b(this.f339841c, this.f339843e);
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
