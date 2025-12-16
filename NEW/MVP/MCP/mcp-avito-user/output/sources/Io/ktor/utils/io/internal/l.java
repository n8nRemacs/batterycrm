package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RingBufferCapacity.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/l;", "", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401055b = AtomicIntegerFieldUpdater.newUpdater(l.class, "_availableForRead$internal");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401056c = AtomicIntegerFieldUpdater.newUpdater(l.class, "_availableForWrite$internal");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401057d = AtomicIntegerFieldUpdater.newUpdater(l.class, "_pendingToFlush");

    @Y61.k
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* renamed from: a, reason: collision with root package name */
    public final int f401058a;

    @Y61.k
    public volatile /* synthetic */ int _availableForRead$internal = 0;

    @Y61.k
    volatile /* synthetic */ int _pendingToFlush = 0;

    public l(int i12) {
        this.f401058a = i12;
        this._availableForWrite$internal = i12;
    }

    public final void a(int i12) {
        int i13;
        int i14;
        do {
            i13 = this._availableForWrite$internal;
            i14 = i13 + i12;
            if (i14 > this.f401058a) {
                StringBuilder sbY = androidx.appcompat.app.r.y(i13, i12, "Completed read overflow: ", " + ", " = ");
                sbY.append(i14);
                sbY.append(" > ");
                sbY.append(this.f401058a);
                throw new IllegalArgumentException(sbY.toString());
            }
        } while (!f401056c.compareAndSet(this, i13, i14));
    }

    public final void b(int i12) {
        int i13;
        int i14;
        do {
            i13 = this._pendingToFlush;
            i14 = i13 + i12;
            if (i14 > this.f401058a) {
                StringBuilder sbY = androidx.appcompat.app.r.y(i13, i12, "Complete write overflow: ", " + ", " > ");
                sbY.append(this.f401058a);
                throw new IllegalArgumentException(sbY.toString());
            }
        } while (!f401057d.compareAndSet(this, i13, i14));
    }

    public final boolean c() {
        int andSet = f401057d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f401055b.addAndGet(this, andSet) > 0;
    }

    public final boolean d() {
        return this._availableForWrite$internal == 0;
    }

    public final void e() {
        this._availableForRead$internal = this.f401058a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f401058a;
    }

    public final boolean g() {
        int i12;
        do {
            i12 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i12 != this.f401058a) {
                return false;
            }
        } while (!f401056c.compareAndSet(this, i12, 0));
        return true;
    }

    public final int h(int i12) {
        int i13;
        int iMin;
        do {
            i13 = this._availableForRead$internal;
            iMin = Math.min(i12, i13);
            if (iMin == 0) {
                return 0;
            }
        } while (!f401055b.compareAndSet(this, i13, i13 - iMin));
        return Math.min(i12, i13);
    }

    public final boolean i(int i12) {
        int i13;
        do {
            i13 = this._availableForRead$internal;
            if (i13 < i12) {
                return false;
            }
        } while (!f401055b.compareAndSet(this, i13, i13 - i12));
        return true;
    }

    public final int j(int i12) {
        int i13;
        int iMin;
        do {
            i13 = this._availableForWrite$internal;
            iMin = Math.min(i12, i13);
            if (iMin == 0) {
                return 0;
            }
        } while (!f401056c.compareAndSet(this, i13, i13 - iMin));
        return Math.min(i12, i13);
    }

    public final boolean k(int i12) {
        int i13;
        do {
            i13 = this._availableForWrite$internal;
            if (i13 < i12) {
                return false;
            }
        } while (!f401056c.compareAndSet(this, i13, i13 - i12));
        return true;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RingBufferCapacity[read: ");
        sb2.append(this._availableForRead$internal);
        sb2.append(", write: ");
        sb2.append(this._availableForWrite$internal);
        sb2.append(", flush: ");
        sb2.append(this._pendingToFlush);
        sb2.append(", capacity: ");
        return androidx.appcompat.app.r.t(sb2, this.f401058a, ']');
    }
}
