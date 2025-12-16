package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.collection.C20212g0;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.provider.n;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static final F f44783a;

    /* renamed from: b, reason: collision with root package name */
    public static final C20212g0<String, Typeface> f44784b;

    /* compiled from: TypefaceCompat.java */
    @RestrictTo
    public static class a extends n.d {

        /* renamed from: a, reason: collision with root package name */
        @P
        public i.f f44785a;
    }

    static {
        Trace.beginSection(androidx.tracing.b.e("TypefaceCompat static init"));
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            f44783a = new E();
        } else if (i12 >= 28) {
            f44783a = new D();
        } else {
            f44783a = new C();
        }
        f44784b = new C20212g0<>(16);
        Trace.endSection();
    }

    @N
    public static Typeface a(@N Context context, @P Typeface typeface, @j.F int i12, boolean z12) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        androidx.core.util.z.c(i12, 1, "weight", 1000);
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f44783a.f(context, typeface, i12, z12);
    }

    @RestrictTo
    @P
    public static Typeface b(@N Context context, @N n.c[] cVarArr, int i12) {
        Trace.beginSection(androidx.tracing.b.e("TypefaceCompat.createFromFontInfo"));
        try {
            return f44783a.b(context, cVarArr, i12);
        } finally {
            Trace.endSection();
        }
    }

    @RestrictTo
    @P
    @X
    public static Typeface c(@N Context context, @N List list, int i12) {
        Trace.beginSection(androidx.tracing.b.e("TypefaceCompat.createFromFontInfoWithFallback"));
        try {
            return f44783a.c(context, list, i12);
        } finally {
            Trace.endSection();
        }
    }

    @RestrictTo
    @P
    public static Typeface d(@N Context context, @N f.b bVar, @N Resources resources, int i12, @P String str, int i13, int i14, @P i.f fVar, boolean z12) {
        Typeface typefaceA;
        List listUnmodifiableList;
        if (bVar instanceof f.C1729f) {
            f.C1729f c1729f = (f.C1729f) bVar;
            String str2 = c1729f.f44670e;
            Typeface typeface = null;
            if (str2 != null && !str2.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (fVar != null) {
                    new Handler(Looper.getMainLooper()).post(new J11.c(7, fVar, typeface));
                }
                return typeface;
            }
            boolean z13 = !z12 ? fVar != null : c1729f.f44669d != 0;
            int i15 = z12 ? c1729f.f44668c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar = new a();
            aVar.f44785a = fVar;
            androidx.core.provider.h hVar = c1729f.f44666a;
            androidx.core.provider.h hVar2 = c1729f.f44667b;
            if (hVar2 != null) {
                Object[] objArr = {hVar, hVar2};
                ArrayList arrayList = new ArrayList(2);
                for (int i16 = 0; i16 < 2; i16++) {
                    Object obj = objArr[i16];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {hVar};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            typefaceA = androidx.core.provider.n.b(context, listUnmodifiableList, i14, z13, i15, handler, aVar);
        } else {
            typefaceA = f44783a.a(context, (f.d) bVar, resources, i14);
            if (fVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new J11.c(7, fVar, typefaceA));
                } else {
                    fVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            f44784b.put(f(resources, i12, str, i13, i14), typefaceA);
        }
        return typefaceA;
    }

    @RestrictTo
    @P
    public static Typeface e(@N Context context, @N Resources resources, int i12, String str, int i13, int i14) {
        Typeface typefaceE = f44783a.e(context, resources, i12, str, i14);
        if (typefaceE != null) {
            f44784b.put(f(resources, i12, str, i13, i14), typefaceE);
        }
        return typefaceE;
    }

    public static String f(Resources resources, int i12, String str, int i13, int i14) {
        return resources.getResourcePackageName(i12) + '-' + str + '-' + i13 + '-' + i12 + '-' + i14;
    }
}
