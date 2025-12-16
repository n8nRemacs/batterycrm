package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes8.dex */
public final class y extends AbstractC42894f implements k51.m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Enum<?> f407876c;

    public y(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Enum<?> r32) {
        super(fVar, null);
        this.f407876c = r32;
    }

    @Override // k51.m
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        Class<?> enclosingClass = this.f407876c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        return C42892d.a(enclosingClass);
    }

    @Override // k51.m
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.f e() {
        return kotlin.reflect.jvm.internal.impl.name.f.e(this.f407876c.name());
    }
}
