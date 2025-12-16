package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: IntersectionType.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class D extends G implements Y41.p<O, O, Boolean> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(q.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // Y41.p
    public final Boolean invoke(O o12, O o13) {
        return Boolean.valueOf(((q) this.receiver).b(o12, o13));
    }
}
