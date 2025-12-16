package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

@Metadata(d1 = {"kotlinx/coroutines/l", "kotlinx/coroutines/m"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43259k {
    @Y61.k
    public static final <T> InterfaceC43076a0<T> a(@Y61.k T t12, @Y61.k CoroutineContext coroutineContext, @Y61.k CoroutineStart coroutineStart, @Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar) {
        CoroutineContext coroutineContextC = K.c(t12, coroutineContext);
        coroutineStart.getClass();
        C43079b0 c43080b1 = coroutineStart == CoroutineStart.f410681c ? new C43080b1(coroutineContextC, pVar) : new C43079b0(coroutineContextC, true, true);
        ((AbstractC43075a) c43080b1).E0(coroutineStart, (AbstractC43075a) c43080b1, pVar);
        return (InterfaceC43076a0<T>) c43080b1;
    }

    public static /* synthetic */ InterfaceC43076a0 b(T t12, CoroutineContext coroutineContext, Y41.p pVar, int i12) {
        if ((i12 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return a(t12, coroutineContext, CoroutineStart.f410680b, pVar);
    }

    @Y61.k
    public static final N0 c(@Y61.k T t12, @Y61.k CoroutineContext coroutineContext, @Y61.k CoroutineStart coroutineStart, @Y61.k Y41.p<? super T, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        CoroutineContext coroutineContextC = K.c(t12, coroutineContext);
        coroutineStart.getClass();
        AbstractC43075a c43083c1 = coroutineStart == CoroutineStart.f410681c ? new C43083c1(coroutineContextC, pVar) : new q1(coroutineContextC, true, true);
        c43083c1.E0(coroutineStart, c43083c1, pVar);
        return c43083c1;
    }

    public static /* synthetic */ N0 d(T t12, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Y41.p pVar, int i12) {
        if ((i12 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            coroutineStart = CoroutineStart.f410680b;
        }
        return c(t12, coroutineContext, coroutineStart, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@Y61.k CoroutineContext coroutineContext, @Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar) throws Throwable {
        AbstractC43300s0 abstractC43300s0A;
        CoroutineContext coroutineContextC;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            w1.f412301a.getClass();
            abstractC43300s0A = w1.a();
            coroutineContextC = K.c(D0.f410691b, coroutineContext.plus(abstractC43300s0A));
        } else {
            if (continuationInterceptor instanceof AbstractC43300s0) {
            }
            w1.f412301a.getClass();
            abstractC43300s0A = w1.f412302b.get();
            coroutineContextC = K.c(D0.f410691b, coroutineContext);
        }
        C43228i c43228i = new C43228i(coroutineContextC, threadCurrentThread, abstractC43300s0A);
        c43228i.E0(CoroutineStart.f410680b, c43228i, pVar);
        AbstractC43300s0 abstractC43300s0 = c43228i.f411858f;
        if (abstractC43300s0 != null) {
            int i12 = AbstractC43300s0.f412136f;
            abstractC43300s0.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jH2 = abstractC43300s0 != null ? abstractC43300s0.H() : Long.MAX_VALUE;
                if (c43228i.c0()) {
                    if (abstractC43300s0 != null) {
                        int i13 = AbstractC43300s0.f412136f;
                        abstractC43300s0.y(false);
                    }
                    T t12 = (T) C43077a1.a(c43228i.j0());
                    E e12 = t12 instanceof E ? (E) t12 : null;
                    if (e12 == null) {
                        return t12;
                    }
                    throw e12.f410693a;
                }
                LockSupport.parkNanos(c43228i, jH2);
            } catch (Throwable th2) {
                if (abstractC43300s0 != null) {
                    int i14 = AbstractC43300s0.f412136f;
                    abstractC43300s0.y(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c43228i.U(interruptedException);
        throw interruptedException;
    }

    @Y61.l
    public static final <T> Object g(@Y61.k CoroutineContext coroutineContext, @Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, @Y61.k Continuation<? super T> continuation) {
        Object objA;
        CoroutineContext context = continuation.getF411447c();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, L.f410708l)).booleanValue() ? context.plus(coroutineContext) : K.a(context, coroutineContext, false);
        Q0.e(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            kotlinx.coroutines.internal.W w12 = new kotlinx.coroutines.internal.W(continuation, coroutineContextPlus);
            objA = F51.b.a(w12, w12, pVar);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (kotlin.jvm.internal.L.f(coroutineContextPlus.get(key), context.get(key))) {
                F1 f12 = new F1(continuation, coroutineContextPlus);
                CoroutineContext coroutineContext2 = f12.f410748d;
                Object objB = kotlinx.coroutines.internal.g0.b(coroutineContext2, null);
                try {
                    Object objA2 = F51.b.a(f12, f12, pVar);
                    kotlinx.coroutines.internal.g0.a(coroutineContext2, objB);
                    objA = objA2;
                } catch (Throwable th2) {
                    kotlinx.coroutines.internal.g0.a(coroutineContext2, objB);
                    throw th2;
                }
            } else {
                C43226h0 c43226h0 = new C43226h0(continuation, coroutineContextPlus);
                F51.a.b(pVar, c43226h0, c43226h0);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C43226h0.f411856f;
                    int i12 = atomicIntegerFieldUpdater.get(c43226h0);
                    if (i12 != 0) {
                        if (i12 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objA = C43077a1.a(c43226h0.j0());
                        if (objA instanceof E) {
                            throw ((E) objA).f410693a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c43226h0, 0, 1)) {
                        objA = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        break;
                    }
                }
            }
        }
        if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objA;
    }
}
