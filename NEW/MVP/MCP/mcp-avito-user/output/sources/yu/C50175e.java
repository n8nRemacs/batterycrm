package yU;

import Y61.k;
import com.avito.beduin.v2.handler.flow.j;
import com.avito.beduin.v2.repository.in_memory.interactions.g;
import com.avito.beduin.v2.repository.in_memory.interactions.i;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import mV0.C44020b;

/* compiled from: InMemoryRepositoryModule_ProvideInteractionHandlersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LyU/e;", "Ldagger/internal/h;", "", "Lcom/avito/beduin/v2/handler/flow/j;", "LX41/o;", "a", "_design-modules_beduin-v2_interactions_repository_common_in-memory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yU.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50175e implements h<Set<j>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f443120b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C44020b> f443121a;

    /* compiled from: InMemoryRepositoryModule_ProvideInteractionHandlersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyU/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_in-memory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yU.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50175e(@k Provider<C44020b> provider) {
        this.f443121a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44020b c44020b = this.f443121a.get();
        f443120b.getClass();
        C50173c.f443118a.getClass();
        Set setL0 = C42756l.l0(new j[]{new com.avito.beduin.v2.repository.in_memory.interactions.b(c44020b), new i(c44020b), new g(c44020b), new com.avito.beduin.v2.repository.in_memory.interactions.e(c44020b)});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
