package com.yandex.mobile.ads.exo.drm;

import android.os.Handler;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.pc1;
import j.InterfaceC42154j;
import j.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public interface f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f382911a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final jd0.b f382912b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C10970a> f382913c;

        /* renamed from: com.yandex.mobile.ads.exo.drm.f$a$a, reason: collision with other inner class name */
        public static final class C10970a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f382914a;

            /* renamed from: b, reason: collision with root package name */
            public f f382915b;

            public C10970a(Handler handler, f fVar) {
                this.f382914a = handler;
                this.f382915b = fVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C10970a> copyOnWriteArrayList, int i12, @P jd0.b bVar) {
            this.f382913c = copyOnWriteArrayList;
            this.f382911a = i12;
            this.f382912b = bVar;
        }

        @InterfaceC42154j
        public final a a(int i12, @P jd0.b bVar) {
            return new a(this.f382913c, i12, bVar);
        }

        public final void b() {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                pc1.a(next.f382914a, (Runnable) new r(1, this, next.f382915b));
            }
        }

        public final void c() {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                pc1.a(next.f382914a, (Runnable) new r(2, this, next.f382915b));
            }
        }

        public final void d() {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                pc1.a(next.f382914a, (Runnable) new r(3, this, next.f382915b));
            }
        }

        public final void e(f fVar) {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                if (next.f382915b == fVar) {
                    this.f382913c.remove(next);
                }
            }
        }

        public final void a(Handler handler, f fVar) {
            fVar.getClass();
            this.f382913c.add(new C10970a(handler, fVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(f fVar) {
            fVar.d(this.f382911a, this.f382912b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(f fVar) {
            fVar.a(this.f382911a, this.f382912b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(f fVar) {
            fVar.b(this.f382911a, this.f382912b);
        }

        public final void a(int i12) {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                pc1.a(next.f382914a, (Runnable) new androidx.media3.exoplayer.drm.d(this, next.f382915b, i12, 9));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(f fVar, int i12) {
            fVar.getClass();
            fVar.a(this.f382911a, this.f382912b, i12);
        }

        public final void a() {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                pc1.a(next.f382914a, (Runnable) new r(0, this, next.f382915b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(f fVar) {
            fVar.c(this.f382911a, this.f382912b);
        }

        public final void a(Exception exc) {
            Iterator<C10970a> it = this.f382913c.iterator();
            while (it.hasNext()) {
                C10970a next = it.next();
                pc1.a(next.f382914a, (Runnable) new com.avito.konveyor.item_visibility_tracker.c(this, next.f382915b, exc, 6));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(f fVar, Exception exc) {
            fVar.a(this.f382911a, this.f382912b, exc);
        }
    }

    default void a(int i12, @P jd0.b bVar) {
    }

    default void a(int i12, @P jd0.b bVar, int i13) {
    }

    default void a(int i12, @P jd0.b bVar, Exception exc) {
    }

    default void b(int i12, @P jd0.b bVar) {
    }

    default void c(int i12, @P jd0.b bVar) {
    }

    default void d(int i12, @P jd0.b bVar) {
    }
}
