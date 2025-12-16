package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Callable;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: nullIfImpossible */
/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
/* JADX WARN: Method from annotation default annotation not found: targetType */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface DefaultCall {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<DefaultCall> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417675b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417676c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417677d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417678e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417679f;

        public interface DefaultMethodLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Implicit implements DefaultMethodLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final Implicit f417680b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Implicit[] f417681c;

                static {
                    Implicit implicit = new Implicit("INSTANCE", 0);
                    f417680b = implicit;
                    f417681c = new Implicit[]{implicit};
                }

                public Implicit() {
                    throw null;
                }

                public static Implicit valueOf(String str) {
                    return (Implicit) Enum.valueOf(Implicit.class, str);
                }

                public static Implicit[] values() {
                    return (Implicit[]) f417681c.clone();
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator
                public final Implementation.SpecialMethodInvocation a(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                    return target.b(aVar.e());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements DefaultMethodLocator {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417682b;

                public a(TypeDescription typeDescription) {
                    this.f417682b = typeDescription;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator
                public final Implementation.SpecialMethodInvocation a(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                    TypeDescription typeDescription = this.f417682b;
                    if (typeDescription.E()) {
                        return target.d(aVar.e(), typeDescription);
                    }
                    throw new IllegalStateException(aVar + " method carries default method call parameter on non-interface type");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417682b.equals(((a) obj).f417682b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417682b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            Implementation.SpecialMethodInvocation a(net.bytebuddy.description.method.a aVar, Implementation.Target target);
        }

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417675b = binder;
            f417679f = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(DefaultCall.class).q();
            f417676c = (a.d) bVarQ.P1(C44411u.x("targetType")).M2();
            f417677d = (a.d) bVarQ.P1(C44411u.x("serializableProxy")).M2();
            f417678e = (a.d) bVarQ.P1(C44411u.x("nullIfImpossible")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417679f.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            TypeDescription typeDescriptionF5 = cVar.getType().f5();
            if (!typeDescriptionF5.Q2(Runnable.class) && !typeDescriptionF5.Q2(Callable.class) && !typeDescriptionF5.Q2(Object.class)) {
                throw new IllegalStateException("A default method call proxy can only be assigned to Runnable or Callable types: " + cVar);
            }
            boolean zV02 = aVar.v0();
            MethodDelegationBinder.ParameterBinding.Illegal illegal = MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
            StackManipulation bVar2 = NullConstant.f418029b;
            a.d dVar = f417678e;
            if (zV02) {
                return ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.a(bVar2) : illegal;
            }
            TypeDescription typeDescription = (TypeDescription) gVar.d(f417676c).b(TypeDescription.class);
            Implementation.SpecialMethodInvocation specialMethodInvocationE = (typeDescription.Q2(Void.TYPE) ? DefaultMethodLocator.Implicit.f417680b : new DefaultMethodLocator.a(typeDescription)).a(aVar, target).e(aVar.f0());
            if (specialMethodInvocationE.isValid()) {
                bVar2 = new MethodCallProxy.b(specialMethodInvocationE, ((Boolean) gVar.d(f417677d).b(Boolean.class)).booleanValue());
            } else if (!((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue()) {
                return illegal;
            }
            return new MethodDelegationBinder.ParameterBinding.a(bVar2);
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<DefaultCall> b() {
            return DefaultCall.class;
        }
    }
}
