package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Looper;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: Util.java */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f339649a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f339650b = new char[64];

    /* compiled from: Util.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f339651a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f339651a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339651a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339651a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339651a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339651a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean a(@P Object obj, @P Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i12, int i13, @P Bitmap.Config config) {
        int i14 = i12 * i13;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i15 = a.f339651a[config.ordinal()];
        int i16 = 1;
        if (i15 != 1) {
            i16 = 2;
            if (i15 != 2 && i15 != 3) {
                i16 = 4;
                if (i15 == 4) {
                    i16 = 8;
                }
            }
        }
        return i14 * i16;
    }

    @TargetApi(19)
    public static int c(@N Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    @N
    public static ArrayList d(@N Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int e(float f12, int i12) {
        return f(Float.floatToIntBits(f12), i12);
    }

    public static int f(int i12, int i13) {
        return (i13 * 31) + i12;
    }

    public static int g(int i12, @P Object obj) {
        return f(obj == null ? 0 : obj.hashCode(), i12);
    }

    public static boolean h() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }

    public static boolean i(int i12, int i13) {
        return (i12 > 0 || i12 == Integer.MIN_VALUE) && (i13 > 0 || i13 == Integer.MIN_VALUE);
    }
}
