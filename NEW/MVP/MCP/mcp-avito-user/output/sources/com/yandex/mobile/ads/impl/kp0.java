package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.u20;

/* loaded from: classes8.dex */
public final class kp0 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private static final Object f387243c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile kp0 f387244d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u20 f387245a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final c f387246b;

    public class a extends LruCache<String, Bitmap> {
        public a(int i12) {
            super(i12);
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2 != null ? bitmap2.getByteCount() / 1024 : super.sizeOf(str, null);
        }
    }

    public static class b implements u20.b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final LruCache<String, Bitmap> f387247a;

        public b(@j.N LruCache<String, Bitmap> lruCache) {
            this.f387247a = lruCache;
        }

        @Override // com.yandex.mobile.ads.impl.u20.b
        public final Bitmap a(String str) {
            return this.f387247a.get(str);
        }

        @Override // com.yandex.mobile.ads.impl.u20.b
        public final void a(String str, Bitmap bitmap) {
            this.f387247a.put(str, bitmap);
        }
    }

    public interface c {
        @j.P
        Bitmap a(@j.N String str);

        void a(@j.N String str, @j.N Bitmap bitmap);
    }

    private kp0(@j.N Context context) {
        LruCache lruCacheA = a(context);
        bz0 bz0VarB = b(context);
        b bVar = new b(lruCacheA);
        p20 p20Var = new p20();
        this.f387246b = new zb1(lruCacheA, p20Var);
        this.f387245a = new p41(bz0VarB, bVar, p20Var);
    }

    @j.N
    public static kp0 c(@j.N Context context) {
        if (f387244d == null) {
            synchronized (f387243c) {
                try {
                    if (f387244d == null) {
                        f387244d = new kp0(context);
                    }
                } finally {
                }
            }
        }
        return f387244d;
    }

    @j.N
    public final u20 a() {
        return this.f387245a;
    }

    @j.N
    public final c b() {
        return this.f387246b;
    }

    @j.N
    private static LruCache a(Context context) {
        int iMin;
        try {
            iMin = Math.min(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, ((int) (((r5.widthPixels * r5.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024.0f)) * 3);
        } catch (IllegalArgumentException unused) {
            iMin = 5120;
        }
        return new a(Math.max(iMin, 5120));
    }

    @j.N
    private static bz0 b(@j.N Context context) {
        bz0 bz0VarA = cz0.a(context, 4);
        bz0VarA.a();
        return bz0VarA;
    }
}
