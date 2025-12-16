package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.common.util.J;
import androidx.media3.datasource.B;
import androidx.media3.exoplayer.upstream.d;
import j.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter.java */
@J
/* loaded from: classes.dex */
public interface d {

    /* compiled from: BandwidthMeter.java */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: androidx.media3.exoplayer.upstream.d$a$a, reason: collision with other inner class name */
        public static final class C1840a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C1841a> f50069a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: androidx.media3.exoplayer.upstream.d$a$a$a, reason: collision with other inner class name */
            public static final class C1841a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f50070a;

                /* renamed from: b, reason: collision with root package name */
                public final androidx.media3.exoplayer.analytics.a f50071b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f50072c;

                public C1841a(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
                    this.f50070a = handler;
                    this.f50071b = aVar;
                }
            }

            public final void a(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
                aVar.getClass();
                c(aVar);
                this.f50069a.add(new C1841a(handler, aVar));
            }

            public final void b(final int i12, final long j12, final long j13) {
                Iterator<C1841a> it = this.f50069a.iterator();
                while (it.hasNext()) {
                    final C1841a next = it.next();
                    if (!next.f50072c) {
                        next.f50070a.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C1840a.C1841a c1841a = next;
                                c1841a.f50071b.c(i12, j12, j13);
                            }
                        });
                    }
                }
            }

            public final void c(a aVar) {
                CopyOnWriteArrayList<C1841a> copyOnWriteArrayList = this.f50069a;
                Iterator<C1841a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C1841a next = it.next();
                    if (next.f50071b == aVar) {
                        next.f50072c = true;
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }

        void c(int i12, long j12, long j13);
    }

    void a(a aVar);

    void b(Handler handler, androidx.media3.exoplayer.analytics.a aVar);

    @P
    B c();
}
