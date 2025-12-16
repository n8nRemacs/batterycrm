package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.camera.video.internal.audio.q;
import androidx.core.content.res.f;
import androidx.core.graphics.z;
import j.B;
import j.InterfaceC42161q;
import j.InterfaceC42168y;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f44673a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    @B
    public static final WeakHashMap<e, SparseArray<d>> f44674b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f44675c = new Object();

    /* compiled from: ResourcesCompat.java */
    @X
    public static class a {
    }

    /* compiled from: ResourcesCompat.java */
    @X
    public static class b {
    }

    /* compiled from: ResourcesCompat.java */
    @X
    public static class c {
        public static float a(@N Resources resources, @InterfaceC42161q int i12) {
            return resources.getFloat(i12);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f44676a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f44677b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44678c;

        public d(@N ColorStateList colorStateList, @N Configuration configuration, @P Resources.Theme theme) {
            this.f44676a = colorStateList;
            this.f44677b = configuration;
            this.f44678c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f44679a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f44680b;

        public e(@N Resources resources, @P Resources.Theme theme) {
            this.f44679a = resources;
            this.f44680b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f44679a.equals(eVar.f44679a) && Objects.equals(this.f44680b, eVar.f44680b);
        }

        public final int hashCode() {
            return Objects.hash(this.f44679a, this.f44680b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class f {
        @RestrictTo
        public final void a(int i12) {
            new Handler(Looper.getMainLooper()).post(new q(i12, 1, this));
        }

        public abstract void b(int i12);

        public abstract void c(@N Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    public static final class g {

        /* compiled from: ResourcesCompat.java */
        @X
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final Object f44681a = new Object();

            /* renamed from: b, reason: collision with root package name */
            public static Method f44682b;

            /* renamed from: c, reason: collision with root package name */
            public static boolean f44683c;
        }

        /* compiled from: ResourcesCompat.java */
        @X
        public static class b {
            public static void a(@N Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@N Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
                return;
            }
            synchronized (a.f44681a) {
                if (!a.f44683c) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        a.f44682b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    a.f44683c = true;
                }
                Method method = a.f44682b;
                if (method != null) {
                    try {
                        method.invoke(theme, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        a.f44682b = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4.f44678c == r9.hashCode()) goto L21;
     */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList a(@j.N android.content.res.Resources r7, @j.InterfaceC42158n int r8, @j.P android.content.res.Resources.Theme r9) throws android.content.res.Resources.NotFoundException {
        /*
            androidx.core.content.res.i$e r0 = new androidx.core.content.res.i$e
            r0.<init>(r7, r9)
            java.lang.Object r1 = androidx.core.content.res.i.f44675c
            monitor-enter(r1)
            java.util.WeakHashMap<androidx.core.content.res.i$e, android.util.SparseArray<androidx.core.content.res.i$d>> r2 = androidx.core.content.res.i.f44674b     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L34
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r2 == 0) goto L48
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L34
            if (r4 <= 0) goto L48
            java.lang.Object r4 = r2.get(r8)     // Catch: java.lang.Throwable -> L34
            androidx.core.content.res.i$d r4 = (androidx.core.content.res.i.d) r4     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L48
            android.content.res.Configuration r5 = r4.f44677b     // Catch: java.lang.Throwable -> L34
            android.content.res.Configuration r6 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L34
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L45
            if (r9 != 0) goto L37
            int r5 = r4.f44678c     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L41
            goto L37
        L34:
            r7 = move-exception
            goto La7
        L37:
            if (r9 == 0) goto L45
            int r5 = r4.f44678c     // Catch: java.lang.Throwable -> L34
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> L34
            if (r5 != r6) goto L45
        L41:
            android.content.res.ColorStateList r2 = r4.f44676a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L4a
        L45:
            r2.remove(r8)     // Catch: java.lang.Throwable -> L34
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            r2 = r3
        L4a:
            if (r2 == 0) goto L4d
            return r2
        L4d:
            java.lang.ThreadLocal<android.util.TypedValue> r1 = androidx.core.content.res.i.f44673a
            java.lang.Object r2 = r1.get()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            if (r2 != 0) goto L5f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.set(r2)
        L5f:
            r1 = 1
            r7.getValue(r8, r2, r1)
            int r1 = r2.type
            r2 = 28
            if (r1 < r2) goto L6e
            r2 = 31
            if (r1 > r2) goto L6e
            goto L76
        L6e:
            android.content.res.XmlResourceParser r1 = r7.getXml(r8)
            android.content.res.ColorStateList r3 = androidx.core.content.res.c.a(r7, r1, r9)     // Catch: java.lang.Exception -> L76
        L76:
            if (r3 == 0) goto La2
            java.lang.Object r1 = androidx.core.content.res.i.f44675c
            monitor-enter(r1)
            java.util.WeakHashMap<androidx.core.content.res.i$e, android.util.SparseArray<androidx.core.content.res.i$d>> r7 = androidx.core.content.res.i.f44674b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r7.get(r0)     // Catch: java.lang.Throwable -> L8e
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L90
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L8e
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r7 = move-exception
            goto La0
        L90:
            androidx.core.content.res.i$d r7 = new androidx.core.content.res.i$d     // Catch: java.lang.Throwable -> L8e
            android.content.res.Resources r0 = r0.f44679a     // Catch: java.lang.Throwable -> L8e
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L8e
            r7.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L8e
            r2.append(r8, r7)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            return r3
        La0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            throw r7
        La2:
            android.content.res.ColorStateList r7 = r7.getColorStateList(r8, r9)
            return r7
        La7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static float b(@N Resources resources, @InterfaceC42161q int i12) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i12);
        }
        ThreadLocal<TypedValue> threadLocal = f44673a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i12, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i12) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    @P
    public static Typeface c(@InterfaceC42168y int i12, @N Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return d(context, i12, new TypedValue(), 0, null, false, false);
    }

    public static Typeface d(@N Context context, int i12, @N TypedValue typedValue, int i13, @P f fVar, boolean z12, boolean z13) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i12, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i12) + "\" (" + Integer.toHexString(i12) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceD = null;
        if (string.startsWith("res/")) {
            Typeface typeface = z.f44784b.get(z.f(resources, i12, string, typedValue.assetCookie, i13));
            if (typeface != null) {
                if (fVar != null) {
                    new Handler(Looper.getMainLooper()).post(new J11.c(7, fVar, typeface));
                }
                typefaceD = typeface;
            } else if (!z13) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        f.b bVarA = androidx.core.content.res.f.a(resources.getXml(i12), resources);
                        if (bVarA != null) {
                            typefaceD = z.d(context, bVarA, resources, i12, string, typedValue.assetCookie, i13, fVar, z12);
                        } else if (fVar != null) {
                            fVar.a(-3);
                        }
                    } else {
                        Typeface typefaceE = z.e(context, resources, i12, string, typedValue.assetCookie, i13);
                        if (fVar != null) {
                            if (typefaceE != null) {
                                new Handler(Looper.getMainLooper()).post(new J11.c(7, fVar, typefaceE));
                            } else {
                                fVar.a(-3);
                            }
                        }
                        typefaceD = typefaceE;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (fVar != null) {
                        fVar.a(-3);
                    }
                }
            }
        } else if (fVar != null) {
            fVar.a(-3);
        }
        if (typefaceD != null || fVar != null || z13) {
            return typefaceD;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i12) + " could not be retrieved.");
    }
}
