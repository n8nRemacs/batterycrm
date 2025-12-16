package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.kz0;

/* loaded from: classes8.dex */
public final class x20 extends qy0<Bitmap> {

    /* renamed from: v, reason: collision with root package name */
    private static final Object f391525v = new Object();

    /* renamed from: p, reason: collision with root package name */
    private final Object f391526p;

    /* renamed from: q, reason: collision with root package name */
    @j.B
    @j.P
    private kz0.b<Bitmap> f391527q;

    /* renamed from: r, reason: collision with root package name */
    private final Bitmap.Config f391528r;

    /* renamed from: s, reason: collision with root package name */
    private final int f391529s;

    /* renamed from: t, reason: collision with root package name */
    private final int f391530t;

    /* renamed from: u, reason: collision with root package name */
    private final ImageView.ScaleType f391531u;

    public x20(String str, kz0.b<Bitmap> bVar, int i12, int i13, ImageView.ScaleType scaleType, Bitmap.Config config, @j.P kz0.a aVar) {
        super(0, str, aVar);
        this.f391526p = new Object();
        a(new hp(2.0f, 1000, 2));
        this.f391527q = bVar;
        this.f391528r = config;
        this.f391529s = i12;
        this.f391530t = i13;
        this.f391531u = scaleType;
    }

    private kz0<Bitmap> b(zo0 zo0Var) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = zo0Var.f392316b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f391529s == 0 && this.f391530t == 0) {
            options.inPreferredConfig = this.f391528r;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i12 = options.outWidth;
            int i13 = options.outHeight;
            int iA2 = a(this.f391529s, this.f391530t, i12, i13, this.f391531u);
            int iA3 = a(this.f391530t, this.f391529s, i13, i12, this.f391531u);
            options.inJustDecodeBounds = false;
            float f12 = 1.0f;
            while (true) {
                float f13 = 2.0f * f12;
                if (f13 > Math.min(i12 / iA2, i13 / iA3)) {
                    break;
                }
                f12 = f13;
            }
            options.inSampleSize = (int) f12;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA2 || bitmapDecodeByteArray.getHeight() > iA3)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA2, iA3, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? kz0.a(new sr0(zo0Var)) : kz0.a(bitmapDecodeByteArray, j10.a(zo0Var));
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final void a(Bitmap bitmap) {
        kz0.b<Bitmap> bVar;
        Bitmap bitmap2 = bitmap;
        synchronized (this.f391526p) {
            bVar = this.f391527q;
        }
        if (bVar != null) {
            bVar.a(bitmap2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final int h() {
        return 1;
    }

    private static int a(int i12, int i13, int i14, int i15, ImageView.ScaleType scaleType) {
        if (i12 == 0 && i13 == 0) {
            return i14;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i12 == 0 ? i14 : i12;
        }
        if (i12 == 0) {
            return (int) (i14 * (i13 / i15));
        }
        if (i13 == 0) {
            return i12;
        }
        double d12 = i15 / i14;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d13 = i13;
            return ((double) i12) * d12 < d13 ? (int) (d13 / d12) : i12;
        }
        double d14 = i13;
        return ((double) i12) * d12 > d14 ? (int) (d14 / d12) : i12;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final kz0<Bitmap> a(zo0 zo0Var) {
        kz0<Bitmap> kz0VarB;
        synchronized (f391525v) {
            try {
                try {
                    kz0VarB = b(zo0Var);
                } catch (OutOfMemoryError e12) {
                    int length = zo0Var.f392316b.length;
                    boolean z12 = pk1.f388875a;
                    return kz0.a(new sr0(e12));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kz0VarB;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final void a() {
        super.a();
        synchronized (this.f391526p) {
            this.f391527q = null;
        }
    }
}
