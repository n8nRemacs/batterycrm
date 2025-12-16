package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.n;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
@RestrictTo
@X
/* loaded from: classes.dex */
public class C extends A {

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f44714g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor<?> f44715h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f44716i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f44717j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f44718k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f44719l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f44720m;

    public C() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodQ;
        Method method2;
        Method method3;
        Method methodR;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodQ = q(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodR = r(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            methodQ = null;
            method2 = null;
            method3 = null;
            methodR = null;
        }
        this.f44714g = cls;
        this.f44715h = constructor;
        this.f44716i = methodQ;
        this.f44717j = method2;
        this.f44718k = method3;
        this.f44719l = method;
        this.f44720m = methodR;
    }

    public static Method q(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // androidx.core.graphics.A, androidx.core.graphics.F
    @P
    public final Typeface a(Context context, f.d dVar, Resources resources, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f44716i == null) {
            return super.a(context, dVar, resources, i12);
        }
        Object objP = p();
        if (objP == null) {
            return null;
        }
        for (f.e eVar : dVar.f44659a) {
            if (!m(context, objP, eVar.f44660a, eVar.f44664e, eVar.f44661b, eVar.f44662c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.f44663d))) {
                l(objP);
                return null;
            }
        }
        if (o(objP)) {
            return n(objP);
        }
        return null;
    }

    @Override // androidx.core.graphics.A, androidx.core.graphics.F
    @P
    public final Typeface b(Context context, @N n.c[] cVarArr, int i12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceN;
        boolean zBooleanValue;
        if (cVarArr.length < 1) {
            return null;
        }
        if (this.f44716i == null) {
            n.c cVarH = h(cVarArr, i12);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarH.f44843a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVarH.f44845c).setItalic(cVarH.f44846d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (n.c cVar : cVarArr) {
            if (cVar.f44847e == 0) {
                Uri uri = cVar.f44843a;
                if (!map.containsKey(uri)) {
                    map.put(uri, I.e(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objP = p();
        if (objP == null) {
            return null;
        }
        int length = cVarArr.length;
        int i13 = 0;
        boolean z12 = false;
        while (i13 < length) {
            n.c cVar2 = cVarArr[i13];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(cVar2.f44843a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f44717j.invoke(objP, byteBuffer, Integer.valueOf(cVar2.f44844b), null, Integer.valueOf(cVar2.f44845c), Integer.valueOf(cVar2.f44846d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    l(objP);
                    return null;
                }
                z12 = true;
            }
            i13++;
            z12 = z12;
        }
        if (!z12) {
            l(objP);
            return null;
        }
        if (o(objP) && (typefaceN = n(objP)) != null) {
            return Typeface.create(typefaceN, i12);
        }
        return null;
    }

    @Override // androidx.core.graphics.F
    @P
    public final Typeface e(Context context, Resources resources, int i12, String str, int i13) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f44716i == null) {
            return super.e(context, resources, i12, str, i13);
        }
        Object objP = p();
        if (objP == null) {
            return null;
        }
        if (!m(context, objP, str, 0, -1, -1, null)) {
            l(objP);
            return null;
        }
        if (o(objP)) {
            return n(objP);
        }
        return null;
    }

    @Override // androidx.core.graphics.A, androidx.core.graphics.F
    @N
    public Typeface f(@N Context context, @N Typeface typeface, int i12, boolean z12) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Typeface typefaceA;
        try {
            typefaceA = L.a(typeface, i12, z12);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? super.f(context, typeface, i12, z12) : typefaceA;
    }

    public final void l(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f44719l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m(Context context, Object obj, String str, int i12, int i13, int i14, @P FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f44716i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @P
    public Typeface n(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f44714g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f44720m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean o(Object obj) {
        try {
            return ((Boolean) this.f44718k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @P
    public final Object p() {
        try {
            return this.f44715h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method r(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
