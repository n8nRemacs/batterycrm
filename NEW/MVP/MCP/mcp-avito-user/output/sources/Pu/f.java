package pU;

import Y61.k;
import com.avito.beduin.v2.handler.flow.j;
import dagger.internal.h;
import dagger.internal.t;
import fV0.InterfaceC40342b;
import hV0.C40882b;
import hV0.C40884d;
import hV0.C40886f;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateTimeRepositoryModule_ProvideInteractionHandlersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LpU/f;", "Ldagger/internal/h;", "", "Lcom/avito/beduin/v2/handler/flow/j;", "LX41/o;", "a", "_design-modules_beduin-v2_interactions_repository_common_date-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements h<Set<j>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f428545b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC40342b> f428546a;

    /* compiled from: DateTimeRepositoryModule_ProvideInteractionHandlersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpU/f$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_date-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k Provider<InterfaceC40342b> provider) {
        this.f428546a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40342b interfaceC40342b = this.f428546a.get();
        f428545b.getClass();
        d.f428543a.getClass();
        Set setL0 = C42756l.l0(new j[]{new C40882b(interfaceC40342b), new C40884d(interfaceC40342b), new C40886f(interfaceC40342b), new hV0.h(interfaceC40342b)});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
