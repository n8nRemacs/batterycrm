package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import j.N;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* compiled from: CircleCrop.java */
/* loaded from: classes5.dex */
public class n extends AbstractC36364h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f339374b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(com.bumptech.glide.load.h.f339193a);

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(f339374b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    public final Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13) {
        Paint paint = G.f339346a;
        int iMin = Math.min(i12, i13);
        float f12 = iMin;
        float f13 = f12 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f12 / width, f12 / height);
        float f14 = width * fMax;
        float f15 = fMax * height;
        float f16 = (f12 - f14) / 2.0f;
        float f17 = (f12 - f15) / 2.0f;
        RectF rectF = new RectF(f16, f17, f14 + f16, f15 + f17);
        Bitmap bitmapC = G.c(bitmap, eVar);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapE = eVar.e(iMin, iMin, config);
        bitmapE.setHasAlpha(true);
        Lock lock = G.f339349d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawCircle(f13, f13, f13, G.f339347b);
            canvas.drawBitmap(bitmapC, (Rect) null, rectF, G.f339348c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                eVar.b(bitmapC);
            }
            return bitmapE;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        return obj instanceof n;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return 1101716364;
    }
}
