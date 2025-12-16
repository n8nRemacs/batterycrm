package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes6.dex */
public interface A {

    /* compiled from: MediaSourceEventListener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f345902a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final y.b f345903b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C10591a> f345904c;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: com.google.android.exoplayer2.source.A$a$a, reason: collision with other inner class name */
        public static final class C10591a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f345905a;

            /* renamed from: b, reason: collision with root package name */
            public Object f345906b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(Handler handler, A a12) {
            handler.getClass();
            a12.getClass();
            C10591a c10591a = new C10591a();
            c10591a.f345905a = handler;
            c10591a.f345906b = a12;
            this.f345904c.add(c10591a);
        }

        public final long b(long j12) {
            long jR2 = com.google.android.exoplayer2.util.U.R(j12);
            if (jR2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return jR2;
        }

        public final void c(C36557u c36557u) {
            Iterator<C10591a> it = this.f345904c.iterator();
            while (it.hasNext()) {
                C10591a next = it.next();
                com.google.android.exoplayer2.util.U.K(next.f345905a, new com.avito.konveyor.item_visibility_tracker.c(this, next.f345906b, c36557u, 3));
            }
        }

        public final void d(C36554q c36554q, int i12, int i13, @j.P com.google.android.exoplayer2.I i14, int i15, @j.P Object obj, long j12, long j13) {
            e(c36554q, new C36557u(i12, i13, i14, i15, obj, b(j12), b(j13)));
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
        public final void e(C36554q c36554q, C36557u c36557u) {
            Iterator<C10591a> it = this.f345904c.iterator();
            while (it.hasNext()) {
                C10591a next = it.next();
                com.google.android.exoplayer2.util.U.K(next.f345905a, new z(this, next.f345906b, c36554q, c36557u, 1));
            }
        }

        public final void f(C36554q c36554q, int i12, int i13, @j.P com.google.android.exoplayer2.I i14, int i15, @j.P Object obj, long j12, long j13) {
            g(c36554q, new C36557u(i12, i13, i14, i15, obj, b(j12), b(j13)));
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
        public final void g(C36554q c36554q, C36557u c36557u) {
            Iterator<C10591a> it = this.f345904c.iterator();
            while (it.hasNext()) {
                C10591a next = it.next();
                com.google.android.exoplayer2.util.U.K(next.f345905a, new z(this, next.f345906b, c36554q, c36557u, 0));
            }
        }

        public final void h(C36554q c36554q, int i12, int i13, @j.P com.google.android.exoplayer2.I i14, int i15, @j.P Object obj, long j12, long j13, IOException iOException, boolean z12) {
            j(c36554q, new C36557u(i12, i13, i14, i15, obj, b(j12), b(j13)), iOException, z12);
        }

        public final void i(C36554q c36554q, int i12, IOException iOException, boolean z12) {
            h(c36554q, i12, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z12);
        }

        public final void j(C36554q c36554q, C36557u c36557u, IOException iOException, boolean z12) {
            Iterator<C10591a> it = this.f345904c.iterator();
            while (it.hasNext()) {
                C10591a next = it.next();
                com.google.android.exoplayer2.util.U.K(next.f345905a, new androidx.media3.exoplayer.source.C(this, next.f345906b, c36554q, c36557u, iOException, z12, 1));
            }
        }

        public final void k(C36554q c36554q, int i12, int i13, @j.P com.google.android.exoplayer2.I i14, int i15, @j.P Object obj, long j12, long j13) {
            l(c36554q, new C36557u(i12, i13, i14, i15, obj, b(j12), b(j13)));
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
        public final void l(C36554q c36554q, C36557u c36557u) {
            Iterator<C10591a> it = this.f345904c.iterator();
            while (it.hasNext()) {
                C10591a next = it.next();
                com.google.android.exoplayer2.util.U.K(next.f345905a, new z(this, next.f345906b, c36554q, c36557u, 2));
            }
        }

        public final void m(C36557u c36557u) {
            y.b bVar = this.f345903b;
            bVar.getClass();
            Iterator<C10591a> it = this.f345904c.iterator();
            while (it.hasNext()) {
                C10591a next = it.next();
                com.google.android.exoplayer2.util.U.K(next.f345905a, new FX0.a(this, next.f345906b, bVar, c36557u, 5));
            }
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i12, @j.P y.b bVar) {
            this.f345904c = copyOnWriteArrayList;
            this.f345902a = i12;
            this.f345903b = bVar;
        }
    }

    default void d(int i12, y.b bVar, C36557u c36557u) {
    }

    default void q(int i12, @j.P y.b bVar, C36557u c36557u) {
    }

    default void k(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
    }

    default void m(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
    }

    default void r(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
    }

    default void f(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u, IOException iOException, boolean z12) {
    }
}
