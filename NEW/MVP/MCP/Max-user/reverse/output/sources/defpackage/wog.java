package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class wog extends i3 {
    public static Class t0 = null;
    public static Constructor u0 = null;
    public static Method v0 = null;
    public static Method w0 = null;
    public static boolean x0 = false;
    public final Method X;
    public final Method Y;
    public final Method Z;
    public final Class c;
    public final Constructor d;
    public final Method o;
    public final Method s0;

    public wog() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodR0;
        Constructor<?> constructor;
        Method methodQ0;
        Method method;
        Method method2;
        Method method3;
        super(17);
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodQ0 = Q0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodR0 = R0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodR0 = null;
            constructor = null;
            methodQ0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.c = cls;
        this.d = constructor;
        this.o = methodQ0;
        this.X = method;
        this.Y = method2;
        this.Z = method3;
        this.s0 = methodR0;
    }

    public static boolean M0(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        P0();
        try {
            return ((Boolean) v0.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void P0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (x0) {
            return;
        }
        x0 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        u0 = constructor;
        t0 = cls;
        v0 = method2;
        w0 = method;
    }

    public static Method Q0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean L0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.s0.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O0(Object obj) {
        try {
            return ((Boolean) this.Y.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method R0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.i3
    public final Typeface e0(Context context, je6 je6Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        Method method = this.o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                ke6[] ke6VarArr = je6Var.a;
                int length = ke6VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        ke6 ke6Var = ke6VarArr[i2];
                        Context context2 = context;
                        if (L0(context2, objNewInstance, ke6Var.a, ke6Var.e, ke6Var.b, ke6Var.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(ke6Var.d))) {
                            i2++;
                            context = context2;
                        } else {
                            try {
                                this.Z.invoke(objNewInstance, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (O0(objNewInstance)) {
                        return N0(objNewInstance);
                    }
                }
            }
            return null;
        }
        P0();
        try {
            Object objNewInstance2 = u0.newInstance(null);
            for (ke6 ke6Var2 : je6Var.a) {
                File fileE = hni.e(context);
                if (fileE == null) {
                    return null;
                }
                try {
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    fileE.delete();
                    throw th;
                }
                if (!hni.b(fileE, resources, ke6Var2.f) || !M0(objNewInstance2, fileE.getPath(), ke6Var2.b, ke6Var2.c)) {
                    fileE.delete();
                    return null;
                }
                fileE.delete();
            }
            P0();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) t0, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) w0.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.i3
    public final Typeface f0(Context context, me6[] me6VarArr, int i) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceN0;
        boolean zBooleanValue;
        if (me6VarArr.length >= 1) {
            Method method = this.o;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (me6 me6Var : me6VarArr) {
                        if (me6Var.e == 0) {
                            Uri uri = me6Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, hni.g(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = me6VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.Z;
                            if (i2 < length) {
                                me6 me6Var2 = me6VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(me6Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.X.invoke(objNewInstance, byteBuffer, Integer.valueOf(me6Var2.b), null, Integer.valueOf(me6Var2.c), Integer.valueOf(me6Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (O0(objNewInstance) && (typefaceN0 = N0(objNewInstance)) != null) {
                                return Typeface.create(typefaceN0, i);
                            }
                        }
                    }
                } else {
                    me6 me6VarJ0 = j0(me6VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(me6VarJ0.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(me6VarJ0.c).setItalic(me6VarJ0.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.i3
    public final Typeface g0(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g0(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!L0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.Z.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (O0(objNewInstance)) {
                return N0(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.i3
    public Typeface h0(Context context, Typeface typeface, int i) {
        Typeface typefaceA;
        Typeface typefaceB;
        try {
            typefaceA = c2i.a(typeface, i);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        if (typefaceA != null) {
            return typefaceA;
        }
        try {
            typefaceB = b2i.b(typeface, i);
        } catch (RuntimeException unused2) {
            typefaceB = null;
        }
        return typefaceB == null ? super.h0(context, typeface, i) : typefaceB;
    }
}
