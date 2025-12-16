package bn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingAnalyticsTracker_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbn/b;", "Ldagger/internal/h;", "Lbn/a;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C25681b implements h<C25680a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f57425e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57426a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f57427b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f57428c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<E> f57429d;

    /* compiled from: CartSheetAfterAddingAnalyticsTracker_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbn/b$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bn.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25681b(@k f fVar, @k l lVar, @k l lVar2, @k Provider provider) {
        this.f57426a = fVar;
        this.f57427b = lVar;
        this.f57428c = lVar2;
        this.f57429d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f57426a.get();
        Srcp srcp = (Srcp) this.f57427b.f393949a;
        FromPage fromPage = (FromPage) this.f57428c.f393949a;
        E e12 = this.f57429d.get();
        f57425e.getClass();
        return new C25680a(interfaceC28373a, srcp, fromPage, e12);
    }
}
