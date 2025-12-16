package com.facebook.datasource;

import android.util.Pair;
import com.facebook.datasource.n;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: AbstractDataSource.java */
@Nullsafe
/* loaded from: classes5.dex */
public abstract class c<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public Map<String, Object> f339876a;

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    @I41.h
    public T f339879d = null;

    /* renamed from: e, reason: collision with root package name */
    @J41.a
    @I41.h
    public Throwable f339880e = null;

    /* renamed from: f, reason: collision with root package name */
    @J41.a
    public float f339881f = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    public boolean f339878c = false;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public b f339877b = b.f339883b;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Pair<k<T>, Executor>> f339882g = new ConcurrentLinkedQueue<>();

    /* compiled from: AbstractDataSource.java */
    public interface a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractDataSource.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f339883b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f339884c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f339885d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f339886e;

        static {
            b bVar = new b("IN_PROGRESS", 0);
            f339883b = bVar;
            b bVar2 = new b("SUCCESS", 1);
            f339884c = bVar2;
            b bVar3 = new b("FAILURE", 2);
            f339885d = bVar3;
            f339886e = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f339886e.clone();
        }
    }

    @Override // com.facebook.datasource.f
    @I41.h
    public synchronized T a() {
        return this.f339879d;
    }

    @Override // com.facebook.datasource.f
    public synchronized boolean b() {
        return this.f339879d != null;
    }

    @Override // com.facebook.datasource.f
    public final synchronized float c() {
        return this.f339881f;
    }

    @Override // com.facebook.datasource.f
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f339878c) {
                    return false;
                }
                this.f339878c = true;
                T t12 = this.f339879d;
                this.f339879d = null;
                if (t12 != null) {
                    h(t12);
                }
                if (!g()) {
                    j();
                }
                synchronized (this) {
                    this.f339882g.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.datasource.f
    public final void d(k<T> kVar, Executor executor) {
        boolean z12;
        executor.getClass();
        synchronized (this) {
            try {
                if (this.f339878c) {
                    return;
                }
                if (this.f339877b == b.f339883b) {
                    this.f339882g.add(Pair.create(kVar, executor));
                }
                boolean z13 = b() || g() || n();
                if (z13) {
                    synchronized (this) {
                        z12 = this.f339877b == b.f339885d;
                    }
                    executor.execute(new com.facebook.datasource.a(this, z12, kVar, n()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.datasource.f
    public boolean e() {
        return this instanceof n.b;
    }

    @Override // com.facebook.datasource.f
    @I41.h
    public final synchronized Throwable f() {
        return this.f339880e;
    }

    @Override // com.facebook.datasource.f
    public final synchronized boolean g() {
        return this.f339877b != b.f339883b;
    }

    @Override // com.facebook.datasource.f
    @I41.h
    public final Map<String, Object> getExtras() {
        return this.f339876a;
    }

    public final synchronized boolean i() {
        return this.f339878c;
    }

    public final void j() {
        boolean z12;
        synchronized (this) {
            z12 = this.f339877b == b.f339885d;
        }
        boolean zN2 = n();
        Iterator<Pair<k<T>, Executor>> it = this.f339882g.iterator();
        while (it.hasNext()) {
            Pair<k<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new com.facebook.datasource.a(this, z12, (k) next.first, zN2));
        }
    }

    public final boolean k(@I41.h Throwable th2, @I41.h Map<String, Object> map) {
        boolean z12;
        synchronized (this) {
            if (this.f339878c || this.f339877b != b.f339883b) {
                z12 = false;
            } else {
                this.f339877b = b.f339885d;
                this.f339880e = th2;
                this.f339876a = map;
                z12 = true;
            }
        }
        if (z12) {
            j();
        }
        return z12;
    }

    public final boolean l(float f12) {
        boolean z12;
        synchronized (this) {
            z12 = false;
            if (!this.f339878c && this.f339877b == b.f339883b && f12 >= this.f339881f) {
                this.f339881f = f12;
                z12 = true;
            }
        }
        if (z12) {
            Iterator<Pair<k<T>, Executor>> it = this.f339882g.iterator();
            while (it.hasNext()) {
                Pair<k<T>, Executor> next = it.next();
                ((Executor) next.second).execute(new com.facebook.datasource.b(this, (k) next.first));
            }
        }
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x001b -> B:33:0x0041). Please report as a decompilation issue!!! */
    public final boolean m(@I41.h T t12, boolean z12, @I41.h Map<String, Object> map) {
        T t13;
        this.f339876a = map;
        T t14 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (this.f339878c || this.f339877b != b.f339883b) {
                            if (t12 != 0) {
                                h(t12);
                            }
                            t12 = 0;
                        } else {
                            if (z12) {
                                this.f339877b = b.f339884c;
                                this.f339881f = 1.0f;
                            }
                            T t15 = this.f339879d;
                            if (t15 != t12) {
                                try {
                                    this.f339879d = t12;
                                    t13 = t15;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t14 = t15;
                                    throw th;
                                }
                            } else {
                                t13 = null;
                            }
                            t12 = (T) (true ? 1 : 0);
                        }
                        if (t12 != 0) {
                            j();
                        }
                        return (boolean) t12;
                    } catch (Throwable th3) {
                        t14 = t12;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } finally {
            if (t14 != null) {
                h(t14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean n() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.i()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.c.n():boolean");
    }

    public void h(@I41.h T t12) {
    }
}
