package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import j.N;
import j.X;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
@RestrictTo
@X
/* loaded from: classes.dex */
public class D extends C {
    @Override // androidx.core.graphics.C, androidx.core.graphics.A, androidx.core.graphics.F
    @N
    public final Typeface f(@N Context context, @N Typeface typeface, int i12, boolean z12) {
        return Typeface.create(typeface, i12, z12);
    }

    @Override // androidx.core.graphics.C
    public final Typeface n(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f44714g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f44720m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // androidx.core.graphics.C
    public final Method r(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
