package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.A;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface D {

    /* compiled from: MediaSourceEventListener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f49483a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final A.b f49484b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C1833a> f49485c;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: androidx.media3.exoplayer.source.D$a$a, reason: collision with other inner class name */
        public static final class C1833a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f49486a;

            /* renamed from: b, reason: collision with root package name */
            public Object f49487b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(C23171w c23171w) {
            Iterator<C1833a> it = this.f49485c.iterator();
            while (it.hasNext()) {
                C1833a next = it.next();
                androidx.media3.common.util.M.I(next.f49486a, new Me.m(this, next.f49487b, c23171w, 8));
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
        public final void b(C23167s c23167s, C23171w c23171w) {
            Iterator<C1833a> it = this.f49485c.iterator();
            while (it.hasNext()) {
                C1833a next = it.next();
                androidx.media3.common.util.M.I(next.f49486a, new B(this, next.f49487b, c23167s, c23171w, 2));
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
        public final void c(C23167s c23167s, C23171w c23171w) {
            Iterator<C1833a> it = this.f49485c.iterator();
            while (it.hasNext()) {
                C1833a next = it.next();
                androidx.media3.common.util.M.I(next.f49486a, new B(this, next.f49487b, c23167s, c23171w, 1));
            }
        }

        public final void d(C23167s c23167s, C23171w c23171w, IOException iOException, boolean z12) {
            Iterator<C1833a> it = this.f49485c.iterator();
            while (it.hasNext()) {
                C1833a next = it.next();
                androidx.media3.common.util.M.I(next.f49486a, new C(this, next.f49487b, c23167s, c23171w, iOException, z12, 0));
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
        public final void e(C23167s c23167s, C23171w c23171w) {
            Iterator<C1833a> it = this.f49485c.iterator();
            while (it.hasNext()) {
                C1833a next = it.next();
                androidx.media3.common.util.M.I(next.f49486a, new B(this, next.f49487b, c23167s, c23171w, 0));
            }
        }

        public a(CopyOnWriteArrayList<C1833a> copyOnWriteArrayList, int i12, @j.P A.b bVar) {
            this.f49485c = copyOnWriteArrayList;
            this.f49483a = i12;
            this.f49484b = bVar;
        }
    }

    default void u(int i12, @j.P A.b bVar, C23171w c23171w) {
    }

    default void h(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
    }

    default void n(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
    }

    default void x(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
    }

    default void r(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w, IOException iOException, boolean z12) {
    }
}
