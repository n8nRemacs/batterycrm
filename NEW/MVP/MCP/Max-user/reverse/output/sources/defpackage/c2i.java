package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c2i {
    public static final Field a;
    public static final Method b;
    public static final Constructor c;
    public static final ek8 d;
    public static final Object e;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        a = declaredField;
        b = declaredMethod;
        c = declaredConstructor;
        d = new ek8(3);
        e = new Object();
    }

    public static Typeface a(Typeface typeface, int i) {
        Field field = a;
        Typeface typeface2 = null;
        if (field == null) {
            return null;
        }
        int i2 = i << 1;
        synchronized (e) {
            try {
                try {
                    long j = field.getLong(typeface);
                    ek8 ek8Var = d;
                    SparseArray sparseArray = (SparseArray) ek8Var.b(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        ek8Var.e(j, sparseArray);
                    } else {
                        Typeface typeface3 = (Typeface) sparseArray.get(i2);
                        if (typeface3 != null) {
                            return typeface3;
                        }
                    }
                    try {
                        try {
                            Long l = (Long) b.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.FALSE);
                            l.getClass();
                            try {
                                typeface2 = (Typeface) c.newInstance(l);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                            }
                            sparseArray.put(i2, typeface2);
                            return typeface2;
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
