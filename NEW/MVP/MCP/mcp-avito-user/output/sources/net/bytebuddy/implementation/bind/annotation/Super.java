package net.bytebuddy.implementation.bind.annotation;

import com.yandex.div2.D8;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: constructorParameters */
/* JADX WARN: Method from annotation default annotation not found: ignoreFinalizer */
/* JADX WARN: Method from annotation default annotation not found: proxyType */
/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
/* JADX WARN: Method from annotation default annotation not found: strategy */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Super {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Instantiation {

        /* renamed from: b, reason: collision with root package name */
        public static final Instantiation f417748b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417749c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417750d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417751e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Instantiation[] f417752f;

        public enum a extends Instantiation {
            @Override // net.bytebuddy.implementation.bind.annotation.Super.Instantiation
            public final StackManipulation a(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.g<Super> gVar) {
                return new TypeProxy.c(typeDescription, target, Arrays.asList((Object[]) gVar.d(Instantiation.f417751e).b(TypeDescription[].class)), ((Boolean) gVar.d(Instantiation.f417749c).b(Boolean.class)).booleanValue(), ((Boolean) gVar.d(Instantiation.f417750d).b(Boolean.class)).booleanValue());
            }
        }

        public enum b extends Instantiation {
            @Override // net.bytebuddy.implementation.bind.annotation.Super.Instantiation
            public final StackManipulation a(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.g<Super> gVar) {
                return new TypeProxy.d(typeDescription, target, ((Boolean) gVar.d(Instantiation.f417749c).b(Boolean.class)).booleanValue(), ((Boolean) gVar.d(Instantiation.f417750d).b(Boolean.class)).booleanValue());
            }
        }

        static {
            a aVar = new a("CONSTRUCTOR", 0, null);
            f417748b = aVar;
            f417752f = new Instantiation[]{aVar, new b("UNSAFE", 1, null)};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(Super.class).q();
            f417749c = (a.d) bVarQ.P1(C44411u.x("ignoreFinalizer")).M2();
            f417750d = (a.d) bVarQ.P1(C44411u.x("serializableProxy")).M2();
            f417751e = (a.d) bVarQ.P1(C44411u.x("constructorParameters")).M2();
        }

        public Instantiation() {
            throw null;
        }

        public Instantiation(String str, int i12, a aVar) {
        }

        public static Instantiation valueOf(String str) {
            return (Instantiation) Enum.valueOf(Instantiation.class, str);
        }

        public static Instantiation[] values() {
            return (Instantiation[]) f417752f.clone();
        }

        public abstract StackManipulation a(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.g<Super> gVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<Super> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417739b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417740c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417741d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417742e;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417739b = binder;
            f417742e = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(Super.class).q();
            f417740c = (a.d) bVarQ.P1(C44411u.x("strategy")).M2();
            f417741d = (a.d) bVarQ.P1(C44411u.x("proxyType")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417742e.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            TypeLocator aVar2;
            if (cVar.getType().w5() || cVar.getType().w2()) {
                throw new IllegalStateException(cVar + " uses the @Super annotation on an invalid type");
            }
            TypeDescription typeDescription = (TypeDescription) gVar.d(f417741d).b(TypeDescription.class);
            if (typeDescription.Q2(Void.TYPE)) {
                aVar2 = TypeLocator.ForParameterType.f417745b;
            } else if (typeDescription.Q2(net.bytebuddy.dynamic.c.class)) {
                aVar2 = TypeLocator.ForInstrumentedType.f417743b;
            } else {
                if (typeDescription.w5() || typeDescription.w2()) {
                    throw new IllegalStateException(D8.o("Cannot assign proxy to ", typeDescription));
                }
                aVar2 = new TypeLocator.a(typeDescription);
            }
            TypeDescription typeDescriptionA = aVar2.a(target.a(), cVar.getType());
            if (typeDescriptionA.isFinal()) {
                throw new IllegalStateException(D8.o("Cannot extend final type as @Super proxy: ", typeDescriptionA));
            }
            return (aVar.b() || !target.a().m5(typeDescriptionA)) ? MethodDelegationBinder.ParameterBinding.Illegal.f417632b : new MethodDelegationBinder.ParameterBinding.a(((Instantiation) ((net.bytebuddy.description.enumeration.a) gVar.d(f417740c).b(net.bytebuddy.description.enumeration.a.class)).a0(Instantiation.class)).a(typeDescriptionA, target, gVar));
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Super> b() {
            return Super.class;
        }

        public interface TypeLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForParameterType implements TypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final ForParameterType f417745b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForParameterType[] f417746c;

                static {
                    ForParameterType forParameterType = new ForParameterType("INSTANCE", 0);
                    f417745b = forParameterType;
                    f417746c = new ForParameterType[]{forParameterType};
                }

                public ForParameterType() {
                    throw null;
                }

                public static ForParameterType valueOf(String str) {
                    return (ForParameterType) Enum.valueOf(ForParameterType.class, str);
                }

                public static ForParameterType[] values() {
                    return (ForParameterType[]) f417746c.clone();
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public final TypeDescription a(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    TypeDescription typeDescriptionF5 = generic.f5();
                    return typeDescriptionF5.equals(typeDescription) ? typeDescription : typeDescriptionF5;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements TypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417747b;

                public a(TypeDescription typeDescription) {
                    this.f417747b = typeDescription;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public final TypeDescription a(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    TypeDescription typeDescriptionF5 = generic.f5();
                    TypeDescription typeDescription2 = this.f417747b;
                    if (typeDescription2.m5(typeDescriptionF5)) {
                        return typeDescription2;
                    }
                    throw new IllegalStateException("Impossible to assign " + typeDescription2 + " to parameter of type " + generic);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417747b.equals(((a) obj).f417747b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417747b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            TypeDescription a(TypeDescription typeDescription, TypeDescription.Generic generic);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForInstrumentedType implements TypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final ForInstrumentedType f417743b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForInstrumentedType[] f417744c;

                static {
                    ForInstrumentedType forInstrumentedType = new ForInstrumentedType("INSTANCE", 0);
                    f417743b = forInstrumentedType;
                    f417744c = new ForInstrumentedType[]{forInstrumentedType};
                }

                public ForInstrumentedType() {
                    throw null;
                }

                public static ForInstrumentedType valueOf(String str) {
                    return (ForInstrumentedType) Enum.valueOf(ForInstrumentedType.class, str);
                }

                public static ForInstrumentedType[] values() {
                    return (ForInstrumentedType[]) f417744c.clone();
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public final TypeDescription a(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    return typeDescription;
                }
            }
        }
    }
}
