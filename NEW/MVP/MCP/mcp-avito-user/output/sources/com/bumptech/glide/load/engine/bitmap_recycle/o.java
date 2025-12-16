package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.compose.foundation.H;
import j.P;
import j.X;
import j.k0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
@X
/* loaded from: classes5.dex */
public class o implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f338937d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f338938e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f338939f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f338940g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f338941h;

    /* renamed from: a, reason: collision with root package name */
    public final c f338942a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final h<b, Bitmap> f338943b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f338944c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f338945a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f338945a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f338945a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f338945a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f338945a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    @k0
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        public final c f338946a;

        /* renamed from: b, reason: collision with root package name */
        public int f338947b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f338948c;

        public b(c cVar) {
            this.f338946a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public final void a() {
            this.f338946a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f338947b == bVar.f338947b && com.bumptech.glide.util.m.a(this.f338948c, bVar.f338948c);
        }

        public final int hashCode() {
            int i12 = this.f338947b * 31;
            Bitmap.Config config = this.f338948c;
            return i12 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return o.c(this.f338947b, this.f338948c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    @k0
    public static class c extends d<b> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        public final m a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f338937d = configArr;
        f338938e = configArr;
        f338939f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f338940g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f338941h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i12, Bitmap.Config config) {
        return "[" + i12 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(com.bumptech.glide.util.m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    @P
    public final Bitmap b(int i12, int i13, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iB2 = com.bumptech.glide.util.m.b(i12, i13, config);
        c cVar = this.f338942a;
        b bVarB = cVar.b();
        bVarB.f338947b = iB2;
        bVarB.f338948c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f338938e;
        } else {
            int i14 = a.f338945a[config.ordinal()];
            configArr = i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? new Bitmap.Config[]{config} : f338941h : f338940g : f338939f : f338937d;
        }
        int length = configArr.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i15];
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iB2));
            if (numCeilingKey == null || numCeilingKey.intValue() > iB2 * 8) {
                i15++;
            } else if (numCeilingKey.intValue() != iB2 || (config2 != null ? !config2.equals(config) : config != null)) {
                cVar.c(bVarB);
                int iIntValue = numCeilingKey.intValue();
                bVarB = cVar.b();
                bVarB.f338947b = iIntValue;
                bVarB.f338948c = config2;
            }
        }
        Bitmap bitmapA = this.f338943b.a(bVarB);
        if (bitmapA != null) {
            a(Integer.valueOf(bVarB.f338947b), bitmapA);
            bitmapA.reconfigure(i12, i13, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap map = this.f338944c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final String e(int i12, int i13, Bitmap.Config config) {
        return c(com.bumptech.glide.util.m.b(i12, i13, config), config);
    }

    public final String f(Bitmap bitmap) {
        return c(com.bumptech.glide.util.m.c(bitmap), bitmap.getConfig());
    }

    public final void g(Bitmap bitmap) {
        int iC2 = com.bumptech.glide.util.m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVarB = this.f338942a.b();
        bVarB.f338947b = iC2;
        bVarB.f338948c = config;
        this.f338943b.b(bVarB, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = navigableMapD.get(Integer.valueOf(bVarB.f338947b));
        navigableMapD.put(Integer.valueOf(bVarB.f338947b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbR = H.r("SizeConfigStrategy{groupedMap=");
        sbR.append(this.f338943b);
        sbR.append(", sortedSizes=(");
        HashMap map = this.f338944c;
        for (Map.Entry entry : map.entrySet()) {
            sbR.append(entry.getKey());
            sbR.append('[');
            sbR.append(entry.getValue());
            sbR.append("], ");
        }
        if (!map.isEmpty()) {
            sbR.replace(sbR.length() - 2, sbR.length(), "");
        }
        sbR.append(")}");
        return sbR.toString();
    }
}
