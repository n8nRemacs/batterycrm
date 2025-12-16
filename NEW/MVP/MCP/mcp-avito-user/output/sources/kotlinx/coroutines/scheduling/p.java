package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WorkQueue.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/scheduling/p;", "", "<init>", "()V", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/scheduling/j;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412187b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412188c = AtomicIntegerFieldUpdater.newUpdater(p.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412189d = AtomicIntegerFieldUpdater.newUpdater(p.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412190e = AtomicIntegerFieldUpdater.newUpdater(p.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReferenceArray<j> f412191a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final j a(j jVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f412188c;
        if (atomicIntegerFieldUpdater.get(this) - f412189d.get(this) == 127) {
            return jVar;
        }
        if (((l) jVar.f412175c).f412176b == 1) {
            f412190e.incrementAndGet(this);
        }
        int i12 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<j> atomicReferenceArray = this.f412191a;
            if (atomicReferenceArray.get(i12) == null) {
                atomicReferenceArray.lazySet(i12, jVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final j b() {
        j andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f412189d;
            int i12 = atomicIntegerFieldUpdater.get(this);
            if (i12 - f412188c.get(this) == 0) {
                return null;
            }
            int i13 = i12 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i12, i12 + 1) && (andSet = this.f412191a.getAndSet(i13, null)) != null) {
                if (((l) andSet.f412175c).f412176b == 1) {
                    f412190e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final j c(int i12, boolean z12) {
        int i13 = i12 & 127;
        AtomicReferenceArray<j> atomicReferenceArray = this.f412191a;
        j jVar = atomicReferenceArray.get(i13);
        if (jVar != null) {
            if ((((l) jVar.f412175c).f412176b == 1) == z12) {
                while (!atomicReferenceArray.compareAndSet(i13, jVar, null)) {
                    if (atomicReferenceArray.get(i13) != jVar) {
                    }
                }
                if (z12) {
                    f412190e.decrementAndGet(this);
                }
                return jVar;
            }
        }
        return null;
    }
}
