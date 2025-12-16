package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.collection.C20204c0;
import androidx.core.content.res.f;
import j.N;
import j.P;
import java.lang.reflect.Field;

/* compiled from: WeightTypefaceApi14.java */
@RestrictTo
/* loaded from: classes.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f44722a;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public static final C20204c0<SparseArray<Typeface>> f44723b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f44724c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            declaredField = null;
        }
        f44722a = declaredField;
        f44723b = new C20204c0<>(3);
        f44724c = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public static Typeface a(@N F f12, @N Context context, @N Typeface typeface, int i12, boolean z12) {
        Field field = f44722a;
        Typeface typefaceE = null;
        if (field == null) {
            return null;
        }
        int i13 = (i12 << 1) | (z12 ? 1 : 0);
        synchronized (f44724c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    C20204c0<SparseArray<Typeface>> c20204c0 = f44723b;
                    SparseArray<Typeface> sparseArrayF = c20204c0.f(jLongValue);
                    if (sparseArrayF == null) {
                        sparseArrayF = new SparseArray<>(4);
                        c20204c0.l(jLongValue, sparseArrayF);
                    } else {
                        Typeface typeface2 = sparseArrayF.get(i13);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    f12.getClass();
                    long jI2 = F.i(typeface);
                    f.d dVar = jI2 == 0 ? null : f12.f44721a.get(Long.valueOf(jI2));
                    if (dVar != null) {
                        Resources resources = context.getResources();
                        f.e eVar = (f.e) F.g(dVar.f44659a, i12, z12, new H());
                        if (eVar != null) {
                            typefaceE = z.e(context, resources, eVar.f44665f, eVar.f44660a, 0, 0);
                            long jI3 = F.i(typefaceE);
                            if (jI3 != 0) {
                                f12.f44721a.put(Long.valueOf(jI3), dVar);
                            }
                        }
                    }
                    if (typefaceE == null) {
                        int i14 = 1;
                        Object[] objArr = i12 >= 600;
                        if (objArr != true && !z12) {
                            i14 = 0;
                        } else if (objArr != true) {
                            i14 = 2;
                        } else if (z12) {
                            i14 = 3;
                        }
                        typefaceE = Typeface.create(typeface, i14);
                    }
                    sparseArrayF.put(i13, typefaceE);
                    return typefaceE;
                } catch (IllegalAccessException e12) {
                    throw new RuntimeException(e12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
