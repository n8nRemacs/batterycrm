package sU;

import Y61.k;
import cV0.InterfaceC27110a;
import com.avito.android.lib.beduin_v2.repository.domain.client_event_bus.f;
import com.avito.beduin.v2.handler.flow.j;
import com.avito.beduin.v2.repository.client.event.bus.interactions.e;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClientEventBusRepositoryModule_ProvideInteractionHandlersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LsU/c;", "Ldagger/internal/h;", "", "Lcom/avito/beduin/v2/handler/flow/j;", "LX41/o;", "a", "_design-modules_beduin-v2_interactions_repository_domain_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<Set<j>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437668b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f437669a;

    /* compiled from: ClientEventBusRepositoryModule_ProvideInteractionHandlersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsU/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f437669a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC27110a interfaceC27110a = (InterfaceC27110a) this.f437669a.get();
        f437668b.getClass();
        C48108a.f437666a.getClass();
        Set setL0 = C42756l.l0(new j[]{new e(interfaceC27110a)});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
