package net.bytebuddy.description.method;

import com.akita.compose.component.accordion.s;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.k;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.c;
import net.bytebuddy.description.d;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: ParameterDescription.java */
/* loaded from: classes8.dex */
public interface c extends AnnotationSource, d.InterfaceC11969d, d.c, c.d, a.b<InterfaceC11982c, f> {

    /* compiled from: ParameterDescription.java */
    public static abstract class a extends c.a implements c {

        /* renamed from: b, reason: collision with root package name */
        public transient /* synthetic */ int f416217b;

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
        public final String R() {
            return g() ? getName() : "";
        }

        @Override // net.bytebuddy.description.a.b
        public final a.InterfaceC11963a a(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new f((TypeDescription.Generic) getType().h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a)), getDeclaredAnnotations(), g() ? getName() : null, t() ? Integer.valueOf(getModifiers()) : null);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return U().equals(cVar.U()) && getIndex() == cVar.getIndex();
        }

        @Override // net.bytebuddy.description.c
        public int getModifiers() {
            return 0;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public String getName() {
            return "arg".concat(String.valueOf(getIndex()));
        }

        @Override // net.bytebuddy.description.method.c
        public int getOffset() {
            net.bytebuddy.description.type.d dVarF1 = U().getParameters().p2().f1();
            int i12 = !U().b() ? 1 : 0;
            for (int i13 = 0; i13 < getIndex(); i13++) {
                i12 += dVarF1.get(i13).p().f417839b;
            }
            return i12;
        }

        @k.c
        public final int hashCode() {
            int iHashCode = this.f416217b != 0 ? 0 : U().hashCode() ^ getIndex();
            if (iHashCode == 0) {
                return this.f416217b;
            }
            this.f416217b = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(Modifier.toString(getModifiers()));
            if (getModifiers() != 0) {
                sb2.append(' ');
            }
            sb2.append(x0(128) ? getType().f5().getName().replaceFirst("\\[]$", "...") : getType().f5().getName());
            sb2.append(' ');
            sb2.append(getName());
            return sb2.toString();
        }
    }

    /* compiled from: ParameterDescription.java */
    public static abstract class b<T extends AccessibleObject> extends InterfaceC11982c.a {

        /* renamed from: f, reason: collision with root package name */
        public static final e f416218f;

        /* renamed from: g, reason: collision with root package name */
        public static final boolean f416219g;

        /* renamed from: c, reason: collision with root package name */
        public final Executable f416220c;

        /* renamed from: d, reason: collision with root package name */
        public final int f416221d;

        /* renamed from: e, reason: collision with root package name */
        public final a.d.AbstractC11975a.b f416222e;

        /* compiled from: ParameterDescription.java */
        public static class a extends b<Constructor<?>> {
            public a() {
                throw null;
            }

            @Override // net.bytebuddy.description.method.c
            @SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public final net.bytebuddy.description.method.a U() {
                return new a.b((Constructor) this.f416220c);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [net.bytebuddy.description.method.a$d$a$b, net.bytebuddy.description.method.c$b$f] */
            @Override // net.bytebuddy.description.annotation.AnnotationSource
            @SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs", value = {"BC_UNCONFIRMED_CAST"})
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                Annotation[][] annotationArrS = this.f416222e.S();
                a.b bVar = new a.b((Constructor) this.f416220c);
                int length = annotationArrS.length;
                int size = bVar.getParameters().size();
                int i12 = this.f416221d;
                return (length == size || !bVar.n().A4()) ? new a.d(annotationArrS[i12]) : i12 == 0 ? new a.b() : new a.d(annotationArrS[i12 - 1]);
            }

            @Override // net.bytebuddy.description.method.c
            @SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public final TypeDescription.Generic getType() {
                boolean z12 = TypeDescription.b.f416496c;
                int i12 = this.f416221d;
                Executable executable = this.f416220c;
                if (z12) {
                    return TypeDescription.Generic.d.b.y0(((Constructor) executable).getParameterTypes()[i12]);
                }
                Constructor constructor = (Constructor) executable;
                return new TypeDescription.Generic.b.d(constructor, i12, constructor.getParameterTypes());
            }
        }

        /* compiled from: ParameterDescription.java */
        /* renamed from: net.bytebuddy.description.method.c$b$b, reason: collision with other inner class name */
        public static class C11979b extends InterfaceC11982c.a {

            /* renamed from: c, reason: collision with root package name */
            public final Constructor<?> f416223c;

            /* renamed from: d, reason: collision with root package name */
            public final int f416224d;

            /* renamed from: e, reason: collision with root package name */
            public final Class<?>[] f416225e;

            /* renamed from: f, reason: collision with root package name */
            public final a.b f416226f;

            public C11979b(Constructor constructor, int i12, Class[] clsArr, a.b bVar) {
                this.f416223c = constructor;
                this.f416224d = i12;
                this.f416225e = clsArr;
                this.f416226f = bVar;
            }

            @Override // net.bytebuddy.description.method.c
            public final net.bytebuddy.description.method.a U() {
                return new a.b(this.f416223c);
            }

            @Override // net.bytebuddy.description.d.c
            public final boolean g() {
                return false;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                a.b bVar = new a.b(this.f416223c);
                Annotation[][] annotationArrS = this.f416226f.S();
                int length = annotationArrS.length;
                int size = bVar.getParameters().size();
                int i12 = this.f416224d;
                return (length == size || !bVar.n().A4()) ? new a.d(annotationArrS[i12]) : i12 == 0 ? new a.b() : new a.d(annotationArrS[i12 - 1]);
            }

            @Override // net.bytebuddy.description.method.c
            public final int getIndex() {
                return this.f416224d;
            }

            @Override // net.bytebuddy.description.method.c
            public final TypeDescription.Generic getType() {
                boolean z12 = TypeDescription.b.f416496c;
                int i12 = this.f416224d;
                Class<?>[] clsArr = this.f416225e;
                return z12 ? TypeDescription.Generic.d.b.y0(clsArr[i12]) : new TypeDescription.Generic.b.d(this.f416223c, i12, clsArr);
            }

            @Override // net.bytebuddy.description.method.c
            public final boolean t() {
                return false;
            }
        }

        /* compiled from: ParameterDescription.java */
        /* renamed from: net.bytebuddy.description.method.c$b$c, reason: collision with other inner class name */
        public static class C11980c extends InterfaceC11982c.a {

            /* renamed from: c, reason: collision with root package name */
            public final Method f416227c;

            /* renamed from: d, reason: collision with root package name */
            public final int f416228d;

            /* renamed from: e, reason: collision with root package name */
            public final Class<?>[] f416229e;

            /* renamed from: f, reason: collision with root package name */
            public final a.c f416230f;

            public C11980c(Method method, int i12, Class[] clsArr, a.c cVar) {
                this.f416227c = method;
                this.f416228d = i12;
                this.f416229e = clsArr;
                this.f416230f = cVar;
            }

            @Override // net.bytebuddy.description.method.c
            public final net.bytebuddy.description.method.a U() {
                return new a.c(this.f416227c);
            }

            @Override // net.bytebuddy.description.d.c
            public final boolean g() {
                return false;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                return new a.d(this.f416230f.S()[this.f416228d]);
            }

            @Override // net.bytebuddy.description.method.c
            public final int getIndex() {
                return this.f416228d;
            }

            @Override // net.bytebuddy.description.method.c
            public final TypeDescription.Generic getType() {
                boolean z12 = TypeDescription.b.f416496c;
                int i12 = this.f416228d;
                Class<?>[] clsArr = this.f416229e;
                return z12 ? TypeDescription.Generic.d.b.y0(clsArr[i12]) : new TypeDescription.Generic.b.e(this.f416227c, i12, clsArr);
            }

            @Override // net.bytebuddy.description.method.c
            public final boolean t() {
                return false;
            }
        }

        /* compiled from: ParameterDescription.java */
        public static class d extends b<Method> {
            @Override // net.bytebuddy.description.method.c
            @SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public final net.bytebuddy.description.method.a U() {
                return new a.c((Method) this.f416220c);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [net.bytebuddy.description.method.a$d$a$b, net.bytebuddy.description.method.c$b$f] */
            @Override // net.bytebuddy.description.annotation.AnnotationSource
            @SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                return new a.d(this.f416222e.S()[this.f416221d]);
            }

            @Override // net.bytebuddy.description.method.c
            @SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public final TypeDescription.Generic getType() {
                boolean z12 = TypeDescription.b.f416496c;
                int i12 = this.f416221d;
                Executable executable = this.f416220c;
                if (z12) {
                    return TypeDescription.Generic.d.b.y0(((Method) executable).getParameterTypes()[i12]);
                }
                Method method = (Method) executable;
                return new TypeDescription.Generic.b.e(method, i12, method.getParameterTypes());
            }
        }

        /* compiled from: ParameterDescription.java */
        @JavaDispatcher.i("java.lang.reflect.Parameter")
        public interface e {
            @JavaDispatcher.i("isNamePresent")
            boolean a();

            @JavaDispatcher.i("getModifiers")
            int getModifiers();

            @JavaDispatcher.i("getName")
            String getName();
        }

        /* compiled from: ParameterDescription.java */
        public interface f {

            /* compiled from: ParameterDescription.java */
            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements f {
                @Override // net.bytebuddy.description.method.c.b.f
                public final Annotation[][] S() {
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

            /* compiled from: ParameterDescription.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.description.method.c$b$f$b, reason: collision with other inner class name */
            public static class C11981b implements f {
                @Override // net.bytebuddy.description.method.c.b.f
                public final Annotation[][] S() {
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

            Annotation[][] S();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.description.method.c.b.f416219g = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.method.c.b.f416219g = r0
            L19:
                java.lang.Class<net.bytebuddy.description.method.c$b$e> r0 = net.bytebuddy.description.method.c.b.e.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.description.method.c.b.f416219g
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.description.method.c$b$e r0 = (net.bytebuddy.description.method.c.b.e) r0
                net.bytebuddy.description.method.c.b.f416218f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.method.c.b.<clinit>():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Executable executable, int i12, f fVar) {
            this.f416220c = executable;
            this.f416221d = i12;
            this.f416222e = (a.d.AbstractC11975a.b) fVar;
        }

        @Override // net.bytebuddy.description.d.c
        public final boolean g() {
            Object obj = d.AbstractC11983d.f416250d.getParameters()[this.f416221d];
            return f416218f.a();
        }

        @Override // net.bytebuddy.description.method.c
        public final int getIndex() {
            return this.f416221d;
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.c
        public final int getModifiers() {
            Object obj = d.AbstractC11983d.f416250d.getParameters()[this.f416221d];
            return f416218f.getModifiers();
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            Object obj = d.AbstractC11983d.f416250d.getParameters()[this.f416221d];
            return f416218f.getName();
        }

        @Override // net.bytebuddy.description.method.c
        public final boolean t() {
            return g() || getModifiers() != 0;
        }
    }

    /* compiled from: ParameterDescription.java */
    public interface d extends c {
    }

    /* compiled from: ParameterDescription.java */
    public static class e extends InterfaceC11982c.a {

        /* renamed from: c, reason: collision with root package name */
        public final a.d.AbstractC11975a f416231c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription.Generic f416232d;

        /* renamed from: e, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416233e;

        /* renamed from: f, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final String f416234f;

        /* renamed from: g, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final Integer f416235g;

        /* renamed from: h, reason: collision with root package name */
        public final int f416236h;

        /* renamed from: i, reason: collision with root package name */
        public final int f416237i;

        public e(a.d.AbstractC11975a abstractC11975a, TypeDescription.Generic generic, List list, @net.bytebuddy.utility.nullability.b String str, @net.bytebuddy.utility.nullability.b Integer num, int i12, int i13) {
            this.f416231c = abstractC11975a;
            this.f416232d = generic;
            this.f416233e = list;
            this.f416234f = str;
            this.f416235g = num;
            this.f416236h = i12;
            this.f416237i = i13;
        }

        @Override // net.bytebuddy.description.method.c
        public final net.bytebuddy.description.method.a U() {
            return this.f416231c;
        }

        @Override // net.bytebuddy.description.d.c
        public final boolean g() {
            return this.f416234f != null;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.c(this.f416233e);
        }

        @Override // net.bytebuddy.description.method.c
        public final int getIndex() {
            return this.f416236h;
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.c
        public final int getModifiers() {
            Integer num = this.f416235g;
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            String str = this.f416234f;
            return str == null ? super.getName() : str;
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.method.c
        public final int getOffset() {
            return this.f416237i;
        }

        @Override // net.bytebuddy.description.method.c
        public final TypeDescription.Generic getType() {
            a.d.AbstractC11975a abstractC11975a = this.f416231c;
            return (TypeDescription.Generic) this.f416232d.h0(new TypeDescription.Generic.Visitor.d.a(abstractC11975a.n(), abstractC11975a));
        }

        @Override // net.bytebuddy.description.method.c
        public final boolean t() {
            return this.f416235g != null;
        }
    }

    /* compiled from: ParameterDescription.java */
    public static class g extends a implements d {

        /* renamed from: c, reason: collision with root package name */
        public final a.i f416244c;

        /* renamed from: d, reason: collision with root package name */
        public final c f416245d;

        /* renamed from: e, reason: collision with root package name */
        public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416246e;

        public g(a.i iVar, c cVar, TypeDescription.Generic.Visitor visitor) {
            this.f416244c = iVar;
            this.f416245d = cVar;
            this.f416246e = visitor;
        }

        @Override // net.bytebuddy.description.method.c
        public final net.bytebuddy.description.method.a U() {
            return this.f416244c;
        }

        @Override // net.bytebuddy.description.d.c
        public final boolean g() {
            return this.f416245d.g();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return this.f416245d.getDeclaredAnnotations();
        }

        @Override // net.bytebuddy.description.method.c
        public final int getIndex() {
            return this.f416245d.getIndex();
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416245d.getModifiers();
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416245d.getName();
        }

        @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.method.c
        public final int getOffset() {
            return this.f416245d.getOffset();
        }

        @Override // net.bytebuddy.description.method.c
        public final TypeDescription.Generic getType() {
            return (TypeDescription.Generic) this.f416245d.getType().h0(this.f416246e);
        }

        @Override // net.bytebuddy.description.a.b
        public final a.b i() {
            return this.f416245d.i();
        }

        @Override // net.bytebuddy.description.method.c
        public final boolean t() {
            return this.f416245d.t();
        }
    }

    net.bytebuddy.description.method.a U();

    int getIndex();

    int getOffset();

    TypeDescription.Generic getType();

    boolean t();

    /* compiled from: ParameterDescription.java */
    public static class f implements a.InterfaceC11963a<f> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription.Generic f416238a;

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416239b;

        /* renamed from: c, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final String f416240c;

        /* renamed from: d, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final Integer f416241d;

        /* renamed from: e, reason: collision with root package name */
        public transient /* synthetic */ int f416242e;

        /* compiled from: ParameterDescription.java */
        public static class a extends AbstractList<f> {

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends TypeDefinition> f416243b;

            public a(List<? extends TypeDefinition> list) {
                this.f416243b = list;
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return new f(this.f416243b.get(i12).P0());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416243b.size();
            }
        }

        public f() {
            throw null;
        }

        public f(TypeDescription.Generic generic) {
            this(generic, Collections.emptyList(), null, null);
        }

        @Override // net.bytebuddy.description.a.InterfaceC11963a
        public final a.InterfaceC11963a a(TypeDescription.Generic.Visitor.d.b bVar) {
            return new f((TypeDescription.Generic) this.f416238a.h0(bVar), this.f416239b, this.f416240c, this.f416241d);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f416238a.equals(fVar.f416238a) && this.f416239b.equals(fVar.f416239b)) {
                String str = fVar.f416240c;
                String str2 = this.f416240c;
                if (str2 == null ? str == null : str2.equals(str)) {
                    Integer num = fVar.f416241d;
                    Integer num2 = this.f416241d;
                    if (num2 != null) {
                        if (num2.equals(num)) {
                            return true;
                        }
                    } else if (num == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @k.c
        public final int hashCode() {
            if (this.f416242e == 0) {
                int iHashCode = (this.f416239b.hashCode() + (this.f416238a.hashCode() * 31)) * 31;
                String str = this.f416240c;
                int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
                Integer num = this.f416241d;
                iHashCode = (num != null ? num.hashCode() : 0) + iHashCode2;
            }
            if (iHashCode == 0) {
                return this.f416242e;
            }
            this.f416242e = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ParameterDescription.Token{type=");
            sb2.append(this.f416238a);
            sb2.append(", annotations=");
            sb2.append(this.f416239b);
            sb2.append(", name='");
            sb2.append(this.f416240c);
            sb2.append("', modifiers=");
            return s.j(sb2, this.f416241d, '}');
        }

        public f(TypeDescription.Generic generic, List<? extends AnnotationDescription> list, @net.bytebuddy.utility.nullability.b String str, @net.bytebuddy.utility.nullability.b Integer num) {
            this.f416238a = generic;
            this.f416239b = list;
            this.f416240c = str;
            this.f416241d = num;
        }
    }

    /* compiled from: ParameterDescription.java */
    /* renamed from: net.bytebuddy.description.method.c$c, reason: collision with other inner class name */
    public interface InterfaceC11982c extends c {

        /* compiled from: ParameterDescription.java */
        /* renamed from: net.bytebuddy.description.method.c$c$a */
        public static abstract class a extends a implements InterfaceC11982c {
            @Override // net.bytebuddy.description.a.b
            public final a.b i() {
                return this;
            }
        }
    }
}
