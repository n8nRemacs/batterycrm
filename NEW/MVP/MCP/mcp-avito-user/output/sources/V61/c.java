package V61;

import java.lang.reflect.Method;

/* compiled from: ReflectiveTypeFinder.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16925a;

    public c(int i12) {
        this.f16925a = i12;
    }

    public final Class<?> a(Class<?> cls) throws SecurityException {
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals("matchesSafely") && method.getParameterTypes().length == this.f16925a && !method.isSynthetic()) {
                    return method.getParameterTypes()[0];
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }
}
