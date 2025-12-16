package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public final class n extends q<Integer> {
    public n(int i12) {
        super(Integer.valueOf(i12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public final O a(E e12) {
        kotlin.reflect.jvm.internal.impl.builtins.k kVarM = e12.m();
        kVarM.getClass();
        Y yR2 = kVarM.r(PrimitiveType.f407164k);
        if (yR2 != null) {
            return yR2;
        }
        kotlin.reflect.jvm.internal.impl.builtins.k.a(59);
        throw null;
    }
}
