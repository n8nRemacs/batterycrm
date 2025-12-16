package pU;

import Y61.k;
import dagger.internal.h;
import dagger.internal.t;
import hV0.C40881a;
import hV0.C40883c;
import hV0.C40885e;
import hV0.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: DateTimeRepositoryModule_ProvideInteractionFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LpU/e;", "Ldagger/internal/h;", "", "LdU0/c;", "LX41/o;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_date-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements h<Set<dU0.c>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f428544a = new e();

    @Override // javax.inject.Provider
    public final Object get() {
        d.f428543a.getClass();
        Set setL0 = C42756l.l0(new dU0.c[]{C40881a.C11261a.f397207b, C40883c.a.f397209b, C40885e.a.f397211b, g.a.f397213b});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
