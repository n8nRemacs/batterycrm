package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C27285e;
import j.N;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: Utils.java */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f60123a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f60124b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<Path> f60125c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<Path> f60126d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<float[]> f60127e = new d();

    /* renamed from: f, reason: collision with root package name */
    public static final float f60128f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: Utils.java */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f12, float f13, float f14) {
        if (C27285e.f59567a) {
            C27285e.a("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f60124b.get();
        Path path2 = f60125c.get();
        Path path3 = f60126d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f12 == 1.0f && f13 == 0.0f) {
            if (C27285e.f59567a) {
                C27285e.b("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length < 1.0f || Math.abs((f13 - f12) - 1.0f) < 0.01d) {
            if (C27285e.f59567a) {
                C27285e.b("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        float f15 = f12 * length;
        float f16 = f13 * length;
        float f17 = f14 * length;
        float fMin = Math.min(f15, f16) + f17;
        float fMax = Math.max(f15, f16) + f17;
        if (fMin >= length && fMax >= length) {
            fMin = j.d(fMin, length);
            fMax = j.d(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = j.d(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = j.d(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            if (C27285e.f59567a) {
                C27285e.b("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        if (C27285e.f59567a) {
            C27285e.b("applyTrimPathIfNeeded");
        }
    }

    public static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(@N Bitmap bitmap, int i12, int i13) {
        if (bitmap.getWidth() == i12 && bitmap.getHeight() == i13) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i12, i13, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(Canvas canvas, Paint paint, RectF rectF) {
        if (C27285e.f59567a) {
            C27285e.a("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (C27285e.f59567a) {
            C27285e.b("Utils#saveLayer");
        }
    }
}
