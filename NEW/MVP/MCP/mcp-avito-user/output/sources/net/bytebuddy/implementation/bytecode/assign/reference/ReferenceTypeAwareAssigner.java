package net.bytebuddy.implementation.bytecode.assign.reference;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ReferenceTypeAwareAssigner implements Assigner {

    /* renamed from: b, reason: collision with root package name */
    public static final ReferenceTypeAwareAssigner f417926b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ReferenceTypeAwareAssigner[] f417927c;

    static {
        ReferenceTypeAwareAssigner referenceTypeAwareAssigner = new ReferenceTypeAwareAssigner("INSTANCE", 0);
        f417926b = referenceTypeAwareAssigner;
        f417927c = new ReferenceTypeAwareAssigner[]{referenceTypeAwareAssigner};
    }

    public ReferenceTypeAwareAssigner() {
        throw null;
    }

    public static ReferenceTypeAwareAssigner valueOf(String str) {
        return (ReferenceTypeAwareAssigner) Enum.valueOf(ReferenceTypeAwareAssigner.class, str);
    }

    public static ReferenceTypeAwareAssigner[] values() {
        return (ReferenceTypeAwareAssigner[]) f417927c.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        boolean zW5 = generic.w5();
        StackManipulation.Illegal illegal = StackManipulation.Illegal.f417827b;
        StackManipulation.Trivial trivial = StackManipulation.Trivial.f417829b;
        return (zW5 || generic2.w5()) ? generic.equals(generic2) ? trivial : illegal : generic.f5().m5(generic2.f5()) ? trivial : typing.f417857b ? b.g(generic2) : illegal;
    }
}
