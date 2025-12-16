package androidx.compose.ui;

import androidx.compose.ui.B;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;

/* compiled from: SessionMutex.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {61, 63}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class C extends SuspendLambda implements Y41.p<T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f38813q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f38814r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f38815s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AtomicReference<B.a<Object>> f38816t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f38817u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(Y41.l<? super T, Object> lVar, AtomicReference<B.a<Object>> atomicReference, Y41.p<Object, ? super Continuation<Object>, ? extends Object> pVar, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f38815s = (N) lVar;
        this.f38816t = atomicReference;
        this.f38817u = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        C c12 = new C(this.f38815s, this.f38816t, this.f38817u, continuation);
        c12.f38814r = obj;
        return c12;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<Object> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r9v9, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        B.a<Object> aVar;
        B.a<Object> aVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f38813q;
        AtomicReference<B.a<Object>> atomicReference = this.f38816t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f38814r;
                aVar = new B.a<>(Q0.f(t12.getF332438d()), this.f38815s.invoke(t12));
                B.a<Object> andSet = atomicReference.getAndSet(aVar);
                if (andSet != null) {
                    N0 n02 = andSet.f38811a;
                    this.f38814r = aVar;
                    this.f38813q = 1;
                    if (Q0.c(n02, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (B.a) this.f38814r;
                    try {
                        C42729a0.b(obj);
                        while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th;
                    }
                }
                aVar = (B.a) this.f38814r;
                C42729a0.b(obj);
            }
            ?? r92 = this.f38817u;
            Object obj2 = aVar.f38812b;
            this.f38814r = aVar;
            this.f38813q = 2;
            obj = r92.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar2 = aVar;
            while (!atomicReference.compareAndSet(aVar2, null)) {
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
            }
            throw th;
        }
    }
}
