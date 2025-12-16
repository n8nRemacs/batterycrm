package com.google.common.eventbus;

import com.google.common.base.d0;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.H1;
import com.google.common.primitives.q;
import com.google.common.reflect.w;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: SubscriberRegistry.java */
@e
/* loaded from: classes6.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.cache.k<Class<?>, AbstractC37401r1<Method>> f360169a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.common.cache.k<Class<?>, H1<Class<?>>> f360170b;

    /* compiled from: SubscriberRegistry.java */
    public class a extends CacheLoader<Class<?>, AbstractC37401r1<Method>> {
        @Override // com.google.common.cache.CacheLoader
        public final AbstractC37401r1<Method> a(Class<?> cls) throws SecurityException {
            com.google.common.cache.k<Class<?>, AbstractC37401r1<Method>> kVar = l.f360169a;
            Set setC0 = new w.h().c0();
            HashMap map = new HashMap();
            Iterator it = setC0.iterator();
            while (it.hasNext()) {
                for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                    if (method.isAnnotationPresent(h.class) && !method.isSynthetic()) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        boolean z12 = parameterTypes.length == 1;
                        int length = parameterTypes.length;
                        if (!z12) {
                            throw new IllegalArgumentException(d0.b("Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, Integer.valueOf(length)));
                        }
                        boolean zIsPrimitive = parameterTypes[0].isPrimitive();
                        String name = parameterTypes[0].getName();
                        Class<?> cls2 = parameterTypes[0];
                        Map<Class<?>, Class<?>> map2 = q.f360407a;
                        cls2.getClass();
                        Class<?> cls3 = q.f360407a.get(cls2);
                        if (cls3 != null) {
                            cls2 = cls3;
                        }
                        String simpleName = cls2.getSimpleName();
                        if (zIsPrimitive) {
                            throw new IllegalArgumentException(d0.b("@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, name, simpleName));
                        }
                        c cVar = new c(method);
                        if (!map.containsKey(cVar)) {
                            map.put(cVar, method);
                        }
                    }
                }
            }
            return AbstractC37401r1.v(map.values());
        }
    }

    /* compiled from: SubscriberRegistry.java */
    public class b extends CacheLoader<Class<?>, H1<Class<?>>> {
        @Override // com.google.common.cache.CacheLoader
        public final H1<Class<?>> a(Class<?> cls) {
            return H1.v(new w.h().c0());
        }
    }

    /* compiled from: SubscriberRegistry.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f360171a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Class<?>> f360172b;

        public c(Method method) {
            this.f360171a = method.getName();
            this.f360172b = Arrays.asList(method.getParameterTypes());
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f360171a.equals(cVar.f360171a) && this.f360172b.equals(cVar.f360172b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f360171a, this.f360172b});
        }
    }

    static {
        com.google.common.cache.d dVar = new com.google.common.cache.d();
        dVar.c();
        f360169a = dVar.a(new a());
        com.google.common.cache.d dVar2 = new com.google.common.cache.d();
        dVar2.c();
        f360170b = dVar2.a(new b());
    }
}
