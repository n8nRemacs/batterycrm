package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.n;
import j.N;
import j.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
@RestrictTo
@X
/* loaded from: classes.dex */
class A extends F {

    /* renamed from: b, reason: collision with root package name */
    public static Class<?> f44696b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor<?> f44697c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f44698d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f44699e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f44700f = false;

    public static boolean j(String str, boolean z12, int i12, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        k();
        try {
            return ((Boolean) f44698d.invoke(obj, str, Integer.valueOf(i12), Boolean.valueOf(z12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static void k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f44700f) {
            return;
        }
        f44700f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f44697c = constructor;
        f44696b = cls;
        f44698d = method2;
        f44699e = method;
    }

    @Override // androidx.core.graphics.F
    public Typeface a(Context context, f.d dVar, Resources resources, int i12) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        k();
        try {
            Object objNewInstance = f44697c.newInstance(new Object[0]);
            for (f.e eVar : dVar.f44659a) {
                File fileD = I.d(context);
                if (fileD == null) {
                    return null;
                }
                try {
                    if (!I.b(fileD, resources, eVar.f44665f)) {
                        return null;
                    }
                    if (!j(fileD.getPath(), eVar.f44662c, eVar.f44661b, objNewInstance)) {
                        return null;
                    }
                    fileD.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileD.delete();
                }
            }
            k();
            try {
                Object objNewInstance2 = Array.newInstance(f44696b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f44699e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // androidx.core.graphics.F
    public Typeface b(Context context, @N n.c[] cVarArr, int i12) throws IOException {
        String str;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(h(cVarArr, i12).f44843a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceD = d(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceD;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.F
    @N
    public Typeface f(@N Context context, @N Typeface typeface, int i12, boolean z12) {
        Typeface typefaceB;
        try {
            typefaceB = K.b(typeface, i12, z12);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.f(context, typeface, i12, z12) : typefaceB;
    }
}
