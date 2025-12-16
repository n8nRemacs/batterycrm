package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: PlatformBitmapFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public abstract class f {

    /* compiled from: PlatformBitmapFactory.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340192a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f340192a = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340192a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340192a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340192a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public abstract com.facebook.common.references.a<Bitmap> a(int i12, int i13, Bitmap.Config config);
}
