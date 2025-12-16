package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes8.dex */
final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f408330a = new e();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        InterfaceC42851d interfaceC42851dD = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d(this);
        if (interfaceC42851dD == null) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42851dD)) {
            interfaceC42851dD = null;
        }
        if (interfaceC42851dD != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(interfaceC42851dD);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final b0 e() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final O getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Y61.k
    public final String toString() {
        return "[EnhancedType]";
    }
}
