package net.bytebuddy.dynamic;

import I41.g;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.z;

/* loaded from: classes8.dex */
public interface Transformer<T> {

    @HashCodeAndEqualsPlugin.Enhance
    public static class a<S> implements Transformer<S> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f416596b;

        public a() {
            throw null;
        }

        public a(Transformer<S>... transformerArr) {
            List<Transformer> listAsList = Arrays.asList(transformerArr);
            this.f416596b = new ArrayList();
            for (Transformer transformer : listAsList) {
                if (transformer instanceof a) {
                    this.f416596b.addAll(((a) transformer).f416596b);
                } else if (!(transformer instanceof NoOp)) {
                    this.f416596b.add(transformer);
                }
            }
        }

        @Override // net.bytebuddy.dynamic.Transformer
        public final Object a(Object obj, TypeDescription typeDescription) {
            Iterator it = this.f416596b.iterator();
            while (it.hasNext()) {
                obj = ((Transformer) it.next()).a(obj, typeDescription);
            }
            return obj;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f416596b.equals(((a) obj).f416596b);
        }

        public final int hashCode() {
            return this.f416596b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements Transformer<net.bytebuddy.description.field.a> {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Transformer<a.g> {
            @Override // net.bytebuddy.dynamic.Transformer
            public final Object a(Object obj, TypeDescription typeDescription) {
                String str = ((a.g) obj).f416153a;
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
        }

        /* renamed from: net.bytebuddy.dynamic.Transformer$b$b, reason: collision with other inner class name */
        public static class C12005b extends a.AbstractC11971a {
            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                throw null;
            }

            @Override // net.bytebuddy.description.c
            public final int getModifiers() {
                throw null;
            }

            @Override // net.bytebuddy.description.d.InterfaceC11969d
            public final String getName() {
                throw null;
            }

            @Override // net.bytebuddy.description.field.a
            public final TypeDescription.Generic getType() {
                throw null;
            }

            @Override // net.bytebuddy.description.a.b
            public final a.b i() {
                return null;
            }

            @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
            @g
            public final TypeDefinition n() {
                return null;
            }
        }

        @Override // net.bytebuddy.dynamic.Transformer
        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final Object a(Object obj, TypeDescription typeDescription) {
            net.bytebuddy.description.field.a aVar = (net.bytebuddy.description.field.a) obj;
            aVar.n();
            aVar.a(C44396e.f418423d);
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
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements Transformer<net.bytebuddy.description.method.a> {

        /* renamed from: b, reason: collision with root package name */
        public final a f416597b;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Transformer<a.h> {

            /* renamed from: b, reason: collision with root package name */
            public final a.e<a.b> f416598b;

            public a(a.e<a.b> eVar) {
                this.f416598b = eVar;
            }

            @Override // net.bytebuddy.dynamic.Transformer
            public final Object a(Object obj, TypeDescription typeDescription) {
                a.h hVar = (a.h) obj;
                return new a.h(hVar.f416193a, this.f416598b.a(hVar.f416194b), hVar.g(), hVar.f416196d, hVar.f(), hVar.e(), hVar.d(), hVar.f416200h, hVar.f416201i);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416598b.equals(((a) obj).f416598b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416598b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        public static class b extends a.AbstractC11974a {

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription f416599c;

            /* renamed from: d, reason: collision with root package name */
            public final TypeDefinition f416600d;

            /* renamed from: e, reason: collision with root package name */
            public final a.h f416601e;

            /* renamed from: f, reason: collision with root package name */
            public final a.d f416602f;

            @HashCodeAndEqualsPlugin.Enhance
            public class a extends TypeDescription.Generic.Visitor.d.f {
                public a() {
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(TypeDescription.Generic.a aVar) {
                    TypeDescription.Generic genericM2;
                    b bVar = b.this;
                    d.f fVar = (d.f) ((z.a) bVar.r()).P1(C44411u.x(aVar.g0()));
                    if (fVar.isEmpty()) {
                        genericM2 = bVar.f416599c.Y(aVar.g0());
                    } else {
                        genericM2 = fVar.M2();
                    }
                    return new TypeDescription.Generic.e.c(genericM2, aVar);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return b.this.equals(b.this);
                    }
                    return false;
                }

                public final int hashCode() {
                    return b.this.hashCode() + (getClass().hashCode() * 31);
                }
            }

            /* renamed from: net.bytebuddy.dynamic.Transformer$c$b$b, reason: collision with other inner class name */
            public class C12006b extends c.a {

                /* renamed from: c, reason: collision with root package name */
                public final int f416604c;

                /* renamed from: d, reason: collision with root package name */
                public final c.f f416605d;

                public C12006b(int i12, c.f fVar) {
                    this.f416604c = i12;
                    this.f416605d = fVar;
                }

                @Override // net.bytebuddy.description.method.c
                public final net.bytebuddy.description.method.a U() {
                    return b.this;
                }

                @Override // net.bytebuddy.description.d.c
                public final boolean g() {
                    return this.f416605d.f416240c != null;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    c.f fVar = this.f416605d;
                    fVar.getClass();
                    return new a.c(fVar.f416239b);
                }

                @Override // net.bytebuddy.description.method.c
                public final int getIndex() {
                    return this.f416604c;
                }

                @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.c
                public final int getModifiers() {
                    Integer num = this.f416605d.f416241d;
                    if (num == null) {
                        return 0;
                    }
                    return num.intValue();
                }

                @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.d.InterfaceC11969d
                public final String getName() {
                    String str = this.f416605d.f416240c;
                    return str == null ? super.getName() : str;
                }

                @Override // net.bytebuddy.description.method.c
                public final TypeDescription.Generic getType() {
                    return (TypeDescription.Generic) this.f416605d.f416238a.h0(b.this.new a());
                }

                @Override // net.bytebuddy.description.a.b
                public final a.b i() {
                    return (c.InterfaceC11982c) b.this.f416602f.getParameters().get(this.f416604c);
                }

                @Override // net.bytebuddy.description.method.c
                public final boolean t() {
                    return this.f416605d.f416241d != null;
                }
            }

            /* renamed from: net.bytebuddy.dynamic.Transformer$c$b$c, reason: collision with other inner class name */
            public class C12007c extends d.a<net.bytebuddy.description.method.c> {
                public C12007c() {
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    b bVar = b.this;
                    return bVar.new C12006b(i12, (c.f) ((a.InterfaceC11963a) bVar.f416601e.f().f416033b.get(i12)));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return b.this.f416601e.f().f416033b.size();
                }
            }

            public b(TypeDescription typeDescription, TypeDefinition typeDefinition, a.h hVar, a.d dVar) {
                this.f416599c = typeDescription;
                this.f416600d = typeDefinition;
                this.f416601e = hVar;
                this.f416602f = dVar;
            }

            @Override // net.bytebuddy.description.method.a
            public final d.f N() {
                return new d.f.C12002d(this.f416601e.e(), new a());
            }

            @Override // net.bytebuddy.description.d.InterfaceC11969d
            public final String V() {
                return this.f416601e.f416193a;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                return this.f416601e.d();
            }

            @Override // net.bytebuddy.description.method.a
            @net.bytebuddy.utility.nullability.b
            public final AnnotationValue<?, ?> getDefaultValue() {
                return this.f416601e.f416200h;
            }

            @Override // net.bytebuddy.description.c
            public final int getModifiers() {
                return this.f416601e.f416194b;
            }

            @Override // net.bytebuddy.description.method.a
            public final net.bytebuddy.description.method.d<?> getParameters() {
                return new C12007c();
            }

            @Override // net.bytebuddy.description.method.a
            public final TypeDescription.Generic getReturnType() {
                return (TypeDescription.Generic) this.f416601e.f416196d.h0(new a());
            }

            @Override // net.bytebuddy.description.a.b
            public final a.b i() {
                return this.f416602f;
            }

            @Override // net.bytebuddy.description.method.a
            public final TypeDescription.Generic l() {
                TypeDescription.Generic generic = this.f416601e.f416201i;
                if (generic != null) {
                    return (TypeDescription.Generic) generic.h0(new a());
                }
                TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                return null;
            }

            @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
            @g
            public final TypeDefinition n() {
                return this.f416600d;
            }

            @Override // net.bytebuddy.description.TypeVariableSource
            public final d.f r() {
                return new d.f.C12002d.a(this, this.f416601e.g(), new a());
            }
        }

        public c(a aVar) {
            this.f416597b = aVar;
        }

        @Override // net.bytebuddy.dynamic.Transformer
        public final Object a(Object obj, TypeDescription typeDescription) {
            net.bytebuddy.description.method.a aVar = (net.bytebuddy.description.method.a) obj;
            return new b(typeDescription, aVar.n(), (a.h) this.f416597b.a(aVar.a(C44396e.f418423d), typeDescription), aVar.i());
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416597b.equals(((c) obj).f416597b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416597b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    Object a(Object obj, TypeDescription typeDescription);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements Transformer<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f416594b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f416595c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f416594b = noOp;
            f416595c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f416595c.clone();
        }

        @Override // net.bytebuddy.dynamic.Transformer
        public final Object a(Object obj, TypeDescription typeDescription) {
            return obj;
        }
    }
}
