package ix;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kx.C43507a;
import kx.C43509c;

/* compiled from: DevelopmentsCatalogAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lix/g;", "Ldagger/internal/h;", "Lix/f;", "a", "_avito_developments-catalog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements h<f> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f405403d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43509c f405404a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f405405b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f405406c;

    /* compiled from: DevelopmentsCatalogAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lix/g$a;", "", "<init>", "()V", "_avito_developments-catalog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k C43509c c43509c, @k e0 e0Var, @k Provider provider) {
        this.f405404a = c43509c;
        this.f405405b = e0Var;
        this.f405406c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C43507a c43507a = (C43507a) this.f405404a.get();
        c0 c0Var = (c0) this.f405405b.get();
        InterfaceC27642e interfaceC27642e = this.f405406c.get();
        f405403d.getClass();
        return new f(c43507a, c0Var, interfaceC27642e);
    }
}
