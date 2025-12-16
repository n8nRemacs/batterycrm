package net.bytebuddy.dynamic.scaffold.inline;

import java.util.HashMap;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.scaffold.inline.d;

/* loaded from: classes8.dex */
public interface MethodRebaseResolver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Disabled implements MethodRebaseResolver {

        /* renamed from: b, reason: collision with root package name */
        public static final Disabled f417123b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Disabled[] f417124c;

        static {
            Disabled disabled = new Disabled("INSTANCE", 0);
            f417123b = disabled;
            f417124c = new Disabled[]{disabled};
        }

        public Disabled() {
            throw null;
        }

        public static Disabled valueOf(String str) {
            return (Disabled) Enum.valueOf(Disabled.class, str);
        }

        public static Disabled[] values() {
            return (Disabled[]) f417124c.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public final b a(a.d dVar) {
            return new b.c(dVar);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements MethodRebaseResolver {

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f417125b;

        /* renamed from: c, reason: collision with root package name */
        public final List<net.bytebuddy.dynamic.a> f417126c;

        public a(HashMap map, List list) {
            this.f417125b = map;
            this.f417126c = list;
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public final b a(a.d dVar) {
            b bVar = (b) this.f417125b.get(dVar);
            return bVar == null ? new b.c(dVar) : bVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f417125b.equals(aVar.f417125b) && this.f417126c.equals(aVar.f417126c);
        }

        public final int hashCode() {
            return this.f417126c.hashCode() + ((this.f417125b.hashCode() + (getClass().hashCode() * 31)) * 31);
        }
    }

    public interface b {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final C12072a f417127a;

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417128b;

            /* renamed from: net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$b$a$a, reason: collision with other inner class name */
            public static class C12072a extends a.d.AbstractC11975a {

                /* renamed from: c, reason: collision with root package name */
                public final a.d f417129c;

                /* renamed from: d, reason: collision with root package name */
                public final TypeDescription f417130d;

                public C12072a(a.d dVar, TypeDescription typeDescription) {
                    this.f417129c = dVar;
                    this.f417130d = typeDescription;
                }

                @Override // net.bytebuddy.description.method.a
                public final d.f N() {
                    return this.f417129c.N().N1();
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String V() {
                    return "<init>";
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.a
                public final AnnotationValue<?, ?> getDefaultValue() {
                    return null;
                }

                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    return 4098;
                }

                @Override // net.bytebuddy.description.method.a
                public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                    return new d.c.a(this, net.bytebuddy.utility.a.d(this.f417129c.getParameters().p2().f1(), this.f417130d));
                }

                @Override // net.bytebuddy.description.method.a
                public final TypeDescription.Generic getReturnType() {
                    return TypeDescription.Generic.f416325z2;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return this.f417129c.n();
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return this.f417129c.n();
                }
            }

            public a(C12072a c12072a, TypeDescription typeDescription) {
                this.f417127a = c12072a;
                this.f417128b = typeDescription;
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final net.bytebuddy.description.type.d a() {
                return new d.C12001d(this.f417128b);
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final a.d b() {
                return this.f417127a;
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final boolean c() {
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417127a.equals(aVar.f417127a) && this.f417128b.equals(aVar.f417128b);
            }

            public final int hashCode() {
                return this.f417128b.hashCode() + ((this.f417127a.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$b$b, reason: collision with other inner class name */
        public static class C12073b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final a f417131a;

            /* renamed from: net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$b$b$a */
            public static class a extends a.d.AbstractC11975a {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417132c;

                /* renamed from: d, reason: collision with root package name */
                public final a.d f417133d;

                /* renamed from: e, reason: collision with root package name */
                public final d.b f417134e;

                public a(TypeDescription typeDescription, a.d dVar, d.b bVar) {
                    this.f417132c = typeDescription;
                    this.f417133d = dVar;
                    this.f417134e = bVar;
                }

                @Override // net.bytebuddy.description.method.a
                public final d.f N() {
                    return this.f417133d.N().N1();
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String V() {
                    d.b bVar = this.f417134e;
                    bVar.getClass();
                    return this.f417133d.V() + "$" + bVar.f417155a;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.a
                public final AnnotationValue<?, ?> getDefaultValue() {
                    return null;
                }

                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    a.d dVar = this.f417133d;
                    return ((!this.f417132c.E() || dVar.m0()) ? 2 : 1) | (dVar.b() ? 8 : 0) | 4096 | (dVar.m0() ? 272 : 0);
                }

                @Override // net.bytebuddy.description.method.a
                public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                    return new d.c.a(this, this.f417133d.getParameters().p2().N1());
                }

                @Override // net.bytebuddy.description.method.a
                public final TypeDescription.Generic getReturnType() {
                    return this.f417133d.getReturnType().i5();
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return this.f417133d.n();
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return this.f417133d.n();
                }
            }

            public C12073b(a aVar) {
                this.f417131a = aVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final net.bytebuddy.description.type.d a() {
                return new d.c();
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final a.d b() {
                return this.f417131a;
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final boolean c() {
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417131a.equals(((C12073b) obj).f417131a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417131a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final a.d f417135a;

            public c(a.d dVar) {
                this.f417135a = dVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final net.bytebuddy.description.type.d a() {
                throw new IllegalStateException("Cannot process additional parameters for non-rebased method: " + this.f417135a);
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final a.d b() {
                return this.f417135a;
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.b
            public final boolean c() {
                return false;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417135a.equals(((c) obj).f417135a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417135a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        net.bytebuddy.description.type.d a();

        a.d b();

        boolean c();
    }

    b a(a.d dVar);
}
