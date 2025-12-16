package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CompositePackageFragmentProvider.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42869m implements kotlin.reflect.jvm.internal.impl.descriptors.O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.L> f407682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f407683b;

    /* JADX WARN: Multi-variable type inference failed */
    public C42869m(@Y61.k List<? extends kotlin.reflect.jvm.internal.impl.descriptors.L> list, @Y61.k String str) {
        this.f407682a = list;
        this.f407683b = str;
        list.size();
        C42745f0.P0(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    @InterfaceC42830m
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.K> a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.L> it = this.f407682a.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.N.a(it.next(), cVar, arrayList);
        }
        return C42745f0.M0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final boolean b(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.L> list = this.f407682a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!kotlin.reflect.jvm.internal.impl.descriptors.N.b((kotlin.reflect.jvm.internal.impl.descriptors.L) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final void c(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k ArrayList arrayList) {
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.L> it = this.f407682a.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.N.a(it.next(), cVar, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.name.c> j(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.L> it = this.f407682a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().j(cVar, lVar));
        }
        return hashSet;
    }

    @Y61.k
    public final String toString() {
        return this.f407683b;
    }
}
