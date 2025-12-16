package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.MethodConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: cached */
/* JADX WARN: Method from annotation default annotation not found: fallbackToDefault */
/* JADX WARN: Method from annotation default annotation not found: nullIfImpossible */
/* JADX WARN: Method from annotation default annotation not found: privileged */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface SuperMethod {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<SuperMethod> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417758b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417759c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417760d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417761e;

        /* renamed from: f, reason: collision with root package name */
        public static final a.d f417762f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417763g;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements StackManipulation {

            /* renamed from: b, reason: collision with root package name */
            public final Implementation.SpecialMethodInvocation f417764b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f417765c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f417766d;

            public a(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z12, boolean z13) {
                this.f417764b = specialMethodInvocation;
                this.f417765c = z12;
                this.f417766d = z13;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417765c == aVar.f417765c && this.f417766d == aVar.f417766d && this.f417764b.equals(aVar.f417764b);
            }

            public final int hashCode() {
                return ((((this.f417764b.hashCode() + (getClass().hashCode() * 31)) * 31) + (this.f417765c ? 1 : 0)) * 31) + (this.f417766d ? 1 : 0);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return this.f417764b.isValid();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [net.bytebuddy.implementation.bytecode.member.FieldAccess$b$b] */
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                MethodAccessorFactory.AccessType accessType = MethodAccessorFactory.AccessType.PUBLIC;
                Implementation.SpecialMethodInvocation specialMethodInvocation = this.f417764b;
                MethodConstant.c cVarQ = this.f417766d ? MethodConstant.q(context.c(specialMethodInvocation, accessType)) : MethodConstant.p(context.c(specialMethodInvocation, accessType));
                if (this.f417765c) {
                    cVarQ = FieldAccess.b(context.h(cVarQ, TypeDescription.d.A0(Method.class))).new C12105b();
                }
                return cVarQ.n(sVar, context);
            }
        }

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417758b = binder;
            f417763g = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(SuperMethod.class).q();
            f417759c = (a.d) bVarQ.P1(C44411u.x("cached")).M2();
            f417760d = (a.d) bVarQ.P1(C44411u.x("privileged")).M2();
            f417761e = (a.d) bVarQ.P1(C44411u.x("fallbackToDefault")).M2();
            f417762f = (a.d) bVarQ.P1(C44411u.x("nullIfImpossible")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417763g.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            if (!cVar.getType().f5().A1(Method.class)) {
                throw new IllegalStateException("Cannot assign Method type to " + cVar);
            }
            boolean zC2 = aVar.C();
            MethodDelegationBinder.ParameterBinding.Illegal illegal = MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
            NullConstant nullConstant = NullConstant.f418029b;
            a.d dVar = f417762f;
            if (!zC2) {
                return ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.a(nullConstant) : illegal;
            }
            Implementation.SpecialMethodInvocation specialMethodInvocationE = (((Boolean) gVar.d(f417761e).b(Boolean.class)).booleanValue() ? target.e(aVar.e()) : target.c(aVar.e())).e(aVar.f0());
            return specialMethodInvocationE.isValid() ? new MethodDelegationBinder.ParameterBinding.a(new a(specialMethodInvocationE, ((Boolean) gVar.d(f417759c).b(Boolean.class)).booleanValue(), ((Boolean) gVar.d(f417760d).b(Boolean.class)).booleanValue())) : ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.a(nullConstant) : illegal;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<SuperMethod> b() {
            return SuperMethod.class;
        }
    }
}
