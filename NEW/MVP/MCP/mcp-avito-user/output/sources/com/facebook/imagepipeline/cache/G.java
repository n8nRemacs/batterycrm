package com.facebook.imagepipeline.cache;

import android.os.SystemClock;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.H;
import com.facebook.imagepipeline.cache.s;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: LruCountingMemoryCache.java */
@J41.d
@Nullsafe
/* loaded from: classes12.dex */
public class G<K, V> implements s<K, V>, H<K, V>, com.facebook.cache.common.f {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public final s.b<K> f340201a;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    @k0
    public final r<K, s.a<K, V>> f340202b;

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    @k0
    public final r<K, s.a<K, V>> f340203c;

    /* renamed from: d, reason: collision with root package name */
    public final N<V> f340204d;

    /* renamed from: e, reason: collision with root package name */
    public final H.a f340205e;

    /* renamed from: f, reason: collision with root package name */
    public final com.facebook.common.internal.r<I> f340206f;

    /* renamed from: g, reason: collision with root package name */
    @J41.a
    public I f340207g;

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    public long f340208h;

    public G(N n12, H.a aVar, com.facebook.common.internal.r rVar, @I41.h s.b bVar) {
        new WeakHashMap();
        this.f340204d = n12;
        this.f340202b = new r<>(new E(this, n12));
        this.f340203c = new r<>(new E(this, n12));
        this.f340205e = aVar;
        this.f340206f = rVar;
        Object obj = rVar.get();
        com.facebook.common.internal.o.c(obj, "mMemoryCacheParamsSupplier returned null");
        this.f340207g = (I) obj;
        this.f340208h = SystemClock.uptimeMillis();
        this.f340201a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    @Override // com.facebook.imagepipeline.cache.H
    @I41.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.common.references.a<V> b(K r9, com.facebook.common.references.a<V> r10) {
        /*
            r8 = this;
            com.facebook.imagepipeline.cache.s$b<K> r0 = r8.f340201a
            r9.getClass()
            r10.getClass()
            r8.g()
            monitor-enter(r8)
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r1 = r8.f340202b     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r1.d(r9)     // Catch: java.lang.Throwable -> L2f
            com.facebook.imagepipeline.cache.s$a r1 = (com.facebook.imagepipeline.cache.s.a) r1     // Catch: java.lang.Throwable -> L2f
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r2 = r8.f340203c     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.d(r9)     // Catch: java.lang.Throwable -> L2f
            com.facebook.imagepipeline.cache.s$a r2 = (com.facebook.imagepipeline.cache.s.a) r2     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r2.f340252d     // Catch: java.lang.Throwable -> L31
            r5 = r5 ^ r3
            com.facebook.common.internal.o.d(r5)     // Catch: java.lang.Throwable -> L31
            r2.f340252d = r3     // Catch: java.lang.Throwable -> L31
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2f
            com.facebook.common.references.a r2 = r8.i(r2)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L2f:
            r9 = move-exception
            goto L93
        L31:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L2f
        L34:
            r2 = r4
        L35:
            java.lang.Object r5 = r10.i()     // Catch: java.lang.Throwable -> L2f
            com.facebook.imagepipeline.cache.N<V> r6 = r8.f340204d     // Catch: java.lang.Throwable -> L2f
            int r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L2f
            com.facebook.imagepipeline.cache.I r6 = r8.f340207g     // Catch: java.lang.Throwable -> L68
            int r6 = r6.f340212d     // Catch: java.lang.Throwable -> L68
            if (r5 > r6) goto L6d
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L68
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r6 = r8.f340203c     // Catch: java.lang.Throwable -> L6a
            int r6 = r6.a()     // Catch: java.lang.Throwable -> L6a
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r7 = r8.f340202b     // Catch: java.lang.Throwable -> L6a
            int r7 = r7.a()     // Catch: java.lang.Throwable -> L6a
            int r6 = r6 - r7
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L68
            com.facebook.imagepipeline.cache.I r7 = r8.f340207g     // Catch: java.lang.Throwable -> L68
            int r7 = r7.f340210b     // Catch: java.lang.Throwable -> L68
            int r7 = r7 - r3
            if (r6 > r7) goto L6d
            int r6 = r8.d()     // Catch: java.lang.Throwable -> L68
            com.facebook.imagepipeline.cache.I r7 = r8.f340207g     // Catch: java.lang.Throwable -> L68
            int r7 = r7.f340209a     // Catch: java.lang.Throwable -> L68
            int r7 = r7 - r5
            if (r6 > r7) goto L6d
            goto L6e
        L68:
            r9 = move-exception
            goto L91
        L6a:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6a
            throw r9     // Catch: java.lang.Throwable -> L68
        L6d:
            r3 = 0
        L6e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L80
            com.facebook.imagepipeline.cache.s$a r3 = new com.facebook.imagepipeline.cache.s$a     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            r3.<init>(r9, r10, r0, r4)     // Catch: java.lang.Throwable -> L2f
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r10 = r8.f340203c     // Catch: java.lang.Throwable -> L2f
            r10.c(r9, r3)     // Catch: java.lang.Throwable -> L2f
            com.facebook.common.references.a r4 = r8.h(r3)     // Catch: java.lang.Throwable -> L2f
        L80:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2f
            com.facebook.common.references.a.c(r2)
            if (r1 == 0) goto L8d
            com.facebook.imagepipeline.cache.s$b<K> r9 = r1.f340253e
            if (r9 == 0) goto L8d
            r9.a()
        L8d:
            r8.f()
            return r4
        L91:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L68
            throw r9     // Catch: java.lang.Throwable -> L2f
        L93:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2f
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.G.b(java.lang.Object, com.facebook.common.references.a):com.facebook.common.references.a");
    }

    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
        ArrayList<s.a<K, V>> arrayListJ;
        s.b<K> bVar;
        double dA2 = this.f340205e.a(memoryTrimType);
        synchronized (this) {
            arrayListJ = j(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - dA2) * this.f340203c.b())) - d()));
            e(arrayListJ);
        }
        if (arrayListJ != null) {
            Iterator<s.a<K, V>> it = arrayListJ.iterator();
            while (it.hasNext()) {
                com.facebook.common.references.a.c(i(it.next()));
            }
        }
        if (arrayListJ != null) {
            Iterator<s.a<K, V>> it2 = arrayListJ.iterator();
            while (it2.hasNext()) {
                s.a<K, V> next = it2.next();
                if (next != null && (bVar = next.f340253e) != null) {
                    bVar.a();
                }
            }
        }
        g();
        f();
    }

    public final synchronized int d() {
        return this.f340203c.b() - this.f340202b.b();
    }

    public final synchronized void e(@I41.h ArrayList<s.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<s.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                s.a<K, V> next = it.next();
                synchronized (this) {
                    next.getClass();
                    com.facebook.common.internal.o.d(!next.f340252d);
                    next.f340252d = true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.facebook.imagepipeline.cache.I r0 = r4.f340207g     // Catch: java.lang.Throwable -> L6d
            r0.getClass()     // Catch: java.lang.Throwable -> L6d
            int r0 = r0.f340210b     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6d
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r1 = r4.f340203c     // Catch: java.lang.Throwable -> L6f
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L6f
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r2 = r4.f340202b     // Catch: java.lang.Throwable -> L6f
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 - r2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 - r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> L6d
            com.facebook.imagepipeline.cache.I r1 = r4.f340207g     // Catch: java.lang.Throwable -> L6d
            int r2 = r1.f340211c     // Catch: java.lang.Throwable -> L6d
            int r1 = r1.f340209a     // Catch: java.lang.Throwable -> L6d
            int r3 = r4.d()     // Catch: java.lang.Throwable -> L6d
            int r1 = r1 - r3
            int r1 = java.lang.Math.min(r2, r1)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayList r0 = r4.j(r0, r1)     // Catch: java.lang.Throwable -> L6d
            r4.e(r0)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L50
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.facebook.imagepipeline.cache.s$a r2 = (com.facebook.imagepipeline.cache.s.a) r2
            com.facebook.common.references.a r2 = r4.i(r2)
            com.facebook.common.references.a.c(r2)
            goto L3c
        L50:
            if (r0 == 0) goto L6c
            java.util.Iterator r0 = r0.iterator()
        L56:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            com.facebook.imagepipeline.cache.s$a r1 = (com.facebook.imagepipeline.cache.s.a) r1
            if (r1 == 0) goto L56
            com.facebook.imagepipeline.cache.s$b<K> r1 = r1.f340253e
            if (r1 == 0) goto L56
            r1.a()
            goto L56
        L6c:
            return
        L6d:
            r0 = move-exception
            goto L72
        L6f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6d
        L72:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.G.f():void");
    }

    public final synchronized void g() {
        if (this.f340208h + this.f340207g.f340213e > SystemClock.uptimeMillis()) {
            return;
        }
        this.f340208h = SystemClock.uptimeMillis();
        I i12 = this.f340206f.get();
        com.facebook.common.internal.o.c(i12, "mMemoryCacheParamsSupplier returned null");
        this.f340207g = i12;
    }

    @Override // com.facebook.imagepipeline.cache.H
    @I41.h
    public final com.facebook.common.references.a<V> get(K k12) {
        s.a<K, V> aVarD;
        s.a<K, V> aVar;
        com.facebook.common.references.a<V> aVarH;
        s.b<K> bVar;
        k12.getClass();
        synchronized (this) {
            try {
                aVarD = this.f340202b.d(k12);
                r<K, s.a<K, V>> rVar = this.f340203c;
                synchronized (rVar) {
                    aVar = rVar.f340247b.get(k12);
                }
                s.a<K, V> aVar2 = aVar;
                aVarH = aVar2 != null ? h(aVar2) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVarD != null && (bVar = aVarD.f340253e) != null) {
            bVar.a();
        }
        g();
        f();
        return aVarH;
    }

    public final synchronized com.facebook.common.references.a<V> h(s.a<K, V> aVar) {
        synchronized (this) {
            com.facebook.common.internal.o.d(!aVar.f340252d);
            aVar.f340251c++;
        }
        return com.facebook.common.references.a.n(aVar.f340250b.i(), new F(this, aVar), com.facebook.common.references.a.f339839g);
        return com.facebook.common.references.a.n(aVar.f340250b.i(), new F(this, aVar), com.facebook.common.references.a.f339839g);
    }

    @I41.h
    public final synchronized com.facebook.common.references.a<V> i(s.a<K, V> aVar) {
        aVar.getClass();
        return (aVar.f340252d && aVar.f340251c == 0) ? aVar.f340250b : null;
    }

    @I41.h
    public final synchronized ArrayList<s.a<K, V>> j(int i12, int i13) {
        K next;
        int iMax = Math.max(i12, 0);
        int iMax2 = Math.max(i13, 0);
        if (this.f340202b.a() <= iMax && this.f340202b.b() <= iMax2) {
            return null;
        }
        ArrayList<s.a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f340202b.a() <= iMax && this.f340202b.b() <= iMax2) {
                return arrayList;
            }
            r<K, s.a<K, V>> rVar = this.f340202b;
            synchronized (rVar) {
                next = rVar.f340247b.isEmpty() ? null : rVar.f340247b.keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f340202b.a()), Integer.valueOf(this.f340202b.b())));
            }
            this.f340202b.d(next);
            arrayList.add(this.f340203c.d(next));
        }
    }
}
