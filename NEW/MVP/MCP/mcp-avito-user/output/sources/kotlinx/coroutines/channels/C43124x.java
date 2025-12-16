package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: ChannelCoroutine.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/x;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/G0;", "Lkotlinx/coroutines/channels/w;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43124x<E> extends AbstractC43075a<kotlin.G0> implements InterfaceC43123w<E> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43108m f411033e;

    public C43124x(@Y61.k CoroutineContext coroutineContext, @Y61.k C43108m c43108m, boolean z12, boolean z13) {
        super(coroutineContext, z12, z13);
        this.f411033e = c43108m;
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final kotlinx.coroutines.selects.j<B<E>> E() {
        return this.f411033e.E();
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final Object H() {
        return this.f411033e.H();
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.l
    public final Object M(@Y61.k Continuation<? super E> continuation) {
        return this.f411033e.M(continuation);
    }

    @Override // kotlinx.coroutines.V0
    public final void V(@Y61.k CancellationException cancellationException) {
        CancellationException cancellationExceptionA0 = V0.A0(this, cancellationException);
        this.f411033e.m(cancellationExceptionA0);
        U(cancellationExceptionA0);
    }

    @Override // kotlinx.coroutines.V0, kotlinx.coroutines.N0
    public final void c(@Y61.l CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        V(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.M0
    public final void g(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        this.f411033e.g(lVar);
    }

    @Override // kotlinx.coroutines.V0, kotlinx.coroutines.channels.M0
    public boolean h(@Y61.l Throwable th2) {
        return this.f411033e.h(th2);
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final InterfaceC43125y<E> iterator() {
        C43108m c43108m = this.f411033e;
        c43108m.getClass();
        return new C43108m.a();
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean l() {
        return this.f411033e.l();
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.l
    public final Object s(@Y61.k ContinuationImpl continuationImpl) {
        C43108m c43108m = this.f411033e;
        c43108m.getClass();
        Object objQ = C43108m.Q(c43108m, continuationImpl);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objQ;
    }

    @Y61.l
    public Object send(E e12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        return this.f411033e.send(e12, continuation);
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final kotlinx.coroutines.selects.j<E> v() {
        return this.f411033e.v();
    }

    @Y61.k
    public Object w(E e12) {
        return this.f411033e.w(e12);
    }

    @Y61.k
    public final C43124x r() {
        return this;
    }
}
