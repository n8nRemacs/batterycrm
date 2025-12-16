package com.google.common.cache;

/* compiled from: AbstractCache.java */
@XY0.b
@h
/* loaded from: classes6.dex */
public abstract class a<K, V> implements c<K, V> {

    /* compiled from: AbstractCache.java */
    /* renamed from: com.google.common.cache.a$a, reason: collision with other inner class name */
    public static final class C10653a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final p f359076a = q.a();

        /* renamed from: b, reason: collision with root package name */
        public final p f359077b = q.a();

        /* renamed from: c, reason: collision with root package name */
        public final p f359078c = q.a();

        /* renamed from: d, reason: collision with root package name */
        public final p f359079d = q.a();

        /* renamed from: e, reason: collision with root package name */
        public final p f359080e = q.a();

        /* renamed from: f, reason: collision with root package name */
        public final p f359081f = q.a();

        @Override // com.google.common.cache.a.b
        public final void a() {
            this.f359081f.a();
        }

        @Override // com.google.common.cache.a.b
        public final void b(long j12) {
            this.f359078c.a();
            this.f359080e.add(j12);
        }

        @Override // com.google.common.cache.a.b
        public final void c() {
            this.f359077b.add(1);
        }

        @Override // com.google.common.cache.a.b
        public final void d() {
            this.f359076a.add(1);
        }

        @Override // com.google.common.cache.a.b
        public final void e(long j12) {
            this.f359079d.a();
            this.f359080e.add(j12);
        }
    }

    /* compiled from: AbstractCache.java */
    public interface b {
        void a();

        void b(long j12);

        void c();

        void d();

        void e(long j12);
    }
}
