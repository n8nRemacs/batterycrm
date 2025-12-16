package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: RxAwait.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx3/g;", "Lio/reactivex/rxjava3/core/d;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43284g implements InterfaceC41771d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f412096b;

    public C43284g(kotlinx.coroutines.r rVar) {
        this.f412096b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void b(@Y61.k io.reactivex.rxjava3.disposables.d dVar) {
        this.f412096b.r(new C43291n(dVar));
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void e() {
        int i12 = Z.f406624c;
        this.f412096b.resumeWith(G0.f406611a);
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void onError(@Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        this.f412096b.resumeWith(new Z.b(th2));
    }
}
