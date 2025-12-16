package BK0;

import Y61.k;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.subjects.e;
import io.reactivex.rxjava3.subjects.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: DeliverUnconsumedValueSubject.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LBK0/a;", "", "T", "Lio/reactivex/rxjava3/subjects/i;", "<init>", "()V", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a<T> extends i<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<T> f1349b = new e<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicReference<T> f1350c = new AtomicReference<>();

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@k d dVar) {
        this.f1349b.b(dVar);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        this.f1349b.e();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@k Throwable th2) {
        this.f1349b.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(@k T t12) {
        e<T> eVar = this.f1349b;
        eVar.onNext(t12);
        if (eVar.N0()) {
            return;
        }
        this.f1350c.set(t12);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@k G<? super T> g12) {
        this.f1349b.c(g12);
        T andSet = this.f1350c.getAndSet(null);
        if (andSet != null) {
            onNext(andSet);
        }
    }
}
