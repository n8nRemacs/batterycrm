package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import j.P;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes5.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bumptech.glide.load.engine.bitmap_recycle.e f339388a = new a();

    @P
    public static C36363g a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i12, int i13) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z12 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i12 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i13 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i12 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i13 = current.getIntrinsicHeight();
                    }
                    Lock lock = G.f339349d;
                    lock.lock();
                    Bitmap bitmapE = eVar.e(i12, i13, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapE);
                        current.setBounds(0, 0, i12, i13);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapE;
                        z12 = true;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z12 = true;
        }
        if (!z12) {
            eVar = f339388a;
        }
        return C36363g.d(bitmap, eVar);
    }

    /* compiled from: DrawableToBitmapConverter.java */
    public class a extends com.bumptech.glide.load.engine.bitmap_recycle.f {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f, com.bumptech.glide.load.engine.bitmap_recycle.e
        public final void b(Bitmap bitmap) {
        }
    }
}
