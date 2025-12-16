package com.facebook.datasource;

import com.facebook.common.internal.n;
import com.facebook.common.internal.r;

/* compiled from: FirstAvailableDataSourceSupplier.java */
@J41.d
/* loaded from: classes5.dex */
public class l<T> implements r<f<T>> {
    public final boolean equals(@I41.h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        ((l) obj).getClass();
        return com.facebook.common.internal.n.a(null, null);
    }

    @Override // com.facebook.common.internal.r
    public final Object get() {
        return new b();
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        n.b bVarB = com.facebook.common.internal.n.b(this);
        bVarB.b(null, "list");
        return bVarB.toString();
    }

    /* compiled from: FirstAvailableDataSourceSupplier.java */
    @J41.d
    public class b extends c<T> {

        /* renamed from: h, reason: collision with root package name */
        public int f339892h = 0;

        /* renamed from: i, reason: collision with root package name */
        @I41.h
        public f<T> f339893i = null;

        /* renamed from: j, reason: collision with root package name */
        @I41.h
        public f<T> f339894j = null;

        public b() {
            if (p()) {
                return;
            }
            k(new RuntimeException("No data source supplier or supplier returned null."), null);
        }

        public static void o(b bVar, f fVar) {
            f<T> fVar2;
            synchronized (bVar) {
                if (!bVar.i() && fVar == bVar.f339893i) {
                    bVar.f339893i = null;
                    synchronized (bVar) {
                        fVar2 = bVar.f339894j;
                    }
                    if (fVar != fVar2 && fVar != null) {
                        fVar.close();
                    }
                    if (bVar.p()) {
                        return;
                    }
                    bVar.k(fVar.f(), fVar.getExtras());
                }
            }
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        @I41.h
        public final synchronized T a() {
            f<T> fVar;
            synchronized (this) {
                fVar = this.f339894j;
            }
            return fVar != null ? fVar.a() : null;
            return fVar != null ? fVar.a() : null;
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        public final synchronized boolean b() {
            f<T> fVar;
            synchronized (this) {
                fVar = this.f339894j;
            }
            return fVar != null && fVar.b();
            return fVar != null && fVar.b();
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        public final boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    f<T> fVar = this.f339893i;
                    this.f339893i = null;
                    f<T> fVar2 = this.f339894j;
                    this.f339894j = null;
                    if (fVar2 != null) {
                        fVar2.close();
                    }
                    if (fVar == null) {
                        return true;
                    }
                    fVar.close();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean p() {
            synchronized (this) {
                if (!i()) {
                    throw null;
                }
            }
            synchronized (this) {
                if (i()) {
                    return false;
                }
                this.f339893i = null;
                return false;
            }
        }

        /* compiled from: FirstAvailableDataSourceSupplier.java */
        public class a implements k<T> {
            public a(a aVar) {
            }

            @Override // com.facebook.datasource.k
            public final void c(f<T> fVar) {
                b.o(b.this, fVar);
            }

            @Override // com.facebook.datasource.k
            public final void d(f<T> fVar) {
                b bVar = b.this;
                bVar.l(Math.max(bVar.c(), fVar.c()));
            }

            @Override // com.facebook.datasource.k
            public final void e(f<T> fVar) {
                f<T> fVar2;
                f<T> fVar3;
                if (!fVar.b()) {
                    if (fVar.g()) {
                        b.o(b.this, fVar);
                        return;
                    }
                    return;
                }
                b bVar = b.this;
                bVar.getClass();
                boolean zG2 = fVar.g();
                synchronized (bVar) {
                    if (fVar == bVar.f339893i && fVar != (fVar3 = bVar.f339894j)) {
                        if (fVar3 == null || zG2) {
                            bVar.f339894j = fVar;
                        } else {
                            fVar3 = null;
                        }
                        if (fVar3 != null) {
                            fVar3.close();
                        }
                    }
                }
                synchronized (bVar) {
                    fVar2 = bVar.f339894j;
                }
                if (fVar == fVar2) {
                    bVar.m(null, fVar.g(), fVar.getExtras());
                }
            }

            @Override // com.facebook.datasource.k
            public final void b() {
            }
        }
    }
}
