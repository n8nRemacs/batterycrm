package com.google.common.reflect;

import com.google.common.base.M;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.reflect.B;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TypeResolver.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final b f360455a;

    /* compiled from: TypeResolver.java */
    public static final class a extends z {

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f360456b = new HashMap();

        @Override // com.google.common.reflect.z
        public final void b(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.z
        public final void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            M.q(typeParameters.length == actualTypeArguments.length);
            for (int i12 = 0; i12 < typeParameters.length; i12++) {
                c cVar = new c(typeParameters[i12]);
                Type type = actualTypeArguments[i12];
                HashMap map = this.f360456b;
                if (!map.containsKey(cVar)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            map.put(cVar, type);
                            break;
                        }
                        boolean z12 = type2 instanceof TypeVariable;
                        c cVar2 = null;
                        if (z12 ? cVar.a((TypeVariable) type2) : false) {
                            while (type != null) {
                                type = (Type) map.remove(type instanceof TypeVariable ? new c((TypeVariable) type) : null);
                            }
                        } else {
                            if (z12) {
                                cVar2 = new c((TypeVariable) type2);
                            }
                            type2 = (Type) map.get(cVar2);
                        }
                    }
                }
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.z
        public final void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.z
        public final void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    /* compiled from: TypeResolver.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final TypeVariable<?> f360458a;

        public c(TypeVariable<?> typeVariable) {
            typeVariable.getClass();
            this.f360458a = typeVariable;
        }

        public final boolean a(TypeVariable<?> typeVariable) {
            TypeVariable<?> typeVariable2 = this.f360458a;
            return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof c) {
                return a(((c) obj).f360458a);
            }
            return false;
        }

        public final int hashCode() {
            TypeVariable<?> typeVariable = this.f360458a;
            return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
        }

        public final String toString() {
            return this.f360458a.toString();
        }
    }

    /* compiled from: TypeResolver.java */
    public static class d {
        static {
            new d();
        }

        public /* synthetic */ d(AtomicInteger atomicInteger, o oVar) {
            this(atomicInteger);
        }

        public d() {
            this(new AtomicInteger());
        }

        public d(AtomicInteger atomicInteger) {
        }
    }

    public /* synthetic */ p(b bVar, o oVar) {
        this(bVar);
    }

    public final Type a(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            b bVar = this.f360455a;
            bVar.getClass();
            return bVar.a(typeVariable, new q(typeVariable, bVar));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            return B.e(ownerType == null ? null : a(ownerType), (Class) a(parameterizedType.getRawType()), b(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof GenericArrayType) {
            return B.c(a(((GenericArrayType) type).getGenericComponentType()));
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new B.h(b(wildcardType.getLowerBounds()), b(wildcardType.getUpperBounds()));
    }

    public final Type[] b(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i12 = 0; i12 < typeArr.length; i12++) {
            typeArr2[i12] = a(typeArr[i12]);
        }
        return typeArr2;
    }

    /* compiled from: TypeResolver.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC37412t1<c, Type> f360457a;

        public b() {
            this.f360457a = AbstractC37412t1.n();
        }

        public Type a(TypeVariable typeVariable, q qVar) {
            Type type = this.f360457a.get(new c(typeVariable));
            o oVar = null;
            if (type != null) {
                return new p(qVar, oVar).a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrB = new p(qVar, oVar).b(bounds);
            return (B.d.f360437a && Arrays.equals(bounds, typeArrB)) ? typeVariable : B.d(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrB);
        }

        public b(AbstractC37412t1<c, Type> abstractC37412t1) {
            this.f360457a = abstractC37412t1;
        }
    }

    public p() {
        this.f360455a = new b();
    }

    public p(b bVar) {
        this.f360455a = bVar;
    }
}
