package androidx.compose.material3;

import androidx.compose.material3.H8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalMutatorMutex.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 138}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class J8 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f34944q;

    /* renamed from: r, reason: collision with root package name */
    public H8 f34945r;

    /* renamed from: s, reason: collision with root package name */
    public int f34946s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f34947t;

    public J8() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        H8 h82;
        H8.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        AtomicReference<H8.a> atomicReference;
        AtomicReference<H8.a> atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f34946s;
        if (r12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        try {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h82 = this.f34945r;
                aVar2 = this.f34944q;
                aVar = (H8.a) this.f34947t;
                try {
                    C42729a0.b(obj);
                    atomicReference2 = h82.f34835a;
                    while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                    }
                    aVar2.d(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    atomicReference = h82.f34835a;
                    while (!atomicReference.compareAndSet(aVar, null)) {
                    }
                    throw th;
                }
            }
            Y41.p pVar = (Y41.p) this.f34945r;
            kotlinx.coroutines.sync.a aVar3 = this.f34944q;
            H8.a aVar4 = (H8.a) this.f34947t;
            C42729a0.b(obj);
            try {
                this.f34947t = aVar4;
                this.f34944q = aVar3;
                this.f34945r = null;
                this.f34946s = 2;
                obj = pVar.invoke(null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                h82 = null;
                aVar2 = aVar3;
                aVar = aVar4;
                atomicReference2 = h82.f34835a;
                while (!atomicReference2.compareAndSet(aVar, null)) {
                }
                aVar2.d(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                h82 = null;
                aVar = aVar4;
                atomicReference = h82.f34835a;
                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r12.d(null);
            throw th4;
        }
    }
}
