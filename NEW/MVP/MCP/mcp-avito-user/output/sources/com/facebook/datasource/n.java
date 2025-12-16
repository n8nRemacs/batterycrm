package com.facebook.datasource;

import com.facebook.common.internal.r;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RetainingDataSourceSupplier.java */
@J41.c
/* loaded from: classes5.dex */
public class n<T> implements r<f<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Set<b> f339907a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public r<f<T>> f339908b = null;

    public final void a(r<f<T>> rVar) {
        this.f339908b = rVar;
        for (b bVar : this.f339907a) {
            if (!bVar.i()) {
                bVar.p(rVar);
            }
        }
    }

    @Override // com.facebook.common.internal.r
    public final Object get() {
        b bVar = new b();
        bVar.p(this.f339908b);
        this.f339907a.add(bVar);
        return bVar;
    }

    /* compiled from: RetainingDataSourceSupplier.java */
    public static class b<T> extends c<T> {

        /* renamed from: h, reason: collision with root package name */
        @J41.a
        @I41.h
        public f<T> f339909h;

        public b() {
            this.f339909h = null;
        }

        public static <T> void o(f<T> fVar) {
            if (fVar != null) {
                fVar.close();
            }
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        @I41.h
        public final synchronized T a() {
            f<T> fVar;
            fVar = this.f339909h;
            return fVar != null ? fVar.a() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized boolean b() {
            /*
                r1 = this;
                monitor-enter(r1)
                com.facebook.datasource.f<T> r0 = r1.f339909h     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                boolean r0 = r0.b()     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Ld:
                r0 = move-exception
                goto L12
            Lf:
                r0 = 0
            L10:
                monitor-exit(r1)
                return r0
            L12:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.n.b.b():boolean");
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        public final boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    f<T> fVar = this.f339909h;
                    this.f339909h = null;
                    o(fVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void p(@I41.h r<f<T>> rVar) {
            if (i()) {
                return;
            }
            f<T> fVar = rVar != null ? rVar.get() : null;
            synchronized (this) {
                try {
                    if (i()) {
                        o(fVar);
                        return;
                    }
                    f<T> fVar2 = this.f339909h;
                    this.f339909h = fVar;
                    if (fVar != null) {
                        fVar.d(new a(null), com.facebook.common.executors.a.f339811b);
                    }
                    o(fVar2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* compiled from: RetainingDataSourceSupplier.java */
        public class a implements k<T> {
            public a(a aVar) {
            }

            @Override // com.facebook.datasource.k
            public final void c(f<T> fVar) {
                b.this.getClass();
            }

            @Override // com.facebook.datasource.k
            public final void d(f<T> fVar) {
                b bVar = b.this;
                if (fVar == bVar.f339909h) {
                    bVar.l(fVar.c());
                }
            }

            @Override // com.facebook.datasource.k
            public final void e(f<T> fVar) {
                boolean zB2 = fVar.b();
                b bVar = b.this;
                if (zB2) {
                    if (fVar == bVar.f339909h) {
                        bVar.m(null, false, fVar.getExtras());
                    }
                } else if (fVar.g()) {
                    bVar.getClass();
                }
            }

            @Override // com.facebook.datasource.k
            public final void b() {
            }
        }
    }
}
