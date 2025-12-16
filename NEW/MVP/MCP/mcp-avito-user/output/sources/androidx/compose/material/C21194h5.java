package androidx.compose.material;

import androidx.compose.material.C21168f5;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalMutatorMutex.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 142}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: androidx.compose.material.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21194h5 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f33617q;

    /* renamed from: r, reason: collision with root package name */
    public C21168f5 f33618r;

    /* renamed from: s, reason: collision with root package name */
    public int f33619s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f33620t;

    public C21194h5() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C21168f5 c21168f5;
        C21168f5.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        AtomicReference<C21168f5.a> atomicReference;
        AtomicReference<C21168f5.a> atomicReference2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f33619s;
        if (r12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        try {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c21168f5 = this.f33618r;
                aVar2 = this.f33617q;
                aVar = (C21168f5.a) this.f33620t;
                try {
                    C42729a0.b(obj);
                    atomicReference2 = c21168f5.f33562a;
                    while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                    }
                    aVar2.d(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    atomicReference = c21168f5.f33562a;
                    while (!atomicReference.compareAndSet(aVar, null)) {
                    }
                    throw th;
                }
            }
            Y41.p pVar = (Y41.p) this.f33618r;
            kotlinx.coroutines.sync.a aVar3 = this.f33617q;
            C21168f5.a aVar4 = (C21168f5.a) this.f33620t;
            C42729a0.b(obj);
            try {
                this.f33620t = aVar4;
                this.f33617q = aVar3;
                this.f33618r = null;
                this.f33619s = 2;
                obj = pVar.invoke(null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c21168f5 = null;
                aVar2 = aVar3;
                aVar = aVar4;
                atomicReference2 = c21168f5.f33562a;
                while (!atomicReference2.compareAndSet(aVar, null)) {
                }
                aVar2.d(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                c21168f5 = null;
                aVar = aVar4;
                atomicReference = c21168f5.f33562a;
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
