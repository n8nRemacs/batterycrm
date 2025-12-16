package e11;

import android.os.Handler;
import android.os.Looper;
import j.InterfaceC42148d;
import java.io.Closeable;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class W1 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public static final W1 f394499e = new W1(1000);

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public static final Handler f394500f = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f f394501b = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 25);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final WeakHashMap<Runnable, Boolean> f394502c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final int f394503d;

    public W1(int i12) {
        this.f394503d = i12;
    }

    @InterfaceC42148d
    public final void a(@j.N Runnable runnable) {
        synchronized (this) {
            int size = this.f394502c.size();
            if (this.f394502c.put(runnable, Boolean.TRUE) == null && size == 0) {
                f394500f.postDelayed(this.f394501b, this.f394503d);
            }
        }
    }

    @InterfaceC42148d
    public final void b(@j.N Runnable runnable) {
        synchronized (this) {
            try {
                this.f394502c.remove(runnable);
                if (this.f394502c.size() == 0) {
                    f394500f.removeCallbacks(this.f394501b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f394502c.clear();
        f394500f.removeCallbacks(this.f394501b);
    }
}
