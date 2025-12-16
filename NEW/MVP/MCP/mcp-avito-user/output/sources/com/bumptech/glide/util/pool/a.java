package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.core.util.y;
import com.bumptech.glide.util.pool.e;
import j.N;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e<Object> f339652a = new C10521a();

    /* compiled from: FactoryPools.java */
    public interface b<T> {
        T create();
    }

    /* compiled from: FactoryPools.java */
    public static final class c<T> implements y.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f339653a;

        /* renamed from: b, reason: collision with root package name */
        public final e<T> f339654b;

        /* renamed from: c, reason: collision with root package name */
        public final y.c f339655c;

        public c(@N y.c cVar, @N b bVar, @N e eVar) {
            this.f339655c = cVar;
            this.f339653a = bVar;
            this.f339654b = eVar;
        }

        @Override // androidx.core.util.y.a
        public final boolean a(@N T t12) {
            if (t12 instanceof d) {
                ((e.c) ((d) t12).a()).f339656a = true;
            }
            this.f339654b.a(t12);
            return this.f339655c.a(t12);
        }

        @Override // androidx.core.util.y.a
        public final T b() {
            T tCreate = (T) this.f339655c.b();
            if (tCreate == null) {
                tCreate = this.f339653a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tCreate.getClass().toString();
                }
            }
            if (tCreate instanceof d) {
                ((e.c) tCreate.a()).f339656a = false;
            }
            return (T) tCreate;
        }
    }

    /* compiled from: FactoryPools.java */
    public interface d {
        @N
        com.bumptech.glide.util.pool.e a();
    }

    /* compiled from: FactoryPools.java */
    public interface e<T> {
        void a(@N T t12);
    }

    @N
    public static <T extends d> y.a<T> a(int i12, @N b<T> bVar) {
        return new c(new y.c(i12), bVar, f339652a);
    }

    @N
    public static <T> y.a<List<T>> b() {
        return new c(new y.c(20), new com.bumptech.glide.util.pool.b(), new com.bumptech.glide.util.pool.c());
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    public class C10521a implements e<Object> {
        @Override // com.bumptech.glide.util.pool.a.e
        public final void a(@N Object obj) {
        }
    }
}
