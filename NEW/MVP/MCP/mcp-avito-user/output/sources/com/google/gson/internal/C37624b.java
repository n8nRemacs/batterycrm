package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: $Gson$Types.java */
/* renamed from: com.google.gson.internal.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37624b {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f362018a = new Type[0];

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.b$a */
    public static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Type f362019b;

        public a(Type type) {
            this.f362019b = C37624b.b(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C37624b.e(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f362019b;
        }

        public final int hashCode() {
            return this.f362019b.hashCode();
        }

        public final String toString() {
            return C37624b.j(this.f362019b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.b$b, reason: collision with other inner class name */
    public static final class C10732b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Type f362020b;

        /* renamed from: c, reason: collision with root package name */
        public final Type f362021c;

        /* renamed from: d, reason: collision with root package name */
        public final Type[] f362022d;

        public C10732b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z12 = true;
                boolean z13 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z13) {
                    z12 = false;
                }
                C37623a.a(z12);
            }
            this.f362020b = type == null ? null : C37624b.b(type);
            this.f362021c = C37624b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f362022d = typeArr2;
            int length = typeArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f362022d[i12].getClass();
                C37624b.c(this.f362022d[i12]);
                Type[] typeArr3 = this.f362022d;
                typeArr3[i12] = C37624b.b(typeArr3[i12]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C37624b.e(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f362022d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f362020b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f362021c;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f362022d) ^ this.f362021c.hashCode();
            Type type = this.f362020b;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f362022d;
            int length = typeArr.length;
            Type type = this.f362021c;
            if (length == 0) {
                return C37624b.j(type);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(C37624b.j(type));
            sb2.append("<");
            sb2.append(C37624b.j(typeArr[0]));
            for (int i12 = 1; i12 < length; i12++) {
                sb2.append(", ");
                sb2.append(C37624b.j(typeArr[i12]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.b$c */
    public static final class c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Type f362023b;

        /* renamed from: c, reason: collision with root package name */
        public final Type f362024c;

        public c(Type[] typeArr, Type[] typeArr2) {
            C37623a.a(typeArr2.length <= 1);
            C37623a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C37624b.c(typeArr[0]);
                this.f362024c = null;
                this.f362023b = C37624b.b(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            C37624b.c(typeArr2[0]);
            C37623a.a(typeArr[0] == Object.class);
            this.f362024c = C37624b.b(typeArr2[0]);
            this.f362023b = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C37624b.e(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f362024c;
            return type != null ? new Type[]{type} : C37624b.f362018a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f362023b};
        }

        public final int hashCode() {
            Type type = this.f362024c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f362023b.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f362024c;
            if (type != null) {
                return "? super " + C37624b.j(type);
            }
            Type type2 = this.f362023b;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C37624b.j(type2);
        }
    }

    public C37624b() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    public static Type b(Type type) {
        if (type instanceof Class) {
            Class aVar = (Class) type;
            if (aVar.isArray()) {
                aVar = new a(b(aVar.getComponentType()));
            }
            return aVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C10732b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void c(Type type) {
        C37623a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean d(Type type, Type type2) {
        return type == type2 || (type != null && type.equals(type2));
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i12 = 0; i12 < length; i12++) {
                Class<?> cls3 = interfaces[i12];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i12];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i12], interfaces[i12], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C37623a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static ParameterizedType h(Type type, Type... typeArr) {
        return new C10732b(null, type, typeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[EDGE_INSN: B:86:0x013e->B:80:0x013e BREAK  A[LOOP:0: B:3:0x0004->B:89:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:3:0x0004->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.gson.internal.b$c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.gson.internal.b$c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type i(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C37624b.i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static String j(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
