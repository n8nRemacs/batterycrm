package net.bytebuddy.implementation.bytecode.assign;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* compiled from: InstanceCheck.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class a extends StackManipulation.a {

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f417858b;

    public a(TypeDescription typeDescription) {
        this.f417858b = typeDescription;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417858b.equals(((a) obj).f417858b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f417858b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.I(193, this.f417858b.V());
        return StackManipulation.d.f417832c;
    }
}
