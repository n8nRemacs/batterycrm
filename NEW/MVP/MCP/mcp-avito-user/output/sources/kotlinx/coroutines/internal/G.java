package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001R!\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u00038\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/G;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/H;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class G<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411867a = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new H(8, false);

    public final boolean a(@Y61.k Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411867a;
            H h12 = (H) atomicReferenceFieldUpdater.get(this);
            int iA2 = h12.a(runnable);
            if (iA2 == 0) {
                return true;
            }
            if (iA2 == 1) {
                H<E> hC2 = h12.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, h12, hC2) && atomicReferenceFieldUpdater.get(this) == h12) {
                }
            } else if (iA2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411867a;
            H h12 = (H) atomicReferenceFieldUpdater.get(this);
            if (h12.b()) {
                return;
            }
            H<E> hC2 = h12.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, h12, hC2) && atomicReferenceFieldUpdater.get(this) == h12) {
            }
        }
    }

    public final int c() {
        H h12 = (H) f411867a.get(this);
        h12.getClass();
        long j12 = H.f411870g.get(h12);
        return (((int) ((j12 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j12))) & 1073741823;
    }

    @Y61.l
    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411867a;
            H h12 = (H) atomicReferenceFieldUpdater.get(this);
            E e12 = (E) h12.d();
            if (e12 != H.f411871h) {
                return e12;
            }
            H<E> hC2 = h12.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, h12, hC2) && atomicReferenceFieldUpdater.get(this) == h12) {
            }
        }
    }
}
