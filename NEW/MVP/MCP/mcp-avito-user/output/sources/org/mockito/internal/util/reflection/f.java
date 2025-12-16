package org.mockito.internal.util.reflection;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: GenericMetadataSupport.java */
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f421755a = new HashMap();

    /* compiled from: GenericMetadataSupport.java */
    public interface a extends Type {
        Type[] b();

        Type c();
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f421756b;

        public b(Class<?> cls) {
            this.f421756b = cls;
            h(cls.getTypeParameters());
            g(cls);
        }

        @Override // org.mockito.internal.util.reflection.f
        public final Class<?> f() {
            return this.f421756b;
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class c extends f {
        @Override // org.mockito.internal.util.reflection.f
        public final Class<?> f() {
            throw null;
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class d extends f {

        /* renamed from: b, reason: collision with root package name */
        public final f f421757b;

        /* renamed from: c, reason: collision with root package name */
        public final int f421758c;

        public d(f fVar, int i12) {
            this.f421757b = fVar;
            this.f421758c = i12;
        }

        @Override // org.mockito.internal.util.reflection.f
        public final Class<?> f() {
            Class<?> clsF = this.f421757b.f();
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < this.f421758c; i12++) {
                sb2.append("[");
            }
            try {
                sb2.append("L");
                sb2.append(clsF.getName());
                sb2.append(";");
                return Class.forName(sb2.toString(), false, clsF.getClassLoader());
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("This was not supposed to happen.", e12);
            }
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f421759b;

        public e(f fVar, Class cls) {
            this.f421759b = cls;
            this.f421755a = fVar.f421755a;
            g(cls);
        }

        @Override // org.mockito.internal.util.reflection.f
        public final Class<?> f() {
            return this.f421759b;
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    /* renamed from: org.mockito.internal.util.reflection.f$f, reason: collision with other inner class name */
    public static class C12235f extends f {

        /* renamed from: b, reason: collision with root package name */
        public final ParameterizedType f421760b;

        public C12235f(f fVar, TypeVariable<?>[] typeVariableArr, ParameterizedType parameterizedType) {
            this.f421760b = parameterizedType;
            this.f421755a = fVar.f421755a;
            h(typeVariableArr);
            i(parameterizedType);
        }

        @Override // org.mockito.internal.util.reflection.f
        public final Class<?> f() {
            return (Class) this.f421760b.getRawType();
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class g implements a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeVariable<?> f421761b;

        public g(TypeVariable<?> typeVariable) {
            this.f421761b = typeVariable;
        }

        @Override // org.mockito.internal.util.reflection.f.a
        public final Type[] b() {
            TypeVariable<?> typeVariable = this.f421761b;
            Type[] typeArr = new Type[typeVariable.getBounds().length - 1];
            System.arraycopy(typeVariable.getBounds(), 1, typeArr, 0, typeVariable.getBounds().length - 1);
            return typeArr;
        }

        @Override // org.mockito.internal.util.reflection.f.a
        public final Type c() {
            return this.f421761b.getBounds()[0];
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f421761b.equals(((g) obj).f421761b);
        }

        public final int hashCode() {
            return this.f421761b.hashCode();
        }

        public final String toString() {
            return "{firstBound=" + c() + ", interfaceBounds=" + Arrays.deepToString(b()) + '}';
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class h extends f {

        /* renamed from: b, reason: collision with root package name */
        public final TypeVariable<?> f421762b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f421763c;

        /* renamed from: d, reason: collision with root package name */
        public List<Type> f421764d;

        public h(f fVar, TypeVariable<?>[] typeVariableArr, TypeVariable<?> typeVariable) {
            this.f421762b = typeVariable;
            this.f421755a = fVar.f421755a;
            h(typeVariableArr);
            for (Type type : typeVariable.getBounds()) {
                i(type);
            }
            h(new TypeVariable[]{typeVariable});
            i(c(typeVariable));
        }

        @Override // org.mockito.internal.util.reflection.f
        public final Class<?>[] e() {
            List<Type> listEmptyList = this.f421764d;
            if (listEmptyList == null) {
                TypeVariable<?> typeVariable = this.f421762b;
                Type typeK = k(typeVariable);
                if (typeK instanceof a) {
                    listEmptyList = Arrays.asList(((a) typeK).b());
                    this.f421764d = listEmptyList;
                } else if (typeK instanceof ParameterizedType) {
                    listEmptyList = Collections.singletonList(typeK);
                    this.f421764d = listEmptyList;
                } else {
                    if (!(typeK instanceof Class)) {
                        throw new MockitoException("Cannot extract extra-interfaces from '" + typeVariable + "' : '" + typeK + "'");
                    }
                    listEmptyList = Collections.emptyList();
                    this.f421764d = listEmptyList;
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Type> it = listEmptyList.iterator();
            while (it.hasNext()) {
                Class<?> clsB = b(it.next());
                if (!f().equals(clsB)) {
                    arrayList.add(clsB);
                }
            }
            return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
        }

        @Override // org.mockito.internal.util.reflection.f
        public final Class<?> f() {
            if (this.f421763c == null) {
                this.f421763c = b(this.f421762b);
            }
            return this.f421763c;
        }

        public final Type k(Type type) {
            if (type instanceof TypeVariable) {
                return k((Type) this.f421755a.get(type));
            }
            if (!(type instanceof a)) {
                return type;
            }
            Type typeK = k(((a) type).c());
            return !(typeK instanceof a) ? type : typeK;
        }
    }

    /* compiled from: GenericMetadataSupport.java */
    public static class i implements a {

        /* renamed from: b, reason: collision with root package name */
        public final WildcardType f421765b;

        public i(WildcardType wildcardType) {
            this.f421765b = wildcardType;
        }

        @Override // org.mockito.internal.util.reflection.f.a
        public final Type[] b() {
            return new Type[0];
        }

        @Override // org.mockito.internal.util.reflection.f.a
        public final Type c() {
            WildcardType wildcardType = this.f421765b;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f421765b.equals(((g) obj).f421761b);
        }

        public final int hashCode() {
            return this.f421765b.hashCode();
        }

        public final String toString() {
            return "{firstBound=" + c() + ", interfaceBounds=[]}";
        }
    }

    public static a a(TypeVariable typeVariable) {
        return typeVariable.getBounds()[0] instanceof TypeVariable ? a((TypeVariable) typeVariable.getBounds()[0]) : new g(typeVariable);
    }

    public static f d(Class cls) {
        Y71.a.a(cls, "type");
        return new b(cls);
    }

    public final Class<?> b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof a) {
            return b(((a) type).c());
        }
        if (type instanceof TypeVariable) {
            return b((Type) this.f421755a.get(type));
        }
        throw new MockitoException("Raw extraction not supported for : '" + type + "'");
    }

    public final Type c(TypeVariable<?> typeVariable) {
        Type type = (Type) this.f421755a.get(typeVariable);
        return type instanceof TypeVariable ? c((TypeVariable) type) : type;
    }

    public Class<?>[] e() {
        return new Class[0];
    }

    public abstract Class<?> f();

    public final void g(Type type) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(type);
        while (!linkedList.isEmpty()) {
            Type type2 = (Type) linkedList.poll();
            if (type2 != null && !hashSet.contains(type2)) {
                i(type2);
                hashSet.add(type2);
                Class<?> clsB = b(type2);
                linkedList.add(clsB.getGenericSuperclass());
                linkedList.addAll(Arrays.asList(clsB.getGenericInterfaces()));
            }
        }
    }

    public final void h(TypeVariable<?>[] typeVariableArr) {
        for (TypeVariable<?> typeVariable : typeVariableArr) {
            if (!this.f421755a.containsKey(typeVariable)) {
                this.f421755a.put(typeVariable, a(typeVariable));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.reflect.Type r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type r0 = r8.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()
            r1 = 0
        L16:
            int r2 = r8.length
            if (r1 >= r2) goto L6b
            r2 = r0[r1]
            r3 = r8[r1]
            boolean r4 = r3 instanceof java.lang.reflect.TypeVariable
            if (r4 == 0) goto L3e
            r4 = r3
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.util.HashMap r5 = r7.f421755a
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto L35
            java.util.HashMap r5 = r7.f421755a
            org.mockito.internal.util.reflection.f$a r6 = a(r4)
            r5.put(r4, r6)
        L35:
            java.util.HashMap r4 = r7.f421755a
            boolean r4 = r4.containsKey(r2)
            if (r4 == 0) goto L3e
            goto L68
        L3e:
            boolean r4 = r3 instanceof java.lang.reflect.WildcardType
            if (r4 == 0) goto L61
            java.util.HashMap r4 = r7.f421755a
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            org.mockito.internal.util.reflection.f$i r5 = new org.mockito.internal.util.reflection.f$i
            r5.<init>(r3)
            java.lang.reflect.Type r3 = r5.c()
            boolean r3 = r3 instanceof java.lang.reflect.TypeVariable
            if (r3 == 0) goto L5d
            java.lang.reflect.Type r3 = r5.c()
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            org.mockito.internal.util.reflection.f$a r5 = a(r3)
        L5d:
            r4.put(r2, r5)
            goto L68
        L61:
            if (r2 == r3) goto L68
            java.util.HashMap r4 = r7.f421755a
            r4.put(r2, r3)
        L68:
            int r1 = r1 + 1
            goto L16
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.util.reflection.f.i(java.lang.reflect.Type):void");
    }

    public final f j(Method method) {
        f hVar;
        f eVar;
        Type genericReturnType = method.getGenericReturnType();
        int i12 = 0;
        while (genericReturnType instanceof GenericArrayType) {
            i12++;
            genericReturnType = ((GenericArrayType) genericReturnType).getGenericComponentType();
        }
        if (genericReturnType instanceof Class) {
            eVar = new e(this, (Class) genericReturnType);
        } else {
            if (genericReturnType instanceof ParameterizedType) {
                hVar = new C12235f(this, method.getTypeParameters(), (ParameterizedType) genericReturnType);
            } else {
                if (!(genericReturnType instanceof TypeVariable)) {
                    throw new MockitoException("Ouch, it shouldn't happen, type '" + genericReturnType.getClass().getCanonicalName() + "' on method : '" + method.toGenericString() + "' is not supported : " + genericReturnType);
                }
                hVar = new h(this, method.getTypeParameters(), (TypeVariable) genericReturnType);
            }
            eVar = hVar;
        }
        return i12 == 0 ? eVar : new d(eVar, i12);
    }
}
