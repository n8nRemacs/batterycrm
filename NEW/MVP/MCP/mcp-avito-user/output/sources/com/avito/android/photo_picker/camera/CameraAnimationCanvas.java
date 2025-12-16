package com.avito.android.photo_picker.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: CameraAnimationCanvas.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/camera/CameraAnimationCanvas;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraAnimationCanvas extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public float f218914b;

    /* renamed from: c, reason: collision with root package name */
    public float f218915c;

    /* renamed from: d, reason: collision with root package name */
    public float f218916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AccelerateDecelerateInterpolator f218917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Animation f218918f;

    /* renamed from: g, reason: collision with root package name */
    public final float f218919g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Paint f218920h;

    public CameraAnimationCanvas(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f218916d = 1.0f;
        this.f218917e = new AccelerateDecelerateInterpolator();
        this.f218918f = AnimationUtils.loadAnimation(getContext(), R.anim.camera_blink);
        this.f218919g = getResources().getDimension(R.dimen.photo_picker_focus_circle_radius);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimension(R.dimen.photo_picker_focus_circle_stroke_width));
        paint.setColor(C35835l0.d(R.attr.blue600, getContext()));
        this.f218920h = paint;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(@Y61.k Canvas canvas, @Y61.k View view, long j12) {
        boolean zDrawChild = super.drawChild(canvas, view, j12);
        float f12 = this.f218916d;
        if (f12 < 1.0f) {
            float fAbs = 1.0f - Math.abs((this.f218917e.getInterpolation(f12) * 2.0f) - 1.0f);
            Paint paint = this.f218920h;
            paint.setAlpha((int) (255.0f * fAbs));
            float f13 = this.f218914b;
            float f14 = this.f218915c;
            float f15 = this.f218919g;
            canvas.drawCircle(f13, f14, (0.2f * f15 * fAbs) + f15, paint);
            this.f218916d += 0.025f;
            invalidate();
        }
        return zDrawChild;
    }
}
