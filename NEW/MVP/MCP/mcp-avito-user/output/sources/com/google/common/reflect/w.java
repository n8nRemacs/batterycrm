package com.google.common.reflect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.base.M;
import com.google.common.base.N;
import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.AbstractC37429w3;
import com.google.common.collect.AbstractC37431x0;
import com.google.common.collect.C37414t3;
import com.google.common.collect.C37423v2;
import com.google.common.collect.H1;
import com.google.common.collect.O4;
import com.google.common.collect.U0;
import com.google.common.collect.W1;
import com.google.common.reflect.p;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: TypeToken.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
public abstract class w<T> extends m<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* renamed from: b, reason: collision with root package name */
    public final Type f360461b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient p f360462c;

    /* compiled from: TypeToken.java */
    public class a extends z {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H1.a f360463b;

        public a(H1.a aVar) {
            this.f360463b = aVar;
        }

        @Override // com.google.common.reflect.z
        public final void b(Class<?> cls) {
            this.f360463b.b(cls);
        }

        @Override // com.google.common.reflect.z
        public final void c(GenericArrayType genericArrayType) {
            Class<? super T> clsC = new e(genericArrayType.getGenericComponentType(), null).c();
            com.google.common.base.C c12 = B.f360429a;
            this.f360463b.b(Array.newInstance(clsC, 0).getClass());
        }

        @Override // com.google.common.reflect.z
        public final void d(ParameterizedType parameterizedType) {
            this.f360463b.b((Class) parameterizedType.getRawType());
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

    /* compiled from: TypeToken.java */
    public static class b {
    }

    /* compiled from: TypeToken.java */
    public final class c extends w<T>.h {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public transient H1<w<? super T>> f360464d;

        public c(t tVar) {
            super();
        }

        private Object readResolve() {
            w wVar = w.this;
            wVar.getClass();
            new h();
            return new c(null);
        }

        @Override // com.google.common.reflect.w.h, com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: b0 */
        public final Set<w<? super T>> X() {
            H1<w<? super T>> h12 = this.f360464d;
            if (h12 != null) {
                return h12;
            }
            f.a aVar = f.f360469a;
            aVar.getClass();
            AbstractC37431x0 abstractC37431x0A = AbstractC37431x0.a(new x(aVar).b(AbstractC37401r1.E(w.this)));
            H1<w<? super T>> h1D = AbstractC37431x0.a(W1.c(abstractC37431x0A.b(), g.f360472b)).d();
            this.f360464d = h1D;
            return h1D;
        }

        @Override // com.google.common.reflect.w.h
        public final Set<Class<? super T>> c0() {
            throw null;
        }
    }

    /* compiled from: TypeToken.java */
    public final class d extends w<T>.h {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        public final transient w<T>.h f360466d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public transient H1<w<? super T>> f360467e;

        public d(w<T>.h hVar) {
            super();
            this.f360466d = hVar;
        }

        private Object readResolve() {
            w wVar = w.this;
            wVar.getClass();
            return new d(new h());
        }

        @Override // com.google.common.reflect.w.h, com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: b0 */
        public final Set<w<? super T>> X() {
            H1<w<? super T>> h12 = this.f360467e;
            if (h12 != null) {
                return h12;
            }
            AbstractC37431x0 abstractC37431x0A = AbstractC37431x0.a(this.f360466d);
            H1<w<? super T>> h1D = AbstractC37431x0.a(W1.c(abstractC37431x0A.b(), g.f360473c)).d();
            this.f360467e = h1D;
            return h1D;
        }

        @Override // com.google.common.reflect.w.h
        public final Set<Class<? super T>> c0() {
            throw null;
        }
    }

    /* compiled from: TypeToken.java */
    public static final class e<T> extends w<T> {
        private static final long serialVersionUID = 0;
    }

    /* compiled from: TypeToken.java */
    public static abstract class f<K> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f360469a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f360470b = new b();

        /* compiled from: TypeToken.java */
        public class a extends f<w<?>> {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.w.f
            public final Iterable<? extends w<?>> c(w<?> wVar) {
                w<?> wVar2 = wVar;
                Type type = wVar2.f360461b;
                if (type instanceof TypeVariable) {
                    return w.b(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return w.b(((WildcardType) type).getUpperBounds());
                }
                O4<Object> o42 = AbstractC37401r1.f359977c;
                AbstractC37401r1.a aVar = new AbstractC37401r1.a();
                for (Type type2 : wVar2.c().getGenericInterfaces()) {
                    aVar.g(wVar2.f(type2));
                }
                return aVar.i();
            }

            @Override // com.google.common.reflect.w.f
            public final Class d(w<?> wVar) {
                return wVar.c();
            }

            @Override // com.google.common.reflect.w.f
            @I41.a
            public final w<?> e(w<?> wVar) {
                e eVar;
                w<?> wVar2 = wVar;
                Type type = wVar2.f360461b;
                if (type instanceof TypeVariable) {
                    eVar = new e(((TypeVariable) type).getBounds()[0], null);
                    if (eVar.c().isInterface()) {
                        return null;
                    }
                } else {
                    if (!(type instanceof WildcardType)) {
                        Type genericSuperclass = wVar2.c().getGenericSuperclass();
                        if (genericSuperclass == null) {
                            return null;
                        }
                        return wVar2.f(genericSuperclass);
                    }
                    eVar = new e(((WildcardType) type).getUpperBounds()[0], null);
                    if (eVar.c().isInterface()) {
                        return null;
                    }
                }
                return eVar;
            }
        }

        /* compiled from: TypeToken.java */
        public class b extends f<Class<?>> {
            public b() {
                super(null);
            }

            @Override // com.google.common.reflect.w.f
            public final Iterable<? extends Class<?>> c(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.w.f
            public final Class d(Class<?> cls) {
                return cls;
            }

            @Override // com.google.common.reflect.w.f
            @I41.a
            public final Class<?> e(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        /* compiled from: TypeToken.java */
        public static class c<K> extends f<K> {

            /* renamed from: c, reason: collision with root package name */
            public final f<K> f360471c;

            public c(f<K> fVar) {
                super(null);
                this.f360471c = fVar;
            }

            @Override // com.google.common.reflect.w.f
            public Iterable<? extends K> c(K k12) {
                return this.f360471c.c(k12);
            }

            @Override // com.google.common.reflect.w.f
            public final Class<?> d(K k12) {
                return this.f360471c.d(k12);
            }

            @Override // com.google.common.reflect.w.f
            @I41.a
            public final K e(K k12) {
                return this.f360471c.e(k12);
            }
        }

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final int a(Object obj, HashMap map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = d(obj).isInterface();
            Iterator<? extends K> it = c(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, a(it.next(), map));
            }
            K kE2 = e(obj);
            int iMax2 = iMax;
            if (kE2 != null) {
                iMax2 = Math.max(iMax, a(kE2, map));
            }
            int i12 = iMax2 + 1;
            map.put(obj, Integer.valueOf(i12));
            return i12;
        }

        public AbstractC37401r1 b(AbstractC37378n1 abstractC37378n1) {
            HashMap map = new HashMap();
            Iterator<E> it = abstractC37378n1.iterator();
            while (it.hasNext()) {
                a(it.next(), map);
            }
            y yVar = new y(AbstractC37429w3.d().h(), map);
            Set<K> setKeySet = map.keySet();
            O4<Object> o42 = AbstractC37401r1.f359977c;
            Set<K> set = setKeySet;
            Object[] array = (set instanceof Collection ? set : C37423v2.b(set.iterator())).toArray();
            C37414t3.a(array.length, array);
            Arrays.sort(array, yVar);
            return AbstractC37401r1.r(array.length, array);
        }

        public abstract Iterable<? extends K> c(K k12);

        public abstract Class<?> d(K k12);

        @I41.a
        public abstract K e(K k12);

        public /* synthetic */ f(t tVar) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TypeToken.java */
    public static abstract class g implements N<w<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360472b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f360473c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ g[] f360474d;

        /* compiled from: TypeToken.java */
        public enum a extends g {
            @Override // com.google.common.base.N
            public final boolean apply(w<?> wVar) {
                Type type = wVar.f360461b;
                return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
            }
        }

        /* compiled from: TypeToken.java */
        public enum b extends g {
            @Override // com.google.common.base.N
            public final boolean apply(w<?> wVar) {
                return wVar.c().isInterface();
            }
        }

        static {
            a aVar = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0, null);
            f360472b = aVar;
            b bVar = new b("INTERFACE_ONLY", 1, null);
            f360473c = bVar;
            f360474d = new g[]{aVar, bVar};
        }

        public g() {
            throw null;
        }

        public g(String str, int i12, t tVar) {
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f360474d.clone();
        }
    }

    /* compiled from: TypeToken.java */
    public class h extends U0<w<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public transient H1<w<? super T>> f360475b;

        public h() {
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: b0 */
        public Set<w<? super T>> X() {
            H1<w<? super T>> h12 = this.f360475b;
            if (h12 != null) {
                return h12;
            }
            f.a aVar = f.f360469a;
            aVar.getClass();
            AbstractC37431x0 abstractC37431x0A = AbstractC37431x0.a(aVar.b(AbstractC37401r1.E(w.this)));
            H1<w<? super T>> h1D = AbstractC37431x0.a(W1.c(abstractC37431x0A.b(), g.f360472b)).d();
            this.f360475b = h1D;
            return h1D;
        }

        public Set<Class<? super T>> c0() {
            return H1.v(f.f360470b.b(w.this.d()));
        }
    }

    public w() {
        Type typeA = a();
        this.f360461b = typeA;
        M.p("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(typeA instanceof TypeVariable), typeA);
    }

    public static AbstractC37401r1 b(Type[] typeArr) {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        for (Type type : typeArr) {
            e eVar = new e(type, null);
            if (eVar.c().isInterface()) {
                aVar.g(eVar);
            }
        }
        return aVar.i();
    }

    public static <T> w<T> e(Class<T> cls) {
        return new e(cls, null);
    }

    public final Class<? super T> c() {
        return d().iterator().next();
    }

    public final H1<Class<? super T>> d() {
        int i12 = H1.f359346d;
        H1.a aVar = new H1.a();
        new a(aVar).a(this.f360461b);
        return aVar.j();
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj instanceof w) {
            return this.f360461b.equals(((w) obj).f360461b);
        }
        return false;
    }

    public final w<?> f(Type type) {
        p pVar = this.f360462c;
        if (pVar == null) {
            p pVar2 = new p();
            Type type2 = this.f360461b;
            type2.getClass();
            p.a aVar = new p.a();
            aVar.a(type2);
            AbstractC37412t1 abstractC37412t1C = AbstractC37412t1.c(aVar.f360456b);
            p.b bVar = pVar2.f360455a;
            bVar.getClass();
            AbstractC37412t1.b bVar2 = new AbstractC37412t1.b();
            bVar2.d(bVar.f360457a.entrySet());
            Iterator it = abstractC37412t1C.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                p.c cVar = (p.c) entry.getKey();
                Type type3 = (Type) entry.getValue();
                cVar.getClass();
                M.f("Type variable %s bound to itself", !(type3 instanceof TypeVariable ? cVar.a((TypeVariable) type3) : false), cVar);
                bVar2.c(cVar, type3);
            }
            p pVar3 = new p(new p.b(bVar2.a(true)));
            this.f360462c = pVar3;
            pVar = pVar3;
        }
        e eVar = new e(pVar.a(type), null);
        eVar.f360462c = this.f360462c;
        return eVar;
    }

    public final int hashCode() {
        return this.f360461b.hashCode();
    }

    public final String toString() {
        com.google.common.base.C c12 = B.f360429a;
        Type type = this.f360461b;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new e(new p().a(this.f360461b), null);
    }

    public w(Type type, t tVar) {
        type.getClass();
        this.f360461b = type;
    }
}
