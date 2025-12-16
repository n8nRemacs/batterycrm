package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class a2i {
    public static final Field a;
    public static final ek8 b;
    public static final Object c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
        }
        a = declaredField;
        b = new ek8(3);
        c = new Object();
    }

    public static Typeface a(i3 i3Var, Context context, Typeface typeface, int i) {
        int i2;
        Typeface typefaceG0;
        int i3;
        Field field = a;
        if (field == null) {
            return null;
        }
        int i4 = i << 1;
        synchronized (c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    ek8 ek8Var = b;
                    SparseArray sparseArray = (SparseArray) ek8Var.b(jLongValue);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        ek8Var.e(jLongValue, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i4);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    long jR0 = i3.r0(typeface);
                    long j = 0;
                    je6 je6Var = jR0 == 0 ? null : (je6) ((ConcurrentHashMap) i3Var.b).get(Long.valueOf(jR0));
                    if (je6Var == null) {
                        typefaceG0 = null;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        Resources resources = context.getResources();
                        ke6[] ke6VarArr = je6Var.a;
                        int length = ke6VarArr.length;
                        int i5 = Integer.MAX_VALUE;
                        int i6 = 0;
                        ke6 ke6Var = null;
                        i2 = 2;
                        while (i6 < length) {
                            long j2 = j;
                            ke6 ke6Var2 = ke6VarArr[i6];
                            int iAbs = (Math.abs(ke6Var2.b - i) * 2) + (ke6Var2.c ? 1 : 0);
                            if (ke6Var == null || i5 > iAbs) {
                                ke6Var = ke6Var2;
                                i5 = iAbs;
                            }
                            i6++;
                            j = j2;
                        }
                        long j3 = j;
                        if (ke6Var == null) {
                            typefaceG0 = null;
                            i3 = 0;
                        } else {
                            int i7 = ke6Var.f;
                            String str = ke6Var.a;
                            typefaceG0 = vog.a.g0(context, resources, i7, str, 0);
                            if (typefaceG0 != null) {
                                i3 = 0;
                                vog.b.d(vog.c(resources, i7, str, 0, 0), typefaceG0);
                            } else {
                                i3 = 0;
                            }
                            long jR02 = i3.r0(typefaceG0);
                            if (jR02 != j3) {
                                ((ConcurrentHashMap) i3Var.b).put(Long.valueOf(jR02), je6Var);
                            }
                        }
                    }
                    if (typefaceG0 == null) {
                        int i8 = i >= 600 ? 1 : i3;
                        typefaceG0 = Typeface.create(typeface, i8 == 0 ? i3 : i8 == 0 ? i2 : 1);
                    }
                    sparseArray.put(i4, typefaceG0);
                    return typefaceG0;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
