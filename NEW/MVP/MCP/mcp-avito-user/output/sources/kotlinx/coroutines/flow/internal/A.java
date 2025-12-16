package kotlinx.coroutines.flow.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.B;

/* compiled from: SafeCollector.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/A;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A<T> extends ContinuationImpl implements InterfaceC43172j<T>, CoroutineStackFrame {

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final InterfaceC43172j<T> f411434q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final CoroutineContext f411435r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    public final int f411436s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public CoroutineContext f411437t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Continuation<? super G0> f411438u;

    /* compiled from: SafeCollector.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "count", "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<Integer, CoroutineContext.Element, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f411439l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(Integer num, CoroutineContext.Element element) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k CoroutineContext coroutineContext) {
        super(x.f411580b, EmptyCoroutineContext.INSTANCE);
        this.f411434q = interfaceC43172j;
        this.f411435r = coroutineContext;
        this.f411436s = ((Number) coroutineContext.fold(0, a.f411439l)).intValue();
    }

    public final Object a(Continuation<? super G0> continuation, T t12) {
        CoroutineContext f410748d = continuation.getF411960f();
        Q0.e(f410748d);
        CoroutineContext coroutineContext = this.f411437t;
        if (coroutineContext != f410748d) {
            if (coroutineContext instanceof q) {
                throw new IllegalStateException(C43066x.E0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) coroutineContext).f411573b + ", but then emission attempt of value '" + t12 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) f410748d.fold(0, new C(this))).intValue() != this.f411436s) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f411435r + ",\n\t\tbut emission happened in " + f410748d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f411437t = f410748d;
        }
        this.f411438u = continuation;
        ((B.a) B.f411441a).getClass();
        Object objEmit = this.f411434q.emit(t12, this);
        if (!L.f(objEmit, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.f411438u = null;
        }
        return objEmit;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
        try {
            Object objA = a(continuation, t12);
            if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
        } catch (Throwable th2) {
            this.f411437t = new q(continuation.getF411960f(), th2);
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<? super G0> continuation = this.f411438u;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411960f() {
        CoroutineContext coroutineContext = this.f411437t;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Object invokeSuspend(@Y61.k Object obj) {
        Throwable thB = Z.b(obj);
        if (thB != null) {
            this.f411437t = new q(getF411960f(), thB);
        }
        Continuation<? super G0> continuation = this.f411438u;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
