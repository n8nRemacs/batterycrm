package net.bytebuddy.implementation.bytecode.assign.primitive;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;

/* compiled from: VoidAwareAssigner.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class b implements Assigner {

    /* renamed from: b, reason: collision with root package name */
    public final a f417919b;

    public b(a aVar) {
        this.f417919b = aVar;
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        Class cls = Void.TYPE;
        return (generic.Q2(cls) && generic2.Q2(cls)) ? StackManipulation.Trivial.f417829b : generic.Q2(cls) ? typing.f417857b ? DefaultValue.c(generic2) : StackManipulation.Illegal.f417827b : generic2.Q2(cls) ? Removal.c(generic) : this.f417919b.a(generic, generic2, typing);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417919b.equals(((b) obj).f417919b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f417919b.hashCode() + (getClass().hashCode() * 31);
    }
}
