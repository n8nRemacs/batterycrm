package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: PackageFragmentProviderImpl.kt */
@s0
/* loaded from: classes8.dex */
public final class M implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f407435a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K, kotlin.reflect.jvm.internal.impl.name.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407436l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.reflect.jvm.internal.impl.name.c invoke(K k12) {
            return k12.d();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c f407437l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(1);
            this.f407437l = cVar;
        }

        @Override // Y41.l
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = cVar;
            return Boolean.valueOf(!cVar2.d() && kotlin.jvm.internal.L.f(cVar2.e(), this.f407437l));
        }
    }

    public M(@Y61.k ArrayList arrayList) {
        this.f407435a = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    @InterfaceC42830m
    public final List<K> a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        ArrayList arrayList = this.f407435a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (kotlin.jvm.internal.L.f(((K) obj).d(), cVar)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final boolean b(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        ArrayList arrayList = this.f407435a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.L.f(((K) it.next()).d(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final void c(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k ArrayList arrayList) {
        for (Object obj : this.f407435a) {
            if (kotlin.jvm.internal.L.f(((K) obj).d(), cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.name.c> j(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return C43033p.D(C43033p.i(new kotlin.sequences.o0(new C42770s0(this.f407435a), a.f407436l), new b(cVar)));
    }
}
