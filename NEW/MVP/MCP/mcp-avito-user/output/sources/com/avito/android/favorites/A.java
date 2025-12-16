package com.avito.android.favorites;

import android.annotation.SuppressLint;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.favorites.Q;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/A;", "Lcom/avito/android/favorites/y;", "a", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements InterfaceC30704y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ZC.c f156182a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.x f156183b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f156184c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final S f156185d;

    /* compiled from: FavoriteAdvertsServiceInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/A$a;", "", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f156186a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f156187b;

        public a(@Y61.k List<String> list, @Y61.k List<String> list2) {
            this.f156186a = list;
            this.f156187b = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f156186a, aVar.f156186a) && kotlin.jvm.internal.L.f(this.f156187b, aVar.f156187b);
        }

        public final int hashCode() {
            return this.f156187b.hashCode() + (this.f156186a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsSyncResult(removedAdvert=");
            sb2.append(this.f156186a);
            sb2.append(", addedAdvert=");
            return androidx.compose.foundation.H.p(sb2, this.f156187b, ')');
        }
    }

    /* compiled from: FavoriteAdvertsServiceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            A.this.f156185d.b(Q.c.f156325a);
        }
    }

    /* compiled from: FavoriteAdvertsServiceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorites/A$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/favorites/A$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar.f156186a.isEmpty() && aVar.f156187b.isEmpty()) {
                return;
            }
            A.this.f156185d.b(new Q.a(null, aVar.f156186a, aVar.f156187b, 1, null));
        }
    }

    @Inject
    public A(@Y61.k ZC.c cVar, @Y61.k com.avito.android.favorite.x xVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k S s5) {
        this.f156182a = cVar;
        this.f156183b = xVar;
        this.f156184c = interfaceC28373a;
        this.f156185d = s5;
    }

    @Override // com.avito.android.favorites.InterfaceC30704y
    public final void a() {
        new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC30706z(this, 1)).v(new com.avito.android.advert_core.task.a(10), new B(this, "Failed to wipe favorites"));
    }

    @Override // com.avito.android.favorites.InterfaceC30704y
    @SuppressLint({"CheckResult"})
    public final void b() {
        io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC30706z(this, 2));
        l41.o oVar = C.f156197b;
        Objects.requireNonNull(oVar, "mapper is null");
        new io.reactivex.rxjava3.internal.operators.completable.v(new C41936b0(new io.reactivex.rxjava3.internal.operators.single.C(g12, oVar), new F(this)).h(new ArrayList(), G.f156273b).n(new I(this)).j(new b()).k(new c())).v(new com.avito.android.advert_core.task.a(10), new B(this, "Failed to upload favorites"));
    }
}
