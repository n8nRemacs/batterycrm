package dU;

import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36352i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinComposeRendererModule_ProvideComponentsRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LdU/v;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/compose/i;", "a", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<C36352i> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f393878c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f393879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f393880b;

    /* compiled from: BeduinComposeRendererModule_ProvideComponentsRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdU/v$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v(@Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13) {
        this.f393879a = a12;
        this.f393880b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        LinkedHashMap linkedHashMap;
        Set set = (Set) this.f393879a.get();
        Set<AbstractC36347d> set2 = (Set) this.f393880b.get();
        f393878c.getClass();
        t.f393876a.getClass();
        C36352i.a aVar = new C36352i.a(com.avito.beduin.v2.component.meta.compose.a.f336108b);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = aVar.f338077b;
            if (!zHasNext) {
                break;
            }
            AbstractC36347d abstractC36347d = (AbstractC36347d) it.next();
            linkedHashMap.put(abstractC36347d.b(), abstractC36347d);
        }
        for (AbstractC36347d abstractC36347d2 : set2) {
            linkedHashMap.put(abstractC36347d2.b(), abstractC36347d2);
        }
        return new C36352i(P0.q(linkedHashMap), aVar.f338076a, null);
    }
}
