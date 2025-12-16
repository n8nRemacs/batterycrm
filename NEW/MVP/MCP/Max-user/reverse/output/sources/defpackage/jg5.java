package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class jg5 extends Drawable implements mzg {
    public final EnhancedVectorDrawable a;
    public final ig5 b;

    public jg5(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int i = ivd.e1;
        sf sfVar = new sf(3, this);
        wf wfVarB = new xf(context).b(i);
        EnhancedVectorDrawable enhancedVectorDrawable = wfVarB.a;
        enhancedVectorDrawable.setCallback(sfVar);
        this.a = enhancedVectorDrawable;
        ArrayList arrayList = wfVarB.b;
        ArrayMap arrayMap = wfVarB.c;
        AnimatorSet animatorSet = new AnimatorSet();
        laj.d(enhancedVectorDrawable, animatorSet, arrayList, arrayMap);
        this.b = new ig5(this, animatorSet);
    }

    public final void a(float f) {
        float fB = n7j.b(f, 0.0f, 1.0f);
        ig5 ig5Var = this.b;
        float f2 = ig5Var.e;
        bwf bwfVar = ig5Var.d;
        ig5Var.e = fB;
        long jLongValue = (long) (((Number) ig5Var.c.getValue()).longValue() * fB);
        for (ValueAnimator valueAnimator : (fB > f2 ? 1 : (fB == f2 ? 0 : -1)) < 0 ? ue3.V((List) bwfVar.getValue()) : (List) bwfVar.getValue()) {
            if (valueAnimator.getDuration() > 0) {
                long startDelay = valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration() + startDelay;
                if (jLongValue < startDelay) {
                    if (valueAnimator.getCurrentPlayTime() > 0) {
                        valueAnimator.setCurrentPlayTime(0L);
                    }
                } else if (jLongValue < duration) {
                    valueAnimator.setCurrentPlayTime(jLongValue - startDelay);
                } else if (valueAnimator.getCurrentPlayTime() < valueAnimator.getDuration()) {
                    valueAnimator.setCurrentPlayTime(valueAnimator.getDuration());
                }
            }
        }
        ig5Var.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.b.a.invalidateSelf();
        this.a.draw(canvas);
    }

    @Override // defpackage.mzg
    public final VectorPath findPath(String str) {
        return this.a.findPath(str);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.a.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.mzg
    public final void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        this.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }
}
