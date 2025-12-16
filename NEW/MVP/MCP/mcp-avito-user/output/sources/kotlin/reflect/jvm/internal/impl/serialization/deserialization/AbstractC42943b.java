package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42943b implements kotlin.reflect.jvm.internal.impl.descriptors.O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.f f409774a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g f409775b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.G f409776c;

    /* renamed from: d, reason: collision with root package name */
    public C42954k f409777d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.K> f409778e;

    public AbstractC42943b(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.G g12) {
        this.f409774a = fVar;
        this.f409775b = gVar;
        this.f409776c = g12;
        this.f409778e = fVar.b(new C42942a(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    @InterfaceC42830m
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.K> a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return C42745f0.V(this.f409778e.invoke(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final boolean b(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.K> jVar = this.f409778e;
        return (jVar.h(cVar) ? (kotlin.reflect.jvm.internal.impl.descriptors.K) jVar.invoke(cVar) : d(cVar)) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final void c(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k ArrayList arrayList) {
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, this.f409778e.invoke(cVar));
    }

    @Y61.l
    public abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d d(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.name.c> j(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return B0.f406639b;
    }
}
