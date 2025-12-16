package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class myd {
    public static final List a = ve3.j(Application.class, eyd.class);
    public static final List b = Collections.singletonList(eyd.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listD = ys.D(constructor.getParameterTypes());
            if (list.equals(listD)) {
                return constructor;
            }
            if (list.size() == listD.size() && listD.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final yfh b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (yfh) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
