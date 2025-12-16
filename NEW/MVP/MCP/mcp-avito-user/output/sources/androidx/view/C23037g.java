package androidx.view;

import androidx.view.Lifecycle;
import j.P;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23037g {

    /* renamed from: c, reason: collision with root package name */
    public static final C23037g f46793c = new C23037g();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f46794a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f46795b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f46796a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f46797b;

        public a(HashMap map) {
            this.f46797b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f46796a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f46796a.put(event, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void a(List list, InterfaceC22983P interfaceC22983P, Lifecycle.Event event, InterfaceC22982O interfaceC22982O) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = (b) list.get(size);
                    bVar.getClass();
                    try {
                        int i12 = bVar.f46798a;
                        Method method = bVar.f46799b;
                        if (i12 == 0) {
                            method.invoke(interfaceC22982O, new Object[0]);
                        } else if (i12 == 1) {
                            method.invoke(interfaceC22982O, interfaceC22983P);
                        } else if (i12 == 2) {
                            method.invoke(interfaceC22982O, interfaceC22983P, event);
                        }
                    } catch (IllegalAccessException e12) {
                        throw new RuntimeException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new RuntimeException("Failed to call observer method", e13.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f46798a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f46799b;

        public b(int i12, Method method) throws SecurityException {
            this.f46798a = i12;
            this.f46799b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46798a == bVar.f46798a && this.f46799b.getName().equals(bVar.f46799b.getName());
        }

        public final int hashCode() {
            return this.f46799b.getName().hashCode() + (this.f46798a * 31);
        }
    }

    public static void b(HashMap map, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f46799b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final a a(Class<?> cls, @P Method[] methodArr) throws SecurityException {
        int i12;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f46794a;
        if (superclass != null) {
            a aVarA = (a) map2.get(superclass);
            if (aVarA == null) {
                aVarA = a(superclass, null);
            }
            map.putAll(aVarA.f46797b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarA2 = (a) map2.get(cls2);
            if (aVarA2 == null) {
                aVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : aVarA2.f46797b.entrySet()) {
                b(map, (b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e12) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e12);
            }
        }
        boolean z12 = false;
        for (Method method : methodArr) {
            InterfaceC23042i0 interfaceC23042i0 = (InterfaceC23042i0) method.getAnnotation(InterfaceC23042i0.class);
            if (interfaceC23042i0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i12 = 0;
                } else {
                    if (!InterfaceC22983P.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i12 = 1;
                }
                Lifecycle.Event eventValue = interfaceC23042i0.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i12 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new b(i12, method), eventValue, cls);
                z12 = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f46795b.put(cls, Boolean.valueOf(z12));
        return aVar;
    }
}
