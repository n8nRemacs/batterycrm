package net.bytebuddy.implementation.bytecode.constant;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum ClassConstant implements StackManipulation {
    VOID(Void.class),
    BOOLEAN(Boolean.class),
    BYTE(Byte.class),
    SHORT(Short.class),
    CHARACTER(Character.class),
    INTEGER(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class);


    /* renamed from: l, reason: collision with root package name */
    public static final StackManipulation.d f417969l = StackSize.SINGLE.c();

    /* renamed from: b, reason: collision with root package name */
    public final String f417971b;

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f417972b;

        public a(TypeDescription typeDescription) {
            this.f417972b = typeDescription;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417972b.equals(((a) obj).f417972b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417972b.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            boolean zC2 = context.b().c(ClassFileVersion.f415295g);
            TypeDescription typeDescription = this.f417972b;
            if (zC2 && typeDescription.o0(context.a())) {
                sVar.t(B.v(typeDescription.getDescriptor()));
            } else {
                sVar.t(typeDescription.getName());
                sVar.A("java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", 184, false);
            }
            return ClassConstant.f417969l;
        }
    }

    ClassConstant(Class cls) {
        this.f417971b = B.l(cls);
    }

    public static StackManipulation c(TypeDescription typeDescription) {
        return !typeDescription.w5() ? new a(typeDescription) : typeDescription.Q2(Boolean.TYPE) ? BOOLEAN : typeDescription.Q2(Byte.TYPE) ? BYTE : typeDescription.Q2(Short.TYPE) ? SHORT : typeDescription.Q2(Character.TYPE) ? CHARACTER : typeDescription.Q2(Integer.TYPE) ? INTEGER : typeDescription.Q2(Long.TYPE) ? LONG : typeDescription.Q2(Float.TYPE) ? FLOAT : typeDescription.Q2(Double.TYPE) ? DOUBLE : VOID;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.j(178, this.f417971b, CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/Class;");
        return f417969l;
    }
}
