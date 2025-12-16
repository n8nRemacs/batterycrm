package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.infer.annotation.Nullsafe;
import fX0.InterfaceC40366d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: JobScheduler.java */
@Nullsafe
/* loaded from: classes15.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f340546a;

    /* renamed from: b, reason: collision with root package name */
    public final b f340547b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f340548c = new G(this);

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f340549d = new H(this);

    /* renamed from: e, reason: collision with root package name */
    @J41.a
    @j.k0
    @I41.h
    public YW0.d f340550e = null;

    /* renamed from: f, reason: collision with root package name */
    @J41.a
    @j.k0
    public int f340551f = 0;

    /* renamed from: g, reason: collision with root package name */
    @J41.a
    @j.k0
    public d f340552g = d.f340557b;

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    @j.k0
    public long f340553h = 0;

    /* renamed from: i, reason: collision with root package name */
    @J41.a
    @j.k0
    public long f340554i = 0;

    /* compiled from: JobScheduler.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340555a;

        static {
            int[] iArr = new int[d.values().length];
            f340555a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340555a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340555a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340555a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: JobScheduler.java */
    public interface b {
        void a(YW0.d dVar, int i12);
    }

    /* compiled from: JobScheduler.java */
    @j.k0
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static ScheduledExecutorService f340556a;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobScheduler.java */
    @j.k0
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f340557b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f340558c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f340559d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f340560e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f340561f;

        static {
            d dVar = new d("IDLE", 0);
            f340557b = dVar;
            d dVar2 = new d("QUEUED", 1);
            f340558c = dVar2;
            d dVar3 = new d("RUNNING", 2);
            f340559d = dVar3;
            d dVar4 = new d("RUNNING_AND_PENDING", 3);
            f340560e = dVar4;
            f340561f = new d[]{dVar, dVar2, dVar3, dVar4};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f340561f.clone();
        }
    }

    public I(Executor executor, b bVar) {
        this.f340546a = executor;
        this.f340547b = bVar;
    }

    @InterfaceC40366d
    public static boolean d(@I41.h YW0.d dVar, int i12) {
        return AbstractC36395b.e(i12) || AbstractC36395b.l(i12, 4) || YW0.d.k(dVar);
    }

    public final void a(long j12) {
        Runnable runnable = this.f340549d;
        if (j12 <= 0) {
            ((H) runnable).run();
            return;
        }
        if (c.f340556a == null) {
            c.f340556a = Executors.newSingleThreadScheduledExecutor();
        }
        c.f340556a.schedule(runnable, j12, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        long jMax;
        boolean z12;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f340552g == d.f340560e) {
                    jMax = Math.max(this.f340554i + 100, jUptimeMillis);
                    this.f340553h = jUptimeMillis;
                    this.f340552g = d.f340558c;
                    z12 = true;
                } else {
                    this.f340552g = d.f340557b;
                    jMax = 0;
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            a(jMax - jUptimeMillis);
        }
    }

    public final void c() {
        long jMax;
        boolean z12;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (d(this.f340550e, this.f340551f)) {
                    int iOrdinal = this.f340552g.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 2) {
                            this.f340552g = d.f340560e;
                        }
                        z12 = false;
                        jMax = 0;
                    } else {
                        jMax = Math.max(this.f340554i + 100, jUptimeMillis);
                        this.f340553h = jUptimeMillis;
                        this.f340552g = d.f340558c;
                        z12 = true;
                    }
                    if (z12) {
                        a(jMax - jUptimeMillis);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(@I41.h YW0.d dVar, int i12) {
        YW0.d dVar2;
        if (!d(dVar, i12)) {
            return false;
        }
        synchronized (this) {
            dVar2 = this.f340550e;
            this.f340550e = YW0.d.a(dVar);
            this.f340551f = i12;
        }
        YW0.d.b(dVar2);
        return true;
    }
}
