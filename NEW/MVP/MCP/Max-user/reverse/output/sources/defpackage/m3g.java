package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m3g {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m3g.class, Object.class, "reader$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(m3g.class, "readers$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(m3g.class, Object.class, "writer$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(m3g.class, Object.class, "exceptionWhenReading$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m3g.class, Object.class, "_value$volatile");
    private volatile /* synthetic */ Object _value$volatile;
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;

    public m3g(wl8 wl8Var) {
        this._value$volatile = wl8Var;
    }

    public final Object a() {
        a.set(this, new Throwable("reader location"));
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.incrementAndGet(this);
        Throwable th = (Throwable) c.get(this);
        if (th != null) {
            d.set(this, new IllegalStateException("Dispatchers.Main is used concurrently with setting it", th));
        }
        Object obj = e.get(this);
        atomicIntegerFieldUpdater.decrementAndGet(this);
        return obj;
    }
}
