package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.H8;
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
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 99}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class I8 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f34871q;

    /* renamed from: r, reason: collision with root package name */
    public Object f34872r;

    /* renamed from: s, reason: collision with root package name */
    public H8 f34873s;

    /* renamed from: t, reason: collision with root package name */
    public int f34874t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f34875u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f34876v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H8 f34877w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f34878x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I8(MutatePriority mutatePriority, H8 h82, Y41.l<? super Continuation<Object>, ? extends Object> lVar, Continuation<? super I8> continuation) {
        super(2, continuation);
        this.f34876v = mutatePriority;
        this.f34877w = h82;
        this.f34878x = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I8 i82 = new I8(this.f34876v, this.f34877w, this.f34878x, continuation);
        i82.f34875u = obj;
        return i82;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        return ((I8) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Y41.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        H8 h82;
        kotlinx.coroutines.sync.a aVar;
        ?? r42;
        H8.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        H8.a aVar4;
        H8 h83;
        Throwable th2;
        AtomicReference<H8.a> atomicReference;
        AtomicReference<H8.a> atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f34874t;
        try {
            try {
                if (r12 == 0) {
                    C42729a0.b(obj);
                    H8.a aVar5 = new H8.a(this.f34876v, (kotlinx.coroutines.N0) ((kotlinx.coroutines.T) this.f34875u).getF399611e().get(kotlinx.coroutines.N0.f410716u2));
                    while (true) {
                        h82 = this.f34877w;
                        AtomicReference<H8.a> atomicReference3 = h82.f34835a;
                        H8.a aVar6 = atomicReference3.get();
                        if (aVar6 != null && aVar5.f34837a.compareTo(aVar6.f34837a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar6, aVar5)) {
                            if (atomicReference3.get() != aVar6) {
                                break;
                            }
                        }
                        if (aVar6 != null) {
                            aVar6.f34838b.c(null);
                        }
                        aVar = h82.f34836b;
                        this.f34875u = aVar5;
                        this.f34871q = aVar;
                        SuspendLambda suspendLambda = this.f34878x;
                        this.f34872r = suspendLambda;
                        this.f34873s = h82;
                        this.f34874t = 1;
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
                        h83 = (H8) this.f34872r;
                        aVar3 = this.f34871q;
                        aVar4 = (H8.a) this.f34875u;
                        try {
                            C42729a0.b(obj);
                            atomicReference2 = h83.f34835a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.d(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = h83.f34835a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th2;
                        }
                    }
                    H8 h84 = this.f34873s;
                    Y41.l lVar = (Y41.l) this.f34872r;
                    aVar = this.f34871q;
                    aVar2 = (H8.a) this.f34875u;
                    C42729a0.b(obj);
                    h82 = h84;
                    r42 = lVar;
                }
                this.f34875u = aVar2;
                this.f34871q = aVar3;
                this.f34872r = h82;
                this.f34873s = null;
                this.f34874t = 2;
                Object objInvoke = r42.invoke(this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                h83 = h82;
                obj = objInvoke;
                aVar4 = aVar2;
                atomicReference2 = h83.f34835a;
                while (!atomicReference2.compareAndSet(aVar4, null)) {
                }
                aVar3.d(null);
                return obj;
            } catch (Throwable th4) {
                aVar4 = aVar2;
                h83 = h82;
                th2 = th4;
                atomicReference = h83.f34835a;
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
