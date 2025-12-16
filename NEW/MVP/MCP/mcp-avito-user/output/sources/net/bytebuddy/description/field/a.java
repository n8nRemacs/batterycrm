package net.bytebuddy.description.field;

import c61.AbstractC26949b;
import c61.C26950c;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Field;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.build.k;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.b;
import net.bytebuddy.description.c;
import net.bytebuddy.description.d;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: FieldDescription.java */
/* loaded from: classes8.dex */
public interface a extends net.bytebuddy.description.a, b.a, c.b, d.b, a.b<c, g> {

    /* compiled from: FieldDescription.java */
    /* renamed from: net.bytebuddy.description.field.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11971a extends c.a implements a {

        /* renamed from: b, reason: collision with root package name */
        public transient /* synthetic */ int f416142b;

        @Override // net.bytebuddy.description.a
        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean P(TypeDescription typeDescription) {
            if (x0(1)) {
                return true;
            }
            n().f5();
            throw null;
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
        public final String R() {
            return getName();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String V() {
            return getName();
        }

        @Override // net.bytebuddy.description.a.b
        public final a.InterfaceC11963a a(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new g(getName(), getModifiers(), (TypeDescription.Generic) getType().h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a)), getDeclaredAnnotations());
        }

        @Override // net.bytebuddy.description.field.a
        public final int d() {
            return getModifiers() | (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class) ? 131072 : 0);
        }

        @Override // net.bytebuddy.description.field.a
        public final f e() {
            return new f(getName(), getType().f5());
        }

        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return getName().equals(aVar.getName()) && n().equals(aVar.n());
        }

        @Override // net.bytebuddy.description.d.a
        public final String getDescriptor() {
            return getType().f5().getDescriptor();
        }

        @Override // net.bytebuddy.description.d.a
        @net.bytebuddy.utility.nullability.b
        public String h() {
            TypeDescription.Generic type = getType();
            try {
                if (type.o().b()) {
                    return null;
                }
                return ((AbstractC26949b) type.h0(new TypeDescription.Generic.Visitor.b(new C26950c()))).toString();
            } catch (GenericSignatureFormatError unused) {
                return null;
            }
        }

        @k.c
        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final int hashCode() {
            int iHashCode = this.f416142b != 0 ? 0 : n().hashCode() + ((getName().hashCode() + 17) * 31);
            if (iHashCode == 0) {
                return this.f416142b;
            }
            this.f416142b = iHashCode;
            return iHashCode;
        }

        @Override // net.bytebuddy.description.a
        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean o0(TypeDescription typeDescription) {
            if (n().f5().o0(typeDescription)) {
                if (x0(1) || typeDescription.equals(n().f5())) {
                    return true;
                }
                if (x0(4) && n().f5().Z5(typeDescription)) {
                    return true;
                }
                if (!x0(2) && typeDescription.Y3(n().f5())) {
                    return true;
                }
                if (x0(2) && typeDescription.Y5(n().f5())) {
                    return true;
                }
            }
            return false;
        }

        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (getModifiers() != 0) {
                sb2.append(Modifier.toString(getModifiers()));
                sb2.append(' ');
            }
            sb2.append(getType().f5().R());
            sb2.append(' ');
            sb2.append(n().f5().R());
            sb2.append('.');
            sb2.append(getName());
            return sb2.toString();
        }
    }

    /* compiled from: FieldDescription.java */
    public static class b extends c.AbstractC11972a {

        /* renamed from: c, reason: collision with root package name */
        public final Field f416143c;

        /* renamed from: d, reason: collision with root package name */
        public transient /* synthetic */ a.d f416144d;

        public b(Field field) {
            this.f416143c = field;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @k.c
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            a.d dVar = this.f416144d != null ? null : new a.d(this.f416143c.getDeclaredAnnotations());
            if (dVar == null) {
                return this.f416144d;
            }
            this.f416144d = dVar;
            return dVar;
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416143c.getModifiers();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416143c.getName();
        }

        @Override // net.bytebuddy.description.field.a
        public final TypeDescription.Generic getType() {
            boolean z12 = TypeDescription.b.f416496c;
            Field field = this.f416143c;
            return z12 ? TypeDescription.Generic.d.b.y0(field.getType()) : new TypeDescription.Generic.b.a(field);
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.c
        public final boolean isSynthetic() {
            return this.f416143c.isSynthetic();
        }

        @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDescription n() {
            return TypeDescription.d.A0(this.f416143c.getDeclaringClass());
        }
    }

    /* compiled from: FieldDescription.java */
    public interface d extends a {
    }

    /* compiled from: FieldDescription.java */
    public static class e extends c.AbstractC11972a {

        /* renamed from: c, reason: collision with root package name */
        public final InstrumentedType.b f416145c;

        /* renamed from: d, reason: collision with root package name */
        public final String f416146d;

        /* renamed from: e, reason: collision with root package name */
        public final int f416147e;

        /* renamed from: f, reason: collision with root package name */
        public final TypeDescription.Generic f416148f;

        /* renamed from: g, reason: collision with root package name */
        public final a.c f416149g;

        public e() {
            throw null;
        }

        public e(InstrumentedType.b bVar, g gVar) {
            String str = gVar.f416153a;
            a.c cVar = new a.c(gVar.f416156d);
            this.f416145c = bVar;
            this.f416146d = str;
            this.f416147e = gVar.f416154b;
            this.f416148f = gVar.f416155c;
            this.f416149g = cVar;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.c(this.f416149g);
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416147e;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416146d;
        }

        @Override // net.bytebuddy.description.field.a
        public final TypeDescription.Generic getType() {
            InstrumentedType.b bVar = this.f416145c;
            bVar.getClass();
            return (TypeDescription.Generic) this.f416148f.h0(new TypeDescription.Generic.Visitor.d.a((TypeDefinition) bVar, (TypeVariableSource) bVar));
        }

        @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return this.f416145c;
        }

        @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDescription n() {
            return this.f416145c;
        }
    }

    /* compiled from: FieldDescription.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final String f416150a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f416151b;

        /* renamed from: c, reason: collision with root package name */
        public transient /* synthetic */ int f416152c;

        public f(String str, TypeDescription typeDescription) {
            this.f416150a = str;
            this.f416151b = typeDescription;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f416150a.equals(fVar.f416150a) && this.f416151b.equals(fVar.f416151b);
        }

        @k.c
        public final int hashCode() {
            int iHashCode = this.f416152c != 0 ? 0 : (this.f416150a.hashCode() * 31) + this.f416151b.hashCode();
            if (iHashCode == 0) {
                return this.f416152c;
            }
            this.f416152c = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            return this.f416151b + " " + this.f416150a;
        }
    }

    /* compiled from: FieldDescription.java */
    public static class g implements a.InterfaceC11963a<g> {

        /* renamed from: a, reason: collision with root package name */
        public final String f416153a;

        /* renamed from: b, reason: collision with root package name */
        public final int f416154b;

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription.Generic f416155c;

        /* renamed from: d, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416156d;

        /* renamed from: e, reason: collision with root package name */
        public transient /* synthetic */ int f416157e;

        public g(String str, int i12, TypeDescription.Generic generic) {
            this(str, i12, generic, Collections.emptyList());
        }

        @Override // net.bytebuddy.description.a.InterfaceC11963a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g a(TypeDescription.Generic.Visitor.d.b bVar) {
            return new g(this.f416153a, this.f416154b, (TypeDescription.Generic) this.f416155c.h0(bVar), this.f416156d);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return this.f416154b == gVar.f416154b && this.f416153a.equals(gVar.f416153a) && this.f416155c.equals(gVar.f416155c) && this.f416156d.equals(gVar.f416156d);
        }

        @k.c
        public final int hashCode() {
            int i12;
            if (this.f416157e != 0) {
                i12 = 0;
            } else {
                i12 = D8.i(this.f416155c, ((this.f416153a.hashCode() * 31) + this.f416154b) * 31, 31) + this.f416156d.hashCode();
            }
            if (i12 == 0) {
                return this.f416157e;
            }
            this.f416157e = i12;
            return i12;
        }

        public g(String str, int i12, TypeDescription.Generic generic, List<? extends AnnotationDescription> list) {
            this.f416153a = str;
            this.f416154b = i12;
            this.f416155c = generic;
            this.f416156d = list;
        }
    }

    /* compiled from: FieldDescription.java */
    public static class h extends AbstractC11971a implements d {

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription.Generic.a f416158c;

        /* renamed from: d, reason: collision with root package name */
        public final a f416159d;

        /* renamed from: e, reason: collision with root package name */
        public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416160e;

        public h(TypeDescription.Generic.a aVar, a aVar2, TypeDescription.Generic.Visitor visitor) {
            this.f416158c = aVar;
            this.f416159d = aVar2;
            this.f416160e = visitor;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return this.f416159d.getDeclaredAnnotations();
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416159d.getModifiers();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416159d.getName();
        }

        @Override // net.bytebuddy.description.field.a
        public final TypeDescription.Generic getType() {
            return (TypeDescription.Generic) this.f416159d.getType().h0(this.f416160e);
        }

        @Override // net.bytebuddy.description.a.b
        public final a.b i() {
            return this.f416159d.i();
        }

        @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return this.f416158c;
        }
    }

    int d();

    f e();

    TypeDescription.Generic getType();

    /* compiled from: FieldDescription.java */
    public interface c extends a {
        @I41.g
        TypeDescription n();

        /* compiled from: FieldDescription.java */
        /* renamed from: net.bytebuddy.description.field.a$c$a, reason: collision with other inner class name */
        public static abstract class AbstractC11972a extends AbstractC11971a implements c {
            @Override // net.bytebuddy.description.a.b
            public final a.b i() {
                return this;
            }
        }
    }
}
