package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* compiled from: AbstractCoroutine.kt */
@I0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/V0;", "Lkotlinx/coroutines/N0;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/T;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43075a<T> extends V0 implements N0, Continuation<T>, T {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f410748d;

    public AbstractC43075a(@Y61.k CoroutineContext coroutineContext, boolean z12, boolean z13) {
        super(z13);
        if (z12) {
            m0((N0) coroutineContext.get(N0.f410716u2));
        }
        this.f410748d = coroutineContext.plus(this);
    }

    public final void E0(@Y61.k CoroutineStart coroutineStart, AbstractC43075a abstractC43075a, @Y61.k Y41.p pVar) {
        Object objInvoke;
        int iOrdinal = coroutineStart.ordinal();
        if (iOrdinal == 0) {
            F51.a.b(pVar, abstractC43075a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ContinuationKt.startCoroutine(pVar, abstractC43075a, this);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(this);
            try {
                CoroutineContext f410748d = get$context();
                Object objB = kotlinx.coroutines.internal.g0.b(f410748d, null);
                try {
                    if (pVar instanceof BaseContinuationImpl) {
                        kotlin.jvm.internal.v0.e(2, pVar);
                        objInvoke = pVar.invoke(abstractC43075a, continuationProbeCoroutineCreated);
                    } else {
                        objInvoke = IntrinsicsKt.wrapWithContinuationImpl(pVar, abstractC43075a, continuationProbeCoroutineCreated);
                    }
                    kotlinx.coroutines.internal.g0.a(f410748d, objB);
                    if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        int i12 = kotlin.Z.f406624c;
                        continuationProbeCoroutineCreated.resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    kotlinx.coroutines.internal.g0.a(f410748d, objB);
                    throw th2;
                }
            } catch (Throwable th3) {
                int i13 = kotlin.Z.f406624c;
                continuationProbeCoroutineCreated.resumeWith(new Z.b(th3));
            }
        }
    }

    @Override // kotlinx.coroutines.V0
    @Y61.k
    public final String X() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext get$context() {
        return this.f410748d;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF399773c() {
        return this.f410748d;
    }

    @Override // kotlinx.coroutines.V0
    public final void l0(@Y61.k CompletionHandlerException completionHandlerException) {
        P.a(this.f410748d, completionHandlerException);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        Throwable thB = kotlin.Z.b(obj);
        if (thB != null) {
            obj = new E(thB, false, 2, null);
        }
        Object objQ0 = q0(obj);
        if (objQ0 == C43077a1.f410750b) {
            return;
        }
        S(objQ0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.V0
    public final void v0(@Y61.l Object obj) {
        if (!(obj instanceof E)) {
            D0(obj);
        } else {
            E e12 = (E) obj;
            C0(e12.f410693a, E.f410692b.get(e12) != 0);
        }
    }

    public void D0(T t12) {
    }

    public void C0(@Y61.k Throwable th2, boolean z12) {
    }
}
