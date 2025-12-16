package AU;

import Y61.k;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import rV0.C47602a;
import rV0.c;
import rV0.e;

/* compiled from: PersistenceRepositoryModule_ProvideInteractionFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LAU/b;", "Ldagger/internal/h;", "", "LdU0/c;", "LX41/o;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_persistent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<Set<dU0.c>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f339a = new b();

    @Override // javax.inject.Provider
    public final Object get() {
        a.f338a.getClass();
        Set setL0 = C42756l.l0(new dU0.c[]{C47602a.C12377a.f429844b, e.a.f429851b, c.a.f429847b});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
