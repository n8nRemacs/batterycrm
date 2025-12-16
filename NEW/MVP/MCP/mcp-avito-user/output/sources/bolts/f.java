package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: CancellationTokenSource.java */
/* loaded from: classes10.dex */
public class f implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f57460b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f57461c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f57462d = b.f57455d.f57457b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f57463e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f57460b) {
            try {
                if (this.f57463e) {
                    return;
                }
                Iterator it = this.f57461c.iterator();
                if (it.hasNext()) {
                    ((d) it.next()).getClass();
                    throw null;
                }
                this.f57461c.clear();
                this.f57463e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        Locale locale = Locale.US;
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        synchronized (this.f57460b) {
            if (this.f57463e) {
                throw new IllegalStateException("Object already closed");
            }
        }
        return name + "@" + hexString + "[cancellationRequested=" + Boolean.toString(false) + "]";
    }
}
