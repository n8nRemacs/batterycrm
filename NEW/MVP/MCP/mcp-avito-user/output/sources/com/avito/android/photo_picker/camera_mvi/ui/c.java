package com.avito.android.photo_picker.camera_mvi.ui;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f219278b;

    public /* synthetic */ c(View view, int i12) {
        this.f219277a = i12;
        this.f219278b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f219278b;
        switch (this.f219277a) {
            case 0:
                int i12 = d.f219279o;
                ((d) view).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                return;
            case 1:
                int i13 = d.f219279o;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                d dVar = (d) view;
                FloatEvaluator floatEvaluator = dVar.f219282d;
                dVar.f219291m = dVar.a(floatEvaluator.evaluate(animatedFraction, (Number) Float.valueOf(dVar.f219284f), (Number) Integer.valueOf(dVar.f219287i)).floatValue(), floatEvaluator.evaluate(animatedFraction, (Number) Float.valueOf(dVar.f219285g), (Number) Float.valueOf(dVar.f219288j)).floatValue());
                dVar.f219292n.setColor(((Integer) dVar.f219281c.evaluate(animatedFraction, Integer.valueOf(dVar.f219283e), Integer.valueOf(dVar.f219286h))).intValue());
                dVar.invalidate();
                return;
            case 2:
                int i14 = d.f219279o;
                ((d) view).setAlpha(valueAnimator.getAnimatedFraction());
                return;
            default:
                int i15 = SelectedPhotosView.f219261k;
                float animatedFraction2 = valueAnimator.getAnimatedFraction();
                SelectedPhotosView selectedPhotosView = (SelectedPhotosView) view;
                f fVar = selectedPhotosView.f219265e;
                fVar.setScaleX(animatedFraction2);
                fVar.setScaleY(animatedFraction2);
                IntEvaluator intEvaluator = selectedPhotosView.f219269i;
                Integer numEvaluate = intEvaluator.evaluate(animatedFraction2, Integer.valueOf(selectedPhotosView.f219262b), Integer.valueOf(selectedPhotosView.f219263c));
                Integer numEvaluate2 = intEvaluator.evaluate(animatedFraction2, (Integer) 0, Integer.valueOf(selectedPhotosView.f219264d));
                f fVar2 = selectedPhotosView.f219266f;
                ViewGroup.LayoutParams layoutParams = fVar2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = numEvaluate.intValue();
                layoutParams2.height = numEvaluate.intValue();
                layoutParams2.setMarginStart(numEvaluate2.intValue());
                fVar2.setLayoutParams(layoutParams2);
                selectedPhotosView.f219267g.setAlpha(1 - animatedFraction2);
                return;
        }
    }
}
