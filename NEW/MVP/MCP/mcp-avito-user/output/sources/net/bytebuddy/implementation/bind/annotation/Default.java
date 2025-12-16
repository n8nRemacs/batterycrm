package net.bytebuddy.implementation.bind.annotation;

import com.yandex.div2.D8;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: proxyType */
/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Default {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<Default> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417668b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417669c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417670d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417671e;

        public interface TypeLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForParameterType implements TypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final ForParameterType f417672b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForParameterType[] f417673c;

                static {
                    ForParameterType forParameterType = new ForParameterType("INSTANCE", 0);
                    f417672b = forParameterType;
                    f417673c = new ForParameterType[]{forParameterType};
                }

                public ForParameterType() {
                    throw null;
                }

                public static ForParameterType valueOf(String str) {
                    return (ForParameterType) Enum.valueOf(ForParameterType.class, str);
                }

                public static ForParameterType[] values() {
                    return (ForParameterType[]) f417673c.clone();
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public final TypeDescription a(TypeDescription.Generic generic) {
                    return generic.f5();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements TypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417674b;

                public a(TypeDescription typeDescription) {
                    this.f417674b = typeDescription;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public final TypeDescription a(TypeDescription.Generic generic) {
                    TypeDescription typeDescriptionF5 = generic.f5();
                    TypeDescription typeDescription = this.f417674b;
                    if (typeDescription.m5(typeDescriptionF5)) {
                        return typeDescription;
                    }
                    throw new IllegalStateException("Impossible to assign " + typeDescription + " to parameter of type " + generic);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417674b.equals(((a) obj).f417674b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417674b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            TypeDescription a(TypeDescription.Generic generic);
        }

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417668b = binder;
            f417671e = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(Default.class).q();
            f417669c = (a.d) bVarQ.P1(C44411u.x("serializableProxy")).M2();
            f417670d = (a.d) bVarQ.P1(C44411u.x("proxyType")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417671e.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            TypeLocator aVar2;
            TypeDescription typeDescription = (TypeDescription) gVar.d(f417670d).b(TypeDescription.class);
            if (typeDescription.Q2(Void.TYPE)) {
                aVar2 = TypeLocator.ForParameterType.f417672b;
            } else {
                if (!typeDescription.E()) {
                    throw new IllegalStateException(D8.o("Cannot assign proxy to ", typeDescription));
                }
                aVar2 = new TypeLocator.a(typeDescription);
            }
            TypeDescription typeDescriptionA = aVar2.a(cVar.getType());
            if (typeDescriptionA.E()) {
                return (aVar.b() || !target.a().J0().f1().contains(typeDescriptionA)) ? MethodDelegationBinder.ParameterBinding.Illegal.f417632b : new MethodDelegationBinder.ParameterBinding.a(new TypeProxy.b(typeDescriptionA, target, ((Boolean) gVar.d(f417669c).b(Boolean.class)).booleanValue()));
            }
            throw new IllegalStateException(cVar + " uses the @Default annotation on an invalid type");
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Default> b() {
            return Default.class;
        }
    }
}
