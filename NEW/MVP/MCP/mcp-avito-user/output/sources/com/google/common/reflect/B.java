package com.google.common.reflect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.base.M;
import com.google.common.base.O;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.O4;
import com.google.common.collect.W1;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: Types.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.base.C f360429a = new com.google.common.base.C(", ").e();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Types.java */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360430b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f360431c = {new C10688a("OWNED_BY_ENCLOSING_CLASS", 0, null), new b("LOCAL_CLASS_HAS_NO_OWNER", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF7;

        /* compiled from: Types.java */
        /* renamed from: com.google.common.reflect.B$a$a, reason: collision with other inner class name */
        public enum C10688a extends a {
            @Override // com.google.common.reflect.B.a
            @I41.a
            public final Class<?> a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* compiled from: Types.java */
        public enum b extends a {
            @Override // com.google.common.reflect.B.a
            @I41.a
            public final Class<?> a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        static {
            new D();
            ParameterizedType parameterizedType = (ParameterizedType) D.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            for (a aVar : values()) {
                if (aVar.a(C.class) == parameterizedType.getOwnerType()) {
                    f360430b = aVar;
                    return;
                }
            }
            throw new AssertionError();
        }

        public a() {
            throw null;
        }

        public a(String str, int i12, A a12) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360431c.clone();
        }

        @I41.a
        public abstract Class<?> a(Class<?> cls);
    }

    /* compiled from: Types.java */
    public static final class b implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Type f360432b;

        public b(Type type) {
            this.f360432b = c.f360435d.d(type);
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return com.google.common.base.F.a(this.f360432b, ((GenericArrayType) obj).getGenericComponentType());
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f360432b;
        }

        public final int hashCode() {
            return this.f360432b.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            com.google.common.base.C c12 = B.f360429a;
            Type type = this.f360432b;
            return AK.c.s(sb2, type instanceof Class ? ((Class) type).getName() : type.toString(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Types.java */
    public static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        public static final b f360433b;

        /* renamed from: c, reason: collision with root package name */
        public static final C10689c f360434c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f360435d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ c[] f360436e;

        /* compiled from: Types.java */
        public enum a extends c {
            @Override // com.google.common.reflect.B.c
            public final Type a(Type type) {
                return new b(type);
            }

            @Override // com.google.common.reflect.B.c
            public final Type d(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new b(cls.getComponentType()) : type;
            }
        }

        /* compiled from: Types.java */
        public enum b extends c {
            @Override // com.google.common.reflect.B.c
            public final Type a(Type type) {
                if (!(type instanceof Class)) {
                    return new b(type);
                }
                com.google.common.base.C c12 = B.f360429a;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.B.c
            public final Type d(Type type) {
                type.getClass();
                return type;
            }
        }

        /* compiled from: Types.java */
        /* renamed from: com.google.common.reflect.B$c$c, reason: collision with other inner class name */
        public enum C10689c extends c {
            @Override // com.google.common.reflect.B.c
            public final Type a(Type type) {
                return c.f360433b.a(type);
            }

            @Override // com.google.common.reflect.B.c
            public final String b(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e12) {
                    throw new RuntimeException(e12);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(e13);
                }
            }

            @Override // com.google.common.reflect.B.c
            public final Type d(Type type) {
                c.f360433b.getClass();
                type.getClass();
                return type;
            }
        }

        /* compiled from: Types.java */
        public enum d extends c {
            @Override // com.google.common.reflect.B.c
            public final Type a(Type type) {
                c.f360434c.getClass();
                return c.f360433b.a(type);
            }

            @Override // com.google.common.reflect.B.c
            public final String b(Type type) {
                return c.f360434c.b(type);
            }

            @Override // com.google.common.reflect.B.c
            public final Type d(Type type) {
                c.f360434c.d(type);
                return type;
            }
        }

        /* compiled from: Types.java */
        public class e extends m<Map.Entry<String, int[][]>> {
        }

        /* compiled from: Types.java */
        public class f extends m<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0, null);
            b bVar = new b("JAVA7", 1, null);
            f360433b = bVar;
            C10689c c10689c = new C10689c("JAVA8", 2, null);
            f360434c = c10689c;
            d dVar = new d("JAVA9", 3, null);
            f360436e = new c[]{aVar, bVar, c10689c, dVar};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().a().toString().contains("java.util.Map.java.util.Map")) {
                    f360435d = c10689c;
                    return;
                } else {
                    f360435d = dVar;
                    return;
                }
            }
            if (new f().a() instanceof Class) {
                f360435d = bVar;
            } else {
                f360435d = aVar;
            }
        }

        public c() {
            throw null;
        }

        public c(String str, int i12, A a12) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360436e.clone();
        }

        public abstract Type a(Type type);

        public String b(Type type) {
            com.google.common.base.C c12 = B.f360429a;
            return type instanceof Class ? ((Class) type).getName() : type.toString();
        }

        public final AbstractC37401r1<Type> c(Type[] typeArr) {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            for (Type type : typeArr) {
                aVar.g(d(type));
            }
            return aVar.i();
        }

        public abstract Type d(Type type);
    }

    /* compiled from: Types.java */
    public static final class d<X> {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f360437a = !d.class.getTypeParameters()[0].equals(B.d(d.class, "X", new Type[0]));
    }

    /* compiled from: Types.java */
    public static final class e implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public final Type f360438b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37401r1<Type> f360439c;

        /* renamed from: d, reason: collision with root package name */
        public final Class<?> f360440d;

        public e(@I41.a Type type, Class<?> cls, Type[] typeArr) {
            cls.getClass();
            M.g(typeArr.length == cls.getTypeParameters().length);
            B.b(typeArr, "type parameter");
            this.f360438b = type;
            this.f360440d = cls;
            this.f360439c = c.f360435d.c(typeArr);
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!this.f360440d.equals(parameterizedType.getRawType())) {
                return false;
            }
            if (!com.google.common.base.F.a(this.f360438b, parameterizedType.getOwnerType())) {
                return false;
            }
            AbstractC37401r1<Type> abstractC37401r1 = this.f360439c;
            com.google.common.base.C c12 = B.f360429a;
            return Arrays.equals((Type[]) abstractC37401r1.toArray(new Type[0]), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            AbstractC37401r1<Type> abstractC37401r1 = this.f360439c;
            com.google.common.base.C c12 = B.f360429a;
            return (Type[]) abstractC37401r1.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.ParameterizedType
        @I41.a
        public final Type getOwnerType() {
            return this.f360438b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f360440d;
        }

        public final int hashCode() {
            Type type = this.f360438b;
            return ((type == null ? 0 : type.hashCode()) ^ this.f360439c.hashCode()) ^ this.f360440d.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            Type type = this.f360438b;
            if (type != null) {
                c cVar = c.f360435d;
                cVar.getClass();
                if (!(cVar instanceof c.d)) {
                    sb2.append(cVar.b(type));
                    sb2.append('.');
                }
            }
            sb2.append(this.f360440d.getName());
            sb2.append('<');
            com.google.common.base.C c12 = B.f360429a;
            AbstractC37401r1<Type> abstractC37401r1 = this.f360439c;
            final c cVar2 = c.f360435d;
            Objects.requireNonNull(cVar2);
            Iterable iterableH = W1.h(abstractC37401r1, new InterfaceC37276u() { // from class: com.google.common.reflect.E
                @Override // com.google.common.base.InterfaceC37276u
                public final Object apply(Object obj) {
                    return cVar2.b((Type) obj);
                }
            });
            c12.getClass();
            Iterator it = iterableH.iterator();
            StringBuilder sb3 = new StringBuilder();
            c12.b(sb3, it);
            sb2.append(sb3.toString());
            sb2.append('>');
            return sb2.toString();
        }
    }

    /* compiled from: Types.java */
    public static final class f<D extends GenericDeclaration> {

        /* renamed from: a, reason: collision with root package name */
        public final D f360441a;

        /* renamed from: b, reason: collision with root package name */
        public final String f360442b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37401r1<Type> f360443c;

        public f(D d12, String str, Type[] typeArr) {
            B.b(typeArr, "bound for type variable");
            d12.getClass();
            this.f360441a = d12;
            str.getClass();
            this.f360442b = str;
            this.f360443c = AbstractC37401r1.w(typeArr);
        }

        public final boolean equals(@I41.a Object obj) {
            boolean z12 = d.f360437a;
            D d12 = this.f360441a;
            String str = this.f360442b;
            if (!z12) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return str.equals(typeVariable.getName()) && d12.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof g)) {
                return false;
            }
            f<?> fVar = ((g) Proxy.getInvocationHandler(obj)).f360445a;
            return str.equals(fVar.f360442b) && d12.equals(fVar.f360441a) && this.f360443c.equals(fVar.f360443c);
        }

        public final int hashCode() {
            return this.f360441a.hashCode() ^ this.f360442b.hashCode();
        }

        public final String toString() {
            return this.f360442b;
        }
    }

    /* compiled from: Types.java */
    public static final class g implements InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        public static final AbstractC37412t1<String, Method> f360444b;

        /* renamed from: a, reason: collision with root package name */
        public final f<?> f360445a;

        static {
            AbstractC37412t1.b bVar = new AbstractC37412t1.b();
            for (Method method : f.class.getMethods()) {
                if (method.getDeclaringClass().equals(f.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    bVar.c(method.getName(), method);
                }
            }
            f360444b = bVar.a(false);
        }

        public g(f<?> fVar) {
            this.f360445a = fVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        @I41.a
        public final Object invoke(Object obj, Method method, @I41.a Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f360444b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f360445a, objArr);
            } catch (InvocationTargetException e12) {
                throw e12.getCause();
            }
        }
    }

    /* compiled from: Types.java */
    public static final class h implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37401r1<Type> f360446b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37401r1<Type> f360447c;

        public h(Type[] typeArr, Type[] typeArr2) {
            B.b(typeArr, "lower bound for wildcard");
            B.b(typeArr2, "upper bound for wildcard");
            c cVar = c.f360435d;
            this.f360446b = cVar.c(typeArr);
            this.f360447c = cVar.c(typeArr2);
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f360446b.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f360447c.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            AbstractC37401r1<Type> abstractC37401r1 = this.f360446b;
            com.google.common.base.C c12 = B.f360429a;
            return (Type[]) abstractC37401r1.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            AbstractC37401r1<Type> abstractC37401r1 = this.f360447c;
            com.google.common.base.C c12 = B.f360429a;
            return (Type[]) abstractC37401r1.toArray(new Type[0]);
        }

        public final int hashCode() {
            return this.f360446b.hashCode() ^ this.f360447c.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("?");
            O4<Type> o4ListIterator = this.f360446b.listIterator(0);
            while (o4ListIterator.hasNext()) {
                Type next = o4ListIterator.next();
                sb2.append(" super ");
                sb2.append(c.f360435d.b(next));
            }
            AbstractC37401r1<Type> abstractC37401r1 = this.f360447c;
            com.google.common.base.C c12 = B.f360429a;
            for (Type type : W1.c(abstractC37401r1, O.h(O.e(Object.class)))) {
                sb2.append(" extends ");
                sb2.append(c.f360435d.b(type));
            }
            return sb2.toString();
        }
    }

    public static Type a(Type[] typeArr) {
        for (Type type : typeArr) {
            type.getClass();
            AtomicReference atomicReference = new AtomicReference();
            new A(atomicReference).a(type);
            Type type2 = (Type) atomicReference.get();
            if (type2 != null) {
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new h(new Type[0], new Type[]{type2});
            }
        }
        return null;
    }

    public static void b(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                M.h(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Type c(Type type) {
        if (!(type instanceof WildcardType)) {
            return c.f360435d.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        M.d("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new h(new Type[]{c(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        M.d("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new h(new Type[0], new Type[]{c(upperBounds[0])});
    }

    public static <D extends GenericDeclaration> TypeVariable<D> d(D d12, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        g gVar = new g(new f(d12, str, typeArr));
        M.f("%s is not an interface", TypeVariable.class.isInterface(), TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, gVar));
    }

    public static ParameterizedType e(@I41.a Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return new e(a.f360430b.a(cls), cls, typeArr);
        }
        M.f("Owner type for unenclosed %s", cls.getEnclosingClass() != null, cls);
        return new e(type, cls, typeArr);
    }
}
