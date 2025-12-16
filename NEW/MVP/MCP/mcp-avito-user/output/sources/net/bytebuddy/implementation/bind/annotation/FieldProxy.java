package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.z;

/* JADX WARN: Method from annotation default annotation not found: declaringType */
/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface FieldProxy {

    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder extends c.b.a<FieldProxy> {

        /* renamed from: b, reason: collision with root package name */
        public static final a.d f417697b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417698c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417699d;

        public interface FieldResolver {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Unresolved implements FieldResolver {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Unresolved[] f417700b = {new Unresolved("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Unresolved EF5;

                public Unresolved() {
                    throw null;
                }

                public static Unresolved valueOf(String str) {
                    return (Unresolved) Enum.valueOf(Unresolved.class, str);
                }

                public static Unresolved[] values() {
                    return (Unresolved[]) f417700b.clone();
                }
            }

            public interface a {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$a$a, reason: collision with other inner class name */
                public static class C12093a implements a {
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        throw null;
                    }

                    public final int hashCode() {
                        getClass().hashCode();
                        throw null;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b implements a {
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        throw null;
                    }

                    public final int hashCode() {
                        getClass().hashCode();
                        throw null;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements FieldResolver {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements FieldResolver {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class d implements FieldResolver {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a extends StackManipulation.a implements net.bytebuddy.implementation.auxiliary.a {
            @Override // net.bytebuddy.implementation.auxiliary.a
            public final String c() {
                throw null;
            }

            @Override // net.bytebuddy.implementation.auxiliary.a
            public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                new ByteBuddy(classFileVersion);
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                net.bytebuddy.implementation.bytecode.b.g(context.e(this));
                Duplication duplication = Duplication.f417792d;
                throw null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements Implementation {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements net.bytebuddy.implementation.bytecode.a {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.field.a f417708b;

                public a(Implementation.Target target) {
                    this.f417708b = (net.bytebuddy.description.field.a) target.a().x().P1(C44411u.x("instance")).M2();
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417708b.equals(((a) obj).f417708b);
                    }
                    return false;
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                    return new a.c(new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.b(StaticFieldConstructor.f417701c.f417703b), MethodVariableAccess.a(aVar.i()).g(), FieldAccess.c(this.f417708b).a(), MethodReturn.f418075h).n(sVar, context).f417834b, aVar.p());
                }

                public final int hashCode() {
                    return this.f417708b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.implementation.Implementation
            public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                return new a(target);
            }
        }

        static {
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(FieldProxy.class).q();
            f417697b = (a.d) bVarQ.P1(C44411u.x("declaringType")).M2();
            f417698c = (a.d) bVarQ.P1(C44411u.x("value")).M2();
            f417699d = (a.d) bVarQ.P1(C44411u.x("serializableProxy")).M2();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<FieldProxy> b() {
            return FieldProxy.class;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b.a
        public final MethodDelegationBinder.ParameterBinding c(net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.c cVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
            cVar.getType().f5();
            throw null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b.a
        public final TypeDescription d(AnnotationDescription.g<FieldProxy> gVar) {
            return (TypeDescription) gVar.d(f417697b).b(TypeDescription.class);
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b.a
        public final String e(AnnotationDescription.g<FieldProxy> gVar) {
            return (String) gVar.d(f417698c).b(String.class);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StaticFieldConstructor implements Implementation {

            /* renamed from: c, reason: collision with root package name */
            public static final StaticFieldConstructor f417701c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ StaticFieldConstructor[] f417702d;

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417703b = (net.bytebuddy.description.method.a) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(MethodSortMatcher.Sort.f418387e.f418392c)).M2();

            static {
                StaticFieldConstructor staticFieldConstructor = new StaticFieldConstructor();
                f417701c = staticFieldConstructor;
                f417702d = new StaticFieldConstructor[]{staticFieldConstructor};
            }

            public static StaticFieldConstructor valueOf(String str) {
                return (StaticFieldConstructor) Enum.valueOf(StaticFieldConstructor.class, str);
            }

            public static StaticFieldConstructor[] values() {
                return (StaticFieldConstructor[]) f417702d.clone();
            }

            @Override // net.bytebuddy.implementation.Implementation
            public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                return new a.b(MethodVariableAccess.c(), MethodInvocation.b(this.f417703b), MethodReturn.f418075h);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Implementation {

            @HashCodeAndEqualsPlugin.Enhance
            public class a implements net.bytebuddy.implementation.bytecode.a {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417704b;

                public a(Implementation.Target target) {
                    this.f417704b = target.a();
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417704b.equals(aVar.f417704b) && b.this.equals(b.this);
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                    b.this.getClass();
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    this.f417704b.hashCode();
                    b.this.hashCode();
                    throw null;
                }
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.implementation.Implementation
            public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                return new a(target);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements Implementation {

            @HashCodeAndEqualsPlugin.Enhance
            public class a implements net.bytebuddy.implementation.bytecode.a {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417706b;

                public a(Implementation.Target target) {
                    this.f417706b = target.a();
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417706b.equals(aVar.f417706b) && c.this.equals(c.this);
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                    ((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType();
                    c.this.getClass();
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    this.f417706b.hashCode();
                    c.this.hashCode();
                    throw null;
                }
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.implementation.Implementation
            public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                return new a(target);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }
}
