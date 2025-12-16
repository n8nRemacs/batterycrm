package nU;

import X41.n;
import Y61.k;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.O;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.P;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartMenuIconModule_ProvideCartMenuIconViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LnU/c;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/N;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nU.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44333c implements h<N> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f415142c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<T0> f415143a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P f415144b;

    /* compiled from: CartMenuIconModule_ProvideCartMenuIconViewModelFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnU/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nU.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44333c(@k Provider provider, @k P p12) {
        this.f415143a = provider;
        this.f415144b = p12;
    }

    @n
    @k
    public static final C44333c a(@k Provider provider, @k P p12) {
        f415142c.getClass();
        return new C44333c(provider, p12);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = this.f415143a.get();
        O o12 = (O) this.f415144b.get();
        f415142c.getClass();
        C44332b.f415141a.getClass();
        return (N) new P0(t02, o12).a(N.class);
    }
}
