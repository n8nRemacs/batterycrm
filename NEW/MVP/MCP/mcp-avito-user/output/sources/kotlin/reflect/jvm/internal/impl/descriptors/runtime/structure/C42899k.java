package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import k51.InterfaceC42516a;
import k51.InterfaceC42521f;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H;

/* compiled from: ReflectJavaArrayType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42899k extends H implements InterfaceC42521f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f407860b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f407861c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C42784z0 f407862d;

    public C42899k(@Y61.k Type type) {
        H hA2;
        this.f407860b = type;
        boolean z12 = type instanceof GenericArrayType;
        H.a aVar = H.f407827a;
        if (!z12) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    aVar.getClass();
                    hA2 = H.a.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        aVar.getClass();
        hA2 = H.a.a(genericComponentType);
        this.f407861c = hA2;
        this.f407862d = C42784z0.f406748b;
    }

    @Override // k51.InterfaceC42519d
    @Y61.k
    public final Collection<InterfaceC42516a> getAnnotations() {
        return this.f407862d;
    }

    @Override // k51.InterfaceC42521f
    public final H l() {
        return this.f407861c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H
    @Y61.k
    public final Type p() {
        return this.f407860b;
    }
}
