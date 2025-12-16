package net.bytebuddy.description.type;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.k;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.z;

/* compiled from: TypeList.java */
/* loaded from: classes8.dex */
public interface d extends z<TypeDescription, d> {

    /* compiled from: TypeList.java */
    public static abstract class b extends z.a<TypeDescription, d> implements d {
        @Override // net.bytebuddy.matcher.z.a
        public final z a(List<TypeDescription> list) {
            return new C12001d(list);
        }

        @Override // net.bytebuddy.description.type.d
        @net.bytebuddy.utility.nullability.b
        public String[] t1() {
            int size = size();
            String[] strArr = new String[size];
            Iterator<TypeDescription> it = iterator();
            int i12 = 0;
            while (it.hasNext()) {
                strArr[i12] = it.next().V();
                i12++;
            }
            if (size == 0) {
                return null;
            }
            return strArr;
        }
    }

    /* compiled from: TypeList.java */
    public static class c extends z.b<TypeDescription, d> implements d {
        @Override // net.bytebuddy.description.type.d
        @SuppressFBWarnings(justification = "Value is null", value = {"EI_EXPOSE_REP"})
        public final String[] t1() {
            return null;
        }
    }

    /* compiled from: TypeList.java */
    /* renamed from: net.bytebuddy.description.type.d$d, reason: collision with other inner class name */
    public static class C12001d extends b {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends TypeDescription> f416529b;

        public C12001d(TypeDescription... typeDescriptionArr) {
            this((List<? extends TypeDescription>) Arrays.asList(typeDescriptionArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416529b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416529b.size();
        }

        public C12001d(List<? extends TypeDescription> list) {
            this.f416529b = list;
        }
    }

    /* compiled from: TypeList.java */
    public static class e extends b {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends Class<?>> f416530b;

        public e() {
            throw null;
        }

        public e(Class<?>... clsArr) {
            this.f416530b = Arrays.asList(clsArr);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return TypeDescription.d.A0(this.f416530b.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416530b.size();
        }

        @Override // net.bytebuddy.description.type.d.b, net.bytebuddy.description.type.d
        @net.bytebuddy.utility.nullability.b
        public final String[] t1() {
            List<? extends Class<?>> list = this.f416530b;
            int size = list.size();
            String[] strArr = new String[size];
            Iterator<? extends Class<?>> it = list.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                strArr[i12] = B.l(it.next());
                i12++;
            }
            if (size == 0) {
                return null;
            }
            return strArr;
        }
    }

    @net.bytebuddy.utility.nullability.b
    String[] t1();

    /* compiled from: TypeList.java */
    public interface f extends z<TypeDescription.Generic, f> {

        /* compiled from: TypeList.java */
        public static abstract class a extends z.a<TypeDescription.Generic, f> implements f {
            @Override // net.bytebuddy.description.type.d.f
            public f N1() {
                ArrayList arrayList = new ArrayList(size());
                Iterator<TypeDescription.Generic> it = iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().i5());
                }
                return new c(arrayList);
            }

            @Override // net.bytebuddy.matcher.z.a
            public final z a(List<TypeDescription.Generic> list) {
                return new c(list);
            }

            @Override // net.bytebuddy.description.type.d.f
            public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
                ArrayList arrayList = new ArrayList(size());
                Iterator<TypeDescription.Generic> it = iterator();
                while (it.hasNext()) {
                    TypeDescription.Generic next = it.next();
                    arrayList.add(new net.bytebuddy.description.type.e(next.g0(), next.getUpperBounds().h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a)), next.getDeclaredAnnotations()));
                }
                return new a.InterfaceC11963a.C11964a(arrayList);
            }

            @Override // net.bytebuddy.description.type.d.f
            public d f1() {
                ArrayList arrayList = new ArrayList(size());
                Iterator<TypeDescription.Generic> it = iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f5());
                }
                return new C12001d(arrayList);
            }

            @Override // net.bytebuddy.description.type.d.f
            public final f h0(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                ArrayList arrayList = new ArrayList(size());
                Iterator<TypeDescription.Generic> it = iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().h0(visitor));
                }
                return new c(arrayList);
            }

            @Override // net.bytebuddy.description.type.d.f
            public int p() {
                Iterator<TypeDescription.Generic> it = iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    i12 += it.next().p().f417839b;
                }
                return i12;
            }
        }

        /* compiled from: TypeList.java */
        public static class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends TypeDefinition> f416531b;

            public c(TypeDefinition... typeDefinitionArr) {
                this((List<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return this.f416531b.get(i12).P0();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416531b.size();
            }

            public c(List<? extends TypeDefinition> list) {
                this.f416531b = list;
            }
        }

        /* compiled from: TypeList.java */
        /* renamed from: net.bytebuddy.description.type.d$f$d, reason: collision with other inner class name */
        public static class C12002d extends a {

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ int f416532d = 0;

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends TypeDescription.Generic> f416533b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416534c;

            /* compiled from: TypeList.java */
            /* renamed from: net.bytebuddy.description.type.d$f$d$a */
            public static class a extends a {

                /* renamed from: b, reason: collision with root package name */
                public final TypeVariableSource.a f416535b;

                /* renamed from: c, reason: collision with root package name */
                public final List<? extends net.bytebuddy.description.type.e> f416536c;

                /* renamed from: d, reason: collision with root package name */
                public final TypeDescription.Generic.Visitor.d f416537d;

                /* compiled from: TypeList.java */
                /* renamed from: net.bytebuddy.description.type.d$f$d$a$a, reason: collision with other inner class name */
                public static class C12003a extends TypeDescription.Generic.e {

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeVariableSource.a f416538c;

                    /* renamed from: d, reason: collision with root package name */
                    public final net.bytebuddy.description.type.e f416539d;

                    /* renamed from: e, reason: collision with root package name */
                    public final TypeDescription.Generic.Visitor.d f416540e;

                    public C12003a(TypeVariableSource.a aVar, net.bytebuddy.description.type.e eVar, TypeDescription.Generic.Visitor.d dVar) {
                        this.f416538c = aVar;
                        this.f416539d = eVar;
                        this.f416540e = dVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final TypeVariableSource A3() {
                        return this.f416538c;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final String g0() {
                        return this.f416539d.f416560a;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        net.bytebuddy.description.type.e eVar = this.f416539d;
                        eVar.getClass();
                        return new a.c(eVar.f416562c);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final f getUpperBounds() {
                        net.bytebuddy.description.type.e eVar = this.f416539d;
                        eVar.getClass();
                        return new c(eVar.f416561b).h0(this.f416540e);
                    }
                }

                public a(TypeVariableSource.a aVar, List list, TypeDescription.Generic.Visitor.d dVar) {
                    this.f416535b = aVar;
                    this.f416536c = list;
                    this.f416537d = dVar;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    return new C12003a(this.f416535b, this.f416536c.get(i12), this.f416537d);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return this.f416536c.size();
                }
            }

            /* compiled from: TypeList.java */
            /* renamed from: net.bytebuddy.description.type.d$f$d$b */
            public static class b extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List<? extends TypeDescription.Generic> f416541b;

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416542c;

                public b(List<? extends TypeDescription.Generic> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                    this.f416541b = list;
                    this.f416542c = visitor;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    TypeDescription.Generic generic = this.f416541b.get(i12);
                    return new TypeDescription.Generic.b.i(generic, this.f416542c, generic);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return this.f416541b.size();
                }
            }

            public C12002d(List<? extends TypeDescription.Generic> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                this.f416533b = list;
                this.f416534c = visitor;
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return (TypeDescription.Generic) this.f416533b.get(i12).h0(this.f416534c);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416533b.size();
            }
        }

        /* compiled from: TypeList.java */
        public static class e extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends Type> f416543b;

            /* compiled from: TypeList.java */
            public static class a extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List<TypeVariable<?>> f416544b;

                public a() {
                    throw null;
                }

                public a(TypeVariable<?>... typeVariableArr) {
                    this.f416544b = Arrays.asList(typeVariableArr);
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    TypeVariable<?> typeVariable = this.f416544b.get(i12);
                    return TypeDefinition.Sort.a(typeVariable, new TypeDescription.Generic.AnnotationReader.a.i(typeVariable));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return this.f416544b.size();
                }
            }

            public e(Type... typeArr) {
                this((List<? extends Type>) Arrays.asList(typeArr));
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return TypeDefinition.Sort.a(this.f416543b.get(i12), TypeDescription.Generic.AnnotationReader.NoOp.f416326b);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416543b.size();
            }

            public e(List<? extends Type> list) {
                this.f416543b = list;
            }
        }

        /* compiled from: TypeList.java */
        /* renamed from: net.bytebuddy.description.type.d$f$f, reason: collision with other inner class name */
        public static class C12004f extends a {

            /* renamed from: b, reason: collision with root package name */
            public final Constructor<?> f416545b;

            /* compiled from: TypeList.java */
            /* renamed from: net.bytebuddy.description.type.d$f$f$a */
            public static class a extends TypeDescription.Generic.b.g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Constructor<?> f416546c;

                /* renamed from: d, reason: collision with root package name */
                public final int f416547d;

                /* renamed from: e, reason: collision with root package name */
                public final Class<?>[] f416548e;

                /* renamed from: f, reason: collision with root package name */
                public transient /* synthetic */ TypeDescription.Generic f416549f;

                public a() {
                    throw null;
                }

                public a(Constructor constructor, int i12, Class[] clsArr, a aVar) {
                    this.f416546c = constructor;
                    this.f416547d = i12;
                    this.f416548e = clsArr;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return TypeDescription.d.A0(this.f416548e[this.f416547d]);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final TypeDescription.Generic y0() {
                    TypeDescription.Generic genericA;
                    if (this.f416549f != null) {
                        genericA = null;
                    } else {
                        Type[] genericExceptionTypes = this.f416546c.getGenericExceptionTypes();
                        genericA = this.f416548e.length == genericExceptionTypes.length ? TypeDefinition.Sort.a(genericExceptionTypes[this.f416547d], z0()) : i5();
                    }
                    if (genericA == null) {
                        return this.f416549f;
                    }
                    this.f416549f = genericA;
                    return genericA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final TypeDescription.Generic.AnnotationReader z0() {
                    return new TypeDescription.Generic.AnnotationReader.a.b(this.f416546c, this.f416547d);
                }
            }

            public C12004f(Constructor<?> constructor) {
                this.f416545b = constructor;
            }

            @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
            public final d f1() {
                return new e(this.f416545b.getExceptionTypes());
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                Constructor<?> constructor = this.f416545b;
                return new a(constructor, i12, constructor.getExceptionTypes(), null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416545b.getExceptionTypes().length;
            }
        }

        /* compiled from: TypeList.java */
        public static class g extends a {

            /* renamed from: b, reason: collision with root package name */
            public final Class<?> f416550b;

            /* compiled from: TypeList.java */
            public static class a extends TypeDescription.Generic.b.h.d {

                /* renamed from: c, reason: collision with root package name */
                public final Class<?> f416551c;

                /* renamed from: d, reason: collision with root package name */
                public final int f416552d;

                /* renamed from: e, reason: collision with root package name */
                public final Class<?>[] f416553e;

                /* renamed from: f, reason: collision with root package name */
                public transient /* synthetic */ TypeDescription.Generic f416554f;

                public a() {
                    throw null;
                }

                public a(Class cls, int i12, Class[] clsArr, a aVar) {
                    this.f416551c = cls;
                    this.f416552d = i12;
                    this.f416553e = clsArr;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return TypeDescription.d.A0(this.f416553e[this.f416552d]);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final TypeDescription.Generic y0() {
                    TypeDescription.Generic genericA;
                    if (this.f416554f != null) {
                        genericA = null;
                    } else {
                        Type[] genericInterfaces = this.f416551c.getGenericInterfaces();
                        genericA = this.f416553e.length == genericInterfaces.length ? TypeDefinition.Sort.a(genericInterfaces[this.f416552d], z0()) : i5();
                    }
                    if (genericA == null) {
                        return this.f416554f;
                    }
                    this.f416554f = genericA;
                    return genericA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.h.d
                public final TypeDescription.Generic.AnnotationReader z0() {
                    return new TypeDescription.Generic.AnnotationReader.a.e(this.f416551c, this.f416552d);
                }
            }

            public g(Class<?> cls) {
                this.f416550b = cls;
            }

            @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
            public final d f1() {
                return new e(this.f416550b.getInterfaces());
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                Class<?> cls = this.f416550b;
                return new a(cls, i12, cls.getInterfaces(), null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416550b.getInterfaces().length;
            }
        }

        /* compiled from: TypeList.java */
        public static class h extends a {

            /* renamed from: b, reason: collision with root package name */
            public final Method f416555b;

            /* compiled from: TypeList.java */
            public static class a extends TypeDescription.Generic.b.g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Method f416556c;

                /* renamed from: d, reason: collision with root package name */
                public final int f416557d;

                /* renamed from: e, reason: collision with root package name */
                public final Class<?>[] f416558e;

                /* renamed from: f, reason: collision with root package name */
                public transient /* synthetic */ TypeDescription.Generic f416559f;

                public a(Method method, int i12, Class<?>[] clsArr) {
                    this.f416556c = method;
                    this.f416557d = i12;
                    this.f416558e = clsArr;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return TypeDescription.d.A0(this.f416558e[this.f416557d]);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final TypeDescription.Generic y0() {
                    TypeDescription.Generic genericA;
                    if (this.f416559f != null) {
                        genericA = null;
                    } else {
                        Type[] genericExceptionTypes = this.f416556c.getGenericExceptionTypes();
                        genericA = this.f416558e.length == genericExceptionTypes.length ? TypeDefinition.Sort.a(genericExceptionTypes[this.f416557d], z0()) : i5();
                    }
                    if (genericA == null) {
                        return this.f416559f;
                    }
                    this.f416559f = genericA;
                    return genericA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final TypeDescription.Generic.AnnotationReader z0() {
                    return new TypeDescription.Generic.AnnotationReader.a.b(this.f416556c, this.f416557d);
                }
            }

            public h(Method method) {
                this.f416555b = method;
            }

            @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
            public final d f1() {
                return new e(this.f416555b.getExceptionTypes());
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                Method method = this.f416555b;
                return new a(method, i12, method.getExceptionTypes());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416555b.getExceptionTypes().length;
            }
        }

        f N1();

        a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a);

        d f1();

        f h0(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor);

        int p();

        /* compiled from: TypeList.java */
        public static class b extends z.b<TypeDescription.Generic, f> implements f {
            @Override // net.bytebuddy.description.type.d.f
            public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
                return new a.InterfaceC11963a.C11964a(new net.bytebuddy.description.type.e[0]);
            }

            @Override // net.bytebuddy.description.type.d.f
            public final d f1() {
                return new c();
            }

            @Override // net.bytebuddy.description.type.d.f
            public final f h0(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                return new b();
            }

            @Override // net.bytebuddy.description.type.d.f
            public final int p() {
                return 0;
            }

            @Override // net.bytebuddy.description.type.d.f
            public final f N1() {
                return this;
            }
        }
    }
}
