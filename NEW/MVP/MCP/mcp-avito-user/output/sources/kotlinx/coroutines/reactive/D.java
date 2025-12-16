package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Channel.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/reactive/D;", "T", "Lkotlinx/coroutines/channels/m;", "Lorg/reactivestreams/d;", "Lkotlinx/atomicfu/AtomicInt;", "_requested", "Lkotlinx/atomicfu/AtomicRef;", "Lorg/reactivestreams/e;", "_subscription", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class D<T> extends C43108m<T> implements org.reactivestreams.d<T> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411969o = AtomicReferenceFieldUpdater.newUpdater(D.class, Object.class, "_subscription$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411970p = AtomicIntegerFieldUpdater.newUpdater(D.class, "_requested$volatile");
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final int f411971n;

    public D() {
        super(Integer.MAX_VALUE, null, 2, null);
        this.f411971n = 1;
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final void J() {
        org.reactivestreams.e eVar = (org.reactivestreams.e) f411969o.getAndSet(this, null);
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // org.reactivestreams.d
    public final void K(@Y61.k org.reactivestreams.e eVar) {
        f411969o.set(this, eVar);
        while (!l()) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f411970p;
            int i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = this.f411971n;
            if (i12 >= i13) {
                return;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i12, i13)) {
                eVar.request(i13 - i12);
                return;
            }
        }
        eVar.cancel();
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final void N() {
        f411970p.incrementAndGet(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r2.request(r4 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.channels.C43108m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.reactive.D.f411970p
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.reactive.D.f411969o
            java.lang.Object r2 = r2.get(r5)
            org.reactivestreams.e r2 = (org.reactivestreams.e) r2
            int r3 = r1 + (-1)
            if (r2 == 0) goto L25
            if (r3 >= 0) goto L25
            int r4 = r5.f411971n
            if (r1 == r4) goto L1f
            boolean r0 = r0.compareAndSet(r5, r1, r4)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            int r4 = r4 - r3
            long r0 = (long) r4
            r2.request(r0)
            return
        L25:
            boolean r0 = r0.compareAndSet(r5, r1, r3)
            if (r0 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.D.O():void");
    }

    @Override // org.reactivestreams.d
    public final void e() {
        n(null, false);
    }

    @Override // org.reactivestreams.d
    public final void onError(@Y61.k Throwable th2) {
        n(th2, false);
    }

    @Override // kotlinx.coroutines.channels.C43108m, org.reactivestreams.d
    public final void onNext(T t12) {
        f411970p.decrementAndGet(this);
        w(t12);
    }
}
