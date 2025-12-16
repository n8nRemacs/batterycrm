package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import l51.C43547a;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes8.dex */
public abstract class q extends AbstractC42958o {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43547a f409948i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d f409949j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final H f409950k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public ProtoBuf.g f409951l;

    /* renamed from: m, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w f409952m;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    @s0
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Collection<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            Set setKeySet = q.this.f409950k.f409742d.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                kotlin.reflect.jvm.internal.impl.name.b bVar = (kotlin.reflect.jvm.internal.impl.name.b) obj;
                if (bVar.f409240b.e().d()) {
                    C42952i.f409904c.getClass();
                    if (!C42952i.f409905d.contains(bVar)) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kotlin.reflect.jvm.internal.impl.name.b) it.next()).i());
            }
            return arrayList2;
        }
    }

    public q(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12, @Y61.k ProtoBuf.g gVar, @Y61.k C43547a c43547a) {
        super(cVar, pVar, e12);
        this.f409948i = c43547a;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.d(gVar.f408973e, gVar.f408974f);
        this.f409949j = dVar;
        this.f409950k = new H(gVar, dVar, c43547a, new p(this));
        this.f409951l = gVar;
    }

    public final void F0(@Y61.k C42954k c42954k) {
        ProtoBuf.g gVar = this.f409951l;
        if (gVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f409951l = null;
        this.f409952m = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w(this, gVar.f408975g, this.f409949j, this.f409948i, null, c42954k, "scope of " + this, new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.K
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w wVar = this.f409952m;
        if (wVar == null) {
            return null;
        }
        return wVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC42958o
    public final H n0() {
        return this.f409950k;
    }
}
