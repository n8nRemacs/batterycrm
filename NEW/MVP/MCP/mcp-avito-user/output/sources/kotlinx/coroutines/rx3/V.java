package kotlinx.coroutines.rx3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: RxChannel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u00032\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0002X\u0082\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b9¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/rx3/V;", "T", "Lkotlinx/coroutines/channels/m;", "Lio/reactivex/rxjava3/core/G;", "Lio/reactivex/rxjava3/core/t;", "<init>", "()V", "Lkotlinx/atomicfu/AtomicRef;", "Lio/reactivex/rxjava3/disposables/d;", "_subscription", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class V<T> extends C43108m<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.core.t<T> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412072n = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    public V() {
        super(Integer.MAX_VALUE, null, 2, null);
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final void J() {
        io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) f412072n.getAndSet(this, null);
        if (dVar != null) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@Y61.k io.reactivex.rxjava3.disposables.d dVar) {
        f412072n.set(this, dVar);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        n(null, false);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@Y61.k Throwable th2) {
        n(th2, false);
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(@Y61.k T t12) {
        w(t12);
        n(null, false);
    }
}
