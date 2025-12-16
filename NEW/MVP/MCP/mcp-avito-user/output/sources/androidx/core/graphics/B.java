package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.collection.o1;
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
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
@RestrictTo
@X
/* loaded from: classes.dex */
class B extends F {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f44701b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f44702c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f44703d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f44704e;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f44702c = constructor;
        f44701b = cls;
        f44703d = method;
        f44704e = method2;
    }

    public static boolean j(Object obj, ByteBuffer byteBuffer, int i12, int i13, boolean z12) {
        try {
            return ((Boolean) f44703d.invoke(obj, byteBuffer, Integer.valueOf(i12), null, Integer.valueOf(i13), Boolean.valueOf(z12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface k(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f44701b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f44704e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    @Override // androidx.core.graphics.F
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface a(android.content.Context r17, androidx.core.content.res.f.d r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor<?> r2 = androidx.core.graphics.B.f44702c     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            return r1
        Lf:
            r3 = r18
            androidx.core.content.res.f$e[] r3 = r3.f44659a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L72
            r6 = r3[r5]
            int r0 = r6.f44665f
            java.io.File r7 = androidx.core.graphics.I.d(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L5a
        L25:
            r8 = r19
            boolean r0 = androidx.core.graphics.I.b(r7, r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            r9.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            goto L57
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L55:
            throw r10     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L56:
            r0 = r1
        L57:
            r7.delete()
        L5a:
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r7 = r6.f44661b
            boolean r9 = r6.f44662c
            int r6 = r6.f44664e
            boolean r0 = j(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6a
            return r1
        L6a:
            int r5 = r5 + 1
            goto L15
        L6d:
            r0 = move-exception
            r7.delete()
            throw r0
        L72:
            android.graphics.Typeface r0 = k(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.B.a(android.content.Context, androidx.core.content.res.f$d, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // androidx.core.graphics.F
    @P
    public final Typeface b(Context context, @N n.c[] cVarArr, int i12) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f44702c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        o1 o1Var = new o1();
        for (n.c cVar : cVarArr) {
            Uri uri = cVar.f44843a;
            ByteBuffer byteBufferE = (ByteBuffer) o1Var.get(uri);
            if (byteBufferE == null) {
                byteBufferE = I.e(context, uri);
                o1Var.put(uri, byteBufferE);
            }
            if (byteBufferE == null) {
                return null;
            }
            if (!j(objNewInstance, byteBufferE, cVar.f44844b, cVar.f44845c, cVar.f44846d)) {
                return null;
            }
        }
        Typeface typefaceK = k(objNewInstance);
        if (typefaceK == null) {
            return null;
        }
        return Typeface.create(typefaceK, i12);
    }

    @Override // androidx.core.graphics.F
    @N
    public final Typeface f(@N Context context, @N Typeface typeface, int i12, boolean z12) {
        Typeface typefaceB;
        try {
            typefaceB = K.b(typeface, i12, z12);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.f(context, typeface, i12, z12) : typefaceB;
    }
}
