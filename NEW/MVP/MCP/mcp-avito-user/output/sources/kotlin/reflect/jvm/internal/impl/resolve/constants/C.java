package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public final class C extends D<Short> {
    public C(short s5) {
        super(Short.valueOf(s5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final O a(@Y61.k E e12) {
        InterfaceC42851d interfaceC42851dA = C42904w.a(e12, n.a.f407364T);
        Y yQ2 = interfaceC42851dA != null ? interfaceC42851dA.q() : null;
        return yQ2 == null ? kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410144A, "UShort") : yQ2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final String toString() {
        return ((Number) this.f409586a).intValue() + ".toUShort()";
    }
}
