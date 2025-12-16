package lY0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;

/* compiled from: AnimationUtils.java */
@RestrictTo
/* renamed from: lY0.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43707b {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f413879a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.b f413880b = new androidx.interpolator.view.animation.b();

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.a f413881c = new androidx.interpolator.view.animation.a();

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.c f413882d = new androidx.interpolator.view.animation.c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f413883e = new DecelerateInterpolator();

    public static float a(float f12, float f13, float f14) {
        return r.c(f13, f12, f14, f12);
    }

    public static float b(float f12, float f13, float f14, float f15, float f16) {
        return f16 <= f14 ? f12 : f16 >= f15 ? f13 : a(f12, f13, (f16 - f14) / (f15 - f14));
    }

    public static int c(float f12, int i12, int i13) {
        return Math.round(f12 * (i13 - i12)) + i12;
    }
}
