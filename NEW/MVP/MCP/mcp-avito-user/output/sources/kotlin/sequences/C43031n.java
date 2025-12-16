package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/sequences/n;", "T", "Lkotlin/sequences/o;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43031n<T> extends AbstractC43032o<T> implements Iterator<T>, Continuation<G0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f410548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public T f410549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Iterator<? extends T> f410550d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Continuation<? super G0> f410551e;

    @Override // kotlin.sequences.AbstractC43032o
    @Y61.l
    public final Object a(T t12, @Y61.k Continuation<? super G0> continuation) {
        this.f410549c = t12;
        this.f410548b = 3;
        this.f410551e = continuation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : G0.f406611a;
    }

    @Override // kotlin.sequences.AbstractC43032o
    @Y61.l
    public final Object b(@Y61.k Iterator it, @Y61.k RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return G0.f406611a;
        }
        this.f410550d = it;
        this.f410548b = 2;
        this.f410551e = restrictedSuspendLambda;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(restrictedSuspendLambda);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : G0.f406611a;
    }

    public final RuntimeException c() {
        int i12 = this.f410548b;
        if (i12 == 4) {
            return new NoSuchElementException();
        }
        if (i12 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f410548b);
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411960f() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i12 = this.f410548b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2 || i12 == 3) {
                        return true;
                    }
                    if (i12 == 4) {
                        return false;
                    }
                    throw c();
                }
                if (this.f410550d.hasNext()) {
                    this.f410548b = 2;
                    return true;
                }
                this.f410550d = null;
            }
            this.f410548b = 5;
            Continuation<? super G0> continuation = this.f410551e;
            this.f410551e = null;
            int i13 = kotlin.Z.f406624c;
            continuation.resumeWith(G0.f406611a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i12 = this.f410548b;
        if (i12 == 0 || i12 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i12 == 2) {
            this.f410548b = 1;
            return this.f410550d.next();
        }
        if (i12 != 3) {
            throw c();
        }
        this.f410548b = 0;
        T t12 = this.f410549c;
        this.f410549c = null;
        return t12;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        C42729a0.b(obj);
        this.f410548b = 4;
    }
}
