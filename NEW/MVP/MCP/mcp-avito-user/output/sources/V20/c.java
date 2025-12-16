package V20;

import Y61.k;
import com.avito.android.navigation_config.manager.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationConfigAuthorizationPlugin_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LV20/c;", "Ldagger/internal/h;", "LV20/a;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<V20.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f16900b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f16901a;

    /* compiled from: NavigationConfigAuthorizationPlugin_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LV20/c$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f16901a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.navigation_config.manager.a aVar = (com.avito.android.navigation_config.manager.a) this.f16901a.get();
        f16900b.getClass();
        return new V20.a(aVar);
    }
}
