package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* compiled from: TypeCreation.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class b extends StackManipulation.a {

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f417928b;

    public b(TypeDescription typeDescription) {
        this.f417928b = typeDescription;
    }

    public static b g(TypeDescription typeDescription) {
        if (!typeDescription.w2() && !typeDescription.w5() && !typeDescription.isAbstract()) {
            return new b(typeDescription);
        }
        throw new IllegalArgumentException(typeDescription + " is not instantiable");
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417928b.equals(((b) obj).f417928b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f417928b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.I(187, this.f417928b.V());
        return new StackManipulation.d(1, 1);
    }
}
