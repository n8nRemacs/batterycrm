package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum DefaultValue implements StackManipulation {
    INTEGER(IntegerConstant.ZERO),
    LONG(LongConstant.ZERO),
    FLOAT(FloatConstant.ZERO),
    DOUBLE(DoubleConstant.ZERO),
    VOID(StackManipulation.Trivial.f417829b),
    REFERENCE(NullConstant.f418029b);


    /* renamed from: b, reason: collision with root package name */
    public final Enum f417980b;

    /* JADX WARN: Multi-variable type inference failed */
    DefaultValue(StackManipulation stackManipulation) {
        this.f417980b = (Enum) stackManipulation;
    }

    public static DefaultValue c(TypeDefinition typeDefinition) {
        return typeDefinition.w5() ? typeDefinition.Q2(Long.TYPE) ? LONG : typeDefinition.Q2(Double.TYPE) ? DOUBLE : typeDefinition.Q2(Float.TYPE) ? FLOAT : typeDefinition.Q2(Void.TYPE) ? VOID : INTEGER : REFERENCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return this.f417980b.isValid();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        return this.f417980b.n(sVar, context);
    }
}
