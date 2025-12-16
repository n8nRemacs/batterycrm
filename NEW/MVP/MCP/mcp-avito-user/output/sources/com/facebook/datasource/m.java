package com.facebook.datasource;

import com.facebook.common.internal.n;
import com.facebook.common.internal.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IncreasingQualityDataSourceSupplier.java */
@J41.d
/* loaded from: classes5.dex */
public class m<T> implements r<f<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339897a;

    public m(ArrayList arrayList) {
        com.facebook.common.internal.o.b("List of suppliers is empty!", !arrayList.isEmpty());
        this.f339897a = arrayList;
    }

    public final boolean equals(@I41.h Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return com.facebook.common.internal.n.a(this.f339897a, ((m) obj).f339897a);
        }
        return false;
    }

    @Override // com.facebook.common.internal.r
    public final Object get() {
        return new a();
    }

    public final int hashCode() {
        return this.f339897a.hashCode();
    }

    public final String toString() {
        n.b bVarB = com.facebook.common.internal.n.b(this);
        bVarB.b(this.f339897a, "list");
        return bVarB.toString();
    }

    /* compiled from: IncreasingQualityDataSourceSupplier.java */
    @J41.d
    public class a extends c<T> {

        /* renamed from: h, reason: collision with root package name */
        @J41.a
        @I41.h
        public ArrayList<f<T>> f339898h;

        /* renamed from: i, reason: collision with root package name */
        @J41.a
        public int f339899i;

        /* renamed from: j, reason: collision with root package name */
        public int f339900j;

        /* renamed from: k, reason: collision with root package name */
        public AtomicInteger f339901k;

        /* renamed from: l, reason: collision with root package name */
        @I41.h
        public Throwable f339902l;

        /* renamed from: m, reason: collision with root package name */
        @I41.h
        public Map<String, Object> f339903m;

        public a() {
            m.this.getClass();
            if (this.f339901k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f339901k == null) {
                        this.f339901k = new AtomicInteger(0);
                        int size = m.this.f339897a.size();
                        this.f339900j = size;
                        this.f339899i = size;
                        this.f339898h = new ArrayList<>(size);
                        for (int i12 = 0; i12 < size; i12++) {
                            f<T> fVar = (f) ((r) m.this.f339897a.get(i12)).get();
                            this.f339898h.add(fVar);
                            fVar.d(new C10527a(i12), com.facebook.common.executors.a.f339811b);
                            if (!fVar.b()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public static void o(a aVar, int i12, f fVar) {
            f fVarP;
            Throwable th2;
            synchronized (aVar) {
                fVarP = fVar == aVar.r() ? null : fVar == aVar.q(i12) ? aVar.p(i12) : fVar;
            }
            if (fVarP != null) {
                fVarP.close();
            }
            if (i12 == 0) {
                aVar.f339902l = fVar.f();
                aVar.f339903m = fVar.getExtras();
            }
            if (aVar.f339901k.incrementAndGet() != aVar.f339900j || (th2 = aVar.f339902l) == null) {
                return;
            }
            aVar.k(th2, aVar.f339903m);
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        @I41.h
        public final synchronized T a() {
            f<T> fVarR;
            m.this.getClass();
            fVarR = r();
            return fVarR != null ? fVarR.a() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized boolean b() {
            /*
                r1 = this;
                monitor-enter(r1)
                com.facebook.datasource.m r0 = com.facebook.datasource.m.this     // Catch: java.lang.Throwable -> L14
                r0.getClass()     // Catch: java.lang.Throwable -> L14
                com.facebook.datasource.f r0 = r1.r()     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto L16
                boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto L16
                r0 = 1
                goto L17
            L14:
                r0 = move-exception
                goto L19
            L16:
                r0 = 0
            L17:
                monitor-exit(r1)
                return r0
            L19:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.m.a.b():boolean");
        }

        @Override // com.facebook.datasource.c, com.facebook.datasource.f
        public final boolean close() {
            m.this.getClass();
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<f<T>> arrayList = this.f339898h;
                    this.f339898h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        f<T> fVar = arrayList.get(i12);
                        if (fVar != null) {
                            fVar.close();
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @I41.h
        public final synchronized f<T> p(int i12) {
            f<T> fVar;
            ArrayList<f<T>> arrayList = this.f339898h;
            fVar = null;
            if (arrayList != null && i12 < arrayList.size()) {
                fVar = this.f339898h.set(i12, null);
            }
            return fVar;
        }

        @I41.h
        public final synchronized f<T> q(int i12) {
            ArrayList<f<T>> arrayList;
            arrayList = this.f339898h;
            return (arrayList == null || i12 >= arrayList.size()) ? null : this.f339898h.get(i12);
        }

        @I41.h
        public final synchronized f<T> r() {
            return q(this.f339899i);
        }

        /* compiled from: IncreasingQualityDataSourceSupplier.java */
        /* renamed from: com.facebook.datasource.m$a$a, reason: collision with other inner class name */
        public class C10527a implements k<T> {

            /* renamed from: a, reason: collision with root package name */
            public final int f339905a;

            public C10527a(int i12) {
                this.f339905a = i12;
            }

            @Override // com.facebook.datasource.k
            public final void c(f<T> fVar) {
                a.o(a.this, this.f339905a, fVar);
            }

            @Override // com.facebook.datasource.k
            public final void d(f<T> fVar) {
                if (this.f339905a == 0) {
                    a.this.l(fVar.c());
                }
            }

            @Override // com.facebook.datasource.k
            public final void e(f<T> fVar) {
                Throwable th2;
                int i12;
                if (!fVar.b()) {
                    if (fVar.g()) {
                        a.o(a.this, this.f339905a, fVar);
                        return;
                    }
                    return;
                }
                a aVar = a.this;
                int i13 = this.f339905a;
                boolean zG2 = fVar.g();
                synchronized (aVar) {
                    try {
                        int i14 = aVar.f339899i;
                        if (fVar == aVar.q(i13) && i13 != aVar.f339899i) {
                            if (aVar.r() == null || (zG2 && i13 < aVar.f339899i)) {
                                aVar.f339899i = i13;
                                i12 = i13;
                            } else {
                                i12 = i14;
                            }
                            while (i14 > i12) {
                                f<T> fVarP = aVar.p(i14);
                                if (fVarP != null) {
                                    fVarP.close();
                                }
                                i14--;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (fVar == aVar.r()) {
                    aVar.m(null, i13 == 0 && fVar.g(), fVar.getExtras());
                }
                if (aVar.f339901k.incrementAndGet() != aVar.f339900j || (th2 = aVar.f339902l) == null) {
                    return;
                }
                aVar.k(th2, aVar.f339903m);
            }

            @Override // com.facebook.datasource.k
            public final void b() {
            }
        }
    }
}
