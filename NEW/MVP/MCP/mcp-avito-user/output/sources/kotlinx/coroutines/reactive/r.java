package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.I0;

/* compiled from: ReactiveFlow.kt */
@s0
@I0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004R\u000b\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/reactive/r;", "T", "Lorg/reactivestreams/e;", "Lkotlinx/coroutines/a;", "Lkotlin/G0;", "", "cancellationRequested", "Z", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlin/coroutines/Continuation;", "producer", "Lkotlinx/atomicfu/AtomicLong;", "requested", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r<T> extends AbstractC43075a<G0> implements org.reactivestreams.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412004f = AtomicLongFieldUpdater.newUpdater(r.class, "requested$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412005g = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final org.reactivestreams.d<? super T> f412006e;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    public r(@Y61.k org.reactivestreams.d dVar) {
        super(null, false, true);
        this.f412006e = dVar;
        this.producer$volatile = new o(this.f410748d, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(kotlinx.coroutines.reactive.r r4, kotlin.coroutines.Continuation r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.q
            if (r0 == 0) goto L16
            r0 = r5
            kotlinx.coroutines.reactive.q r0 = (kotlinx.coroutines.reactive.q) r0
            int r1 = r0.f412003t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f412003t = r1
            goto L1b
        L16:
            kotlinx.coroutines.reactive.q r0 = new kotlinx.coroutines.reactive.q
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f412001r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f412003t
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 != r2) goto L3d
            kotlinx.coroutines.reactive.r r4 = r0.f412000q
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Throwable -> L3b
            org.reactivestreams.d<? super T> r5 = r4.f412006e     // Catch: java.lang.Throwable -> L32
            r5.e()     // Catch: java.lang.Throwable -> L32
            goto L38
        L32:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r4.f410748d
            kotlinx.coroutines.P.a(r4, r5)
        L38:
            kotlin.G0 r4 = kotlin.G0.f406611a
            goto L6f
        L3b:
            r5 = move-exception
            goto L4e
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L45:
            kotlin.C42729a0.b(r5)
            r0.f412000q = r4     // Catch: java.lang.Throwable -> L3b
            r0.f412003t = r2     // Catch: java.lang.Throwable -> L3b
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L3b
        L4e:
            boolean r0 = r4.cancellationRequested
            if (r0 == 0) goto L5e
            boolean r0 = r4.isActive()
            if (r0 != 0) goto L5e
            java.util.concurrent.CancellationException r0 = r4.J()
            if (r5 == r0) goto L6d
        L5e:
            org.reactivestreams.d<? super T> r0 = r4.f412006e     // Catch: java.lang.Throwable -> L64
            r0.onError(r5)     // Catch: java.lang.Throwable -> L64
            goto L6d
        L64:
            r0 = move-exception
            kotlin.C42833p.a(r5, r0)
            kotlin.coroutines.CoroutineContext r4 = r4.f410748d
            kotlinx.coroutines.P.a(r4, r5)
        L6d:
            kotlin.G0 r4 = kotlin.G0.f406611a
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.r.F0(kotlinx.coroutines.reactive.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        this.cancellationRequested = true;
        c(null);
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        long j14;
        Continuation continuation;
        if (j12 <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = f412004f;
            j13 = atomicLongFieldUpdater.get(this);
            j14 = j13 + j12;
            if (j14 <= 0) {
                j14 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, j14));
        if (j13 <= 0) {
            do {
                continuation = (Continuation) f412005g.getAndSet(this, null);
            } while (continuation == null);
            int i12 = Z.f406624c;
            continuation.resumeWith(G0.f406611a);
        }
    }
}
