package net.bytebuddy.description.type;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessController;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.bytebuddy.description.c;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* loaded from: classes8.dex */
public interface TypeDefinition extends net.bytebuddy.description.d, c.e, Iterable<TypeDefinition> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Sort {

        /* renamed from: b, reason: collision with root package name */
        public static final Sort f416307b;

        /* renamed from: c, reason: collision with root package name */
        public static final Sort f416308c;

        /* renamed from: d, reason: collision with root package name */
        public static final Sort f416309d;

        /* renamed from: e, reason: collision with root package name */
        public static final Sort f416310e;

        /* renamed from: f, reason: collision with root package name */
        public static final Sort f416311f;

        /* renamed from: g, reason: collision with root package name */
        public static final Sort f416312g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f416313h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Sort[] f416314i;

        /* renamed from: j, reason: collision with root package name */
        public static final boolean f416315j;

        @JavaDispatcher.i("java.lang.reflect.AnnotatedType")
        public interface a {
            @JavaDispatcher.e
            @JavaDispatcher.i("isInstance")
            boolean a();

            @JavaDispatcher.i("getType")
            Type getType();
        }

        static {
            try {
                Class.forName("java.security.AccessController", false, null);
                f416315j = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                f416315j = false;
            } catch (SecurityException unused2) {
                f416315j = true;
            }
            Sort sort = new Sort("NON_GENERIC", 0);
            f416307b = sort;
            Sort sort2 = new Sort("GENERIC_ARRAY", 1);
            f416308c = sort2;
            Sort sort3 = new Sort("PARAMETERIZED", 2);
            f416309d = sort3;
            Sort sort4 = new Sort("WILDCARD", 3);
            f416310e = sort4;
            Sort sort5 = new Sort("VARIABLE", 4);
            f416311f = sort5;
            Sort sort6 = new Sort("VARIABLE_SYMBOLIC", 5);
            f416312g = sort6;
            f416314i = new Sort[]{sort, sort2, sort3, sort4, sort5, sort6};
            JavaDispatcher javaDispatcherA = JavaDispatcher.a(a.class);
            f416313h = (a) (f416315j ? AccessController.doPrivileged(javaDispatcherA) : javaDispatcherA.run());
        }

        public Sort() {
            throw null;
        }

        public static TypeDescription.Generic.a a(Type type, TypeDescription.Generic.AnnotationReader annotationReader) {
            if (type instanceof Class) {
                return new TypeDescription.Generic.d.b((Class) type, annotationReader);
            }
            if (type instanceof GenericArrayType) {
                return new TypeDescription.Generic.c.a((GenericArrayType) type, annotationReader);
            }
            if (type instanceof ParameterizedType) {
                return new TypeDescription.Generic.OfParameterizedType.b((ParameterizedType) type, annotationReader);
            }
            if (type instanceof TypeVariable) {
                return new TypeDescription.Generic.e.a((TypeVariable) type, annotationReader);
            }
            if (type instanceof WildcardType) {
                return new TypeDescription.Generic.f.a((WildcardType) type, annotationReader);
            }
            throw new IllegalArgumentException("Unknown type: " + type);
        }

        public static Sort valueOf(String str) {
            return (Sort) Enum.valueOf(Sort.class, str);
        }

        public static Sort[] values() {
            return (Sort[]) f416314i.clone();
        }

        public final boolean b() {
            return this == f416307b;
        }

        public final boolean c() {
            return this == f416311f || this == f416312g;
        }
    }

    public static class a implements Iterator<TypeDefinition> {

        /* renamed from: b, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.d
        public Object f416316b;

        public a(TypeDefinition typeDefinition) {
            this.f416316b = typeDefinition;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f416316b != null;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, net.bytebuddy.description.type.TypeDefinition] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, net.bytebuddy.description.type.TypeDefinition] */
        @Override // java.util.Iterator
        public final TypeDefinition next() {
            if (!hasNext()) {
                throw new NoSuchElementException("End of type hierarchy");
            }
            try {
                ?? r02 = this.f416316b;
                this.f416316b = r02.C3();
                return r02;
            } catch (Throwable th2) {
                this.f416316b = this.f416316b.C3();
                throw th2;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    boolean A();

    @net.bytebuddy.utility.nullability.b
    TypeDescription.Generic C3();

    d.f J0();

    TypeDescription.Generic P0();

    boolean Q2(Class cls);

    TypeDescription f5();

    String getTypeName();

    @net.bytebuddy.utility.nullability.b
    TypeDefinition m();

    Sort o();

    StackSize p();

    net.bytebuddy.description.method.b<?> q();

    boolean w2();

    boolean w5();

    net.bytebuddy.description.field.b<?> x();
}
