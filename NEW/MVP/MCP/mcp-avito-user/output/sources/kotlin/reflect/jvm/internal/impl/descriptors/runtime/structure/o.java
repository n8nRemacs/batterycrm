package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.internal.m0;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class o extends kotlin.jvm.internal.G implements Y41.l<Field, z> {

    /* renamed from: b, reason: collision with root package name */
    public static final o f407866b = new o();

    public o() {
        super(1);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(z.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // Y41.l
    public final z invoke(Field field) {
        return new z(field);
    }
}
