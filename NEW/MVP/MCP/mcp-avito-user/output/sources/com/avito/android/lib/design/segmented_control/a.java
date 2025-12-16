package com.avito.android.lib.design.segmented_control;

import Y61.k;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnimatedTextView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/a;", "Lcom/avito/android/lib/design/text_view/a;", "", "q", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/content/res/ColorStateList;", "r", "Landroid/content/res/ColorStateList;", "getTextColorStateList", "()Landroid/content/res/ColorStateList;", "setTextColorStateList", "(Landroid/content/res/ColorStateList;)V", "textColorStateList", "", "s", "Z", "isAnimated", "()Z", "setAnimated", "(Z)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.android.lib.design.text_view.a {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @k
    public ColorStateList textColorStateList;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isAnimated;

    public a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, 0, 8, null);
        this.textColorStateList = ColorStateList.valueOf(getCurrentTextColor());
        this.isAnimated = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int colorForState = this.textColorStateList.getColorForState(getDrawableState(), this.textColorStateList.getDefaultColor());
        if (!this.isAnimated) {
            setTextColor(colorForState);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "textColor", getCurrentTextColor(), colorForState);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.setDuration(this.animationDuration);
        objectAnimatorOfInt.start();
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    @k
    public final ColorStateList getTextColorStateList() {
        return this.textColorStateList;
    }

    public final void setAnimated(boolean z12) {
        this.isAnimated = z12;
    }

    public final void setAnimationDuration(long j12) {
        this.animationDuration = j12;
    }

    public final void setTextColorStateList(@k ColorStateList colorStateList) {
        this.textColorStateList = colorStateList;
    }
}
