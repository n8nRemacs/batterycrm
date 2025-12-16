package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.checker.p;

/* compiled from: IntersectionType.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class C extends G implements Y41.p<O, O, Boolean> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(A.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // Y41.p
    public final Boolean invoke(O o12, O o13) {
        O o14 = o12;
        O o15 = o13;
        A a12 = (A) this.receiver;
        A a13 = A.f410087a;
        a12.getClass();
        p.f410117b.getClass();
        q qVar = p.a.f410119b;
        return Boolean.valueOf(qVar.d(o14, o15) && !qVar.d(o15, o14));
    }
}
