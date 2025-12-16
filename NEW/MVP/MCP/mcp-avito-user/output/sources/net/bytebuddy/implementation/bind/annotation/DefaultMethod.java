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
/* JADX WARN: Method from annotation default annotation not found: nullIfImpossible */
/* JADX WARN: Method from annotation default annotation not found: privileged */
/* JADX WARN: Method from annotation default annotation not found: targetType */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface DefaultMethod {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<DefaultMethod> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417683b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417684c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417685d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417686e;

        /* renamed from: f, reason: collision with root package name */
        public static final a.d f417687f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417688g;

        public interface MethodLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForImplicitType implements MethodLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final ForImplicitType f417689b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForImplicitType[] f417690c;

                static {
                    ForImplicitType forImplicitType = new ForImplicitType("INSTANCE", 0);
                    f417689b = forImplicitType;
                    f417690c = new ForImplicitType[]{forImplicitType};
                }

                public ForImplicitType() {
                    throw null;
                }

                public static ForImplicitType valueOf(String str) {
                    return (ForImplicitType) Enum.valueOf(ForImplicitType.class, str);
                }

                public static ForImplicitType[] values() {
                    return (ForImplicitType[]) f417690c.clone();
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator
                public final Implementation.SpecialMethodInvocation a(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                    return target.b(aVar.e());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements MethodLocator {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417691b;

                public a(TypeDescription typeDescription) {
                    this.f417691b = typeDescription;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator
                public final Implementation.SpecialMethodInvocation a(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                    TypeDescription typeDescription = this.f417691b;
                    if (typeDescription.E()) {
                        return target.d(aVar.e(), net.bytebuddy.dynamic.c.a(typeDescription, target.a()));
                    }
                    throw new IllegalStateException(aVar + " method carries default method call parameter on non-interface type");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417691b.equals(((a) obj).f417691b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417691b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            Implementation.SpecialMethodInvocation a(net.bytebuddy.description.method.a aVar, Implementation.Target target);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements StackManipulation {

            /* renamed from: b, reason: collision with root package name */
            public final Implementation.SpecialMethodInvocation f417692b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f417693c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f417694d;

            public a(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z12, boolean z13) {
                this.f417692b = specialMethodInvocation;
                this.f417693c = z12;
                this.f417694d = z13;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417693c == aVar.f417693c && this.f417694d == aVar.f417694d && this.f417692b.equals(aVar.f417692b);
            }

            public final int hashCode() {
                return ((((this.f417692b.hashCode() + (getClass().hashCode() * 31)) * 31) + (this.f417693c ? 1 : 0)) * 31) + (this.f417694d ? 1 : 0);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return this.f417692b.isValid();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [net.bytebuddy.implementation.bytecode.member.FieldAccess$b$b] */
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                MethodAccessorFactory.AccessType accessType = MethodAccessorFactory.AccessType.PUBLIC;
                Implementation.SpecialMethodInvocation specialMethodInvocation = this.f417692b;
                MethodConstant.c cVarQ = this.f417694d ? MethodConstant.q(context.c(specialMethodInvocation, accessType)) : MethodConstant.p(context.c(specialMethodInvocation, accessType));
                if (this.f417693c) {
                    cVarQ = FieldAccess.b(context.h(cVarQ, TypeDescription.d.A0(Method.class))).new C12105b();
                }
                return cVarQ.n(sVar, context);
            }
        }

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417683b = binder;
            f417688g = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(DefaultMethod.class).q();
            f417684c = (a.d) bVarQ.P1(C44411u.x("cached")).M2();
            f417685d = (a.d) bVarQ.P1(C44411u.x("privileged")).M2();
            f417686e = (a.d) bVarQ.P1(C44411u.x("targetType")).M2();
            f417687f = (a.d) bVarQ.P1(C44411u.x("nullIfImpossible")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417688g.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            if (!cVar.getType().f5().A1(Method.class)) {
                throw new IllegalStateException("Cannot assign Method type to " + cVar);
            }
            boolean zC2 = aVar.C();
            MethodDelegationBinder.ParameterBinding.Illegal illegal = MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
            NullConstant nullConstant = NullConstant.f418029b;
            a.d dVar = f417687f;
            if (!zC2) {
                return ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.a(nullConstant) : illegal;
            }
            TypeDescription typeDescription = (TypeDescription) gVar.d(f417686e).b(TypeDescription.class);
            Implementation.SpecialMethodInvocation specialMethodInvocationE = (typeDescription.Q2(Void.TYPE) ? MethodLocator.ForImplicitType.f417689b : new MethodLocator.a(typeDescription)).a(aVar, target).e(aVar.f0());
            return specialMethodInvocationE.isValid() ? new MethodDelegationBinder.ParameterBinding.a(new a(specialMethodInvocationE, ((Boolean) gVar.d(f417684c).b(Boolean.class)).booleanValue(), ((Boolean) gVar.d(f417685d).b(Boolean.class)).booleanValue())) : ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.a(nullConstant) : illegal;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<DefaultMethod> b() {
            return DefaultMethod.class;
        }
    }
}
