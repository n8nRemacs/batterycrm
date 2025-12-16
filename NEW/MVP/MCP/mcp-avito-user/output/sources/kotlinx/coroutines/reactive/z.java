package kotlinx.coroutines.reactive;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.channels.M0;

/* compiled from: Publish.kt */
@s0
@I0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/reactive/z;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/G0;", "Lkotlinx/coroutines/channels/I0;", "Lorg/reactivestreams/e;", "", "cancelled", "Z", "Lkotlinx/atomicfu/AtomicLong;", "_nRequested", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class z<T> extends AbstractC43075a<G0> implements kotlinx.coroutines.channels.I0<T>, org.reactivestreams.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412031e = AtomicLongFieldUpdater.newUpdater(z.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;

    /* compiled from: Publish.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", i = {0, 0}, l = {128}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public z f412032q;

        /* renamed from: r, reason: collision with root package name */
        public Object f412033r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f412034s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ z<T> f412035t;

        /* renamed from: u, reason: collision with root package name */
        public int f412036u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(z<? super T> zVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f412035t = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f412034s = obj;
            this.f412036u |= BeduinInputModel.MIN_TEXT_VERSION;
            this.f412035t.send(null, this);
            throw null;
        }
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void C0(@Y61.k Throwable th2, boolean z12) {
        G0(th2, z12);
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void D0(G0 g02) {
        G0(null, false);
    }

    public final Throwable F0(T t12) {
        t12.getClass();
        if (!isActive()) {
            throw null;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            this.cancelled = true;
            U(th2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(java.lang.Throwable r8, boolean r9) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.reactive.z.f412031e
            long r2 = r0.get(r7)
            r4 = -2
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto Ld
            return
        Ld:
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L54
            r4 = -1
            r1 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = 0
            if (r6 != 0) goto L53
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.reactive.z.f412031e     // Catch: java.lang.Throwable -> L52
            long r2 = r1.get(r7)     // Catch: java.lang.Throwable -> L52
            r4 = -2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L51
            r1.set(r7, r4)     // Catch: java.lang.Throwable -> L52
            boolean r1 = r7.cancelled     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L3a
            if (r8 == 0) goto L39
            if (r9 == 0) goto L38
            goto L39
        L38:
            throw r0     // Catch: java.lang.Throwable -> L52
        L39:
            throw r0
        L3a:
            if (r8 != 0) goto L44
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r8 = move-exception
            kotlin.coroutines.CoroutineContext r9 = r7.f410748d     // Catch: java.lang.Throwable -> L52
            kotlinx.coroutines.P.a(r9, r8)     // Catch: java.lang.Throwable -> L52
            goto L50
        L44:
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r9 = move-exception
            if (r9 == r8) goto L4b
            kotlin.C42833p.a(r8, r9)     // Catch: java.lang.Throwable -> L52
        L4b:
            kotlin.coroutines.CoroutineContext r9 = r7.f410748d     // Catch: java.lang.Throwable -> L52
            kotlinx.coroutines.P.a(r9, r8)     // Catch: java.lang.Throwable -> L52
        L50:
            throw r0
        L51:
            throw r0
        L52:
            throw r0
        L53:
            throw r0
        L54:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.z.G0(java.lang.Throwable, boolean):void");
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        this.cancelled = true;
        c(null);
    }

    @Override // kotlinx.coroutines.channels.M0
    public final void g(Y41.l lVar) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean l() {
        return !isActive();
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        long j14;
        if (j12 <= 0) {
            U(new IllegalArgumentException(C21030p.a(j12, "non-positive subscription request ")));
            return;
        }
        do {
            atomicLongFieldUpdater = f412031e;
            j13 = atomicLongFieldUpdater.get(this);
            if (j13 < 0) {
                return;
            }
            j14 = j13 + j12;
            if (j14 < 0 || j12 == Long.MAX_VALUE) {
                j14 = Long.MAX_VALUE;
            }
            if (j13 == j14) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, j14));
        if (j13 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.M0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.z.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.reactive.z$a r0 = (kotlinx.coroutines.reactive.z.a) r0
            int r1 = r0.f412036u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412036u = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.z$a r0 = new kotlinx.coroutines.reactive.z$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f412034s
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f412036u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L30
            java.lang.Object r5 = r0.f412033r
            kotlinx.coroutines.reactive.z r0 = r0.f412032q
            kotlin.C42729a0.b(r6)
            r0.F0(r5)
            throw r2
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.C42729a0.b(r6)
            r0.f412032q = r4
            r0.f412033r = r5
            r0.f412036u = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.z.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(T t12) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.I0
    @Y61.k
    public final M0<T> r() {
        return this;
    }
}
