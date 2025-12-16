package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.InterfaceC43082c0;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: LimitedDispatcher.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/M;", "Lkotlinx/coroutines/c0;", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43254y extends kotlinx.coroutines.M implements InterfaceC43082c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411934h = AtomicIntegerFieldUpdater.newUpdater(C43254y.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.M f411935c;

    /* renamed from: d, reason: collision with root package name */
    public final int f411936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43082c0 f411937e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final G<Runnable> f411938f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f411939g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* compiled from: LimitedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/y$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.internal.y$a */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public Runnable f411940b;

        public a(@Y61.k Runnable runnable) {
            this.f411940b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i12 = 0;
            while (true) {
                try {
                    this.f411940b.run();
                } catch (Throwable th2) {
                    kotlinx.coroutines.P.a(EmptyCoroutineContext.INSTANCE, th2);
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C43254y.f411934h;
                C43254y c43254y = C43254y.this;
                Runnable runnableY = c43254y.y();
                if (runnableY == null) {
                    return;
                }
                this.f411940b = runnableY;
                i12++;
                if (i12 >= 16) {
                    kotlinx.coroutines.M m12 = c43254y.f411935c;
                    if (m12.p(c43254y)) {
                        m12.h(c43254y, this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43254y(@Y61.k kotlinx.coroutines.M m12, int i12) {
        this.f411935c = m12;
        this.f411936d = i12;
        InterfaceC43082c0 interfaceC43082c0 = m12 instanceof InterfaceC43082c0 ? (InterfaceC43082c0) m12 : null;
        this.f411937e = interfaceC43082c0 == null ? kotlinx.coroutines.Z.f410747a : interfaceC43082c0;
        this.f411938f = new G<>();
        this.f411939g = new Object();
    }

    public final boolean B() {
        synchronized (this.f411939g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f411934h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f411936d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    public final void f(long j12, @Y61.k kotlinx.coroutines.r rVar) {
        this.f411937e.f(j12, rVar);
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    @Y61.k
    public final InterfaceC43268o0 g(long j12, @Y61.k Runnable runnable, @Y61.k CoroutineContext coroutineContext) {
        return this.f411937e.g(j12, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        Runnable runnableY;
        this.f411938f.a(runnable);
        if (f411934h.get(this) >= this.f411936d || !B() || (runnableY = y()) == null) {
            return;
        }
        this.f411935c.h(this, new a(runnableY));
    }

    @Override // kotlinx.coroutines.M
    @I0
    public final void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        Runnable runnableY;
        this.f411938f.a(runnable);
        if (f411934h.get(this) >= this.f411936d || !B() || (runnableY = y()) == null) {
            return;
        }
        this.f411935c.j(this, new a(runnableY));
    }

    public final Runnable y() {
        while (true) {
            Runnable runnableD = this.f411938f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f411939g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f411934h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f411938f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
