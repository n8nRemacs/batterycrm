package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43227h1;
import kotlinx.coroutines.internal.X;
import shark.AndroidResourceIdNames;

/* compiled from: ConcurrentLinkedList.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/X;", "S", "Lkotlinx/coroutines/internal/f;", "Lkotlinx/coroutines/h1;", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class X<S extends X<S>> extends AbstractC43236f<S> implements InterfaceC43227h1 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411886e = AtomicIntegerFieldUpdater.newUpdater(X.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public final long f411887d;

    public X(long j12, @Y61.l S s5, int i12) {
        super(s5);
        this.f411887d = j12;
        this.cleanedAndPointers$volatile = i12 << 16;
    }

    @Override // kotlinx.coroutines.internal.AbstractC43236f
    public final boolean d() {
        return f411886e.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f411886e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i12, @Y61.k CoroutineContext coroutineContext);

    public final void i() {
        if (f411886e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f411886e;
            i12 = atomicIntegerFieldUpdater.get(this);
            if (i12 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR + i12));
        return true;
    }
}
