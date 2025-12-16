package vU;

import Y61.k;
import com.avito.beduin.v2.handler.flow.j;
import com.avito.beduin.v2.repository.favorite_item.interactions.f;
import dagger.internal.h;
import dagger.internal.t;
import jV0.InterfaceC42311a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteItemRepositoryInteractionModule_ProvideInteractionHandlersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LvU/e;", "Ldagger/internal/h;", "", "Lcom/avito/beduin/v2/handler/flow/j;", "LX41/o;", "a", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements h<Set<j>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f440793b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.repository.favorite_item.d f440794a;

    /* compiled from: FavoriteItemRepositoryInteractionModule_ProvideInteractionHandlersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvU/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k com.avito.android.lib.beduin_v2.repository.favorite_item.d dVar) {
        this.f440794a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42311a interfaceC42311a = (InterfaceC42311a) this.f440794a.get();
        f440793b.getClass();
        C49266c.f440791a.getClass();
        Set setL0 = C42756l.l0(new j[]{new com.avito.beduin.v2.repository.favorite_item.interactions.c(interfaceC42311a), new com.avito.beduin.v2.repository.favorite_item.interactions.h(interfaceC42311a), new f(interfaceC42311a)});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
