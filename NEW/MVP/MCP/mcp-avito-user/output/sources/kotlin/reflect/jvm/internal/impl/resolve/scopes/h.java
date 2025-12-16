package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;

/* compiled from: InnerClassesScopeWrapper.kt */
@s0
/* loaded from: classes8.dex */
public final class h extends k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f409680b;

    public h(@Y61.k j jVar) {
        this.f409680b = jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        return this.f409680b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f409680b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f409680b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    public final Collection e(d dVar, Y41.l lVar) {
        Collection collection;
        d.f409654c.getClass();
        int i12 = d.f409662k & dVar.f409671b;
        d dVar2 = i12 == 0 ? null : new d(i12, dVar.f409670a);
        if (dVar2 == null) {
            collection = C42784z0.f406748b;
        } else {
            Collection<InterfaceC42882k> collectionE = this.f409680b.e(dVar2, lVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionE) {
                if (obj instanceof InterfaceC42854g) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        InterfaceC42853f interfaceC42853fG = this.f409680b.g(fVar, interfaceC41228b);
        if (interfaceC42853fG == null) {
            return null;
        }
        InterfaceC42851d interfaceC42851d = interfaceC42853fG instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fG : null;
        if (interfaceC42851d != null) {
            return interfaceC42851d;
        }
        if (interfaceC42853fG instanceof f0) {
            return (f0) interfaceC42853fG;
        }
        return null;
    }

    @Y61.k
    public final String toString() {
        return "Classes from " + this.f409680b;
    }
}
