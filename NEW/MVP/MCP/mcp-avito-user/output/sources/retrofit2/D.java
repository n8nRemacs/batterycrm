package retrofit2;

import androidx.camera.camera2.internal.G;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;

/* compiled from: Utils.java */
/* loaded from: classes9.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f429945a = new Type[0];

    /* compiled from: Utils.java */
    public static final class a implements GenericArrayType {

        /* renamed from: b, reason: collision with root package name */
        public final Type f429946b;

        public a(Type type) {
            this.f429946b = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && D.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f429946b;
        }

        public final int hashCode() {
            return this.f429946b.hashCode();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder(), D.n(this.f429946b), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    /* compiled from: Utils.java */
    public static final class b implements ParameterizedType {

        /* renamed from: b, reason: collision with root package name */
        @I41.h
        public final Type f429947b;

        /* renamed from: c, reason: collision with root package name */
        public final Type f429948c;

        /* renamed from: d, reason: collision with root package name */
        public final Type[] f429949d;

        public b(@I41.h Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                D.a(type3);
            }
            this.f429947b = type;
            this.f429948c = type2;
            this.f429949d = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && D.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f429949d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @I41.h
        public final Type getOwnerType() {
            return this.f429947b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f429948c;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f429949d) ^ this.f429948c.hashCode();
            Type type = this.f429947b;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f429949d;
            int length = typeArr.length;
            Type type = this.f429948c;
            if (length == 0) {
                return D.n(type);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(D.n(type));
            sb2.append("<");
            sb2.append(D.n(typeArr[0]));
            for (int i12 = 1; i12 < typeArr.length; i12++) {
                sb2.append(", ");
                sb2.append(D.n(typeArr[i12]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: Utils.java */
    public static final class c implements WildcardType {

        /* renamed from: b, reason: collision with root package name */
        public final Type f429950b;

        /* renamed from: c, reason: collision with root package name */
        @I41.h
        public final Type f429951c;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                D.a(typeArr[0]);
                this.f429951c = null;
                this.f429950b = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            D.a(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f429951c = typeArr2[0];
            this.f429950b = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && D.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f429951c;
            return type != null ? new Type[]{type} : D.f429945a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f429950b};
        }

        public final int hashCode() {
            Type type = this.f429951c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f429950b.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f429951c;
            if (type != null) {
                return "? super " + D.n(type);
            }
            Type type2 = this.f429950b;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + D.n(type2);
        }
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean b(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
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
                    return c(cls.getGenericInterfaces()[i12], interfaces[i12], cls2);
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
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i12, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i12 >= 0 && i12 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i12];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbJ = G.j(i12, "Index ", " not in range [0,");
        sbJ.append(actualTypeArguments.length);
        sbJ.append(") for ");
        sbJ.append(parameterizedType);
        throw new IllegalArgumentException(sbJ.toString());
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(@I41.h Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static boolean h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, @I41.h Exception exc, String str, Object... objArr) {
        StringBuilder sbZ = androidx.appcompat.app.r.z(String.format(str, objArr), "\n    for method ");
        sbZ.append(method.getDeclaringClass().getSimpleName());
        sbZ.append(".");
        sbZ.append(method.getName());
        return new IllegalArgumentException(sbZ.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i12, String str, Object... objArr) {
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, " (parameter #");
        sbZ.append(i12 + 1);
        sbZ.append(")");
        return i(method, null, sbZ.toString(), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i12, String str, Object... objArr) {
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, " (parameter #");
        sbZ.append(i12 + 1);
        sbZ.append(")");
        return i(method, exc, sbZ.toString(), objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type l(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.D.l(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void m(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static String n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
