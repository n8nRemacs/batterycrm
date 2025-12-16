package net.bytebuddy.implementation.bytecode.assign.primitive;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.a;
import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;
import net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner;

/* compiled from: PrimitiveTypeAwareAssigner.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class a implements Assigner {
    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        PrimitiveBoxingDelegate primitiveBoxingDelegate;
        if (generic.w5() && generic2.w5()) {
            return PrimitiveWideningDelegate.a(generic).b(generic2);
        }
        boolean zW5 = generic.w5();
        ReferenceTypeAwareAssigner referenceTypeAwareAssigner = ReferenceTypeAwareAssigner.f417926b;
        if (!zW5) {
            if (!generic2.w5()) {
                return referenceTypeAwareAssigner.a(generic, generic2, typing);
            }
            PrimitiveUnboxingDelegate primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417875g;
            if (!generic.w5()) {
                return (generic.Q2(Boolean.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.BOOLEAN : generic.Q2(Byte.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.BYTE : generic.Q2(Short.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.SHORT : generic.Q2(Character.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.CHARACTER : generic.Q2(Integer.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.INTEGER : generic.Q2(Long.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.LONG : generic.Q2(Float.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.FLOAT : generic.Q2(Double.class) ? PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.DOUBLE : new PrimitiveUnboxingDelegate.a(generic.P0())).a(generic2, typing);
            }
            throw new IllegalArgumentException("Expected reference type instead of " + generic);
        }
        PrimitiveBoxingDelegate primitiveBoxingDelegate2 = PrimitiveBoxingDelegate.f417860f;
        if (generic.Q2(Boolean.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417860f;
        } else if (generic.Q2(Byte.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417861g;
        } else if (generic.Q2(Short.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417862h;
        } else if (generic.Q2(Character.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417863i;
        } else if (generic.Q2(Integer.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417864j;
        } else if (generic.Q2(Long.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417865k;
        } else if (generic.Q2(Float.TYPE)) {
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417866l;
        } else {
            if (!generic.Q2(Double.TYPE)) {
                throw new IllegalArgumentException("Not a non-void, primitive type: " + generic);
            }
            primitiveBoxingDelegate = PrimitiveBoxingDelegate.f417867m;
        }
        return primitiveBoxingDelegate.new a(referenceTypeAwareAssigner.a(primitiveBoxingDelegate.f417869b.P0(), generic2, typing));
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = ReferenceTypeAwareAssigner.f417926b;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ReferenceTypeAwareAssigner.f417926b.hashCode() + (getClass().hashCode() * 31);
    }
}
