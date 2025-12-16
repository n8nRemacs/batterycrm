package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public final class w extends q<Short> {
    public w(short s5) {
        super(Short.valueOf(s5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public final O a(E e12) {
        kotlin.reflect.jvm.internal.impl.builtins.k kVarM = e12.m();
        kVarM.getClass();
        Y yR2 = kVarM.r(PrimitiveType.f407163j);
        if (yR2 != null) {
            return yR2;
        }
        kotlin.reflect.jvm.internal.impl.builtins.k.a(58);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final String toString() {
        return ((Number) this.f409586a).intValue() + ".toShort()";
    }
}
