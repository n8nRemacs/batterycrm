package androidx.compose.foundation;

import androidx.compose.foundation.G1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MutatorMutex.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {210, 125}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class H1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f26716q;

    /* renamed from: r, reason: collision with root package name */
    public Object f26717r;

    /* renamed from: s, reason: collision with root package name */
    public G1 f26718s;

    /* renamed from: t, reason: collision with root package name */
    public int f26719t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f26720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f26721v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G1 f26722w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f26723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H1(MutatePriority mutatePriority, G1 g12, Y41.l<? super Continuation<Object>, ? extends Object> lVar, Continuation<? super H1> continuation) {
        super(2, continuation);
        this.f26721v = mutatePriority;
        this.f26722w = g12;
        this.f26723x = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        H1 h12 = new H1(this.f26721v, this.f26722w, this.f26723x, continuation);
        h12.f26720u = obj;
        return h12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        return ((H1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Y41.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        G1 g12;
        kotlinx.coroutines.sync.a aVar;
        ?? r32;
        G1.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        G1.a aVar4;
        G1 g13;
        Throwable th2;
        AtomicReference<G1.a> atomicReference;
        AtomicReference<G1.a> atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f26719t;
        try {
            try {
                if (r12 == 0) {
                    C42729a0.b(obj);
                    G1.a aVar5 = new G1.a(this.f26721v, (kotlinx.coroutines.N0) ((kotlinx.coroutines.T) this.f26720u).getF398977e().get(kotlinx.coroutines.N0.f410716u2));
                    g12 = this.f26722w;
                    G1.a(g12, aVar5);
                    aVar = g12.f26711b;
                    this.f26720u = aVar5;
                    this.f26716q = aVar;
                    SuspendLambda suspendLambda = this.f26723x;
                    this.f26717r = suspendLambda;
                    this.f26718s = g12;
                    this.f26719t = 1;
                    if (aVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r32 = suspendLambda;
                    aVar2 = aVar5;
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g13 = (G1) this.f26717r;
                        aVar3 = this.f26716q;
                        aVar4 = (G1.a) this.f26720u;
                        try {
                            C42729a0.b(obj);
                            atomicReference2 = g13.f26710a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.d(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = g13.f26710a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th2;
                        }
                    }
                    G1 g14 = this.f26718s;
                    Y41.l lVar = (Y41.l) this.f26717r;
                    aVar = this.f26716q;
                    aVar2 = (G1.a) this.f26720u;
                    C42729a0.b(obj);
                    g12 = g14;
                    r32 = lVar;
                }
                this.f26720u = aVar2;
                this.f26716q = aVar3;
                this.f26717r = g12;
                this.f26718s = null;
                this.f26719t = 2;
                Object objInvoke = r32.invoke(this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                g13 = g12;
                obj = objInvoke;
                aVar4 = aVar2;
                atomicReference2 = g13.f26710a;
                while (!atomicReference2.compareAndSet(aVar4, null)) {
                }
                aVar3.d(null);
                return obj;
            } catch (Throwable th4) {
                aVar4 = aVar2;
                g13 = g12;
                th2 = th4;
                atomicReference = g13.f26710a;
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
