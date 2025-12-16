package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes6.dex */
public interface e {

    /* compiled from: DrmSessionEventListener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f344336a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final y.b f344337b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C10573a> f344338c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: com.google.android.exoplayer2.drm.e$a$a, reason: collision with other inner class name */
        public static final class C10573a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f344339a;

            /* renamed from: b, reason: collision with root package name */
            public Object f344340b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(Handler handler, e eVar) {
            handler.getClass();
            eVar.getClass();
            C10573a c10573a = new C10573a();
            c10573a.f344339a = handler;
            c10573a.f344340b = eVar;
            this.f344338c.add(c10573a);
        }

        public final void b() {
            Iterator<C10573a> it = this.f344338c.iterator();
            while (it.hasNext()) {
                C10573a next = it.next();
                U.K(next.f344339a, new d(2, this, next.f344340b));
            }
        }

        public final void c() {
            Iterator<C10573a> it = this.f344338c.iterator();
            while (it.hasNext()) {
                C10573a next = it.next();
                U.K(next.f344339a, new d(1, this, next.f344340b));
            }
        }

        public final void d(int i12) {
            Iterator<C10573a> it = this.f344338c.iterator();
            while (it.hasNext()) {
                C10573a next = it.next();
                U.K(next.f344339a, new androidx.media3.exoplayer.drm.d(this, next.f344340b, i12, 8));
            }
        }

        public final void e(Exception exc) {
            Iterator<C10573a> it = this.f344338c.iterator();
            while (it.hasNext()) {
                C10573a next = it.next();
                U.K(next.f344339a, new com.avito.konveyor.item_visibility_tracker.c(this, next.f344340b, exc, 2));
            }
        }

        public final void f() {
            Iterator<C10573a> it = this.f344338c.iterator();
            while (it.hasNext()) {
                C10573a next = it.next();
                U.K(next.f344339a, new d(0, this, next.f344340b));
            }
        }

        public final void g(e eVar) {
            CopyOnWriteArrayList<C10573a> copyOnWriteArrayList = this.f344338c;
            Iterator<C10573a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C10573a next = it.next();
                if (next.f344340b == eVar) {
                    copyOnWriteArrayList.remove(next);
                }
            }
        }

        public a(CopyOnWriteArrayList<C10573a> copyOnWriteArrayList, int i12, @P y.b bVar) {
            this.f344338c = copyOnWriteArrayList;
            this.f344336a = i12;
            this.f344337b = bVar;
        }
    }

    default void g(int i12, @P y.b bVar) {
    }

    default void l(int i12, @P y.b bVar) {
    }

    default void p(int i12, @P y.b bVar) {
    }

    default void e(int i12, @P y.b bVar, int i13) {
    }

    default void i(int i12, @P y.b bVar, Exception exc) {
    }
}
