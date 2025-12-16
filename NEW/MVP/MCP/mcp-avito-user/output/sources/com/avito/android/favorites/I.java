package com.avito.android.favorites;

import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "added", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/favorites/A$a;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f156281b;

    public I(A a12) {
        this.f156281b = a12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        A a12 = this.f156281b;
        a12.getClass();
        io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC30706z(a12, 0));
        J<T, R> j12 = J.f156284b;
        Objects.requireNonNull(j12, "mapper is null");
        return new C41936b0(new io.reactivex.rxjava3.internal.operators.single.C(g12, j12), new M(a12)).h(new ArrayList(), N.f156304b).r(new H((List) obj));
    }
}
