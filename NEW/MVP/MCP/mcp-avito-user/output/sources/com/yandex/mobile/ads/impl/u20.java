package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.kz0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class u20 {

    /* renamed from: a, reason: collision with root package name */
    private final bz0 f390422a;

    /* renamed from: b, reason: collision with root package name */
    private final b f390423b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f390424c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, a> f390425d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f390426e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private Runnable f390427f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final qy0<?> f390428a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f390429b;

        /* renamed from: c, reason: collision with root package name */
        private ok1 f390430c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f390431d;

        public a(x20 x20Var, c cVar) {
            ArrayList arrayList = new ArrayList();
            this.f390431d = arrayList;
            this.f390428a = x20Var;
            arrayList.add(cVar);
        }

        public final boolean b(c cVar) {
            this.f390431d.remove(cVar);
            if (this.f390431d.size() != 0) {
                return false;
            }
            this.f390428a.a();
            return true;
        }

        public final void a(ok1 ok1Var) {
            this.f390430c = ok1Var;
        }

        public final ok1 a() {
            return this.f390430c;
        }

        public final void a(c cVar) {
            this.f390431d.add(cVar);
        }
    }

    public interface b {
        @j.P
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public interface d extends kz0.a {
        void a(c cVar, boolean z12);
    }

    public u20(bz0 bz0Var, b bVar) {
        this.f390422a = bz0Var;
        this.f390423b = bVar;
    }

    public String a(String str, ImageView.ScaleType scaleType) {
        throw null;
    }

    public final c a(String str, d dVar) {
        return a(str, dVar, 0, 0);
    }

    public final c a(String str, d dVar, int i12, int i13) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            String strA = a(str, scaleType);
            Bitmap bitmapA = this.f390423b.a(strA);
            if (bitmapA != null) {
                c cVar = new c(bitmapA, null, null);
                dVar.a(cVar, true);
                return cVar;
            }
            c cVar2 = new c(null, strA, dVar);
            dVar.a(cVar2, true);
            a aVar = this.f390424c.get(strA);
            if (aVar == null) {
                aVar = this.f390425d.get(strA);
            }
            if (aVar != null) {
                aVar.a(cVar2);
            } else {
                x20 x20Var = new x20(str, new r20(this, strA), i12, i13, scaleType, Bitmap.Config.RGB_565, new s20(this, strA));
                this.f390422a.a(x20Var);
                this.f390424c.put(strA, new a(x20Var, cVar2));
            }
            return cVar2;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f390432a;

        /* renamed from: b, reason: collision with root package name */
        private final d f390433b;

        /* renamed from: c, reason: collision with root package name */
        private final String f390434c;

        public c(Bitmap bitmap, String str, d dVar) {
            this.f390432a = bitmap;
            this.f390434c = str;
            this.f390433b = dVar;
        }

        @j.K
        public final void a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            }
            if (this.f390433b == null) {
                return;
            }
            a aVar = (a) u20.this.f390424c.get(this.f390434c);
            if (aVar != null) {
                if (aVar.b(this)) {
                    u20.this.f390424c.remove(this.f390434c);
                    return;
                }
                return;
            }
            a aVar2 = (a) u20.this.f390425d.get(this.f390434c);
            if (aVar2 != null) {
                aVar2.b(this);
                if (aVar2.f390431d.size() == 0) {
                    u20.this.f390425d.remove(this.f390434c);
                }
            }
        }

        public final Bitmap b() {
            return this.f390432a;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        this.f390423b.a(str, bitmap);
        a aVarRemove = this.f390424c.remove(str);
        if (aVarRemove != null) {
            aVarRemove.f390429b = bitmap;
            this.f390425d.put(str, aVarRemove);
            if (this.f390427f == null) {
                t20 t20Var = new t20(this);
                this.f390427f = t20Var;
                this.f390426e.postDelayed(t20Var, 100);
            }
        }
    }

    public final void a(String str, ok1 ok1Var) {
        a aVarRemove = this.f390424c.remove(str);
        if (aVarRemove != null) {
            aVarRemove.a(ok1Var);
            this.f390425d.put(str, aVarRemove);
            if (this.f390427f == null) {
                t20 t20Var = new t20(this);
                this.f390427f = t20Var;
                this.f390426e.postDelayed(t20Var, 100);
            }
        }
    }
}
