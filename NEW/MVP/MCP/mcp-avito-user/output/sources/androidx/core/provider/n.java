package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.BaseColumns;
import androidx.annotation.RestrictTo;
import androidx.collection.C20212g0;
import androidx.collection.o1;
import androidx.core.graphics.z;
import androidx.core.provider.m;
import androidx.core.provider.o;
import androidx.core.util.InterfaceC22791e;
import j.F;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class n {

    /* compiled from: FontsContractCompat.java */
    public static final class a implements BaseColumns {
    }

    /* compiled from: FontsContractCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44843a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44844b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44845c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44846d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44847e;

        @RestrictTo
        @Deprecated
        public c(@N Uri uri, @F int i12, @F int i13, boolean z12, int i14) {
            uri.getClass();
            this.f44843a = uri;
            this.f44844b = i12;
            this.f44845c = i13;
            this.f44846d = z12;
            this.f44847e = i14;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class d {

        /* compiled from: FontsContractCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }
    }

    @N
    public static b a(@N Context context, @N h hVar) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{hVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return g.a(context, Collections.unmodifiableList(arrayList));
    }

    @RestrictTo
    @P
    public static Typeface b(@N Context context, @N List list, int i12, boolean z12, @F int i13, @N Handler handler, @N z.a aVar) throws InterruptedException {
        androidx.core.provider.c cVar = new androidx.core.provider.c(aVar, new o.b(handler));
        if (!z12) {
            String strA = m.a(i12, list);
            Typeface typeface = m.f44835a.get(strA);
            if (typeface != null) {
                cVar.a(new m.a(typeface));
                return typeface;
            }
            j jVar = new j(cVar);
            synchronized (m.f44837c) {
                try {
                    o1<String, ArrayList<InterfaceC22791e<m.a>>> o1Var = m.f44838d;
                    ArrayList<InterfaceC22791e<m.a>> arrayList = o1Var.get(strA);
                    if (arrayList != null) {
                        arrayList.add(jVar);
                    } else {
                        ArrayList<InterfaceC22791e<m.a>> arrayList2 = new ArrayList<>();
                        arrayList2.add(jVar);
                        o1Var.put(strA, arrayList2);
                        k kVar = new k(strA, context, list, i12);
                        ThreadPoolExecutor threadPoolExecutor = m.f44836b;
                        l lVar = new l(strA);
                        Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                        o.c cVar2 = new o.c();
                        cVar2.f44852b = kVar;
                        cVar2.f44853c = lVar;
                        cVar2.f44854d = handler2;
                        threadPoolExecutor.execute(cVar2);
                    }
                } finally {
                }
            }
            return null;
        }
        if (list.size() > 1) {
            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
        }
        h hVar = (h) list.get(0);
        C20212g0<String, Typeface> c20212g0 = m.f44835a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{hVar}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String strA2 = m.a(i12, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = m.f44835a.get(strA2);
        if (typeface2 != null) {
            cVar.a(new m.a(typeface2));
            return typeface2;
        }
        if (i13 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{hVar}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            m.a aVarB = m.b(strA2, context, Collections.unmodifiableList(arrayList4), i12);
            cVar.a(aVarB);
            return aVarB.f44839a;
        }
        try {
            try {
                m.a aVar2 = (m.a) m.f44836b.submit(new i(strA2, context, hVar, i12)).get(i13, TimeUnit.MILLISECONDS);
                cVar.a(aVar2);
                return aVar2.f44839a;
            } catch (InterruptedException e12) {
                throw e12;
            } catch (ExecutionException e13) {
                throw new RuntimeException(e13);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            cVar.a(new m.a(-3));
            return null;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f44841a;

        /* renamed from: b, reason: collision with root package name */
        public final List<c[]> f44842b;

        @RestrictTo
        @Deprecated
        public b() {
            this.f44841a = 1;
            this.f44842b = Collections.singletonList(null);
        }

        public b(@N ArrayList arrayList) {
            this.f44841a = 0;
            this.f44842b = arrayList;
        }
    }
}
