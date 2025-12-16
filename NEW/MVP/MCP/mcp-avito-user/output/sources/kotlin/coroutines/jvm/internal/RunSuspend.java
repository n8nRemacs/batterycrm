package kotlin.coroutines.jvm.internal;

import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: RunSuspend.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004R-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "<init>", "()V", "Lkotlin/Z;", "result", "resumeWith", "(Ljava/lang/Object;)V", "await", "Lkotlin/Z;", "getResult-xLWZpok", "()Lkotlin/Z;", "setResult", "(Lkotlin/Z;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class RunSuspend implements Continuation<G0> {

    @l
    private Z<G0> result;

    public final void await() {
        synchronized (this) {
            while (true) {
                try {
                    Z<G0> z12 = this.result;
                    if (z12 == null) {
                        wait();
                    } else {
                        C42729a0.b(z12.f406625b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @k
    /* renamed from: getContext */
    public CoroutineContext getF410748d() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @l
    /* renamed from: getResult-xLWZpok, reason: not valid java name */
    public final Z<G0> m128getResultxLWZpok() {
        return this.result;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@k Object result) {
        synchronized (this) {
            this.result = Z.a(result);
            notifyAll();
            G0 g02 = G0.f406611a;
        }
    }

    public final void setResult(@l Z<G0> z12) {
        this.result = z12;
    }
}
