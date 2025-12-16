package kotlinx.coroutines.rx3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.channels.M0;

/* compiled from: RxObservable.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/rx3/I;", "", "T", "Lkotlinx/coroutines/a;", "Lkotlin/G0;", "Lkotlinx/coroutines/channels/I0;", "Lkotlinx/atomicfu/AtomicInt;", "_signal", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class I<T> extends AbstractC43075a<G0> implements I0<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412048g = AtomicIntegerFieldUpdater.newUpdater(I.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.B<T> f412049e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f412050f;

    /* compiled from: RxObservable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxObservableCoroutine", f = "RxObservable.kt", i = {0, 0}, l = {113}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f412051q;

        /* renamed from: r, reason: collision with root package name */
        public Object f412052r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f412053s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I<T> f412054t;

        /* renamed from: u, reason: collision with root package name */
        public int f412055u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I<T> i12, Continuation<? super a> continuation) {
            super(continuation);
            this.f412054t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f412053s = obj;
            this.f412055u |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f412054t.send(null, this);
        }
    }

    public I(@Y61.k CoroutineContext coroutineContext, @Y61.k io.reactivex.rxjava3.core.B<T> b12) {
        super(coroutineContext, false, true);
        this.f412049e = b12;
        this.f412050f = new kotlinx.coroutines.sync.d();
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void C0(@Y61.k Throwable th2, boolean z12) {
        if (f412048g.compareAndSet(this, 0, -1) && this.f412050f.f()) {
            G0(th2, z12);
        }
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void D0(G0 g02) {
        if (f412048g.compareAndSet(this, 0, -1) && this.f412050f.f()) {
            G0(null, false);
        }
    }

    public final IllegalStateException F0(Object obj) {
        if (!isActive()) {
            G0(d0(), e0());
            return J();
        }
        try {
            this.f412049e.onNext(obj);
            H0();
            return null;
        } catch (Throwable th2) {
            UndeliverableException undeliverableException = new UndeliverableException(th2);
            boolean zU2 = U(undeliverableException);
            H0();
            if (zU2) {
                return undeliverableException;
            }
            C43294q.a(this.f410748d, undeliverableException);
            return J();
        }
    }

    public final void G0(Throwable th2, boolean z12) {
        kotlinx.coroutines.sync.d dVar = this.f412050f;
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f412048g;
            if (atomicIntegerFieldUpdater.get(this) == -2) {
                return;
            }
            atomicIntegerFieldUpdater.set(this, -2);
            Throwable th3 = th2 != null ? th2 : null;
            io.reactivex.rxjava3.core.B<T> b12 = this.f412049e;
            CoroutineContext coroutineContext = this.f410748d;
            if (th3 == null) {
                try {
                    b12.e();
                } catch (Exception e12) {
                    C43294q.a(coroutineContext, e12);
                }
            } else if ((th3 instanceof UndeliverableException) && !z12) {
                C43294q.a(coroutineContext, th2);
            } else if (th3 != J() || !b12.getF318621e()) {
                try {
                    b12.onError(th2);
                } catch (Exception e13) {
                    C42833p.a(th2, e13);
                    C43294q.a(coroutineContext, th2);
                }
            }
        } finally {
            dVar.d(null);
        }
    }

    public final void H0() {
        kotlinx.coroutines.sync.d dVar = this.f412050f;
        dVar.d(null);
        if (isActive() || !dVar.f()) {
            return;
        }
        G0(d0(), e0());
    }

    @Override // kotlinx.coroutines.channels.M0
    public final void g(Y41.l lVar) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean l() {
        return !isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.M0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(@Y61.k T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.rx3.I.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.rx3.I$a r0 = (kotlinx.coroutines.rx3.I.a) r0
            int r1 = r0.f412055u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412055u = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.I$a r0 = new kotlinx.coroutines.rx3.I$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f412053s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f412055u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f412052r
            java.lang.Object r0 = r0.f412051q
            kotlinx.coroutines.rx3.I r0 = (kotlinx.coroutines.rx3.I) r0
            kotlin.C42729a0.b(r6)
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.sync.d r6 = r4.f412050f
            r0.f412051q = r4
            r0.f412052r = r5
            r0.f412055u = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            java.lang.IllegalStateException r5 = r0.F0(r5)
            if (r5 != 0) goto L53
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L53:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.I.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(@Y61.k T t12) {
        if (!this.f412050f.f()) {
            kotlinx.coroutines.channels.B.f410772b.getClass();
            return kotlinx.coroutines.channels.B.f410773c;
        }
        IllegalStateException illegalStateExceptionF0 = F0(t12);
        if (illegalStateExceptionF0 != null) {
            kotlinx.coroutines.channels.B.f410772b.getClass();
            return B.b.a(illegalStateExceptionF0);
        }
        B.b bVar = kotlinx.coroutines.channels.B.f410772b;
        G0 g02 = G0.f406611a;
        bVar.getClass();
        return g02;
    }

    @Override // kotlinx.coroutines.channels.I0
    @Y61.k
    public final M0<T> r() {
        return this;
    }
}
