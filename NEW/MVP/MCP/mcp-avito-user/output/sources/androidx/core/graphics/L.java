package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.collection.C20204c0;
import j.N;
import j.P;
import j.X;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WeightTypefaceApi26.java */
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo
@X
/* loaded from: classes.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f44731a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f44732b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor<Typeface> f44733c;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public static final C20204c0<SparseArray<Typeface>> f44734d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f44735e;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f44731a = declaredField;
        f44732b = declaredMethod;
        f44733c = declaredConstructor;
        f44734d = new C20204c0<>(3);
        f44735e = new Object();
    }

    @P
    public static Typeface a(@N Typeface typeface, int i12, boolean z12) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Field field = f44731a;
        Typeface typefaceNewInstance = null;
        if (field == null) {
            return null;
        }
        int i13 = (i12 << 1) | (z12 ? 1 : 0);
        synchronized (f44735e) {
            try {
                try {
                    long j12 = field.getLong(typeface);
                    C20204c0<SparseArray<Typeface>> c20204c0 = f44734d;
                    SparseArray<Typeface> sparseArrayF = c20204c0.f(j12);
                    if (sparseArrayF == null) {
                        sparseArrayF = new SparseArray<>(4);
                        c20204c0.l(j12, sparseArrayF);
                    } else {
                        Typeface typeface2 = sparseArrayF.get(i13);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    try {
                        try {
                            Long l12 = (Long) f44732b.invoke(null, Long.valueOf(j12), Integer.valueOf(i12), Boolean.valueOf(z12));
                            l12.longValue();
                            try {
                                typefaceNewInstance = f44733c.newInstance(l12);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                            }
                            sparseArrayF.put(i13, typefaceNewInstance);
                            return typefaceNewInstance;
                        } catch (InvocationTargetException e12) {
                            throw new RuntimeException(e12);
                        }
                    } catch (IllegalAccessException e13) {
                        throw new RuntimeException(e13);
                    }
                } catch (IllegalAccessException e14) {
                    throw new RuntimeException(e14);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
