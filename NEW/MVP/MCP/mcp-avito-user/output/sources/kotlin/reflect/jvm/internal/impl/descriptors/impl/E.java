package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ModuleDescriptorImpl.kt */
@s0
/* loaded from: classes8.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<C42869m> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G f407550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g12) {
        super(0);
        this.f407550l = g12;
    }

    @Override // Y41.a
    public final C42869m invoke() {
        G g12 = this.f407550l;
        D d12 = g12.f407556h;
        if (d12 == null) {
            throw new AssertionError(AK.c.s(new StringBuilder("Dependencies of module "), g12.getName().f409252b, " were not set before querying module content"));
        }
        g12.U();
        List<G> list = d12.f407547a;
        list.contains(g12);
        List<G> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((G) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((G) it2.next()).f407557i);
        }
        return new C42869m(arrayList, "CompositeProvider@ModuleDescriptor for " + g12.getName());
    }
}
