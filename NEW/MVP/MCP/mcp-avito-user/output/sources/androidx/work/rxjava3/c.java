package androidx.work.rxjava3;

import Fc1.G3;
import androidx.concurrent.futures.b;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.disposables.d;
import java.util.Objects;

/* compiled from: RxWorker.java */
/* loaded from: classes10.dex */
class c implements L<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f56209b;

    public c(b.a aVar) {
        this.f56209b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(d dVar) {
        Objects.requireNonNull(dVar);
        this.f56209b.a(new G3(dVar, 18), RxWorker.f56206a);
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        this.f56209b.d(th2);
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(Object obj) {
        this.f56209b.b(obj);
    }
}
