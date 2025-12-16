package net.bytebuddy.asm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.pool.TypePool;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class TypeConstantAdjustment implements AsmVisitorWrapper {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TypeConstantAdjustment[] f415910b = {new TypeConstantAdjustment("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    TypeConstantAdjustment EF5;

    public static class a extends f {

        /* renamed from: d, reason: collision with root package name */
        public boolean f415911d;

        /* renamed from: net.bytebuddy.asm.TypeConstantAdjustment$a$a, reason: collision with other inner class name */
        public static class C11947a extends s {
            @Override // net.bytebuddy.jar.asm.s
            @SuppressFBWarnings(justification = "Fall through to default case is intentional.", value = {"SF_SWITCH_NO_DEFAULT"})
            public final void t(Object obj) {
                B b12;
                int iT2;
                if (!(obj instanceof B) || ((iT2 = (b12 = (B) obj).t()) != 9 && iT2 != 10)) {
                    super.t(obj);
                } else {
                    super.t(b12.k().replace('/', '.'));
                    A("java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", 184, false);
                }
            }
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void c(int i12, int i13, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            this.f415911d = ClassFileVersion.f(i12).c(ClassFileVersion.f415295g);
            super.c(i12, i13, str, str2, str3, strArr);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            s sVarI = super.i(i12, str, str2, str3, strArr);
            return (this.f415911d || sVarI == null) ? sVarI : new C11947a(net.bytebuddy.utility.e.f418981b, sVarI);
        }
    }

    public TypeConstantAdjustment() {
        throw null;
    }

    public static TypeConstantAdjustment valueOf(String str) {
        return (TypeConstantAdjustment) Enum.valueOf(TypeConstantAdjustment.class, str);
    }

    public static TypeConstantAdjustment[] values() {
        return (TypeConstantAdjustment[]) f415910b.clone();
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
        return new a(net.bytebuddy.utility.e.f418981b, fVar);
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public final int a(int i12) {
        return i12;
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public final int c(int i12) {
        return i12;
    }
}
