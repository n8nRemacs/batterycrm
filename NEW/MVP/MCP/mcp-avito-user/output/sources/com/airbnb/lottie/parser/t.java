package com.airbnb.lottie.parser;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.collection.q1;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes10.dex */
class t {

    /* renamed from: b, reason: collision with root package name */
    public static q1<WeakReference<Interpolator>> f60030b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f60029a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f60031c = JsonReader.a.a("t", "s", "e", "o", "i", "h", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final JsonReader.a f60032d = JsonReader.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> weakReferenceF;
        pointF.x = com.airbnb.lottie.utils.j.b(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.j.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.j.b(pointF2.x, -1.0f, 1.0f);
        float fB2 = com.airbnb.lottie.utils.j.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB2;
        float f12 = pointF.x;
        float f13 = pointF.y;
        float f14 = pointF2.x;
        Matrix matrix = com.airbnb.lottie.utils.k.f60123a;
        int i12 = f12 != 0.0f ? (int) (527 * f12) : 17;
        if (f13 != 0.0f) {
            i12 = (int) (i12 * 31 * f13);
        }
        if (f14 != 0.0f) {
            i12 = (int) (i12 * 31 * f14);
        }
        if (fB2 != 0.0f) {
            i12 = (int) (i12 * 31 * fB2);
        }
        if (C27285e.f59569c) {
            weakReferenceF = null;
        } else {
            synchronized (t.class) {
                if (f60030b == null) {
                    f60030b = new q1<>();
                }
                weakReferenceF = f60030b.f(i12);
            }
        }
        Interpolator pathInterpolator = weakReferenceF != null ? weakReferenceF.get() : null;
        if (weakReferenceF == null || pathInterpolator == null) {
            try {
                pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e12) {
                pathInterpolator = "The Path cannot loop back on itself.".equals(e12.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            if (!C27285e.f59569c) {
                try {
                    WeakReference<Interpolator> weakReference = new WeakReference<>(pathInterpolator);
                    synchronized (t.class) {
                        f60030b.i(i12, weakReference);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return pathInterpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.airbnb.lottie.value.a<T> b(com.airbnb.lottie.parser.moshi.JsonReader r24, com.airbnb.lottie.C27291k r25, float r26, com.airbnb.lottie.parser.N<T> r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.t.b(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.k, float, com.airbnb.lottie.parser.N, boolean, boolean):com.airbnb.lottie.value.a");
    }
}
