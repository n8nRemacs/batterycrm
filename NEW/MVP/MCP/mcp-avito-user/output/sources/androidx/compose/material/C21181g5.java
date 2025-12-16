package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.C21168f5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalMutatorMutex.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 103}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: androidx.compose.material.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21181g5 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f33590q;

    /* renamed from: r, reason: collision with root package name */
    public Object f33591r;

    /* renamed from: s, reason: collision with root package name */
    public C21168f5 f33592s;

    /* renamed from: t, reason: collision with root package name */
    public int f33593t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f33594u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f33595v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C21168f5 f33596w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f33597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21181g5(MutatePriority mutatePriority, C21168f5 c21168f5, Y41.l<? super Continuation<Object>, ? extends Object> lVar, Continuation<? super C21181g5> continuation) {
        super(2, continuation);
        this.f33595v = mutatePriority;
        this.f33596w = c21168f5;
        this.f33597x = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C21181g5 c21181g5 = new C21181g5(this.f33595v, this.f33596w, this.f33597x, continuation);
        c21181g5.f33594u = obj;
        return c21181g5;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        return ((C21181g5) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Y41.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C21168f5 c21168f5;
        kotlinx.coroutines.sync.a aVar;
        ?? r42;
        C21168f5.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        C21168f5.a aVar4;
        C21168f5 c21168f52;
        Throwable th2;
        AtomicReference<C21168f5.a> atomicReference;
        AtomicReference<C21168f5.a> atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f33593t;
        try {
            try {
                if (r12 == 0) {
                    C42729a0.b(obj);
                    C21168f5.a aVar5 = new C21168f5.a(this.f33595v, (kotlinx.coroutines.N0) ((kotlinx.coroutines.T) this.f33594u).getF399611e().get(kotlinx.coroutines.N0.f410716u2));
                    while (true) {
                        c21168f5 = this.f33596w;
                        AtomicReference<C21168f5.a> atomicReference3 = c21168f5.f33562a;
                        C21168f5.a aVar6 = atomicReference3.get();
                        if (aVar6 != null && aVar5.f33564a.compareTo(aVar6.f33564a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar6, aVar5)) {
                            if (atomicReference3.get() != aVar6) {
                                break;
                            }
                        }
                        if (aVar6 != null) {
                            aVar6.f33565b.c(null);
                        }
                        aVar = c21168f5.f33563b;
                        this.f33594u = aVar5;
                        this.f33590q = aVar;
                        SuspendLambda suspendLambda = this.f33597x;
                        this.f33591r = suspendLambda;
                        this.f33592s = c21168f5;
                        this.f33593t = 1;
                        if (aVar.b(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r42 = suspendLambda;
                        aVar2 = aVar5;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c21168f52 = (C21168f5) this.f33591r;
                        aVar3 = this.f33590q;
                        aVar4 = (C21168f5.a) this.f33594u;
                        try {
                            C42729a0.b(obj);
                            atomicReference2 = c21168f52.f33562a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.d(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = c21168f52.f33562a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th2;
                        }
                    }
                    C21168f5 c21168f53 = this.f33592s;
                    Y41.l lVar = (Y41.l) this.f33591r;
                    aVar = this.f33590q;
                    aVar2 = (C21168f5.a) this.f33594u;
                    C42729a0.b(obj);
                    c21168f5 = c21168f53;
                    r42 = lVar;
                }
                this.f33594u = aVar2;
                this.f33590q = aVar3;
                this.f33591r = c21168f5;
                this.f33592s = null;
                this.f33593t = 2;
                Object objInvoke = r42.invoke(this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c21168f52 = c21168f5;
                obj = objInvoke;
                aVar4 = aVar2;
                atomicReference2 = c21168f52.f33562a;
                while (!atomicReference2.compareAndSet(aVar4, null)) {
                }
                aVar3.d(null);
                return obj;
            } catch (Throwable th4) {
                aVar4 = aVar2;
                c21168f52 = c21168f5;
                th2 = th4;
                atomicReference = c21168f52.f33562a;
                while (!atomicReference.compareAndSet(aVar4, null) && atomicReference.get() == aVar4) {
                }
                throw th2;
            }
            aVar3 = aVar;
        } catch (Throwable th5) {
            r12.d(null);
            throw th5;
        }
    }
}
