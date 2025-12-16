package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;

/* compiled from: SubpackagesScope.kt */
/* loaded from: classes8.dex */
public class Q extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.E f407617b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f407618c;

    public Q(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        this.f407617b = e12;
        this.f407618c = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409658g)) {
            return C42784z0.f406748b;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = this.f407618c;
        if (cVar.d()) {
            if (dVar.f409670a.contains(c.b.f409653a)) {
                return C42784z0.f406748b;
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.E e12 = this.f407617b;
        Collection<kotlin.reflect.jvm.internal.impl.name.c> collectionJ = e12.j(cVar, lVar);
        ArrayList arrayList = new ArrayList(collectionJ.size());
        Iterator<kotlin.reflect.jvm.internal.impl.name.c> it = collectionJ.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.f fVarF = it.next().f();
            if (lVar.invoke(fVarF).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.descriptors.P p12 = null;
                if (!fVarF.f409253c) {
                    kotlin.reflect.jvm.internal.impl.descriptors.P pI02 = e12.i0(cVar.c(fVarF));
                    if (!pI02.isEmpty()) {
                        p12 = pI02;
                    }
                }
                kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, p12);
            }
        }
        return arrayList;
    }

    @Y61.k
    public final String toString() {
        return "subpackages of " + this.f407618c + " from " + this.f407617b;
    }
}
