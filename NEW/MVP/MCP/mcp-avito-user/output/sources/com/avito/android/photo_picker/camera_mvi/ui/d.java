package com.avito.android.photo_picker.camera_mvi.ui;

import Y61.k;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FocusView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/ui/d;", "Landroid/view/View;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends View {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f219279o = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AnimatorSet f219280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArgbEvaluator f219281c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FloatEvaluator f219282d;

    /* renamed from: e, reason: collision with root package name */
    public final int f219283e;

    /* renamed from: f, reason: collision with root package name */
    public final float f219284f;

    /* renamed from: g, reason: collision with root package name */
    public final float f219285g;

    /* renamed from: h, reason: collision with root package name */
    public final int f219286h;

    /* renamed from: i, reason: collision with root package name */
    public final int f219287i;

    /* renamed from: j, reason: collision with root package name */
    public final float f219288j;

    /* renamed from: k, reason: collision with root package name */
    public float f219289k;

    /* renamed from: l, reason: collision with root package name */
    public float f219290l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public Path f219291m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Paint f219292n;

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new c(this, 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setStartDelay(1000L);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, 1));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setStartDelay(1000L);
        valueAnimatorOfFloat3.setDuration(500L);
        valueAnimatorOfFloat3.addUpdateListener(new c(this, 0));
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        this.f219280b = animatorSet;
        this.f219281c = new ArgbEvaluator();
        this.f219282d = new FloatEvaluator();
        int color = androidx.core.content.d.getColor(context, R.color.expected_constant_orange);
        this.f219283e = color;
        float fB2 = y6.b(69);
        this.f219284f = fB2;
        float fB3 = y6.b(24);
        this.f219285g = fB3;
        this.f219286h = C35835l0.d(R.attr.constantWhite, context);
        this.f219287i = y6.b(89);
        this.f219288j = y6.b(19);
        this.f219291m = a(fB2, fB3);
        Paint paint = new Paint(1);
        paint.setColor(color);
        paint.setStrokeWidth(y6.b(1));
        paint.setStyle(Paint.Style.STROKE);
        this.f219292n = paint;
        setAlpha(0.0f);
    }

    public final Path a(float f12, float f13) {
        Path path = new Path();
        float f14 = this.f219289k;
        float f15 = f12 / 2;
        float f16 = f14 - f15;
        float f17 = this.f219290l;
        float f18 = f17 - f15;
        float f19 = f14 + f15;
        float f22 = f17 + f15;
        float f23 = f18 + f13;
        path.moveTo(f16, f23);
        float f24 = f16 + f13;
        path.arcTo(f16, f18, f24, f23, 180.0f, 90.0f, false);
        path.lineTo(f24, f18);
        float f25 = f19 - f13;
        path.moveTo(f25, f18);
        path.arcTo(f25, f18, f19, f23, 270.0f, 90.0f, false);
        path.lineTo(f19, f23);
        float f26 = f22 - f13;
        path.moveTo(f19, f26);
        path.arcTo(f25, f26, f19, f22, 0.0f, 90.0f, false);
        path.lineTo(f25, f22);
        path.moveTo(f24, f22);
        path.arcTo(f16, f26, f24, f22, 90.0f, 90.0f, false);
        path.lineTo(f16, f26);
        return path;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        canvas.drawPath(this.f219291m, this.f219292n);
    }
}
