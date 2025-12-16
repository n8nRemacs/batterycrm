package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.k;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: ListDataSource.java */
@Nullsafe
/* loaded from: classes12.dex */
public class g<T> extends com.facebook.datasource.c<List<com.facebook.common.references.a<T>>> {

    /* compiled from: ListDataSource.java */
    public class b implements k<com.facebook.common.references.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        @J41.a
        public boolean f340391a = false;

        public b(a aVar) {
        }

        @Override // com.facebook.datasource.k
        public final void b() {
            g gVar = g.this;
            gVar.getClass();
            gVar.k(new CancellationException(), null);
        }

        @Override // com.facebook.datasource.k
        public final void c(com.facebook.datasource.f<com.facebook.common.references.a<T>> fVar) {
            g gVar = g.this;
            gVar.getClass();
            Throwable thF = fVar.f();
            if (thF == null) {
                thF = new Throwable("Unknown failure cause");
            }
            gVar.k(thF, null);
        }

        @Override // com.facebook.datasource.k
        public final void d(com.facebook.datasource.f<com.facebook.common.references.a<T>> fVar) {
            g.this.getClass();
            throw null;
        }

        @Override // com.facebook.datasource.k
        public final void e(com.facebook.datasource.f<com.facebook.common.references.a<T>> fVar) {
            if (fVar.g()) {
                synchronized (this) {
                    if (this.f340391a) {
                        return;
                    } else {
                        this.f340391a = true;
                    }
                }
                synchronized (g.this) {
                    throw null;
                }
            }
        }
    }

    @Override // com.facebook.datasource.c, com.facebook.datasource.f
    @I41.h
    public final Object a() {
        synchronized (this) {
            b();
        }
        return null;
    }

    @Override // com.facebook.datasource.c, com.facebook.datasource.f
    public final synchronized boolean b() {
        if (!i()) {
            throw null;
        }
        return false;
    }

    @Override // com.facebook.datasource.c, com.facebook.datasource.f
    public final boolean close() {
        if (super.close()) {
            throw null;
        }
        return false;
    }
}
