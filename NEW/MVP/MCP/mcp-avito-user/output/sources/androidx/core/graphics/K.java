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

/* compiled from: WeightTypefaceApi21.java */
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo
@X
/* loaded from: classes.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f44725a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f44726b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f44727c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor<Typeface> f44728d;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public static final C20204c0<SparseArray<Typeface>> f44729e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f44730f;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f44725a = declaredField;
        f44726b = declaredMethod;
        f44727c = declaredMethod2;
        f44728d = declaredConstructor;
        f44729e = new C20204c0<>(3);
        f44730f = new Object();
    }

    @P
    public static Typeface a(long j12) {
        try {
            return f44728d.newInstance(Long.valueOf(j12));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @P
    public static Typeface b(@N Typeface typeface, int i12, boolean z12) {
        Typeface typefaceA;
        Field field = f44725a;
        if (field == null) {
            return null;
        }
        int i13 = (i12 << 1) | (z12 ? 1 : 0);
        synchronized (f44730f) {
            try {
                try {
                    long j12 = field.getLong(typeface);
                    C20204c0<SparseArray<Typeface>> c20204c0 = f44729e;
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
                    if (z12 == typeface.isItalic()) {
                        try {
                            typefaceA = a(((Long) f44727c.invoke(null, Long.valueOf(j12), Integer.valueOf(i12))).longValue());
                        } catch (IllegalAccessException e12) {
                            throw new RuntimeException(e12);
                        } catch (InvocationTargetException e13) {
                            throw new RuntimeException(e13);
                        }
                    } else {
                        typefaceA = a(c(i12, j12, z12));
                    }
                    sparseArrayF.put(i13, typefaceA);
                    return typefaceA;
                } catch (IllegalAccessException e14) {
                    throw new RuntimeException(e14);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long c(int i12, long j12, boolean z12) {
        try {
            Long l12 = (Long) f44726b.invoke(null, Long.valueOf(j12), Integer.valueOf(z12 ? 2 : 0));
            l12.longValue();
            return ((Long) f44727c.invoke(null, l12, Integer.valueOf(i12))).longValue();
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }
}
