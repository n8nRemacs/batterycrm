package AU;

import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PreferencesPersistentClientModule_ProvidePersistentClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LAU/f;", "Ldagger/internal/h;", "LpV0/e;", "a", "_design-modules_beduin-v2_interactions_repository_common_persistent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements h<pV0.e> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f345c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<PU0.b> f346a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f347b;

    /* compiled from: PreferencesPersistentClientModule_ProvidePersistentClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAU/f$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_persistent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k u uVar, @k Provider provider) {
        this.f346a = provider;
        this.f347b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PU0.b bVar = this.f346a.get();
        oV0.d dVar = (oV0.d) this.f347b.get();
        f345c.getClass();
        d.f342a.getClass();
        return new pV0.d(bVar, dVar);
    }
}
