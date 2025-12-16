package kotlinx.coroutines.rx3;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: RxAwait.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b9¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx3/h;", "Lio/reactivex/rxjava3/core/L;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43285h implements io.reactivex.rxjava3.core.L<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f412097b;

    public C43285h(kotlinx.coroutines.r rVar) {
        this.f412097b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(@Y61.k io.reactivex.rxjava3.disposables.d dVar) {
        this.f412097b.r(new C43291n(dVar));
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(@Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        this.f412097b.resumeWith(new Z.b(th2));
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(@Y61.k Object obj) {
        int i12 = Z.f406624c;
        this.f412097b.resumeWith(obj);
    }
}
