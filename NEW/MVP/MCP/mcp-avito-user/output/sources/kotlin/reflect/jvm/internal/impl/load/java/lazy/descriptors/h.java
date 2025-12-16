package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class h extends G implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(l.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // Y41.l
    public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return l.u((l) this.receiver, fVar);
    }
}
