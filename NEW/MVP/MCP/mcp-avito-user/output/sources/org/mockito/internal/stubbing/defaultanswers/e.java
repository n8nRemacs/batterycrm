package org.mockito.internal.stubbing.defaultanswers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: ReturnsEmptyValues.java */
/* loaded from: classes7.dex */
public class e implements l81.g<Object>, Serializable {
    private static final long serialVersionUID = 1998191268711234347L;

    public final Object c(Class<?> cls) {
        HashMap map = Y71.k.f19337b;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        if (cls == Iterable.class) {
            return new ArrayList(0);
        }
        if (cls == Collection.class) {
            return new LinkedList();
        }
        if (cls == Set.class) {
            return new HashSet();
        }
        if (cls == HashSet.class) {
            return new HashSet();
        }
        if (cls == SortedSet.class) {
            return new TreeSet();
        }
        if (cls == TreeSet.class) {
            return new TreeSet();
        }
        if (cls == LinkedHashSet.class) {
            return new LinkedHashSet();
        }
        if (cls == List.class) {
            return new LinkedList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == Map.class) {
            return new HashMap();
        }
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == SortedMap.class) {
            return new TreeMap();
        }
        if (cls == TreeMap.class) {
            return new TreeMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if ("java.util.Optional".equals(cls.getName())) {
            Object obj = Y71.d.f19316a;
            if (obj != null) {
                return obj;
            }
            Object objB = Y71.d.b("java.util.Optional");
            Y71.d.f19316a = objB;
            return objB;
        }
        if ("java.util.OptionalDouble".equals(cls.getName())) {
            Object obj2 = Y71.d.f19317b;
            if (obj2 != null) {
                return obj2;
            }
            Object objB2 = Y71.d.b("java.util.OptionalDouble");
            Y71.d.f19317b = objB2;
            return objB2;
        }
        if ("java.util.OptionalInt".equals(cls.getName())) {
            Object obj3 = Y71.d.f19318c;
            if (obj3 != null) {
                return obj3;
            }
            Object objB3 = Y71.d.b("java.util.OptionalInt");
            Y71.d.f19318c = objB3;
            return objB3;
        }
        if ("java.util.OptionalLong".equals(cls.getName())) {
            Object obj4 = Y71.d.f19319d;
            if (obj4 != null) {
                return obj4;
            }
            Object objB4 = Y71.d.b("java.util.OptionalLong");
            Y71.d.f19319d = objB4;
            return objB4;
        }
        if ("java.util.stream.Stream".equals(cls.getName())) {
            return Y71.d.b("java.util.stream.Stream");
        }
        if ("java.util.stream.DoubleStream".equals(cls.getName())) {
            return Y71.d.b("java.util.stream.DoubleStream");
        }
        if ("java.util.stream.IntStream".equals(cls.getName())) {
            return Y71.d.b("java.util.stream.IntStream");
        }
        if ("java.util.stream.LongStream".equals(cls.getName())) {
            return Y71.d.b("java.util.stream.LongStream");
        }
        if ("java.time.Duration".equals(cls.getName())) {
            Object obj5 = Y71.d.f19320e;
            if (obj5 != null) {
                return obj5;
            }
            Object objA = Y71.d.a("java.time.Duration");
            Y71.d.f19320e = objA;
            return objA;
        }
        if (!"java.time.Period".equals(cls.getName())) {
            return null;
        }
        Object obj6 = Y71.d.f19321f;
        if (obj6 != null) {
            return obj6;
        }
        Object objA2 = Y71.d.a("java.time.Period");
        Y71.d.f19321f = objA2;
        return objA2;
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        if (!Y71.i.a(interfaceC39968b.getMethod())) {
            Method method = interfaceC39968b.getMethod();
            if (Comparable.class.isAssignableFrom(method.getDeclaringClass()) && "compareTo".equals(method.getName())) {
                if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == method.getDeclaringClass()) {
                    return Integer.valueOf(interfaceC39968b.v3() == interfaceC39968b.a1(0) ? 0 : 1);
                }
            }
            return c(interfaceC39968b.getMethod().getReturnType());
        }
        Object objV3 = interfaceC39968b.v3();
        h81.b bVarB = Y71.h.b(objV3);
        if (!bVarB.a()) {
            return bVarB.toString();
        }
        return "Mock for " + Y71.h.a(objV3).j0().d().getSimpleName() + ", hashCode: " + objV3.hashCode();
    }
}
