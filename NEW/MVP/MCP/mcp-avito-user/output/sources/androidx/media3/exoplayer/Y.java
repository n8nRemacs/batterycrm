package androidx.media3.exoplayer;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.util.C23110a;
import java.util.concurrent.TimeoutException;

/* compiled from: PlayerMessage.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final b f48612a;

    /* renamed from: b, reason: collision with root package name */
    public final a f48613b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.util.D f48614c;

    /* renamed from: d, reason: collision with root package name */
    public int f48615d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public Object f48616e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f48617f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48618g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48619h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f48620i;

    /* compiled from: PlayerMessage.java */
    public interface a {
        void b(Y y12);
    }

    /* compiled from: PlayerMessage.java */
    public interface b {
        void b(int i12, @j.P Object obj);
    }

    public Y(a aVar, b bVar, androidx.media3.common.P p12, int i12, androidx.media3.common.util.D d12, Looper looper) {
        this.f48613b = aVar;
        this.f48612a = bVar;
        this.f48617f = looper;
        this.f48614c = d12;
    }

    public final synchronized void a(long j12) {
        boolean z12;
        C23110a.g(this.f48618g);
        C23110a.g(this.f48617f.getThread() != Thread.currentThread());
        this.f48614c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j12;
        while (true) {
            z12 = this.f48620i;
            if (z12 || j12 <= 0) {
                break;
            }
            this.f48614c.getClass();
            wait(j12);
            this.f48614c.getClass();
            j12 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z12) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z12) {
        this.f48619h = z12 | this.f48619h;
        this.f48620i = true;
        notifyAll();
    }
}
