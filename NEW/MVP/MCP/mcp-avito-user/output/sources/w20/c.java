package W20;

import Y61.k;
import com.avito.android.C34161r;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationConfigFeaturesModule_ProvideNavigationConfigFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LW20/c;", "Ldagger/internal/h;", "LW20/a;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<W20.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f17726b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f17727a;

    /* compiled from: NavigationConfigFeaturesModule_ProvideNavigationConfigFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW20/c$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<C34161r> provider) {
        this.f17727a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f17727a.get();
        f17726b.getClass();
        b.f17725a.getClass();
        return (W20.a) c34161r.f246393a.b(W20.a.class);
    }
}
