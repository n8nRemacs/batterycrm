package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import k51.InterfaceC42516a;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes8.dex */
public final class F extends H implements k51.v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Class<?> f407824b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C42784z0 f407825c = C42784z0.f406748b;

    public F(@Y61.k Class<?> cls) {
        this.f407824b = cls;
    }

    @Override // k51.InterfaceC42519d
    @Y61.k
    public final Collection<InterfaceC42516a> getAnnotations() {
        return this.f407825c;
    }

    @Override // k51.v
    @Y61.l
    public final PrimitiveType getType() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f407824b;
        if (L.f(cls2, cls)) {
            return null;
        }
        return JvmPrimitiveType.b(cls2.getName()).d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H
    public final Type p() {
        return this.f407824b;
    }
}
