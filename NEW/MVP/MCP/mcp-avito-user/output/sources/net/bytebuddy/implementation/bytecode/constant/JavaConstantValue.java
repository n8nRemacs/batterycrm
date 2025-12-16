package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.utility.JavaConstant;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class JavaConstantValue extends StackManipulation.a {

    /* renamed from: b, reason: collision with root package name */
    public final JavaConstant f418007b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Visitor implements JavaConstant.Visitor<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Visitor[] f418008b = {new Visitor("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        Visitor EF5;

        public Visitor() {
            throw null;
        }

        public static Visitor valueOf(String str) {
            return (Visitor) Enum.valueOf(Visitor.class, str);
        }

        public static Visitor[] values() {
            return (Visitor[]) f418008b.clone();
        }
    }

    public JavaConstantValue(JavaConstant javaConstant) {
        this.f418007b = javaConstant;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418007b.equals(((JavaConstantValue) obj).f418007b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418007b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        JavaConstant javaConstant = this.f418007b;
        sVar.t(javaConstant.a());
        return javaConstant.t().p().c();
    }
}
