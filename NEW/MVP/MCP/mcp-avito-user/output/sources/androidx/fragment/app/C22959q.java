package androidx.fragment.app;

import androidx.collection.o1;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FragmentFactory.java */
/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22959q {

    /* renamed from: a, reason: collision with root package name */
    public static final o1<ClassLoader, o1<String, Class<?>>> f46582a = new o1<>();

    @j.N
    public static Class<?> c(@j.N ClassLoader classLoader, @j.N String str) throws ClassNotFoundException {
        o1<ClassLoader, o1<String, Class<?>>> o1Var = f46582a;
        o1<String, Class<?>> o1Var2 = o1Var.get(classLoader);
        if (o1Var2 == null) {
            o1Var2 = new o1<>();
            o1Var.put(classLoader, o1Var2);
        }
        Class<?> cls = o1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        o1Var2.put(str, cls2);
        return cls2;
    }

    @j.N
    public static Class<? extends Fragment> d(@j.N ClassLoader classLoader, @j.N String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e12) {
            throw new Fragment.InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e12);
        } catch (ClassNotFoundException e13) {
            throw new Fragment.InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e13);
        }
    }

    @j.N
    public Fragment b(@j.N ClassLoader classLoader, @j.N String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e12) {
            throw new Fragment.InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e12);
        } catch (InstantiationException e13) {
            throw new Fragment.InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e13);
        } catch (NoSuchMethodException e14) {
            throw new Fragment.InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e14);
        } catch (InvocationTargetException e15) {
            throw new Fragment.InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e15);
        }
    }
}
