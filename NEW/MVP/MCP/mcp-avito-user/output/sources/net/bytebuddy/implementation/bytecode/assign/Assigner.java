package net.bytebuddy.implementation.bytecode.assign;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;

@SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
/* loaded from: classes7.dex */
public interface Assigner {

    /* renamed from: M2, reason: collision with root package name */
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.b f417851M2 = new net.bytebuddy.implementation.bytecode.assign.primitive.b(new net.bytebuddy.implementation.bytecode.assign.primitive.a());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class EqualTypesOnly implements Assigner {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EqualTypesOnly[] f417852b = {new a("GENERIC", 0, null), new b("ERASURE", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        EqualTypesOnly EF7;

        public enum a extends EqualTypesOnly {
            @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
            public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing) {
                return generic.equals(generic2) ? StackManipulation.Trivial.f417829b : StackManipulation.Illegal.f417827b;
            }
        }

        public enum b extends EqualTypesOnly {
            @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
            public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing) {
                return generic.f5().equals(generic2.f5()) ? StackManipulation.Trivial.f417829b : StackManipulation.Illegal.f417827b;
            }
        }

        public EqualTypesOnly() {
            throw null;
        }

        public EqualTypesOnly(String str, int i12, a aVar) {
        }

        public static EqualTypesOnly valueOf(String str) {
            return (EqualTypesOnly) Enum.valueOf(EqualTypesOnly.class, str);
        }

        public static EqualTypesOnly[] values() {
            return (EqualTypesOnly[]) f417852b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Refusing implements Assigner {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Refusing[] f417853b = {new Refusing("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        Refusing EF5;

        public Refusing() {
            throw null;
        }

        public static Refusing valueOf(String str) {
            return (Refusing) Enum.valueOf(Refusing.class, str);
        }

        public static Refusing[] values() {
            return (Refusing[]) f417853b.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
        public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing) {
            return StackManipulation.Illegal.f417827b;
        }
    }

    public enum Typing {
        STATIC(false),
        DYNAMIC(true);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f417857b;

        Typing(boolean z12) {
            this.f417857b = z12;
        }
    }

    StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing);
}
