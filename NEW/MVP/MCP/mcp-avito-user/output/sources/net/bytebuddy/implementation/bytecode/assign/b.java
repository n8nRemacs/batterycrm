package net.bytebuddy.implementation.bytecode.assign;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* compiled from: TypeCasting.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class b extends StackManipulation.a {

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f417859b;

    public b(TypeDescription typeDescription) {
        this.f417859b = typeDescription;
    }

    public static b g(TypeDefinition typeDefinition) {
        if (!typeDefinition.w5()) {
            return new b(typeDefinition.f5());
        }
        throw new IllegalArgumentException("Cannot cast to primitive type: " + typeDefinition);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417859b.equals(((b) obj).f417859b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f417859b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.I(192, this.f417859b.V());
        return StackSize.ZERO.c();
    }
}
