package com.avito.android.search.filter;

import com.avito.android.search.filter.FiltersMode;
import com.avito.android.util.Y5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "apply", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class N<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261884b;

    public N(E e12) {
        this.f261884b = e12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.internal.operators.observable.F f12;
        final Map map = (Map) obj;
        final E e12 = this.f261884b;
        FiltersMode filtersMode = e12.f261783t;
        if (filtersMode instanceof FiltersMode.Default) {
            final int i12 = 0;
            f12 = new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.search.filter.A
                @Override // l41.s
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return e12.f261768e.get().t(map);
                        default:
                            return e12.f261768e.get().k(map);
                    }
                }
            });
        } else {
            if (!(filtersMode instanceof FiltersMode.ExtendedProfile)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i13 = 1;
            f12 = new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.search.filter.A
                @Override // l41.s
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return e12.f261768e.get().t(map);
                        default:
                            return e12.f261768e.get().k(map);
                    }
                }
            });
        }
        return Y5.a(f12);
    }
}
