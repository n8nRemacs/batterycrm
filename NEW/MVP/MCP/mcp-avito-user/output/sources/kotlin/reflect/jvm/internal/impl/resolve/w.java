package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.utils.g;

/* compiled from: overridingUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class w {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    public static final class a<H> extends N implements Y41.l<H, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.utils.g<H> f409711l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.reflect.jvm.internal.impl.utils.g<H> gVar) {
            super(1);
            this.f409711l = gVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            this.f409711l.add(obj);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <H> Collection<H> a(@Y61.k Collection<? extends H> collection, @Y61.k Y41.l<? super H, ? extends InterfaceC42848a> lVar) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
        kotlin.reflect.jvm.internal.impl.utils.g gVarA = g.b.a();
        while (!linkedList.isEmpty()) {
            Object objE = C42745f0.E(linkedList);
            kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
            kotlin.reflect.jvm.internal.impl.utils.g gVarA2 = g.b.a();
            ArrayList arrayListG = OverridingUtil.g(objE, linkedList, lVar, new a(gVarA2));
            if (arrayListG.size() == 1 && gVarA2.isEmpty()) {
                gVarA.add(C42745f0.t0(arrayListG));
            } else {
                A00.b bVar = (Object) OverridingUtil.s(arrayListG, lVar);
                InterfaceC42848a interfaceC42848aInvoke = lVar.invoke(bVar);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    A00.b bVar2 = (Object) it.next();
                    if (!OverridingUtil.k(interfaceC42848aInvoke, lVar.invoke(bVar2))) {
                        gVarA2.add(bVar2);
                    }
                }
                if (!gVarA2.isEmpty()) {
                    gVarA.addAll(gVarA2);
                }
                gVarA.add(bVar);
            }
        }
        return gVarA;
    }
}
