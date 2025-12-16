package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.source.A;
import j.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
@J
/* loaded from: classes.dex */
public interface f {

    /* compiled from: DrmSessionEventListener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f49112a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final A.b f49113b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C1827a> f49114c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: androidx.media3.exoplayer.drm.f$a$a, reason: collision with other inner class name */
        public static final class C1827a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f49115a;

            /* renamed from: b, reason: collision with root package name */
            public Object f49116b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(Handler handler, f fVar) {
            handler.getClass();
            C1827a c1827a = new C1827a();
            c1827a.f49115a = handler;
            c1827a.f49116b = fVar;
            this.f49114c.add(c1827a);
        }

        public final void b() {
            Iterator<C1827a> it = this.f49114c.iterator();
            while (it.hasNext()) {
                C1827a next = it.next();
                M.I(next.f49115a, new e(2, this, next.f49116b));
            }
        }

        public final void c() {
            Iterator<C1827a> it = this.f49114c.iterator();
            while (it.hasNext()) {
                C1827a next = it.next();
                M.I(next.f49115a, new e(1, this, next.f49116b));
            }
        }

        public final void d(int i12) {
            Iterator<C1827a> it = this.f49114c.iterator();
            while (it.hasNext()) {
                C1827a next = it.next();
                M.I(next.f49115a, new d(this, next.f49116b, i12, 0));
            }
        }

        public final void e(Exception exc) {
            Iterator<C1827a> it = this.f49114c.iterator();
            while (it.hasNext()) {
                C1827a next = it.next();
                M.I(next.f49115a, new Me.m(this, next.f49116b, exc, 7));
            }
        }

        public final void f() {
            Iterator<C1827a> it = this.f49114c.iterator();
            while (it.hasNext()) {
                C1827a next = it.next();
                M.I(next.f49115a, new e(0, this, next.f49116b));
            }
        }

        public final void g(f fVar) {
            CopyOnWriteArrayList<C1827a> copyOnWriteArrayList = this.f49114c;
            Iterator<C1827a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1827a next = it.next();
                if (next.f49116b == fVar) {
                    copyOnWriteArrayList.remove(next);
                }
            }
        }

        public a(CopyOnWriteArrayList<C1827a> copyOnWriteArrayList, int i12, @P A.b bVar) {
            this.f49114c = copyOnWriteArrayList;
            this.f49112a = i12;
            this.f49113b = bVar;
        }
    }

    default void f(int i12, @P A.b bVar) {
    }

    default void l(int i12, @P A.b bVar) {
    }

    default void o(int i12, @P A.b bVar) {
    }

    default void A(int i12, @P A.b bVar, int i13) {
    }

    default void B(int i12, @P A.b bVar, Exception exc) {
    }
}
