package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.AbstractC43236f;

/* compiled from: ConcurrentLinkedList.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/f;", "N", "", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43236f<N extends AbstractC43236f<N>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411896b = AtomicReferenceFieldUpdater.newUpdater(AbstractC43236f.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411897c = AtomicReferenceFieldUpdater.newUpdater(AbstractC43236f.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC43236f(@Y61.l X x12) {
        this._prev$volatile = x12;
    }

    public final void b() {
        f411897c.set(this, null);
    }

    @Y61.l
    public final N c() {
        Object obj = f411896b.get(this);
        if (obj == C43235e.f411894a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final void e() {
        AbstractC43236f abstractC43236fC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411897c;
            AbstractC43236f abstractC43236f = (AbstractC43236f) atomicReferenceFieldUpdater.get(this);
            while (abstractC43236f != null && abstractC43236f.d()) {
                abstractC43236f = (AbstractC43236f) atomicReferenceFieldUpdater.get(abstractC43236f);
            }
            AbstractC43236f abstractC43236fC2 = c();
            while (abstractC43236fC2.d() && (abstractC43236fC = abstractC43236fC2.c()) != null) {
                abstractC43236fC2 = abstractC43236fC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC43236fC2);
                AbstractC43236f abstractC43236f2 = ((AbstractC43236f) obj) == null ? null : abstractC43236f;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC43236fC2, obj, abstractC43236f2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC43236fC2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC43236f != null) {
                f411896b.set(abstractC43236f, abstractC43236fC2);
            }
            if (!abstractC43236fC2.d() || abstractC43236fC2.c() == null) {
                if (abstractC43236f == null || !abstractC43236f.d()) {
                    return;
                }
            }
        }
    }
}
