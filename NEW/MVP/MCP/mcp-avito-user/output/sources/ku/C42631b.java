package kU;

import Y61.k;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.a;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.c;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.f;
import com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.h;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: BeduinV1InMemoryModule_ProvideInteractionFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LkU/b;", "Ldagger/internal/h;", "", "LdU0/c;", "LX41/o;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_beduin-v1-in-memory_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kU.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42631b implements h<Set<dU0.c>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C42631b f406284a = new C42631b();

    @Override // javax.inject.Provider
    public final Object get() {
        C42630a.f406283a.getClass();
        Set setL0 = C42756l.l0(new dU0.c[]{f.a.f338128b, h.a.f338132b, a.C10475a.f338115b, c.a.f338118b});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
