package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ga3 {
    public static final ga3 c = new ga3();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, fa3 fa3Var, k38 k38Var, Class cls) {
        k38 k38Var2 = (k38) map.get(fa3Var);
        if (k38Var2 == null || k38Var == k38Var2) {
            if (k38Var2 == null) {
                map.put(fa3Var, k38Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + fa3Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + k38Var2 + ", new value " + k38Var);
    }

    public final ea3 a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            ea3 ea3VarA = (ea3) map2.get(superclass);
            if (ea3VarA == null) {
                ea3VarA = a(superclass, null);
            }
            map.putAll(ea3VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ea3 ea3VarA2 = (ea3) map2.get(cls2);
            if (ea3VarA2 == null) {
                ea3VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : ea3VarA2.b.entrySet()) {
                b(map, (fa3) entry.getKey(), (k38) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ova ovaVar = (ova) method.getAnnotation(ova.class);
            if (ovaVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!j48.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                k38 k38VarValue = ovaVar.value();
                if (parameterTypes.length > 1) {
                    if (!k38.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (k38VarValue != k38.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new fa3(i, method), k38VarValue, cls);
                z = true;
            }
        }
        ea3 ea3Var = new ea3(map);
        map2.put(cls, ea3Var);
        this.b.put(cls, Boolean.valueOf(z));
        return ea3Var;
    }
}
