package defpackage;

import androidx.fragment.app.Fragment$InstantiationException;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class li6 {
    public static final z0f b = new z0f(0);
    public final /* synthetic */ c a;

    public li6(c cVar) {
        this.a = cVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        z0f z0fVar = b;
        z0f z0fVar2 = (z0f) z0fVar.get(classLoader);
        if (z0fVar2 == null) {
            z0fVar2 = new z0f(0);
            z0fVar.put(classLoader, z0fVar2);
        }
        Class cls = (Class) z0fVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        z0fVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(ho7.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(ho7.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final a a(String str) {
        try {
            return (a) c(this.a.w.d.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(ho7.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(ho7.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(ho7.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(ho7.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
