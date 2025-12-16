package BU;

import Y61.k;
import com.avito.beduin.v2.repository.screen_lifecycle.interactions.a;
import com.avito.beduin.v2.repository.screen_lifecycle.interactions.c;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: ScreenLifecycleModule_ProvideInteractionFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LBU/f;", "Ldagger/internal/h;", "", "LdU0/c;", "LX41/o;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_screen-lifecycle_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<Set<dU0.c>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f1405a = new f();

    @Override // javax.inject.Provider
    public final Object get() {
        d.f1400a.getClass();
        Set setL0 = C42756l.l0(new dU0.c[]{a.C10483a.f338304b, c.a.f338306b});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
