package net.bytebuddy.implementation.bind;

import com.yandex.div2.D8;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.utility.nullability.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ArgumentTypeResolver implements MethodDelegationBinder.AmbiguityResolver {

    /* renamed from: b, reason: collision with root package name */
    public static final ArgumentTypeResolver f417589b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ArgumentTypeResolver[] f417590c;

    public enum PrimitiveTypePrecedence {
        BOOLEAN(0),
        BYTE(1),
        SHORT(2),
        INTEGER(3),
        CHARACTER(4),
        LONG(5),
        FLOAT(6),
        DOUBLE(7);


        /* renamed from: b, reason: collision with root package name */
        public final int f417600b;

        PrimitiveTypePrecedence(int i12) {
            this.f417600b = i12;
        }

        public static PrimitiveTypePrecedence a(TypeDescription typeDescription) {
            if (typeDescription.Q2(Boolean.TYPE)) {
                return BOOLEAN;
            }
            if (typeDescription.Q2(Byte.TYPE)) {
                return BYTE;
            }
            if (typeDescription.Q2(Short.TYPE)) {
                return SHORT;
            }
            if (typeDescription.Q2(Integer.TYPE)) {
                return INTEGER;
            }
            if (typeDescription.Q2(Character.TYPE)) {
                return CHARACTER;
            }
            if (typeDescription.Q2(Long.TYPE)) {
                return LONG;
            }
            if (typeDescription.Q2(Float.TYPE)) {
                return FLOAT;
            }
            if (typeDescription.Q2(Double.TYPE)) {
                return DOUBLE;
            }
            throw new IllegalArgumentException(D8.o("Not a non-void, primitive type ", typeDescription));
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f417601a;

        public a(int i12) {
            this.f417601a = i12;
        }

        public final boolean equals(@b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417601a == ((a) obj).f417601a;
        }

        public final int hashCode() {
            return this.f417601a;
        }
    }

    static {
        ArgumentTypeResolver argumentTypeResolver = new ArgumentTypeResolver("INSTANCE", 0);
        f417589b = argumentTypeResolver;
        f417590c = new ArgumentTypeResolver[]{argumentTypeResolver};
    }

    public ArgumentTypeResolver() {
        throw null;
    }

    public static ArgumentTypeResolver valueOf(String str) {
        return (ArgumentTypeResolver) Enum.valueOf(ArgumentTypeResolver.class, str);
    }

    public static ArgumentTypeResolver[] values() {
        return (ArgumentTypeResolver[]) f417590c.clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution a(net.bytebuddy.description.method.a r13, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r14, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r15) {
        /*
            r12 = this;
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
            net.bytebuddy.description.method.d r13 = r13.getParameters()
            r1 = 0
            r4 = r0
            r2 = r1
            r3 = r2
        La:
            int r5 = r13.size()
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r6 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r7 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r8 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            if (r1 >= r5) goto Lcb
            net.bytebuddy.implementation.bind.ArgumentTypeResolver$a r5 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$a
            r5.<init>(r1)
            java.lang.Integer r9 = r14.l(r5)
            java.lang.Integer r5 = r15.l(r5)
            if (r9 == 0) goto Lbe
            if (r5 == 0) goto Lbe
            java.lang.Object r10 = r13.get(r1)
            net.bytebuddy.description.method.c r10 = (net.bytebuddy.description.method.c) r10
            net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getType()
            net.bytebuddy.description.type.TypeDescription r10 = r10.f5()
            int r9 = r9.intValue()
            int r5 = r5.intValue()
            net.bytebuddy.description.method.a r11 = r14.b()
            net.bytebuddy.description.method.d r11 = r11.getParameters()
            java.lang.Object r9 = r11.get(r9)
            net.bytebuddy.description.method.c r9 = (net.bytebuddy.description.method.c) r9
            net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.getType()
            net.bytebuddy.description.type.TypeDescription r9 = r9.f5()
            net.bytebuddy.description.method.a r11 = r15.b()
            net.bytebuddy.description.method.d r11 = r11.getParameters()
            java.lang.Object r5 = r11.get(r5)
            net.bytebuddy.description.method.c r5 = (net.bytebuddy.description.method.c) r5
            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getType()
            net.bytebuddy.description.type.TypeDescription r5 = r5.f5()
            boolean r11 = r9.equals(r5)
            if (r11 != 0) goto Lb8
            boolean r11 = r9.w5()
            if (r11 == 0) goto L8e
            boolean r11 = r5.w5()
            if (r11 == 0) goto L8e
            net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r6 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.a(r9)
            net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r5 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.a(r5)
            int r5 = r5.f417600b
            int r6 = r6.f417600b
            int r6 = r6 - r5
            if (r6 != 0) goto L8b
            goto Lb8
        L8b:
            if (r6 <= 0) goto Lb6
            goto Lae
        L8e:
            boolean r11 = r9.w5()
            if (r11 == 0) goto L9b
            boolean r5 = r10.w5()
            if (r5 == 0) goto Lae
            goto Lb6
        L9b:
            boolean r11 = r5.w5()
            if (r11 == 0) goto La8
            boolean r5 = r10.w5()
            if (r5 == 0) goto Lb6
            goto Lae
        La8:
            boolean r10 = r9.Z5(r5)
            if (r10 == 0) goto Lb0
        Lae:
            r6 = r7
            goto Lb9
        Lb0:
            boolean r5 = r5.Z5(r9)
            if (r5 == 0) goto Lb9
        Lb6:
            r6 = r8
            goto Lb9
        Lb8:
            r6 = r0
        Lb9:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r4 = r4.a(r6)
            goto Lc7
        Lbe:
            if (r9 == 0) goto Lc3
            int r2 = r2 + 1
            goto Lc7
        Lc3:
            if (r5 == 0) goto Lc7
            int r3 = r3 + 1
        Lc7:
            int r1 = r1 + 1
            goto La
        Lcb:
            if (r4 != r0) goto Ld7
            int r2 = r2 - r3
            if (r2 != 0) goto Ld2
            r4 = r6
            goto Ld7
        Ld2:
            if (r2 <= 0) goto Ld6
            r4 = r8
            goto Ld7
        Ld6:
            r4 = r7
        Ld7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.implementation.bind.ArgumentTypeResolver.a(net.bytebuddy.description.method.a, net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding, net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding):net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution");
    }
}
