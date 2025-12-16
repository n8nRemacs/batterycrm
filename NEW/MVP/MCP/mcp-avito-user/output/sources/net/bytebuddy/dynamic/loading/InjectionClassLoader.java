package net.bytebuddy.dynamic.loading;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import net.bytebuddy.description.type.TypeDescription;

/* loaded from: classes8.dex */
public abstract class InjectionClassLoader extends ClassLoader {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f416787a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Strategy implements ClassLoadingStrategy<InjectionClassLoader> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f416788b = {new Strategy("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        Strategy EF5;

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f416788b.clone();
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public final Map b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map map) {
            InjectionClassLoader injectionClassLoader = (InjectionClassLoader) classLoader;
            if (injectionClassLoader == null) {
                throw new IllegalArgumentException("Cannot add types to bootstrap class loader: " + map);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((TypeDescription) entry.getKey()).getName(), entry.getValue());
                map2.put(((TypeDescription) entry.getKey()).getName(), entry.getKey());
            }
            HashMap map3 = new HashMap();
            try {
                if (injectionClassLoader.f416787a.get()) {
                    throw new IllegalStateException("Cannot inject classes into a sealed class loader");
                }
                for (Map.Entry entry2 : injectionClassLoader.a(linkedHashMap).entrySet()) {
                    map3.put(map2.get(entry2.getKey()), entry2.getValue());
                }
                return map3;
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Cannot load classes: " + map, e12);
            }
        }
    }

    static {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public InjectionClassLoader(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, boolean z12) {
        super(classLoader);
        this.f416787a = new AtomicBoolean(z12);
    }

    public abstract Map a(LinkedHashMap linkedHashMap);
}
