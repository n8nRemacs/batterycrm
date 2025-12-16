package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.n;
import com.adjust.sdk.Constants;
import j.N;
import j.P;
import j.X;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypefaceCompatBaseImpl.java */
@RestrictTo
/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<Long, f.d> f44721a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    public class a implements b<n.c> {
        @Override // androidx.core.graphics.F.b
        public final int a(n.c cVar) {
            return cVar.f44845c;
        }

        @Override // androidx.core.graphics.F.b
        public final boolean b(n.c cVar) {
            return cVar.f44846d;
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    public interface b<T> {
        int a(T t12);

        boolean b(T t12);
    }

    public static <T> T g(T[] tArr, int i12, boolean z12, b<T> bVar) {
        T t12 = null;
        int i13 = Integer.MAX_VALUE;
        for (T t13 : tArr) {
            int iAbs = (Math.abs(bVar.a(t13) - i12) * 2) + (bVar.b(t13) == z12 ? 0 : 1);
            if (t12 == null || i13 > iAbs) {
                t12 = t13;
                i13 = iAbs;
            }
        }
        return t12;
    }

    public static long i(@P Typeface typeface) throws NoSuchFieldException, SecurityException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    @P
    public Typeface a(Context context, f.d dVar, Resources resources, int i12) throws NoSuchFieldException, SecurityException {
        f.e eVar = (f.e) g(dVar.f44659a, (i12 & 1) == 0 ? Constants.MINIMAL_ERROR_STATUS_CODE : 700, (i12 & 2) != 0, new G());
        if (eVar == null) {
            return null;
        }
        Typeface typefaceE = z.e(context, resources, eVar.f44665f, eVar.f44660a, 0, i12);
        long jI2 = i(typefaceE);
        if (jI2 != 0) {
            this.f44721a.put(Long.valueOf(jI2), dVar);
        }
        return typefaceE;
    }

    @P
    public Typeface b(Context context, @N n.c[] cVarArr, int i12) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(cVarArr, i12).f44843a);
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                I.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                I.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                I.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @P
    @X
    public Typeface c(@N Context context, @N List list, int i12) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileD = I.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (I.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    @P
    public Typeface e(Context context, Resources resources, int i12, String str, int i13) {
        File fileD = I.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (I.b(fileD, resources, i12)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    @N
    public Typeface f(@N Context context, @N Typeface typeface, int i12, boolean z12) {
        Typeface typefaceA;
        try {
            typefaceA = J.a(this, context, typeface, i12, z12);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    public n.c h(n.c[] cVarArr, int i12) {
        return (n.c) g(cVarArr, (i12 & 1) == 0 ? Constants.MINIMAL_ERROR_STATUS_CODE : 700, (i12 & 2) != 0, new a());
    }
}
