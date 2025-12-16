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
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.z;

/* JADX WARN: Method from annotation default annotation not found: defaultMethod */
/* JADX WARN: Method from annotation default annotation not found: defaultTarget */
/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Morph {

    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements c.b<Morph> {

        /* renamed from: b, reason: collision with root package name */
        public static final a.d f417714b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417715c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417716d;

        public interface DefaultMethodLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Implicit implements DefaultMethodLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Implicit[] f417717b = {new Implicit("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Implicit EF5;

                public Implicit() {
                    throw null;
                }

                public static Implicit valueOf(String str) {
                    return (Implicit) Enum.valueOf(Implicit.class, str);
                }

                public static Implicit[] values() {
                    return (Implicit[]) f417717b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements DefaultMethodLocator {
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

        static {
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(Morph.class).q();
            f417714b = (a.d) bVarQ.P1(C44411u.x("serializableProxy")).M2();
            f417715c = (a.d) bVarQ.P1(C44411u.x("defaultMethod")).M2();
            f417716d = (a.d) bVarQ.P1(C44411u.x("defaultTarget")).M2();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            cVar.getType().f5();
            throw null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Morph> b() {
            return Morph.class;
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

        @HashCodeAndEqualsPlugin.Enhance
        public static class RedirectionProxy extends StackManipulation.a implements net.bytebuddy.implementation.auxiliary.a {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Implementation {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$a$a, reason: collision with other inner class name */
                public static class C12094a implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.field.a f417721b;

                    public C12094a(Implementation.Target target) {
                        this.f417721b = (net.bytebuddy.description.field.a) target.a().x().P1(C44411u.x("target")).M2();
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f417721b.equals(((C12094a) obj).f417721b);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        return new a.c(new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.b(StaticFieldConstructor.f417718c.f417720b), MethodVariableAccess.a(aVar).g(), FieldAccess.c(this.f417721b).a(), MethodReturn.f418075h).n(sVar, context).f417834b, aVar.p());
                    }

                    public final int hashCode() {
                        return this.f417721b.hashCode() + (getClass().hashCode() * 31);
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
                    return new C12094a(target);
                }
            }

            @Override // net.bytebuddy.implementation.auxiliary.a
            public final String c() {
                throw null;
            }

            @Override // net.bytebuddy.implementation.auxiliary.a
            public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                new ByteBuddy(classFileVersion).d().c(null, ConstructorStrategy.Default.f417163b);
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

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class StaticFieldConstructor implements Implementation {

                /* renamed from: c, reason: collision with root package name */
                public static final StaticFieldConstructor f417718c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ StaticFieldConstructor[] f417719d;

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417720b = (net.bytebuddy.description.method.a) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(MethodSortMatcher.Sort.f418387e.f418392c)).M2();

                static {
                    StaticFieldConstructor staticFieldConstructor = new StaticFieldConstructor();
                    f417718c = staticFieldConstructor;
                    f417719d = new StaticFieldConstructor[]{staticFieldConstructor};
                }

                public static StaticFieldConstructor valueOf(String str) {
                    return (StaticFieldConstructor) Enum.valueOf(StaticFieldConstructor.class, str);
                }

                public static StaticFieldConstructor[] values() {
                    return (StaticFieldConstructor[]) f417719d.clone();
                }

                @Override // net.bytebuddy.implementation.Implementation
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    return new a.b(MethodVariableAccess.c(), MethodInvocation.b(this.f417720b), MethodReturn.f418075h);
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
                    public final TypeDescription f417722b;

                    public a(Implementation.Target target) {
                        this.f417722b = target.a();
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return this.f417722b.equals(aVar.f417722b) && b.this.equals(b.this);
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        MethodVariableAccess.f418084i.new b(1);
                        b.this.getClass();
                        throw null;
                    }

                    public final int hashCode() {
                        getClass().hashCode();
                        this.f417722b.hashCode();
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
        }
    }
}
