package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public final class e extends q<Character> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public final O a(E e12) {
        kotlin.reflect.jvm.internal.impl.builtins.k kVarM = e12.m();
        kVarM.getClass();
        Y yR2 = kVarM.r(PrimitiveType.f407161h);
        if (yR2 != null) {
            return yR2;
        }
        kotlin.reflect.jvm.internal.impl.builtins.k.a(63);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final String toString() {
        String strValueOf;
        T t12 = this.f409586a;
        Integer numValueOf = Integer.valueOf(((Character) t12).charValue());
        char cCharValue = ((Character) t12).charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            strValueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(cCharValue);
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
