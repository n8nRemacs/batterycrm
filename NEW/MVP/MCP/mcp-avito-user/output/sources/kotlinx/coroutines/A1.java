package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: Interruptible.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/A1;", "Lkotlinx/coroutines/H0;", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A1 implements H0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f410671e = AtomicIntegerFieldUpdater.newUpdater(A1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N0 f410672b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f410673c = Thread.currentThread();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public InterfaceC43268o0 f410674d;

    public A1(@Y61.k N0 n02) {
        this.f410672b = n02;
    }

    public static void c(int i12) {
        throw new IllegalStateException(("Illegal state " + i12).toString());
    }

    @Override // kotlinx.coroutines.H0
    public final void a(@Y61.l Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f410671e;
            i12 = atomicIntegerFieldUpdater.get(this);
            if (i12 != 0) {
                if (i12 == 1 || i12 == 2 || i12 == 3) {
                    return;
                }
                c(i12);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, 2));
        this.f410673c.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f410671e;
            int i12 = atomicIntegerFieldUpdater.get(this);
            if (i12 != 0) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        c(i12);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i12, 1)) {
                InterfaceC43268o0 interfaceC43268o0 = this.f410674d;
                if (interfaceC43268o0 != null) {
                    interfaceC43268o0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
