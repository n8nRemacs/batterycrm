package cU;

import com.avito.beduin.v2.render.android_view.H;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRendererModule_ProvideComponentsRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcU/z;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/H;", "a", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z implements dagger.internal.h<H> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f57898c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f57899a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f57900b;

    /* compiled from: BeduinRendererModule_ProvideComponentsRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcU/z$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public z(@Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13) {
        this.f57899a = a12;
        this.f57900b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        LinkedHashMap linkedHashMap;
        Set set = (Set) this.f57899a.get();
        Set<com.avito.beduin.v2.render.android_view.n> set2 = (Set) this.f57900b.get();
        f57898c.getClass();
        w.f57892a.getClass();
        H.a aVar = new H.a(com.avito.beduin.v2.component.meta.android_view.b.f336106c);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = aVar.f337924b;
            if (!zHasNext) {
                break;
            }
            com.avito.beduin.v2.render.android_view.n nVar = (com.avito.beduin.v2.render.android_view.n) it.next();
            linkedHashMap.put(nVar.getF415140d(), nVar);
        }
        for (com.avito.beduin.v2.render.android_view.n nVar2 : set2) {
            linkedHashMap.put(nVar2.getF415140d(), nVar2);
        }
        return new H(P0.q(linkedHashMap), aVar.f337923a, null);
    }
}
