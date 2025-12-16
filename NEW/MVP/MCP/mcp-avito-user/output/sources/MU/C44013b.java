package mU;

import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartMenuIconAnalyticsTracker_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LmU/b;", "Ldagger/internal/h;", "LmU/a;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mU.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44013b implements h<C44012a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f414515c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f414516a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f414517b;

    /* compiled from: CartMenuIconAnalyticsTracker_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmU/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mU.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44013b(@k u uVar, @k u uVar2) {
        this.f414516a = uVar;
        this.f414517b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f414516a.get();
        E e12 = (E) this.f414517b.get();
        f414515c.getClass();
        return new C44012a(e12, interfaceC28373a);
    }
}
