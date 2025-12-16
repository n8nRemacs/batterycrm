package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.jd0;
import j.InterfaceC42154j;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public interface kd0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f387110a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final jd0.b f387111b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C10979a> f387112c;

        /* renamed from: d, reason: collision with root package name */
        private final long f387113d;

        /* renamed from: com.yandex.mobile.ads.impl.kd0$a$a, reason: collision with other inner class name */
        public static final class C10979a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f387114a;

            /* renamed from: b, reason: collision with root package name */
            public kd0 f387115b;

            public C10979a(Handler handler, kd0 kd0Var) {
                this.f387114a = handler;
                this.f387115b = kd0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i12, @j.P jd0.b bVar) {
            this.f387112c = copyOnWriteArrayList;
            this.f387110a = i12;
            this.f387111b = bVar;
            this.f387113d = 0L;
        }

        public final void a(Handler handler, kd0 kd0Var) {
            kd0Var.getClass();
            this.f387112c.add(new C10979a(handler, kd0Var));
        }

        public final void b(q90 q90Var, @j.P vw vwVar, long j12, long j13) {
            c(q90Var, new zc0(1, -1, vwVar, 0, null, a(j12), a(j13)));
        }

        public final void c(q90 q90Var, zc0 zc0Var) {
            Iterator<C10979a> it = this.f387112c.iterator();
            while (it.hasNext()) {
                C10979a next = it.next();
                pc1.a(next.f387114a, (Runnable) new M0(this, next.f387115b, q90Var, zc0Var, 2));
            }
        }

        @InterfaceC42154j
        public final a a(int i12, @j.P jd0.b bVar) {
            return new a(this.f387112c, i12, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(kd0 kd0Var, q90 q90Var, zc0 zc0Var) {
            kd0Var.c(this.f387110a, this.f387111b, q90Var, zc0Var);
        }

        public final void a(kd0 kd0Var) {
            Iterator<C10979a> it = this.f387112c.iterator();
            while (it.hasNext()) {
                C10979a next = it.next();
                if (next.f387115b == kd0Var) {
                    this.f387112c.remove(next);
                }
            }
        }

        public final void b(q90 q90Var, zc0 zc0Var) {
            Iterator<C10979a> it = this.f387112c.iterator();
            while (it.hasNext()) {
                C10979a next = it.next();
                pc1.a(next.f387114a, (Runnable) new M0(this, next.f387115b, q90Var, zc0Var, 0));
            }
        }

        public final void a(q90 q90Var, @j.P vw vwVar, long j12, long j13) {
            b(q90Var, new zc0(1, -1, vwVar, 0, null, a(j12), a(j13)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(kd0 kd0Var, q90 q90Var, zc0 zc0Var) {
            kd0Var.b(this.f387110a, this.f387111b, q90Var, zc0Var);
        }

        public final void a(q90 q90Var, long j12, long j13) {
            a(q90Var, new zc0(1, -1, null, 0, null, a(j12), a(j13)));
        }

        public final void a(q90 q90Var, zc0 zc0Var) {
            Iterator<C10979a> it = this.f387112c.iterator();
            while (it.hasNext()) {
                C10979a next = it.next();
                pc1.a(next.f387114a, (Runnable) new M0(this, next.f387115b, q90Var, zc0Var, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(kd0 kd0Var, q90 q90Var, zc0 zc0Var) {
            kd0Var.a(this.f387110a, this.f387111b, q90Var, zc0Var);
        }

        public final void a(q90 q90Var, int i12, @j.P vw vwVar, long j12, long j13, IOException iOException, boolean z12) {
            a(q90Var, new zc0(i12, -1, vwVar, 0, null, a(j12), a(j13)), iOException, z12);
        }

        public final void a(q90 q90Var, zc0 zc0Var, IOException iOException, boolean z12) {
            Iterator<C10979a> it = this.f387112c.iterator();
            while (it.hasNext()) {
                C10979a next = it.next();
                pc1.a(next.f387114a, (Runnable) new androidx.media3.exoplayer.source.C(this, next.f387115b, q90Var, zc0Var, iOException, z12, 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(kd0 kd0Var, q90 q90Var, zc0 zc0Var, IOException iOException, boolean z12) {
            kd0Var.a(this.f387110a, this.f387111b, q90Var, zc0Var, iOException, z12);
        }

        public final void a(int i12, @j.P vw vwVar, long j12) {
            a(new zc0(1, i12, vwVar, 0, null, a(j12), -9223372036854775807L));
        }

        public final void a(zc0 zc0Var) {
            Iterator<C10979a> it = this.f387112c.iterator();
            while (it.hasNext()) {
                C10979a next = it.next();
                pc1.a(next.f387114a, (Runnable) new H0(this, next.f387115b, zc0Var, 5));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(kd0 kd0Var, zc0 zc0Var) {
            kd0Var.a(this.f387110a, this.f387111b, zc0Var);
        }

        private long a(long j12) {
            long jB2 = pc1.b(j12);
            if (jB2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f387113d + jB2;
        }
    }

    default void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
    }

    default void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var, IOException iOException, boolean z12) {
    }

    default void a(int i12, @j.P jd0.b bVar, zc0 zc0Var) {
    }

    default void b(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
    }

    default void c(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
    }
}
