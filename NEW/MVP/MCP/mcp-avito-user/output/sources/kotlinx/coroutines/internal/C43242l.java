package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43229i0;
import kotlinx.coroutines.AbstractC43300s0;
import kotlinx.coroutines.w1;

/* compiled from: DispatchedContinuation.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/internal/l;", "T", "Lkotlinx/coroutines/i0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/atomicfu/AtomicRef;", "", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.coroutines.internal.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43242l<T> extends AbstractC43229i0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411913i = AtomicReferenceFieldUpdater.newUpdater(C43242l.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final kotlinx.coroutines.M f411914e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Continuation<T> f411915f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.l
    public Object f411916g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Object f411917h;

    /* JADX WARN: Multi-variable type inference failed */
    public C43242l(@Y61.k kotlinx.coroutines.M m12, @Y61.k Continuation<? super T> continuation) {
        super(-1);
        this.f411914e = m12;
        this.f411915f = continuation;
        this.f411916g = C43243m.f411918a;
        this.f411917h = continuation.getF411447c().fold(0, g0.f411899b);
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    public final void a(@Y61.l Object obj, @Y61.k CancellationException cancellationException) {
        if (obj instanceof kotlinx.coroutines.F) {
            ((kotlinx.coroutines.F) obj).getClass();
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f411915f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411447c() {
        return this.f411915f.getF411447c();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    @Y61.l
    public final Object h() {
        Object obj = this.f411916g;
        this.f411916g = C43243m.f411918a;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        Continuation<T> continuation = this.f411915f;
        CoroutineContext coroutineContext = continuation.getF411447c();
        Throwable thB = kotlin.Z.b(obj);
        Throwable th2 = null;
        Object e12 = thB == null ? obj : new kotlinx.coroutines.E(thB, false, 2, 0 == true ? 1 : 0);
        kotlinx.coroutines.M m12 = this.f411914e;
        if (m12.p(coroutineContext)) {
            this.f411916g = e12;
            this.f411859d = 0;
            m12.h(coroutineContext, this);
            return;
        }
        w1.f412301a.getClass();
        AbstractC43300s0 abstractC43300s0A = w1.a();
        if (abstractC43300s0A.G()) {
            this.f411916g = e12;
            this.f411859d = 0;
            abstractC43300s0A.B(this);
            return;
        }
        abstractC43300s0A.D(true);
        try {
            CoroutineContext coroutineContext2 = continuation.getF411447c();
            Object objB = g0.b(coroutineContext2, this.f411917h);
            try {
                continuation.resumeWith(obj);
                G0 g02 = G0.f406611a;
                while (abstractC43300s0A.I()) {
                }
            } finally {
                g0.a(coroutineContext2, objB);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Y61.k
    public final String toString() {
        return "DispatchedContinuation[" + this.f411914e + ", " + kotlinx.coroutines.X.b(this.f411915f) + ']';
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    @Y61.k
    public final Continuation<T> b() {
        return this;
    }
}
