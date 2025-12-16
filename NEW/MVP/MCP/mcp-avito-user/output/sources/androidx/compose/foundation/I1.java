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
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {210, 165}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class I1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f26726q;

    /* renamed from: r, reason: collision with root package name */
    public Object f26727r;

    /* renamed from: s, reason: collision with root package name */
    public Object f26728s;

    /* renamed from: t, reason: collision with root package name */
    public G1 f26729t;

    /* renamed from: u, reason: collision with root package name */
    public int f26730u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26731v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f26732w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ G1 f26733x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f26734y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26735z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I1(MutatePriority mutatePriority, G1 g12, Y41.p<Object, ? super Continuation<Object>, ? extends Object> pVar, Object obj, Continuation<? super I1> continuation) {
        super(2, continuation);
        this.f26732w = mutatePriority;
        this.f26733x = g12;
        this.f26734y = (SuspendLambda) pVar;
        this.f26735z = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        I1 i12 = new I1(this.f26732w, this.f26733x, this.f26734y, this.f26735z, continuation);
        i12.f26731v = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        return ((I1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Y41.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        G1 g12;
        Object obj2;
        G1.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        ?? r52;
        G1.a aVar3;
        G1 g13;
        Throwable th2;
        AtomicReference<G1.a> atomicReference;
        AtomicReference<G1.a> atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f26730u;
        try {
            try {
                if (r12 == 0) {
                    C42729a0.b(obj);
                    G1.a aVar4 = new G1.a(this.f26732w, (kotlinx.coroutines.N0) ((kotlinx.coroutines.T) this.f26731v).getF398827h().get(kotlinx.coroutines.N0.f410716u2));
                    g12 = this.f26733x;
                    G1.a(g12, aVar4);
                    kotlinx.coroutines.sync.d dVar = g12.f26711b;
                    this.f26731v = aVar4;
                    this.f26726q = dVar;
                    SuspendLambda suspendLambda = this.f26734y;
                    this.f26727r = suspendLambda;
                    Object obj3 = this.f26735z;
                    this.f26728s = obj3;
                    this.f26729t = g12;
                    this.f26730u = 1;
                    if (dVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj3;
                    aVar = aVar4;
                    aVar2 = dVar;
                    r52 = suspendLambda;
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g13 = (G1) this.f26727r;
                        aVar2 = this.f26726q;
                        aVar3 = (G1.a) this.f26731v;
                        try {
                            C42729a0.b(obj);
                            atomicReference2 = g13.f26710a;
                            while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                            }
                            aVar2.d(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = g13.f26710a;
                            while (!atomicReference.compareAndSet(aVar3, null)) {
                            }
                            throw th2;
                        }
                    }
                    G1 g14 = this.f26729t;
                    obj2 = this.f26728s;
                    Y41.p pVar = (Y41.p) this.f26727r;
                    kotlinx.coroutines.sync.a aVar5 = this.f26726q;
                    aVar = (G1.a) this.f26731v;
                    C42729a0.b(obj);
                    g12 = g14;
                    aVar2 = aVar5;
                    r52 = pVar;
                }
                this.f26731v = aVar;
                this.f26726q = aVar2;
                this.f26727r = g12;
                this.f26728s = null;
                this.f26729t = null;
                this.f26730u = 2;
                Object objInvoke = r52.invoke(obj2, this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                g13 = g12;
                obj = objInvoke;
                aVar3 = aVar;
                atomicReference2 = g13.f26710a;
                while (!atomicReference2.compareAndSet(aVar3, null)) {
                }
                aVar2.d(null);
                return obj;
            } catch (Throwable th4) {
                aVar3 = aVar;
                g13 = g12;
                th2 = th4;
                atomicReference = g13.f26710a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r12.d(null);
            throw th5;
        }
    }
}
