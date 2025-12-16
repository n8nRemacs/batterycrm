package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.C20212g0;
import androidx.collection.o1;
import androidx.core.graphics.z;
import androidx.core.provider.n;
import androidx.core.provider.o;
import androidx.core.util.InterfaceC22791e;
import j.B;
import j.N;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    public static final C20212g0<String, Typeface> f44835a = new C20212g0<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f44836b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f44837c;

    /* renamed from: d, reason: collision with root package name */
    @B
    public static final o1<String, ArrayList<InterfaceC22791e<a>>> f44838d;

    static {
        o.a aVar = new o.a();
        aVar.f44848b = "fonts-androidx";
        aVar.f44849c = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f44836b = threadPoolExecutor;
        f44837c = new Object();
        f44838d = new o1<>();
    }

    public static String a(int i12, @N List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < list.size(); i13++) {
            sb2.append(((h) list.get(i13)).f44824e);
            sb2.append("-");
            sb2.append(i12);
            if (i13 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @N
    public static a b(@N String str, @N Context context, @N List<h> list, int i12) {
        int i13;
        Trace.beginSection(androidx.tracing.b.e("getFontSync"));
        C20212g0<String, Typeface> c20212g0 = f44835a;
        try {
            Typeface typeface = c20212g0.get(str);
            if (typeface != null) {
                return new a(typeface);
            }
            n.b bVarA = g.a(context, list);
            int i14 = bVarA.f44841a;
            List<n.c[]> list2 = bVarA.f44842b;
            if (i14 != 0) {
                i13 = i14 != 1 ? -3 : -2;
            } else {
                n.c[] cVarArr = list2.get(0);
                if (cVarArr == null || cVarArr.length == 0) {
                    i13 = 1;
                } else {
                    int length = cVarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            i13 = 0;
                            break;
                        }
                        int i16 = cVarArr[i15].f44847e;
                        if (i16 == 0) {
                            i15++;
                        } else if (i16 >= 0) {
                            i13 = i16;
                        }
                    }
                }
            }
            if (i13 != 0) {
                return new a(i13);
            }
            Typeface typefaceB = (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) ? z.b(context, list2.get(0), i12) : z.c(context, list2, i12);
            if (typefaceB == null) {
                return new a(-3);
            }
            c20212g0.put(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        } finally {
            Trace.endSection();
        }
    }

    /* compiled from: FontRequestWorker.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f44839a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44840b;

        public a(int i12) {
            this.f44839a = null;
            this.f44840b = i12;
        }

        @SuppressLint({"WrongConstant"})
        public a(@N Typeface typeface) {
            this.f44839a = typeface;
            this.f44840b = 0;
        }
    }
}
