package W20;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationConfigPublicFeaturesImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LW20/g;", "Ldagger/internal/h;", "LW20/f;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f17730b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f17731a;

    /* compiled from: NavigationConfigPublicFeaturesImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW20/g$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k c cVar) {
        this.f17731a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        W20.a aVar = (W20.a) this.f17731a.get();
        f17730b.getClass();
        return new f(aVar);
    }
}
